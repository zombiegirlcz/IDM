package com.google.android.gms.internal.nearby;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes16.dex */
public class zzh extends Handler {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final Looper f45226zza;

    public zzh() {
        this.f45226zza = Looper.getMainLooper();
    }

    public zzh(Looper looper) {
        super(looper);
        this.f45226zza = Looper.getMainLooper();
    }
}
