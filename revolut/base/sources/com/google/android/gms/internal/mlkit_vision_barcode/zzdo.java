package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.AbstractMap;

/* JADX INFO: loaded from: classes16.dex */
final class zzdo extends zzcv {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzdp f41337zza;

    public zzdo(zzdp zzdpVar) {
        this.f41337zza = zzdpVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        zzbc.zza(i, this.f41337zza.f41340zzc, "index");
        zzdp zzdpVar = this.f41337zza;
        int i2 = i + i;
        Object obj2 = zzdpVar.f41339zzb[i2];
        obj2.getClass();
        Object obj3 = zzdpVar.f41339zzb[i2 + 1];
        obj3.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj2, obj3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f41337zza.f41340zzc;
    }
}
