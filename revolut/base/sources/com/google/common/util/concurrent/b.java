package com.google.common.util.concurrent;

import com.google.common.base.Supplier;
import com.google.common.util.concurrent.AbstractExecutionThreadService;
import com.google.common.util.concurrent.AbstractScheduledService;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class b implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractService f49317b;

    public /* synthetic */ b(AbstractService abstractService, int i) {
        this.f49316a = i;
        this.f49317b = abstractService;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        switch (this.f49316a) {
            case 0:
                return ((AbstractExecutionThreadService.AnonymousClass1) this.f49317b).lambda$doStart$0();
            default:
                return ((AbstractScheduledService.ServiceDelegate) this.f49317b).lambda$doStart$0();
        }
    }
}
