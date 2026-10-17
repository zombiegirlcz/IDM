package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AbstractIdleService;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractIdleService.DelegateService f49321b;

    public /* synthetic */ e(AbstractIdleService.DelegateService delegateService, int i) {
        this.f49320a = i;
        this.f49321b = delegateService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f49320a) {
            case 0:
                this.f49321b.lambda$doStop$1();
                break;
            default:
                this.f49321b.lambda$doStart$0();
                break;
        }
    }
}
