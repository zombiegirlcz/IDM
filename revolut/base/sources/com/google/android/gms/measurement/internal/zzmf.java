package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes16.dex */
public enum zzmf {
    GOOGLE_ANALYTICS(0),
    GOOGLE_SIGNAL(1),
    SGTM(2),
    SGTM_CLIENT(3),
    GOOGLE_SIGNAL_PENDING(4),
    UNKNOWN(99);


    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private final int f47434zzh;

    zzmf(int i) {
        this.f47434zzh = i;
    }

    public static zzmf zzb(int i) {
        for (zzmf zzmfVar : values()) {
            if (zzmfVar.f47434zzh == i) {
                return zzmfVar;
            }
        }
        return UNKNOWN;
    }

    public final int zza() {
        return this.f47434zzh;
    }
}
