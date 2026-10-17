package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes16.dex */
final class zzuo extends zzuv {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final float f42508zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final float f42509zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final float f42510zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final float f42511zzd;

    public zzuo(float f, float f4, float f5, float f6, float f32) {
        this.f42508zza = f;
        this.f42509zzb = f4;
        this.f42510zzc = f5;
        this.f42511zzd = f6;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof zzuv) {
            zzuv zzuvVar = (zzuv) obj2;
            if (Float.floatToIntBits(this.f42508zza) == Float.floatToIntBits(zzuvVar.zzc()) && Float.floatToIntBits(this.f42509zzb) == Float.floatToIntBits(zzuvVar.zze()) && Float.floatToIntBits(this.f42510zzc) == Float.floatToIntBits(zzuvVar.zzb()) && Float.floatToIntBits(this.f42511zzd) == Float.floatToIntBits(zzuvVar.zzd())) {
                int iFloatToIntBits = Float.floatToIntBits(BitmapDescriptorFactory.HUE_RED);
                zzuvVar.zza();
                if (iFloatToIntBits == Float.floatToIntBits(BitmapDescriptorFactory.HUE_RED)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((Float.floatToIntBits(this.f42508zza) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f42509zzb)) * 1000003) ^ Float.floatToIntBits(this.f42510zzc)) * 1000003) ^ Float.floatToIntBits(this.f42511zzd)) * 1000003) ^ Float.floatToIntBits(BitmapDescriptorFactory.HUE_RED);
    }

    public final String toString() {
        return "PredictedArea{xMin=" + this.f42508zza + ", yMin=" + this.f42509zzb + ", xMax=" + this.f42510zzc + ", yMax=" + this.f42511zzd + ", confidenceScore=0.0}";
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzuv
    public final float zza() {
        return BitmapDescriptorFactory.HUE_RED;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzuv
    public final float zzb() {
        return this.f42510zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzuv
    public final float zzc() {
        return this.f42508zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzuv
    public final float zzd() {
        return this.f42511zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzuv
    public final float zze() {
        return this.f42509zzb;
    }
}
