package com.google.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j2 f49742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j2 f49743b;

    static {
        j2 j2Var = null;
        try {
            j2Var = (j2) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f49742a = j2Var;
        f49743b = new j2();
    }
}
