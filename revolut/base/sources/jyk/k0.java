package jyk;

import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingResultFeatureConfig;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class k0 implements oxk.v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sri.m f179489a;

    public k0(sri.m navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f179489a = navigator;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return wp5.y.D(cVar, "deeplink", 1, "trading") && Intrinsics.f(cVar.e(2), "onboarding-result");
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        if (Intrinsics.f(cVar.e(3), "failed")) {
            return new q06.h(new BridgeDestination(new FeatureCommand(new TradingOnboardingResultFeatureConfig.TradingOnboardingResultFailed(0))), new q06.b(ibb.c.f160141b, null));
        }
        return null;
    }

    @Override // jf0.d
    public final efm.d0 f(jf0.c cVar, boolean z) {
        if (!wp5.y.D(cVar, "deeplink", 3, "failed")) {
            ufm.c cVar2 = new ufm.c(new fg8.b(cVar, 2), 2);
            Intrinsics.checkNotNullExpressionValue(cVar2, "fromCallable(...)");
            return cVar2;
        }
        ufm.i iVar = new ufm.i(new ufm.i(new ufm.i(new ufm.c(new a68.f(11), 2), new g0(new jck.y(z, this, 7), 4), 1), new g0(new jud.d(this, 20), 5), 1), new g0(new d0(5), 6), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return ue0.e.I(iVar, zhm.h0.f322473a, new d0(6));
    }
}
