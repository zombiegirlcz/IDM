package com.google.android.gms.internal.cloudmessaging;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public class zzf extends Handler {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final Looper f39222zza;

    public zzf() {
        this.f39222zza = Looper.getMainLooper();
    }

    public zzf(Looper looper) {
        super(looper);
        this.f39222zza = Looper.getMainLooper();
    }

    public zzf(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.f39222zza = Looper.getMainLooper();
    }
}
