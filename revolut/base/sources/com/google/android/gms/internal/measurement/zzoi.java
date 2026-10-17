package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes16.dex */
final class zzoi extends zzok {
    public zzoi(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.measurement.zzok
    public final double zza(Object obj2, long j2) {
        return Double.longBitsToDouble(this.f40548zza.getLong(obj2, j2));
    }

    @Override // com.google.android.gms.internal.measurement.zzok
    public final float zzb(Object obj2, long j2) {
        return Float.intBitsToFloat(this.f40548zza.getInt(obj2, j2));
    }

    @Override // com.google.android.gms.internal.measurement.zzok
    public final void zzc(Object obj2, long j2, boolean z) {
        if (zzol.f40550zzb) {
            zzol.zzD(obj2, j2, z ? (byte) 1 : (byte) 0);
        } else {
            zzol.zzE(obj2, j2, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzok
    public final void zzd(Object obj2, long j2, byte b4) {
        if (zzol.f40550zzb) {
            zzol.zzD(obj2, j2, b4);
        } else {
            zzol.zzE(obj2, j2, b4);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzok
    public final void zze(Object obj2, long j2, double d) {
        this.f40548zza.putLong(obj2, j2, Double.doubleToLongBits(d));
    }

    @Override // com.google.android.gms.internal.measurement.zzok
    public final void zzf(Object obj2, long j2, float f) {
        this.f40548zza.putInt(obj2, j2, Float.floatToIntBits(f));
    }

    @Override // com.google.android.gms.internal.measurement.zzok
    public final boolean zzg(Object obj2, long j2) {
        return zzol.f40550zzb ? zzol.zzt(obj2, j2) : zzol.zzu(obj2, j2);
    }
}
