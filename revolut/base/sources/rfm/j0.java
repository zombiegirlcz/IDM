package rfm;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes13.dex */
public final class j0 extends AtomicReference implements efm.l, efm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f253956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f253957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicInteger f253958c;

    public /* synthetic */ j0(AtomicInteger atomicInteger, int i, int i2) {
        this.f253956a = i2;
        this.f253958c = atomicInteger;
        this.f253957b = i;
    }

    @Override // efm.l
    public void onComplete() {
        i0 i0Var = (i0) this.f253958c;
        if (i0Var.getAndSet(0) > 0) {
            i0Var.a(this.f253957b);
            ((efm.l) i0Var.d).onComplete();
        }
    }

    @Override // efm.l
    public final void onError(Throwable th10) {
        switch (this.f253956a) {
            case 0:
                i0 i0Var = (i0) this.f253958c;
                if (i0Var.getAndSet(0) <= 0) {
                    mo3.a.m(th10);
                } else {
                    i0Var.a(this.f253957b);
                    ((efm.l) i0Var.d).onError(th10);
                }
                break;
            default:
                ((i0) this.f253958c).b(this.f253957b, th10);
                break;
        }
    }

    @Override // efm.l
    public final void onSubscribe(ifm.c cVar) {
        switch (this.f253956a) {
            case 0:
                lfm.d.e(this, cVar);
                break;
            default:
                lfm.d.e(this, cVar);
                break;
        }
    }

    @Override // efm.l, efm.f0
    public final void onSuccess(Object obj2) {
        switch (this.f253956a) {
            case 0:
                i0 i0Var = (i0) this.f253958c;
                efm.l lVar = (efm.l) i0Var.d;
                Object[] objArr = i0Var.f253952c;
                objArr[this.f253957b] = obj2;
                if (i0Var.decrementAndGet() == 0) {
                    try {
                        Object objApply = i0Var.f253951b.apply(objArr);
                        mfm.f.b(objApply, "The zipper returned a null value");
                        lVar.onSuccess(objApply);
                    } catch (Throwable th10) {
                        m70.a.u(th10);
                        lVar.onError(th10);
                        return;
                    }
                }
                break;
            default:
                i0 i0Var2 = (i0) this.f253958c;
                efm.f0 f0Var = (efm.f0) i0Var2.d;
                Object[] objArr2 = i0Var2.f253952c;
                objArr2[this.f253957b] = obj2;
                if (i0Var2.decrementAndGet() == 0) {
                    try {
                        Object objApply2 = i0Var2.f253951b.apply(objArr2);
                        mfm.f.b(objApply2, "The zipper returned a null value");
                        f0Var.onSuccess(objApply2);
                    } catch (Throwable th11) {
                        m70.a.u(th11);
                        f0Var.onError(th11);
                    }
                }
                break;
        }
    }
}
