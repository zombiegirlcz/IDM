package pgm;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes14.dex */
public final class f1 extends AtomicBoolean implements fgm.d, dom.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dom.a f236057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d1 f236058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e1 f236059c;
    public dom.b d;

    public f1(dom.a aVar, d1 d1Var, e1 e1Var) {
        this.f236057a = aVar;
        this.f236058b = d1Var;
        this.f236059c = e1Var;
    }

    @Override // dom.b
    public final void a(long j2) {
        this.d.a(j2);
    }

    @Override // dom.b
    public final void cancel() {
        this.d.cancel();
        if (compareAndSet(false, true)) {
            d1 d1Var = this.f236058b;
            e1 e1Var = this.f236059c;
            synchronized (d1Var) {
                try {
                    e1 e1Var2 = (e1) d1Var.e;
                    if (e1Var2 != null && e1Var2 == e1Var) {
                        long j2 = e1Var.f236049b - 1;
                        e1Var.f236049b = j2;
                        if (j2 == 0 && e1Var.f236050c) {
                            d1Var.q(e1Var);
                        }
                    }
                } finally {
                }
            }
        }
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        if (xgm.f.h(this.d, bVar)) {
            this.d = bVar;
            this.f236057a.e(this);
        }
    }

    @Override // dom.a
    public final void onComplete() {
        if (compareAndSet(false, true)) {
            this.f236058b.p(this.f236059c);
            this.f236057a.onComplete();
        }
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        if (!compareAndSet(false, true)) {
            jb3.l.v(th10);
        } else {
            this.f236058b.p(this.f236059c);
            this.f236057a.onError(th10);
        }
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        this.f236057a.onNext(obj2);
    }
}
