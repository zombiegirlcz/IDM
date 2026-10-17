package com.google.common.util.concurrent;

import com.google.common.base.Supplier;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class p implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f49344b;

    public /* synthetic */ p(int i, int i2) {
        this.f49343a = i2;
        this.f49344b = i;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        switch (this.f49343a) {
            case 0:
                return Striped.lambda$semaphore$1(this.f49344b);
            default:
                return Striped.lambda$lazyWeakSemaphore$2(this.f49344b);
        }
    }
}
