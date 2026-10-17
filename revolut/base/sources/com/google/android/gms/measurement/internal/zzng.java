package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import ch.qos.logback.core.util.a;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes16.dex */
final class zzng implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzr f47517zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ boolean f47518zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ zzbf f47519zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    final /* synthetic */ Bundle f47520zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    final /* synthetic */ zzny f47521zze;

    public zzng(zzny zznyVar, boolean z, zzr zzrVar, boolean z3, zzbf zzbfVar, Bundle bundle) {
        this.f47517zza = zzrVar;
        this.f47518zzb = z3;
        this.f47519zzc = zzbfVar;
        this.f47520zzd = bundle;
        this.f47521zze = zznyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzny zznyVar = this.f47521zze;
        zzgl zzglVar = zznyVar.f47570zzb;
        if (zzglVar == null) {
            a.w(zznyVar.zzu, "Failed to send default event parameters to service");
            return;
        }
        if (zznyVar.zzu.zzf().zzx(null, zzgi.zzbl)) {
            zzr zzrVar = this.f47517zza;
            Preconditions.checkNotNull(zzrVar);
            this.f47521zze.zzP(zzglVar, this.f47518zzb ? null : this.f47519zzc, zzrVar);
            return;
        }
        try {
            zzr zzrVar2 = this.f47517zza;
            Preconditions.checkNotNull(zzrVar2);
            zzglVar.zzx(this.f47520zzd, zzrVar2);
            zznyVar.zzag();
        } catch (RemoteException e) {
            this.f47521zze.zzu.zzaW().zze().zzb("Failed to send default event parameters to service", e);
        }
    }
}
