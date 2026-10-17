package xlb;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.retail.savings.api.R$string;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c1l.e f307010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f01.c f307011b;

    public y(c1l.e tradingOnboardingStartCommandProvider, f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(tradingOnboardingStartCommandProvider, "tradingOnboardingStartCommandProvider");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f307010a = tradingOnboardingStartCommandProvider;
        this.f307011b = uiKitResources;
    }

    public final String a(SavingsProductData savingsProductData) {
        String string = opg.a.h(savingsProductData) ? this.f307011b.b(new TextLocalisedClause(R$string.savings_hys_account_default_title, null, null, 14)).toString() : null;
        return string == null ? savingsProductData.f86683a.f86627q : string;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(ael.s r11, gim.c r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof xlb.x
            if (r0 == 0) goto L13
            r0 = r12
            xlb.x r0 = (xlb.x) r0
            int r1 = r0.f307009x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f307009x = r1
            goto L18
        L13:
            xlb.x r0 = new xlb.x
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f307009x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ael.s r11 = r0.u
            yhm.o.b(r12)
            goto L81
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            yhm.o.b(r12)
            com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig$TradingAccountOnboardingFeatureConfig r4 = new com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig$TradingAccountOnboardingFeatureConfig
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            java.lang.Object r12 = r11.invoke(r12)
            com.revolut.feature.retail.savings.impl.creation.navigation.SavingsAccountCreationStepDestination r12 = (com.revolut.feature.retail.savings.impl.creation.navigation.SavingsAccountCreationStepDestination) r12
            yhi.b r2 = yhi.b.SOLID
            r5 = 0
            r6 = 12
            r7 = 0
            com.revolut.retail.core.navigation.FeatureCommand r5 = vhi.c.c(r12, r2, r7, r5, r6)
            com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig$TradingAccountOrType$WithTradingAccountType r6 = new com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig$TradingAccountOrType$WithTradingAccountType
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType$MoneyMarketFunds r12 = com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType.MoneyMarketFunds.f105272a
            r6.<init>(r12)
            com.revolut.retail.feature.trading_onboarding.api.navigation.EndPromptParams r8 = new com.revolut.retail.feature.trading_onboarding.api.navigation.EndPromptParams
            com.revolut.retail.feature.trading_onboarding.api.navigation.EndPromptType r12 = com.revolut.retail.feature.trading_onboarding.api.navigation.EndPromptType.TRADING
            r8.<init>(r3, r12)
            grl.k9 r12 = grl.k9.Savings
            android.os.Parcelable$Creator<com.revolut.analytics.tracking.v3.AnalyticsProduct$Retail> r2 = com.revolut.analytics.tracking.v3.AnalyticsProduct.Retail.CREATOR
            java.lang.String r2 = "value"
            com.revolut.analytics.tracking.v3.AnalyticsProduct$Retail r9 = com.google.android.gms.internal.mlkit_vision_face.a.h(r12, r2, r12)
            r4.<init>(r5, r6, r7, r8, r9)
            c1l.e r12 = r10.f307010a
            com.revolut.retail.core.navigation.DummyCommand r2 = com.revolut.retail.core.navigation.DummyCommand.f98635a
            ufm.b r12 = r12.b(r2, r4, r2)
            xif.c r2 = new xif.c
            r4 = 28
            r2.<init>(r4)
            ufm.i r12 = ue0.e.D(r12, r2)
            r0.u = r11
            r0.f307009x = r3
            java.lang.Object r12 = nim.a.b(r12, r0)
            if (r12 != r1) goto L81
            return r1
        L81:
            com.revolut.retail.core.navigation.NaviCommand r12 = (com.revolut.retail.core.navigation.NaviCommand) r12
            boolean r0 = r12 instanceof com.revolut.retail.core.navigation.DummyCommand
            if (r0 == 0) goto L95
            xlb.e r12 = new xlb.e
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            java.lang.Object r11 = r11.invoke(r0)
            com.revolut.feature.retail.savings.impl.creation.navigation.SavingsAccountCreationStepDestination r11 = (com.revolut.feature.retail.savings.impl.creation.navigation.SavingsAccountCreationStepDestination) r11
            r12.<init>(r11)
            return r12
        L95:
            xlb.f r11 = new xlb.f
            kotlin.jvm.internal.Intrinsics.h(r12)
            r11.<init>(r12)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: xlb.y.b(ael.s, gim.c):java.lang.Object");
    }
}
