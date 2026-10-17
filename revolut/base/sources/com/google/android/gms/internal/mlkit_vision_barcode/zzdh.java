package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes16.dex */
abstract class zzdh extends AbstractMap {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private transient Set f41331zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private transient Set f41332zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private transient Collection f41333zzc;

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f41331zza;
        if (set != null) {
            return set;
        }
        Set setZzb = zzb();
        this.f41331zza = setZzb;
        return setZzb;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set set = this.f41332zzb;
        if (set != null) {
            return set;
        }
        zzdf zzdfVar = new zzdf(this);
        this.f41332zzb = zzdfVar;
        return zzdfVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f41333zzc;
        if (collection != null) {
            return collection;
        }
        zzdg zzdgVar = new zzdg(this);
        this.f41333zzc = zzdgVar;
        return zzdgVar;
    }

    public abstract Set zzb();
}
