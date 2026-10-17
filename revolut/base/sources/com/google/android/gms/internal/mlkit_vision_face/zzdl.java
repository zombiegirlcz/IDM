package com.google.android.gms.internal.mlkit_vision_face;

/* JADX INFO: loaded from: classes16.dex */
public final class zzdl {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private zzks f43574zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private Boolean f43575zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private zzkd f43576zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private Integer f43577zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private Integer f43578zze;

    public final zzdl zza(Integer num) {
        this.f43577zzd = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final zzdl zzb(zzkd zzkdVar) {
        this.f43576zzc = zzkdVar;
        return this;
    }

    public final zzdl zzc(zzks zzksVar) {
        this.f43574zza = zzksVar;
        return this;
    }

    public final zzdl zzd(Boolean bool) {
        this.f43575zzb = bool;
        return this;
    }

    public final zzdl zze(Integer num) {
        this.f43578zze = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final zzdn zzf() {
        return new zzdn(this, null);
    }
}
