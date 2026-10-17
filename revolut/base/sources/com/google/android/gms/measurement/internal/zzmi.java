package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: loaded from: classes16.dex */
final class zzmi implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ Bundle f47441zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzmh f47442zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ zzmh f47443zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    final /* synthetic */ long f47444zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    final /* synthetic */ zzmo f47445zze;

    public zzmi(zzmo zzmoVar, Bundle bundle, zzmh zzmhVar, zzmh zzmhVar2, long j2) {
        this.f47441zza = bundle;
        this.f47442zzb = zzmhVar;
        this.f47443zzc = zzmhVar2;
        this.f47444zzd = j2;
        this.f47445zze = zzmoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzmo.zzq(this.f47445zze, this.f47441zza, this.f47442zzb, this.f47443zzc, this.f47444zzd);
    }
}
