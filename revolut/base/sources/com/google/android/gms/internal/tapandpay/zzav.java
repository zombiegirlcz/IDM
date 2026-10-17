package com.google.android.gms.internal.tapandpay;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes16.dex */
final class zzav extends zzba {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    boolean f46316zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ Object f46317zzb;

    public zzav(Object obj2) {
        this.f46317zzb = obj2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f46316zza;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f46316zza) {
            throw new NoSuchElementException();
        }
        this.f46316zza = true;
        return this.f46317zzb;
    }
}
