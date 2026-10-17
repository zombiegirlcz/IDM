package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
abstract class zzbg extends zzdy {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final int f41254zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private int f41255zzb;

    public zzbg(int i, int i2) {
        zzbc.zzb(i2, i, "index");
        this.f41254zza = i;
        this.f41255zzb = i2;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f41255zzb < this.f41254zza;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f41255zzb > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f41255zzb;
        this.f41255zzb = i + 1;
        return zza(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f41255zzb;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f41255zzb - 1;
        this.f41255zzb = i;
        return zza(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f41255zzb - 1;
    }

    public abstract Object zza(int i);
}
