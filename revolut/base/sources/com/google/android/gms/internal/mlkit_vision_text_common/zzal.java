package com.google.android.gms.internal.mlkit_vision_text_common;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: classes16.dex */
abstract class zzal extends zzan implements Serializable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private transient Map f44448zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private transient int f44449zzb;

    public zzal(Map map) {
        if (!map.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.f44448zza = map;
    }

    public static /* bridge */ /* synthetic */ void zzk(zzal zzalVar, Object obj2) {
        Object objRemove;
        Map map = zzalVar.f44448zza;
        map.getClass();
        try {
            objRemove = map.remove(obj2);
        } catch (ClassCastException | NullPointerException unused) {
            objRemove = null;
        }
        Collection collection = (Collection) objRemove;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            zzalVar.f44449zzb -= size;
        }
    }

    public abstract Collection zza();

    public Collection zzb(Object obj2, Collection collection) {
        throw null;
    }

    public final Collection zze(Object obj2) {
        Collection collectionZza = (Collection) this.f44448zza.get(obj2);
        if (collectionZza == null) {
            collectionZza = zza();
        }
        return zzb(obj2, collectionZza);
    }

    public final List zzf(Object obj2, List list, zzai zzaiVar) {
        return list instanceof RandomAccess ? new zzag(this, obj2, list, zzaiVar) : new zzak(this, obj2, list, zzaiVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzan
    public final Map zzh() {
        return new zzad(this, this.f44448zza);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzan
    public final Set zzi() {
        return new zzaf(this, this.f44448zza);
    }

    public final void zzl() {
        Iterator it8 = this.f44448zza.values().iterator();
        while (it8.hasNext()) {
            ((Collection) it8.next()).clear();
        }
        this.f44448zza.clear();
        this.f44449zzb = 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzan, com.google.android.gms.internal.mlkit_vision_text_common.zzcc
    public final boolean zzm(Object obj2, Object obj3) {
        Collection collection = (Collection) this.f44448zza.get(obj2);
        if (collection != null) {
            if (!collection.add(obj3)) {
                return false;
            }
            this.f44449zzb++;
            return true;
        }
        Collection collectionZza = zza();
        if (!collectionZza.add(obj3)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f44449zzb++;
        this.f44448zza.put(obj2, collectionZza);
        return true;
    }
}
