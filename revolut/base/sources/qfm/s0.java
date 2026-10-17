package qfm;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class s0 extends AtomicInteger implements efm.j, dom.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dom.a f245532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f245533c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final kfm.o f245535h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public dom.b f245536j;
    public volatile boolean k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f245531a = 0;
    public final AtomicLong d = new AtomicLong();
    public final ifm.b e = new ifm.b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zfm.c f245534g = new zfm.c();
    public final AtomicInteger f = new AtomicInteger(1);
    public final AtomicReference i = new AtomicReference();

    public s0(dom.a aVar, mic.a0 a0Var, int i) {
        this.f245532b = aVar;
        this.f245535h = a0Var;
        this.f245533c = i;
    }

    @Override // dom.b
    public final void a(long j2) {
        switch (this.f245531a) {
            case 0:
                if (yfm.g.f(j2)) {
                    com.bumptech.glide.d.a(this.d, j2);
                    if (getAndIncrement() == 0) {
                        c();
                    }
                }
                break;
            default:
                if (yfm.g.f(j2)) {
                    com.bumptech.glide.d.a(this.d, j2);
                    if (getAndIncrement() == 0) {
                        c();
                    }
                }
                break;
        }
    }

    public final void b() {
        switch (this.f245531a) {
            case 0:
                vfm.c cVar = (vfm.c) this.i.get();
                if (cVar != null) {
                    cVar.clear();
                }
                break;
            default:
                vfm.c cVar2 = (vfm.c) this.i.get();
                if (cVar2 != null) {
                    cVar2.clear();
                }
                break;
        }
    }

    public final void c() {
        switch (this.f245531a) {
            case 0:
                dom.a aVar = this.f245532b;
                AtomicInteger atomicInteger = this.f;
                AtomicReference atomicReference = this.i;
                int iAddAndGet = 1;
                do {
                    long j2 = this.d.get();
                    long j3 = 0;
                    while (true) {
                        if (j3 != j2) {
                            if (this.k) {
                                b();
                                break;
                            } else if (((Throwable) this.f245534g.get()) != null) {
                                zfm.c cVar = this.f245534g;
                                cVar.getClass();
                                Throwable thB = zfm.h.b(cVar);
                                b();
                                aVar.onError(thB);
                                break;
                            } else {
                                boolean z = atomicInteger.get() == 0;
                                vfm.c cVar2 = (vfm.c) atomicReference.get();
                                Object objPoll = cVar2 != null ? cVar2.poll() : null;
                                boolean z3 = objPoll == null;
                                if (z && z3) {
                                    zfm.c cVar3 = this.f245534g;
                                    cVar3.getClass();
                                    Throwable thB2 = zfm.h.b(cVar3);
                                    if (thB2 == null) {
                                        aVar.onComplete();
                                    } else {
                                        aVar.onError(thB2);
                                    }
                                    break;
                                } else if (!z3) {
                                    aVar.onNext(objPoll);
                                    j3++;
                                }
                            }
                        }
                    }
                    if (j3 == j2) {
                        if (this.k) {
                            b();
                        } else if (((Throwable) this.f245534g.get()) == null) {
                            boolean z4 = atomicInteger.get() == 0;
                            vfm.c cVar4 = (vfm.c) atomicReference.get();
                            boolean z6 = cVar4 == null || cVar4.isEmpty();
                            if (z4 && z6) {
                                zfm.c cVar5 = this.f245534g;
                                cVar5.getClass();
                                Throwable thB3 = zfm.h.b(cVar5);
                                if (thB3 == null) {
                                    aVar.onComplete();
                                } else {
                                    aVar.onError(thB3);
                                }
                            }
                        } else {
                            zfm.c cVar6 = this.f245534g;
                            cVar6.getClass();
                            Throwable thB4 = zfm.h.b(cVar6);
                            b();
                            aVar.onError(thB4);
                        }
                    }
                    if (j3 != 0) {
                        com.bumptech.glide.d.A(this.d, j3);
                        if (this.f245533c != Integer.MAX_VALUE) {
                            this.f245536j.a(j3);
                        }
                    }
                    iAddAndGet = addAndGet(-iAddAndGet);
                    break;
                } while (iAddAndGet != 0);
                break;
            default:
                dom.a aVar2 = this.f245532b;
                AtomicInteger atomicInteger2 = this.f;
                AtomicReference atomicReference2 = this.i;
                int iAddAndGet2 = 1;
                do {
                    long j5 = this.d.get();
                    long j16 = 0;
                    while (true) {
                        if (j16 != j5) {
                            if (this.k) {
                                b();
                                break;
                            } else if (((Throwable) this.f245534g.get()) != null) {
                                zfm.c cVar7 = this.f245534g;
                                cVar7.getClass();
                                Throwable thB5 = zfm.h.b(cVar7);
                                b();
                                aVar2.onError(thB5);
                                break;
                            } else {
                                boolean z11 = atomicInteger2.get() == 0;
                                vfm.c cVar8 = (vfm.c) atomicReference2.get();
                                Object objPoll2 = cVar8 != null ? cVar8.poll() : null;
                                boolean z12 = objPoll2 == null;
                                if (z11 && z12) {
                                    zfm.c cVar9 = this.f245534g;
                                    cVar9.getClass();
                                    Throwable thB6 = zfm.h.b(cVar9);
                                    if (thB6 == null) {
                                        aVar2.onComplete();
                                    } else {
                                        aVar2.onError(thB6);
                                    }
                                    break;
                                } else if (!z12) {
                                    aVar2.onNext(objPoll2);
                                    j16++;
                                }
                            }
                        }
                    }
                    if (j16 == j5) {
                        if (this.k) {
                            b();
                        } else if (((Throwable) this.f245534g.get()) == null) {
                            boolean z29 = atomicInteger2.get() == 0;
                            vfm.c cVar10 = (vfm.c) atomicReference2.get();
                            boolean z31 = cVar10 == null || cVar10.isEmpty();
                            if (z29 && z31) {
                                zfm.c cVar11 = this.f245534g;
                                cVar11.getClass();
                                Throwable thB7 = zfm.h.b(cVar11);
                                if (thB7 == null) {
                                    aVar2.onComplete();
                                } else {
                                    aVar2.onError(thB7);
                                }
                            }
                        } else {
                            zfm.c cVar12 = this.f245534g;
                            cVar12.getClass();
                            Throwable thB8 = zfm.h.b(cVar12);
                            b();
                            aVar2.onError(thB8);
                        }
                    }
                    if (j16 != 0) {
                        com.bumptech.glide.d.A(this.d, j16);
                        if (this.f245533c != Integer.MAX_VALUE) {
                            this.f245536j.a(j16);
                        }
                    }
                    iAddAndGet2 = addAndGet(-iAddAndGet2);
                    break;
                } while (iAddAndGet2 != 0);
                break;
        }
    }

    @Override // dom.b
    public final void cancel() {
        switch (this.f245531a) {
            case 0:
                this.k = true;
                this.f245536j.cancel();
                this.e.dispose();
                break;
            default:
                this.k = true;
                this.f245536j.cancel();
                this.e.dispose();
                break;
        }
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        switch (this.f245531a) {
            case 0:
                if (yfm.g.h(this.f245536j, bVar)) {
                    this.f245536j = bVar;
                    this.f245532b.e(this);
                    int i = this.f245533c;
                    if (i != Integer.MAX_VALUE) {
                        bVar.a(i);
                    } else {
                        bVar.a(Long.MAX_VALUE);
                    }
                }
                break;
            default:
                if (yfm.g.h(this.f245536j, bVar)) {
                    this.f245536j = bVar;
                    this.f245532b.e(this);
                    int i2 = this.f245533c;
                    if (i2 != Integer.MAX_VALUE) {
                        bVar.a(i2);
                    } else {
                        bVar.a(Long.MAX_VALUE);
                    }
                }
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final vfm.c f() {
        vfm.c cVar;
        vfm.c cVar2;
        switch (this.f245531a) {
            case 0:
                while (true) {
                    AtomicReference atomicReference = this.i;
                    cVar = (vfm.c) atomicReference.get();
                    if (cVar == null) {
                        cVar = new vfm.c(efm.i.f125385a);
                        while (!atomicReference.compareAndSet(null, cVar)) {
                            if (atomicReference.get() != null) {
                            }
                            break;
                        }
                    }
                }
                return cVar;
            default:
                while (true) {
                    AtomicReference atomicReference2 = this.i;
                    cVar2 = (vfm.c) atomicReference2.get();
                    if (cVar2 == null) {
                        cVar2 = new vfm.c(efm.i.f125385a);
                        while (!atomicReference2.compareAndSet(null, cVar2)) {
                            if (atomicReference2.get() != null) {
                            }
                            break;
                        }
                    }
                }
                return cVar2;
        }
    }

    @Override // dom.a
    public final void onComplete() {
        switch (this.f245531a) {
            case 0:
                this.f.decrementAndGet();
                if (getAndIncrement() == 0) {
                    c();
                }
                break;
            default:
                this.f.decrementAndGet();
                if (getAndIncrement() == 0) {
                    c();
                }
                break;
        }
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        switch (this.f245531a) {
            case 0:
                this.f.decrementAndGet();
                zfm.c cVar = this.f245534g;
                cVar.getClass();
                if (!zfm.h.a(cVar, th10)) {
                    mo3.a.m(th10);
                } else {
                    this.e.dispose();
                    if (getAndIncrement() == 0) {
                        c();
                    }
                }
                break;
            default:
                this.f.decrementAndGet();
                zfm.c cVar2 = this.f245534g;
                cVar2.getClass();
                if (!zfm.h.a(cVar2, th10)) {
                    mo3.a.m(th10);
                } else {
                    this.e.dispose();
                    if (getAndIncrement() == 0) {
                        c();
                    }
                }
                break;
        }
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        switch (this.f245531a) {
            case 0:
                try {
                    Object objApply = this.f245535h.apply(obj2);
                    mfm.f.b(objApply, "The mapper returned a null MaybeSource");
                    efm.n nVar = (efm.n) objApply;
                    this.f.getAndIncrement();
                    n0 n0Var = new n0(this, 1);
                    if (!this.k && this.e.a(n0Var)) {
                        ((efm.k) nVar).i(n0Var);
                        break;
                    }
                } catch (Throwable th10) {
                    m70.a.u(th10);
                    this.f245536j.cancel();
                    onError(th10);
                }
                break;
            default:
                try {
                    Object objApply2 = this.f245535h.apply(obj2);
                    mfm.f.b(objApply2, "The mapper returned a null SingleSource");
                    efm.h0 h0Var = (efm.h0) objApply2;
                    this.f.getAndIncrement();
                    n0 n0Var2 = new n0(this, 2);
                    if (!this.k && this.e.a(n0Var2)) {
                        ((efm.d0) h0Var).q(n0Var2);
                        break;
                    }
                } catch (Throwable th11) {
                    m70.a.u(th11);
                    this.f245536j.cancel();
                    onError(th11);
                    return;
                }
                break;
        }
    }

    public s0(dom.a aVar, mic.a0 a0Var, int i, byte b4) {
        this.f245532b = aVar;
        this.f245535h = a0Var;
        this.f245533c = i;
    }
}
