package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes16.dex */
final class zznn implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ AtomicReference f47539zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ String f47540zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ String f47541zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    final /* synthetic */ zzr f47542zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    final /* synthetic */ zzny f47543zze;

    public zznn(zzny zznyVar, AtomicReference atomicReference, String str, String str2, String str3, zzr zzrVar) {
        this.f47539zza = atomicReference;
        this.f47540zzb = str2;
        this.f47541zzc = str3;
        this.f47542zzd = zzrVar;
        this.f47543zze = zznyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        zzny zznyVar;
        zzgl zzglVar;
        AtomicReference atomicReference2 = this.f47539zza;
        synchronized (atomicReference2) {
            try {
                try {
                    zznyVar = this.f47543zze;
                    zzglVar = zznyVar.f47570zzb;
                } catch (RemoteException e) {
                    this.f47543zze.zzu.zzaW().zze().zzd("(legacy) Failed to get conditional properties; remote exception", null, this.f47540zzb, e);
                    this.f47539zza.set(Collections.EMPTY_LIST);
                    atomicReference = this.f47539zza;
                }
                if (zzglVar == null) {
                    zznyVar.zzu.zzaW().zze().zzd("(legacy) Failed to get conditional properties; not connected to service", null, this.f47540zzb, this.f47541zzc);
                    atomicReference2.set(Collections.EMPTY_LIST);
                    atomicReference2.notify();
                    return;
                }
                if (TextUtils.isEmpty(null)) {
                    zzr zzrVar = this.f47542zzd;
                    Preconditions.checkNotNull(zzrVar);
                    atomicReference2.set(zzglVar.zzi(this.f47540zzb, this.f47541zzc, zzrVar));
                } else {
                    atomicReference2.set(zzglVar.zzj(null, this.f47540zzb, this.f47541zzc));
                }
                zznyVar.zzag();
                atomicReference = this.f47539zza;
                atomicReference.notify();
            } catch (Throwable th10) {
                this.f47539zza.notify();
                throw th10;
            }
        }
    }
}
