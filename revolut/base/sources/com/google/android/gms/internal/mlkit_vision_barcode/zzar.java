package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes16.dex */
public final class zzar {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final zzbf f41245zza;

    static {
        zzbf zzaqVar;
        try {
            SystemClock.elapsedRealtimeNanos();
            zzaqVar = new zzap();
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            zzaqVar = new zzaq();
        }
        f41245zza = zzaqVar;
    }

    public static zzbf zza() {
        return f41245zza;
    }
}
