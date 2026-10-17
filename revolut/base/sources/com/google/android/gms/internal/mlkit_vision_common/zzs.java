package com.google.android.gms.internal.mlkit_vision_common;

import java.util.Set;

/* JADX INFO: loaded from: classes16.dex */
public abstract class zzs extends zzl implements Set {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private transient zzp f43431zza;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj2) {
        if (obj2 == this || obj2 == this) {
            return true;
        }
        if (obj2 instanceof Set) {
            Set set = (Set) obj2;
            try {
                if (size() == set.size()) {
                    return containsAll(set);
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return zzaa.zza(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: zzd */
    public abstract zzab iterator();

    public final zzp zzf() {
        zzp zzpVar = this.f43431zza;
        if (zzpVar != null) {
            return zzpVar;
        }
        zzp zzpVarZzg = zzg();
        this.f43431zza = zzpVarZzg;
        return zzpVarZzg;
    }

    public zzp zzg() {
        return zzp.zzg(toArray());
    }
}
