package com.google.android.gms.internal.tapandpay;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes16.dex */
abstract class zzao extends zzbb {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final int f46306zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private int f46307zzb;

    public zzao(int i, int i2) {
        zzam.zzb(i2, i, "index");
        this.f46306zza = i;
        this.f46307zzb = i2;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f46307zzb < this.f46306zza;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f46307zzb > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f46307zzb;
        this.f46307zzb = i + 1;
        return zza(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f46307zzb;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f46307zzb - 1;
        this.f46307zzb = i;
        return zza(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f46307zzb - 1;
    }

    public abstract Object zza(int i);
}
