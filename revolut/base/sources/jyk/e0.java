package jyk;

import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.trading_onboarding.impl.ui.investment_goals.InvestmentGoalsFlowContract$InvestmentGoalsDestination;
import ip0.yc0;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e0 implements oxk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sri.m f179469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f179470b;

    public e0(sri.m navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f179469a = navigator;
        this.f179470b = yhm.j.b(new jxi.a(11));
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return wp5.y.D(cVar, "deeplink", 1, "trading") && Intrinsics.f(cVar.e(2), "investment-account-objectives");
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        return new q06.h(new BridgeDestination(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) InvestmentGoalsFlowContract$InvestmentGoalsDestination.f104182b, false, (Integer) null, 0, 61))), null);
    }

    @Override // jf0.d
    public final efm.d0 f(jf0.c cVar, boolean z) {
        efm.d0 d0VarL;
        if (wp5.y.D(cVar, "deeplink", 2, "investment-account-objectives")) {
            d0VarL = efm.d0.m(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) InvestmentGoalsFlowContract$InvestmentGoalsDestination.f104182b, false, (Integer) null, 0, 61)));
            Intrinsics.checkNotNullExpressionValue(d0VarL, "just(...)");
        } else {
            d0VarL = efm.d0.l(new IllegalStateException(j6.a.q("provide handler for ", cVar.e(2))));
        }
        pfm.z zVarO = new ufm.i(new ufm.i(new ufm.i(d0VarL, new jy2.a(new gae.a(z, this, 21), 24), 1), new jy2.a(new yc0(1, this.f179469a, sri.m.class, "navigate", "navigate(Lcom/revolut/retail/core/navigation/NaviCommand;)V", 0, 20), 25), 1), new jy2.a(new d0(0), 26), 1).o(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(zVarO, "onErrorReturnItem(...)");
        return zVarO;
    }
}
