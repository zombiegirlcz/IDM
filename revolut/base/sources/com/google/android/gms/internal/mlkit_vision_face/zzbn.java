package com.google.android.gms.internal.mlkit_vision_face;

import a0.d;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzbn extends zzbi implements List, RandomAccess {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final zzcm f43510zza = new zzbl(zzcc.f43521zza, 0);

    public static zzbn zzg(Object[] objArr) {
        return zzh(objArr, objArr.length);
    }

    public static zzbn zzh(Object[] objArr, int i) {
        return i == 0 ? zzcc.f43521zza : new zzcc(objArr, i);
    }

    public static zzbn zzi(Object obj2, Object obj3) {
        Object[] objArr = {obj2, obj3};
        for (int i = 0; i < 2; i++) {
            if (objArr[i] == null) {
                throw new NullPointerException(d.n("at index ", i));
            }
        }
        return zzh(objArr, 2);
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

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbi, java.util.AbstractCollection, java.util.Collection
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
                if (!zzx.zza(get(i), list.get(i))) {
                    return false;
                }
            }
            return true;
        }
        Iterator it8 = iterator();
        Iterator it9 = list.iterator();
        while (it8.hasNext()) {
            if (!it9.hasNext() || !zzx.zza(it8.next(), it9.next())) {
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

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
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

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbi
    public int zza(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = get(i2);
        }
        return size;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbi
    /* JADX INFO: renamed from: zzd */
    public final zzcl iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: zzf */
    public zzbn subList(int i, int i2) {
        zzab.zzc(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? zzcc.f43521zza : new zzbm(this, i, i3);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: zzj, reason: merged with bridge method [inline-methods] */
    public final zzcm listIterator(int i) {
        zzab.zzb(i, size(), "index");
        return isEmpty() ? f43510zza : new zzbl(this, i);
    }
}
