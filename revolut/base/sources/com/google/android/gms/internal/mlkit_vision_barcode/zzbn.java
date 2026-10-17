package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
final class zzbn implements Iterator {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    Map.Entry f41267zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ Iterator f41268zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ zzbo f41269zzc;

    public zzbn(zzbo zzboVar, Iterator it8) {
        this.f41269zzc = zzboVar;
        this.f41268zzb = it8;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f41268zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f41268zzb.next();
        this.f41267zza = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzbc.zze(this.f41267zza != null, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.f41267zza.getValue();
        this.f41268zzb.remove();
        this.f41269zzc.f41270zza.f41282zzb -= collection.size();
        collection.clear();
        this.f41267zza = null;
    }
}
