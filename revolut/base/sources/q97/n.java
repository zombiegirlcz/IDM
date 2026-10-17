package q97;

import com.revolut.android.bug_report.api.BugReportApi$Toggles$InAppBugReporting;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes21.dex */
public final class n extends r97.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f243743b = 5;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t97.d f243744c;
    public final Object d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(t97.c productCellProvider, tbk.b planGiftingAvailabilityInteractor, lbk.a planGiftingSenderFlowCommandProvider) {
        super(productCellProvider);
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        Intrinsics.checkNotNullParameter(planGiftingAvailabilityInteractor, "planGiftingAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(planGiftingSenderFlowCommandProvider, "planGiftingSenderFlowCommandProvider");
        this.d = planGiftingAvailabilityInteractor;
        this.e = planGiftingSenderFlowCommandProvider;
        this.f243744c = t97.d.PLAN_GIFTING;
    }

    @Override // r97.b
    public final Flow d() {
        switch (this.f243743b) {
            case 0:
                return new go.g(Boolean.valueOf(((jla.h) this.e).d("cash_withdrawal.atm_locator", null) == bla.c.ENABLED), 2);
            case 1:
                return rd0.e.b(((cpj.b) ((xoj.a) this.e)).l(yoj.c.COMMODITIES));
            case 2:
                return ((t0) this.d).a();
            case 3:
                return new sa6.o(bla.b.b(((tbk.b) this.d).f269551a, "PRICING_PLAN_GIFTING"), 3);
            case 4:
                return ((t0) this.d).a();
            default:
                return new go.g(Boolean.valueOf(((jte.d) ((gte.a) this.d)).c(BugReportApi$Toggles$InAppBugReporting.f50349c)), 2);
        }
    }

    @Override // r97.b
    public final p97.b f() {
        switch (this.f243743b) {
        }
        return this.f243744c;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0142  */
    @Override // r97.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(kotlin.coroutines.Continuation r10) {
        /*
            Method dump skipped, instruction units count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q97.n.g(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(t97.c productCellProvider, t0 investProductAvailabilityProvider, g9h.b mostTradedAssetsDestinationProvider) {
        super(productCellProvider);
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        Intrinsics.checkNotNullParameter(investProductAvailabilityProvider, "investProductAvailabilityProvider");
        Intrinsics.checkNotNullParameter(mostTradedAssetsDestinationProvider, "mostTradedAssetsDestinationProvider");
        this.d = investProductAvailabilityProvider;
        this.e = mostTradedAssetsDestinationProvider;
        this.f243744c = t97.d.MOST_TRADED;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(t97.c productCellProvider, t0 investProductAvailabilityProvider, g9h.e topMoversDestinationProvider) {
        super(productCellProvider);
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        Intrinsics.checkNotNullParameter(investProductAvailabilityProvider, "investProductAvailabilityProvider");
        Intrinsics.checkNotNullParameter(topMoversDestinationProvider, "topMoversDestinationProvider");
        this.d = investProductAvailabilityProvider;
        this.e = topMoversDestinationProvider;
        this.f243744c = t97.d.TOP_MOVERS;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(t97.c productCellProvider, zj2.a atmDestinationsResolver, jla.h productCatalogueInteractor) {
        super(productCellProvider);
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        Intrinsics.checkNotNullParameter(atmDestinationsResolver, "atmDestinationsResolver");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        this.d = atmDestinationsResolver;
        this.e = productCatalogueInteractor;
        this.f243744c = t97.d.ATMS;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(t97.c productCellProvider, gte.a featureToggleInteractor, xo.h bugReportNavigationProvider) {
        super(productCellProvider);
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(bugReportNavigationProvider, "bugReportNavigationProvider");
        this.d = featureToggleInteractor;
        this.e = bugReportNavigationProvider;
        this.f243744c = t97.d.BUG_REPORT;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(t97.c productCellProvider, oih.g wealthCommoditiesAccountCommandProvider, xoj.a featuresInteractor) {
        super(productCellProvider);
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        Intrinsics.checkNotNullParameter(wealthCommoditiesAccountCommandProvider, "wealthCommoditiesAccountCommandProvider");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        this.d = wealthCommoditiesAccountCommandProvider;
        this.e = featuresInteractor;
        this.f243744c = t97.d.COMMODITIES;
    }
}
