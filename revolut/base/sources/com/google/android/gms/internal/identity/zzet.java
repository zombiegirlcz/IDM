package com.google.android.gms.internal.identity;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes16.dex */
abstract class zzet extends zzfa {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final int f39756zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private int f39757zzb;

    public zzet(int i, int i2) {
        zzer.zzd(i2, i, "index");
        this.f39756zza = i;
        this.f39757zzb = i2;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f39757zzb < this.f39756zza;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f39757zzb > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f39757zzb;
        this.f39757zzb = i + 1;
        return zza(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f39757zzb;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f39757zzb - 1;
        this.f39757zzb = i;
        return zza(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f39757zzb - 1;
    }

    public abstract Object zza(int i);
}
