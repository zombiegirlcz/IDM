package com.google.android.gms.internal.mlkit_vision_face;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes16.dex */
abstract class zzar implements zzca {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private transient Set f43475zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private transient Map f43476zzb;

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof zzca) {
            return zzp().equals(((zzca) obj2).zzp());
        }
        return false;
    }

    public final int hashCode() {
        return zzp().hashCode();
    }

    public final String toString() {
        return ((zzah) zzp()).f43457zza.toString();
    }

    public abstract Map zzk();

    public abstract Set zzl();

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzca
    public boolean zzo(Object obj2, Object obj3) {
        throw null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzca
    public final Map zzp() {
        Map map = this.f43476zzb;
        if (map != null) {
            return map;
        }
        Map mapZzk = zzk();
        this.f43476zzb = mapZzk;
        return mapZzk;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzca
    public final Set zzq() {
        Set set = this.f43475zza;
        if (set != null) {
            return set;
        }
        Set setZzl = zzl();
        this.f43475zza = setZzl;
        return setZzl;
    }
}
