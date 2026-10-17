package com.google.android.gms.internal.mlkit_vision_text_common;

/* JADX INFO: loaded from: classes16.dex */
public final class zzoh {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private Long f44869zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private zzou f44870zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private Boolean f44871zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private Boolean f44872zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private Boolean f44873zze;

    public final zzoh zza(Boolean bool) {
        this.f44872zzd = bool;
        return this;
    }

    public final zzoh zzb(Boolean bool) {
        this.f44873zze = bool;
        return this;
    }

    public final zzoh zzc(Long l2) {
        this.f44869zza = Long.valueOf(l2.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzoh zzd(zzou zzouVar) {
        this.f44870zzb = zzouVar;
        return this;
    }

    public final zzoh zze(Boolean bool) {
        this.f44871zzc = bool;
        return this;
    }

    public final zzoj zzf() {
        return new zzoj(this, null);
    }
}
