package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes16.dex */
abstract class zzkq extends AbstractList implements zzmj {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private boolean f40390zza;

    public zzkq(boolean z) {
        this.f40390zza = z;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, Object obj2) {
        zzcE();
        super.add(i, obj2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        zzcE();
        return super.addAll(i, collection);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zzcE();
        super.clear();
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (!(obj2 instanceof List)) {
            return false;
        }
        if (!(obj2 instanceof RandomAccess)) {
            return super.equals(obj2);
        }
        List list = (List) obj2;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i = 0; i < size; i++) {
            iHashCode = (iHashCode * 31) + get(i).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object remove(int i) {
        zzcE();
        return super.remove(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        zzcE();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        zzcE();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i, Object obj2) {
        zzcE();
        return super.set(i, obj2);
    }

    @Override // com.google.android.gms.internal.measurement.zzmj
    public final void zzb() {
        if (this.f40390zza) {
            this.f40390zza = false;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmj
    public final boolean zzc() {
        return this.f40390zza;
    }

    public final void zzcE() {
        if (!this.f40390zza) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj2) {
        zzcE();
        return super.add(obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        zzcE();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj2) {
        zzcE();
        int iIndexOf = indexOf(obj2);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }
}
