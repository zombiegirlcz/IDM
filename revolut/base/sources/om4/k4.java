package om4;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes22.dex */
public final class k4 extends qx4.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xq3.j f226621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final up3.b f226622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0 f226623c;

    public k4(xq3.j creditApplicationInteractor, up3.b creditFeatureAvailabilityInteractor, e0 creditCardFacilityExistsInteractor) {
        Intrinsics.checkNotNullParameter(creditApplicationInteractor, "creditApplicationInteractor");
        Intrinsics.checkNotNullParameter(creditFeatureAvailabilityInteractor, "creditFeatureAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(creditCardFacilityExistsInteractor, "creditCardFacilityExistsInteractor");
        this.f226621a = creditApplicationInteractor;
        this.f226622b = creditFeatureAvailabilityInteractor;
        this.f226623c = creditCardFacilityExistsInteractor;
    }

    @Override // qx4.i
    public final Flow c(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return n14.k.p(vkm.q.q(this.f226623c.a(loadingStrategy)), new l3(12));
    }

    @Override // qx4.i
    public final Flow d() {
        return ((xq3.q) this.f226622b).f(mif.a.m(ft3.d1.Companion, ft3.j1.FAMILY_CREDIT_CARD, null));
    }

    @Override // qx4.f
    public final Flow g(grl.r2 origin, boolean z) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        return zi0.c.i(z ? al4.r.f6147a : al4.s.f6148a);
    }

    @Override // qx4.f
    public final Flow k(grl.r2 origin) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        return vkm.q.q(nim.a.v(this.f226621a.k(mif.a.m(ft3.d1.Companion, ft3.j1.FAMILY_CREDIT_CARD, null)), new o95.f(origin, 3)));
    }

    public final cxe.u l(grl.r2 origin) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        return i(origin);
    }
}
