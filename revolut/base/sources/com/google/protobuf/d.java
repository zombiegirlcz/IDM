package com.google.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f49694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f49695b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f49694a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f49695b = cls2 != null;
    }

    public static boolean a() {
        return (f49694a == null || f49695b) ? false : true;
    }
}
