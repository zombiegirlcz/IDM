package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes16.dex */
abstract class zzbq extends zzcl {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final int f45846zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private int f45847zzb;

    public zzbq(int i, int i2) {
        zzbj.zzb(i2, i, "index");
        this.f45846zza = i;
        this.f45847zzb = i2;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f45847zzb < this.f45846zza;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f45847zzb > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f45847zzb;
        this.f45847zzb = i + 1;
        return zza(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f45847zzb;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f45847zzb - 1;
        this.f45847zzb = i;
        return zza(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f45847zzb - 1;
    }

    public abstract Object zza(int i);
}
