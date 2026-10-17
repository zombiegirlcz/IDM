package com.google.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f0 f49706a = new f0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f0 f49707b;

    static {
        f0 f0Var = null;
        try {
            f0Var = (f0) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f49707b = f0Var;
    }
}
