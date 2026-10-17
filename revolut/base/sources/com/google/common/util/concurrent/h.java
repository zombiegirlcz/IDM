package com.google.common.util.concurrent;

import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableCollection;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f49328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f49329c;

    public /* synthetic */ h(Object obj2, Object obj3, int i) {
        this.f49327a = i;
        this.f49328b = obj2;
        this.f49329c = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f49327a) {
            case 0:
                ((AggregateFuture) this.f49328b).lambda$init$1((ImmutableCollection) this.f49329c);
                break;
            default:
                Callables.lambda$threadRenaming$3((Supplier) this.f49328b, (Runnable) this.f49329c);
                break;
        }
    }
}
