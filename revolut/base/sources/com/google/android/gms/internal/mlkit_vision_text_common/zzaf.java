package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
final class zzaf extends zzby {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzal f44437zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaf(zzal zzalVar, Map map) {
        super(map);
        this.f44437zza = zzalVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzby, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        zzbo.zza(iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f44497zzb.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj2) {
        return this == obj2 || this.f44497zzb.keySet().equals(obj2);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f44497zzb.keySet().hashCode();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzby, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzae(this, this.f44497zzb.entrySet().iterator());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzby, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj2) {
        Collection collection = (Collection) this.f44497zzb.remove(obj2);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        this.f44437zza.f44449zzb -= size;
        return size > 0;
    }
}
