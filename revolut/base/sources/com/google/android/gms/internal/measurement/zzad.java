package com.google.android.gms.internal.measurement;

import a0.d;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes16.dex */
final class zzad implements Iterator {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzae f39818zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private int f39819zzb = 0;

    public zzad(zzae zzaeVar) {
        this.f39818zza = zzaeVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f39819zzb < this.f39818zza.zzc();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        zzae zzaeVar = this.f39818zza;
        if (this.f39819zzb >= zzaeVar.zzc()) {
            throw new NoSuchElementException(d.n("Out of bounds index: ", this.f39819zzb));
        }
        int i = this.f39819zzb;
        this.f39819zzb = i + 1;
        return zzaeVar.zze(i);
    }
}
