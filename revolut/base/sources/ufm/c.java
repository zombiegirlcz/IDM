package ufm;

import efm.d0;
import efm.f0;
import efm.h0;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes13.dex */
public final class c extends d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f279873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Callable f279874b;

    public /* synthetic */ c(Callable callable, int i) {
        this.f279873a = i;
        this.f279874b = callable;
    }

    @Override // efm.d0
    public final void r(f0 f0Var) {
        switch (this.f279873a) {
            case 0:
                try {
                    Object objCall = this.f279874b.call();
                    mfm.f.b(objCall, "The singleSupplier returned a null SingleSource");
                    ((d0) ((h0) objCall)).q(f0Var);
                } catch (Throwable th10) {
                    m70.a.u(th10);
                    lfm.e.e(th10, f0Var);
                    return;
                }
                break;
            case 1:
                try {
                    Object objCall2 = this.f279874b.call();
                    mfm.f.b(objCall2, "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
                    th = (Throwable) objCall2;
                } catch (Throwable th11) {
                    th = th11;
                    m70.a.u(th);
                }
                lfm.e.e(th, f0Var);
                break;
            default:
                ifm.a aVar = new ifm.a(mfm.f.f205042b, 1);
                f0Var.onSubscribe(aVar);
                if (!aVar.isDisposed()) {
                    try {
                        Object objCall3 = this.f279874b.call();
                        mfm.f.b(objCall3, "The callable returned a null value");
                        if (!aVar.isDisposed()) {
                            f0Var.onSuccess(objCall3);
                        }
                        break;
                    } catch (Throwable th12) {
                        m70.a.u(th12);
                        if (!aVar.isDisposed()) {
                            f0Var.onError(th12);
                            return;
                        }
                        mo3.a.m(th12);
                    }
                }
                break;
        }
    }
}
