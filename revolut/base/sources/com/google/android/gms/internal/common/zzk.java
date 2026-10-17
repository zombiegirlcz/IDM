package com.google.android.gms.internal.common;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes16.dex */
abstract class zzk implements Iterator {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private Object f39246zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private int f39247zzb = 2;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zzr.zza(this.f39247zzb != 4);
        int i = this.f39247zzb;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            return true;
        }
        if (i2 != 2) {
            this.f39247zzb = 4;
            this.f39246zza = zza();
            if (this.f39247zzb != 3) {
                this.f39247zzb = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f39247zzb = 2;
        Object obj2 = this.f39246zza;
        this.f39246zza = null;
        return obj2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public abstract Object zza();

    public final Object zzb() {
        this.f39247zzb = 3;
        return null;
    }
}
