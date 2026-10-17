package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes16.dex */
final class zzna implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ AtomicReference f47504zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzr f47505zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ zzny f47506zzc;

    public zzna(zzny zznyVar, AtomicReference atomicReference, zzr zzrVar) {
        this.f47504zza = atomicReference;
        this.f47505zzb = zzrVar;
        this.f47506zzc = zznyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        zzny zznyVar;
        zzio zzioVar;
        AtomicReference atomicReference2 = this.f47504zza;
        synchronized (atomicReference2) {
            try {
                try {
                    zznyVar = this.f47506zzc;
                    zzioVar = zznyVar.zzu;
                } catch (RemoteException e) {
                    this.f47506zzc.zzu.zzaW().zze().zzb("Failed to get app instance id", e);
                    atomicReference = this.f47504zza;
                }
                if (zzioVar.zzm().zzh().zzr(zzjw.ANALYTICS_STORAGE)) {
                    zzgl zzglVar = zznyVar.f47570zzb;
                    if (zzglVar != null) {
                        zzr zzrVar = this.f47505zzb;
                        Preconditions.checkNotNull(zzrVar);
                        atomicReference2.set(zzglVar.zzf(zzrVar));
                        String str = (String) atomicReference2.get();
                        if (str != null) {
                            zznyVar.zzu.zzq().zzac(str);
                            zzioVar.zzm().f47094zze.zzb(str);
                        }
                        zznyVar.zzag();
                        atomicReference = this.f47504zza;
                        atomicReference.notify();
                        return;
                    }
                    zzioVar.zzaW().zze().zza("Failed to get app instance id");
                } else {
                    zzioVar.zzaW().zzl().zza("Analytics storage consent denied; will not get app instance id");
                    zznyVar.zzu.zzq().zzac(null);
                    zzioVar.zzm().f47094zze.zzb(null);
                    atomicReference2.set(null);
                }
                atomicReference2.notify();
            } catch (Throwable th10) {
                this.f47504zza.notify();
                throw th10;
            }
        }
    }
}
