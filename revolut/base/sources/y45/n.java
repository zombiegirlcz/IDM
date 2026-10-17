package y45;

import ft3.d1;
import ft3.j1;
import grl.r2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes21.dex */
public final class n extends qx4.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f310808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xoj.a f310809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xq3.j f310810c;

    public n(i loanProductInteractor, xoj.a featuresInteractor, xq3.j creditApplicationInteractor) {
        Intrinsics.checkNotNullParameter(loanProductInteractor, "loanProductInteractor");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(creditApplicationInteractor, "creditApplicationInteractor");
        this.f310808a = loanProductInteractor;
        this.f310809b = featuresInteractor;
        this.f310810c = creditApplicationInteractor;
    }

    @Override // qx4.i
    public final Flow c(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return vkm.q.q(nim.a.v(vkm.q.Q(h(loadingStrategy), new x18.e((Continuation) null, this, 27)), new y25.d(25)));
    }

    @Override // qx4.i
    public final Flow d() {
        return vkm.q.q(nim.a.v(rd0.e.b(((cpj.b) this.f310809b).k(yoj.c.MORTGAGE, yoj.d.DISABLED)), new y25.d(24)));
    }

    @Override // qx4.f
    public final Flow g(r2 origin, boolean z) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        return zi0.c.i(z ? o35.f.f221697a : o35.g.f221698a);
    }

    @Override // qx4.f
    public final Flow k(r2 origin) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        return nim.a.v(this.f310810c.k(mif.a.m(d1.Companion, j1.MORTGAGE, null)), new o95.f(origin, 7));
    }
}
