package com.google.android.gms.internal.auth;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes16.dex */
abstract class zzhi {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final Unsafe f39128zza;

    public zzhi(Unsafe unsafe) {
        this.f39128zza = unsafe;
    }

    public abstract double zza(Object obj2, long j2);

    public abstract float zzb(Object obj2, long j2);

    public abstract void zzc(Object obj2, long j2, boolean z);

    public abstract void zzd(Object obj2, long j2, double d);

    public abstract void zze(Object obj2, long j2, float f);

    public abstract boolean zzf(Object obj2, long j2);
}
