package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
final class zzci extends AbstractSet {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzcl f41296zza;

    public zzci(zzcl zzclVar) {
        this.f41296zza = zzclVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f41296zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj2) {
        return this.f41296zza.containsKey(obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzcl zzclVar = this.f41296zza;
        Map mapZzj = zzclVar.zzj();
        return mapZzj != null ? mapZzj.keySet().iterator() : new zzcc(zzclVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj2) {
        Map mapZzj = this.f41296zza.zzj();
        return mapZzj != null ? mapZzj.keySet().remove(obj2) : this.f41296zza.zzs(obj2) != zzcl.f41301zzd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f41296zza.size();
    }
}
