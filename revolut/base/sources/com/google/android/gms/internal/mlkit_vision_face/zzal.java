package com.google.android.gms.internal.mlkit_vision_face;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
class zzal implements Iterator {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final Iterator f43463zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final Collection f43464zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ zzam f43465zzc;

    public zzal(zzam zzamVar, Iterator it8) {
        this.f43465zzc = zzamVar;
        this.f43464zzb = zzamVar.f43467zzb;
        this.f43463zza = it8;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zza();
        return this.f43463zza.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        zza();
        return this.f43463zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f43463zza.remove();
        zzap.zze(this.f43465zzc.f43470zze);
        this.f43465zzc.zzc();
    }

    public final void zza() {
        this.f43465zzc.zzb();
        if (this.f43465zzc.f43467zzb != this.f43464zzb) {
            throw new ConcurrentModificationException();
        }
    }

    public zzal(zzam zzamVar) {
        this.f43465zzc = zzamVar;
        Collection collection = zzamVar.f43467zzb;
        this.f43464zzb = collection;
        this.f43463zza = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }
}
