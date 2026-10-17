package qfm;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes13.dex */
public final class m2 extends AtomicInteger implements efm.j, dom.b {
    public static final l2 k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dom.a f245476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kfm.o f245477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f245478c;
    public volatile boolean d;
    public volatile boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public dom.b f245479g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile long f245481j;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicReference f245480h = new AtomicReference();
    public final AtomicLong i = new AtomicLong();
    public final zfm.c e = new zfm.c();

    static {
        l2 l2Var = new l2(null, -1L, 1);
        k = l2Var;
        yfm.g.b(l2Var);
    }

    public m2(dom.a aVar, kfm.o oVar, int i) {
        this.f245476a = aVar;
        this.f245477b = oVar;
        this.f245478c = i;
    }

    @Override // dom.b
    public final void a(long j2) {
        if (yfm.g.f(j2)) {
            com.bumptech.glide.d.a(this.i, j2);
            if (this.f245481j == 0) {
                this.f245479g.a(Long.MAX_VALUE);
            } else {
                c();
            }
        }
    }

    public final void b() {
        l2 l2Var;
        AtomicReference atomicReference = this.f245480h;
        l2 l2Var2 = (l2) atomicReference.get();
        l2 l2Var3 = k;
        if (l2Var2 == l2Var3 || (l2Var = (l2) atomicReference.getAndSet(l2Var3)) == l2Var3 || l2Var == null) {
            return;
        }
        yfm.g.b(l2Var);
    }

    public final void c() {
        boolean z;
        long j2;
        Object objPoll;
        if (getAndIncrement() != 0) {
            return;
        }
        dom.a aVar = this.f245476a;
        int iAddAndGet = 1;
        while (!this.f) {
            if (this.d) {
                if (((Throwable) this.e.get()) != null) {
                    b();
                    zfm.c cVar = this.e;
                    p.a.C(cVar, cVar, aVar);
                    return;
                } else if (this.f245480h.get() == null) {
                    aVar.onComplete();
                    return;
                }
            }
            l2 l2Var = (l2) this.f245480h.get();
            nfm.j jVar = l2Var != null ? l2Var.d : null;
            if (jVar != null) {
                if (l2Var.e) {
                    if (((Throwable) this.e.get()) != null) {
                        b();
                        zfm.c cVar2 = this.e;
                        p.a.C(cVar2, cVar2, aVar);
                        return;
                    } else if (jVar.isEmpty()) {
                        AtomicReference atomicReference = this.f245480h;
                        while (!atomicReference.compareAndSet(l2Var, null) && atomicReference.get() == l2Var) {
                        }
                    }
                }
                long j3 = this.i.get();
                long j5 = 0;
                while (true) {
                    z = false;
                    if (j5 == j3) {
                        j2 = 0;
                        break;
                    }
                    if (!this.f) {
                        boolean z3 = l2Var.e;
                        try {
                            objPoll = jVar.poll();
                        } catch (Throwable th10) {
                            m70.a.u(th10);
                            yfm.g.b(l2Var);
                            zfm.c cVar3 = this.e;
                            cVar3.getClass();
                            zfm.h.a(cVar3, th10);
                            z3 = true;
                            objPoll = null;
                        }
                        boolean z4 = objPoll == null;
                        j2 = 0;
                        if (l2Var != this.f245480h.get()) {
                            break;
                        }
                        if (z3) {
                            if (((Throwable) this.e.get()) != null) {
                                zfm.c cVar4 = this.e;
                                p.a.C(cVar4, cVar4, aVar);
                                return;
                            } else if (z4) {
                                AtomicReference atomicReference2 = this.f245480h;
                                while (!atomicReference2.compareAndSet(l2Var, null) && atomicReference2.get() == l2Var) {
                                }
                            }
                        }
                        if (z4) {
                            break;
                        }
                        aVar.onNext(objPoll);
                        j5++;
                    } else {
                        return;
                    }
                }
                z = true;
                if (j5 != j2 && !this.f) {
                    if (j3 != Long.MAX_VALUE) {
                        this.i.addAndGet(-j5);
                    }
                    if (l2Var.f != 1) {
                        ((dom.b) l2Var.get()).a(j5);
                    }
                }
                if (z) {
                    continue;
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
    }

    @Override // dom.b
    public final void cancel() {
        if (this.f) {
            return;
        }
        this.f = true;
        this.f245479g.cancel();
        b();
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        if (yfm.g.h(this.f245479g, bVar)) {
            this.f245479g = bVar;
            this.f245476a.e(this);
        }
    }

    @Override // dom.a
    public final void onComplete() {
        if (this.d) {
            return;
        }
        this.d = true;
        c();
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        if (!this.d) {
            zfm.c cVar = this.e;
            cVar.getClass();
            if (zfm.h.a(cVar, th10)) {
                b();
                this.d = true;
                c();
                return;
            }
        }
        mo3.a.m(th10);
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        if (this.d) {
            return;
        }
        long j2 = this.f245481j + 1;
        this.f245481j = j2;
        l2 l2Var = (l2) this.f245480h.get();
        if (l2Var != null) {
            yfm.g.b(l2Var);
        }
        try {
            Object objApply = this.f245477b.apply(obj2);
            mfm.f.b(objApply, "The publisher returned is null");
            Publisher publisher = (Publisher) objApply;
            l2 l2Var2 = new l2(this, j2, this.f245478c);
            while (true) {
                l2 l2Var3 = (l2) this.f245480h.get();
                if (l2Var3 == k) {
                    return;
                }
                AtomicReference atomicReference = this.f245480h;
                while (!atomicReference.compareAndSet(l2Var3, l2Var2)) {
                    if (atomicReference.get() != l2Var3) {
                        break;
                    }
                }
                publisher.a(l2Var2);
                return;
            }
        } catch (Throwable th10) {
            m70.a.u(th10);
            this.f245479g.cancel();
            onError(th10);
        }
    }
}
