package qfm;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes13.dex */
public final class q1 extends AtomicLong implements efm.j, dom.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dom.a f245512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kfm.g f245513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public dom.b f245514c;
    public boolean d;

    public q1(dom.a aVar, j0 j0Var) {
        this.f245512a = aVar;
        this.f245513b = j0Var;
    }

    @Override // dom.b
    public final void a(long j2) {
        if (yfm.g.f(j2)) {
            com.bumptech.glide.d.a(this, j2);
        }
    }

    @Override // dom.b
    public final void cancel() {
        this.f245514c.cancel();
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        if (yfm.g.h(this.f245514c, bVar)) {
            this.f245514c = bVar;
            this.f245512a.e(this);
            bVar.a(Long.MAX_VALUE);
        }
    }

    @Override // dom.a
    public final void onComplete() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.f245512a.onComplete();
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        if (this.d) {
            mo3.a.m(th10);
        } else {
            this.d = true;
            this.f245512a.onError(th10);
        }
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        if (this.d) {
            return;
        }
        if (get() != 0) {
            this.f245512a.onNext(obj2);
            com.bumptech.glide.d.A(this, 1L);
            return;
        }
        try {
            this.f245513b.accept(obj2);
        } catch (Throwable th10) {
            m70.a.u(th10);
            cancel();
            onError(th10);
        }
    }
}
