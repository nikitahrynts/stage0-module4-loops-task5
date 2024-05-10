package school.mjc.stage0.loops.task5;

public class Hourglass {

    public static void main(String[] args) {
        printHourglassOfGivenSize(6);
    }

    public static void printHourglassOfGivenSize(int height) {
        int space = 0;
        int size = height / 2;
        if (height % 2 == 0) size = height / 2 - 1;
        for (int i = 0; i <= size; i++) {
            for (int j = 0; j < height; j++) {
                if (j >= space && j <= height - space - 1) System.out.print(8);
                else System.out.print(" ");
            }
            System.out.println();
            space++;
        }
        space--;
        if (height % 2 == 0) size = height / 2;
        else {
            size = height / 2 + 1;
            space--;
        }
        for (int i = size; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if (j >= space && j <= height - space - 1) System.out.print(8);
                else System.out.print(" ");
            }
            System.out.println();
            space--;
        }
    }
}