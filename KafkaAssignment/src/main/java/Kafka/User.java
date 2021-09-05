package Kafka;

public class User {

    int id, age;
    String name, course;
    public User(int id, String name, int age, String course) {

        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;

    }

    public String toString() {

        return ("\"Id\":"+"\""+Integer.toString(id)+"\","+"\"Name\":"+"\""+name+"\","+"\"Age\":"+"\""+Integer.toString(age)+"\","+"\"Course\":"+"\""+course+"\"");
    }

}
