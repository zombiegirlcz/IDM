package com.google.android.gms.internal.tapandpay;

/* JADX INFO: loaded from: classes16.dex */
final class zzar extends zzao {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final zzat f46309zza;

    public zzar(zzat zzatVar, int i) {
        super(zzatVar.size(), i);
        this.f46309zza = zzatVar;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzao
    public final Object zza(int i) {
        return this.f46309zza.get(i);
    }
}
