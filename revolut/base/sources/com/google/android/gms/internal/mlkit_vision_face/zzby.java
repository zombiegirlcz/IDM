package com.google.android.gms.internal.mlkit_vision_face;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes16.dex */
abstract class zzby extends AbstractMap {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private transient Set f43517zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private transient Set f43518zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private transient Collection f43519zzc;

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f43517zza;
        if (set != null) {
            return set;
        }
        Set setZza = zza();
        this.f43517zza = setZza;
        return setZza;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set set = this.f43518zzb;
        if (set != null) {
            return set;
        }
        zzbw zzbwVar = new zzbw(this);
        this.f43518zzb = zzbwVar;
        return zzbwVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f43519zzc;
        if (collection != null) {
            return collection;
        }
        zzbx zzbxVar = new zzbx(this);
        this.f43519zzc = zzbxVar;
        return zzbxVar;
    }

    public abstract Set zza();
}
