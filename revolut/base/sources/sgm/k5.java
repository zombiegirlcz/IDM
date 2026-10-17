package sgm;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes14.dex */
public final class k5 implements fgm.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f262965a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bhm.i f262966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f262967c;
    public volatile boolean d;
    public Throwable e;
    public final AtomicInteger f;

    public k5(j5 j5Var, int i, int i2) {
        this.f = j5Var;
        this.f262967c = i;
        this.f262966b = new bhm.i(i2);
    }

    @Override // fgm.l
    public final void onComplete() {
        switch (this.f262965a) {
            case 0:
                this.d = true;
                ((j5) this.f).a();
                break;
            default:
                this.d = true;
                ((j5) this.f).a();
                break;
        }
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        switch (this.f262965a) {
            case 0:
                this.e = th10;
                this.d = true;
                ((j5) this.f).a();
                break;
            default:
                this.e = th10;
                this.d = true;
                ((j5) this.f).a();
                break;
        }
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        switch (this.f262965a) {
            case 0:
                this.f262966b.offer(obj2);
                ((j5) this.f).a();
                break;
            default:
                this.f262966b.offer(obj2);
                ((j5) this.f).a();
                break;
        }
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        switch (this.f262965a) {
            case 0:
                j5 j5Var = (j5) this.f;
                j5Var.f262934c.a(this.f262967c, disposable);
                break;
            default:
                j5 j5Var2 = (j5) this.f;
                j5Var2.f262934c.a(this.f262967c, disposable);
                break;
        }
    }

    public k5(j5 j5Var, int i, int i2, byte b4) {
        this.f = j5Var;
        this.f262967c = i;
        this.f262966b = new bhm.i(i2);
    }
}
