package com.google.android.gms.internal.auth;

import java.io.Serializable;
import p.a;

/* JADX INFO: loaded from: classes16.dex */
final class zzdk implements Serializable, zzdj {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final zzdj f38986zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    volatile transient boolean f38987zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    transient Object f38988zzc;

    public zzdk(zzdj zzdjVar) {
        this.f38986zza = zzdjVar;
    }

    public final String toString() {
        return a.p("Suppliers.memoize(", (this.f38987zzb ? a.p("<supplier that returned ", String.valueOf(this.f38988zzc), ">") : this.f38986zza).toString(), ")");
    }

    @Override // com.google.android.gms.internal.auth.zzdj
    public final Object zza() {
        if (!this.f38987zzb) {
            synchronized (this) {
                try {
                    if (!this.f38987zzb) {
                        Object objZza = this.f38986zza.zza();
                        this.f38988zzc = objZza;
                        this.f38987zzb = true;
                        return objZza;
                    }
                } finally {
                }
            }
        }
        return this.f38988zzc;
    }
}
