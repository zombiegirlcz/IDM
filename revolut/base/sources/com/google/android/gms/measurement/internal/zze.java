package com.google.android.gms.measurement.internal;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes16.dex */
final class zze {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final zzju f46960zza;

    public zze(zzju zzjuVar) {
        this.f46960zza = zzjuVar;
    }

    public static zze zza(String str) {
        return new zze((TextUtils.isEmpty(str) || str.length() > 1) ? zzju.UNINITIALIZED : zzjx.zzg(str.charAt(0)));
    }

    public final zzju zzb() {
        return this.f46960zza;
    }

    public final String zzc() {
        return String.valueOf(zzjx.zza(this.f46960zza));
    }
}
