package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes16.dex */
final class zznp implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ AtomicReference f47549zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ String f47550zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ String f47551zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    final /* synthetic */ zzr f47552zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    final /* synthetic */ boolean f47553zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    final /* synthetic */ zzny f47554zzf;

    public zznp(zzny zznyVar, AtomicReference atomicReference, String str, String str2, String str3, zzr zzrVar, boolean z) {
        this.f47549zza = atomicReference;
        this.f47550zzb = str2;
        this.f47551zzc = str3;
        this.f47552zzd = zzrVar;
        this.f47553zze = z;
        this.f47554zzf = zznyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        zzny zznyVar;
        zzgl zzglVar;
        AtomicReference atomicReference2 = this.f47549zza;
        synchronized (atomicReference2) {
            try {
                try {
                    zznyVar = this.f47554zzf;
                    zzglVar = zznyVar.f47570zzb;
                } catch (RemoteException e) {
                    this.f47554zzf.zzu.zzaW().zze().zzd("(legacy) Failed to get user properties; remote exception", null, this.f47550zzb, e);
                    this.f47549zza.set(Collections.EMPTY_LIST);
                    atomicReference = this.f47549zza;
                }
                if (zzglVar == null) {
                    zznyVar.zzu.zzaW().zze().zzd("(legacy) Failed to get user properties; not connected to service", null, this.f47550zzb, this.f47551zzc);
                    atomicReference2.set(Collections.EMPTY_LIST);
                    atomicReference2.notify();
                    return;
                }
                if (TextUtils.isEmpty(null)) {
                    zzr zzrVar = this.f47552zzd;
                    Preconditions.checkNotNull(zzrVar);
                    atomicReference2.set(zzglVar.zzk(this.f47550zzb, this.f47551zzc, this.f47553zze, zzrVar));
                } else {
                    atomicReference2.set(zzglVar.zzl(null, this.f47550zzb, this.f47551zzc, this.f47553zze));
                }
                zznyVar.zzag();
                atomicReference = this.f47549zza;
                atomicReference.notify();
            } catch (Throwable th10) {
                this.f47549zza.notify();
                throw th10;
            }
        }
    }
}
