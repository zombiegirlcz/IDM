package com.google.android.gms.internal.mlkit_common;

import java.util.Iterator;

/* JADX INFO: loaded from: classes16.dex */
final class zzao extends zzaj {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final transient zzai f40732zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final transient zzaf f40733zzb;

    public zzao(zzai zzaiVar, zzaf zzafVar) {
        this.f40732zza = zzaiVar;
        this.f40733zzb = zzafVar;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzab, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj2) {
        return this.f40732zza.get(obj2) != null;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzaj, com.google.android.gms.internal.mlkit_common.zzab, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.f40733zzb.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f40732zza.size();
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzab
    public final int zza(Object[] objArr, int i) {
        return this.f40733zzb.zza(objArr, 0);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzaj, com.google.android.gms.internal.mlkit_common.zzab
    /* JADX INFO: renamed from: zzd */
    public final zzas iterator() {
        return this.f40733zzb.listIterator(0);
    }
}
