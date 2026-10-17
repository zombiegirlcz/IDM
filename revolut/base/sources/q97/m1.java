package q97;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class m1 implements p97.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f243736a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f243737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f243738c;
    public final Object d;
    public final Object e;

    public m1(t97.c productCellProvider, y45.o mortgageRefinancingProductFeatureTogglesInteractor, xq3.u creditMarketingAvailabilityInteractor, ang.f userInteractor, gz3.a startCreditApplicationNavigationDestinationProvider) {
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        Intrinsics.checkNotNullParameter(mortgageRefinancingProductFeatureTogglesInteractor, "mortgageRefinancingProductFeatureTogglesInteractor");
        Intrinsics.checkNotNullParameter(creditMarketingAvailabilityInteractor, "creditMarketingAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(startCreditApplicationNavigationDestinationProvider, "startCreditApplicationNavigationDestinationProvider");
        this.f243737b = mortgageRefinancingProductFeatureTogglesInteractor;
        this.f243738c = creditMarketingAvailabilityInteractor;
        this.d = userInteractor;
        this.e = startCreditApplicationNavigationDestinationProvider;
    }

    @Override // p97.c
    public final boolean a(p97.b id10) {
        switch (this.f243736a) {
            case 0:
                Intrinsics.checkNotNullParameter(id10, "id");
                return id10 == t97.d.REFINANCING_MORTGAGE;
            default:
                Intrinsics.checkNotNullParameter(id10, "id");
                return zhm.d0.T(zhm.v.k(t97.d.SAVINGS, t97.d.JOINT_SAVINGS), id10);
        }
    }

    @Override // p97.c
    public final efm.r b() {
        switch (this.f243736a) {
            case 0:
                efm.r rVarCombineLatest = efm.r.combineLatest(rd0.e.c(cp5.d.h(new vkm.y(mo3.a.g(rd0.e.n(((y45.o) this.f243737b).d(), zhm.h0.f322473a), null, new q92.f(18), 1), new otd.a(3, 21, null)), new pyc.a(this, 29)), kotlin.coroutines.g.f186406a), m70.a.g(nim.a.w(((ang.f) this.d).k(false), new l1(0)), null, new q92.f(19), 1), new j0(new q92.f(this), 27));
                Intrinsics.checkNotNullExpressionValue(rVarCombineLatest, "combineLatest(...)");
                return ue0.e.E(rVarCombineLatest, zhm.f0.f322471a);
            default:
                slb.a aVar = (slb.a) this.f243737b;
                cxe.u uVarC = aVar.c(lcd.n.f193865a, w4l.h.f294642c);
                kotlin.coroutines.g gVar = kotlin.coroutines.g.f186406a;
                efm.r rVarFlatMap = rd0.e.c(uVarC, gVar).flatMap(new h2(2, new o2(this, 0)));
                Intrinsics.checkNotNullExpressionValue(rVarFlatMap, "observePersonalSavingsCell(...)");
                g48.r0 r0Var = (g48.r0) this.f243738c;
                n38.q[] elements = {n38.q.ACTIVE, n38.q.OFFBOARDING, n38.q.PENDING};
                Intrinsics.checkNotNullParameter(elements, "elements");
                efm.r rVarFlatMap2 = te0.w.l(rd0.e.c(r0Var.e(kotlin.collections.d.y0(elements), w4l.h.f294642c), skm.p0.f264003c), rd0.e.c(aVar.c(lcd.m.f193864a, w4l.j.f294644c), gVar)).flatMap(new h2(3, new o2(this, 1)));
                Intrinsics.checkNotNullExpressionValue(rVarFlatMap2, "observeJointSavingsCell(...)");
                efm.r map = te0.w.l(rVarFlatMap, rVarFlatMap2).map(new h2(1, new l1(6)));
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                return map;
        }
    }

    @Override // p97.c
    public final efm.d0 c(p97.a productCell) {
        switch (this.f243736a) {
            case 0:
                Intrinsics.checkNotNullParameter(productCell, "productCell");
                if (productCell.f234280a != t97.d.REFINANCING_MORTGAGE) {
                    return efm.d0.l(new IllegalArgumentException(prk.o.q("Unsupported: ", productCell.f234280a)));
                }
                return efm.d0.m(new o97.d(ov3.a.b((gz3.a) this.e, grl.r2.GLOBAL_SEARCH, ft3.p0.INSTANCE, null, null, null, yp3.e.ALWAYS_CHECK, null, 16122)));
            default:
                Intrinsics.checkNotNullParameter(productCell, "productCell");
                p97.b bVar = productCell.f234280a;
                if (bVar == t97.d.SAVINGS) {
                    ufm.b bVarM = efm.d0.m(new o97.l(zh9.u0.f(((hob.d) ((mjb.a) this.e)).e())));
                    Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                    return bVarM;
                }
                if (bVar == t97.d.JOINT_SAVINGS) {
                    return te0.w.o0(skm.p0.f264003c, new pwb.p(this, null, 22));
                }
                throw new IllegalArgumentException(prk.o.q("Unsupported: ", productCell.f234280a));
        }
    }

    public m1(t97.c productCellProvider, slb.a savingsCreationAvailabilityInteractor, g48.r0 jointAccountsInteractor, elb.b savingsFeatureConfigInteractor, mjb.a savingsNavigationProvider) {
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        Intrinsics.checkNotNullParameter(savingsCreationAvailabilityInteractor, "savingsCreationAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(savingsFeatureConfigInteractor, "savingsFeatureConfigInteractor");
        Intrinsics.checkNotNullParameter(savingsNavigationProvider, "savingsNavigationProvider");
        this.f243737b = savingsCreationAvailabilityInteractor;
        this.f243738c = jointAccountsInteractor;
        this.d = savingsFeatureConfigInteractor;
        this.e = savingsNavigationProvider;
    }
}
