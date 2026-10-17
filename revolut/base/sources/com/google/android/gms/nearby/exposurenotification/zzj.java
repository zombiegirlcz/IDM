package com.google.android.gms.nearby.exposurenotification;

import com.google.android.gms.internal.nearby.zzuy;

/* JADX INFO: loaded from: classes16.dex */
public enum zzj {
    INFECTIOUSNESS_NONE(0),
    INFECTIOUSNESS_STANDARD(1),
    INFECTIOUSNESS_HIGH(2);


    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final zzuy f48004zzd = new zzuy() { // from class: com.google.android.gms.nearby.exposurenotification.zzi
    };

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private final int f48006zzf;

    zzj(int i) {
        this.f48006zzf = i;
    }

    public static zzj zza(int i) {
        if (i == 0) {
            return INFECTIOUSNESS_NONE;
        }
        if (i == 1) {
            return INFECTIOUSNESS_STANDARD;
        }
        if (i != 2) {
            return null;
        }
        return INFECTIOUSNESS_HIGH;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f48006zzf);
    }
}
