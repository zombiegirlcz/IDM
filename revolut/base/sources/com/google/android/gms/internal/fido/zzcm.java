package com.google.android.gms.internal.fido;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes16.dex */
final class zzcm extends zzdc {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final Object f39338zza = new Object();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private Object f39339zzb;

    public zzcm(Object obj2) {
        this.f39339zzb = obj2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f39339zzb != f39338zza;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj2 = this.f39339zzb;
        Object obj3 = f39338zza;
        if (obj2 == obj3) {
            throw new NoSuchElementException();
        }
        this.f39339zzb = obj3;
        return obj2;
    }
}
