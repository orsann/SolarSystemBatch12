package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        SolarSystem FactorX=new SolarSystem();
        FactorX.Sun="1";
        FactorX.Moon="4";
        FactorX.Planet="2";
        FactorX.Star="10000";


//        adding features to our sun
        FeatureSun Xfact= new FeatureSun();
        Xfact.color="green";
        Xfact.radius="1000000000km";
        Xfact.heat="309324934898kj";

//        adding the features for star in the solar system
        FeatureStars FacX = new FeatureStars();
        FacX.color="green";
        FacX.radius="738y4932749km";
        FacX.size="9178707005";

        //adding features for Planet2
        Planet2 Olso = new Planet2();
        Olso.name="Orsan";
        Olso.size="7754km";
        Olso.color="pink";

    }
}
