package com.google.android.gms.internal.identity;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes16.dex */
final /* synthetic */ class zzch implements Executor {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final /* synthetic */ zzch f39663zza = new zzch();

    private /* synthetic */ zzch() {
    }

    @Override // java.util.concurrent.Executor
    public final /* synthetic */ void execute(Runnable runnable) {
        runnable.run();
    }
}
