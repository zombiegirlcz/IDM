package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes16.dex */
final class zzin implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzke f47154zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzio f47155zzb;

    public zzin(zzio zzioVar, zzke zzkeVar) {
        this.f47154zza = zzkeVar;
        this.f47155zzb = zzioVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzio zzioVar = this.f47155zzb;
        zzke zzkeVar = this.f47154zza;
        zzio.zzC(zzioVar, zzkeVar);
        zzioVar.zzH(zzkeVar.f47292zzg);
    }
}
