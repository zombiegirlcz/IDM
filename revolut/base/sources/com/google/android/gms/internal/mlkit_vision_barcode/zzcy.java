package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Set;

/* JADX INFO: loaded from: classes16.dex */
public abstract class zzcy extends zzcq implements Set {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private transient zzcv f41326zza;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        return zzdv.zzb(this, obj2);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return zzdv.zza(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: zzd */
    public abstract zzdx iterator();

    public final zzcv zzf() {
        zzcv zzcvVar = this.f41326zza;
        if (zzcvVar != null) {
            return zzcvVar;
        }
        zzcv zzcvVarZzg = zzg();
        this.f41326zza = zzcvVarZzg;
        return zzcvVarZzg;
    }

    public zzcv zzg() {
        Object[] array = toArray();
        int i = zzcv.f41322zzd;
        return zzcv.zzg(array, array.length);
    }
}
