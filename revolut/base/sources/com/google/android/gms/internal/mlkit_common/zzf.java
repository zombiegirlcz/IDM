package com.google.android.gms.internal.mlkit_common;

/* JADX INFO: loaded from: classes16.dex */
public final class zzf {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final zzac f40828zza = new zzac();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private Boolean f40829zzb;

    private zzf() {
    }

    public final zzf zza(zzk zzkVar) {
        zzt.zzc(this.f40829zzb, "Must call internal() or external() before appending rules.");
        this.f40828zza.zzb(zzkVar);
        return this;
    }

    public final zzf zzb() {
        zzt.zze(this.f40829zzb == null, "A SourcePolicy can only set internal() or external() once.");
        this.f40829zzb = Boolean.FALSE;
        return this;
    }

    public final zzf zzc() {
        zzt.zze(this.f40829zzb == null, "A SourcePolicy can only set internal() or external() once.");
        this.f40829zzb = Boolean.TRUE;
        return this;
    }

    public final zzh zzd() {
        zzt.zzc(this.f40829zzb, "Must call internal() or external() when building a SourcePolicy.");
        return new zzh(this.f40829zzb.booleanValue(), false, this.f40828zza.zzc(), null);
    }

    public /* synthetic */ zzf(zze zzeVar) {
    }
}
