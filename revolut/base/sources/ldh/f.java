package ldh;

import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.feature.stockdetails.api.navigation.StartNavigation;
import com.revolut.retail.feature.stockdetails.api.navigation.StockDetailsFeatureConfig;
import com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nel.n;
import zh9.u0;

/* JADX INFO: loaded from: classes9.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c1l.e f194109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a2b.b f194110b;

    public f(c1l.e tradingOnboardingStartCommandProvider, a2b.b cfdOnboardingConfigProvider) {
        Intrinsics.checkNotNullParameter(tradingOnboardingStartCommandProvider, "tradingOnboardingStartCommandProvider");
        Intrinsics.checkNotNullParameter(cfdOnboardingConfigProvider, "cfdOnboardingConfigProvider");
        this.f194109a = tradingOnboardingStartCommandProvider;
        this.f194110b = cfdOnboardingConfigProvider;
    }

    public final Object a(TradingAccountType tradingAccountType, TradingOnboardingFeatureConfig.TradingAccountOrType tradingAccountOrType, n nVar, bfl.g gVar, gim.i iVar) {
        if (Intrinsics.f(tradingAccountType, TradingAccountType.Taa.f105275a) || Intrinsics.f(tradingAccountType, TradingAccountType.Gia.f105270a)) {
            Object objB = b(nVar, tradingAccountOrType, iVar);
            return objB == fim.a.COROUTINE_SUSPENDED ? objB : (d) objB;
        }
        TradingAccountType.Margin margin = TradingAccountType.Margin.f105271a;
        if (Intrinsics.f(tradingAccountType, margin)) {
            a2b.b bVar = this.f194110b;
            return new a(u0.b(new FeatureCommand(gVar != null ? ((c3b.a) bVar).b(new FeatureCommand(new StockDetailsFeatureConfig(nVar.f214596b, new StartNavigation.OrderFlow(margin, gVar), 90))) : ((c3b.a) bVar).b(new FinishCommand(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7)))));
        }
        if (!Intrinsics.f(tradingAccountType, TradingAccountType.MoneyMarketFunds.f105272a) && !Intrinsics.f(tradingAccountType, TradingAccountType.Robo.f105274a) && !Intrinsics.f(tradingAccountType, TradingAccountType.PaperTrading.f105273a) && !Intrinsics.f(tradingAccountType, TradingAccountType.Unknown.f105276a)) {
            throw new NoWhenBranchMatchedException();
        }
        hx7.e.n(new IllegalStateException("Actions for " + tradingAccountType + " is not supported"));
        return b.f194106a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(nel.n r11, com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig.TradingAccountOrType r12, gim.c r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof ldh.e
            if (r0 == 0) goto L13
            r0 = r13
            ldh.e r0 = (ldh.e) r0
            int r1 = r0.f194108w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f194108w = r1
            goto L18
        L13:
            ldh.e r0 = new ldh.e
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f194108w
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r13)
            goto La3
        L28:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L30:
            yhm.o.b(r13)
            nel.z r13 = r11.f214597c
            boolean r13 = io3.h.l(r13)
            r2 = 0
            if (r13 == 0) goto L46
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            kotlin.Pair r13 = new kotlin.Pair
            com.revolut.retail.core.navigation.DummyCommand r4 = com.revolut.retail.core.navigation.DummyCommand.f98635a
            r13.<init>(r4, r11)
            goto L6f
        L46:
            java.lang.String r13 = r11.f214596b
            nel.z r11 = r11.f214597c
            boolean r11 = io3.h.i(r11)
            if (r11 == 0) goto L5a
            com.revolut.retail.feature.stockdetails.api.navigation.StartNavigation$OrderFlow r11 = new com.revolut.retail.feature.stockdetails.api.navigation.StartNavigation$OrderFlow
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType$Gia r4 = com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType.Gia.f105270a
            bfl.g r5 = bfl.g.BUY
            r11.<init>(r4, r5)
            goto L5b
        L5a:
            r11 = r2
        L5b:
            com.revolut.retail.feature.stockdetails.api.navigation.StockDetailsFeatureConfig r4 = new com.revolut.retail.feature.stockdetails.api.navigation.StockDetailsFeatureConfig
            r5 = 90
            r4.<init>(r13, r11, r5)
            com.revolut.retail.core.navigation.FeatureCommand r11 = new com.revolut.retail.core.navigation.FeatureCommand
            r11.<init>(r4)
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            kotlin.Pair r4 = new kotlin.Pair
            r4.<init>(r11, r13)
            r13 = r4
        L6f:
            java.lang.Object r11 = r13.f186385a
            r5 = r11
            com.revolut.retail.core.navigation.NaviCommand r5 = (com.revolut.retail.core.navigation.NaviCommand) r5
            java.lang.Object r11 = r13.f186386b
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig$TradingAccountOnboardingFeatureConfig r4 = new com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig$TradingAccountOnboardingFeatureConfig
            com.revolut.retail.feature.trading_onboarding.api.navigation.EndPromptParams r8 = new com.revolut.retail.feature.trading_onboarding.api.navigation.EndPromptParams
            com.revolut.retail.feature.trading_onboarding.api.navigation.EndPromptType r13 = com.revolut.retail.feature.trading_onboarding.api.navigation.EndPromptType.TRADING
            r8.<init>(r11, r13)
            grl.k9 r11 = grl.k9.Trading
            android.os.Parcelable$Creator<com.revolut.analytics.tracking.v3.AnalyticsProduct$Retail> r13 = com.revolut.analytics.tracking.v3.AnalyticsProduct.Retail.CREATOR
            java.lang.String r13 = "value"
            com.revolut.analytics.tracking.v3.AnalyticsProduct$Retail r9 = com.google.android.gms.internal.mlkit_vision_face.a.h(r11, r13, r11)
            r7 = 0
            r6 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            c1l.e r11 = r10.f194109a
            ufm.b r11 = r11.b(r5, r4, r2)
            r0.f194108w = r3
            java.lang.Object r13 = nim.a.b(r11, r0)
            if (r13 != r1) goto La3
            return r1
        La3:
            com.revolut.retail.core.navigation.NaviCommand r13 = (com.revolut.retail.core.navigation.NaviCommand) r13
            ldh.a r11 = new ldh.a
            kotlin.jvm.internal.Intrinsics.h(r13)
            com.revolut.kompot.bridge.navigation.BridgeDestination r12 = zh9.u0.b(r13)
            r11.<init>(r12)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ldh.f.b(nel.n, com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig$TradingAccountOrType, gim.c):java.lang.Object");
    }
}
