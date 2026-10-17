package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes16.dex */
final class zzh {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzh f46065zza = new zzh(null, null);

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final Runnable f46066zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final Executor f46067zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    zzh f46068zzd;

    public zzh(Runnable runnable, Executor executor) {
        this.f46066zzb = runnable;
        this.f46067zzc = executor;
    }
}
