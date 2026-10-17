package com.google.android.gms.internal.play_billing;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes16.dex */
final class zzce extends zzbw {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzcf f45869zza;

    public zzce(zzcf zzcfVar) {
        Objects.requireNonNull(zzcfVar);
        this.f45869zza = zzcfVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        zzcf zzcfVar = this.f45869zza;
        zzbj.zza(i, zzcfVar.f45872zzc, "index");
        int i2 = i + i;
        Object obj2 = zzcfVar.f45871zzb[i2];
        Objects.requireNonNull(obj2);
        Object obj3 = zzcfVar.f45871zzb[i2 + 1];
        Objects.requireNonNull(obj3);
        return new AbstractMap.SimpleImmutableEntry(obj2, obj3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f45869zza.f45872zzc;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbt
    public final boolean zzf() {
        return true;
    }
}
