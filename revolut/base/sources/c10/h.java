package c10;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes16.dex */
public final class h implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f20316a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final CountDownLatch f20317b = new CountDownLatch(1);

    private h() {
    }

    public final void a() throws InterruptedException {
        f20317b.await();
    }
}
