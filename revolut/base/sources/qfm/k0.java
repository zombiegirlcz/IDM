package qfm;

import io.reactivex.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class k0 extends AtomicReference implements efm.j, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f245439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0 f245440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f245441c;
    public final int d;
    public volatile boolean e;
    public volatile nfm.j f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f245442g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f245443h;

    public k0(l0 l0Var, long j2) {
        this.f245439a = j2;
        this.f245440b = l0Var;
        int i = l0Var.d;
        this.d = i;
        this.f245441c = i >> 2;
    }

    public final void a(long j2) {
        if (this.f245443h != 1) {
            long j3 = this.f245442g + j2;
            if (j3 < this.f245441c) {
                this.f245442g = j3;
            } else {
                this.f245442g = 0L;
                ((dom.b) get()).a(j3);
            }
        }
    }

    @Override // ifm.c
    public final void dispose() {
        yfm.g.b(this);
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        if (yfm.g.e(this, bVar)) {
            if (bVar instanceof nfm.g) {
                nfm.g gVar = (nfm.g) bVar;
                int iB = gVar.b(7);
                if (iB == 1) {
                    this.f245443h = iB;
                    this.f = gVar;
                    this.e = true;
                    this.f245440b.c();
                    return;
                }
                if (iB == 2) {
                    this.f245443h = iB;
                    this.f = gVar;
                }
            }
            bVar.a(this.d);
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return get() == yfm.g.CANCELLED;
    }

    @Override // dom.a
    public final void onComplete() {
        this.e = true;
        this.f245440b.c();
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        lazySet(yfm.g.CANCELLED);
        l0 l0Var = this.f245440b;
        zfm.c cVar = l0Var.f245459g;
        cVar.getClass();
        if (!zfm.h.a(cVar, th10)) {
            mo3.a.m(th10);
            return;
        }
        this.e = true;
        l0Var.k.cancel();
        for (k0 k0Var : (k0[]) l0Var.i.getAndSet(l0.f245455r)) {
            k0Var.getClass();
            yfm.g.b(k0Var);
        }
        l0Var.c();
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        if (this.f245443h == 2) {
            this.f245440b.c();
            return;
        }
        l0 l0Var = this.f245440b;
        if (l0Var.get() == 0 && l0Var.compareAndSet(0, 1)) {
            long j2 = l0Var.f245461j.get();
            nfm.j bVar = this.f;
            if (j2 == 0 || !(bVar == null || bVar.isEmpty())) {
                if (bVar == null && (bVar = this.f) == null) {
                    bVar = new vfm.b(l0Var.d);
                    this.f = bVar;
                }
                if (!bVar.offer(obj2)) {
                    l0Var.onError(new MissingBackpressureException("Inner queue full?!"));
                    return;
                }
            } else {
                l0Var.f245456a.onNext(obj2);
                if (j2 != Long.MAX_VALUE) {
                    l0Var.f245461j.decrementAndGet();
                }
                a(1L);
            }
            if (l0Var.decrementAndGet() == 0) {
                return;
            }
        } else {
            nfm.j bVar2 = this.f;
            if (bVar2 == null) {
                bVar2 = new vfm.b(l0Var.d);
                this.f = bVar2;
            }
            if (!bVar2.offer(obj2)) {
                l0Var.onError(new MissingBackpressureException("Inner queue full?!"));
                return;
            } else if (l0Var.getAndIncrement() != 0) {
                return;
            }
        }
        l0Var.f();
    }
}
