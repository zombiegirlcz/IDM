package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Objects;

/* JADX INFO: loaded from: classes16.dex */
final class zzce extends zzbk {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzbk f44502zza = new zzce(new Object[0], 0);

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final transient Object[] f44503zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final transient int f44504zzc;

    public zzce(Object[] objArr, int i) {
        this.f44503zzb = objArr;
        this.f44504zzc = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzx.zza(i, this.f44504zzc, "index");
        Object obj2 = this.f44503zzb[i];
        Objects.requireNonNull(obj2);
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f44504zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbk, com.google.android.gms.internal.mlkit_vision_text_common.zzbf
    public final int zza(Object[] objArr, int i) {
        System.arraycopy(this.f44503zzb, 0, objArr, 0, this.f44504zzc);
        return this.f44504zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbf
    public final int zzb() {
        return this.f44504zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbf
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbf
    public final Object[] zze() {
        return this.f44503zzb;
    }
}
