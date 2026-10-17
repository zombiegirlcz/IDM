package com.google.android.gms.internal.mlkit_vision_face;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
final class zzay extends AbstractSet {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzbd f43480zza;

    public zzay(zzbd zzbdVar) {
        this.f43480zza = zzbdVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f43480zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj2) {
        Map mapZzl = this.f43480zza.zzl();
        if (mapZzl != null) {
            return mapZzl.entrySet().contains(obj2);
        }
        if (obj2 instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj2;
            int iZzv = this.f43480zza.zzv(entry.getKey());
            if (iZzv != -1 && zzx.zza(zzbd.zzj(this.f43480zza, iZzv), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzbd zzbdVar = this.f43480zza;
        Map mapZzl = zzbdVar.zzl();
        return mapZzl != null ? mapZzl.entrySet().iterator() : new zzaw(zzbdVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj2) {
        int iZzu;
        int iZzb;
        Map mapZzl = this.f43480zza.zzl();
        if (mapZzl != null) {
            return mapZzl.entrySet().remove(obj2);
        }
        if (!(obj2 instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj2;
        zzbd zzbdVar = this.f43480zza;
        if (zzbdVar.zzq() || (iZzb = zzbe.zzb(entry.getKey(), entry.getValue(), (iZzu = zzbdVar.zzu()), zzbd.zzk(this.f43480zza), this.f43480zza.zzz(), this.f43480zza.zzA(), this.f43480zza.zzB())) == -1) {
            return false;
        }
        this.f43480zza.zzp(iZzb, iZzu);
        zzbd.zzb(this.f43480zza);
        this.f43480zza.zzn();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f43480zza.size();
    }
}
