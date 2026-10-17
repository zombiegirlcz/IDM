package com.google.android.gms.internal.mlkit_common;

/* JADX INFO: loaded from: classes16.dex */
public enum zzmm implements zzba {
    UNKNOWN(0),
    TRANSLATE(1);


    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final int f41047zzd;

    zzmm(int i) {
        this.f41047zzd = i;
    }

    public static zzmm zzb(int i) {
        for (zzmm zzmmVar : values()) {
            if (zzmmVar.f41047zzd == i) {
                return zzmmVar;
            }
        }
        return UNKNOWN;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzba
    public final int zza() {
        return this.f41047zzd;
    }
}
