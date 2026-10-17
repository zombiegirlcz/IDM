package com.google.android.gms.internal.mlkit_vision_face;

import java.util.Iterator;

/* JADX INFO: loaded from: classes16.dex */
abstract class zzck implements Iterator {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final Iterator f43536zza;

    public zzck(Iterator it8) {
        it8.getClass();
        this.f43536zza = it8;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f43536zza.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return zza(this.f43536zza.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f43536zza.remove();
    }

    public abstract Object zza(Object obj2);
}
