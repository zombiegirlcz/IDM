package rfm;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends efm.k implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kfm.a f253967a;

    public n(kfm.a aVar) {
        this.f253967a = aVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        this.f253967a.run();
        return null;
    }

    @Override // efm.k
    public final void j(efm.l lVar) {
        ifm.a aVar = new ifm.a(mfm.f.f205042b, 1);
        lVar.onSubscribe(aVar);
        if (aVar.isDisposed()) {
            return;
        }
        try {
            this.f253967a.run();
            if (aVar.isDisposed()) {
                return;
            }
            lVar.onComplete();
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
