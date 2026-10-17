package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
final class zzau extends AbstractSet {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzba f44455zza;

    public zzau(zzba zzbaVar) {
        this.f44455zza = zzbaVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f44455zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj2) {
        Map mapZzl = this.f44455zza.zzl();
        if (mapZzl != null) {
            return mapZzl.entrySet().contains(obj2);
        }
        if (obj2 instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj2;
            int iZzw = this.f44455zza.zzw(entry.getKey());
            if (iZzw != -1 && zzw.zza(zzba.zzj(this.f44455zza, iZzw), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzba zzbaVar = this.f44455zza;
        Map mapZzl = zzbaVar.zzl();
        return mapZzl != null ? mapZzl.entrySet().iterator() : new zzas(zzbaVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj2) {
        Map mapZzl = this.f44455zza.zzl();
        if (mapZzl != null) {
            return mapZzl.entrySet().remove(obj2);
        }
        if (!(obj2 instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj2;
        zzba zzbaVar = this.f44455zza;
        if (zzbaVar.zzr()) {
            return false;
        }
        int iZzv = zzbaVar.zzv();
        Object key = entry.getKey();
        Object value = entry.getValue();
        zzba zzbaVar2 = this.f44455zza;
        int iZzb = zzbb.zzb(key, value, iZzv, zzba.zzi(zzbaVar2), zzbaVar2.zzA(), zzbaVar2.zzB(), zzbaVar2.zzC());
        if (iZzb == -1) {
            return false;
        }
        this.f44455zza.zzq(iZzb, iZzv);
        zzba zzbaVar3 = this.f44455zza;
        zzbaVar3.f44471zzg--;
        this.f44455zza.zzo();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f44455zza.size();
    }
}
