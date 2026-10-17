package com.google.common.util.concurrent;

import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.Futures;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49324a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f49325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f49326c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g(AggregateFuture aggregateFuture, int i, ListenableFuture listenableFuture) {
        this.f49326c = aggregateFuture;
        this.f49325b = i;
        this.d = listenableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f49324a) {
            case 0:
                ((AggregateFuture) this.f49326c).lambda$init$0(this.f49325b, (ListenableFuture) this.d);
                break;
            default:
                Futures.InCompletionOrderState.access$600((Futures.InCompletionOrderState) this.f49326c, (ImmutableList) this.d, this.f49325b);
                break;
        }
    }

    public /* synthetic */ g(Futures.InCompletionOrderState inCompletionOrderState, ImmutableList immutableList, int i) {
        this.f49326c = inCompletionOrderState;
        this.d = immutableList;
        this.f49325b = i;
    }
}
