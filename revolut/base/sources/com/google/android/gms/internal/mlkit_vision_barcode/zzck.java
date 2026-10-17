package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
final class zzck extends AbstractCollection {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzcl f41300zza;

    public zzck(zzcl zzclVar) {
        this.f41300zza = zzclVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f41300zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzcl zzclVar = this.f41300zza;
        Map mapZzj = zzclVar.zzj();
        return mapZzj != null ? mapZzj.values().iterator() : new zzce(zzclVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f41300zza.size();
    }
}
