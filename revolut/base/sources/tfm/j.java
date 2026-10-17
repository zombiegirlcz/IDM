package tfm;

import java.util.Collection;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends efm.d0 implements nfm.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f270550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final efm.r f270551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f270552c;

    public /* synthetic */ j(efm.r rVar, Object obj2, int i) {
        this.f270550a = i;
        this.f270551b = rVar;
        this.f270552c = obj2;
    }

    @Override // nfm.d
    public final efm.r a() {
        switch (this.f270550a) {
            case 0:
                return new h(this.f270551b, (kfm.p) this.f270552c, 0);
            case 1:
                return new h(this.f270551b, (kfm.p) this.f270552c, 1);
            default:
                return new t0(this.f270551b, (Callable) this.f270552c, 4);
        }
    }

    @Override // efm.d0
    public final void r(efm.f0 f0Var) {
        switch (this.f270550a) {
            case 0:
                this.f270551b.subscribe(new i(f0Var, (kfm.p) this.f270552c, 0));
                break;
            case 1:
                this.f270551b.subscribe(new i(f0Var, (kfm.p) this.f270552c, 1));
                break;
            default:
                try {
                    Object objCall = ((Callable) this.f270552c).call();
                    mfm.f.b(objCall, "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
                    this.f270551b.subscribe(new o2(f0Var, (Collection) objCall, 4));
                } catch (Throwable th10) {
                    m70.a.u(th10);
                    lfm.e.e(th10, f0Var);
                    return;
                }
                break;
        }
    }

    public j(efm.r rVar, int i) {
        this.f270550a = 2;
        this.f270551b = rVar;
        this.f270552c = new mfm.a(i);
    }
}
