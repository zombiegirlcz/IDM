package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
class zzah implements Iterator {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final Iterator f44438zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final Collection f44439zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ zzai f44440zzc;

    public zzah(zzai zzaiVar, Iterator it8) {
        this.f44440zzc = zzaiVar;
        this.f44439zzb = zzaiVar.f44442zzb;
        this.f44438zza = it8;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zza();
        return this.f44438zza.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        zza();
        return this.f44438zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f44438zza.remove();
        zzal zzalVar = this.f44440zzc.f44445zze;
        zzalVar.f44449zzb--;
        this.f44440zzc.zzc();
    }

    public final void zza() {
        this.f44440zzc.zzb();
        if (this.f44440zzc.f44442zzb != this.f44439zzb) {
            throw new ConcurrentModificationException();
        }
    }

    public zzah(zzai zzaiVar) {
        this.f44440zzc = zzaiVar;
        Collection collection = zzaiVar.f44442zzb;
        this.f44439zzb = collection;
        this.f44438zza = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }
}
