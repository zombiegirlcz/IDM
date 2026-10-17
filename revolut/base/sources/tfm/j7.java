package tfm;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class j7 extends AtomicInteger implements efm.y, ifm.c, Runnable {
    public static final Object k = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.y f270571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f270572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f270573c = new u(this, 1);
    public final AtomicReference d = new AtomicReference();
    public final AtomicInteger e = new AtomicInteger(1);
    public final ufm.g f = new ufm.g();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zfm.c f270574g = new zfm.c();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f270575h = new AtomicBoolean();
    public volatile boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ihm.m f270576j;

    public j7(efm.y yVar, int i) {
        this.f270571a = yVar;
        this.f270572b = i;
    }

    public final void a() {
        if (getAndIncrement() != 0) {
            return;
        }
        efm.y yVar = this.f270571a;
        ufm.g gVar = this.f;
        zfm.c cVar = this.f270574g;
        int iAddAndGet = 1;
        while (this.e.get() != 0) {
            ihm.m mVar = this.f270576j;
            boolean z = this.i;
            if (z && cVar.get() != null) {
                gVar.clear();
                Throwable thB = zfm.h.b(cVar);
                if (mVar != null) {
                    this.f270576j = null;
                    mVar.onError(thB);
                }
                yVar.onError(thB);
                return;
            }
            Object objPoll = gVar.poll();
            boolean z3 = objPoll == null;
            if (z && z3) {
                cVar.getClass();
                Throwable thB2 = zfm.h.b(cVar);
                if (thB2 == null) {
                    if (mVar != null) {
                        this.f270576j = null;
                        mVar.onComplete();
                    }
                    yVar.onComplete();
                    return;
                }
                if (mVar != null) {
                    this.f270576j = null;
                    mVar.onError(thB2);
                }
                yVar.onError(thB2);
                return;
            }
            if (z3) {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else if (objPoll != k) {
                mVar.onNext(objPoll);
            } else {
                if (mVar != null) {
                    this.f270576j = null;
                    mVar.onComplete();
                }
                if (!this.f270575h.get()) {
                    ihm.m mVar2 = new ihm.m(this.f270572b, this);
                    this.f270576j = mVar2;
                    this.e.getAndIncrement();
                    yVar.onNext(mVar2);
                }
            }
        }
        gVar.clear();
        this.f270576j = null;
    }

    public final void b() {
        this.f.offer(k);
        a();
    }

    @Override // ifm.c
    public final void dispose() {
        if (this.f270575h.compareAndSet(false, true)) {
            this.f270573c.dispose();
            if (this.e.decrementAndGet() == 0) {
                lfm.d.a(this.d);
            }
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.f270575h.get();
    }

    @Override // efm.y
    public final void onComplete() {
        this.f270573c.dispose();
        this.i = true;
        a();
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        this.f270573c.dispose();
        zfm.c cVar = this.f270574g;
        cVar.getClass();
        if (!zfm.h.a(cVar, th10)) {
            mo3.a.m(th10);
        } else {
            this.i = true;
            a();
        }
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        this.f.offer(obj2);
        a();
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        if (lfm.d.e(this.d, cVar)) {
            b();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.e.decrementAndGet() == 0) {
            lfm.d.a(this.d);
        }
    }
}
