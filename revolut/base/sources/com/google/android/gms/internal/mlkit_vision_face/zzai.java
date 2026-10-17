package com.google.android.gms.internal.mlkit_vision_face;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
final class zzai implements Iterator {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    Map.Entry f43459zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ Iterator f43460zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ zzaj f43461zzc;

    public zzai(zzaj zzajVar, Iterator it8) {
        this.f43461zzc = zzajVar;
        this.f43460zzb = it8;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f43460zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f43460zzb.next();
        this.f43459zza = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzab.zzd(this.f43459zza != null, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.f43459zza.getValue();
        this.f43460zzb.remove();
        zzap.zzg(this.f43461zzc.f43462zza, collection.size());
        collection.clear();
        this.f43459zza = null;
    }
}
