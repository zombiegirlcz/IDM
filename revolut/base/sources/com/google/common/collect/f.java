package com.google.common.collect;

import com.google.common.collect.ImmutableMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49206a;

    public /* synthetic */ f(int i) {
        this.f49206a = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f49206a) {
            case 0:
                return ImmutableList.builder();
            case 1:
                return new ImmutableMap.Builder();
            case 2:
                return jbm.h.f172670r;
            case 3:
                lbm.n nVar = new lbm.n();
                f fVar = new f(4);
                mhm.c cVar = new mhm.c();
                cVar.f205587a = fVar;
                nVar.f193736a = cVar;
                return nVar;
            default:
                return Executors.newSingleThreadScheduledExecutor(new ThreadFactory() { // from class: lbm.m
                    @Override // java.util.concurrent.ThreadFactory
                    public final Thread newThread(Runnable runnable) {
                        Thread thread = new Thread(runnable, "CircuitBreakerAutoTransitionThread");
                        thread.setDaemon(true);
                        return thread;
                    }
                });
        }
    }
}
