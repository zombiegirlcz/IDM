package js7;

import al4.q;
import ft3.d1;
import ft3.j1;
import grl.r2;
import im9.h;
import iw6.l;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import om4.y3;
import w4l.k;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends qx4.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f178152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final up3.b f178153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f178154c;

    public d(q creditCardProductInteractor, up3.b creditFeatureAvailabilityInteractor, f creditInsuranceStateInteractor) {
        Intrinsics.checkNotNullParameter(creditCardProductInteractor, "creditCardProductInteractor");
        Intrinsics.checkNotNullParameter(creditFeatureAvailabilityInteractor, "creditFeatureAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(creditInsuranceStateInteractor, "creditInsuranceStateInteractor");
        this.f178152a = creditCardProductInteractor;
        this.f178153b = creditFeatureAvailabilityInteractor;
        this.f178154c = creditInsuranceStateInteractor;
    }

    @Override // qx4.i
    public final Flow c(k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Continuation continuation = null;
        return vkm.q.q(xam.a.h(new h(this, new jpl.e(14), continuation, 8), vkm.q.Q(h(loadingStrategy), new l(continuation, this, 25))));
    }

    @Override // qx4.i
    public final Flow d() {
        return vkm.q.q(((xq3.q) this.f178153b).f(mif.a.m(d1.Companion, j1.NON_EMBEDDED_CREDIT_INSURANCE_CC, null)));
    }

    @Override // qx4.f
    public final Flow g(r2 origin, boolean z) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        return zi0.c.i(z ? o35.a.f221692a : o35.b.f221693a);
    }

    @Override // qx4.f
    public final Flow k(r2 origin) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        return vkm.q.q(xam.a.h(new h(this, new jpl.e(15), (Continuation) null, 8), ((y3) this.f178152a).e(w4l.h.f294642c, true)));
    }
}
