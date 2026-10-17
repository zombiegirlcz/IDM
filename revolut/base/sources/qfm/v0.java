package qfm;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class v0 extends efm.i implements Callable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gif.c f245563b;

    public v0(gif.c cVar) {
        this.f245563b = cVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f245563b.call();
    }

    @Override // efm.i
    public final void o(dom.a aVar) {
        yfm.c cVar = new yfm.c(aVar);
        aVar.e(cVar);
        try {
            cVar.c(this.f245563b.call());
        } catch (Throwable th10) {
            m70.a.u(th10);
            if (cVar.get() == 4) {
                mo3.a.m(th10);
            } else {
                aVar.onError(th10);
            }
        }
    }
}
