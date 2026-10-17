package com.google.android.gms.internal.fido;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes16.dex */
final class zzbw extends zzcs implements Serializable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final Comparator f39315zza;

    public zzbw(Comparator comparator) {
        comparator.getClass();
        this.f39315zza = comparator;
    }

    @Override // com.google.android.gms.internal.fido.zzcs, java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return this.f39315zza.compare(obj2, obj3);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof zzbw) {
            return this.f39315zza.equals(((zzbw) obj2).f39315zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.f39315zza.hashCode();
    }

    public final String toString() {
        return this.f39315zza.toString();
    }
}
