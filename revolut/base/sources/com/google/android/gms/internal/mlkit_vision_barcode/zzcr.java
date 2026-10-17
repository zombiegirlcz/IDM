package com.google.android.gms.internal.mlkit_vision_barcode;

import java.io.Serializable;

/* JADX INFO: loaded from: classes16.dex */
final class zzcr extends zzbv implements Serializable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final Object f41315zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final Object f41316zzb;

    public zzcr(Object obj2, Object obj3) {
        this.f41315zza = obj2;
        this.f41316zzb = obj3;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbv, java.util.Map.Entry
    public final Object getKey() {
        return this.f41315zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbv, java.util.Map.Entry
    public final Object getValue() {
        return this.f41316zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbv, java.util.Map.Entry
    public final Object setValue(Object obj2) {
        throw new UnsupportedOperationException();
    }
}
