package jyk;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.trading_onboarding.api.navigation.EndPromptParams;
import com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import skm.p0;

/* JADX INFO: loaded from: classes12.dex */
public final class y implements oxk.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sri.m f179513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ybl.k f179514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final clc.b f179515c;
    public final Lazy d;

    public y(sri.m navigator, ybl.k tradingAccountsInteractor, clc.b roboOnboardingEntryCommandFactory) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(roboOnboardingEntryCommandFactory, "roboOnboardingEntryCommandFactory");
        this.f179513a = navigator;
        this.f179514b = tradingAccountsInteractor;
        this.f179515c = roboOnboardingEntryCommandFactory;
        this.d = yhm.j.b(new jxi.a(10));
    }

    public static FeatureCommand b(TradingAccount tradingAccount, NaviCommand naviCommand, EndPromptParams endPromptParams, AnalyticsProduct.Retail retail) {
        return gc0.c.f(new TradingOnboardingFeatureConfig.TradingAccountOnboardingFeatureConfig(naviCommand, new TradingOnboardingFeatureConfig.TradingAccountOrType.WithTradingAccount(tradingAccount), null, endPromptParams, retail));
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return wp5.y.D(cVar, "deeplink", 1, "trading") && Intrinsics.f(cVar.e(2), "account-remediation") && cVar.d.get("accountId") != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r17, kotlin.coroutines.Continuation r18) {
        /*
            Method dump skipped, instruction units count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jyk.y.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final efm.d0 f(jf0.c cVar, boolean z) {
        if (!wp5.y.D(cVar, "deeplink", 2, "account-remediation")) {
            throw new IllegalStateException(j6.a.q("provide handler for ", cVar.e(2)));
        }
        ufm.i iVar = new ufm.i(new ufm.i(new ufm.i(te0.w.o0(p0.f264003c, new w(cVar, this, null)), new jy2.a(new gae.a(z, this, 20), 18), 1), new jy2.a(new jud.d(this, 17), 19), 1), new jy2.a(new jxb.g(29), 20), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return ue0.e.F(iVar, Boolean.TRUE);
    }
}
