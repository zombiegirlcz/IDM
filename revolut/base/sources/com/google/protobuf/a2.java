package com.google.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z1 f49679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z1 f49680b;

    static {
        z1 z1Var = null;
        try {
            z1Var = (z1) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f49679a = z1Var;
        f49680b = new z1();
    }
}
