package com.google.android.gms.nearby.exposurenotification;

import com.google.android.gms.internal.nearby.zzuy;

/* JADX INFO: loaded from: classes16.dex */
public enum zzh {
    LOWEST_CONFIDENCE(0),
    LOW_CONFIDENCE(1),
    MEDIUM_CONFIDENCE(2),
    HIGH_CONFIDENCE(3);


    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private static final zzuy f47998zze = new zzuy() { // from class: com.google.android.gms.nearby.exposurenotification.zzg
    };

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private final int f48000zzg;

    zzh(int i) {
        this.f48000zzg = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f48000zzg);
    }
}
