package com.android.billingclient.api;

import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes16.dex */
final class zzbl implements ThreadFactory {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final ThreadFactory f25886zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final AtomicInteger f25887zzb;

    public zzbl(BillingClientImpl billingClientImpl) {
        Objects.requireNonNull(billingClientImpl);
        this.f25886zza = Executors.defaultThreadFactory();
        this.f25887zzb = new AtomicInteger(1);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        AtomicInteger atomicInteger = this.f25887zzb;
        Thread threadNewThread = this.f25886zza.newThread(runnable);
        threadNewThread.setName("PlayBillingLibrary-" + atomicInteger.getAndIncrement());
        return threadNewThread;
    }
}
