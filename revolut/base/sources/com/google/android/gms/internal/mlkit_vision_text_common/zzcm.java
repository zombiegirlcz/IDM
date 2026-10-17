package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Iterator;

/* JADX INFO: loaded from: classes16.dex */
abstract class zzcm implements Iterator {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final Iterator f44515zzb;

    public zzcm(Iterator it8) {
        it8.getClass();
        this.f44515zzb = it8;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f44515zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return zza(this.f44515zzb.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f44515zzb.remove();
    }

    public abstract Object zza(Object obj2);
}
