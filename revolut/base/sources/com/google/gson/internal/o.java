package com.google.gson.internal;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class o extends AbstractSet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LinkedTreeMap f49649a;

    public o(LinkedTreeMap linkedTreeMap) {
        this.f49649a = linkedTreeMap;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f49649a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj2) {
        return (obj2 instanceof Map.Entry) && this.f49649a.findByEntry((Map.Entry) obj2) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new n(this.f49649a, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj2) {
        LinkedTreeMap linkedTreeMap;
        q qVarFindByEntry;
        if (!(obj2 instanceof Map.Entry) || (qVarFindByEntry = (linkedTreeMap = this.f49649a).findByEntry((Map.Entry) obj2)) == null) {
            return false;
        }
        linkedTreeMap.removeInternal(qVarFindByEntry, true);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f49649a.size;
    }
}
