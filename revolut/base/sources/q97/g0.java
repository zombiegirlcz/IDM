package q97;

import kotlin.jvm.internal.Intrinsics;
import om4.s3;
import om4.y3;

/* JADX INFO: loaded from: classes21.dex */
public final class g0 implements p97.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f243693a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f243694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f243695c;
    public final Object d;

    public g0(t97.c productCellProvider, ffk.t pricingPlanInteractor, ajk.f pricingPlanNavigationCommandsProvider, yik.h pricingPlanStringMapper) {
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanNavigationCommandsProvider, "pricingPlanNavigationCommandsProvider");
        Intrinsics.checkNotNullParameter(pricingPlanStringMapper, "pricingPlanStringMapper");
        this.f243694b = pricingPlanInteractor;
        this.f243695c = pricingPlanNavigationCommandsProvider;
        this.d = pricingPlanStringMapper;
    }

    @Override // p97.c
    public final boolean a(p97.b id10) {
        switch (this.f243693a) {
            case 0:
                Intrinsics.checkNotNullParameter(id10, "id");
                t97.d[] elements = {t97.d.CREDIT_CARD, t97.d.BALANCE_TRANSFER_CREDIT_CARD, t97.d.SECURED_CREDIT_CARD, t97.d.CREDIT_BUILDER_CARD};
                Intrinsics.checkNotNullParameter(elements, "elements");
                return zhm.d0.T(kotlin.collections.d.y0(elements), id10);
            case 1:
                Intrinsics.checkNotNullParameter(id10, "id");
                return id10 == t97.d.JOINT_ACCOUNT;
            default:
                Intrinsics.checkNotNullParameter(id10, "id");
                return id10 == t97.d.PRICING_PLAN;
        }
    }

    @Override // p97.c
    public final efm.r b() {
        switch (this.f243693a) {
            case 0:
                al4.l lVar = (al4.l) this.f243694b;
                grl.r2 origin = grl.r2.GLOBAL_SEARCH;
                om4.u0 u0Var = (om4.u0) lVar;
                Intrinsics.checkNotNullParameter(origin, "origin");
                return rd0.e.c(new pkg.e(vkm.q.q(vkm.q.Q(new vkm.y(mo3.a.g(rd0.e.n(((s3) u0Var.f226709c).d(), zhm.h0.f322473a), null, new ol6.b(8), 1), new n28.b(3, 20, null)), new om4.r0(null, u0Var, origin, 0))), this, 15), kotlin.coroutines.g.f186406a);
            case 1:
                efm.r rVarCombineLatest = efm.r.combineLatest(te0.w.o0(skm.p0.f264003c, new pwb.p(this, null, 20)).x(), ((ang.f) this.d).f(false).x(), m70.a.g(hng.g.b(((ang.b) ((l61.a) this.f243695c)).f7765a), null, new q92.f(11), 1).map(new j0(new h(23), 17)), new j0(new pv7.t(this, 15), 18));
                Intrinsics.checkNotNullExpressionValue(rVarCombineLatest, "combineLatest(...)");
                return rVarCombineLatest;
            default:
                efm.r map = zi0.c.J(((ffk.t) this.f243694b).v(w4l.h.f294642c)).map(new j0(new q56.o(this, 19), 28));
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                return m70.a.g(map, null, new q92.f(25), 1);
        }
    }

    @Override // p97.c
    public final efm.d0 c(p97.a productCell) {
        switch (this.f243693a) {
            case 0:
                Intrinsics.checkNotNullParameter(productCell, "productCell");
                efm.d0 d0VarFirstOrError = rd0.e.c(new mle.x(mo3.a.g(nim.a.v(((y3) ((al4.q) this.f243695c)).e(w4l.j.f294644c, true), new h(7)), null, new q92.f(6), 1), this, productCell, 12), kotlin.coroutines.g.f186406a).firstOrError();
                Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
                return ue0.e.t(d0VarFirstOrError, zhm.h0.f322473a);
            case 1:
                Intrinsics.checkNotNullParameter(productCell, "productCell");
                if (productCell.f234280a != t97.d.JOINT_ACCOUNT) {
                    throw new IllegalArgumentException(prk.o.q("Unsupported: ", productCell.f234280a));
                }
                ufm.b bVarM = efm.d0.m(new o97.c("revolut://app/joint-accounts/home"));
                Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                return bVarM;
            default:
                Intrinsics.checkNotNullParameter(productCell, "productCell");
                if (productCell.f234280a != t97.d.PRICING_PLAN) {
                    throw new IllegalArgumentException(prk.o.q("Unsupported: ", productCell.f234280a));
                }
                ufm.b bVarM2 = efm.d0.m(new o97.l(((ajk.f) this.f243695c).b()));
                Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
                return bVarM2;
        }
    }

    public g0(t97.c productCellProvider, g48.r0 jointAccountsInteractor, l61.a userCompanyInteractor, ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f243694b = jointAccountsInteractor;
        this.f243695c = userCompanyInteractor;
        this.d = userInteractor;
    }

    public g0(t97.c productCellProvider, al4.l creditCardGlobalSearchEntryPointInteractor, al4.q creditCardProductInteractor, gz3.a startCreditApplicationNavigationDestinationProvider) {
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        Intrinsics.checkNotNullParameter(creditCardGlobalSearchEntryPointInteractor, "creditCardGlobalSearchEntryPointInteractor");
        Intrinsics.checkNotNullParameter(creditCardProductInteractor, "creditCardProductInteractor");
        Intrinsics.checkNotNullParameter(startCreditApplicationNavigationDestinationProvider, "startCreditApplicationNavigationDestinationProvider");
        this.f243694b = creditCardGlobalSearchEntryPointInteractor;
        this.f243695c = creditCardProductInteractor;
        this.d = startCreditApplicationNavigationDestinationProvider;
    }
}
