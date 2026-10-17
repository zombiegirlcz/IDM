package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes16.dex */
abstract class zzby implements zzdj {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private transient Collection f41284zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private transient Set f41285zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private transient Map f41286zzc;

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof zzdj) {
            return zzv().equals(((zzdj) obj2).zzv());
        }
        return false;
    }

    public final int hashCode() {
        return zzv().hashCode();
    }

    public final String toString() {
        return zzv().toString();
    }

    public abstract Collection zzi();

    public abstract Iterator zzl();

    public abstract Map zzo();

    public abstract Set zzp();

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdj
    public boolean zzt(Object obj2, Object obj3) {
        throw null;
    }

    public final Collection zzu() {
        Collection collection = this.f41284zza;
        if (collection != null) {
            return collection;
        }
        Collection collectionZzi = zzi();
        this.f41284zza = collectionZzi;
        return collectionZzi;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdj
    public final Map zzv() {
        Map map = this.f41286zzc;
        if (map != null) {
            return map;
        }
        Map mapZzo = zzo();
        this.f41286zzc = mapZzo;
        return mapZzo;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdj
    public final Set zzw() {
        Set set = this.f41285zzb;
        if (set != null) {
            return set;
        }
        Set setZzp = zzp();
        this.f41285zzb = setZzp;
        return setZzp;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdj
    public final boolean zzx(Object obj2, Object obj3) {
        Collection collection = ((zzbl) zzv()).get(obj2);
        return collection != null && collection.contains(obj3);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdj
    public final boolean zzy(Object obj2, Object obj3) {
        Collection collection = ((zzbl) zzv()).get(obj2);
        return collection != null && collection.remove(obj3);
    }
}
