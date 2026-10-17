package tfm;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class p7 extends AtomicInteger implements efm.y, ifm.c, Runnable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final u f270727l = new u(null, 2);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Object f270728m = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.y f270729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f270730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f270731c = new AtomicReference();
    public final AtomicInteger d = new AtomicInteger(1);
    public final ufm.g e = new ufm.g();
    public final zfm.c f = new zfm.c();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f270732g = new AtomicBoolean();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Callable f270733h;
    public ifm.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile boolean f270734j;
    public ihm.m k;

    public p7(efm.y yVar, int i, Callable callable) {
        this.f270729a = yVar;
        this.f270730b = i;
        this.f270733h = callable;
    }

    public final void a() {
        AtomicReference atomicReference = this.f270731c;
        u uVar = f270727l;
        ifm.c cVar = (ifm.c) atomicReference.getAndSet(uVar);
        if (cVar == null || cVar == uVar) {
            return;
        }
        cVar.dispose();
    }

    public final void b() {
        if (getAndIncrement() != 0) {
            return;
        }
        efm.y yVar = this.f270729a;
        ufm.g gVar = this.e;
        zfm.c cVar = this.f;
        int iAddAndGet = 1;
        while (this.d.get() != 0) {
            ihm.m mVar = this.k;
            boolean z = this.f270734j;
            if (z && cVar.get() != null) {
                gVar.clear();
                Throwable thB = zfm.h.b(cVar);
                if (mVar != null) {
                    this.k = null;
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
                        this.k = null;
                        mVar.onComplete();
                    }
                    yVar.onComplete();
                    return;
                }
                if (mVar != null) {
                    this.k = null;
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
            } else if (objPoll != f270728m) {
                mVar.onNext(objPoll);
            } else {
                if (mVar != null) {
                    this.k = null;
                    mVar.onComplete();
                }
                if (!this.f270732g.get()) {
                    ihm.m mVar2 = new ihm.m(this.f270730b, this);
                    this.k = mVar2;
                    this.d.getAndIncrement();
                    try {
                        Object objCall = this.f270733h.call();
                        mfm.f.b(objCall, "The other Callable returned a null ObservableSource");
                        efm.w wVar = (efm.w) objCall;
                        u uVar = new u(this, 2);
                        AtomicReference atomicReference = this.f270731c;
                        while (true) {
                            if (atomicReference.compareAndSet(null, uVar)) {
                                wVar.subscribe(uVar);
                                yVar.onNext(mVar2);
                                break;
                            } else if (atomicReference.get() != null) {
                                break;
                            }
                        }
                    } catch (Throwable th10) {
                        m70.a.u(th10);
                        cVar.getClass();
                        zfm.h.a(cVar, th10);
                        this.f270734j = true;
                    }
                }
            }
        }
        gVar.clear();
        this.k = null;
    }

    @Override // ifm.c
    public final void dispose() {
        if (this.f270732g.compareAndSet(false, true)) {
            a();
            if (this.d.decrementAndGet() == 0) {
                this.i.dispose();
            }
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.f270732g.get();
    }

    @Override // efm.y
    public final void onComplete() {
        a();
        this.f270734j = true;
        b();
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        a();
        zfm.c cVar = this.f;
        cVar.getClass();
        if (!zfm.h.a(cVar, th10)) {
            mo3.a.m(th10);
        } else {
            this.f270734j = true;
            b();
        }
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        this.e.offer(obj2);
        b();
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        if (lfm.d.f(this.i, cVar)) {
            this.i = cVar;
            this.f270729a.onSubscribe(this);
            this.e.offer(f270728m);
            b();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d.decrementAndGet() == 0) {
            this.i.dispose();
        }
    }
}
