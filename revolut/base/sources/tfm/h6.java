package tfm;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes13.dex */
public final class h6 extends AtomicReference implements efm.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i6 f270512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f270513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f270514c;
    public volatile nfm.j d;
    public volatile boolean e;

    public h6(i6 i6Var, long j2, int i) {
        this.f270512a = i6Var;
        this.f270513b = j2;
        this.f270514c = i;
    }

    @Override // efm.y
    public final void onComplete() {
        if (this.f270513b == this.f270512a.f270547j) {
            this.e = true;
            this.f270512a.b();
        }
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        i6 i6Var = this.f270512a;
        i6Var.getClass();
        if (this.f270513b == i6Var.f270547j) {
            zfm.c cVar = i6Var.e;
            cVar.getClass();
            if (zfm.h.a(cVar, th10)) {
                if (!i6Var.d) {
                    i6Var.f270546h.dispose();
                    i6Var.f = true;
                }
                this.e = true;
                i6Var.b();
                return;
            }
        }
        mo3.a.m(th10);
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        if (this.f270513b == this.f270512a.f270547j) {
            if (obj2 != null) {
                this.d.offer(obj2);
            }
            this.f270512a.b();
        }
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        if (lfm.d.e(this, cVar)) {
            if (cVar instanceof nfm.e) {
                nfm.e eVar = (nfm.e) cVar;
                int iB = eVar.b(7);
                if (iB == 1) {
                    this.d = eVar;
                    this.e = true;
                    this.f270512a.b();
                    return;
                } else if (iB == 2) {
                    this.d = eVar;
                    return;
                }
            }
            this.d = new vfm.c(this.f270514c);
        }
    }
}
