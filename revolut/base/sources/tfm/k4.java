package tfm;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class k4 extends efm.d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f270591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final efm.r f270592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kfm.c f270593c;
    public final Object d;

    public /* synthetic */ k4(efm.r rVar, Object obj2, kfm.c cVar, int i) {
        this.f270591a = i;
        this.f270592b = rVar;
        this.d = obj2;
        this.f270593c = cVar;
    }

    @Override // efm.d0
    public final void r(efm.f0 f0Var) {
        switch (this.f270591a) {
            case 0:
                this.f270592b.subscribe(new ofm.k(f0Var, 2, this.f270593c, this.d));
                break;
            default:
                try {
                    Object objCall = ((Callable) this.d).call();
                    mfm.f.b(objCall, "The seedSupplier returned a null value");
                    this.f270592b.subscribe(new ofm.k(f0Var, 2, this.f270593c, objCall));
                } catch (Throwable th10) {
                    m70.a.u(th10);
                    lfm.e.e(th10, f0Var);
                    return;
                }
                break;
        }
    }
}
