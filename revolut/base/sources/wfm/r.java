package wfm;

import ch.qos.logback.core.CoreConstants;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes13.dex */
public final class r extends AtomicLong implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f297195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f297196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f297197c;

    public r(String str) {
        this(str, 5, false);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.f297195a + CoreConstants.DASH_CHAR + incrementAndGet();
        Thread aVar = this.f297197c ? new h8.a(runnable, str) : new Thread(runnable, str);
        aVar.setPriority(this.f297196b);
        aVar.setDaemon(true);
        return aVar;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public final String toString() {
        return v0.a.i(new StringBuilder("RxThreadFactory["), this.f297195a, "]");
    }

    public r(String str, int i, boolean z) {
        this.f297195a = str;
        this.f297196b = i;
        this.f297197c = z;
    }
}
