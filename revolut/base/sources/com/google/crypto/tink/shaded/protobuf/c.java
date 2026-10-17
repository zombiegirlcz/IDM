package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes17.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f49347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f49348b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f49347a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f49348b = cls2 != null;
    }

    public static boolean a() {
        return (f49347a == null || f49348b) ? false : true;
    }
}
