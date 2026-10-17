package tfm;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes13.dex */
public final class m4 extends AtomicBoolean implements efm.y, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.y f270645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n4 f270646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l4 f270647c;
    public ifm.c d;

    public m4(efm.y yVar, n4 n4Var, l4 l4Var) {
        this.f270645a = yVar;
        this.f270646b = n4Var;
        this.f270647c = l4Var;
    }

    @Override // ifm.c
    public final void dispose() {
        this.d.dispose();
        if (compareAndSet(false, true)) {
            n4 n4Var = this.f270646b;
            l4 l4Var = this.f270647c;
            synchronized (n4Var) {
                try {
                    l4 l4Var2 = n4Var.k;
                    if (l4Var2 != null && l4Var2 == l4Var) {
                        long j2 = l4Var.f270614c - 1;
                        l4Var.f270614c = j2;
                        if (j2 == 0 && l4Var.d) {
                            if (n4Var.f270677h == 0) {
                                n4Var.e(l4Var);
                                return;
                            }
                            lfm.b bVar = new lfm.b(1);
                            l4Var.f270613b = bVar;
                            lfm.d.c(bVar, n4Var.f270678j.d(l4Var, n4Var.f270677h, n4Var.i));
                        }
                    }
                } finally {
                }
            }
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.d.isDisposed();
    }

    @Override // efm.y
    public final void onComplete() {
        if (compareAndSet(false, true)) {
            this.f270646b.d(this.f270647c);
            this.f270645a.onComplete();
        }
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        if (!compareAndSet(false, true)) {
            mo3.a.m(th10);
        } else {
            this.f270646b.d(this.f270647c);
            this.f270645a.onError(th10);
        }
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        this.f270645a.onNext(obj2);
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        if (lfm.d.f(this.d, cVar)) {
            this.d = cVar;
            this.f270645a.onSubscribe(this);
        }
    }
}
