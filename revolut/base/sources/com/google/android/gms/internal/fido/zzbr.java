package com.google.android.gms.internal.fido;

import p.a;

/* JADX INFO: loaded from: classes16.dex */
final class zzbr implements zzbp {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final zzbp f39310zza = new zzbp() { // from class: com.google.android.gms.internal.fido.zzbq
        @Override // com.google.android.gms.internal.fido.zzbp
        public final Object zza() {
            throw null;
        }
    };

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private volatile zzbp f39311zzb;

    public zzbr(zzbp zzbpVar) {
        this.f39311zzb = zzbpVar;
    }

    public final String toString() {
        Object obj2 = this.f39311zzb;
        if (obj2 == f39310zza) {
            obj2 = "<supplier that returned null>";
        }
        return a.p("Suppliers.memoize(", String.valueOf(obj2), ")");
    }

    @Override // com.google.android.gms.internal.fido.zzbp
    public final Object zza() {
        throw null;
    }
}
