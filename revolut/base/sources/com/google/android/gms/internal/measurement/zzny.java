package com.google.android.gms.internal.measurement;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
final class zzny extends AbstractSet {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzoa f40534zza;

    public /* synthetic */ zzny(zzoa zzoaVar, zznz zznzVar) {
        this.f40534zza = zzoaVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ /* synthetic */ boolean add(Object obj2) {
        Map.Entry entry = (Map.Entry) obj2;
        if (contains(entry)) {
            return false;
        }
        this.f40534zza.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f40534zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj2) {
        Map.Entry entry = (Map.Entry) obj2;
        Object obj3 = this.f40534zza.get(entry.getKey());
        Object value = entry.getValue();
        if (obj3 != value) {
            return obj3 != null && obj3.equals(value);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zznx(this.f40534zza, null);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj2) {
        Map.Entry entry = (Map.Entry) obj2;
        if (!contains(entry)) {
            return false;
        }
        this.f40534zza.remove(entry.getKey());
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f40534zza.size();
    }
}
