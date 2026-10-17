package com.google.android.gms.internal.mlkit_vision_common;

/* JADX INFO: loaded from: classes16.dex */
public enum zzio implements zzag {
    SOURCE_UNKNOWN(0),
    BITMAP(1),
    BYTEARRAY(2),
    BYTEBUFFER(3),
    FILEPATH(4),
    ANDROID_MEDIA_IMAGE(5);


    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private final int f43317zzh;

    zzio(int i) {
        this.f43317zzh = i;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzag
    public final int zza() {
        return this.f43317zzh;
    }
}
