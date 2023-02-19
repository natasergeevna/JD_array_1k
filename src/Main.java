import java.util.Arrays;
import java.util.Random;

public class Main {
    public static int[] generateRandom() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args) {
        //task 1.1
        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        double[] arr2 = {1.57, 7.654, 9.986};
        char[] arr3 = {'a', 'b', 'c'};

        //task 1.2
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
        System.out.println();

        //task 1.3
        for (int i = arr1.length - 1; i >= 0; i--) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        for (int i = arr2.length - 1; i >= 0; i--) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        for (int i = arr3.length - 1; i >= 0; i--) {
            System.out.print(arr3[i] + " ");
        }
        System.out.println();

        //task 1.4
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 != 0) arr1[i]++;
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        //task 1.2
        int[] arr = generateRandom();
        System.out.println(Arrays.toString(arr)); //вывод массива для самопроверки
        int sum = 0;
        for (int i: arr) {
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        //task 2.2
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            if (min > arr[i + 1]) {
                min = arr[i + 1];
            }
            if (max < arr[i + 1]) {
                max = arr[i + 1];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей");

        //task 3.2
        double averageSum = 0.0;
        averageSum = sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageSum + " рублей");

        //task 4.2
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}