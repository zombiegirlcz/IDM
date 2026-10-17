package com.google.android.gms.nearby.connection;

/* JADX INFO: loaded from: classes16.dex */
public final class zze {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private int f47858zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private int f47859zzb;

    public final zze zza(int i) {
        this.f47859zzb = i;
        return this;
    }

    public final zze zzb(int i) {
        this.f47858zza = i;
        return this;
    }

    public final BandwidthInfo zzc() {
        return new BandwidthInfo(this.f47858zza, this.f47859zzb, null);
    }
}
