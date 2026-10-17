package com.google.android.gms.internal.mlkit_vision_face;

/* JADX INFO: loaded from: classes16.dex */
public final class zzdk {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private zzdn f43571zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private Integer f43572zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private zzjv f43573zzc;

    public final zzdk zza(Integer num) {
        this.f43572zzb = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final zzdk zzb(zzjv zzjvVar) {
        this.f43573zzc = zzjvVar;
        return this;
    }

    public final zzdk zzc(zzdn zzdnVar) {
        this.f43571zza = zzdnVar;
        return this;
    }

    public final zzdp zze() {
        return new zzdp(this, null);
    }
}
