package com.google.android.gms.internal.mlkit_vision_face;

import java.io.Serializable;

/* JADX INFO: loaded from: classes16.dex */
final class zzbj extends zzaq implements Serializable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final Object f43504zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final Object f43505zzb;

    public zzbj(Object obj2, Object obj3) {
        this.f43504zza = obj2;
        this.f43505zzb = obj3;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzaq, java.util.Map.Entry
    public final Object getKey() {
        return this.f43504zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzaq, java.util.Map.Entry
    public final Object getValue() {
        return this.f43505zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzaq, java.util.Map.Entry
    public final Object setValue(Object obj2) {
        throw new UnsupportedOperationException();
    }
}
