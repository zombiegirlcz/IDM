package com.google.android.gms.internal.mlkit_common;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzaj extends zzab implements Set {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private transient zzaf f40724zza;

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
        return zzar.zza(this);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzab, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: zzd */
    public abstract zzas iterator();

    public final zzaf zzf() {
        zzaf zzafVar = this.f40724zza;
        if (zzafVar != null) {
            return zzafVar;
        }
        zzaf zzafVarZzg = zzg();
        this.f40724zza = zzafVarZzg;
        return zzafVarZzg;
    }

    public zzaf zzg() {
        Object[] array = toArray();
        int i = zzaf.f40714zzd;
        return zzaf.zzg(array, array.length);
    }
}
