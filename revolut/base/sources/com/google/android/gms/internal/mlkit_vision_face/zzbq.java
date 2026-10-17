package com.google.android.gms.internal.mlkit_vision_face;

import java.util.Set;

/* JADX INFO: loaded from: classes16.dex */
public abstract class zzbq extends zzbi implements Set {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private transient zzbn f43514zza;

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
        return zzcj.zza(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: zzd */
    public abstract zzcl iterator();

    public final zzbn zzf() {
        zzbn zzbnVar = this.f43514zza;
        if (zzbnVar != null) {
            return zzbnVar;
        }
        zzbn zzbnVarZzg = zzg();
        this.f43514zza = zzbnVarZzg;
        return zzbnVarZzg;
    }

    public zzbn zzg() {
        return zzbn.zzg(toArray());
    }
}
