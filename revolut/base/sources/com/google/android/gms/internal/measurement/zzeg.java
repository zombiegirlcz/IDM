package com.google.android.gms.internal.measurement;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes16.dex */
final class zzeg implements ThreadFactory {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final ThreadFactory f39972zza = Executors.defaultThreadFactory();

    public zzeg(zzff zzffVar) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f39972zza.newThread(runnable);
        threadNewThread.setName("ScionFrontendApi");
        return threadNewThread;
    }
}
