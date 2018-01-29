public class main {
    public static void main(String[] args) {
        int size = args.length;
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (Integer.parseInt(args[i]));
        }
        int[] newArray = insertionSort(1, 0, array, size);
        printArray(newArray, size);
    }


    static void printArray(int[] array, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print("\n");
    }

    static int[] insertionSort(int key, int index, int[] array, int arrayLength) {
        if (key > (arrayLength-1)) {
            return array;
        } else if (array[index] <= array[key]) {
            return insertionSort(key+1, index+1, array, arrayLength);
        } else {
            int temp = array[key];
            array[key] = array[index];
            array[index] = temp;

            if (index == 0) return insertionSort(key+1, index+1, array, arrayLength);
            else return insertionSort(key-1, index-1, array, arrayLength);
        }
    }


}




