package x8h;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a0 implements tzg.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f303324a;

    public a0(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f303324a = featureToggleInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0063 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount r5) {
        /*
            r4 = this;
            java.lang.String r0 = "account"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            com.revolut.feature.wealth.api.FeatureWealthApi$Toggles$InvestWithdrawToMoveMoney r0 = com.revolut.feature.wealth.api.FeatureWealthApi$Toggles.InvestWithdrawToMoveMoney.f95164c
            gte.a r1 = r4.f303324a
            r2 = r1
            jte.d r2 = (jte.d) r2
            boolean r0 = r2.c(r0)
            r2 = 0
            if (r0 == 0) goto L64
            boolean r0 = r5 instanceof com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount.GIA
            r3 = 1
            if (r0 == 0) goto L36
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount$GIA r5 = (com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount.GIA) r5
            cfl.j r5 = r5.e
            int[] r0 = x8h.z.f303404a
            int r5 = r5.ordinal()
            r5 = r0[r5]
            if (r5 == r3) goto L34
            r0 = 2
            if (r5 == r0) goto L34
            r0 = 3
            if (r5 != r0) goto L2e
        L2c:
            r5 = r2
            goto L61
        L2e:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L34:
            r5 = r3
            goto L61
        L36:
            boolean r0 = r5 instanceof com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount.TaxAdvantage
            if (r0 == 0) goto L3d
            boolean r5 = r5 instanceof com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount.TaxAdvantage.Isa
            goto L61
        L3d:
            boolean r0 = r5 instanceof com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount.Margin
            if (r0 == 0) goto L4a
            com.revolut.feature.wealth.api.FeatureWealthApi$Toggles$CfdMoveMoney r5 = com.revolut.feature.wealth.api.FeatureWealthApi$Toggles.CfdMoveMoney.f95155c
            jte.d r1 = (jte.d) r1
            boolean r5 = r1.c(r5)
            goto L61
        L4a:
            boolean r0 = r5 instanceof com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount.MoneyMarketFunds
            if (r0 != 0) goto L2c
            boolean r0 = r5 instanceof com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount.PaperTrading
            if (r0 != 0) goto L2c
            boolean r0 = r5 instanceof com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount.Robo.Regular
            if (r0 != 0) goto L2c
            boolean r5 = r5 instanceof com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount.Unknown
            if (r5 == 0) goto L5b
            goto L2c
        L5b:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L61:
            if (r5 == 0) goto L64
            return r3
        L64:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: x8h.a0.a(com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount):boolean");
    }
}
