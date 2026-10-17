package qfm;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes13.dex */
public final class g extends e {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final dom.a f245411m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final AtomicInteger f245412n;

    public g(dom.a aVar, kfm.o oVar) {
        super(oVar);
        this.f245411m = aVar;
        this.f245412n = new AtomicInteger();
    }

    @Override // dom.b
    public final void a(long j2) {
        this.f245394a.a(j2);
    }

    @Override // qfm.i
    public final void b(Throwable th10) {
        zfm.c cVar = this.f245399j;
        cVar.getClass();
        if (!zfm.h.a(cVar, th10)) {
            mo3.a.m(th10);
            return;
        }
        this.e.cancel();
        if (getAndIncrement() == 0) {
            p.a.C(cVar, cVar, this.f245411m);
        }
    }

    @Override // qfm.i
    public final void c(Object obj2) {
        if (get() == 0 && compareAndSet(0, 1)) {
            dom.a aVar = this.f245411m;
            aVar.onNext(obj2);
            if (compareAndSet(1, 0)) {
                return;
            }
            zfm.c cVar = this.f245399j;
            p.a.C(cVar, cVar, aVar);
        }
    }

    @Override // dom.b
    public final void cancel() {
        if (this.i) {
            return;
        }
        this.i = true;
        this.f245394a.cancel();
        this.e.cancel();
    }

    @Override // qfm.e
    public final void f() {
        if (this.f245412n.getAndIncrement() == 0) {
            while (!this.i) {
                if (!this.k) {
                    boolean z = this.f245398h;
                    try {
                        Object objPoll = this.f245397g.poll();
                        boolean z3 = objPoll == null;
                        if (z && z3) {
                            this.f245411m.onComplete();
                            return;
                        }
                        if (!z3) {
                            try {
                                Object objApply = this.f245395b.apply(objPoll);
                                mfm.f.b(objApply, "The mapper returned a null Publisher");
                                Publisher publisher = (Publisher) objApply;
                                if (this.f245400l != 1) {
                                    int i = this.f + 1;
                                    if (i == this.d) {
                                        this.f = 0;
                                        this.e.a(i);
                                    } else {
                                        this.f = i;
                                    }
                                }
                                if (publisher instanceof Callable) {
                                    try {
                                        Object objCall = ((Callable) publisher).call();
                                        if (objCall == null) {
                                            continue;
                                        } else if (!this.f245394a.f313474h) {
                                            this.k = true;
                                            this.f245394a.f(new pgm.i(objCall, this.f245394a, 1));
                                        } else if (get() == 0 && compareAndSet(0, 1)) {
                                            this.f245411m.onNext(objCall);
                                            if (!compareAndSet(1, 0)) {
                                                dom.a aVar = this.f245411m;
                                                zfm.c cVar = this.f245399j;
                                                p.a.C(cVar, cVar, aVar);
                                                return;
                                            }
                                        }
                                    } catch (Throwable th10) {
                                        m70.a.u(th10);
                                        this.e.cancel();
                                        zfm.c cVar2 = this.f245399j;
                                        cVar2.getClass();
                                        zfm.h.a(cVar2, th10);
                                        dom.a aVar2 = this.f245411m;
                                        zfm.c cVar3 = this.f245399j;
                                        p.a.C(cVar3, cVar3, aVar2);
                                        return;
                                    }
                                } else {
                                    this.k = true;
                                    publisher.a(this.f245394a);
                                }
                            } catch (Throwable th11) {
                                m70.a.u(th11);
                                this.e.cancel();
                                zfm.c cVar4 = this.f245399j;
                                cVar4.getClass();
                                zfm.h.a(cVar4, th11);
                                dom.a aVar3 = this.f245411m;
                                zfm.c cVar5 = this.f245399j;
                                p.a.C(cVar5, cVar5, aVar3);
                                return;
                            }
                        }
                    } catch (Throwable th12) {
                        m70.a.u(th12);
                        this.e.cancel();
                        zfm.c cVar6 = this.f245399j;
                        cVar6.getClass();
                        zfm.h.a(cVar6, th12);
                        dom.a aVar4 = this.f245411m;
                        zfm.c cVar7 = this.f245399j;
                        p.a.C(cVar7, cVar7, aVar4);
                        return;
                    }
                }
                if (this.f245412n.decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    @Override // qfm.e
    public final void h() {
        this.f245411m.e(this);
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        zfm.c cVar = this.f245399j;
        cVar.getClass();
        if (!zfm.h.a(cVar, th10)) {
            mo3.a.m(th10);
            return;
        }
        this.f245394a.cancel();
        if (getAndIncrement() == 0) {
            p.a.C(cVar, cVar, this.f245411m);
        }
    }
}
