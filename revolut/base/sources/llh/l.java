package llh;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.trading_onboarding.api.navigation.EndPromptParams;
import com.revolut.retail.feature.trading_onboarding.api.navigation.EndPromptType;
import com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig;
import efm.d0;
import grl.k9;
import kbb.r;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import l9k.v;
import skm.p0;
import te0.w;

/* JADX INFO: loaded from: classes10.dex */
public final class l implements oih.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c1l.e f196825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nxk.a f196826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ybl.k f196827c;
    public final ba8.f d;

    public l(c1l.e tradingOnboardingStartCommandProvider, nxk.a productCommsCommandProvider, r wealthMainTabProvider, ybl.k tradingAccountsInteractor, ba8.f juniorIsaNaviProvider) {
        Intrinsics.checkNotNullParameter(tradingOnboardingStartCommandProvider, "tradingOnboardingStartCommandProvider");
        Intrinsics.checkNotNullParameter(productCommsCommandProvider, "productCommsCommandProvider");
        Intrinsics.checkNotNullParameter(wealthMainTabProvider, "wealthMainTabProvider");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(juniorIsaNaviProvider, "juniorIsaNaviProvider");
        this.f196825a = tradingOnboardingStartCommandProvider;
        this.f196826b = productCommsCommandProvider;
        this.f196827c = tradingAccountsInteractor;
        this.d = juniorIsaNaviProvider;
    }

    public final ufm.b a(NaviCommand naviCommand, TradingOnboardingFeatureConfig.TradingAccountOrType tradingAccountOrType) {
        FeatureCommand featureCommand = new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.AS_TOP, new MainContainerInnerConfiguration(new MainContainerNavigationId.NewMainScreenContainerTabId(ibb.c.f160141b.f83420a, null), null, null, 6)));
        k9 value = k9.Trading;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        Intrinsics.checkNotNullParameter(value, "value");
        return this.f196825a.b(naviCommand, new TradingOnboardingFeatureConfig.TradingAccountOnboardingFeatureConfig(featureCommand, tradingAccountOrType, null, new EndPromptParams(true, EndPromptType.TRADING), new AnalyticsProduct.Retail(value)), null);
    }

    public final d0 b(WealthAccount.TaxAdvantageWealthAccount account, NaviCommand targetCommandIfOnboardingComplete) {
        d0 d0VarL;
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(targetCommandIfOnboardingComplete, "targetCommandIfOnboardingComplete");
        Continuation continuation = null;
        if (account instanceof WealthAccount.TaxAdvantageWealthAccount.JIsa.Custodian) {
            return w.o0(p0.f264003c, new kze.h(this, continuation, 27));
        }
        if (account.getF95254b() != null) {
            String f95254b = account.getF95254b();
            Intrinsics.h(f95254b);
            d0VarL = d0.m(new TradingOnboardingFeatureConfig.TradingAccountOrType.WithAvailableAccountId(f95254b, null));
            Intrinsics.checkNotNullExpressionValue(d0VarL, "just(...)");
        } else if (account.getF95253a() != null) {
            d0VarL = w.o0(p0.f264003c, new k(this, account, null));
        } else {
            d0VarL = d0.l(new IllegalStateException("TAAAccount doesn't have any ID but onboarding launch was required."));
            Intrinsics.checkNotNullExpressionValue(d0VarL, "error(...)");
        }
        ufm.i iVar = new ufm.i(new ufm.i(d0VarL, new g(3, new v(this, targetCommandIfOnboardingComplete, 28)), 0), new g(4, new v(account, this, 29)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }
}
