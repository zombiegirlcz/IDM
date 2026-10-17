package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes16.dex */
final class zzmv implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ AtomicReference f47487zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzr f47488zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ boolean f47489zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    final /* synthetic */ zzny f47490zzd;

    public zzmv(zzny zznyVar, AtomicReference atomicReference, zzr zzrVar, boolean z) {
        this.f47487zza = atomicReference;
        this.f47488zzb = zzrVar;
        this.f47489zzc = z;
        this.f47490zzd = zznyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        zzny zznyVar;
        zzgl zzglVar;
        AtomicReference atomicReference2 = this.f47487zza;
        synchronized (atomicReference2) {
            try {
                try {
                    zznyVar = this.f47490zzd;
                    zzglVar = zznyVar.f47570zzb;
                } catch (RemoteException e) {
                    this.f47490zzd.zzu.zzaW().zze().zzb("Failed to get all user properties; remote exception", e);
                    atomicReference = this.f47487zza;
                }
                if (zzglVar == null) {
                    zznyVar.zzu.zzaW().zze().zza("Failed to get all user properties; not connected to service");
                    atomicReference2.notify();
                    return;
                }
                zzr zzrVar = this.f47488zzb;
                Preconditions.checkNotNull(zzrVar);
                atomicReference2.set(zzglVar.zzh(zzrVar, this.f47489zzc));
                zznyVar.zzag();
                atomicReference = this.f47487zza;
                atomicReference.notify();
            } catch (Throwable th10) {
                this.f47487zza.notify();
                throw th10;
            }
        }
    }
}
