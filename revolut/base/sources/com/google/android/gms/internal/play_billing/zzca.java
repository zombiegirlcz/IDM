package com.google.android.gms.internal.play_billing;

import java.util.Set;

/* JADX INFO: loaded from: classes16.dex */
public abstract class zzca extends zzbt implements Set {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private transient zzbw f45865zza;

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

    @Override // com.google.android.gms.internal.play_billing.zzbt
    public zzbw zzd() {
        zzbw zzbwVar = this.f45865zza;
        if (zzbwVar != null) {
            return zzbwVar;
        }
        zzbw zzbwVarZzh = zzh();
        this.f45865zza = zzbwVarZzh;
        return zzbwVarZzh;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbt, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: zze */
    public abstract zzck iterator();

    public zzbw zzh() {
        Object[] array = toArray();
        int i = zzbw.f45854zzd;
        return zzbw.zzi(array, array.length);
    }
}
