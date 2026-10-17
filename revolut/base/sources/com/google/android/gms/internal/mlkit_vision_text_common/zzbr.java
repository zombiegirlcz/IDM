package com.google.android.gms.internal.mlkit_vision_text_common;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes16.dex */
final class zzbr extends AbstractList implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final List f44492zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final zzu f44493zzb;

    public zzbr(List list, zzu zzuVar) {
        list.getClass();
        this.f44492zza = list;
        this.f44493zzb = zzuVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f44493zzb.zza(this.f44492zza.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f44492zza.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new zzbq(this, this.f44492zza.listIterator(i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        return this.f44493zzb.zza(this.f44492zza.remove(i));
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        this.f44492zza.subList(i, i2).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f44492zza.size();
    }
}
