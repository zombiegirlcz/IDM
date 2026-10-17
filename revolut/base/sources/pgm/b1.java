package pgm;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes14.dex */
public final class b1 extends AtomicLong implements dom.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dom.a f236008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1 f236009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f236010c;

    public b1(dom.a aVar, c1 c1Var) {
        this.f236008a = aVar;
        this.f236009b = c1Var;
    }

    @Override // dom.b
    public final void a(long j2) {
        long j3;
        if (xgm.f.f(j2)) {
            do {
                j3 = get();
                if (j3 == Long.MIN_VALUE || j3 == Long.MAX_VALUE) {
                    break;
                }
            } while (!compareAndSet(j3, xam.a.c(j3, j2)));
            this.f236009b.b();
        }
    }

    public final boolean b() {
        return get() == Long.MIN_VALUE;
    }

    @Override // dom.b
    public final void cancel() {
        if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
            c1 c1Var = this.f236009b;
            c1Var.c(this);
            c1Var.b();
        }
    }
}
