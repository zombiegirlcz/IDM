package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import ch.qos.logback.core.util.a;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes16.dex */
final class zznk implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzr f47529zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzny f47530zzb;

    public zznk(zzny zznyVar, zzr zzrVar) {
        this.f47529zza = zzrVar;
        this.f47530zzb = zznyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzny zznyVar = this.f47530zzb;
        zzgl zzglVar = zznyVar.f47570zzb;
        if (zzglVar == null) {
            a.w(zznyVar.zzu, "Failed to send consent settings to service");
            return;
        }
        try {
            zzr zzrVar = this.f47529zza;
            Preconditions.checkNotNull(zzrVar);
            zzglVar.zzv(zzrVar);
            zznyVar.zzag();
        } catch (RemoteException e) {
            this.f47530zzb.zzu.zzaW().zze().zzb("Failed to send consent settings to the service", e);
        }
    }
}
