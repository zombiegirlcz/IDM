package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Iterator;

/* JADX INFO: loaded from: classes16.dex */
abstract class zzdw implements Iterator {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final Iterator f41349zza;

    public zzdw(Iterator it8) {
        it8.getClass();
        this.f41349zza = it8;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f41349zza.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return zza(this.f41349zza.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f41349zza.remove();
    }

    public abstract Object zza(Object obj2);
}
