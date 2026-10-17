package com.google.android.gms.measurement.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes16.dex */
final class zzbe implements Iterator {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final Iterator f46948zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzbf f46949zzb;

    public zzbe(zzbf zzbfVar) {
        this.f46949zzb = zzbfVar;
        this.f46948zza = zzbfVar.f46950zza.keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f46948zza.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final String next() {
        return (String) this.f46948zza.next();
    }
}
