package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes16.dex */
abstract class zzan implements zzcc {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private transient Set f44450zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private transient Map f44451zzb;

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof zzcc) {
            return zzn().equals(((zzcc) obj2).zzn());
        }
        return false;
    }

    public final int hashCode() {
        return zzn().hashCode();
    }

    public final String toString() {
        return zzn().toString();
    }

    public abstract Map zzh();

    public abstract Set zzi();

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzcc
    public boolean zzm(Object obj2, Object obj3) {
        throw null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzcc
    public final Map zzn() {
        Map map = this.f44451zzb;
        if (map != null) {
            return map;
        }
        Map mapZzh = zzh();
        this.f44451zzb = mapZzh;
        return mapZzh;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzcc
    public final Set zzo() {
        Set set = this.f44450zza;
        if (set != null) {
            return set;
        }
        Set setZzi = zzi();
        this.f44450zza = setZzi;
        return setZzi;
    }
}
