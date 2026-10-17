package rfm;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes13.dex */
public final class d extends efm.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f253925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f253926b;

    public /* synthetic */ d(Object obj2, int i) {
        this.f253925a = i;
        this.f253926b = obj2;
    }

    @Override // efm.k
    public final void j(efm.l lVar) {
        switch (this.f253925a) {
            case 0:
                c cVar = new c(lVar);
                lVar.onSubscribe(cVar);
                try {
                    ((efm.m) this.f253926b).b(cVar);
                } catch (Throwable th10) {
                    m70.a.u(th10);
                    if (cVar.b(th10)) {
                        return;
                    }
                    mo3.a.m(th10);
                    return;
                }
                break;
            case 1:
                try {
                    Object objCall = ((Callable) this.f253926b).call();
                    mfm.f.b(objCall, "The maybeSupplier returned a null MaybeSource");
                    ((efm.k) ((efm.n) objCall)).i(lVar);
                } catch (Throwable th11) {
                    m70.a.u(th11);
                    lfm.e.c(th11, lVar);
                    return;
                }
                break;
            default:
                ((efm.d0) this.f253926b).q(new q(lVar, 0));
                break;
        }
    }
}
