package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
final class zzae implements Iterator {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    Map.Entry f44434zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ Iterator f44435zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ zzaf f44436zzc;

    public zzae(zzaf zzafVar, Iterator it8) {
        this.f44435zzb = it8;
        this.f44436zzc = zzafVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f44435zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f44435zzb.next();
        this.f44434zza = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzx.zzd(this.f44434zza != null, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.f44434zza.getValue();
        this.f44435zzb.remove();
        this.f44436zzc.f44437zza.f44449zzb -= collection.size();
        collection.clear();
        this.f44434zza = null;
    }
}
