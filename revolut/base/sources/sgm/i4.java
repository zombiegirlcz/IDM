package sgm;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class i4 extends AtomicReference implements fgm.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f262905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f262906b;

    public /* synthetic */ i4(AtomicInteger atomicInteger, int i) {
        this.f262905a = i;
        this.f262906b = atomicInteger;
    }

    @Override // fgm.l
    public final void onComplete() {
        switch (this.f262905a) {
            case 0:
                j4 j4Var = (j4) this.f262906b;
                jgm.b.a(j4Var.f);
                yoj.b.r(j4Var.f262928b, j4Var, j4Var.d);
                break;
            case 1:
                j4 j4Var2 = (j4) this.f262906b;
                jgm.b.a(j4Var2.f);
                yoj.b.r(j4Var2.f262928b, j4Var2, j4Var2.d);
                break;
            case 2:
                b6 b6Var = (b6) this.f262906b;
                jgm.b.a(b6Var.f262723b);
                yoj.b.r(b6Var.f262722a, b6Var, b6Var.d);
                break;
            default:
                w6 w6Var = (w6) this.f262906b;
                w6Var.f263262m = true;
                w6Var.a();
                break;
        }
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        switch (this.f262905a) {
            case 0:
                j4 j4Var = (j4) this.f262906b;
                jgm.b.a(j4Var.f);
                yoj.b.t(j4Var.f262928b, th10, j4Var, j4Var.d);
                break;
            case 1:
                j4 j4Var2 = (j4) this.f262906b;
                jgm.b.a(j4Var2.f);
                yoj.b.t(j4Var2.f262928b, th10, j4Var2, j4Var2.d);
                break;
            case 2:
                b6 b6Var = (b6) this.f262906b;
                jgm.b.a(b6Var.f262723b);
                yoj.b.t(b6Var.f262722a, th10, b6Var, b6Var.d);
                break;
            default:
                w6 w6Var = (w6) this.f262906b;
                w6Var.o.dispose();
                w6Var.e.dispose();
                if (w6Var.f263263n.a(th10)) {
                    w6Var.f263261l = true;
                    w6Var.a();
                }
                break;
        }
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        switch (this.f262905a) {
            case 0:
                ((j4) this.f262906b).a();
                break;
            case 1:
                ((j4) this.f262906b).a();
                break;
            case 2:
                jgm.b.a(this);
                b6 b6Var = (b6) this.f262906b;
                jgm.b.a(b6Var.f262723b);
                yoj.b.r(b6Var.f262722a, b6Var, b6Var.d);
                break;
            default:
                w6 w6Var = (w6) this.f262906b;
                w6Var.f263259h.offer(new v6(obj2));
                w6Var.a();
                break;
        }
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        switch (this.f262905a) {
            case 0:
                jgm.b.e(this, disposable);
                break;
            case 1:
                jgm.b.e(this, disposable);
                break;
            case 2:
                jgm.b.e(this, disposable);
                break;
            default:
                jgm.b.e(this, disposable);
                break;
        }
    }

    public i4(w6 w6Var) {
        this.f262905a = 3;
        this.f262906b = w6Var;
    }
}
