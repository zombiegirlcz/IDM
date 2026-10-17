package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes16.dex */
public enum zzjv {
    STORAGE(zzjw.AD_STORAGE, zzjw.ANALYTICS_STORAGE),
    DMA(zzjw.AD_USER_DATA);


    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final zzjw[] f47261zzd;

    zzjv(zzjw... zzjwVarArr) {
        this.f47261zzd = zzjwVarArr;
    }

    public final zzjw[] zzb() {
        return this.f47261zzd;
    }
}
