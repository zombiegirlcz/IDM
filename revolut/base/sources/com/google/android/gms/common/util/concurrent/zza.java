package com.google.android.gms.common.util.concurrent;

import android.os.Process;

/* JADX INFO: loaded from: classes.dex */
final class zza implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final Runnable f38328zza;

    public zza(Runnable runnable, int i) {
        this.f38328zza = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(0);
        this.f38328zza.run();
    }
}
