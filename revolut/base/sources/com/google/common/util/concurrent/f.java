package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AbstractScheduledService;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractScheduledService.ServiceDelegate f49323b;

    public /* synthetic */ f(AbstractScheduledService.ServiceDelegate serviceDelegate, int i) {
        this.f49322a = i;
        this.f49323b = serviceDelegate;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f49322a) {
            case 0:
                this.f49323b.lambda$doStart$1();
                break;
            default:
                this.f49323b.lambda$doStop$2();
                break;
        }
    }
}
