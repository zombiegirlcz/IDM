package ymh;

import com.revolut.feature.wealth.ui.impl.trade_redesign.screen.private_bank_banner.PrivateBankBannerContract$PrivateBankBannerClickParcel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ g v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PrivateBankBannerContract$PrivateBankBannerClickParcel f315000w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, PrivateBankBannerContract$PrivateBankBannerClickParcel privateBankBannerContract$PrivateBankBannerClickParcel, Continuation continuation) {
        super(2, continuation);
        this.v = gVar;
        this.f315000w = privateBankBannerContract$PrivateBankBannerClickParcel;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.v, this.f315000w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0094, code lost:
    
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
            r2 = 0
            r3 = 1
            ymh.g r4 = r12.v
            r5 = 2
            if (r1 == 0) goto L20
            if (r1 == r3) goto L1c
            if (r1 != r5) goto L14
            yhm.o.b(r13)
            goto L97
        L14:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1c:
            yhm.o.b(r13)
            goto L87
        L20:
            yhm.o.b(r13)
            c1l.e r13 = r4.f315001l
            com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig$TradingAccountOnboardingFeatureConfig r6 = new com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig$TradingAccountOnboardingFeatureConfig
            com.revolut.retail.core.navigation.FeatureCommand r1 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig$WithInnerConfiguration r7 = new com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig$WithInnerConfiguration
            s49.a r8 = s49.a.SINGLE_TOP
            com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration r9 = new com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration
            com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId$NewMainScreenContainerTabId r10 = new com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId$NewMainScreenContainerTabId
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r11 = ibb.c.f160141b
            java.lang.String r11 = r11.f83420a
            r10.<init>(r11, r2)
            r11 = 6
            r9.<init>(r10, r2, r2, r11)
            r7.<init>(r8, r9)
            r1.<init>(r7)
            com.revolut.feature.wealth.ui.api.navigation.trade.WealthTradeRedesignDestination r7 = new com.revolut.feature.wealth.ui.api.navigation.trade.WealthTradeRedesignDestination
            sih.c r8 = sih.c.PRIVATE_MARKETS
            r7.<init>(r8)
            com.revolut.retail.core.navigation.FeatureCommand r7 = zh9.u0.f(r7)
            com.revolut.retail.core.navigation.CompositeCommand r7 = com.revolut.retail.core.navigation.a.c(r1, r7)
            com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig$TradingAccountOrType$WithTradingAccountTypeAndProducts r8 = new com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig$TradingAccountOrType$WithTradingAccountTypeAndProducts
            com.revolut.feature.wealth.ui.impl.trade_redesign.screen.private_bank_banner.PrivateBankBannerContract$PrivateBankBannerClickParcel r1 = r12.f315000w
            java.util.Set r1 = r1.f96043a
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List r1 = zhm.d0.d1(r1)
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType$Gia r9 = com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType.Gia.f105270a
            r8.<init>(r9, r1)
            com.revolut.retail.feature.trading_onboarding.api.navigation.EndPromptParams r10 = new com.revolut.retail.feature.trading_onboarding.api.navigation.EndPromptParams
            com.revolut.retail.feature.trading_onboarding.api.navigation.EndPromptType r1 = com.revolut.retail.feature.trading_onboarding.api.navigation.EndPromptType.TRADING
            r9 = 0
            r10.<init>(r9, r1)
            grl.k9 r1 = grl.k9.Trading
            android.os.Parcelable$Creator<com.revolut.analytics.tracking.v3.AnalyticsProduct$Retail> r9 = com.revolut.analytics.tracking.v3.AnalyticsProduct.Retail.CREATOR
            java.lang.String r9 = "value"
            com.revolut.analytics.tracking.v3.AnalyticsProduct$Retail r11 = com.google.android.gms.internal.mlkit_vision_face.a.h(r1, r9, r1)
            r9 = 0
            r6.<init>(r7, r8, r9, r10, r11)
            com.revolut.retail.core.navigation.DummyCommand r1 = com.revolut.retail.core.navigation.DummyCommand.f98635a
            ufm.b r13 = r13.b(r1, r6, r2)
            r12.u = r3
            java.lang.Object r13 = nim.a.b(r13, r12)
            if (r13 != r0) goto L87
            goto L96
        L87:
            com.revolut.retail.core.navigation.NaviCommand r13 = (com.revolut.retail.core.navigation.NaviCommand) r13
            wxk.c r1 = r4.f315002m
            kotlin.jvm.internal.Intrinsics.h(r13)
            r12.u = r5
            java.lang.Object r13 = r1.a(r13, r2, r12)
            if (r13 != r0) goto L97
        L96:
            return r0
        L97:
            com.revolut.kompot.common.StackDestination r13 = (com.revolut.kompot.common.StackDestination) r13
            com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig r13 = zh9.u0.d(r13)
            com.revolut.kompot.bridge.navigation.BridgeDestination r13 = zh9.u0.c(r13)
            aii.n r13 = r4.A2(r13)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: ymh.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
