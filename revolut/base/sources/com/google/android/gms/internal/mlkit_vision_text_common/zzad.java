package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes16.dex */
final class zzad extends zzca {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final transient Map f44432zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzal f44433zzb;

    public zzad(zzal zzalVar, Map map) {
        this.f44433zzb = zzalVar;
        this.f44432zza = map;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        zzal zzalVar = this.f44433zzb;
        if (this.f44432zza == zzalVar.f44448zza) {
            zzalVar.zzl();
        } else {
            zzbo.zza(new zzac(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj2) {
        return zzcb.zzb(this.f44432zza, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj2) {
        return this == obj2 || this.f44432zza.equals(obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj2) {
        Collection collection = (Collection) zzcb.zza(this.f44432zza, obj2);
        if (collection == null) {
            return null;
        }
        return this.f44433zzb.zzb(obj2, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f44432zza.hashCode();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzca, java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return this.f44433zzb.zzo();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj2) {
        Collection collection = (Collection) this.f44432zza.remove(obj2);
        if (collection == null) {
            return null;
        }
        Collection collectionZza = this.f44433zzb.zza();
        collectionZza.addAll(collection);
        this.f44433zzb.f44449zzb -= collection.size();
        collection.clear();
        return collectionZza;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f44432zza.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f44432zza.toString();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzca
    public final Set zza() {
        return new zzab(this);
    }
}
