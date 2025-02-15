package basicgame;

import java.util.List;
import java.util.stream.Collectors;

public class ResultView {
    public static void printResultList(List<Vehicle> list, String mark) {
        for (Vehicle t : list) {
            System.out.println(t.getName() + " : " + t.printDistance(mark));
        }
        System.out.println();
    }

    public static void printWinnerList(List<Car> list) {
        String winners = list.stream()
                .map(Car::getName)
                .collect(Collectors.joining(", "));
        System.out.println(winners + "가 최종 우승했습니다.");
    }

    private static boolean isFirstFlag(StringBuilder winnerPrint, boolean firstFlag) {
        if(firstFlag){
            return false;
        }
        winnerPrint.append(", ");
        return false;
    }

    public static void printResultTitle() {
        System.out.println("실행 결과");
    }
}
