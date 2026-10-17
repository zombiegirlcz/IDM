package com.google.android.gms.internal.mlkit_vision_face;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
class zzbw extends zzci {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final Map f43515zzb;

    public zzbw(Map map) {
        map.getClass();
        this.f43515zzb = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f43515zzb.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj2) {
        return this.f43515zzb.containsKey(obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f43515zzb.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new zzbt(this.f43515zzb.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj2) {
        if (!contains(obj2)) {
            return false;
        }
        this.f43515zzb.remove(obj2);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f43515zzb.size();
    }
}
