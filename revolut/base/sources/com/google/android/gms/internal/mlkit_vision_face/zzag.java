package com.google.android.gms.internal.mlkit_vision_face;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
final class zzag implements Iterator {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final Iterator f43454zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    Collection f43455zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ zzah f43456zzc;

    public zzag(zzah zzahVar) {
        this.f43456zzc = zzahVar;
        this.f43454zza = zzahVar.f43457zza.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f43454zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f43454zza.next();
        this.f43455zzb = (Collection) entry.getValue();
        zzah zzahVar = this.f43456zzc;
        Object key = entry.getKey();
        return new zzbj(key, zzahVar.f43458zzb.zzb(key, (Collection) entry.getValue()));
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzab.zzd(this.f43455zzb != null, "no calls to next() since the last call to remove()");
        this.f43454zza.remove();
        zzap.zzg(this.f43456zzc.f43458zzb, this.f43455zzb.size());
        this.f43455zzb.clear();
        this.f43455zzb = null;
    }
}
