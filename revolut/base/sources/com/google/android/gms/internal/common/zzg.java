package com.google.android.gms.internal.common;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes16.dex */
public class zzg extends Handler {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final Looper f39243zza;

    public zzg() {
        this.f39243zza = Looper.getMainLooper();
    }

    public zzg(Looper looper) {
        super(looper);
        this.f39243zza = Looper.getMainLooper();
    }

    public zzg(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.f39243zza = Looper.getMainLooper();
    }
}
