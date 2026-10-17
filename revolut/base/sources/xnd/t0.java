package xnd;

import com.revolut.feature.spending_analytics.api.AnalyticsFeatureApi$Toggles;
import com.revolut.retail.feature.api.AnalyticsAccountsSelection;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rnb.m f307451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rnb.w f307452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f307453c;
    public final n78.a d;
    public final v5a.c e;
    public final f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f307454g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final rul.e f307455h;
    public final a1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final tsj.g f307456j;
    public final Lazy k;

    public t0(rnb.m savingsAutoPaymentsInteractor, rnb.w savingsVaultInteractor, gte.a featureToggleInteractor, n78.a juniorAllowanceInfoInteractor, v5a.c paymentsMigrationInteractor, f analyticsDashboardBudgetingProvider, d analyticsDashboardBudgetToolsProvider, rul.e dashboardExtraDataProvider, a1 incomeSorterToolsProvider, tsj.g customAssetsInteractor) {
        Intrinsics.checkNotNullParameter(savingsAutoPaymentsInteractor, "savingsAutoPaymentsInteractor");
        Intrinsics.checkNotNullParameter(savingsVaultInteractor, "savingsVaultInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(juniorAllowanceInfoInteractor, "juniorAllowanceInfoInteractor");
        Intrinsics.checkNotNullParameter(paymentsMigrationInteractor, "paymentsMigrationInteractor");
        Intrinsics.checkNotNullParameter(analyticsDashboardBudgetingProvider, "analyticsDashboardBudgetingProvider");
        Intrinsics.checkNotNullParameter(analyticsDashboardBudgetToolsProvider, "analyticsDashboardBudgetToolsProvider");
        Intrinsics.checkNotNullParameter(dashboardExtraDataProvider, "dashboardExtraDataProvider");
        Intrinsics.checkNotNullParameter(incomeSorterToolsProvider, "incomeSorterToolsProvider");
        Intrinsics.checkNotNullParameter(customAssetsInteractor, "customAssetsInteractor");
        this.f307451a = savingsAutoPaymentsInteractor;
        this.f307452b = savingsVaultInteractor;
        this.f307453c = featureToggleInteractor;
        this.d = juniorAllowanceInfoInteractor;
        this.e = paymentsMigrationInteractor;
        this.f = analyticsDashboardBudgetingProvider;
        this.f307454g = analyticsDashboardBudgetToolsProvider;
        this.f307455h = dashboardExtraDataProvider;
        this.i = incomeSorterToolsProvider;
        this.f307456j = customAssetsInteractor;
        this.k = yhm.j.b(new xge.h(this, 3));
    }

    public static r0 a(t0 t0Var, y0 y0Var, p0 p0Var, m0 m0Var, n0 n0Var, q0 q0Var, o0 o0Var, k0 k0Var, Boolean bool, boolean z, int i) {
        if ((i & 1) != 0) {
            y0Var = null;
        }
        if ((i & 2) != 0) {
            p0Var = null;
        }
        if ((i & 4) != 0) {
            m0Var = null;
        }
        if ((i & 8) != 0) {
            n0Var = null;
        }
        if ((i & 16) != 0) {
            q0Var = null;
        }
        if ((i & 32) != 0) {
            o0Var = null;
        }
        if ((i & 64) != 0) {
            k0Var = null;
        }
        if ((i & 128) != 0) {
            bool = Boolean.FALSE;
        }
        if ((i & 256) != 0) {
            z = false;
        }
        t0Var.getClass();
        return new r0(y0Var, m0Var, p0Var, q0Var, o0Var, k0Var, bool, z, n0Var);
    }

    public final boolean b(AnalyticsAccountsSelection analyticsAccountsSelection) {
        return ((jte.d) this.f307453c).c(AnalyticsFeatureApi$Toggles.AnalyticsRevamp.f87388c) && !ind.a.f(analyticsAccountsSelection) && this.f307456j.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlinx.coroutines.flow.Flow c(com.revolut.retail.feature.api.AnalyticsAccountsSelection r8) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xnd.t0.c(com.revolut.retail.feature.api.AnalyticsAccountsSelection):kotlinx.coroutines.flow.Flow");
    }
}
