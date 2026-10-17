package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes16.dex */
final class zzac implements Iterator {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ Iterator f39816zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ Iterator f39817zzb;

    public zzac(zzae zzaeVar, Iterator it8, Iterator it9) {
        this.f39816zza = it8;
        this.f39817zzb = it9;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f39816zza.hasNext()) {
            return true;
        }
        return this.f39817zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Iterator it8 = this.f39816zza;
        if (it8.hasNext()) {
            return new zzat(((Integer) it8.next()).toString());
        }
        Iterator it9 = this.f39817zzb;
        if (it9.hasNext()) {
            return new zzat((String) it9.next());
        }
        throw new NoSuchElementException();
    }
}
