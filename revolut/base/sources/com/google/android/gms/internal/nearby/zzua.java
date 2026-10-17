package com.google.android.gms.internal.nearby;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes16.dex */
public abstract class zzua<E> extends zztx<E> implements List<E>, RandomAccess {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final zzuj f45737zza = new zzty(zzuf.f45742zza, 0);

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    public static final /* synthetic */ int f45738zzd = 0;

    public static zzua zzi(Object[] objArr, int i) {
        return i == 0 ? zzuf.f45742zza : new zzuf(objArr, i);
    }

    public static zzua zzj(Collection collection) {
        if (!(collection instanceof zztx)) {
            Object[] array = collection.toArray();
            int length = array.length;
            zzue.zzb(array, length);
            return zzi(array, length);
        }
        zzua zzuaVarZzd = ((zztx) collection).zzd();
        if (!zzuaVarZzd.zzf()) {
            return zzuaVarZzd;
        }
        Object[] array2 = zzuaVarZzd.toArray();
        return zzi(array2, array2.length);
    }

    public static zzua zzk() {
        return zzuf.f45742zza;
    }

    public static zzua zzl(Object obj2) {
        Object[] objArr = {obj2};
        zzue.zzb(objArr, 1);
        return zzi(objArr, 1);
    }

    public static zzua zzm(Object obj2, Object obj3) {
        Object[] objArr = {obj2, obj3};
        zzue.zzb(objArr, 2);
        return zzi(objArr, 2);
    }

    public static zzua zzn(Object obj2, Object obj3, Object obj4) {
        Object[] objArr = {"/", "\\", "../"};
        zzue.zzb(objArr, 3);
        return zzi(objArr, 3);
    }

    public static zzua zzo(Object obj2, Object obj3, Object obj4, Object obj5) {
        Object[] objArr = {obj2, obj3, obj4, obj5};
        zzue.zzb(objArr, 4);
        return zzi(objArr, 4);
    }

    public static zzua zzp(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Object[] objArr = {obj2, obj3, obj4, obj5, obj6};
        zzue.zzb(objArr, 5);
        return zzi(objArr, 5);
    }

    @SafeVarargs
    public static zzua zzq(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object... objArr) {
        int length = objArr.length;
        int i = length + 12;
        Object[] objArr2 = new Object[i];
        objArr2[0] = obj2;
        objArr2[1] = obj3;
        objArr2[2] = obj4;
        objArr2[3] = obj5;
        objArr2[4] = obj6;
        objArr2[5] = obj7;
        objArr2[6] = obj8;
        objArr2[7] = obj9;
        objArr2[8] = obj10;
        objArr2[9] = obj11;
        objArr2[10] = obj12;
        objArr2[11] = obj13;
        System.arraycopy(objArr, 0, objArr2, 12, length);
        zzue.zzb(objArr2, i);
        return zzi(objArr2, i);
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

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
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
                if (!zztl.zza(get(i), list.get(i))) {
                    return false;
                }
            }
            return true;
        }
        Iterator<E> it8 = iterator();
        Iterator<E> it9 = list.iterator();
        while (it8.hasNext()) {
            if (!it9.hasNext() || !zztl.zza(it8.next(), it9.next())) {
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

    @Override // com.google.android.gms.internal.nearby.zztx, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
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

    @Override // com.google.android.gms.internal.nearby.zztx
    public int zza(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = get(i2);
        }
        return size;
    }

    @Override // com.google.android.gms.internal.nearby.zztx
    @Deprecated
    public final zzua zzd() {
        return this;
    }

    @Override // com.google.android.gms.internal.nearby.zztx
    /* JADX INFO: renamed from: zze */
    public final zzui iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: zzh */
    public zzua subList(int i, int i2) {
        zztq.zzh(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? zzuf.f45742zza : new zztz(this, i, i3);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: zzr, reason: merged with bridge method [inline-methods] */
    public final zzuj listIterator(int i) {
        zztq.zzb(i, size(), "index");
        return isEmpty() ? f45737zza : new zzty(this, i);
    }
}
