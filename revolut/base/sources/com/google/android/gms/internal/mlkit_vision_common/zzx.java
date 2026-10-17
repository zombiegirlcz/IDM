package com.google.android.gms.internal.mlkit_vision_common;

import java.util.Iterator;

/* JADX INFO: loaded from: classes16.dex */
final class zzx extends zzs {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final transient zzr f43439zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final transient zzp f43440zzb;

    public zzx(zzr zzrVar, zzp zzpVar) {
        this.f43439zza = zzrVar;
        this.f43440zzb = zzpVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj2) {
        return this.f43439zza.get(obj2) != null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzs, com.google.android.gms.internal.mlkit_vision_common.zzl, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.f43440zzb.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f43439zza.size();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl
    public final int zza(Object[] objArr, int i) {
        return this.f43440zzb.zza(objArr, 0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzs, com.google.android.gms.internal.mlkit_vision_common.zzl
    /* JADX INFO: renamed from: zzd */
    public final zzab iterator() {
        return this.f43440zzb.listIterator(0);
    }
}
