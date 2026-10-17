package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes16.dex */
final class zzas implements Iterator {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzat f39844zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private int f39845zzb = 0;

    public zzas(zzat zzatVar) {
        this.f39844zza = zzatVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f39845zzb < this.f39844zza.f39846zza.length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        zzat zzatVar = this.f39844zza;
        int i = this.f39845zzb;
        if (i >= zzatVar.f39846zza.length()) {
            throw new NoSuchElementException();
        }
        String str = zzatVar.f39846zza;
        this.f39845zzb = i + 1;
        return new zzat(String.valueOf(str.charAt(i)));
    }
}
