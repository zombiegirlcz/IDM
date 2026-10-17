package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes16.dex */
final class zzif extends zzih {
    public zzif(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.play_billing.zzih
    public final double zza(Object obj2, long j2) {
        return Double.longBitsToDouble(this.f46124zza.getLong(obj2, j2));
    }

    @Override // com.google.android.gms.internal.play_billing.zzih
    public final float zzb(Object obj2, long j2) {
        return Float.intBitsToFloat(this.f46124zza.getInt(obj2, j2));
    }

    @Override // com.google.android.gms.internal.play_billing.zzih
    public final void zzc(Object obj2, long j2, boolean z) {
        if (zzii.f46126zzb) {
            zzii.zzD(obj2, j2, z ? (byte) 1 : (byte) 0);
        } else {
            zzii.zzE(obj2, j2, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzih
    public final void zzd(Object obj2, long j2, byte b4) {
        if (zzii.f46126zzb) {
            zzii.zzD(obj2, j2, b4);
        } else {
            zzii.zzE(obj2, j2, b4);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzih
    public final void zze(Object obj2, long j2, double d) {
        this.f46124zza.putLong(obj2, j2, Double.doubleToLongBits(d));
    }

    @Override // com.google.android.gms.internal.play_billing.zzih
    public final void zzf(Object obj2, long j2, float f) {
        this.f46124zza.putInt(obj2, j2, Float.floatToIntBits(f));
    }

    @Override // com.google.android.gms.internal.play_billing.zzih
    public final boolean zzg(Object obj2, long j2) {
        return zzii.f46126zzb ? zzii.zzt(obj2, j2) : zzii.zzu(obj2, j2);
    }
}
