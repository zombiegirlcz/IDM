package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AbstractExecutionThreadService;
import com.google.common.util.concurrent.JdkFutureAdapters;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f49319b;

    public /* synthetic */ c(Object obj2, int i) {
        this.f49318a = i;
        this.f49319b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f49318a) {
            case 0:
                ((AbstractExecutionThreadService.AnonymousClass1) this.f49319b).lambda$doStart$1();
                break;
            case 1:
                ((JdkFutureAdapters.ListenableFutureAdapter) this.f49319b).lambda$addListener$0();
                break;
            case 2:
                WrappingExecutorService.lambda$wrapTask$0((Callable) this.f49319b);
                break;
            case 3:
                ClosingFuture.lambda$closeQuietly$0((AutoCloseable) this.f49319b);
                break;
            default:
                ((Future) this.f49319b).cancel(false);
                break;
        }
    }
}
