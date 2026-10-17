package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Objects;

/* JADX INFO: loaded from: classes16.dex */
final class zzci extends zzbk {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final transient Object[] f44511zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final transient int f44512zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final transient int f44513zzc = 1;

    public zzci(Object[] objArr, int i, int i2) {
        this.f44511zza = objArr;
        this.f44512zzb = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzx.zza(i, this.f44513zzc, "index");
        Object obj2 = this.f44511zza[i + i + this.f44512zzb];
        Objects.requireNonNull(obj2);
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f44513zzc;
    }
}
