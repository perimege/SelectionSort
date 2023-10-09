import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] arr=generateUnsortedArray(45000);
        long startTime=System.nanoTime();
        arr=selectionSort(arr);
        long endTime=System.nanoTime();
        long duration=endTime-startTime;
        System.out.println("selectionSort time:"+duration/1000000);
//        for(int k=0;k<arr.length;k++){
//            System.out.print(arr[k]+"-");
//        }
        int[] arr2=generateUnsortedArray(45000);
        long start=System.nanoTime();
        Arrays.sort(arr2);
        long end=System.nanoTime();
        System.out.println("Arrays.sort time:"+(end-start)/1000000);

    }


    public static int[] selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int index=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[index]>arr[j]){
                    index=j;
                }
            }
            int smallerNum=arr[index];
            arr[index]=arr[i];
            arr[i]=smallerNum;
        }
        return arr;
    }

    public static int[] generateUnsortedArray(int size) {
        int[] arr = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(100000); // Generating random numbers between 0 and 99999
        }
        return arr;
    }
}