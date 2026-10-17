package com.google.android.gms.internal.mlkit_vision_common;

/* JADX INFO: loaded from: classes16.dex */
public enum zzii implements zzag {
    UNKNOWN_FORMAT(0),
    NV16(1),
    NV21(2),
    YV12(3),
    YUV_420_888(7),
    JPEG(8),
    BITMAP(4),
    CM_SAMPLE_BUFFER_REF(5),
    UI_IMAGE(6),
    CV_PIXEL_BUFFER_REF(9);


    /* JADX INFO: renamed from: zzl, reason: collision with root package name */
    private final int f43302zzl;

    zzii(int i) {
        this.f43302zzl = i;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzag
    public final int zza() {
        return this.f43302zzl;
    }
}
