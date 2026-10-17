package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import ch.qos.logback.core.util.a;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes16.dex */
final class zznj implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzr f47527zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzny f47528zzb;

    public zznj(zzny zznyVar, zzr zzrVar) {
        this.f47527zza = zzrVar;
        this.f47528zzb = zznyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzny zznyVar = this.f47528zzb;
        zzgl zzglVar = zznyVar.f47570zzb;
        if (zzglVar == null) {
            a.w(zznyVar.zzu, "Failed to send measurementEnabled to service");
            return;
        }
        try {
            zzr zzrVar = this.f47527zza;
            Preconditions.checkNotNull(zzrVar);
            zzglVar.zzz(zzrVar);
            zznyVar.zzag();
        } catch (RemoteException e) {
            this.f47528zzb.zzu.zzaW().zze().zzb("Failed to send measurementEnabled to the service", e);
        }
    }
}
