package proje8;

public class Course {
	    Teacher courseTeacher;
	    String name;
	    String code;
	    String prefix;
	    int note1,note2;

	    public Course(String name, String code, String prefix) {
	        this.name = name;
	        this.code = code;
	        this.prefix = prefix;
	        this.note1 = 0;
	        this.note2 = 0;
	    }

	    public void addTeacher(Teacher t) {
	        if (this.prefix.equals(t.branch)) {
	            this.courseTeacher = t;
	            System.out.println("İşlem başarılı");
	        } else {
	            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
	        }
	    
	    }

	  
	}

