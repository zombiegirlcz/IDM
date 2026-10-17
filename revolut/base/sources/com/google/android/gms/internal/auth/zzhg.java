package com.google.android.gms.internal.auth;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes16.dex */
final class zzhg extends zzhi {
    public zzhg(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.auth.zzhi
    public final double zza(Object obj2, long j2) {
        return Double.longBitsToDouble(this.f39128zza.getLong(obj2, j2));
    }

    @Override // com.google.android.gms.internal.auth.zzhi
    public final float zzb(Object obj2, long j2) {
        return Float.intBitsToFloat(this.f39128zza.getInt(obj2, j2));
    }

    @Override // com.google.android.gms.internal.auth.zzhi
    public final void zzc(Object obj2, long j2, boolean z) {
        if (zzhj.f39129zza) {
            zzhj.zzi(obj2, j2, z);
        } else {
            zzhj.zzj(obj2, j2, z);
        }
    }

    @Override // com.google.android.gms.internal.auth.zzhi
    public final void zzd(Object obj2, long j2, double d) {
        this.f39128zza.putLong(obj2, j2, Double.doubleToLongBits(d));
    }

    @Override // com.google.android.gms.internal.auth.zzhi
    public final void zze(Object obj2, long j2, float f) {
        this.f39128zza.putInt(obj2, j2, Float.floatToIntBits(f));
    }

    @Override // com.google.android.gms.internal.auth.zzhi
    public final boolean zzf(Object obj2, long j2) {
        return zzhj.f39129zza ? zzhj.zzq(obj2, j2) : zzhj.zzr(obj2, j2);
    }
}
