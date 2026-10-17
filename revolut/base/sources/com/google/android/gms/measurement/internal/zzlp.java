package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes16.dex */
final class zzlp implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ Boolean f47377zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzlw f47378zzb;

    public zzlp(zzlw zzlwVar, Boolean bool) {
        this.f47377zza = bool;
        this.f47378zzb = zzlwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f47378zzb.zzas(this.f47377zza, true);
    }
}
