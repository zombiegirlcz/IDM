package com.google.common.util.concurrent;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class a implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Service f49315b;

    public /* synthetic */ a(Service service, int i) {
        this.f49314a = i;
        this.f49315b = service;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f49314a) {
            case 0:
                ((AbstractExecutionThreadService) this.f49315b).lambda$executor$0(runnable);
                break;
            default:
                ((AbstractIdleService) this.f49315b).lambda$executor$0(runnable);
                break;
        }
    }
}
