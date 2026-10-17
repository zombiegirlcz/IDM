package com.google.android.gms.internal.maps;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes16.dex */
abstract class zzau extends zzbg {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final int f39782zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private int f39783zzb;

    public zzau(int i, int i2) {
        zzas.zzb(i2, i, "index");
        this.f39782zza = i;
        this.f39783zzb = i2;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f39783zzb < this.f39782zza;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f39783zzb > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f39783zzb;
        this.f39783zzb = i + 1;
        return zza(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f39783zzb;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f39783zzb - 1;
        this.f39783zzb = i;
        return zza(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f39783zzb - 1;
    }

    public abstract Object zza(int i);
}
