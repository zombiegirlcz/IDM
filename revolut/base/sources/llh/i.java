package llh;

import android.os.Parcelable;
import ard.t;
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
import kotlin.jvm.internal.Intrinsics;
import l9k.v;
import li8.n;
import lk7.m;
import te0.w;
import xzg.q0;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements oih.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c1l.e f196818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wxk.f f196819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wxk.c f196820c;
    public final ybl.k d;

    public i(c1l.e tradingOnboardingStartCommandProvider, wxk.f stocksProductCommsCommandProvider, wxk.c privateMarketsProductCommsCommandProvider, r wealthMainTabProvider, nlh.b tradeCommandProvider, ybl.k tradingAccountsInteractor) {
        Intrinsics.checkNotNullParameter(tradingOnboardingStartCommandProvider, "tradingOnboardingStartCommandProvider");
        Intrinsics.checkNotNullParameter(stocksProductCommsCommandProvider, "stocksProductCommsCommandProvider");
        Intrinsics.checkNotNullParameter(privateMarketsProductCommsCommandProvider, "privateMarketsProductCommsCommandProvider");
        Intrinsics.checkNotNullParameter(wealthMainTabProvider, "wealthMainTabProvider");
        Intrinsics.checkNotNullParameter(tradeCommandProvider, "tradeCommandProvider");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        this.f196818a = tradingOnboardingStartCommandProvider;
        this.f196819b = stocksProductCommsCommandProvider;
        this.f196820c = privateMarketsProductCommsCommandProvider;
        this.d = tradingAccountsInteractor;
    }

    public final FeatureCommand c() {
        return new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.AS_TOP, new MainContainerInnerConfiguration(new MainContainerNavigationId.NewMainScreenContainerTabId(ibb.c.f160141b.f83420a, null), null, null, 6)));
    }

    public final d0 d(NaviCommand naviCommand, WealthAccount.Securities securities) {
        String str;
        boolean z;
        String str2 = securities != null ? securities.e : null;
        String str3 = securities != null ? securities.d : null;
        if ((securities != null ? securities.f95239b : null) == q0.PERSONAL_JOINT) {
            str = str2;
            z = true;
        } else {
            str = str2;
            z = false;
        }
        if (str3 != null) {
            d0 d0VarFirstOrError = rd0.e.c(mo3.a.g(zi0.c.w(ybl.k.d(this.d, str3)), null, new m(10), 1), kotlin.coroutines.g.f186406a).firstOrError();
            g gVar = new g(2, new t(str3, this, z, naviCommand, 15));
            d0VarFirstOrError.getClass();
            ufm.i iVar = new ufm.i(d0VarFirstOrError, gVar, 0);
            Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
            return iVar;
        }
        c1l.e eVar = this.f196818a;
        if (str == null) {
            FeatureCommand featureCommandC = c();
            k9 k9Var = k9.Trading;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            return qxk.a.a(eVar, naviCommand, featureCommandC, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var));
        }
        FeatureCommand featureCommandC2 = c();
        TradingOnboardingFeatureConfig.TradingAccountOrType.WithAvailableAccountId withAvailableAccountId = new TradingOnboardingFeatureConfig.TradingAccountOrType.WithAvailableAccountId(str, null);
        EndPromptParams endPromptParams = new EndPromptParams(z, z ? EndPromptType.JOINT_TRADING : EndPromptType.TRADING);
        k9 k9Var2 = k9.Trading;
        Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
        TradingOnboardingFeatureConfig.TradingAccountOnboardingFeatureConfig tradingAccountOnboardingFeatureConfig = new TradingOnboardingFeatureConfig.TradingAccountOnboardingFeatureConfig(featureCommandC2, withAvailableAccountId, null, endPromptParams, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2));
        return eVar.b(naviCommand, tradingAccountOnboardingFeatureConfig, z ? new FeatureCommand(tradingAccountOnboardingFeatureConfig) : null);
    }

    public final ufm.i e(sih.b tradeTabIfOnboarded, WealthAccount.Securities securities) {
        Intrinsics.checkNotNullParameter(tradeTabIfOnboarded, "tradeTabIfOnboarded");
        ufm.i iVar = new ufm.i(new ufm.i(w.o0(kotlin.coroutines.g.f186406a, new ll6.i(this, tradeTabIfOnboarded, null, 8)), new g(0, new v(this, securities, 27)), 0), new g(1, new n(tradeTabIfOnboarded, 2, securities, this)), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }
}
