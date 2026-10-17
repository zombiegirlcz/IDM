package com.google.android.gms.internal.mlkit_vision_common;

/* JADX INFO: loaded from: classes16.dex */
public final class zzin {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private Long f43303zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private zzio f43304zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private zzii f43305zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private Integer f43306zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private Integer f43307zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private Integer f43308zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private Integer f43309zzg;

    public final zzin zzb(Long l2) {
        this.f43303zza = Long.valueOf(l2.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzin zzc(Integer num) {
        this.f43306zzd = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final zzin zzd(zzii zziiVar) {
        this.f43305zzc = zziiVar;
        return this;
    }

    public final zzin zze(Integer num) {
        this.f43308zzf = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final zzin zzf(zzio zzioVar) {
        this.f43304zzb = zzioVar;
        return this;
    }

    public final zzin zzg(Integer num) {
        this.f43307zze = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final zzin zzh(Integer num) {
        this.f43309zzg = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final zziq zzj() {
        return new zziq(this, null);
    }
}
