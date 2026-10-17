package com.google.android.gms.internal.mlkit_vision_barcode;

/* JADX INFO: loaded from: classes16.dex */
public final class zzfs {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private zzfv f41422zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private Integer f41423zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private zzol f41424zzc;

    public final zzfs zza(Integer num) {
        this.f41423zzb = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final zzfs zzb(zzol zzolVar) {
        this.f41424zzc = zzolVar;
        return this;
    }

    public final zzfs zzc(zzfv zzfvVar) {
        this.f41422zza = zzfvVar;
        return this;
    }

    public final zzfx zze() {
        return new zzfx(this, null);
    }
}
