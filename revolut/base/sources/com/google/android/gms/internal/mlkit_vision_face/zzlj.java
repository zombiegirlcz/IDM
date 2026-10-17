package com.google.android.gms.internal.mlkit_vision_face;

/* JADX INFO: loaded from: classes.dex */
public final class zzlj {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private zzkl f44301zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private zzkh f44302zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private zzkd f44303zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private Integer f44304zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private Integer f44305zze;

    public final zzlj zzd(Integer num) {
        this.f44304zzd = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final zzlj zze(zzkd zzkdVar) {
        this.f44303zzc = zzkdVar;
        return this;
    }

    public final zzlj zzf(zzkh zzkhVar) {
        this.f44302zzb = zzkhVar;
        return this;
    }

    public final zzlj zzg(zzkl zzklVar) {
        this.f44301zza = zzklVar;
        return this;
    }

    public final zzlj zzh(Integer num) {
        this.f44305zze = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final zzll zzi() {
        return new zzll(this, null);
    }
}
