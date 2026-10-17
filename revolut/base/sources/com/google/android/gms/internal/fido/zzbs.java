package com.google.android.gms.internal.fido;

import java.io.Serializable;
import java.util.Arrays;
import p.a;

/* JADX INFO: loaded from: classes16.dex */
final class zzbs implements Serializable, zzbp {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final Object f39312zza;

    public zzbs(Object obj2) {
        this.f39312zza = obj2;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof zzbs) {
            return zzbk.zza(this.f39312zza, ((zzbs) obj2).f39312zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f39312zza});
    }

    public final String toString() {
        return a.p("Suppliers.ofInstance(", this.f39312zza.toString(), ")");
    }

    @Override // com.google.android.gms.internal.fido.zzbp
    public final Object zza() {
        return this.f39312zza;
    }
}
