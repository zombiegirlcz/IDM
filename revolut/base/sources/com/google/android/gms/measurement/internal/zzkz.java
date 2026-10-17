package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: loaded from: classes16.dex */
final class zzkz implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ String f47326zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ String f47327zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ long f47328zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    final /* synthetic */ Bundle f47329zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    final /* synthetic */ boolean f47330zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    final /* synthetic */ boolean f47331zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    final /* synthetic */ boolean f47332zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    final /* synthetic */ String f47333zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    final /* synthetic */ zzlw f47334zzi;

    public zzkz(zzlw zzlwVar, String str, String str2, long j2, Bundle bundle, boolean z, boolean z3, boolean z4, String str3) {
        this.f47326zza = str;
        this.f47327zzb = str2;
        this.f47328zzc = j2;
        this.f47329zzd = bundle;
        this.f47330zze = z;
        this.f47331zzf = z3;
        this.f47332zzg = z4;
        this.f47333zzh = str3;
        this.f47334zzi = zzlwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f47334zzi.zzT(this.f47326zza, this.f47327zzb, this.f47328zzc, this.f47329zzd, this.f47330zze, this.f47331zzf, this.f47332zzg, this.f47333zzh);
    }
}
