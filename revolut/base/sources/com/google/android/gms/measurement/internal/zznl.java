package com.google.android.gms.measurement.internal;

import ch.qos.logback.core.util.a;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes16.dex */
final class zznl implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzr f47531zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ boolean f47532zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ zzbh f47533zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    final /* synthetic */ zzny f47534zzd;

    public zznl(zzny zznyVar, boolean z, zzr zzrVar, boolean z3, zzbh zzbhVar, String str) {
        this.f47531zza = zzrVar;
        this.f47532zzb = z3;
        this.f47533zzc = zzbhVar;
        this.f47534zzd = zznyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzny zznyVar = this.f47534zzd;
        zzgl zzglVar = zznyVar.f47570zzb;
        if (zzglVar == null) {
            a.w(zznyVar.zzu, "Discarding data. Failed to send event to service");
            return;
        }
        zzr zzrVar = this.f47531zza;
        Preconditions.checkNotNull(zzrVar);
        zznyVar.zzP(zzglVar, this.f47532zzb ? null : this.f47533zzc, zzrVar);
        zznyVar.zzag();
    }
}
