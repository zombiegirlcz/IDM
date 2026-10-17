package com.google.android.gms.common;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes16.dex */
final class zzx extends zzy {

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private final Callable f38391zze;

    public /* synthetic */ zzx(Callable callable, byte[] bArr) {
        super(false, 1, 5, null, null, -1L, null);
        this.f38391zze = callable;
    }

    @Override // com.google.android.gms.common.zzy
    public final String zza() {
        try {
            return (String) this.f38391zze.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
