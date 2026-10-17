package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes16.dex */
final class zzli implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ AtomicReference f47361zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ String f47362zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ String f47363zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    final /* synthetic */ boolean f47364zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    final /* synthetic */ zzlw f47365zze;

    public zzli(zzlw zzlwVar, AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        this.f47361zza = atomicReference;
        this.f47362zzb = str2;
        this.f47363zzc = str3;
        this.f47364zzd = z;
        this.f47365zze = zzlwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f47365zze.zzu.zzu().zzL(this.f47361zza, null, this.f47362zzb, this.f47363zzc, this.f47364zzd);
    }
}
