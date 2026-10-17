package rgm;

import efm.f0;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import sgm.q3;
import sgm.r3;
import tfm.t3;

/* JADX INFO: loaded from: classes14.dex */
public final class d extends AtomicReference implements fgm.b, fgm.e, fgm.p, efm.d, efm.l, f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f254234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f254235b;

    public /* synthetic */ d(AtomicInteger atomicInteger, int i) {
        this.f254234a = i;
        this.f254235b = atomicInteger;
    }

    @Override // fgm.b
    public void onComplete() {
        switch (this.f254234a) {
            case 0:
                e eVar = (e) this.f254235b;
                eVar.k = false;
                eVar.c();
                break;
            case 1:
                g gVar = (g) this.f254235b;
                gVar.f254243l = 0;
                gVar.c();
                break;
            case 2:
            default:
                t3 t3Var = (t3) this.f254235b;
                t3Var.i = 2;
                if (t3Var.getAndIncrement() == 0) {
                    t3Var.a();
                }
                break;
            case 3:
                sfm.e eVar2 = (sfm.e) this.f254235b;
                eVar2.i = false;
                eVar2.a();
                break;
            case 4:
                sfm.g gVar2 = (sfm.g) this.f254235b;
                gVar2.k = 0;
                gVar2.a();
                break;
            case 5:
                q3 q3Var = (q3) this.f254235b;
                q3Var.f = true;
                if (q3Var.e) {
                    yoj.b.r(q3Var.f263099a, q3Var, q3Var.d);
                }
                break;
            case 6:
                r3 r3Var = (r3) this.f254235b;
                r3Var.i = 2;
                if (r3Var.getAndIncrement() == 0) {
                    r3Var.a();
                }
                break;
        }
    }

    @Override // fgm.b, efm.f0
    public final void onError(Throwable th10) {
        switch (this.f254234a) {
            case 0:
                e eVar = (e) this.f254235b;
                if (eVar.f254230a.a(th10)) {
                    if (eVar.f254232c != ygm.f.END) {
                        eVar.e.dispose();
                    }
                    eVar.k = false;
                    eVar.c();
                }
                break;
            case 1:
                g gVar = (g) this.f254235b;
                if (gVar.f254230a.a(th10)) {
                    if (gVar.f254232c != ygm.f.END) {
                        gVar.e.dispose();
                    }
                    gVar.f254243l = 0;
                    gVar.c();
                }
                break;
            case 2:
                g gVar2 = (g) this.f254235b;
                if (gVar2.f254230a.a(th10)) {
                    if (gVar2.f254232c != ygm.f.END) {
                        gVar2.e.dispose();
                    }
                    gVar2.f254243l = 0;
                    gVar2.c();
                }
                break;
            case 3:
                sfm.e eVar2 = (sfm.e) this.f254235b;
                zfm.c cVar = eVar2.d;
                cVar.getClass();
                if (!zfm.h.a(cVar, th10)) {
                    mo3.a.m(th10);
                } else if (eVar2.f262512c != zfm.f.IMMEDIATE) {
                    eVar2.i = false;
                    eVar2.a();
                } else {
                    eVar2.k = true;
                    eVar2.f262514h.dispose();
                    zfm.c cVar2 = eVar2.d;
                    cVar2.getClass();
                    Throwable thB = zfm.h.b(cVar2);
                    if (thB != zfm.h.f322035a) {
                        eVar2.f262510a.onError(thB);
                    }
                    if (eVar2.getAndIncrement() == 0) {
                        eVar2.f262513g.clear();
                    }
                }
                break;
            case 4:
                sfm.g gVar3 = (sfm.g) this.f254235b;
                zfm.c cVar3 = gVar3.f262521c;
                cVar3.getClass();
                if (!zfm.h.a(cVar3, th10)) {
                    mo3.a.m(th10);
                } else {
                    if (gVar3.f != zfm.f.END) {
                        gVar3.f262522g.dispose();
                    }
                    gVar3.k = 0;
                    gVar3.a();
                }
                break;
            case 5:
                q3 q3Var = (q3) this.f254235b;
                jgm.b.a(q3Var.f263100b);
                yoj.b.t(q3Var.f263099a, th10, q3Var, q3Var.d);
                break;
            case 6:
                r3 r3Var = (r3) this.f254235b;
                if (r3Var.d.a(th10)) {
                    jgm.b.a(r3Var.f263122c);
                    if (r3Var.getAndIncrement() == 0) {
                        r3Var.a();
                    }
                }
                break;
            case 7:
                r3 r3Var2 = (r3) this.f254235b;
                if (r3Var2.d.a(th10)) {
                    jgm.b.a(r3Var2.f263122c);
                    if (r3Var2.getAndIncrement() == 0) {
                        r3Var2.a();
                    }
                }
                break;
            case 8:
                t3 t3Var = (t3) this.f254235b;
                zfm.c cVar4 = t3Var.d;
                cVar4.getClass();
                if (!zfm.h.a(cVar4, th10)) {
                    mo3.a.m(th10);
                } else {
                    lfm.d.a(t3Var.f270837c);
                    if (t3Var.getAndIncrement() == 0) {
                        t3Var.a();
                    }
                }
                break;
            default:
                t3 t3Var2 = (t3) this.f254235b;
                zfm.c cVar5 = t3Var2.d;
                cVar5.getClass();
                if (!zfm.h.a(cVar5, th10)) {
                    mo3.a.m(th10);
                } else {
                    lfm.d.a(t3Var2.f270837c);
                    if (t3Var2.getAndIncrement() == 0) {
                        t3Var2.a();
                    }
                }
                break;
        }
    }

    @Override // fgm.b
    public void onSubscribe(Disposable disposable) {
        switch (this.f254234a) {
            case 0:
                jgm.b.c(this, disposable);
                break;
            case 1:
                jgm.b.c(this, disposable);
                break;
            case 2:
                jgm.b.c(this, disposable);
                break;
            case 3:
            case 4:
            default:
                jgm.b.e(this, disposable);
                break;
            case 5:
                jgm.b.e(this, disposable);
                break;
            case 6:
                jgm.b.e(this, disposable);
                break;
        }
    }

    @Override // fgm.e, fgm.p
    public void onSuccess(Object obj2) {
        switch (this.f254234a) {
            case 1:
                g gVar = (g) this.f254235b;
                gVar.k = obj2;
                gVar.f254243l = 2;
                gVar.c();
                break;
            case 2:
                g gVar2 = (g) this.f254235b;
                gVar2.k = obj2;
                gVar2.f254243l = 2;
                gVar2.c();
                break;
            case 3:
            case 5:
            default:
                t3 t3Var = (t3) this.f254235b;
                if (t3Var.compareAndSet(0, 1)) {
                    t3Var.f270836b.onNext(obj2);
                    t3Var.i = 2;
                } else {
                    t3Var.f = obj2;
                    t3Var.i = 1;
                    if (t3Var.getAndIncrement() != 0) {
                    }
                }
                t3Var.a();
                break;
            case 4:
                sfm.g gVar3 = (sfm.g) this.f254235b;
                gVar3.f262524j = obj2;
                gVar3.k = 2;
                gVar3.a();
                break;
            case 6:
                r3 r3Var = (r3) this.f254235b;
                if (r3Var.compareAndSet(0, 1)) {
                    r3Var.f263121b.onNext(obj2);
                    r3Var.i = 2;
                } else {
                    r3Var.f = obj2;
                    r3Var.i = 1;
                    if (r3Var.getAndIncrement() != 0) {
                    }
                }
                r3Var.a();
                break;
            case 7:
                r3 r3Var2 = (r3) this.f254235b;
                if (r3Var2.compareAndSet(0, 1)) {
                    r3Var2.f263121b.onNext(obj2);
                    r3Var2.i = 2;
                } else {
                    r3Var2.f = obj2;
                    r3Var2.i = 1;
                    if (r3Var2.getAndIncrement() != 0) {
                    }
                }
                r3Var2.a();
                break;
            case 8:
                t3 t3Var2 = (t3) this.f254235b;
                if (t3Var2.compareAndSet(0, 1)) {
                    t3Var2.f270836b.onNext(obj2);
                    t3Var2.i = 2;
                } else {
                    t3Var2.f = obj2;
                    t3Var2.i = 1;
                    if (t3Var2.getAndIncrement() != 0) {
                    }
                }
                t3Var2.a();
                break;
        }
    }

    @Override // efm.d
    public void onSubscribe(ifm.c cVar) {
        switch (this.f254234a) {
            case 3:
                lfm.d.c(this, cVar);
                break;
            case 4:
                lfm.d.c(this, cVar);
                break;
            case 5:
            case 6:
            case 7:
            default:
                lfm.d.e(this, cVar);
                break;
            case 8:
                lfm.d.e(this, cVar);
                break;
        }
    }
}
