package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
final class zzbo extends zzdf {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzbu f41270zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbo(zzbu zzbuVar, Map map) {
        super(map);
        this.f41270zza = zzbuVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdf, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        zzda.zza(iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f41329zzb.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj2) {
        return this == obj2 || this.f41329zzb.keySet().equals(obj2);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f41329zzb.keySet().hashCode();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdf, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzbn(this, this.f41329zzb.entrySet().iterator());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdf, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj2) {
        Collection collection = (Collection) this.f41329zzb.remove(obj2);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        this.f41270zza.f41282zzb -= size;
        return size > 0;
    }
}
