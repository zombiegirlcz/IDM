package jyk;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.trading_onboarding.api.navigation.EndPromptParams;
import com.revolut.retail.feature.trading_onboarding.api.navigation.EndPromptType;
import com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig;
import com.revolut.retail.feature.trading_onboarding.impl.ui.failed_prompt.flow.GiaOnboardingFailedFlowContract$Destination;
import com.revolut.retail.feature.trading_onboarding.impl.ui.failed_prompt.flow.GiaOnboardingFailedFlowContract$InputData;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import grl.k9;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class c0 implements oxk.n {

    @NotNull
    private static final a0 Companion = new a0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xoj.a f179464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1l.e f179465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d1l.b f179466c;
    public final sri.m d;

    public c0(xoj.a featuresInteractor, c1l.e tradingOnboardingStartCommandProvider, d1l.b tradingOnboardingAccountOrTypeProvider, sri.m navigator) {
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(tradingOnboardingStartCommandProvider, "tradingOnboardingStartCommandProvider");
        Intrinsics.checkNotNullParameter(tradingOnboardingAccountOrTypeProvider, "tradingOnboardingAccountOrTypeProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f179464a = featuresInteractor;
        this.f179465b = tradingOnboardingStartCommandProvider;
        this.f179466c = tradingOnboardingAccountOrTypeProvider;
        this.d = navigator;
    }

    public static FeatureCommand c() {
        return new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(new MainContainerNavigationId.NewMainScreenContainerTabId(ibb.c.f160141b.f83420a, null), null, null, 6)));
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return wp5.y.D(cVar, "deeplink", 1, "trading") && Intrinsics.f(cVar.e(2), "startstocksonboarding");
    }

    public final efm.d0 b(jf0.c cVar) {
        String upperCase;
        akg.n nVarV;
        ybl.k kVar = this.f179466c.f110662a;
        String str = (String) cVar.d.get("accountType");
        if (str != null) {
            upperCase = str.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        } else {
            upperCase = null;
        }
        boolean zF = Intrinsics.f(upperCase, "TAA");
        cfl.m mVar = cfl.m.f23746a;
        int i = 1;
        if (zF) {
            nVarV = nim.a.v(ybl.k.k(kVar, null, null, mVar, 3), new ael.k0(TradingAccountType.Taa.f105275a, i));
        } else {
            boolean zF2 = Intrinsics.f(upperCase, "GIA");
            TradingAccountType.Gia gia = TradingAccountType.Gia.f105270a;
            if (zF2) {
                nVarV = nim.a.v(ybl.k.k(kVar, null, null, mVar, 3), new ael.k0(gia, i));
            } else {
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.b(rd0.c.WARNING, "TradingOnboardingDeeplinkActionPerformerImpl", a0.d.r(upperCase, " not supported. open default gia onboarding config"), null, null, 16);
                nVarV = nim.a.v(ybl.k.k(kVar, null, null, mVar, 3), new ael.k0(gia, i));
            }
        }
        efm.d0 d0VarFirstOrError = m70.a.g(zi0.c.J(rd0.e.c(nVarV, kotlin.coroutines.g.f186406a)), null, new jul.c(14), 1).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return d0VarFirstOrError;
    }

    public final ufm.b d(TradingOnboardingFeatureConfig.TradingAccountOrType tradingAccountOrType) {
        FeatureCommand featureCommandC = c();
        k9 value = k9.Trading;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        Intrinsics.checkNotNullParameter(value, "value");
        return this.f179465b.b(featureCommandC, new TradingOnboardingFeatureConfig.TradingAccountOnboardingFeatureConfig(featureCommandC, tradingAccountOrType, null, new EndPromptParams(false, EndPromptType.TRADING), new AnalyticsProduct.Retail(value)), null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d4, code lost:
    
        if (r10 != r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r9, kotlin.coroutines.Continuation r10) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jyk.c0.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final efm.d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        ufm.i iVar = new ufm.i(((cpj.b) this.f179464a).f(yoj.c.WEALTH_TRADING, yoj.d.DISABLED), new jy2.a(new z(this, deeplink, z, 0), 21), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return ue0.e.F(iVar, Boolean.TRUE);
    }

    public final ufm.b g(bzk.h hVar, boolean z) {
        NaviCommand naviCommandC = vhi.c.c(new GiaOnboardingFailedFlowContract$Destination(new GiaOnboardingFailedFlowContract$InputData(hVar)), yhi.b.SOLID, null, false, 12);
        if (z) {
            naviCommandC = com.revolut.retail.core.navigation.a.c(c(), naviCommandC);
        }
        this.d.c(naviCommandC);
        ufm.b bVarM = efm.d0.m(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }
}
