package com.google.android.gms.internal.fido;

import java.io.Serializable;

/* JADX INFO: loaded from: classes16.dex */
final class zzcx extends zzcs implements Serializable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final zzcs f39354zza;

    public zzcx(zzcs zzcsVar) {
        this.f39354zza = zzcsVar;
    }

    @Override // com.google.android.gms.internal.fido.zzcs, java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return this.f39354zza.compare(obj3, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof zzcx) {
            return this.f39354zza.equals(((zzcx) obj2).f39354zza);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f39354zza.hashCode();
    }

    public final String toString() {
        return this.f39354zza.toString().concat(".reverse()");
    }

    @Override // com.google.android.gms.internal.fido.zzcs
    public final zzcs zza() {
        return this.f39354zza;
    }
}
