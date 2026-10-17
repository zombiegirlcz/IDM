package com.google.android.gms.internal.mlkit_vision_text_common;

/* JADX INFO: loaded from: classes16.dex */
public final class zznu {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private Long f44839zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private Long f44840zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private Long f44841zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private Long f44842zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private Long f44843zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private Long f44844zzf;

    public final zznu zza(Long l2) {
        this.f44841zzc = Long.valueOf(l2.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zznu zzb(Long l2) {
        this.f44842zzd = Long.valueOf(l2.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zznu zzc(Long l2) {
        this.f44839zza = Long.valueOf(l2.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zznu zzd(Long l2) {
        this.f44843zze = Long.valueOf(l2.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zznu zze(Long l2) {
        this.f44840zzb = Long.valueOf(l2.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zznu zzf(Long l2) {
        this.f44844zzf = Long.valueOf(l2.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zznw zzg() {
        return new zznw(this, null);
    }
}
