package ngm;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;
import sgm.q0;

/* JADX INFO: loaded from: classes14.dex */
public final class m extends AtomicReference implements fgm.l, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q0 f215258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f215259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public bhm.g f215260c;
    public volatile boolean d;
    public int e;

    public m(q0 q0Var, int i) {
        this.f215258a = q0Var;
        this.f215259b = i;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        jgm.b.a(this);
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return jgm.b.b((Disposable) get());
    }

    @Override // fgm.l
    public final void onComplete() {
        q0 q0Var = this.f215258a;
        q0Var.getClass();
        this.d = true;
        q0Var.b();
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        q0 q0Var = this.f215258a;
        if (q0Var.f.a(th10)) {
            if (q0Var.e == ygm.f.IMMEDIATE) {
                q0Var.i.dispose();
            }
            this.d = true;
            q0Var.b();
        }
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        int i = this.e;
        q0 q0Var = this.f215258a;
        if (i != 0) {
            q0Var.b();
            return;
        }
        q0Var.getClass();
        this.f215260c.offer(obj2);
        q0Var.b();
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        if (jgm.b.e(this, disposable)) {
            if (disposable instanceof bhm.b) {
                bhm.b bVar = (bhm.b) disposable;
                int iB = bVar.b(3);
                if (iB == 1) {
                    this.e = iB;
                    this.f215260c = bVar;
                    this.d = true;
                    q0 q0Var = this.f215258a;
                    q0Var.getClass();
                    this.d = true;
                    q0Var.b();
                    return;
                }
                if (iB == 2) {
                    this.e = iB;
                    this.f215260c = bVar;
                    return;
                }
            }
            int i = -this.f215259b;
            this.f215260c = i < 0 ? new bhm.i(-i) : new bhm.h(i);
        }
    }
}
