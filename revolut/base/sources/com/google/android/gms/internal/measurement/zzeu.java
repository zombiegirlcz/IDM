package com.google.android.gms.internal.measurement;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes16.dex */
abstract class zzeu implements Runnable {

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    final long f40008zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    final long f40009zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    final boolean f40010zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    final /* synthetic */ zzff f40011zzk;

    public zzeu(zzff zzffVar, boolean z) {
        this.f40011zzk = zzffVar;
        this.f40008zzh = zzffVar.f40036zza.currentTimeMillis();
        this.f40009zzi = zzffVar.f40036zza.elapsedRealtime();
        this.f40010zzj = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f40011zzk.f40042zzh) {
            zzb();
            return;
        }
        try {
            zza();
        } catch (Exception e) {
            this.f40011zzk.zzU(e, false, this.f40010zzj);
            zzb();
        }
    }

    public abstract void zza() throws RemoteException;

    public void zzb() {
    }
}
