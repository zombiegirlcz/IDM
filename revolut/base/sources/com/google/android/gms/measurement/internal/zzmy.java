package com.google.android.gms.measurement.internal;

import ch.qos.logback.core.util.a;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes16.dex */
final class zzmy implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzr f47494zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ boolean f47495zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ zzqb f47496zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    final /* synthetic */ zzny f47497zzd;

    public zzmy(zzny zznyVar, zzr zzrVar, boolean z, zzqb zzqbVar) {
        this.f47494zza = zzrVar;
        this.f47495zzb = z;
        this.f47496zzc = zzqbVar;
        this.f47497zzd = zznyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzny zznyVar = this.f47497zzd;
        zzgl zzglVar = zznyVar.f47570zzb;
        if (zzglVar == null) {
            a.w(zznyVar.zzu, "Discarding data. Failed to set user property");
            return;
        }
        zzr zzrVar = this.f47494zza;
        Preconditions.checkNotNull(zzrVar);
        zznyVar.zzP(zzglVar, this.f47495zzb ? null : this.f47496zzc, zzrVar);
        zznyVar.zzag();
    }
}
