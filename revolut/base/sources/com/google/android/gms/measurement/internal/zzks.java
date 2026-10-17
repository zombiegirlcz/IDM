package com.google.android.gms.measurement.internal;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes16.dex */
final class zzks implements Executor {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzlw f47316zza;

    public zzks(zzlw zzlwVar) {
        this.f47316zza = zzlwVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f47316zza.zzu.zzaX().zzq(runnable);
    }
}
