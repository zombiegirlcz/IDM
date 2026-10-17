package com.google.android.gms.internal.mlkit_vision_text_common;

/* JADX INFO: loaded from: classes16.dex */
public final class zzep {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private zzes f44551zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private Integer f44552zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private zznw f44553zzc;

    public final zzep zza(Integer num) {
        this.f44552zzb = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final zzep zzb(zznw zznwVar) {
        this.f44553zzc = zznwVar;
        return this;
    }

    public final zzep zzc(zzes zzesVar) {
        this.f44551zza = zzesVar;
        return this;
    }

    public final zzeu zze() {
        return new zzeu(this, null);
    }
}
