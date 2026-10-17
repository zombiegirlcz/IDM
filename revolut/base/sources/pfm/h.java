package pfm;

import efm.d0;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes13.dex */
public final class h extends efm.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f235730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f235731b;

    public /* synthetic */ h(Object obj2, int i) {
        this.f235730a = i;
        this.f235731b = obj2;
    }

    @Override // efm.b
    public final void x(efm.d dVar) {
        switch (this.f235730a) {
            case 0:
                g gVar = new g(dVar);
                dVar.onSubscribe(gVar);
                try {
                    ((efm.e) this.f235731b).d(gVar);
                } catch (Throwable th10) {
                    m70.a.u(th10);
                    gVar.onError(th10);
                    return;
                }
                break;
            case 1:
                try {
                    Object objCall = ((Callable) this.f235731b).call();
                    mfm.f.b(objCall, "The completableSupplier returned a null CompletableSource");
                    ((efm.f) objCall).d(dVar);
                } catch (Throwable th11) {
                    m70.a.u(th11);
                    dVar.onSubscribe(lfm.e.INSTANCE);
                    dVar.onError(th11);
                    return;
                }
                break;
            case 2:
                ifm.c aVar = new ifm.a(mfm.f.f205042b, 1);
                dVar.onSubscribe(aVar);
                try {
                    ((kfm.a) this.f235731b).run();
                    if (!aVar.isDisposed()) {
                        dVar.onComplete();
                    }
                    break;
                } catch (Throwable th12) {
                    m70.a.u(th12);
                    if (aVar.isDisposed()) {
                        mo3.a.m(th12);
                        return;
                    } else {
                        dVar.onError(th12);
                        return;
                    }
                }
                break;
            case 3:
                ((qfm.a) this.f235731b).a(new o(dVar, 0));
                break;
            default:
                ((d0) this.f235731b).q(new a31.a(dVar, 19));
                break;
        }
    }
}
