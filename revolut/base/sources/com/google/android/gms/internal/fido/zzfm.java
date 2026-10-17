package com.google.android.gms.internal.fido;

import java.io.Closeable;

/* JADX INFO: loaded from: classes16.dex */
public final class zzfm implements Closeable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final ThreadLocal f39456zza = new zzfl();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private int f39457zzb = 0;

    public static int zza() {
        return ((zzfm) f39456zza.get()).f39457zzb;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.f39457zzb;
        if (i <= 0) {
            throw new AssertionError("Mismatched calls to RecursionDepth (possible error in core library)");
        }
        this.f39457zzb = i - 1;
    }
}
