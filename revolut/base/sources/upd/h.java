package upd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ybl.k f281969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ybl.l f281970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xoj.a f281971c;
    public final ybl.d d;
    public final su9.c e;
    public final c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final gte.a f281972g;

    public h(ybl.k tradingAccountsInteractor, ybl.l tradingConfigInteractor, xoj.a featuresInteractor, ybl.d portfolioInteractor, su9.c walletCurrencyMoneyConverter, c instrumentDestinationProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        Intrinsics.checkNotNullParameter(walletCurrencyMoneyConverter, "walletCurrencyMoneyConverter");
        Intrinsics.checkNotNullParameter(instrumentDestinationProvider, "instrumentDestinationProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f281969a = tradingAccountsInteractor;
        this.f281970b = tradingConfigInteractor;
        this.f281971c = featuresInteractor;
        this.d = portfolioInteractor;
        this.e = walletCurrencyMoneyConverter;
        this.f = instrumentDestinationProvider;
        this.f281972g = featureToggleInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (((jte.d) r2).c(com.revolut.feature.spending_analytics.api.AnalyticsFeatureApi$Toggles.CustodianJisaIncomeSorter.f87393c) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        if (((jte.d) r2).c(com.revolut.feature.spending_analytics.api.AnalyticsFeatureApi$Toggles.TeenJisaIncomeSorter.f87399c) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0047, code lost:
    
        return new go.g(new com.revolut.data.model.Data(zhm.f0.f322471a, null, false, 6, null), 2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlinx.coroutines.flow.Flow a(com.revolut.feature.spending_analytics.api.models.income_sorter.a r8) {
        /*
            r7 = this;
            java.lang.String r0 = "investmentType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            int[] r0 = upd.d.f281963a
            int r1 = r8.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L48
            r1 = 2
            if (r0 == r1) goto L48
            r1 = 3
            gte.a r2 = r7.f281972g
            if (r0 == r1) goto L2c
            r1 = 4
            if (r0 != r1) goto L26
            com.revolut.feature.spending_analytics.api.AnalyticsFeatureApi$Toggles$CustodianJisaIncomeSorter r0 = com.revolut.feature.spending_analytics.api.AnalyticsFeatureApi$Toggles.CustodianJisaIncomeSorter.f87393c
            jte.d r2 = (jte.d) r2
            boolean r0 = r2.c(r0)
            if (r0 != 0) goto L48
            goto L36
        L26:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        L2c:
            com.revolut.feature.spending_analytics.api.AnalyticsFeatureApi$Toggles$TeenJisaIncomeSorter r0 = com.revolut.feature.spending_analytics.api.AnalyticsFeatureApi$Toggles.TeenJisaIncomeSorter.f87399c
            jte.d r2 = (jte.d) r2
            boolean r0 = r2.c(r0)
            if (r0 != 0) goto L48
        L36:
            com.revolut.data.model.Data r1 = new com.revolut.data.model.Data
            zhm.f0 r2 = zhm.f0.f322471a
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1.<init>(r2, r3, r4, r5, r6)
            go.g r8 = new go.g
            r0 = 2
            r8.<init>(r1, r0)
            return r8
        L48:
            xoj.a r0 = r7.f281971c
            yoj.c r1 = yoj.c.WEALTH_TRADING
            efm.r r0 = xoj.a.a(r0, r1)
            vkm.d r0 = rd0.e.b(r0)
            upc.b r1 = new upc.b
            r2 = 6
            r1.<init>(r2)
            akg.n r0 = nim.a.v(r0, r1)
            upd.f r1 = new upd.f
            r2 = 0
            r1.<init>(r7, r8, r2)
            kotlinx.coroutines.flow.Flow r0 = xam.a.h(r1, r0)
            ybl.l r1 = r7.f281970b
            akg.n r1 = ybl.l.d(r1)
            upc.b r3 = new upc.b
            r4 = 5
            r3.<init>(r4)
            cxe.u r1 = nim.a.A(r1, r3)
            t38.e r0 = zh9.u0.m(r0, r1)
            upd.e r1 = new upd.e
            r1.<init>(r7, r8, r2)
            kotlinx.coroutines.flow.Flow r8 = xam.a.h(r1, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: upd.h.a(com.revolut.feature.spending_analytics.api.models.income_sorter.a):kotlinx.coroutines.flow.Flow");
    }
}
