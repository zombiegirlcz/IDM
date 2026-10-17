package tfm;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes13.dex */
public final class f2 extends AtomicReference implements efm.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f270452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g2 f270453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f270454c;
    public volatile nfm.j d;
    public int e;

    public f2(g2 g2Var, long j2) {
        this.f270452a = j2;
        this.f270453b = g2Var;
    }

    @Override // efm.y
    public final void onComplete() {
        this.f270454c = true;
        this.f270453b.c();
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        zfm.c cVar = this.f270453b.f270478h;
        cVar.getClass();
        if (!zfm.h.a(cVar, th10)) {
            mo3.a.m(th10);
            return;
        }
        g2 g2Var = this.f270453b;
        if (!g2Var.f270476c) {
            g2Var.b();
        }
        this.f270454c = true;
        this.f270453b.c();
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        if (this.e != 0) {
            this.f270453b.c();
            return;
        }
        g2 g2Var = this.f270453b;
        if (g2Var.get() == 0 && g2Var.compareAndSet(0, 1)) {
            g2Var.f270474a.onNext(obj2);
            if (g2Var.decrementAndGet() == 0) {
                return;
            }
        } else {
            nfm.j cVar = this.d;
            if (cVar == null) {
                cVar = new vfm.c(g2Var.e);
                this.d = cVar;
            }
            cVar.offer(obj2);
            if (g2Var.getAndIncrement() != 0) {
                return;
            }
        }
        g2Var.d();
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        if (lfm.d.e(this, cVar) && (cVar instanceof nfm.e)) {
            nfm.e eVar = (nfm.e) cVar;
            int iB = eVar.b(7);
            if (iB == 1) {
                this.e = iB;
                this.d = eVar;
                this.f270454c = true;
                this.f270453b.c();
                return;
            }
            if (iB == 2) {
                this.e = iB;
                this.d = eVar;
            }
        }
    }
}
