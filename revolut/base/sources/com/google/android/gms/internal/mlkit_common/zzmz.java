package com.google.android.gms.internal.mlkit_common;

/* JADX INFO: loaded from: classes16.dex */
public final class zzmz {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private zznl f41086zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private Long f41087zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private zzmu f41088zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private Long f41089zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private zzna f41090zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private Long f41091zzf;

    public final zzmz zzb(Long l2) {
        this.f41091zzf = l2;
        return this;
    }

    public final zzmz zzc(zzna zznaVar) {
        this.f41090zze = zznaVar;
        return this;
    }

    public final zzmz zzd(zzmu zzmuVar) {
        this.f41088zzc = zzmuVar;
        return this;
    }

    public final zzmz zze(Long l2) {
        this.f41089zzd = Long.valueOf(l2.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzmz zzf(zznl zznlVar) {
        this.f41086zza = zznlVar;
        return this;
    }

    public final zzmz zzg(Long l2) {
        this.f41087zzb = Long.valueOf(l2.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zznc zzi() {
        return new zznc(this, null);
    }
}
