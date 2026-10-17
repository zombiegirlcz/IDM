package com.google.gson.internal;

/* JADX INFO: loaded from: classes17.dex */
public final class y extends z {
    @Override // com.google.gson.internal.z
    public final Object a(Class cls) {
        throw new UnsupportedOperationException(a0.d.q("Cannot allocate ", cls, ". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly."));
    }
}
