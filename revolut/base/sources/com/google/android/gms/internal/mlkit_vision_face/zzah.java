package com.google.android.gms.internal.mlkit_vision_face;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes16.dex */
final class zzah extends zzby {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final transient Map f43457zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzap f43458zzb;

    public zzah(zzap zzapVar, Map map) {
        this.f43458zzb = zzapVar;
        this.f43457zza = map;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Map map = this.f43457zza;
        zzap zzapVar = this.f43458zzb;
        if (map == zzapVar.f43473zza) {
            zzapVar.zzn();
        } else {
            zzbr.zza(new zzag(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj2) {
        return zzbz.zzb(this.f43457zza, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj2) {
        return this == obj2 || this.f43457zza.equals(obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj2) {
        Collection collection = (Collection) zzbz.zza(this.f43457zza, obj2);
        if (collection == null) {
            return null;
        }
        return this.f43458zzb.zzb(obj2, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f43457zza.hashCode();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzby, java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return this.f43458zzb.zzq();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj2) {
        Collection collection = (Collection) this.f43457zza.remove(obj2);
        if (collection == null) {
            return null;
        }
        Collection collectionZza = this.f43458zzb.zza();
        collectionZza.addAll(collection);
        zzap.zzg(this.f43458zzb, collection.size());
        collection.clear();
        return collectionZza;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f43457zza.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f43457zza.toString();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzby
    public final Set zza() {
        return new zzaf(this);
    }
}
