package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes16.dex */
final class zzox extends zzaz {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzoy f47635zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzox(zzoy zzoyVar, zzjs zzjsVar) {
        super(zzjsVar);
        this.f47635zza = zzoyVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzaz
    public final void zzc() {
        zzoy zzoyVar = this.f47635zza;
        zzoyVar.zza();
        zzoyVar.zzu.zzaW().zzj().zza("Starting upload from DelayedRunnable");
        zzoyVar.f47639zzg.zzat();
    }
}
