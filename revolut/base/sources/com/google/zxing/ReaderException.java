package com.google.zxing;

/* JADX INFO: loaded from: classes17.dex */
public abstract class ReaderException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f49842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final StackTraceElement[] f49843b;

    static {
        f49842a = System.getProperty("surefire.test.class.path") != null;
        f49843b = new StackTraceElement[0];
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }
}
