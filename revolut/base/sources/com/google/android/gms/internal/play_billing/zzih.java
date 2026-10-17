package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes16.dex */
abstract class zzih {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final Unsafe f46124zza;

    public zzih(Unsafe unsafe) {
        this.f46124zza = unsafe;
    }

    public abstract double zza(Object obj2, long j2);

    public abstract float zzb(Object obj2, long j2);

    public abstract void zzc(Object obj2, long j2, boolean z);

    public abstract void zzd(Object obj2, long j2, byte b4);

    public abstract void zze(Object obj2, long j2, double d);

    public abstract void zzf(Object obj2, long j2, float f);

    public abstract boolean zzg(Object obj2, long j2);
}
