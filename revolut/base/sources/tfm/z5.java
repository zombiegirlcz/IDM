package tfm;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class z5 extends AtomicInteger implements efm.y, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.y f270991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f270992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeUnit f270993c;
    public final efm.c0 d;
    public final vfm.c e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ifm.c f270994g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f270995h;
    public volatile boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Throwable f270996j;

    public z5(efm.y yVar, long j2, TimeUnit timeUnit, efm.c0 c0Var, int i, boolean z) {
        this.f270991a = yVar;
        this.f270992b = j2;
        this.f270993c = timeUnit;
        this.d = c0Var;
        this.e = new vfm.c(i);
        this.f = z;
    }

    public final void a() {
        if (getAndIncrement() != 0) {
            return;
        }
        efm.y yVar = this.f270991a;
        vfm.c cVar = this.e;
        boolean z = this.f;
        TimeUnit timeUnit = this.f270993c;
        efm.c0 c0Var = this.d;
        long j2 = this.f270992b;
        int iAddAndGet = 1;
        while (!this.f270995h) {
            boolean z3 = this.i;
            Long l2 = (Long) cVar.c();
            boolean z4 = l2 == null;
            c0Var.getClass();
            long jA = efm.c0.a(timeUnit);
            if (!z4 && l2.longValue() > jA - j2) {
                z4 = true;
            }
            if (z3) {
                if (!z) {
                    Throwable th10 = this.f270996j;
                    if (th10 != null) {
                        this.e.clear();
                        yVar.onError(th10);
                        return;
                    } else if (z4) {
                        yVar.onComplete();
                        return;
                    }
                } else if (z4) {
                    Throwable th11 = this.f270996j;
                    if (th11 != null) {
                        yVar.onError(th11);
                        return;
                    } else {
                        yVar.onComplete();
                        return;
                    }
                }
            }
            if (z4) {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                cVar.poll();
                yVar.onNext(cVar.poll());
            }
        }
        this.e.clear();
    }

    @Override // ifm.c
    public final void dispose() {
        if (this.f270995h) {
            return;
        }
        this.f270995h = true;
        this.f270994g.dispose();
        if (getAndIncrement() == 0) {
            this.e.clear();
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.f270995h;
    }

    @Override // efm.y
    public final void onComplete() {
        this.i = true;
        a();
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        this.f270996j = th10;
        this.i = true;
        a();
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        this.d.getClass();
        this.e.a(Long.valueOf(efm.c0.a(this.f270993c)), obj2);
        a();
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        if (lfm.d.f(this.f270994g, cVar)) {
            this.f270994g = cVar;
            this.f270991a.onSubscribe(this);
        }
    }
}
