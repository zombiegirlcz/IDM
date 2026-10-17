package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzcv extends zzcq implements List, RandomAccess {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final zzdy f41321zza = new zzct(zzdn.f41334zza, 0);

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    public static final /* synthetic */ int f41322zzd = 0;

    public static zzcv zzg(Object[] objArr, int i) {
        return i == 0 ? zzdn.f41334zza : new zzdn(objArr, i);
    }

    public static zzcv zzh(Object obj2, Object obj3) {
        Object[] objArr = {obj2, obj3};
        zzdm.zza(objArr, 2);
        return zzg(objArr, 2);
    }

    public static zzcv zzi(Object obj2, Object obj3, Object obj4, Object obj5) {
        Object[] objArr = {obj2, obj3, obj4, obj5};
        zzdm.zza(objArr, 4);
        return zzg(objArr, 4);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcq, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj2) {
        return indexOf(obj2) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (!(obj2 instanceof List)) {
            return false;
        }
        List list = (List) obj2;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        if (list instanceof RandomAccess) {
            for (int i = 0; i < size; i++) {
                if (!zzay.zza(get(i), list.get(i))) {
                    return false;
                }
            }
            return true;
        }
        Iterator it8 = iterator();
        Iterator it9 = list.iterator();
        while (it8.hasNext()) {
            if (!it9.hasNext() || !zzay.zza(it8.next(), it9.next())) {
                return false;
            }
        }
        return !it9.hasNext();
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i = 0; i < size; i++) {
            iHashCode = (iHashCode * 31) + get(i).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.List
    public final int indexOf(Object obj2) {
        if (obj2 == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj2.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj2) {
        if (obj2 == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj2.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcq
    public int zza(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcq
    /* JADX INFO: renamed from: zzd */
    public final zzdx iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: zzf */
    public zzcv subList(int i, int i2) {
        zzbc.zzd(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? zzdn.f41334zza : new zzcu(this, i, i3);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: zzj, reason: merged with bridge method [inline-methods] */
    public final zzdy listIterator(int i) {
        zzbc.zzb(i, size(), "index");
        return isEmpty() ? f41321zza : new zzct(this, i);
    }
}
