import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;

class Student implements Comparable<Student>{
    public String name;
    public int mark;

    public Student(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    @Override
    public int compareTo(Student o) {
        return this.mark-o.mark;
    }
}
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Ivan", 40));
        students.add(new Student("Max",32));
        students.add(new Student("Olga", 68));
        students.add(new Student("Maria", 57));
        students.add(new Student("Petr", 49));

        TreeSet<Student> studentTreeSet = new TreeSet<>(students);
        studentTreeSet.add(new Student("Oleg",97));
        for(Student s: studentTreeSet) {
            System.out.println(s.name + "=>" + s.mark);
        }

        SortedSet<Student> result = studentTreeSet.tailSet(new Student("",50));
        for(Student s: result) {
            System.out.println(s.name + "=>" + s.mark);
        }

        SortedSet<Student> result2 = studentTreeSet.subSet(new Student("",50),new Student("",60));


    }
}