package Comaparable_Pkg;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>
{
	int age;
	String name;
	int rollno;
	
	Student(int age,String name,int rollno)
	{
		this.age=age;
		this.name=name;
		this.rollno=rollno;
	}
	
	public int compareTo(Student s)
	{
		if(age==s.age)
			return 0;
		else if(age>s.age)
			return 1;
		else
			return -1;
	}
}
public class Comparable_Test_Prgram 
{
	public static void main(String[] args) 
	{
		ArrayList<Student> list= new ArrayList<Student>();
		list.add(new Student(25,"vanita",101));
		list.add(new Student(21,"mayuri",102));
		list.add(new Student(40,"mamata",103));
		
		Collections.sort(list);
		for(Student st:list)
		{
			System.out.println(st.age+ " " +st.name+ " " +st.rollno);
		}
		
	}

}
