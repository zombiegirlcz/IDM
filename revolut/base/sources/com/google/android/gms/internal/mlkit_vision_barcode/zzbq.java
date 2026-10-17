package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
class zzbq implements Iterator {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final Iterator f41271zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final Collection f41272zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ zzbr f41273zzc;

    public zzbq(zzbr zzbrVar, Iterator it8) {
        this.f41273zzc = zzbrVar;
        this.f41272zzb = zzbrVar.f41275zzb;
        this.f41271zza = it8;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zza();
        return this.f41271zza.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        zza();
        return this.f41271zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f41271zza.remove();
        zzbu zzbuVar = this.f41273zzc.f41278zze;
        zzbuVar.f41282zzb--;
        this.f41273zzc.zzc();
    }

    public final void zza() {
        this.f41273zzc.zzb();
        if (this.f41273zzc.f41275zzb != this.f41272zzb) {
            throw new ConcurrentModificationException();
        }
    }

    public zzbq(zzbr zzbrVar) {
        this.f41273zzc = zzbrVar;
        Collection collection = zzbrVar.f41275zzb;
        this.f41272zzb = collection;
        this.f41271zza = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }
}
