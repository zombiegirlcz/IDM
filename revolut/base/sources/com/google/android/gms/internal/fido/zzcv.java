package com.google.android.gms.internal.fido;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes16.dex */
final class zzcv extends zzck {

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    static final zzcv f39351zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    final transient zzcc f39352zzd;

    static {
        int i = zzcc.f39324zzd;
        f39351zzc = new zzcv(zzct.f39341zza, zzcq.f39340zza);
    }

    public zzcv(zzcc zzccVar, Comparator comparator) {
        super(comparator);
        this.f39352zzd = zzccVar;
    }

    @Override // com.google.android.gms.internal.fido.zzck, java.util.NavigableSet
    public final Object ceiling(Object obj2) {
        zzcc zzccVar = this.f39352zzd;
        int iZzv = zzv(obj2, true);
        if (iZzv == zzccVar.size()) {
            return null;
        }
        return this.f39352zzd.get(iZzv);
    }

    @Override // com.google.android.gms.internal.fido.zzby, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj2) {
        if (obj2 != null) {
            try {
                if (Collections.binarySearch(this.f39352zzd, obj2, ((zzck) this).f39336zza) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof zzcp) {
            collection = ((zzcp) collection).zza();
        }
        if (!zzdb.zza(((zzck) this).f39336zza, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        zzdd zzddVarListIterator = this.f39352zzd.listIterator(0);
        Iterator it8 = collection.iterator();
        if (!zzddVarListIterator.hasNext()) {
            return false;
        }
        Object next = it8.next();
        E next2 = zzddVarListIterator.next();
        while (true) {
            try {
                int iCompare = ((zzck) this).f39336zza.compare(next2, next);
                if (iCompare >= 0) {
                    if (iCompare != 0) {
                        break;
                    }
                    if (!it8.hasNext()) {
                        return true;
                    }
                    next = it8.next();
                } else {
                    if (!zzddVarListIterator.hasNext()) {
                        return false;
                    }
                    next2 = zzddVarListIterator.next();
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.fido.zzcf, java.util.Collection, java.util.Set
    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (!(obj2 instanceof Set)) {
            return false;
        }
        Set set = (Set) obj2;
        if (this.f39352zzd.size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (!zzdb.zza(((zzck) this).f39336zza, set)) {
            return containsAll(set);
        }
        Iterator it8 = set.iterator();
        try {
            zzdd zzddVarListIterator = this.f39352zzd.listIterator(0);
            while (zzddVarListIterator.hasNext()) {
                E next = zzddVarListIterator.next();
                Object next2 = it8.next();
                if (next2 == null || ((zzck) this).f39336zza.compare(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.fido.zzck, java.util.SortedSet
    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f39352zzd.get(0);
    }

    @Override // com.google.android.gms.internal.fido.zzck, java.util.NavigableSet
    public final Object floor(Object obj2) {
        int iZzu = zzu(obj2, true) - 1;
        if (iZzu == -1) {
            return null;
        }
        return this.f39352zzd.get(iZzu);
    }

    @Override // com.google.android.gms.internal.fido.zzck, java.util.NavigableSet
    public final Object higher(Object obj2) {
        zzcc zzccVar = this.f39352zzd;
        int iZzv = zzv(obj2, false);
        if (iZzv == zzccVar.size()) {
            return null;
        }
        return this.f39352zzd.get(iZzv);
    }

    @Override // com.google.android.gms.internal.fido.zzck, com.google.android.gms.internal.fido.zzcf, com.google.android.gms.internal.fido.zzby, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.f39352zzd.listIterator(0);
    }

    @Override // com.google.android.gms.internal.fido.zzck, java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f39352zzd.get(r0.size() - 1);
    }

    @Override // com.google.android.gms.internal.fido.zzck, java.util.NavigableSet
    public final Object lower(Object obj2) {
        int iZzu = zzu(obj2, false) - 1;
        if (iZzu == -1) {
            return null;
        }
        return this.f39352zzd.get(iZzu);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f39352zzd.size();
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public final int zza(Object[] objArr, int i) {
        return this.f39352zzd.zza(objArr, 0);
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public final int zzb() {
        return this.f39352zzd.zzb();
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public final int zzc() {
        return this.f39352zzd.zzc();
    }

    @Override // com.google.android.gms.internal.fido.zzck, com.google.android.gms.internal.fido.zzcf, com.google.android.gms.internal.fido.zzby
    /* JADX INFO: renamed from: zzd */
    public final zzdc iterator() {
        return this.f39352zzd.listIterator(0);
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public final Object[] zze() {
        return this.f39352zzd.zze();
    }

    @Override // com.google.android.gms.internal.fido.zzck
    public final zzck zzf() {
        Comparator comparatorReverseOrder = Collections.reverseOrder(((zzck) this).f39336zza);
        return isEmpty() ? zzck.zzs(comparatorReverseOrder) : new zzcv(this.f39352zzd.zzf(), comparatorReverseOrder);
    }

    @Override // com.google.android.gms.internal.fido.zzcf
    public final zzcc zzi() {
        return this.f39352zzd;
    }

    @Override // com.google.android.gms.internal.fido.zzck
    public final zzck zzo(Object obj2, boolean z) {
        return zzw(0, zzu(obj2, z));
    }

    @Override // com.google.android.gms.internal.fido.zzck
    public final zzck zzq(Object obj2, boolean z, Object obj3, boolean z3) {
        return zzr(obj2, z).zzo(obj3, z3);
    }

    @Override // com.google.android.gms.internal.fido.zzck
    public final zzck zzr(Object obj2, boolean z) {
        return zzw(zzv(obj2, z), this.f39352zzd.size());
    }

    @Override // com.google.android.gms.internal.fido.zzck, java.util.NavigableSet
    /* JADX INFO: renamed from: zzt */
    public final zzdc descendingIterator() {
        return this.f39352zzd.zzf().listIterator(0);
    }

    public final int zzu(Object obj2, boolean z) {
        obj2.getClass();
        int iBinarySearch = Collections.binarySearch(this.f39352zzd, obj2, ((zzck) this).f39336zza);
        return iBinarySearch >= 0 ? z ? iBinarySearch + 1 : iBinarySearch : ~iBinarySearch;
    }

    public final int zzv(Object obj2, boolean z) {
        obj2.getClass();
        int iBinarySearch = Collections.binarySearch(this.f39352zzd, obj2, ((zzck) this).f39336zza);
        return iBinarySearch >= 0 ? z ? iBinarySearch : iBinarySearch + 1 : ~iBinarySearch;
    }

    public final zzcv zzw(int i, int i2) {
        if (i == 0) {
            if (i2 == this.f39352zzd.size()) {
                return this;
            }
            i = 0;
        }
        if (i >= i2) {
            return zzck.zzs(((zzck) this).f39336zza);
        }
        zzcc zzccVar = this.f39352zzd;
        return new zzcv(zzccVar.subList(i, i2), ((zzck) this).f39336zza);
    }
}
