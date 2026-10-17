package com.google.android.gms.internal.nearby;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes16.dex */
abstract class zztt extends zzuj {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final int f45725zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private int f45726zzb;

    public zztt(int i, int i2) {
        zztq.zzb(i2, i, "index");
        this.f45725zza = i;
        this.f45726zzb = i2;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f45726zzb < this.f45725zza;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f45726zzb > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f45726zzb;
        this.f45726zzb = i + 1;
        return zza(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f45726zzb;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f45726zzb - 1;
        this.f45726zzb = i;
        return zza(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f45726zzb - 1;
    }

    public abstract Object zza(int i);
}
