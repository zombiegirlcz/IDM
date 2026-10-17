package com.google.android.gms.internal.play_billing;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes16.dex */
public final class zzbd {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final zzbo f45834zza;

    static {
        zzbo zzbcVar;
        try {
            SystemClock.elapsedRealtimeNanos();
            zzbcVar = new zzbb();
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            zzbcVar = new zzbc();
        }
        f45834zza = zzbcVar;
    }

    public static zzbo zza() {
        return f45834zza;
    }
}
