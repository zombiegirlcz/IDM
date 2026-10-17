package com.google.android.gms.internal.mlkit_vision_face;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
final class zzaj extends zzbw {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzap f43462zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaj(zzap zzapVar, Map map) {
        super(map);
        this.f43462zza = zzapVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbw, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        zzbr.zza(iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f43515zzb.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj2) {
        return this == obj2 || this.f43515zzb.keySet().equals(obj2);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f43515zzb.keySet().hashCode();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzai(this, this.f43515zzb.entrySet().iterator());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbw, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj2) {
        Collection collection = (Collection) this.f43515zzb.remove(obj2);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        zzap.zzg(this.f43462zza, size);
        return size > 0;
    }
}
