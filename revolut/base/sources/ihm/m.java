package ihm;

import efm.y;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class m extends k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final vfm.c f161465g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicReference f161466h;
    public final AtomicReference i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f161467j;
    public volatile boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile boolean f161468l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Throwable f161469m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final AtomicBoolean f161470n;
    public final l o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f161471p;

    public m(int i) {
        mfm.f.e(i, "capacityHint");
        this.f161465g = new vfm.c(i);
        this.i = new AtomicReference();
        this.f161467j = true;
        this.f161466h = new AtomicReference();
        this.f161470n = new AtomicBoolean();
        this.o = new l(this);
    }

    public final void e() {
        AtomicReference atomicReference = this.i;
        Runnable runnable = (Runnable) atomicReference.get();
        if (runnable != null) {
            while (!atomicReference.compareAndSet(runnable, null)) {
                if (atomicReference.get() != runnable) {
                    return;
                }
            }
            runnable.run();
        }
    }

    public final void f() {
        Throwable th10;
        if (this.o.getAndIncrement() != 0) {
            return;
        }
        y yVar = (y) this.f161466h.get();
        int iAddAndGet = 1;
        int iAddAndGet2 = 1;
        while (yVar == null) {
            iAddAndGet2 = this.o.addAndGet(-iAddAndGet2);
            if (iAddAndGet2 == 0) {
                return;
            } else {
                yVar = (y) this.f161466h.get();
            }
        }
        if (this.f161471p) {
            vfm.c cVar = this.f161465g;
            boolean z = this.f161467j;
            while (!this.k) {
                boolean z3 = this.f161468l;
                if (!z && z3 && (th10 = this.f161469m) != null) {
                    this.f161466h.lazySet(null);
                    cVar.clear();
                    yVar.onError(th10);
                    return;
                }
                yVar.onNext(null);
                if (z3) {
                    this.f161466h.lazySet(null);
                    Throwable th11 = this.f161469m;
                    if (th11 != null) {
                        yVar.onError(th11);
                        return;
                    } else {
                        yVar.onComplete();
                        return;
                    }
                }
                iAddAndGet = this.o.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            this.f161466h.lazySet(null);
            return;
        }
        vfm.c cVar2 = this.f161465g;
        boolean z4 = this.f161467j;
        boolean z6 = true;
        int iAddAndGet3 = 1;
        while (!this.k) {
            boolean z11 = this.f161468l;
            Object objPoll = this.f161465g.poll();
            boolean z12 = objPoll == null;
            if (z11) {
                if (!z4 && z6) {
                    Throwable th12 = this.f161469m;
                    if (th12 != null) {
                        this.f161466h.lazySet(null);
                        cVar2.clear();
                        yVar.onError(th12);
                        return;
                    }
                    z6 = false;
                }
                if (z12) {
                    this.f161466h.lazySet(null);
                    Throwable th13 = this.f161469m;
                    if (th13 != null) {
                        yVar.onError(th13);
                        return;
                    } else {
                        yVar.onComplete();
                        return;
                    }
                }
            }
            if (z12) {
                iAddAndGet3 = this.o.addAndGet(-iAddAndGet3);
                if (iAddAndGet3 == 0) {
                    return;
                }
            } else {
                yVar.onNext(objPoll);
            }
        }
        this.f161466h.lazySet(null);
        cVar2.clear();
    }

    @Override // efm.y
    public final void onComplete() {
        if (this.f161468l || this.k) {
            return;
        }
        this.f161468l = true;
        e();
        f();
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        mfm.f.b(th10, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f161468l || this.k) {
            mo3.a.m(th10);
            return;
        }
        this.f161469m = th10;
        this.f161468l = true;
        e();
        f();
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        mfm.f.b(obj2, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f161468l || this.k) {
            return;
        }
        this.f161465g.offer(obj2);
        f();
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        if (this.f161468l || this.k) {
            cVar.dispose();
        }
    }

    @Override // efm.r
    public final void subscribeActual(y yVar) {
        if (this.f161470n.get() || !this.f161470n.compareAndSet(false, true)) {
            lfm.e.d(new IllegalStateException("Only a single observer allowed."), yVar);
            return;
        }
        yVar.onSubscribe(this.o);
        this.f161466h.lazySet(yVar);
        if (this.k) {
            this.f161466h.lazySet(null);
        } else {
            f();
        }
    }

    public m(int i, Runnable runnable) {
        mfm.f.e(i, "capacityHint");
        this.f161465g = new vfm.c(i);
        this.i = new AtomicReference(runnable);
        this.f161467j = true;
        this.f161466h = new AtomicReference();
        this.f161470n = new AtomicBoolean();
        this.o = new l(this);
    }
}
