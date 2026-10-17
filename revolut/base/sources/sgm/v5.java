package sgm;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class v5 extends AtomicReference implements fgm.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w5 f263225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f263226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f263227c;
    public volatile bhm.g d;
    public volatile boolean e;

    public v5(w5 w5Var, long j2, int i) {
        this.f263225a = w5Var;
        this.f263226b = j2;
        this.f263227c = i;
    }

    @Override // fgm.l
    public final void onComplete() {
        if (this.f263226b == this.f263225a.f263254j) {
            this.e = true;
            this.f263225a.a();
        }
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        w5 w5Var = this.f263225a;
        w5Var.getClass();
        if (this.f263226b == w5Var.f263254j) {
            ygm.c cVar = w5Var.e;
            cVar.getClass();
            if (ygm.g.a(cVar, th10)) {
                if (!w5Var.d) {
                    w5Var.f263253h.dispose();
                    w5Var.f = true;
                }
                this.e = true;
                w5Var.a();
                return;
            }
        }
        jb3.l.v(th10);
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        if (this.f263226b == this.f263225a.f263254j) {
            if (obj2 != null) {
                this.d.offer(obj2);
            }
            this.f263225a.a();
        }
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        if (jgm.b.e(this, disposable)) {
            if (disposable instanceof bhm.b) {
                bhm.b bVar = (bhm.b) disposable;
                int iB = bVar.b(7);
                if (iB == 1) {
                    this.d = bVar;
                    this.e = true;
                    this.f263225a.a();
                    return;
                } else if (iB == 2) {
                    this.d = bVar;
                    return;
                }
            }
            this.d = new bhm.i(this.f263227c);
        }
    }
}
