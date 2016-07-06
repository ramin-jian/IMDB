package IMDB;

import java.util.*;

public class actor 

{
	
private String actor_name;

private Vector<movie> Moviev = new Vector<>();

private Vector<award> Awardv = new Vector<>();


private String nation;

private String age;

public String getActor_name() {
	
	return actor_name;
}

public void setActor_name(String actor_name) {
	this.actor_name = actor_name;
}

public String getAge() {
	return age;
}

public void setAge(String age) {
	this.age = age;
}
public void addMovie(movie v){
	
}

public String getNation() {
	return nation;
}

public void setNation(String nation) {
	this.nation = nation;
}

}
