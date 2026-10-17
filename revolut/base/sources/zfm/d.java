package zfm;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends CountDownLatch implements kfm.g, kfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Throwable f322034a;

    @Override // kfm.g
    public final void accept(Object obj2) {
        this.f322034a = (Throwable) obj2;
        countDown();
    }

    @Override // kfm.a
    public final void run() {
        countDown();
    }
}
