package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
final class zzbk implements Iterator {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final Iterator f41257zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    Collection f41258zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ zzbl f41259zzc;

    public zzbk(zzbl zzblVar) {
        this.f41259zzc = zzblVar;
        this.f41257zza = zzblVar.f41260zza.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f41257zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f41257zza.next();
        this.f41258zzb = (Collection) entry.getValue();
        zzbl zzblVar = this.f41259zzc;
        Object key = entry.getKey();
        return new zzcr(key, zzblVar.f41261zzb.zzd(key, (Collection) entry.getValue()));
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzbc.zze(this.f41258zzb != null, "no calls to next() since the last call to remove()");
        this.f41257zza.remove();
        this.f41259zzc.f41261zzb.f41282zzb -= this.f41258zzb.size();
        this.f41258zzb.clear();
        this.f41258zzb = null;
    }
}
