package jyk;

import android.os.Parcelable;
import com.onfido.android.sdk.capture.ui.camera.CapturePresenter;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.trading_onboarding.api.TradingOnboardingRevampApi$Toggles$FreeStocksNavigation;
import com.revolut.retail.feature.trading_onboarding.api.navigation.EndPromptParams;
import com.revolut.retail.feature.trading_onboarding.api.navigation.EndPromptType;
import com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig;
import com.revolut.retail.feature.trading_onboarding.impl.ui.free_stocks.select.FreeStocksDestination;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import grl.k9;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zh9.u0;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements oxk.b {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sri.m f179475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1l.e f179476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final usc.a f179477c;
    public final gte.a d;

    public g(sri.m navigator, c1l.e tradingOnboardingStartCommandProvider, usc.a freeStocksInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(tradingOnboardingStartCommandProvider, "tradingOnboardingStartCommandProvider");
        Intrinsics.checkNotNullParameter(freeStocksInteractor, "freeStocksInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f179475a = navigator;
        this.f179476b = tradingOnboardingStartCommandProvider;
        this.f179477c = freeStocksInteractor;
        this.d = featureToggleInteractor;
    }

    public static FeatureCommand c() {
        return gc0.c.f(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(new MainContainerNavigationId.NewMainScreenContainerTabId(ibb.c.f160141b.f83420a, null), null, null, 6)));
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return wp5.y.D(cVar, "deeplink", 1, "trading") && Intrinsics.f(cVar.e(2), "free-stocks");
    }

    public final ufm.b b() {
        FeatureCommand featureCommandF = u0.f(FreeStocksDestination.f104162a);
        FeatureCommand featureCommandC = c();
        TradingOnboardingFeatureConfig.TradingAccountOrType.WithTradingAccountType withTradingAccountType = new TradingOnboardingFeatureConfig.TradingAccountOrType.WithTradingAccountType(TradingAccountType.Gia.f105270a);
        k9 value = k9.Trading;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        Intrinsics.checkNotNullParameter(value, "value");
        return this.f179476b.b(featureCommandF, new TradingOnboardingFeatureConfig.TradingAccountOnboardingFeatureConfig(featureCommandC, withTradingAccountType, null, new EndPromptParams(false, EndPromptType.TRADING), new AnalyticsProduct.Retail(value)), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r7, kotlin.coroutines.Continuation r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r7 = r8 instanceof jyk.f
            if (r7 == 0) goto L13
            r7 = r8
            jyk.f r7 = (jyk.f) r7
            int r0 = r7.f179472x
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r7.f179472x = r0
            goto L1a
        L13:
            jyk.f r7 = new jyk.f
            gim.c r8 = (gim.c) r8
            r7.<init>(r6, r8)
        L1a:
            java.lang.Object r8 = r7.v
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r7.f179472x
            r2 = 1
            r3 = 2
            r4 = 0
            if (r1 == 0) goto L3c
            if (r1 == r2) goto L38
            if (r1 != r3) goto L30
            q06.b r7 = r7.u
            yhm.o.b(r8)
            goto La4
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            yhm.o.b(r8)
            goto L5b
        L3c:
            yhm.o.b(r8)
            com.revolut.retail.feature.trading_onboarding.api.TradingOnboardingRevampApi$Toggles$FreeStocksNavigation r8 = com.revolut.retail.feature.trading_onboarding.api.TradingOnboardingRevampApi$Toggles$FreeStocksNavigation.f104067c
            gte.a r1 = r6.d
            jte.d r1 = (jte.d) r1
            boolean r8 = r1.c(r8)
            if (r8 != 0) goto L4c
            goto L82
        L4c:
            r7.f179472x = r2
            usc.a r8 = r6.f179477c
            java.lang.Object r8 = r8.f282889b
            e8h.j r8 = (e8h.j) r8
            java.lang.Object r8 = r8.a(r7)
            if (r8 != r0) goto L5b
            goto La2
        L5b:
            yzg.d r8 = (yzg.d) r8
            q06.b r1 = new q06.b
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r5 = ibb.c.f160141b
            r1.<init>(r5, r4)
            yzg.c r8 = r8.f318105a
            int[] r5 = jyk.e.f179468a
            int r8 = r8.ordinal()
            r8 = r5[r8]
            if (r8 == r2) goto L94
            if (r8 == r3) goto L94
            r7 = 3
            if (r8 == r7) goto L83
            r7 = 4
            if (r8 == r7) goto L82
            r7 = 5
            if (r8 != r7) goto L7c
            goto L82
        L7c:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L82:
            return r4
        L83:
            q06.h r7 = new q06.h
            com.revolut.kompot.bridge.navigation.BridgeDestination r8 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            com.revolut.retail.feature.trading_onboarding.impl.ui.free_stocks.select.FreeStocksDestination r0 = com.revolut.retail.feature.trading_onboarding.impl.ui.free_stocks.select.FreeStocksDestination.f104162a
            com.revolut.retail.core.navigation.FeatureCommand r0 = zh9.u0.f(r0)
            r8.<init>(r0)
            r7.<init>(r8, r1)
            return r7
        L94:
            ufm.b r8 = r6.b()
            r7.u = r1
            r7.f179472x = r3
            java.lang.Object r8 = nim.a.b(r8, r7)
            if (r8 != r0) goto La3
        La2:
            return r0
        La3:
            r7 = r1
        La4:
            com.revolut.retail.core.navigation.NaviCommand r8 = (com.revolut.retail.core.navigation.NaviCommand) r8
            q06.h r0 = new q06.h
            com.revolut.kompot.bridge.navigation.BridgeDestination r1 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            kotlin.jvm.internal.Intrinsics.h(r8)
            r1.<init>(r8)
            r0.<init>(r1, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: jyk.g.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final efm.d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        ufm.b bVarM = efm.d0.m(Boolean.valueOf(((jte.d) this.d).c(TradingOnboardingRevampApi$Toggles$FreeStocksNavigation.f104067c)));
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        ufm.p pVarT = new ufm.i(bVarM, new jy2.a(new c(this, z, 0), 5), 0).t(CapturePresenter.MANUAL_FALLBACK_DELAY_MS, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(pVarT, "timeout(...)");
        return ue0.e.F(pVarT, Boolean.TRUE);
    }
}
