package com.google.android.gms.internal.mlkit_vision_face;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes16.dex */
final class zzaf extends zzbv {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzah f43453zza;

    public zzaf(zzah zzahVar) {
        this.f43453zza = zzahVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbv, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj2) {
        Set setEntrySet = this.f43453zza.f43457zza.entrySet();
        setEntrySet.getClass();
        try {
            return setEntrySet.contains(obj2);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzag(this.f43453zza);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbv, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj2) {
        if (!contains(obj2)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj2;
        entry.getClass();
        zzap.zzm(this.f43453zza.f43458zzb, entry.getKey());
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbv
    public final Map zza() {
        return this.f43453zza;
    }
}
