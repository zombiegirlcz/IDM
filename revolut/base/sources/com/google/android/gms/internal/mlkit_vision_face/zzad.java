package com.google.android.gms.internal.mlkit_vision_face;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
abstract class zzad extends zzcm {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final int f43451zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private int f43452zzb;

    public zzad(int i, int i2) {
        zzab.zzb(i2, i, "index");
        this.f43451zza = i;
        this.f43452zzb = i2;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f43452zzb < this.f43451zza;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f43452zzb > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f43452zzb;
        this.f43452zzb = i + 1;
        return zza(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f43452zzb;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f43452zzb - 1;
        this.f43452zzb = i;
        return zza(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f43452zzb - 1;
    }

    public abstract Object zza(int i);
}
