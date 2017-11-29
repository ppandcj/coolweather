package com.weather.administrator.weather_test.ab;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/11/29.
 */

public class Province extends DataSupport {
    private int id;
    private String provinceName;
    private int provinceCode;
    public  int getId(){
        return  id;
    }
    public void setId(int id){
        this.id=id;
    }

    public String getProvinceNmae(){
        return provinceName;
    }
    public void setProvinceNmae(String provinceNmae){
        this.provinceName=provinceName;
    }
    public int getProvinceCode(){
        return provinceCode;
    }
    public void setProvinceCode(int provinceCode){
        this.provinceCode=provinceCode;
    }
}
