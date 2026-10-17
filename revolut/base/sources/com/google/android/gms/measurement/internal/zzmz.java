package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import ch.qos.logback.core.util.a;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes16.dex */
final class zzmz implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzr f47498zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzny f47499zzb;

    public zzmz(zzny zznyVar, zzr zzrVar) {
        this.f47498zza = zzrVar;
        this.f47499zzb = zznyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzny zznyVar = this.f47499zzb;
        zzgl zzglVar = zznyVar.f47570zzb;
        if (zzglVar == null) {
            a.w(zznyVar.zzu, "Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            zzr zzrVar = this.f47498zza;
            Preconditions.checkNotNull(zzrVar);
            zzglVar.zzs(zzrVar);
        } catch (RemoteException e) {
            this.f47499zzb.zzu.zzaW().zze().zzb("Failed to reset data on the service: remote exception", e);
        }
        this.f47499zzb.zzag();
    }
}
