import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
      int [] intArr = new int[3];
      int [] intArr2 = {1, 2, 3};
      int intArr3[];
      int []intArr4; //worst way to do it but terrible

      int[][] intArr2D = {{1}, {2, 3}, {4, 5, 6}};
      //intArr2d = new int[3][5];
      int intArr2D2[][];
      int []intArr2D3[];

      for (int i = 0; i < intArr2.length; i++) {
        //System.out.println(intArr2[i]);
      }

      for (int i : intArr2) {
        //System.out.println(i);
      }

      for (int i = 0; i < intArr2D.length; i++) {
        for (int j = 0; j < intArr2D[i].length; j++) {
          //System.out.println(intArr2D[i][j]);
        }
      }

      System.out.println(Arrays.toString(intArr2));

      int[] messyArray = {352, 3, 63, 7345};
      Arrays.sort(messyArray);
      System.out.println(Arrays.toString(messyArray));
      System.out.println(Arrays.binarySearch(messyArray, 63));

      

    }
}
