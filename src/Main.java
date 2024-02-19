import java.util.Arrays;
import java.util.Random;

public class  Main {

    public static void main(String[] args) {
        // Створення масиву з 10 елементів та заповнення його випадковими числами від 0 до 9
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }

        System.out.println("Початковий масив: " + Arrays.toString(array));

        // Виклик функції сортування включенням
        insertionSort(array);

        // Виведення відсортованого масиву
        System.out.println("Відсортований масив: " + Arrays.toString(array));
    }

    // Реалізація алгоритму сортування включенням
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}