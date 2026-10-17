package com.google.android.gms.internal.mlkit_vision_face;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes16.dex */
class zzam extends AbstractCollection {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final Object f43466zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    Collection f43467zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final zzam f43468zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    final Collection f43469zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    final /* synthetic */ zzap f43470zze;

    public zzam(zzap zzapVar, Object obj2, Collection collection, zzam zzamVar) {
        this.f43470zze = zzapVar;
        this.f43466zza = obj2;
        this.f43467zzb = collection;
        this.f43468zzc = zzamVar;
        this.f43469zzd = zzamVar == null ? null : zzamVar.f43467zzb;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj2) {
        zzb();
        boolean zIsEmpty = this.f43467zzb.isEmpty();
        boolean zAdd = this.f43467zzb.add(obj2);
        if (!zAdd) {
            return zAdd;
        }
        zzap.zzd(this.f43470zze);
        if (!zIsEmpty) {
            return zAdd;
        }
        zza();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.f43467zzb.addAll(collection);
        if (!zAddAll) {
            return zAddAll;
        }
        zzap.zzf(this.f43470zze, this.f43467zzb.size() - size);
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
        this.f43467zzb.clear();
        zzap.zzg(this.f43470zze, size);
        zzc();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj2) {
        zzb();
        return this.f43467zzb.contains(obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        zzb();
        return this.f43467zzb.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        zzb();
        return this.f43467zzb.equals(obj2);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        zzb();
        return this.f43467zzb.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzb();
        return new zzal(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj2) {
        zzb();
        boolean zRemove = this.f43467zzb.remove(obj2);
        if (zRemove) {
            zzap.zze(this.f43470zze);
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
        boolean zRemoveAll = this.f43467zzb.removeAll(collection);
        if (zRemoveAll) {
            zzap.zzf(this.f43470zze, this.f43467zzb.size() - size);
            zzc();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.f43467zzb.retainAll(collection);
        if (zRetainAll) {
            zzap.zzf(this.f43470zze, this.f43467zzb.size() - size);
            zzc();
        }
        return zRetainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        zzb();
        return this.f43467zzb.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        zzb();
        return this.f43467zzb.toString();
    }

    public final void zza() {
        zzam zzamVar = this.f43468zzc;
        if (zzamVar != null) {
            zzamVar.zza();
        } else {
            this.f43470zze.f43473zza.put(this.f43466zza, this.f43467zzb);
        }
    }

    public final void zzb() {
        Collection collection;
        zzam zzamVar = this.f43468zzc;
        if (zzamVar != null) {
            zzamVar.zzb();
            if (this.f43468zzc.f43467zzb != this.f43469zzd) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.f43467zzb.isEmpty() || (collection = (Collection) this.f43470zze.f43473zza.get(this.f43466zza)) == null) {
                return;
            }
            this.f43467zzb = collection;
        }
    }

    public final void zzc() {
        zzam zzamVar = this.f43468zzc;
        if (zzamVar != null) {
            zzamVar.zzc();
        } else if (this.f43467zzb.isEmpty()) {
            this.f43470zze.f43473zza.remove(this.f43466zza);
        }
    }
}
