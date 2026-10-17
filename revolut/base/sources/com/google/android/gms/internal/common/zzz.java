package com.google.android.gms.internal.common;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes16.dex */
abstract class zzz extends zzal {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final int f39263zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private int f39264zzb;

    public zzz(int i, int i2) {
        zzr.zzc(i2, i, "index");
        this.f39263zza = i;
        this.f39264zzb = i2;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f39264zzb < this.f39263zza;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f39264zzb > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f39264zzb;
        this.f39264zzb = i + 1;
        return zza(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f39264zzb;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f39264zzb - 1;
        this.f39264zzb = i;
        return zza(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f39264zzb - 1;
    }

    public abstract Object zza(int i);
}
