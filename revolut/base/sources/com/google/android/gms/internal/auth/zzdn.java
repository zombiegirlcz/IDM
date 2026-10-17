package com.google.android.gms.internal.auth;

import java.io.Serializable;
import java.util.Arrays;
import p.a;

/* JADX INFO: loaded from: classes16.dex */
final class zzdn implements Serializable, zzdj {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final Object f38993zza;

    public zzdn(Object obj2) {
        this.f38993zza = obj2;
    }

    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof zzdn)) {
            return false;
        }
        Object obj3 = this.f38993zza;
        Object obj4 = ((zzdn) obj2).f38993zza;
        return obj3 == obj4 || obj3.equals(obj4);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f38993zza});
    }

    public final String toString() {
        return a.p("Suppliers.ofInstance(", this.f38993zza.toString(), ")");
    }

    @Override // com.google.android.gms.internal.auth.zzdj
    public final Object zza() {
        return this.f38993zza;
    }
}
