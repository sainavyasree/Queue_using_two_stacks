import java.util.*;
import Queue_using_two_stacks.*;

public class TestClass {
    
    public static void main(String args[])
    {
        Queue_using_two_stacks q=new Queue_using_two_stacks();
    int option,num_of_queries,num,i;
    Scanner ob=new Scanner(System.in);
    //user enters number of queries
    num_of_queries=ob.nextInt();
    for(i=0;i<num_of_queries;i++)
    {
        //user enters his choice
        option=ob.nextInt();
        if(option==1)
        {
           num=ob.nextInt();
            q.enqueue(num);
        }
        else 
        q.dequeue(option);
    }
    ob.close();
    }
}
