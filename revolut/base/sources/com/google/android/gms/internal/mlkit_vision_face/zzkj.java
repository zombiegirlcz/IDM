package com.google.android.gms.internal.mlkit_vision_face;

/* JADX INFO: loaded from: classes16.dex */
public final class zzkj {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private Long f44249zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private zzks f44250zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private Boolean f44251zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private Boolean f44252zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private Boolean f44253zze;

    public final zzkj zza(Boolean bool) {
        this.f44252zzd = bool;
        return this;
    }

    public final zzkj zzb(Boolean bool) {
        this.f44253zze = bool;
        return this;
    }

    public final zzkj zzc(Long l2) {
        this.f44249zza = Long.valueOf(l2.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzkj zzd(zzks zzksVar) {
        this.f44250zzb = zzksVar;
        return this;
    }

    public final zzkj zze(Boolean bool) {
        this.f44251zzc = bool;
        return this;
    }

    public final zzkl zzf() {
        return new zzkl(this, null);
    }
}
