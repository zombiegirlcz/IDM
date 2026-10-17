package com.google.android.gms.internal.mlkit_vision_text_common;

/* JADX INFO: loaded from: classes16.dex */
public final class zzoa {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private zzob f44851zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private Integer f44852zzb;

    public final zzoa zza(zzob zzobVar) {
        this.f44851zza = zzobVar;
        return this;
    }

    public final zzoa zzb(Integer num) {
        this.f44852zzb = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final zzod zzd() {
        return new zzod(this, null);
    }
}
