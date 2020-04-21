package com.opendev.cn.instagram4android.requests.payload;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by root on 08/06/17.
 */

@Getter
@Setter
@ToString(callSuper = true)
public class InstagramProfilePic {

    public String url;
    public int width;
    public int height;

}
