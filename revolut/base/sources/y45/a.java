package y45;

import ft3.d1;
import ft3.j1;
import grl.r2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends qx4.f implements l35.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f310787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final up3.b f310788b;

    public a(i loanProductInteractor, up3.b creditFeatureAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(loanProductInteractor, "loanProductInteractor");
        Intrinsics.checkNotNullParameter(creditFeatureAvailabilityInteractor, "creditFeatureAvailabilityInteractor");
        this.f310787a = loanProductInteractor;
        this.f310788b = creditFeatureAvailabilityInteractor;
    }

    @Override // qx4.i
    public final Flow c(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return vkm.q.q(nim.a.v(vkm.q.Q(h(loadingStrategy), new x18.e((Continuation) null, this, 25)), new y25.d(10)));
    }

    @Override // qx4.i
    public final Flow d() {
        return vkm.q.q(((xq3.q) this.f310788b).f(mif.a.m(d1.Companion, j1.NON_EMBEDDED_CREDIT_INSURANCE_FTC, null)));
    }

    @Override // qx4.f
    public final Flow g(r2 origin, boolean z) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        return zi0.c.i(z ? o35.a.f221692a : o35.b.f221693a);
    }

    @Override // qx4.f
    public final Flow k(r2 origin) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        return vkm.q.q(nim.a.v(rd0.e.b(this.f310787a.d(w4l.h.f294642c)), new y25.d(9)));
    }
}
