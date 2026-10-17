package com.google.android.gms.internal.identity;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes16.dex */
final /* synthetic */ class zzcm implements Executor {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final /* synthetic */ zzcm f39669zza = new zzcm();

    private /* synthetic */ zzcm() {
    }

    @Override // java.util.concurrent.Executor
    public final /* synthetic */ void execute(Runnable runnable) {
        runnable.run();
    }
}
