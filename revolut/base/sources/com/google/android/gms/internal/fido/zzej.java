package com.google.android.gms.internal.fido;

/* JADX INFO: loaded from: classes16.dex */
public final class zzej implements zzek {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final String f39399zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final zzdn f39400zzb;

    public zzej() {
        zzdo zzdoVar = zzdo.NO_OP;
        this.f39399zza = "";
        this.f39400zzb = zzdoVar;
    }

    @Override // com.google.android.gms.internal.fido.zzek
    public final zzdp zza(String str) {
        return new zzes(this.f39399zza, str, true, this.f39400zzb, true, true);
    }
}
