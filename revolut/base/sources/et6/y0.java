package et6;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.freelancer.common.models.FreelancerCashbackRates;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes3.dex */
public final class y0 implements gr6.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final au6.l0 f129380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ffk.t f129381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wsg.n f129382c;

    public y0(au6.l0 repository, ffk.t pricingPlanInteractor, wsg.n walletInteractor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.f129380a = repository;
        this.f129381b = pricingPlanInteractor;
        this.f129382c = walletInteractor;
    }

    public static BigDecimal a(FreelancerCashbackRates freelancerCashbackRates, String str) {
        BigDecimal value = (BigDecimal) freelancerCashbackRates.f73279a.get(str);
        if (value == null) {
            value = BigDecimal.ZERO;
        }
        Intrinsics.h(value);
        Intrinsics.checkNotNullParameter(value, "value");
        return value;
    }

    public final akg.n b() {
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        akg.n nVarD = d();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(zh9.u0.m(nVarD, nim.a.A(nim.a.v(c(loadingStrategy), new w(5)), new w(6))), v0.f129352a);
    }

    public final vkm.y c(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        au6.l0 l0Var = this.f129380a;
        l0Var.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        x4l.c cVar = l0Var.f9565g;
        Unit unit = Unit.f186387a;
        vkm.d dVarB = cVar.b(unit, loadingStrategy);
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        l0Var.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return rd0.e.e(nim.a.v(zh9.u0.m(dVarB, l0Var.f9566h.b(unit, loadingStrategy)), new w(7)), zhm.h0.f322473a, new a82.q(3, 17, null));
    }

    public final akg.n d() {
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(zh9.u0.m(rd0.e.b(this.f129381b.q()), g(loadingStrategy)), new w(this, 11));
    }

    public final akg.n e(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        au6.l0 l0Var = this.f129380a;
        l0Var.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(zh9.u0.m(l0Var.f.b(Unit.f186387a, loadingStrategy), nim.a.A(nim.a.v(c(loadingStrategy), new w(8)), new w(9))), new w(10));
    }

    public final Flow f(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return xam.a.h(new chf.a(this, loadingStrategy, null, 24), rd0.e.b(this.f129382c.J(AccountId.Personal.f51414a, loadingStrategy)));
    }

    public final vkm.d g(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        au6.l0 l0Var = this.f129380a;
        l0Var.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return l0Var.e.b(Unit.f186387a, loadingStrategy);
    }

    public final akg.n h() {
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(zh9.u0.i(rd0.e.b(this.f129381b.o()), g(loadingStrategy), e(loadingStrategy)), new w(this, 14));
    }

    public final akg.n i() {
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        akg.n nVarV = nim.a.v(zh9.u0.m(rd0.e.b(this.f129381b.n()), g(loadingStrategy)), new w(12));
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(zh9.u0.m(nVarV, nim.a.A(nim.a.v(c(loadingStrategy), new w(5)), new w(6))), new w(13));
    }
}
