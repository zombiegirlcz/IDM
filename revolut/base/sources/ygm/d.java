package ygm;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes14.dex */
public final class d extends CountDownLatch implements igm.g, igm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Throwable f313671a;

    @Override // igm.g
    public final void accept(Object obj2) {
        this.f313671a = (Throwable) obj2;
        countDown();
    }

    @Override // igm.a
    public final void run() {
        countDown();
    }
}
