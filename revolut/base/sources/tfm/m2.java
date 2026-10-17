package tfm;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes13.dex */
public final class m2 extends AtomicInteger implements efm.y, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f270636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final efm.y f270637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f270638c;
    public final ifm.b d;
    public final AtomicInteger e;
    public final zfm.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final kfm.o f270639g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicReference f270640h;
    public ifm.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile boolean f270641j;

    public m2(int i, efm.y yVar, kfm.o oVar, boolean z) {
        this.f270636a = i;
        switch (i) {
            case 1:
                this.f270637b = yVar;
                this.f270639g = oVar;
                this.f270638c = z;
                this.d = new ifm.b();
                this.f = new zfm.c();
                this.e = new AtomicInteger(1);
                this.f270640h = new AtomicReference();
                break;
            default:
                this.f270637b = yVar;
                this.f270639g = oVar;
                this.f270638c = z;
                this.d = new ifm.b();
                this.f = new zfm.c();
                this.e = new AtomicInteger(1);
                this.f270640h = new AtomicReference();
                break;
        }
    }

    public final void a() {
        switch (this.f270636a) {
            case 0:
                efm.y yVar = this.f270637b;
                AtomicInteger atomicInteger = this.e;
                AtomicReference atomicReference = this.f270640h;
                int iAddAndGet = 1;
                while (!this.f270641j) {
                    if (!this.f270638c && ((Throwable) this.f.get()) != null) {
                        zfm.c cVar = this.f;
                        cVar.getClass();
                        Throwable thB = zfm.h.b(cVar);
                        vfm.c cVar2 = (vfm.c) this.f270640h.get();
                        if (cVar2 != null) {
                            cVar2.clear();
                        }
                        yVar.onError(thB);
                        break;
                    } else {
                        boolean z = atomicInteger.get() == 0;
                        vfm.c cVar3 = (vfm.c) atomicReference.get();
                        Object objPoll = cVar3 != null ? cVar3.poll() : null;
                        boolean z3 = objPoll == null;
                        if (z && z3) {
                            zfm.c cVar4 = this.f;
                            cVar4.getClass();
                            Throwable thB2 = zfm.h.b(cVar4);
                            if (thB2 == null) {
                                yVar.onComplete();
                            } else {
                                yVar.onError(thB2);
                            }
                            break;
                        } else if (z3) {
                            iAddAndGet = addAndGet(-iAddAndGet);
                            if (iAddAndGet == 0) {
                                break;
                            }
                        } else {
                            yVar.onNext(objPoll);
                        }
                    }
                }
                vfm.c cVar5 = (vfm.c) this.f270640h.get();
                if (cVar5 != null) {
                    cVar5.clear();
                }
                break;
            default:
                efm.y yVar2 = this.f270637b;
                AtomicInteger atomicInteger2 = this.e;
                AtomicReference atomicReference2 = this.f270640h;
                int iAddAndGet2 = 1;
                while (!this.f270641j) {
                    if (!this.f270638c && ((Throwable) this.f.get()) != null) {
                        zfm.c cVar6 = this.f;
                        cVar6.getClass();
                        Throwable thB3 = zfm.h.b(cVar6);
                        vfm.c cVar7 = (vfm.c) this.f270640h.get();
                        if (cVar7 != null) {
                            cVar7.clear();
                        }
                        yVar2.onError(thB3);
                        break;
                    } else {
                        boolean z4 = atomicInteger2.get() == 0;
                        vfm.c cVar8 = (vfm.c) atomicReference2.get();
                        Object objPoll2 = cVar8 != null ? cVar8.poll() : null;
                        boolean z6 = objPoll2 == null;
                        if (z4 && z6) {
                            zfm.c cVar9 = this.f;
                            cVar9.getClass();
                            Throwable thB4 = zfm.h.b(cVar9);
                            if (thB4 == null) {
                                yVar2.onComplete();
                            } else {
                                yVar2.onError(thB4);
                            }
                            break;
                        } else if (z6) {
                            iAddAndGet2 = addAndGet(-iAddAndGet2);
                            if (iAddAndGet2 == 0) {
                                break;
                            }
                        } else {
                            yVar2.onNext(objPoll2);
                        }
                    }
                }
                vfm.c cVar10 = (vfm.c) this.f270640h.get();
                if (cVar10 != null) {
                    cVar10.clear();
                }
                break;
        }
    }

    @Override // ifm.c
    public final void dispose() {
        switch (this.f270636a) {
            case 0:
                this.f270641j = true;
                this.i.dispose();
                this.d.dispose();
                break;
            default:
                this.f270641j = true;
                this.i.dispose();
                this.d.dispose();
                break;
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        switch (this.f270636a) {
        }
        return this.f270641j;
    }

    @Override // efm.y
    public final void onComplete() {
        switch (this.f270636a) {
            case 0:
                this.e.decrementAndGet();
                if (getAndIncrement() == 0) {
                    a();
                }
                break;
            default:
                this.e.decrementAndGet();
                if (getAndIncrement() == 0) {
                    a();
                }
                break;
        }
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        switch (this.f270636a) {
            case 0:
                this.e.decrementAndGet();
                zfm.c cVar = this.f;
                cVar.getClass();
                if (!zfm.h.a(cVar, th10)) {
                    mo3.a.m(th10);
                } else {
                    if (!this.f270638c) {
                        this.d.dispose();
                    }
                    if (getAndIncrement() == 0) {
                        a();
                    }
                }
                break;
            default:
                this.e.decrementAndGet();
                zfm.c cVar2 = this.f;
                cVar2.getClass();
                if (!zfm.h.a(cVar2, th10)) {
                    mo3.a.m(th10);
                } else {
                    if (!this.f270638c) {
                        this.d.dispose();
                    }
                    if (getAndIncrement() == 0) {
                        a();
                    }
                }
                break;
        }
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        switch (this.f270636a) {
            case 0:
                try {
                    Object objApply = this.f270639g.apply(obj2);
                    mfm.f.b(objApply, "The mapper returned a null MaybeSource");
                    efm.n nVar = (efm.n) objApply;
                    this.e.getAndIncrement();
                    pfm.g gVar = new pfm.g(this, 2);
                    if (!this.f270641j && this.d.a(gVar)) {
                        ((efm.k) nVar).i(gVar);
                        break;
                    }
                } catch (Throwable th10) {
                    m70.a.u(th10);
                    this.i.dispose();
                    onError(th10);
                }
                break;
            default:
                try {
                    Object objApply2 = this.f270639g.apply(obj2);
                    mfm.f.b(objApply2, "The mapper returned a null SingleSource");
                    efm.h0 h0Var = (efm.h0) objApply2;
                    this.e.getAndIncrement();
                    qfm.n0 n0Var = new qfm.n0(this, 4);
                    if (!this.f270641j && this.d.a(n0Var)) {
                        ((efm.d0) h0Var).q(n0Var);
                        break;
                    }
                } catch (Throwable th11) {
                    m70.a.u(th11);
                    this.i.dispose();
                    onError(th11);
                    return;
                }
                break;
        }
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        switch (this.f270636a) {
            case 0:
                if (lfm.d.f(this.i, cVar)) {
                    this.i = cVar;
                    this.f270637b.onSubscribe(this);
                }
                break;
            default:
                if (lfm.d.f(this.i, cVar)) {
                    this.i = cVar;
                    this.f270637b.onSubscribe(this);
                }
                break;
        }
    }
}
