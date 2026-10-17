package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes16.dex */
final class zzmm implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzmh f47454zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ long f47455zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ zzmo f47456zzc;

    public zzmm(zzmo zzmoVar, zzmh zzmhVar, long j2) {
        this.f47454zza = zzmhVar;
        this.f47455zzb = j2;
        this.f47456zzc = zzmoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzmo zzmoVar = this.f47456zzc;
        zzmoVar.zzC(this.f47454zza, false, this.f47455zzb);
        zzmoVar.f47458zza = null;
        zzmoVar.zzu.zzu().zzS(null);
    }
}
