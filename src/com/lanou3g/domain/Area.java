package com.lanou3g.domain;

import javax.servlet.ServletContext;
import java.util.List;

/**
 * Created by dllo on 17/10/27.
 */
public class Area {
    private int id;
    private String aname;
    //每个大区有很多个服务器
    private List<Server> servers;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public List<Server> getServers() {
        return servers;
    }

    public void setServers(List<Server> servers) {
        this.servers = servers;
    }
}
