package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes16.dex */
final class zzar implements Iterator {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzat f39842zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private int f39843zzb = 0;

    public zzar(zzat zzatVar) {
        this.f39842zza = zzatVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f39843zzb < this.f39842zza.f39846zza.length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        zzat zzatVar = this.f39842zza;
        int i = this.f39843zzb;
        if (i >= zzatVar.f39846zza.length()) {
            throw new NoSuchElementException();
        }
        this.f39843zzb = i + 1;
        return new zzat(String.valueOf(i));
    }
}
