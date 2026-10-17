package com.google.android.gms.internal.play_billing;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes16.dex */
public abstract class zzbw extends zzbt implements List, RandomAccess {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final zzcl f45853zza = new zzbu(zzcd.f45866zza, 0);

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    public static final /* synthetic */ int f45854zzd = 0;

    public static zzbw zzi(Object[] objArr, int i) {
        return i == 0 ? zzcd.f45866zza : new zzcd(objArr, i);
    }

    public static zzbw zzj(Collection collection) {
        if (!(collection instanceof zzbt)) {
            Object[] array = collection.toArray();
            int length = array.length;
            zzcc.zza(array, length);
            return zzi(array, length);
        }
        zzbw zzbwVarZzd = ((zzbt) collection).zzd();
        if (!zzbwVarZzd.zzf()) {
            return zzbwVarZzd;
        }
        Object[] array2 = zzbwVarZzd.toArray();
        return zzi(array2, array2.length);
    }

    public static zzbw zzk() {
        return zzcd.f45866zza;
    }

    public static zzbw zzl(Object obj2) {
        Object[] objArr = {"inapp"};
        zzcc.zza(objArr, 1);
        return zzi(objArr, 1);
    }

    public static zzbw zzm(Object obj2, Object obj3) {
        Object[] objArr = {"subs", "inapp"};
        zzcc.zza(objArr, 2);
        return zzi(objArr, 2);
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

    @Override // com.google.android.gms.internal.play_billing.zzbt, java.util.AbstractCollection, java.util.Collection
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
                if (!Objects.equals(get(i), list.get(i))) {
                    return false;
                }
            }
            return true;
        }
        Iterator it8 = iterator();
        Iterator it9 = list.iterator();
        while (it8.hasNext()) {
            if (!it9.hasNext() || !Objects.equals(it8.next(), it9.next())) {
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

    @Override // com.google.android.gms.internal.play_billing.zzbt, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
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

    @Override // com.google.android.gms.internal.play_billing.zzbt
    public int zza(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = get(i2);
        }
        return size;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbt
    @Deprecated
    public final zzbw zzd() {
        return this;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbt
    /* JADX INFO: renamed from: zze */
    public final zzck iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: zzh */
    public zzbw subList(int i, int i2) {
        zzbj.zzd(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? zzcd.f45866zza : new zzbv(this, i, i3);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: zzn, reason: merged with bridge method [inline-methods] */
    public final zzcl listIterator(int i) {
        zzbj.zzb(i, size(), "index");
        return isEmpty() ? f45853zza : new zzbu(this, i);
    }
}
