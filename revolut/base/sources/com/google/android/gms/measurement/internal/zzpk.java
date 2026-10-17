package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes16.dex */
final class zzpk implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzpw f47657zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzpv f47658zzb;

    public zzpk(zzpv zzpvVar, zzpw zzpwVar) {
        this.f47657zza = zzpwVar;
        this.f47658zzb = zzpvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzpv zzpvVar = this.f47658zzb;
        zzpv.zzH(zzpvVar, this.f47657zza);
        zzpvVar.zzam();
    }
}
