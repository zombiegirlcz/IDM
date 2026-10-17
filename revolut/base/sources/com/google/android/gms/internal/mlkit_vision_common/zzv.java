package com.google.android.gms.internal.mlkit_vision_common;

import java.util.AbstractMap;

/* JADX INFO: loaded from: classes16.dex */
final class zzv extends zzp {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzw f43435zza;

    public zzv(zzw zzwVar) {
        this.f43435zza = zzwVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        zzf.zza(i, this.f43435zza.f43438zzc, "index");
        zzw zzwVar = this.f43435zza;
        int i2 = i + i;
        Object obj2 = zzwVar.f43437zzb[i2];
        obj2.getClass();
        Object obj3 = zzwVar.f43437zzb[i2 + 1];
        obj3.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj2, obj3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f43435zza.f43438zzc;
    }
}
