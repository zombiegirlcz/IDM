package qfm;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class z2 extends AtomicReference implements efm.j, dom.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y2 f245595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f245596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f245597c;
    public nfm.j d;
    public long e;
    public volatile boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f245598g;

    public z2(y2 y2Var, int i) {
        this.f245595a = y2Var;
        this.f245596b = i;
        this.f245597c = i - (i >> 2);
    }

    @Override // dom.b
    public final void a(long j2) {
        if (this.f245598g != 1) {
            long j3 = this.e + j2;
            if (j3 < this.f245597c) {
                this.e = j3;
            } else {
                this.e = 0L;
                ((dom.b) get()).a(j3);
            }
        }
    }

    @Override // dom.b
    public final void cancel() {
        yfm.g.b(this);
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        if (yfm.g.e(this, bVar)) {
            if (bVar instanceof nfm.g) {
                nfm.g gVar = (nfm.g) bVar;
                int iB = gVar.b(7);
                if (iB == 1) {
                    this.f245598g = iB;
                    this.d = gVar;
                    this.f = true;
                    this.f245595a.c();
                    return;
                }
                if (iB == 2) {
                    this.f245598g = iB;
                    this.d = gVar;
                    bVar.a(this.f245596b);
                    return;
                }
            }
            this.d = new vfm.b(this.f245596b);
            bVar.a(this.f245596b);
        }
    }

    @Override // dom.a
    public final void onComplete() {
        this.f = true;
        this.f245595a.c();
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        y2 y2Var = this.f245595a;
        zfm.c cVar = y2Var.e;
        cVar.getClass();
        if (!zfm.h.a(cVar, th10)) {
            mo3.a.m(th10);
        } else {
            this.f = true;
            y2Var.c();
        }
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        if (this.f245598g != 2) {
            this.d.offer(obj2);
        }
        this.f245595a.c();
    }
}
