package com.google.android.gms.tasks;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes16.dex */
final class zzk implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ Task f48788zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzl f48789zzb;

    public zzk(zzl zzlVar, Task task) {
        this.f48788zza = task;
        this.f48789zzb = zzlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f48789zzb.f48791zzb) {
            try {
                zzl zzlVar = this.f48789zzb;
                if (zzlVar.f48792zzc != null) {
                    zzlVar.f48792zzc.onFailure((Exception) Preconditions.checkNotNull(this.f48788zza.getException()));
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }
}
