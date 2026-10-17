package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
abstract class zzbm implements Iterator {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final Iterator f41262zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    Object f41263zzb = null;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    Collection f41264zzc = null;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    Iterator f41265zzd = zzcz.INSTANCE;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    final /* synthetic */ zzbu f41266zze;

    public zzbm(zzbu zzbuVar) {
        this.f41266zze = zzbuVar;
        this.f41262zza = zzbuVar.f41281zza.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f41262zza.hasNext() || this.f41265zzd.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f41265zzd.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f41262zza.next();
            this.f41263zzb = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f41264zzc = collection;
            this.f41265zzd = collection.iterator();
        }
        return zza(this.f41263zzb, this.f41265zzd.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f41265zzd.remove();
        Collection collection = this.f41264zzc;
        collection.getClass();
        if (collection.isEmpty()) {
            this.f41262zza.remove();
        }
        zzbu zzbuVar = this.f41266zze;
        zzbuVar.f41282zzb--;
    }

    public abstract Object zza(Object obj2, Object obj3);
}
