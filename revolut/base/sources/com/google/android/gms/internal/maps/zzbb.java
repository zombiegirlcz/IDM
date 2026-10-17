package com.google.android.gms.internal.maps;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes16.dex */
final class zzbb extends zzbf {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    boolean f39792zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ Object f39793zzb;

    public zzbb(Object obj2) {
        this.f39793zzb = obj2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f39792zza;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f39792zza) {
            throw new NoSuchElementException();
        }
        this.f39792zza = true;
        return this.f39793zzb;
    }
}
