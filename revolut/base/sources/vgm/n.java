package vgm;

import ch.qos.logback.core.CoreConstants;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes14.dex */
public final class n extends AtomicLong implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f289244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f289245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f289246c;

    public n(String str) {
        this(str, 5, false);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.f289244a + CoreConstants.DASH_CHAR + incrementAndGet();
        Thread mVar = this.f289246c ? new m(runnable, str) : new Thread(runnable, str);
        mVar.setPriority(this.f289245b);
        mVar.setDaemon(true);
        return mVar;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public final String toString() {
        return v0.a.i(new StringBuilder("RxThreadFactory["), this.f289244a, "]");
    }

    public n(String str, int i, boolean z) {
        this.f289244a = str;
        this.f289245b = i;
        this.f289246c = z;
    }
}
