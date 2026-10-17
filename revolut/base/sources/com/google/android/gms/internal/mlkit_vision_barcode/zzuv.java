package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes16.dex */
public abstract class zzuv {
    public static zzuv zzg(float f, float f4, float f5, float f6, float f32) {
        return new zzuo(f, f4, f5, f6, BitmapDescriptorFactory.HUE_RED);
    }

    public abstract float zza();

    public abstract float zzb();

    public abstract float zzc();

    public abstract float zzd();

    public abstract float zze();

    public final float zzf() {
        if (!zzh()) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        return (zzd() - zze()) * (zzb() - zzc());
    }

    public final boolean zzh() {
        return zzc() >= BitmapDescriptorFactory.HUE_RED && zzc() < zzb() && zzb() <= 1.0f && zze() >= BitmapDescriptorFactory.HUE_RED && zze() < zzd() && zzd() <= 1.0f;
    }
}
