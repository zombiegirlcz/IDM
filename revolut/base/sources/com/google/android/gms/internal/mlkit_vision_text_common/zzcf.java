package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes16.dex */
final class zzcf extends zzbk {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzcg f44505zza;

    public zzcf(zzcg zzcgVar) {
        this.f44505zza = zzcgVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        zzx.zza(i, this.f44505zza.f44508zzc, "index");
        int i2 = i + i;
        Object obj2 = this.f44505zza.f44507zzb[i2];
        Objects.requireNonNull(obj2);
        Object obj3 = this.f44505zza.f44507zzb[i2 + 1];
        Objects.requireNonNull(obj3);
        return new AbstractMap.SimpleImmutableEntry(obj2, obj3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f44505zza.f44508zzc;
    }
}
