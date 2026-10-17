package com.google.android.gms.internal.mlkit_vision_barcode;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: classes16.dex */
abstract class zzbu extends zzby implements Serializable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final transient Map f41281zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private transient int f41282zzb;

    public zzbu(Map map) {
        zzbc.zzc(map.isEmpty());
        this.f41281zza = map;
    }

    public static /* bridge */ /* synthetic */ void zzr(zzbu zzbuVar, Object obj2) {
        Object objRemove;
        try {
            objRemove = zzbuVar.f41281zza.remove(obj2);
        } catch (ClassCastException | NullPointerException unused) {
            objRemove = null;
        }
        Collection collection = (Collection) objRemove;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            zzbuVar.f41282zzb -= size;
        }
    }

    public abstract Collection zza();

    public Collection zzb() {
        throw null;
    }

    public Collection zzc(Collection collection) {
        throw null;
    }

    public Collection zzd(Object obj2, Collection collection) {
        throw null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdj
    public final int zzh() {
        return this.f41282zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzby
    public final Collection zzi() {
        return this instanceof zzdt ? new zzbx(this) : new zzbw(this);
    }

    public final Collection zzj(Object obj2) {
        Collection collectionZza = (Collection) this.f41281zza.get(obj2);
        if (collectionZza == null) {
            collectionZza = zza();
        }
        return zzd(obj2, collectionZza);
    }

    public final Collection zzk(Object obj2) {
        Collection collection = (Collection) this.f41281zza.remove(obj2);
        if (collection == null) {
            return zzb();
        }
        Collection collectionZza = zza();
        collectionZza.addAll(collection);
        this.f41282zzb -= collection.size();
        collection.clear();
        return zzc(collectionZza);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzby
    public final Iterator zzl() {
        return new zzbi(this);
    }

    public final List zzm(Object obj2, List list, zzbr zzbrVar) {
        return list instanceof RandomAccess ? new zzbp(this, obj2, list, zzbrVar) : new zzbt(this, obj2, list, zzbrVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzby
    public final Map zzo() {
        return new zzbl(this, this.f41281zza);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzby
    public final Set zzp() {
        return new zzbo(this, this.f41281zza);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdj
    public final void zzs() {
        Iterator it8 = this.f41281zza.values().iterator();
        while (it8.hasNext()) {
            ((Collection) it8.next()).clear();
        }
        this.f41281zza.clear();
        this.f41282zzb = 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzby, com.google.android.gms.internal.mlkit_vision_barcode.zzdj
    public final boolean zzt(Object obj2, Object obj3) {
        Collection collection = (Collection) this.f41281zza.get(obj2);
        if (collection != null) {
            if (!collection.add(obj3)) {
                return false;
            }
            this.f41282zzb++;
            return true;
        }
        Collection collectionZza = zza();
        if (!collectionZza.add(obj3)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f41282zzb++;
        this.f41281zza.put(obj2, collectionZza);
        return true;
    }
}
