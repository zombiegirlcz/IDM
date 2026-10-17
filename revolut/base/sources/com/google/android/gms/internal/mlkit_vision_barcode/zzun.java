package com.google.android.gms.internal.mlkit_vision_barcode;

import ehe.n;

/* JADX INFO: loaded from: classes16.dex */
final class zzun extends zzuu {

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final int f42498zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final int f42499zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private final float f42500zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private final float f42501zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private final boolean f42502zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private final float f42503zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    private final float f42504zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    private final long f42505zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    private final long f42506zzk;

    /* JADX INFO: renamed from: zzl, reason: collision with root package name */
    private final boolean f42507zzl;
    private final float zzm;
    private final float zzn;

    public /* synthetic */ zzun(int i, int i2, float f, float f4, boolean z, float f5, float f6, long j2, long j3, boolean z3, float f32, float f35, zzum zzumVar) {
        this.f42498zzc = i;
        this.f42499zzd = i2;
        this.f42500zze = f;
        this.f42501zzf = f4;
        this.f42502zzg = z;
        this.f42503zzh = f5;
        this.f42504zzi = f6;
        this.f42505zzj = j2;
        this.f42506zzk = j3;
        this.f42507zzl = z3;
        this.zzm = f32;
        this.zzn = f35;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof zzuu) {
            zzuu zzuuVar = (zzuu) obj2;
            if (this.f42498zzc == zzuuVar.zzh() && this.f42499zzd == zzuuVar.zzg() && Float.floatToIntBits(this.f42500zze) == Float.floatToIntBits(zzuuVar.zzd()) && Float.floatToIntBits(this.f42501zzf) == Float.floatToIntBits(zzuuVar.zzc()) && this.f42502zzg == zzuuVar.zzl() && Float.floatToIntBits(this.f42503zzh) == Float.floatToIntBits(zzuuVar.zzb()) && Float.floatToIntBits(this.f42504zzi) == Float.floatToIntBits(zzuuVar.zza()) && this.f42505zzj == zzuuVar.zzj() && this.f42506zzk == zzuuVar.zzi() && this.f42507zzl == zzuuVar.zzk() && Float.floatToIntBits(this.zzm) == Float.floatToIntBits(zzuuVar.zze()) && Float.floatToIntBits(this.zzn) == Float.floatToIntBits(zzuuVar.zzf())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iFloatToIntBits = ((((((((((((this.f42498zzc ^ 1000003) * 1000003) ^ this.f42499zzd) * 1000003) ^ Float.floatToIntBits(this.f42500zze)) * 1000003) ^ Float.floatToIntBits(this.f42501zzf)) * 1000003) ^ (true != this.f42502zzg ? 1237 : 1231)) * 1000003) ^ Float.floatToIntBits(this.f42503zzh)) * 1000003) ^ Float.floatToIntBits(this.f42504zzi);
        int i = (int) this.f42505zzj;
        return (((((((((iFloatToIntBits * 1000003) ^ i) * 1000003) ^ ((int) this.f42506zzk)) * 1000003) ^ (true != this.f42507zzl ? 1237 : 1231)) * 1000003) ^ Float.floatToIntBits(this.zzm)) * 1000003) ^ Float.floatToIntBits(this.zzn);
    }

    public final String toString() {
        int i = this.f42498zzc;
        int i2 = this.f42499zzd;
        float f = this.f42500zze;
        float f4 = this.f42501zzf;
        boolean z = this.f42502zzg;
        float f5 = this.f42503zzh;
        float f6 = this.f42504zzi;
        long j2 = this.f42505zzj;
        long j3 = this.f42506zzk;
        boolean z3 = this.f42507zzl;
        float f32 = this.zzm;
        float f35 = this.zzn;
        StringBuilder sbW = com.google.android.gms.internal.mlkit_vision_face.a.w("AutoZoomOptions{recentFramesToCheck=", i, i2, ", recentFramesContainingPredictedArea=", ", recentFramesIou=");
        sbW.append(f);
        sbW.append(", maxCoverage=");
        sbW.append(f4);
        sbW.append(", useConfidenceScore=");
        sbW.append(z);
        sbW.append(", lowerConfidenceScore=");
        sbW.append(f5);
        sbW.append(", higherConfidenceScore=");
        sbW.append(f6);
        sbW.append(", zoomIntervalInMillis=");
        sbW.append(j2);
        sbW.append(", resetIntervalInMillis=");
        sbW.append(j3);
        sbW.append(", enableZoomThreshold=");
        sbW.append(z3);
        sbW.append(", zoomInThreshold=");
        sbW.append(f32);
        sbW.append(", zoomOutThreshold=");
        return n.t(f35, "}", sbW);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzuu
    public final float zza() {
        return this.f42504zzi;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzuu
    public final float zzb() {
        return this.f42503zzh;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzuu
    public final float zzc() {
        return this.f42501zzf;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzuu
    public final float zzd() {
        return this.f42500zze;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzuu
    public final float zze() {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzuu
    public final float zzf() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzuu
    public final int zzg() {
        return this.f42499zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzuu
    public final int zzh() {
        return this.f42498zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzuu
    public final long zzi() {
        return this.f42506zzk;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzuu
    public final long zzj() {
        return this.f42505zzj;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzuu
    public final boolean zzk() {
        return this.f42507zzl;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzuu
    public final boolean zzl() {
        return this.f42502zzg;
    }
}
