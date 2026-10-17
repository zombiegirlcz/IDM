package com.google.android.gms.internal.mlkit_vision_face;

/* JADX INFO: loaded from: classes16.dex */
public final class zzke {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private zzkf f44231zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private Integer f44232zzb;

    public final zzke zza(zzkf zzkfVar) {
        this.f44231zza = zzkfVar;
        return this;
    }

    public final zzke zzb(Integer num) {
        this.f44232zzb = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final zzkh zzd() {
        return new zzkh(this, null);
    }
}
