package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes16.dex */
class zzbr extends AbstractCollection {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final Object f41274zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    Collection f41275zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final zzbr f41276zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    final Collection f41277zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    final /* synthetic */ zzbu f41278zze;

    public zzbr(zzbu zzbuVar, Object obj2, Collection collection, zzbr zzbrVar) {
        this.f41278zze = zzbuVar;
        this.f41274zza = obj2;
        this.f41275zzb = collection;
        this.f41276zzc = zzbrVar;
        this.f41277zzd = zzbrVar == null ? null : zzbrVar.f41275zzb;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj2) {
        zzb();
        boolean zIsEmpty = this.f41275zzb.isEmpty();
        boolean zAdd = this.f41275zzb.add(obj2);
        if (zAdd) {
            this.f41278zze.f41282zzb++;
            if (zIsEmpty) {
                zza();
                return true;
            }
        }
        return zAdd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.f41275zzb.addAll(collection);
        if (!zAddAll) {
            return zAddAll;
        }
        int size2 = this.f41275zzb.size();
        zzbu zzbuVar = this.f41278zze;
        zzbuVar.f41282zzb = (size2 - size) + zzbuVar.f41282zzb;
        if (size != 0) {
            return zAddAll;
        }
        zza();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f41275zzb.clear();
        this.f41278zze.f41282zzb -= size;
        zzc();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj2) {
        zzb();
        return this.f41275zzb.contains(obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        zzb();
        return this.f41275zzb.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        zzb();
        return this.f41275zzb.equals(obj2);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        zzb();
        return this.f41275zzb.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzb();
        return new zzbq(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj2) {
        zzb();
        boolean zRemove = this.f41275zzb.remove(obj2);
        if (zRemove) {
            zzbu zzbuVar = this.f41278zze;
            zzbuVar.f41282zzb--;
            zzc();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.f41275zzb.removeAll(collection);
        if (zRemoveAll) {
            int size2 = this.f41275zzb.size();
            zzbu zzbuVar = this.f41278zze;
            zzbuVar.f41282zzb = (size2 - size) + zzbuVar.f41282zzb;
            zzc();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.f41275zzb.retainAll(collection);
        if (zRetainAll) {
            int size2 = this.f41275zzb.size();
            zzbu zzbuVar = this.f41278zze;
            zzbuVar.f41282zzb = (size2 - size) + zzbuVar.f41282zzb;
            zzc();
        }
        return zRetainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        zzb();
        return this.f41275zzb.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        zzb();
        return this.f41275zzb.toString();
    }

    public final void zza() {
        zzbr zzbrVar = this.f41276zzc;
        if (zzbrVar != null) {
            zzbrVar.zza();
        } else {
            this.f41278zze.f41281zza.put(this.f41274zza, this.f41275zzb);
        }
    }

    public final void zzb() {
        Collection collection;
        zzbr zzbrVar = this.f41276zzc;
        if (zzbrVar != null) {
            zzbrVar.zzb();
            if (this.f41276zzc.f41275zzb != this.f41277zzd) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.f41275zzb.isEmpty() || (collection = (Collection) this.f41278zze.f41281zza.get(this.f41274zza)) == null) {
                return;
            }
            this.f41275zzb = collection;
        }
    }

    public final void zzc() {
        zzbr zzbrVar = this.f41276zzc;
        if (zzbrVar != null) {
            zzbrVar.zzc();
        } else if (this.f41275zzb.isEmpty()) {
            this.f41278zze.f41281zza.remove(this.f41274zza);
        }
    }
}
