package com.google.android.gms.internal.mlkit_common;

/* JADX INFO: loaded from: classes16.dex */
final class zzad extends zzv {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final zzaf f40709zza;

    public zzad(zzaf zzafVar, int i) {
        super(zzafVar.size(), i);
        this.f40709zza = zzafVar;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzv
    public final Object zza(int i) {
        return this.f40709zza.get(i);
    }
}
