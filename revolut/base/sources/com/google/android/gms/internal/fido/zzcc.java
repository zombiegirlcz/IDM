package com.google.android.gms.internal.fido;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes16.dex */
public abstract class zzcc extends zzby implements List, RandomAccess {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final zzdd f39323zza = new zzbz(zzct.f39341zza, 0);

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    public static final /* synthetic */ int f39324zzd = 0;

    public static zzcc zzh(Object[] objArr, int i) {
        return i == 0 ? zzct.f39341zza : new zzct(objArr, i);
    }

    public static zzcc zzi(Object[] objArr) {
        if (objArr.length == 0) {
            return zzct.f39341zza;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        zzcr.zzb(objArr2, length);
        return zzh(objArr2, length);
    }

    public static zzcc zzj(Object obj2) {
        Object[] objArr = {obj2};
        zzcr.zzb(objArr, 1);
        return zzh(objArr, 1);
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

    @Override // com.google.android.gms.internal.fido.zzby, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj2) {
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
                if (!zzbk.zza(get(i), list.get(i))) {
                    return false;
                }
            }
            return true;
        }
        Iterator it8 = iterator();
        Iterator it9 = list.iterator();
        while (it8.hasNext()) {
            if (!it9.hasNext() || !zzbk.zza(it8.next(), it9.next())) {
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

    public int indexOf(Object obj2) {
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

    @Override // com.google.android.gms.internal.fido.zzby, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    public int lastIndexOf(Object obj2) {
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

    @Override // com.google.android.gms.internal.fido.zzby
    public int zza(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = get(i2);
        }
        return size;
    }

    @Override // com.google.android.gms.internal.fido.zzby
    /* JADX INFO: renamed from: zzd */
    public final zzdc iterator() {
        return listIterator(0);
    }

    public zzcc zzf() {
        return size() <= 1 ? this : new zzca(this);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: zzg */
    public zzcc subList(int i, int i2) {
        zzbm.zze(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? zzct.f39341zza : new zzcb(this, i, i3);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: zzk, reason: merged with bridge method [inline-methods] */
    public final zzdd listIterator(int i) {
        zzbm.zzb(i, size(), "index");
        return isEmpty() ? f39323zza : new zzbz(this, i);
    }
}
