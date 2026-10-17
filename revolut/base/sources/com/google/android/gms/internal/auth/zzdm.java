package com.google.android.gms.internal.auth;

import p.a;

/* JADX INFO: loaded from: classes16.dex */
final class zzdm implements zzdj {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final zzdj f38990zza = new zzdj() { // from class: com.google.android.gms.internal.auth.zzdl
        @Override // com.google.android.gms.internal.auth.zzdj
        public final Object zza() {
            throw new IllegalStateException();
        }
    };

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private volatile zzdj f38991zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private Object f38992zzc;

    public zzdm(zzdj zzdjVar) {
        this.f38991zzb = zzdjVar;
    }

    public final String toString() {
        Object objP = this.f38991zzb;
        if (objP == f38990zza) {
            objP = a.p("<supplier that returned ", String.valueOf(this.f38992zzc), ">");
        }
        return a.p("Suppliers.memoize(", String.valueOf(objP), ")");
    }

    @Override // com.google.android.gms.internal.auth.zzdj
    public final Object zza() {
        zzdj zzdjVar = this.f38991zzb;
        zzdj zzdjVar2 = f38990zza;
        if (zzdjVar != zzdjVar2) {
            synchronized (this) {
                try {
                    if (this.f38991zzb != zzdjVar2) {
                        Object objZza = this.f38991zzb.zza();
                        this.f38992zzc = objZza;
                        this.f38991zzb = zzdjVar2;
                        return objZza;
                    }
                } finally {
                }
            }
        }
        return this.f38992zzc;
    }
}
