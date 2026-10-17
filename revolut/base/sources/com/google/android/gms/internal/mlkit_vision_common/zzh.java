package com.google.android.gms.internal.mlkit_vision_common;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
abstract class zzh extends zzac {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final int f43275zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private int f43276zzb;

    public zzh(int i, int i2) {
        zzf.zzb(i2, i, "index");
        this.f43275zza = i;
        this.f43276zzb = i2;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f43276zzb < this.f43275zza;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f43276zzb > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f43276zzb;
        this.f43276zzb = i + 1;
        return zza(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f43276zzb;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f43276zzb - 1;
        this.f43276zzb = i;
        return zza(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f43276zzb - 1;
    }

    public abstract Object zza(int i);
}
