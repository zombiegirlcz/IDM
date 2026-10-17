package vgm;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes14.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f289222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d[] f289223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f289224c;

    public c(ThreadFactory threadFactory, int i) {
        this.f289222a = i;
        this.f289223b = new d[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.f289223b[i2] = new d(threadFactory);
        }
    }

    public final d a() {
        int i = this.f289222a;
        if (i == 0) {
            return e.f289225g;
        }
        long j2 = this.f289224c;
        this.f289224c = 1 + j2;
        return this.f289223b[(int) (j2 % ((long) i))];
    }
}
