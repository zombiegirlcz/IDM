package tfm;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes13.dex */
public final class q2 extends efm.r implements Callable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Callable f270747g;

    public q2(Callable callable) {
        this.f270747g = callable;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Exception {
        Object objCall = this.f270747g.call();
        mfm.f.b(objCall, "The callable returned a null value");
        return objCall;
    }

    @Override // efm.r
    public final void subscribeActual(efm.y yVar) {
        ofm.j jVar = new ofm.j(yVar);
        yVar.onSubscribe(jVar);
        if (jVar.isDisposed()) {
            return;
        }
        try {
            Object objCall = this.f270747g.call();
            mfm.f.b(objCall, "Callable returned null");
            jVar.a(objCall);
        } catch (Throwable th10) {
            m70.a.u(th10);
            if (jVar.isDisposed()) {
                mo3.a.m(th10);
            } else {
                yVar.onError(th10);
            }
        }
    }
}
