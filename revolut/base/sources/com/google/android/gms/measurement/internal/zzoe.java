package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes16.dex */
final class zzoe implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzpv f47598zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ Runnable f47599zzb;

    public zzoe(zzog zzogVar, zzpv zzpvVar, Runnable runnable) {
        this.f47598zza = zzpvVar;
        this.f47599zzb = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzpv zzpvVar = this.f47598zza;
        zzpvVar.zzL();
        zzpvVar.zzK(this.f47599zzb);
        zzpvVar.zzat();
    }
}
