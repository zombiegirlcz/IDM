package qfm;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes13.dex */
public final class q0 extends AtomicInteger implements efm.j, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.d f245508a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kfm.o f245510c;
    public final int e;
    public dom.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f245511g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zfm.c f245509b = new zfm.c();
    public final ifm.b d = new ifm.b();

    public q0(efm.d dVar, kfm.o oVar, int i) {
        this.f245508a = dVar;
        this.f245510c = oVar;
        this.e = i;
        lazySet(1);
    }

    @Override // ifm.c
    public final void dispose() {
        this.f245511g = true;
        this.f.cancel();
        this.d.dispose();
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        if (yfm.g.h(this.f, bVar)) {
            this.f = bVar;
            this.f245508a.onSubscribe(this);
            int i = this.e;
            if (i == Integer.MAX_VALUE) {
                bVar.a(Long.MAX_VALUE);
            } else {
                bVar.a(i);
            }
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.d.f161042b;
    }

    @Override // dom.a
    public final void onComplete() {
        if (decrementAndGet() != 0) {
            if (this.e != Integer.MAX_VALUE) {
                this.f.a(1L);
                return;
            }
            return;
        }
        zfm.c cVar = this.f245509b;
        cVar.getClass();
        Throwable thB = zfm.h.b(cVar);
        efm.d dVar = this.f245508a;
        if (thB != null) {
            dVar.onError(thB);
        } else {
            dVar.onComplete();
        }
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        zfm.c cVar = this.f245509b;
        cVar.getClass();
        if (!zfm.h.a(cVar, th10)) {
            mo3.a.m(th10);
            return;
        }
        dispose();
        if (getAndSet(0) > 0) {
            this.f245508a.onError(zfm.h.b(cVar));
        }
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        try {
            Object objApply = this.f245510c.apply(obj2);
            mfm.f.b(objApply, "The mapper returned a null CompletableSource");
            efm.f fVar = (efm.f) objApply;
            getAndIncrement();
            pfm.g gVar = new pfm.g(this, 1);
            if (this.f245511g || !this.d.a(gVar)) {
                return;
            }
            fVar.d(gVar);
        } catch (Throwable th10) {
            m70.a.u(th10);
            this.f.cancel();
            onError(th10);
        }
    }
}
