public class Radix{
  public static void radixsort(int[]data){
    @SuppressWarnings("unchecked")
    //creating the buckets
    MyLinkedList<Integer>[] buckets = new MyLinkedList[20];
    //each bucket will have another linked list inside
    for (int i = 0; i < 20; i++){
      buckets[i] = new MyLinkedList<Integer>();
    }
    //find the largest length integer
    int max = 0;
    for (int i : data){
      if (i > max){
        max = i;
      }
    }
    String s = "" + max;
    max = s.length();

  }
}
