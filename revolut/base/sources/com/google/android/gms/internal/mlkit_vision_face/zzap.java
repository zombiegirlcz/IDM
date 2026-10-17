package com.google.android.gms.internal.mlkit_vision_face;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: classes16.dex */
abstract class zzap extends zzar implements Serializable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private transient Map f43473zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private transient int f43474zzb;

    public zzap(Map map) {
        if (!map.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.f43473zza = map;
    }

    public static /* synthetic */ int zzd(zzap zzapVar) {
        int i = zzapVar.f43474zzb;
        zzapVar.f43474zzb = i + 1;
        return i;
    }

    public static /* synthetic */ int zze(zzap zzapVar) {
        int i = zzapVar.f43474zzb;
        zzapVar.f43474zzb = i - 1;
        return i;
    }

    public static /* synthetic */ int zzf(zzap zzapVar, int i) {
        int i2 = zzapVar.f43474zzb + i;
        zzapVar.f43474zzb = i2;
        return i2;
    }

    public static /* synthetic */ int zzg(zzap zzapVar, int i) {
        int i2 = zzapVar.f43474zzb - i;
        zzapVar.f43474zzb = i2;
        return i2;
    }

    public static /* synthetic */ void zzm(zzap zzapVar, Object obj2) {
        Object objRemove;
        Map map = zzapVar.f43473zza;
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
            zzapVar.f43474zzb -= size;
        }
    }

    public abstract Collection zza();

    public Collection zzb(Object obj2, Collection collection) {
        throw null;
    }

    public final Collection zzh(Object obj2) {
        Collection collectionZza = (Collection) this.f43473zza.get(obj2);
        if (collectionZza == null) {
            collectionZza = zza();
        }
        return zzb(obj2, collectionZza);
    }

    public final List zzi(Object obj2, List list, zzam zzamVar) {
        return list instanceof RandomAccess ? new zzak(this, obj2, list, zzamVar) : new zzao(this, obj2, list, zzamVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzar
    public final Map zzk() {
        return new zzah(this, this.f43473zza);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzar
    public final Set zzl() {
        return new zzaj(this, this.f43473zza);
    }

    public final void zzn() {
        Iterator it8 = this.f43473zza.values().iterator();
        while (it8.hasNext()) {
            ((Collection) it8.next()).clear();
        }
        this.f43473zza.clear();
        this.f43474zzb = 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzar, com.google.android.gms.internal.mlkit_vision_face.zzca
    public final boolean zzo(Object obj2, Object obj3) {
        Collection collection = (Collection) this.f43473zza.get(obj2);
        if (collection != null) {
            if (!collection.add(obj3)) {
                return false;
            }
            this.f43474zzb++;
            return true;
        }
        Collection collectionZza = zza();
        if (!collectionZza.add(obj3)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f43474zzb++;
        this.f43473zza.put(obj2, collectionZza);
        return true;
    }
}
