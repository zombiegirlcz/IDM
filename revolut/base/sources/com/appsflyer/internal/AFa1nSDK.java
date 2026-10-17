package com.appsflyer.internal;

import java.util.HashMap;

/* JADX INFO: loaded from: classes16.dex */
public class AFa1nSDK extends HashMap<Integer, String> {
    private static AFa1nSDK AFInAppEventParameterName;
    private final Object values = new Object();

    private AFa1nSDK() {
    }

    public static synchronized AFa1nSDK afErrorLog() {
        try {
            if (AFInAppEventParameterName == null) {
                AFInAppEventParameterName = new AFa1nSDK();
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return AFInAppEventParameterName;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public String put(Integer num, String str) {
        String str2;
        synchronized (this.values) {
            str2 = (String) super.put(num, str);
        }
        return str2;
    }

    @Override // java.util.HashMap, java.util.Map
    public boolean remove(Object obj2, Object obj3) {
        boolean zRemove;
        synchronized (this.values) {
            zRemove = super.remove(obj2, obj3);
        }
        return zRemove;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public String remove(Object obj2) {
        String str;
        synchronized (this.values) {
            str = (String) super.remove(obj2);
        }
        return str;
    }
}
