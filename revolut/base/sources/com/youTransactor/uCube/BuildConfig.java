package com.youTransactor.uCube;

import defpackage.q1;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes15.dex */
public final class BuildConfig {
    public static final boolean DEBUG = false;
    public static final Hashtable<String, Object> PropertyPairs;
    public static final String VERSION_NAME = "4.0.9.4";
    public static final String BUILD_TYPE = "release";
    public static final String LIBRARY_PACKAGE_NAME = "com.youTransactor.uCube";

    static {
        q1 q1Var = new q1();
        q1Var.put("server_url", "mdm.youtransactor.com");
        PropertyPairs = q1Var;
    }
}
