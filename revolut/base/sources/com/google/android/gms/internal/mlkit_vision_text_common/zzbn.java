package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzbn extends zzbf implements Set {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private transient zzbk f44490zza;

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
        return zzcl.zza(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbf, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: zzd */
    public abstract zzco iterator();

    public final zzbk zzf() {
        zzbk zzbkVar = this.f44490zza;
        if (zzbkVar != null) {
            return zzbkVar;
        }
        zzbk zzbkVarZzg = zzg();
        this.f44490zza = zzbkVarZzg;
        return zzbkVarZzg;
    }

    public zzbk zzg() {
        Object[] array = toArray();
        int i = zzbk.f44486zzd;
        return zzbk.zzg(array, array.length);
    }
}
