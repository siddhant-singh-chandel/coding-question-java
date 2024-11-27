public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};  
        
       
        int secondLargest = findSecondLargest(arr);
        
      
        System.out.println("Second largest number is: " + secondLargest);
    }

    public static int findSecondLargest(int[] arr) {
        if (arr == null || arr.length < 2) {
            System.out.println("Array must have at least two elements.");
            return Integer.MIN_VALUE;  
        }
        
        int first = Integer.MIN_VALUE;  
        int second = Integer.MIN_VALUE; 
        
        for (int num : arr) {
            if (num > first) {
                second = first; 
                first = num;    
            } else if (num > second && num < first) {
                second = num;  
            }
        }
        
        return second;
    }
}


    
