public class Main {

    public static int countEvens(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int findDifference(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int min = arr[0];
        int max = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    public static boolean hasTwoZeroNeighbors(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0 && arr[i + 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 1, 2, 3, 4};
        int[] arr2 = {2, 2, 0};
        int[] arr3 = {1, 3, 5};

        int evensCount1 = countEvens(arr1);
        int evensCount2 = countEvens(arr2);
        int evensCount3 = countEvens(arr3);

        int diff1 = findDifference(arr1);
        int diff2 = findDifference(arr2);
        int diff3 = findDifference(arr3);

        boolean hasZeroNeighbors1 = hasTwoZeroNeighbors(arr1);
        boolean hasZeroNeighbors2 = hasTwoZeroNeighbors(arr2);
        boolean hasZeroNeighbors3 = hasTwoZeroNeighbors(arr3);

        System.out.println("Number of evens in arr1: " + evensCount1);
        System.out.println("Number of evens in arr2: " + evensCount2);
        System.out.println("Number of evens in arr3: " + evensCount3);

        System.out.println("Difference in arr1: " + diff1);
        System.out.println("Difference in arr2: " + diff2);
        System.out.println("Difference in arr3: " + diff3);

        System.out.println("Has zero neighbors in arr1: " + hasZeroNeighbors1);
        System.out.println("Has zero neighbors in arr2: " + hasZeroNeighbors2);
        System.out.println("Has zero neighbors in arr3: " + hasZeroNeighbors3);
    }
}