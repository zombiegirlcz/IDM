package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.lang.Thread;

/* JADX INFO: loaded from: classes16.dex */
final class zzii implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzil f47133zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final String f47134zzb;

    public zzii(zzil zzilVar, String str) {
        this.f47133zza = zzilVar;
        Preconditions.checkNotNull(str);
        this.f47134zzb = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th10) {
        this.f47133zza.zzu.zzaW().zze().zzb(this.f47134zzb, th10);
    }
}
