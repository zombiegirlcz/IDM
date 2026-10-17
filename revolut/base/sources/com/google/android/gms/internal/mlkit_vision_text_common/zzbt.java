package com.google.android.gms.internal.mlkit_vision_text_common;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes16.dex */
final class zzbt extends AbstractSequentialList implements Serializable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final List f44495zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final zzu f44496zzb;

    public zzbt(List list, zzu zzuVar) {
        list.getClass();
        this.f44495zza = list;
        this.f44496zzb = zzuVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f44495zza.isEmpty();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new zzbs(this, this.f44495zza.listIterator(i));
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        this.f44495zza.subList(i, i2).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f44495zza.size();
    }
}
