package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
final class zzcf extends AbstractSet {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzcl f41291zza;

    public zzcf(zzcl zzclVar) {
        this.f41291zza = zzclVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f41291zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj2) {
        Map mapZzj = this.f41291zza.zzj();
        if (mapZzj != null) {
            return mapZzj.entrySet().contains(obj2);
        }
        if (obj2 instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj2;
            int iZzq = this.f41291zza.zzq(entry.getKey());
            if (iZzq != -1) {
                Object[] objArr = this.f41291zza.f41304zzc;
                objArr.getClass();
                if (zzay.zza(objArr[iZzq], entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzcl zzclVar = this.f41291zza;
        Map mapZzj = zzclVar.zzj();
        return mapZzj != null ? mapZzj.entrySet().iterator() : new zzcd(zzclVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj2) {
        Map mapZzj = this.f41291zza.zzj();
        if (mapZzj != null) {
            return mapZzj.entrySet().remove(obj2);
        }
        if (!(obj2 instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj2;
        zzcl zzclVar = this.f41291zza;
        if (zzclVar.zzo()) {
            return false;
        }
        int iZzp = zzclVar.zzp();
        Object key = entry.getKey();
        Object value = entry.getValue();
        Object objZzh = zzcl.zzh(this.f41291zza);
        zzcl zzclVar2 = this.f41291zza;
        int[] iArr = zzclVar2.f41302zza;
        iArr.getClass();
        Object[] objArr = zzclVar2.f41303zzb;
        objArr.getClass();
        Object[] objArr2 = zzclVar2.f41304zzc;
        objArr2.getClass();
        int iZzb = zzcm.zzb(key, value, iZzp, objZzh, iArr, objArr, objArr2);
        if (iZzb == -1) {
            return false;
        }
        this.f41291zza.zzn(iZzb, iZzp);
        zzcl zzclVar3 = this.f41291zza;
        zzclVar3.f41307zzg--;
        this.f41291zza.zzl();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f41291zza.size();
    }
}
