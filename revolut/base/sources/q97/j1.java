package q97;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes21.dex */
public final class j1 extends p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f243715c;
    public final y45.h d;
    public final xq3.u e;
    public final gz3.a f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(t97.c productCellProvider, y45.h loanProductFeatureTogglesInteractor, xq3.u creditMarketingAvailabilityInteractor, xq3.w creditPrimaryEntryPointsInteractor, gz3.a startCreditApplicationNavigationDestinationProvider, int i) {
        super(productCellProvider, creditPrimaryEntryPointsInteractor);
        this.f243715c = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
                Intrinsics.checkNotNullParameter(loanProductFeatureTogglesInteractor, "loanProductFeatureTogglesInteractor");
                Intrinsics.checkNotNullParameter(creditMarketingAvailabilityInteractor, "creditMarketingAvailabilityInteractor");
                Intrinsics.checkNotNullParameter(creditPrimaryEntryPointsInteractor, "creditPrimaryEntryPointsInteractor");
                Intrinsics.checkNotNullParameter(startCreditApplicationNavigationDestinationProvider, "startCreditApplicationNavigationDestinationProvider");
                super(productCellProvider, creditPrimaryEntryPointsInteractor);
                this.d = loanProductFeatureTogglesInteractor;
                this.e = creditMarketingAvailabilityInteractor;
                this.f = startCreditApplicationNavigationDestinationProvider;
                break;
            default:
                Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
                Intrinsics.checkNotNullParameter(loanProductFeatureTogglesInteractor, "loanProductFeatureTogglesInteractor");
                Intrinsics.checkNotNullParameter(creditMarketingAvailabilityInteractor, "creditMarketingAvailabilityInteractor");
                Intrinsics.checkNotNullParameter(creditPrimaryEntryPointsInteractor, "creditPrimaryEntryPointsInteractor");
                Intrinsics.checkNotNullParameter(startCreditApplicationNavigationDestinationProvider, "startCreditApplicationNavigationDestinationProvider");
                this.d = loanProductFeatureTogglesInteractor;
                this.e = creditMarketingAvailabilityInteractor;
                this.f = startCreditApplicationNavigationDestinationProvider;
                break;
        }
    }

    @Override // p97.c
    public final efm.d0 c(p97.a productCell) {
        switch (this.f243715c) {
            case 0:
                Intrinsics.checkNotNullParameter(productCell, "productCell");
                if (productCell.f234280a == t97.d.PERSONAL_LOAN) {
                    ft3.w wVar = ft3.w.INSTANCE;
                    grl.r2 r2Var = grl.r2.GLOBAL_SEARCH;
                    Object obj2 = productCell.f234283g;
                    ufm.b bVarM = efm.d0.m(new o97.d(ov3.a.b(this.f, r2Var, wVar, null, null, obj2 instanceof String ? (String) obj2 : null, yp3.e.ALWAYS_CHECK, null, 16090)));
                    Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(productCell, "productCell");
                if (productCell.f234280a == t97.d.REFINANCING_LOAN) {
                    ufm.b bVarM2 = efm.d0.m(new o97.d(ov3.a.b(this.f, grl.r2.GLOBAL_SEARCH, ft3.o0.INSTANCE, null, null, null, yp3.e.ALWAYS_CHECK, null, 16122)));
                    Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
                }
                break;
        }
        return efm.d0.l(new IllegalArgumentException(prk.o.q("Unsupported: ", productCell.f234280a)));
    }

    @Override // q97.p
    public final fs3.b d() {
        switch (this.f243715c) {
            case 0:
                return fs3.b.LOAN;
            default:
                return fs3.b.REFINANCING_LOAN;
        }
    }

    @Override // q97.p
    public final t97.d e() {
        switch (this.f243715c) {
            case 0:
                return t97.d.PERSONAL_LOAN;
            default:
                return t97.d.REFINANCING_LOAN;
        }
    }

    @Override // q97.p
    public final Flow f() {
        switch (this.f243715c) {
            case 0:
                return cp5.d.h(new vkm.y(mo3.a.g(rd0.e.n(vkm.q.q(nim.a.v(this.d.m(), new y25.d(23))), zhm.h0.f322473a), null, new q92.f(15), 1), new otd.a(3, 18, null)), new pyc.a(this, 26));
            default:
                return cp5.d.h(new vkm.y(mo3.a.g(rd0.e.n(vkm.q.q(nim.a.v(this.d.m(), new y25.d(21))), zhm.h0.f322473a), null, new q92.f(16), 1), new otd.a(3, 19, null)), new pyc.a(this, 27));
        }
    }
}
