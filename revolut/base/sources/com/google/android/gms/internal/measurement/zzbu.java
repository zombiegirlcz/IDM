package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
final class zzbu extends zzcb {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private String f39875zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private byte f39876zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private int f39877zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private int f39878zzd;

    public final zzcb zza(String str) {
        this.f39875zza = "";
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzcb
    public final zzcb zzb(boolean z) {
        this.f39876zzb = (byte) 1;
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzcb
    public final zzcc zzc() {
        if (this.f39876zzb == 1 && this.f39875zza != null && this.f39877zzc != 0 && this.f39878zzd != 0) {
            return new zzbw(this.f39875zza, false, this.f39877zzc, null, null, this.f39878zzd, null);
        }
        StringBuilder sb6 = new StringBuilder();
        if (this.f39875zza == null) {
            sb6.append(" fileOwner");
        }
        if (this.f39876zzb == 0) {
            sb6.append(" hasDifferentDmaOwner");
        }
        if (this.f39877zzc == 0) {
            sb6.append(" fileChecks");
        }
        if (this.f39878zzd == 0) {
            sb6.append(" filePurpose");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb6.toString()));
    }

    @Override // com.google.android.gms.internal.measurement.zzcb
    public final zzcb zzd(int i) {
        this.f39877zzc = i;
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzcb
    public final zzcb zze(int i) {
        this.f39878zzd = 1;
        return this;
    }
}
