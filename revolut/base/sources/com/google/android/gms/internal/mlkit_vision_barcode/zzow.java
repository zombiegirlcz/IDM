package com.google.android.gms.internal.mlkit_vision_barcode;

/* JADX INFO: loaded from: classes16.dex */
public final class zzow {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private Long f42260zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private zzpj f42261zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private Boolean f42262zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private Boolean f42263zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private Boolean f42264zze;

    public final zzow zza(Boolean bool) {
        this.f42263zzd = bool;
        return this;
    }

    public final zzow zzb(Boolean bool) {
        this.f42264zze = bool;
        return this;
    }

    public final zzow zzc(Long l2) {
        this.f42260zza = Long.valueOf(l2.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzow zzd(zzpj zzpjVar) {
        this.f42261zzb = zzpjVar;
        return this;
    }

    public final zzow zze(Boolean bool) {
        this.f42262zzc = bool;
        return this;
    }

    public final zzoy zzf() {
        return new zzoy(this, null);
    }
}
