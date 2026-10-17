package sgm;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class d2 extends AtomicReference implements fgm.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e2 f262762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f262763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile bhm.g f262764c;
    public int d;

    public d2(e2 e2Var) {
        this.f262762a = e2Var;
    }

    @Override // fgm.l
    public final void onComplete() {
        this.f262763b = true;
        this.f262762a.c();
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        if (this.f262762a.f262800h.a(th10)) {
            e2 e2Var = this.f262762a;
            if (!e2Var.f262798c) {
                e2Var.b();
            }
            this.f262763b = true;
            this.f262762a.c();
        }
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        if (this.d != 0) {
            this.f262762a.c();
            return;
        }
        e2 e2Var = this.f262762a;
        if (e2Var.get() == 0 && e2Var.compareAndSet(0, 1)) {
            e2Var.f262796a.onNext(obj2);
            if (e2Var.decrementAndGet() == 0) {
                return;
            }
        } else {
            bhm.g iVar = this.f262764c;
            if (iVar == null) {
                iVar = new bhm.i(e2Var.e);
                this.f262764c = iVar;
            }
            iVar.offer(obj2);
            if (e2Var.getAndIncrement() != 0) {
                return;
            }
        }
        e2Var.d();
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        if (jgm.b.e(this, disposable) && (disposable instanceof bhm.b)) {
            bhm.b bVar = (bhm.b) disposable;
            int iB = bVar.b(7);
            if (iB == 1) {
                this.d = iB;
                this.f262764c = bVar;
                this.f262763b = true;
                this.f262762a.c();
                return;
            }
            if (iB == 2) {
                this.d = iB;
                this.f262764c = bVar;
            }
        }
    }
}
