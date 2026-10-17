package tfm;

import efm.c0;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class r6 extends AtomicInteger implements efm.y, ifm.c, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.y f270777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f270778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeUnit f270779c;
    public final c0.a d;
    public final boolean e;
    public final AtomicReference f = new AtomicReference();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ifm.c f270780g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f270781h;
    public Throwable i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile boolean f270782j;
    public volatile boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f270783l;

    public r6(efm.y yVar, long j2, TimeUnit timeUnit, c0.a aVar, boolean z) {
        this.f270777a = yVar;
        this.f270778b = j2;
        this.f270779c = timeUnit;
        this.d = aVar;
        this.e = z;
    }

    public final void a() {
        if (getAndIncrement() != 0) {
            return;
        }
        AtomicReference atomicReference = this.f;
        efm.y yVar = this.f270777a;
        int iAddAndGet = 1;
        while (!this.f270782j) {
            boolean z = this.f270781h;
            if (z && this.i != null) {
                atomicReference.lazySet(null);
                yVar.onError(this.i);
                this.d.dispose();
                return;
            }
            boolean z3 = atomicReference.get() == null;
            if (z) {
                Object andSet = atomicReference.getAndSet(null);
                if (!z3 && this.e) {
                    yVar.onNext(andSet);
                }
                yVar.onComplete();
                this.d.dispose();
                return;
            }
            if (z3) {
                if (this.k) {
                    this.f270783l = false;
                    this.k = false;
                }
            } else if (!this.f270783l || this.k) {
                yVar.onNext(atomicReference.getAndSet(null));
                this.k = false;
                this.f270783l = true;
                this.d.b(this, this.f270778b, this.f270779c);
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
        atomicReference.lazySet(null);
    }

    @Override // ifm.c
    public final void dispose() {
        this.f270782j = true;
        this.f270780g.dispose();
        this.d.dispose();
        if (getAndIncrement() == 0) {
            this.f.lazySet(null);
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.f270782j;
    }

    @Override // efm.y
    public final void onComplete() {
        this.f270781h = true;
        a();
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        this.i = th10;
        this.f270781h = true;
        a();
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        this.f.set(obj2);
        a();
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        if (lfm.d.f(this.f270780g, cVar)) {
            this.f270780g = cVar;
            this.f270777a.onSubscribe(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.k = true;
        a();
    }
}
