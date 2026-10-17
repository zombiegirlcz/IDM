package plh;

import ael.h0;
import b1c.o;
import cfl.p;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.q;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements mf1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tzg.m f237404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ybl.l f237405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tzg.c f237406c;
    public final tih.d d;
    public final ybl.i e;

    public g(tzg.m wealthAccountsInteractor, ybl.l tradingConfigInteractor, tzg.c etpProductAvailabilityInteractor, tih.d investProductFeature, ybl.i tradingAccountProductGroupAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(etpProductAvailabilityInteractor, "etpProductAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(investProductFeature, "investProductFeature");
        Intrinsics.checkNotNullParameter(tradingAccountProductGroupAvailabilityInteractor, "tradingAccountProductGroupAvailabilityInteractor");
        this.f237404a = wealthAccountsInteractor;
        this.f237405b = tradingConfigInteractor;
        this.f237406c = etpProductAvailabilityInteractor;
        this.d = investProductFeature;
        this.e = tradingAccountProductGroupAvailabilityInteractor;
    }

    public static final Object c(g gVar, p pVar, gim.i iVar) {
        akg.n nVarV = nim.a.v(((h0) gVar.e).b(pVar), new pj9.n(20));
        zhm.h0 h0Var = zhm.h0.f322473a;
        return q.x(rd0.e.e(mo3.a.g(rd0.e.n(nVarV, h0Var), null, new pj9.m(13), 1), h0Var, new otd.a(3, 9, null)), iVar);
    }

    @Override // mf1.a
    public final Flow a() {
        Continuation continuation = null;
        return rd0.e.e(new pkg.e(ta6.a.h(ybl.l.d(this.f237405b), ((x8h.m) this.f237406c).b(), tzg.m.c(this.f237404a, null, cfl.k.f23744a, 1), new o(4, 2, continuation)), this, 2), m72.b.w("InvestAddNewProductCategoryItemSource", "addNewProductCategoryItemFlow"), new otd.a(3, 8, continuation));
    }

    @Override // mf1.a
    public final String b() {
        return null;
    }
}
