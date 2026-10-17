package com.google.android.gms.internal.wallet;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes16.dex */
public final class zzd extends Handler {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final Looper f46378zza;

    public zzd() {
        this.f46378zza = Looper.getMainLooper();
    }

    public zzd(Looper looper) {
        super(looper);
        this.f46378zza = Looper.getMainLooper();
    }
}
