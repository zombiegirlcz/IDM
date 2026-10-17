package sgm;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class m0 extends AtomicReference implements fgm.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f262988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fgm.l f262989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicInteger f262990c;

    public /* synthetic */ m0(fgm.l lVar, AtomicInteger atomicInteger, int i) {
        this.f262988a = i;
        this.f262989b = lVar;
        this.f262990c = atomicInteger;
    }

    @Override // fgm.l
    public final void onComplete() {
        switch (this.f262988a) {
            case 0:
                n0 n0Var = (n0) this.f262990c;
                n0Var.i = false;
                n0Var.a();
                break;
            case 1:
                o0 o0Var = (o0) this.f262990c;
                o0Var.f263037g = false;
                o0Var.a();
                break;
            case 2:
                s0 s0Var = (s0) this.f262990c;
                s0Var.f263139j = false;
                s0Var.a();
                break;
            default:
                t0 t0Var = (t0) this.f262990c;
                t0Var.f263171h = false;
                if (t0Var.getAndIncrement() == 0) {
                    t0Var.e.b(t0Var);
                    break;
                }
                break;
        }
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        switch (this.f262988a) {
            case 0:
                n0 n0Var = (n0) this.f262990c;
                if (n0Var.d.a(th10)) {
                    if (!n0Var.f) {
                        n0Var.f263014h.dispose();
                    }
                    n0Var.i = false;
                    n0Var.a();
                }
                break;
            case 1:
                ((o0) this.f262990c).dispose();
                ((ahm.c) this.f262989b).onError(th10);
                break;
            case 2:
                s0 s0Var = (s0) this.f262990c;
                if (s0Var.d.a(th10)) {
                    if (!s0Var.f) {
                        s0Var.i.dispose();
                    }
                    s0Var.f263139j = false;
                    s0Var.a();
                }
                break;
            default:
                ((t0) this.f262990c).dispose();
                ((ahm.c) this.f262989b).onError(th10);
                break;
        }
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        switch (this.f262988a) {
            case 0:
                this.f262989b.onNext(obj2);
                break;
            case 1:
                ((ahm.c) this.f262989b).onNext(obj2);
                break;
            case 2:
                this.f262989b.onNext(obj2);
                break;
            default:
                ((ahm.c) this.f262989b).onNext(obj2);
                break;
        }
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        switch (this.f262988a) {
            case 0:
                jgm.b.c(this, disposable);
                break;
            case 1:
                jgm.b.c(this, disposable);
                break;
            case 2:
                jgm.b.c(this, disposable);
                break;
            default:
                jgm.b.c(this, disposable);
                break;
        }
    }
}
