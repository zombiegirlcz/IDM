package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import ch.qos.logback.core.util.a;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes16.dex */
final class zznd implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzr f47512zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzny f47513zzb;

    public zznd(zzny zznyVar, zzr zzrVar) {
        this.f47512zza = zzrVar;
        this.f47513zzb = zznyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzny zznyVar = this.f47513zzb;
        zzgl zzglVar = zznyVar.f47570zzb;
        if (zzglVar == null) {
            a.C(zznyVar.zzu, "Failed to send app backgrounded");
            return;
        }
        try {
            zzr zzrVar = this.f47512zza;
            Preconditions.checkNotNull(zzrVar);
            zzglVar.zzm(zzrVar);
            zznyVar.zzag();
        } catch (RemoteException e) {
            this.f47513zzb.zzu.zzaW().zze().zzb("Failed to send app backgrounded to the service", e);
        }
    }
}
