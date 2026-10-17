package com.google.android.gms.internal.mlkit_vision_barcode;

/* JADX INFO: loaded from: classes16.dex */
public final class zzoj {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private Long f42230zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private Long f42231zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private Long f42232zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private Long f42233zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private Long f42234zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private Long f42235zzf;

    public final zzoj zza(Long l2) {
        this.f42232zzc = Long.valueOf(l2.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzoj zzb(Long l2) {
        this.f42233zzd = Long.valueOf(l2.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzoj zzc(Long l2) {
        this.f42230zza = Long.valueOf(l2.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzoj zzd(Long l2) {
        this.f42234zze = Long.valueOf(l2.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzoj zze(Long l2) {
        this.f42231zzb = Long.valueOf(l2.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzoj zzf(Long l2) {
        this.f42235zzf = Long.valueOf(l2.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzol zzg() {
        return new zzol(this, null);
    }
}
