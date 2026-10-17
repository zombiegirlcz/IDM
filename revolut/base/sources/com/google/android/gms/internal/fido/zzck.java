package com.google.android.gms.internal.fido;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes16.dex */
public abstract class zzck extends zzcf implements NavigableSet, zzda {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final transient Comparator f39336zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    transient zzck f39337zzb;

    public zzck(Comparator comparator) {
        this.f39336zza = comparator;
    }

    public static zzcv zzs(Comparator comparator) {
        if (zzcq.f39340zza.equals(comparator)) {
            return zzcv.f39351zzc;
        }
        int i = zzcc.f39324zzd;
        return new zzcv(zzct.f39341zza, comparator);
    }

    @Deprecated
    public final void addFirst(Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void addLast(Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public Object ceiling(Object obj2) {
        obj2.getClass();
        return zzcl.zza(zzr(obj2, true), null);
    }

    @Override // java.util.SortedSet, com.google.android.gms.internal.fido.zzda
    public final Comparator comparator() {
        return this.f39336zza;
    }

    @Override // java.util.SortedSet
    public Object first() {
        return iterator().next();
    }

    @Override // java.util.NavigableSet
    public Object floor(Object obj2) {
        obj2.getClass();
        return zzcn.zza(zzo(obj2, true).descendingIterator(), null);
    }

    public final Object getFirst() {
        return first();
    }

    public final Object getLast() {
        return last();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* synthetic */ SortedSet headSet(Object obj2) {
        obj2.getClass();
        return zzo(obj2, false);
    }

    @Override // java.util.NavigableSet
    public Object higher(Object obj2) {
        obj2.getClass();
        return zzcl.zza(zzr(obj2, false), null);
    }

    @Override // java.util.SortedSet
    public Object last() {
        return descendingIterator().next();
    }

    @Override // java.util.NavigableSet
    public Object lower(Object obj2) {
        obj2.getClass();
        return zzcn.zza(zzo(obj2, false).descendingIterator(), null);
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object removeFirst() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object removeLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj2, Object obj3) {
        return subSet(obj2, true, obj3, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* synthetic */ SortedSet tailSet(Object obj2) {
        obj2.getClass();
        return zzr(obj2, true);
    }

    @Override // com.google.android.gms.internal.fido.zzcf, com.google.android.gms.internal.fido.zzby, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: zzd */
    public abstract zzdc iterator();

    public abstract zzck zzf();

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: zzn, reason: merged with bridge method [inline-methods] */
    public final zzck descendingSet() {
        zzck zzckVar = this.f39337zzb;
        if (zzckVar != null) {
            return zzckVar;
        }
        zzck zzckVarZzf = zzf();
        this.f39337zzb = zzckVarZzf;
        zzckVarZzf.f39337zzb = this;
        return zzckVarZzf;
    }

    public abstract zzck zzo(Object obj2, boolean z);

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: zzp, reason: merged with bridge method [inline-methods] */
    public final zzck subSet(Object obj2, boolean z, Object obj3, boolean z3) {
        obj2.getClass();
        obj3.getClass();
        zzbm.zzc(this.f39336zza.compare(obj2, obj3) <= 0);
        return zzq(obj2, z, obj3, z3);
    }

    public abstract zzck zzq(Object obj2, boolean z, Object obj3, boolean z3);

    public abstract zzck zzr(Object obj2, boolean z);

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: zzt, reason: merged with bridge method [inline-methods] */
    public abstract zzdc descendingIterator();

    @Override // java.util.NavigableSet
    public final /* synthetic */ NavigableSet headSet(Object obj2, boolean z) {
        obj2.getClass();
        return zzo(obj2, z);
    }

    @Override // java.util.NavigableSet
    public final /* synthetic */ NavigableSet tailSet(Object obj2, boolean z) {
        obj2.getClass();
        return zzr(obj2, z);
    }
}
