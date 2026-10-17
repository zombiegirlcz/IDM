package com.google.android.gms.internal.nearby;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes16.dex */
final class zzud extends zzui {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    boolean f45740zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ Object f45741zzb;

    public zzud(Object obj2) {
        this.f45741zzb = obj2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f45740zza;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f45740zza) {
            throw new NoSuchElementException();
        }
        this.f45740zza = true;
        return this.f45741zzb;
    }
}
