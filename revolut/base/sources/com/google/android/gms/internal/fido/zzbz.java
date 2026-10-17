package com.google.android.gms.internal.fido;

/* JADX INFO: loaded from: classes16.dex */
final class zzbz extends zzbu {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final zzcc f39316zza;

    public zzbz(zzcc zzccVar, int i) {
        super(zzccVar.size(), i);
        this.f39316zza = zzccVar;
    }

    @Override // com.google.android.gms.internal.fido.zzbu
    public final Object zza(int i) {
        return this.f39316zza.get(i);
    }
}
