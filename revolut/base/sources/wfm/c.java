package wfm;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes13.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f297165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d[] f297166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f297167c;

    public c(ThreadFactory threadFactory, int i) {
        this.f297165a = i;
        this.f297166b = new d[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.f297166b[i2] = new d(threadFactory);
        }
    }

    public final d a() {
        int i = this.f297165a;
        if (i == 0) {
            return e.f297168g;
        }
        long j2 = this.f297167c;
        this.f297167c = 1 + j2;
        return this.f297166b[(int) (j2 % ((long) i))];
    }
}
