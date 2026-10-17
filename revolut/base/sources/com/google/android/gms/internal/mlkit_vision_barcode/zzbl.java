package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes16.dex */
final class zzbl extends zzdh {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final transient Map f41260zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzbu f41261zzb;

    public zzbl(zzbu zzbuVar, Map map) {
        this.f41261zzb = zzbuVar;
        this.f41260zza = map;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Map map = this.f41260zza;
        zzbu zzbuVar = this.f41261zzb;
        if (map == zzbuVar.f41281zza) {
            zzbuVar.zzs();
        } else {
            zzda.zza(new zzbk(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj2) {
        return zzdi.zzb(this.f41260zza, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj2) {
        return this == obj2 || this.f41260zza.equals(obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f41260zza.hashCode();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdh, java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return this.f41261zzb.zzw();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj2) {
        Collection collection = (Collection) this.f41260zza.remove(obj2);
        if (collection == null) {
            return null;
        }
        Collection collectionZza = this.f41261zzb.zza();
        collectionZza.addAll(collection);
        this.f41261zzb.f41282zzb -= collection.size();
        collection.clear();
        return collectionZza;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f41260zza.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f41260zza.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Collection get(Object obj2) {
        Collection collection = (Collection) zzdi.zza(this.f41260zza, obj2);
        if (collection == null) {
            return null;
        }
        return this.f41261zzb.zzd(obj2, collection);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdh
    public final Set zzb() {
        return new zzbj(this);
    }
}
