package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes17.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f49406a = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r f49407b;

    static {
        r rVar = null;
        try {
            rVar = (r) Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f49407b = rVar;
    }
}
