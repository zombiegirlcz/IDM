package y45;

import ft3.d1;
import ft3.j1;
import grl.r2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes21.dex */
public final class o extends qx4.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f310811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xoj.a f310812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xq3.j f310813c;

    public o(i loanProductInteractor, xoj.a featuresInteractor, xq3.j creditApplicationInteractor) {
        Intrinsics.checkNotNullParameter(loanProductInteractor, "loanProductInteractor");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(creditApplicationInteractor, "creditApplicationInteractor");
        this.f310811a = loanProductInteractor;
        this.f310812b = featuresInteractor;
        this.f310813c = creditApplicationInteractor;
    }

    @Override // qx4.i
    public final Flow c(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return vkm.q.q(nim.a.v(vkm.q.Q(h(loadingStrategy), new x18.e((Continuation) null, this, 28)), new y25.d(27)));
    }

    @Override // qx4.i
    public final Flow d() {
        return vkm.q.q(nim.a.v(rd0.e.b(((cpj.b) this.f310812b).k(yoj.c.REFINANCING_MORTGAGE, yoj.d.DISABLED)), new y25.d(26)));
    }

    @Override // qx4.f
    public final Flow g(r2 origin, boolean z) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        return zi0.c.i(z ? o35.i.f221699a : o35.j.f221700a);
    }

    @Override // qx4.f
    public final Flow k(r2 origin) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        return nim.a.v(this.f310813c.k(mif.a.m(d1.Companion, j1.REFINANCING_MORTGAGE, null)), new o95.f(origin, 8));
    }
}
