package rfm;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes13.dex */
public final class o extends efm.k implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Callable f253968a;

    public o(Callable callable) {
        this.f253968a = callable;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f253968a.call();
    }

    @Override // efm.k
    public final void j(efm.l lVar) {
        ifm.a aVar = new ifm.a(mfm.f.f205042b, 1);
        lVar.onSubscribe(aVar);
        if (aVar.isDisposed()) {
            return;
        }
        try {
            Object objCall = this.f253968a.call();
            if (aVar.isDisposed()) {
                return;
            }
            if (objCall == null) {
                lVar.onComplete();
            } else {
                lVar.onSuccess(objCall);
            }
        } catch (Throwable th10) {
            m70.a.u(th10);
            if (aVar.isDisposed()) {
                mo3.a.m(th10);
            } else {
                lVar.onError(th10);
            }
        }
    }
}
