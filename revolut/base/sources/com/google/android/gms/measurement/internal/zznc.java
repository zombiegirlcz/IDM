package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import ch.qos.logback.core.util.a;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes16.dex */
final class zznc implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzr f47510zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzny f47511zzb;

    public zznc(zzny zznyVar, zzr zzrVar, boolean z) {
        this.f47510zza = zzrVar;
        this.f47511zzb = zznyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzny zznyVar = this.f47511zzb;
        zzgl zzglVar = zznyVar.f47570zzb;
        if (zzglVar == null) {
            a.w(zznyVar.zzu, "Discarding data. Failed to send app launch");
            return;
        }
        try {
            zzr zzrVar = this.f47510zza;
            Preconditions.checkNotNull(zzrVar);
            zzio zzioVar = zznyVar.zzu;
            zzam zzamVarZzf = zzioVar.zzf();
            zzgg zzggVar = zzgi.zzbl;
            if (zzamVarZzf.zzx(null, zzggVar)) {
                zznyVar.zzP(zzglVar, null, zzrVar);
            }
            zzglVar.zzn(zzrVar);
            zznyVar.zzu.zzi().zzm();
            zzioVar.zzf().zzx(null, zzggVar);
            zznyVar.zzP(zzglVar, null, zzrVar);
            zznyVar.zzag();
        } catch (RemoteException e) {
            this.f47511zzb.zzu.zzaW().zze().zzb("Failed to send app launch to the service", e);
        }
    }
}
