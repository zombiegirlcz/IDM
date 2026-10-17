package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
final class zzaz extends AbstractCollection {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzba f44464zza;

    public zzaz(zzba zzbaVar) {
        this.f44464zza = zzbaVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f44464zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzba zzbaVar = this.f44464zza;
        Map mapZzl = zzbaVar.zzl();
        return mapZzl != null ? mapZzl.values().iterator() : new zzat(zzbaVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f44464zza.size();
    }
}
