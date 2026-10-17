package qfm;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends AtomicInteger implements efm.j, dom.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dom.a f245426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kfm.o f245427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f245428c;
    public final int d;
    public final zfm.f e;
    public final zfm.c f = new zfm.c();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicLong f245429g = new AtomicLong();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final vfm.c f245430h;
    public dom.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile boolean f245431j;
    public volatile boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile xfm.c f245432l;

    public j(dom.a aVar, kfm.o oVar, int i, int i2, zfm.f fVar) {
        this.f245426a = aVar;
        this.f245427b = oVar;
        this.f245428c = i;
        this.d = i2;
        this.e = fVar;
        this.f245430h = new vfm.c(Math.min(i2, i));
    }

    @Override // dom.b
    public final void a(long j2) {
        if (yfm.g.f(j2)) {
            com.bumptech.glide.d.a(this.f245429g, j2);
            c();
        }
    }

    public final void b() {
        xfm.c cVar = this.f245432l;
        this.f245432l = null;
        if (cVar != null) {
            yfm.g.b(cVar);
        }
        while (true) {
            xfm.c cVar2 = (xfm.c) this.f245430h.poll();
            if (cVar2 == null) {
                return;
            } else {
                yfm.g.b(cVar2);
            }
        }
    }

    public final void c() {
        xfm.c cVar;
        boolean z;
        long j2;
        nfm.j jVar;
        boolean z3;
        if (getAndIncrement() != 0) {
            return;
        }
        xfm.c cVar2 = this.f245432l;
        dom.a aVar = this.f245426a;
        zfm.f fVar = this.e;
        int iAddAndGet = 1;
        while (true) {
            long j3 = this.f245429g.get();
            if (cVar2 != null) {
                cVar = cVar2;
            } else {
                if (fVar != zfm.f.END && ((Throwable) this.f.get()) != null) {
                    b();
                    zfm.c cVar3 = this.f;
                    p.a.C(cVar3, cVar3, aVar);
                    return;
                }
                boolean z4 = this.k;
                cVar = (xfm.c) this.f245430h.poll();
                if (z4 && cVar == null) {
                    zfm.c cVar4 = this.f;
                    cVar4.getClass();
                    Throwable thB = zfm.h.b(cVar4);
                    if (thB != null) {
                        aVar.onError(thB);
                        return;
                    } else {
                        aVar.onComplete();
                        return;
                    }
                }
                if (cVar != null) {
                    this.f245432l = cVar;
                }
            }
            if (cVar == null || (jVar = cVar.d) == null) {
                z = false;
                j2 = 0;
            } else {
                j2 = 0;
                while (j2 != j3) {
                    if (this.f245431j) {
                        b();
                        return;
                    }
                    if (fVar == zfm.f.IMMEDIATE && ((Throwable) this.f.get()) != null) {
                        this.f245432l = null;
                        yfm.g.b(cVar);
                        b();
                        zfm.c cVar5 = this.f;
                        p.a.C(cVar5, cVar5, aVar);
                        return;
                    }
                    boolean z6 = cVar.e;
                    try {
                        Object objPoll = jVar.poll();
                        boolean z11 = objPoll == null;
                        if (z6 && z11) {
                            this.f245432l = null;
                            this.i.a(1L);
                            cVar = null;
                            z = true;
                            z3 = true;
                            break;
                        }
                        if (z11) {
                            break;
                        }
                        aVar.onNext(objPoll);
                        j2++;
                        if (cVar.f305448g != 1) {
                            long j5 = cVar.f + 1;
                            if (j5 == cVar.f305447c) {
                                cVar.f = 0L;
                                ((dom.b) cVar.get()).a(j5);
                            } else {
                                cVar.f = j5;
                            }
                        }
                    } catch (Throwable th10) {
                        m70.a.u(th10);
                        this.f245432l = null;
                        yfm.g.b(cVar);
                        b();
                        aVar.onError(th10);
                        return;
                    }
                }
                z3 = true;
                z = false;
                if (j2 == j3) {
                    if (this.f245431j) {
                        b();
                        return;
                    }
                    if (fVar == zfm.f.IMMEDIATE && ((Throwable) this.f.get()) != null) {
                        this.f245432l = null;
                        cVar.getClass();
                        yfm.g.b(cVar);
                        b();
                        zfm.c cVar6 = this.f;
                        p.a.C(cVar6, cVar6, aVar);
                        return;
                    }
                    boolean z12 = cVar.e;
                    boolean zIsEmpty = jVar.isEmpty();
                    if (z12 && zIsEmpty) {
                        this.f245432l = null;
                        this.i.a(1L);
                        z = z3;
                        cVar = null;
                    }
                }
            }
            if (j2 != 0 && j3 != Long.MAX_VALUE) {
                this.f245429g.addAndGet(-j2);
            }
            if (!z && (iAddAndGet = addAndGet(-iAddAndGet)) == 0) {
                return;
            } else {
                cVar2 = cVar;
            }
        }
    }

    @Override // dom.b
    public final void cancel() {
        if (this.f245431j) {
            return;
        }
        this.f245431j = true;
        this.i.cancel();
        if (getAndIncrement() == 0) {
            do {
                b();
            } while (decrementAndGet() != 0);
        }
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        if (yfm.g.h(this.i, bVar)) {
            this.i = bVar;
            this.f245426a.e(this);
            int i = this.f245428c;
            bVar.a(i == Integer.MAX_VALUE ? Long.MAX_VALUE : i);
        }
    }

    public final void f(xfm.c cVar, Throwable th10) {
        zfm.c cVar2 = this.f;
        cVar2.getClass();
        if (!zfm.h.a(cVar2, th10)) {
            mo3.a.m(th10);
            return;
        }
        cVar.e = true;
        if (this.e != zfm.f.END) {
            this.i.cancel();
        }
        c();
    }

    @Override // dom.a
    public final void onComplete() {
        this.k = true;
        c();
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        zfm.c cVar = this.f;
        cVar.getClass();
        if (!zfm.h.a(cVar, th10)) {
            mo3.a.m(th10);
        } else {
            this.k = true;
            c();
        }
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        try {
            Object objApply = this.f245427b.apply(obj2);
            mfm.f.b(objApply, "The mapper returned a null Publisher");
            Publisher publisher = (Publisher) objApply;
            xfm.c cVar = new xfm.c(this, this.d);
            if (this.f245431j) {
                return;
            }
            this.f245430h.offer(cVar);
            publisher.a(cVar);
            if (this.f245431j) {
                yfm.g.b(cVar);
                if (getAndIncrement() == 0) {
                    do {
                        b();
                    } while (decrementAndGet() != 0);
                }
            }
        } catch (Throwable th10) {
            m70.a.u(th10);
            this.i.cancel();
            onError(th10);
        }
    }
}
