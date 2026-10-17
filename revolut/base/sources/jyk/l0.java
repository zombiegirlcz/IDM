package jyk;

import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.trading_onboarding.api.TradingOnboardingRevampApi$Toggles$TradingOnboardingBackendFlowKompotWrapper;
import com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_backend_flow.TradingOnboardingBackendFlowContract$Configuration;
import com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_backend_flow.TradingOnboardingBackendFlowContract$Destination;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes12.dex */
public final class l0 implements oxk.x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sri.m f179491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dkf.a f179492b;

    public l0(sri.m navigator, dkf.a tradingOnboardingBackendFlowControllerToggleProvider) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(tradingOnboardingBackendFlowControllerToggleProvider, "tradingOnboardingBackendFlowControllerToggleProvider");
        this.f179491a = navigator;
        this.f179492b = tradingOnboardingBackendFlowControllerToggleProvider;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return wp5.y.D(cVar, "deeplink", 1, "trading") && Intrinsics.f(cVar.e(2), "onboarding") && Intrinsics.f(cVar.e(3), "acknowledgements") && Intrinsics.f(cVar.e(4), "w8ben") && cVar.d.containsKey("accountId");
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        NaviCommand activityNavigateCommand;
        String str = (String) cVar.d.get("accountId");
        if (str == null) {
            return null;
        }
        boolean zC = ((jte.d) this.f179492b.f115504a).c(TradingOnboardingRevampApi$Toggles$TradingOnboardingBackendFlowKompotWrapper.f104069c);
        TradingOnboardingBackendFlowContract$Configuration.W8BEN w8ben = new TradingOnboardingBackendFlowContract$Configuration.W8BEN(str, zC);
        if (zC) {
            activityNavigateCommand = u0.f(new TradingOnboardingBackendFlowContract$Destination(w8ben));
        } else {
            h0l.f.Companion.getClass();
            activityNavigateCommand = new ActivityNavigateCommand(h0l.a.f148430b, w8ben, null, null, 0, null, null, null, null, false, 1020);
        }
        return new q06.h(new BridgeDestination(activityNavigateCommand), null);
    }

    @Override // jf0.d
    public final efm.d0 f(jf0.c deeplink, boolean z) {
        Object activityNavigateCommand;
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        String str = (String) deeplink.d.get("accountId");
        if (str == null) {
            ufm.b bVarM = efm.d0.m(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        boolean zC = ((jte.d) this.f179492b.f115504a).c(TradingOnboardingRevampApi$Toggles$TradingOnboardingBackendFlowKompotWrapper.f104069c);
        TradingOnboardingBackendFlowContract$Configuration.W8BEN w8ben = new TradingOnboardingBackendFlowContract$Configuration.W8BEN(str, zC);
        if (zC) {
            activityNavigateCommand = u0.f(new TradingOnboardingBackendFlowContract$Destination(w8ben));
        } else {
            h0l.f.Companion.getClass();
            activityNavigateCommand = new ActivityNavigateCommand(h0l.a.f148430b, w8ben, null, null, 0, null, null, null, null, false, 1020);
        }
        ufm.i iVar = new ufm.i(new ufm.c(new fag.g(this, activityNavigateCommand, 23), 2), new g0(new d0(7), 7), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }
}
