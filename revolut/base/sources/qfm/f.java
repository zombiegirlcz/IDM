package qfm;

import java.util.concurrent.Callable;
import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends e {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final dom.a f245405m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f245406n;

    public f(dom.a aVar, kfm.o oVar, boolean z) {
        super(oVar);
        this.f245405m = aVar;
        this.f245406n = z;
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
        if (!this.f245406n) {
            this.e.cancel();
            this.f245398h = true;
        }
        this.k = false;
        f();
    }

    @Override // qfm.i
    public final void c(Object obj2) {
        this.f245405m.onNext(obj2);
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
        Object objCall;
        if (getAndIncrement() == 0) {
            while (!this.i) {
                if (!this.k) {
                    boolean z = this.f245398h;
                    if (z && !this.f245406n && ((Throwable) this.f245399j.get()) != null) {
                        dom.a aVar = this.f245405m;
                        zfm.c cVar = this.f245399j;
                        p.a.C(cVar, cVar, aVar);
                        return;
                    }
                    try {
                        Object objPoll = this.f245397g.poll();
                        boolean z3 = objPoll == null;
                        if (z && z3) {
                            zfm.c cVar2 = this.f245399j;
                            cVar2.getClass();
                            Throwable thB = zfm.h.b(cVar2);
                            if (thB != null) {
                                this.f245405m.onError(thB);
                                return;
                            } else {
                                this.f245405m.onComplete();
                                return;
                            }
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
                                        objCall = ((Callable) publisher).call();
                                    } catch (Throwable th10) {
                                        m70.a.u(th10);
                                        zfm.c cVar3 = this.f245399j;
                                        cVar3.getClass();
                                        zfm.h.a(cVar3, th10);
                                        if (!this.f245406n) {
                                            this.e.cancel();
                                            dom.a aVar2 = this.f245405m;
                                            zfm.c cVar4 = this.f245399j;
                                            p.a.C(cVar4, cVar4, aVar2);
                                            return;
                                        }
                                        objCall = null;
                                    }
                                    if (objCall == null) {
                                        continue;
                                    } else if (this.f245394a.f313474h) {
                                        this.f245405m.onNext(objCall);
                                    } else {
                                        this.k = true;
                                        this.f245394a.f(new pgm.i(objCall, this.f245394a, 1));
                                    }
                                } else {
                                    this.k = true;
                                    publisher.a(this.f245394a);
                                }
                            } catch (Throwable th11) {
                                m70.a.u(th11);
                                this.e.cancel();
                                zfm.c cVar5 = this.f245399j;
                                cVar5.getClass();
                                zfm.h.a(cVar5, th11);
                                dom.a aVar3 = this.f245405m;
                                zfm.c cVar6 = this.f245399j;
                                p.a.C(cVar6, cVar6, aVar3);
                                return;
                            }
                        }
                    } catch (Throwable th12) {
                        m70.a.u(th12);
                        this.e.cancel();
                        zfm.c cVar7 = this.f245399j;
                        cVar7.getClass();
                        zfm.h.a(cVar7, th12);
                        dom.a aVar4 = this.f245405m;
                        zfm.c cVar8 = this.f245399j;
                        p.a.C(cVar8, cVar8, aVar4);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    @Override // qfm.e
    public final void h() {
        this.f245405m.e(this);
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        zfm.c cVar = this.f245399j;
        cVar.getClass();
        if (!zfm.h.a(cVar, th10)) {
            mo3.a.m(th10);
        } else {
            this.f245398h = true;
            f();
        }
    }
}
