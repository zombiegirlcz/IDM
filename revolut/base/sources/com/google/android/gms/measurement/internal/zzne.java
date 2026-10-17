package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes16.dex */
final class zzne extends zzaz {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzny f47514zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzne(zzny zznyVar, zzjs zzjsVar) {
        super(zzjsVar);
        this.f47514zza = zznyVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzaz
    public final void zzc() {
        zzny zznyVar = this.f47514zza;
        zznyVar.zzg();
        if (zznyVar.zzaa()) {
            zznyVar.zzu.zzaW().zzj().zza("Inactivity, disconnecting from the service");
            zznyVar.zzC();
        }
    }
}
