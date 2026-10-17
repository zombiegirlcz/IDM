package com.google.android.gms.measurement.internal;

import ch.qos.logback.core.util.a;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes16.dex */
final class zznm implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzr f47535zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ boolean f47536zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ zzai f47537zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    final /* synthetic */ zzny f47538zzd;

    public zznm(zzny zznyVar, boolean z, zzr zzrVar, boolean z3, zzai zzaiVar, zzai zzaiVar2) {
        this.f47535zza = zzrVar;
        this.f47536zzb = z3;
        this.f47537zzc = zzaiVar;
        this.f47538zzd = zznyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzny zznyVar = this.f47538zzd;
        zzgl zzglVar = zznyVar.f47570zzb;
        if (zzglVar == null) {
            a.w(zznyVar.zzu, "Discarding data. Failed to send conditional user property to service");
            return;
        }
        zzr zzrVar = this.f47535zza;
        Preconditions.checkNotNull(zzrVar);
        zznyVar.zzP(zzglVar, this.f47536zzb ? null : this.f47537zzc, zzrVar);
        zznyVar.zzag();
    }
}
