package com.google.android.gms.internal.fido;

import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
abstract class zzce extends zzcf {
    @Override // com.google.android.gms.internal.fido.zzby, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj2) {
        if (obj2 instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj2;
            Object obj3 = zzf().get(entry.getKey());
            if (obj3 != null && obj3.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.fido.zzcf, java.util.Collection, java.util.Set
    public final int hashCode() {
        return zzcy.zza(zzf().entrySet());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return zzf().size();
    }

    public abstract zzcd zzf();

    @Override // com.google.android.gms.internal.fido.zzcf
    public final boolean zzg() {
        return false;
    }
}
