package com.google.android.gms.internal.mlkit_common;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes16.dex */
abstract class zzv extends zzat {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final int f41231zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private int f41232zzb;

    public zzv(int i, int i2) {
        zzt.zzb(i2, i, "index");
        this.f41231zza = i;
        this.f41232zzb = i2;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f41232zzb < this.f41231zza;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f41232zzb > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f41232zzb;
        this.f41232zzb = i + 1;
        return zza(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f41232zzb;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f41232zzb - 1;
        this.f41232zzb = i;
        return zza(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f41232zzb - 1;
    }

    public abstract Object zza(int i);
}
