package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by shanliwp on 2017/7/10.
 */

public class County extends DataSupport {
    private int id;

    private String cityName;

    private String weatherId;

    private int cityId;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;

    }

    public String getCountyName(){
        return cityName;
    }

    public void setCountyName(String cityName) {
        this.cityName = cityName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId){
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return  cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

}






























