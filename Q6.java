package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Q6 {

	public static void main(String[] args) {
		/*aaaaaaaa
		 * Write a program to find the common elements between two String Arrays (without case sensitivity)

			Input1 : {John,Brad,Ange,Sofia,Emily}

			Input2 : {sofia,brad,grace,emily,hazel}

			Output : [sofia,brad,emily] 
			
		 */
		
			
            
            
            
		
			List<String> str =new ArrayList<>(Arrays.asList("John","brad","Ange","sofia","emily"));
			List<String> str2 = new ArrayList<>(Arrays.asList("sofia","brad","grace","emily","hazel"));
			List<String> str3 = new ArrayList<>();
			
			System.out.println(str);
			System.out.println(str2);
			
			str.retainAll(str2);
			System.out.println(str);
			
			
			
			
	}

}
