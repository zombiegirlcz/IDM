package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes16.dex */
class zzai extends AbstractCollection {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final Object f44441zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    Collection f44442zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final zzai f44443zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    final Collection f44444zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    final /* synthetic */ zzal f44445zze;

    public zzai(zzal zzalVar, Object obj2, Collection collection, zzai zzaiVar) {
        this.f44445zze = zzalVar;
        this.f44441zza = obj2;
        this.f44442zzb = collection;
        this.f44443zzc = zzaiVar;
        this.f44444zzd = zzaiVar == null ? null : zzaiVar.f44442zzb;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj2) {
        zzb();
        boolean zIsEmpty = this.f44442zzb.isEmpty();
        boolean zAdd = this.f44442zzb.add(obj2);
        if (zAdd) {
            this.f44445zze.f44449zzb++;
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
        boolean zAddAll = this.f44442zzb.addAll(collection);
        if (!zAddAll) {
            return zAddAll;
        }
        int size2 = this.f44442zzb.size();
        this.f44445zze.f44449zzb += size2 - size;
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
        this.f44442zzb.clear();
        this.f44445zze.f44449zzb -= size;
        zzc();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj2) {
        zzb();
        return this.f44442zzb.contains(obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        zzb();
        return this.f44442zzb.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        zzb();
        return this.f44442zzb.equals(obj2);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        zzb();
        return this.f44442zzb.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzb();
        return new zzah(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj2) {
        zzb();
        boolean zRemove = this.f44442zzb.remove(obj2);
        if (zRemove) {
            zzal zzalVar = this.f44445zze;
            zzalVar.f44449zzb--;
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
        boolean zRemoveAll = this.f44442zzb.removeAll(collection);
        if (zRemoveAll) {
            int size2 = this.f44442zzb.size();
            this.f44445zze.f44449zzb += size2 - size;
            zzc();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.f44442zzb.retainAll(collection);
        if (zRetainAll) {
            int size2 = this.f44442zzb.size();
            this.f44445zze.f44449zzb += size2 - size;
            zzc();
        }
        return zRetainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        zzb();
        return this.f44442zzb.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        zzb();
        return this.f44442zzb.toString();
    }

    public final void zza() {
        zzai zzaiVar = this.f44443zzc;
        if (zzaiVar != null) {
            zzaiVar.zza();
            return;
        }
        zzal zzalVar = this.f44445zze;
        zzalVar.f44448zza.put(this.f44441zza, this.f44442zzb);
    }

    public final void zzb() {
        zzai zzaiVar = this.f44443zzc;
        if (zzaiVar != null) {
            zzaiVar.zzb();
            zzai zzaiVar2 = this.f44443zzc;
            if (zzaiVar2.f44442zzb != this.f44444zzd) {
                throw new ConcurrentModificationException();
            }
            return;
        }
        if (this.f44442zzb.isEmpty()) {
            zzal zzalVar = this.f44445zze;
            Collection collection = (Collection) zzalVar.f44448zza.get(this.f44441zza);
            if (collection != null) {
                this.f44442zzb = collection;
            }
        }
    }

    public final void zzc() {
        zzai zzaiVar = this.f44443zzc;
        if (zzaiVar != null) {
            zzaiVar.zzc();
        } else if (this.f44442zzb.isEmpty()) {
            zzal zzalVar = this.f44445zze;
            zzalVar.f44448zza.remove(this.f44441zza);
        }
    }
}
