package ofm;

import efm.y;
import java.util.concurrent.atomic.AtomicReference;
import tfm.q0;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends AtomicReference implements y, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q0 f224939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f224940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public nfm.j f224941c;
    public volatile boolean d;
    public int e;

    public o(q0 q0Var, int i) {
        this.f224939a = q0Var;
        this.f224940b = i;
    }

    @Override // ifm.c
    public final void dispose() {
        lfm.d.a(this);
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return lfm.d.b((ifm.c) get());
    }

    @Override // efm.y
    public final void onComplete() {
        q0 q0Var = this.f224939a;
        q0Var.getClass();
        this.d = true;
        q0Var.b();
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        q0 q0Var = this.f224939a;
        zfm.c cVar = q0Var.f;
        cVar.getClass();
        if (!zfm.h.a(cVar, th10)) {
            mo3.a.m(th10);
            return;
        }
        if (q0Var.e == zfm.f.IMMEDIATE) {
            q0Var.i.dispose();
        }
        this.d = true;
        q0Var.b();
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        int i = this.e;
        q0 q0Var = this.f224939a;
        if (i != 0) {
            q0Var.b();
            return;
        }
        q0Var.getClass();
        this.f224941c.offer(obj2);
        q0Var.b();
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        if (lfm.d.e(this, cVar)) {
            if (cVar instanceof nfm.e) {
                nfm.e eVar = (nfm.e) cVar;
                int iB = eVar.b(3);
                if (iB == 1) {
                    this.e = iB;
                    this.f224941c = eVar;
                    this.d = true;
                    q0 q0Var = this.f224939a;
                    q0Var.getClass();
                    this.d = true;
                    q0Var.b();
                    return;
                }
                if (iB == 2) {
                    this.e = iB;
                    this.f224941c = eVar;
                    return;
                }
            }
            int i = -this.f224940b;
            this.f224941c = i < 0 ? new vfm.c(-i) : new vfm.b(i);
        }
    }
}
