package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes16.dex */
abstract class zzz extends zzcp {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final int f45061zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private int f45062zzb;

    public zzz(int i, int i2) {
        zzx.zzb(i2, i, "index");
        this.f45061zza = i;
        this.f45062zzb = i2;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f45062zzb < this.f45061zza;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f45062zzb > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f45062zzb;
        this.f45062zzb = i + 1;
        return zza(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f45062zzb;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f45062zzb - 1;
        this.f45062zzb = i;
        return zza(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f45062zzb - 1;
    }

    public abstract Object zza(int i);
}
