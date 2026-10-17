package com.google.android.gms.internal.mlkit_vision_face;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
final class zzbc extends AbstractCollection {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzbd f43489zza;

    public zzbc(zzbd zzbdVar) {
        this.f43489zza = zzbdVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f43489zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzbd zzbdVar = this.f43489zza;
        Map mapZzl = zzbdVar.zzl();
        return mapZzl != null ? mapZzl.values().iterator() : new zzax(zzbdVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f43489zza.size();
    }
}
