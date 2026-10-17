package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class zzac implements Iterator {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final Iterator f44429zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    Collection f44430zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ zzad f44431zzc;

    public zzac(zzad zzadVar) {
        this.f44431zzc = zzadVar;
        this.f44429zza = zzadVar.f44432zza.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f44429zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f44429zza.next();
        this.f44430zzb = (Collection) entry.getValue();
        Object key = entry.getKey();
        return new zzbg(key, this.f44431zzc.f44433zzb.zzb(key, (Collection) entry.getValue()));
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzx.zzd(this.f44430zzb != null, "no calls to next() since the last call to remove()");
        this.f44429zza.remove();
        this.f44431zzc.f44433zzb.f44449zzb -= this.f44430zzb.size();
        this.f44430zzb.clear();
        this.f44430zzb = null;
    }
}
