package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes16.dex */
final class zzlh implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ AtomicReference f47357zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ String f47358zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ String f47359zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    final /* synthetic */ zzlw f47360zzd;

    public zzlh(zzlw zzlwVar, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f47357zza = atomicReference;
        this.f47358zzb = str2;
        this.f47359zzc = str3;
        this.f47360zzd = zzlwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f47360zzd.zzu.zzu().zzG(this.f47357zza, null, this.f47358zzb, this.f47359zzc);
    }
}
