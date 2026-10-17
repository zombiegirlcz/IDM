package com.google.android.gms.internal.mlkit_vision_barcode;

/* JADX INFO: loaded from: classes16.dex */
public final class zzop {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private zzoq f42242zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private Integer f42243zzb;

    public final zzop zza(zzoq zzoqVar) {
        this.f42242zza = zzoqVar;
        return this;
    }

    public final zzop zzb(Integer num) {
        this.f42243zzb = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final zzos zzd() {
        return new zzos(this, null);
    }
}
