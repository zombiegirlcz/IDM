package com.google.android.gms.internal.auth;

import java.util.Iterator;

/* JADX INFO: loaded from: classes16.dex */
final class zzhd implements Iterator {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final Iterator f39125zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzhe f39126zzb;

    public zzhd(zzhe zzheVar) {
        this.f39126zzb = zzheVar;
        this.f39125zza = zzheVar.f39127zza.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f39125zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f39125zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
