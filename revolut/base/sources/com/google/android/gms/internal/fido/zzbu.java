package com.google.android.gms.internal.fido;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes16.dex */
abstract class zzbu extends zzdd {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final int f39313zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private int f39314zzb;

    public zzbu(int i, int i2) {
        zzbm.zzb(i2, i, "index");
        this.f39313zza = i;
        this.f39314zzb = i2;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f39314zzb < this.f39313zza;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f39314zzb > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f39314zzb;
        this.f39314zzb = i + 1;
        return zza(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f39314zzb;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f39314zzb - 1;
        this.f39314zzb = i;
        return zza(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f39314zzb - 1;
    }

    public abstract Object zza(int i);
}
