package com.google.android.gms.tasks;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class zzz implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzw f48819zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ Callable f48820zzb;

    public zzz(zzw zzwVar, Callable callable) {
        this.f48819zza = zzwVar;
        this.f48820zzb = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f48819zza.zzb(this.f48820zzb.call());
        } catch (Exception e) {
            this.f48819zza.zza(e);
        } catch (Throwable th10) {
            this.f48819zza.zza(new RuntimeException(th10));
        }
    }
}
