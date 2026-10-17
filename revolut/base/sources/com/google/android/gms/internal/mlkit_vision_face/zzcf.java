package com.google.android.gms.internal.mlkit_vision_face;

import java.util.Iterator;

/* JADX INFO: loaded from: classes16.dex */
final class zzcf extends zzbq {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final transient zzbp f43528zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final transient zzbn f43529zzb;

    public zzcf(zzbp zzbpVar, zzbn zzbnVar) {
        this.f43528zza = zzbpVar;
        this.f43529zzb = zzbnVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbi, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj2) {
        return this.f43528zza.get(obj2) != null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbq, com.google.android.gms.internal.mlkit_vision_face.zzbi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.f43529zzb.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f43528zza.size();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbi
    public final int zza(Object[] objArr, int i) {
        return this.f43529zzb.zza(objArr, 0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbq, com.google.android.gms.internal.mlkit_vision_face.zzbi
    /* JADX INFO: renamed from: zzd */
    public final zzcl iterator() {
        return this.f43529zzb.listIterator(0);
    }
}
