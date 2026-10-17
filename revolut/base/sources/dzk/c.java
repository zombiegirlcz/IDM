package dzk;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.retail.feature.trading_onboarding.impl.ui.failed_prompt.flow.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.revolut.retail.feature.trading_onboarding.impl.ui.failed_prompt.flow.a aVar, Continuation continuation) {
        super(1, continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new c(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((c) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x007f, code lost:
    
        if (r13 == r0) goto L15;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r12.u
            r2 = 2
            r3 = 0
            r4 = 1
            com.revolut.retail.feature.trading_onboarding.impl.ui.failed_prompt.flow.a r5 = r12.v
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L1b
            if (r1 != r2) goto L13
            yhm.o.b(r13)
            goto L82
        L13:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1b:
            yhm.o.b(r13)
            goto L4c
        L1f:
            yhm.o.b(r13)
            d1l.b r13 = r5.o
            ybl.k r13 = r13.f110662a
            r1 = 3
            cfl.m r6 = cfl.m.f23746a
            kotlinx.coroutines.flow.Flow r13 = ybl.k.k(r13, r3, r3, r6, r1)
            ael.k0 r1 = new ael.k0
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType$Gia r6 = com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType.Gia.f105270a
            r1.<init>(r6, r4)
            akg.n r13 = nim.a.v(r13, r1)
            dug.d r1 = new dug.d
            r6 = 28
            r1.<init>(r6)
            jhi.b r13 = mo3.a.g(r13, r3, r1, r4)
            r12.u = r4
            java.lang.Object r13 = vkm.q.x(r13, r12)
            if (r13 != r0) goto L4c
            goto L81
        L4c:
            r8 = r13
            com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig$TradingAccountOrType r8 = (com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig.TradingAccountOrType) r8
            c1l.e r13 = r5.f104159p
            com.revolut.retail.core.navigation.FeatureCommand r1 = com.revolut.retail.feature.trading_onboarding.impl.ui.failed_prompt.flow.a.I2(r5)
            com.revolut.retail.core.navigation.FeatureCommand r7 = com.revolut.retail.feature.trading_onboarding.impl.ui.failed_prompt.flow.a.I2(r5)
            grl.k9 r4 = grl.k9.Trading
            android.os.Parcelable$Creator<com.revolut.analytics.tracking.v3.AnalyticsProduct$Retail> r6 = com.revolut.analytics.tracking.v3.AnalyticsProduct.Retail.CREATOR
            java.lang.String r6 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r6)
            com.revolut.retail.feature.trading_onboarding.api.navigation.EndPromptParams r10 = new com.revolut.retail.feature.trading_onboarding.api.navigation.EndPromptParams
            r6 = 0
            com.revolut.retail.feature.trading_onboarding.api.navigation.EndPromptType r9 = com.revolut.retail.feature.trading_onboarding.api.navigation.EndPromptType.TRADING
            r10.<init>(r6, r9)
            com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig$TradingAccountOnboardingFeatureConfig r6 = new com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig$TradingAccountOnboardingFeatureConfig
            com.revolut.analytics.tracking.v3.AnalyticsProduct$Retail r11 = new com.revolut.analytics.tracking.v3.AnalyticsProduct$Retail
            r11.<init>(r4)
            r9 = 0
            r6.<init>(r7, r8, r9, r10, r11)
            ufm.b r13 = r13.b(r1, r6, r3)
            r12.u = r2
            java.lang.Object r13 = nim.a.b(r13, r12)
            if (r13 != r0) goto L82
        L81:
            return r0
        L82:
            com.revolut.retail.core.navigation.NaviCommand r13 = (com.revolut.retail.core.navigation.NaviCommand) r13
            kotlin.jvm.internal.Intrinsics.h(r13)
            com.revolut.kompot.bridge.navigation.BridgeDestination r13 = zh9.u0.b(r13)
            r5.C1(r13)
            yki.i r13 = r5.f104161r
            oki.h.D2(r13)
            kotlin.Unit r13 = kotlin.Unit.f186387a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: dzk.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
