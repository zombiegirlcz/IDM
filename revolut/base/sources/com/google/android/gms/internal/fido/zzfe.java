package com.google.android.gms.internal.fido;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes16.dex */
final class zzfe implements Iterator {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzff f39435zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private int f39436zzb = 0;

    public zzfe(zzff zzffVar) {
        this.f39435zza = zzffVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f39436zzb;
        zzff zzffVar = this.f39435zza;
        return i < zzffVar.zza() - zzffVar.zzb();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f39436zzb;
        zzff zzffVar = this.f39435zza;
        if (i >= zzffVar.zza() - zzffVar.zzb()) {
            throw new NoSuchElementException();
        }
        zzff zzffVar2 = this.f39435zza;
        Object obj2 = zzffVar2.f39438zzb.f39440zzb[zzffVar2.zzb() + i];
        this.f39436zzb = i + 1;
        return obj2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
