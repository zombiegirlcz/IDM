package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes16.dex */
abstract class zzca extends AbstractMap {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private transient Set f44499zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private transient Set f44500zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private transient Collection f44501zzc;

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f44499zza;
        if (set != null) {
            return set;
        }
        Set setZza = zza();
        this.f44499zza = setZza;
        return setZza;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set set = this.f44500zzb;
        if (set != null) {
            return set;
        }
        zzby zzbyVar = new zzby(this);
        this.f44500zzb = zzbyVar;
        return zzbyVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f44501zzc;
        if (collection != null) {
            return collection;
        }
        zzbz zzbzVar = new zzbz(this);
        this.f44501zzc = zzbzVar;
        return zzbzVar;
    }

    public abstract Set zza();
}
