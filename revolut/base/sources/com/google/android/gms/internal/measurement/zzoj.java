package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes16.dex */
final class zzoj extends zzok {
    public zzoj(Unsafe unsafe) {
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

    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.measurement.zzol.zzi(java.lang.Object, long, boolean):void */
    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.measurement.zzol.zzj(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 'z' boolean)' in method call: com.google.android.gms.internal.measurement.zzol.zzj(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 boolean)' in method call: com.google.android.gms.internal.measurement.zzol.zzi(java.lang.Object, long, boolean):void */
    @Override // com.google.android.gms.internal.measurement.zzok
    public final void zzc(Object obj2, long j2, boolean z) {
        if (zzol.f40550zzb) {
            zzol.zzi(obj2, j2, z);
        } else {
            zzol.zzj(obj2, j2, z);
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
