package pfm;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends efm.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f235745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f235746b;

    public /* synthetic */ n(Object obj2, int i) {
        this.f235745a = i;
        this.f235746b = obj2;
    }

    @Override // efm.b
    public final void x(efm.d dVar) {
        switch (this.f235745a) {
            case 0:
                Throwable th10 = (Throwable) this.f235746b;
                dVar.onSubscribe(lfm.e.INSTANCE);
                dVar.onError(th10);
                break;
            case 1:
                ifm.a aVar = new ifm.a(mfm.f.f205042b, 1);
                dVar.onSubscribe(aVar);
                try {
                    ((Callable) this.f235746b).call();
                    if (!aVar.isDisposed()) {
                        dVar.onComplete();
                    }
                    break;
                } catch (Throwable th11) {
                    m70.a.u(th11);
                    if (aVar.isDisposed()) {
                        mo3.a.m(th11);
                        return;
                    } else {
                        dVar.onError(th11);
                        return;
                    }
                }
                break;
            default:
                ((efm.f) this.f235746b).d(dVar);
                break;
        }
    }
}
