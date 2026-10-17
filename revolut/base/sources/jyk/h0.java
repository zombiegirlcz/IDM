package jyk;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.trading_onboarding.api.navigation.EndPromptParams;
import com.revolut.retail.feature.trading_onboarding.api.navigation.EndPromptType;
import com.revolut.retail.feature.trading_onboarding.api.navigation.RemediationType;
import com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig;
import grl.k9;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class h0 implements oxk.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sri.m f179480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f179481b;

    public h0(sri.m navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f179480a = navigator;
        this.f179481b = yhm.j.b(new jxi.a(12));
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return wp5.y.D(cVar, "deeplink", 1, "trading") && Intrinsics.f(cVar.e(2), "remediation") && cVar.d.get("portfolioId") != null;
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        HashMap map = cVar.d;
        String str = (String) map.get("portfolioId");
        if (str == null) {
            return null;
        }
        String str2 = (String) map.get("remediationType");
        RemediationType.Generic generic = str2 != null ? new RemediationType.Generic(str2) : null;
        NaviCommand naviCommand = (NaviCommand) this.f179481b.getValue();
        EndPromptParams endPromptParams = new EndPromptParams(false, EndPromptType.TRADING);
        k9 k9Var = k9.Trading;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new q06.h(new BridgeDestination(new FeatureCommand(new TradingOnboardingFeatureConfig.TradingRemediationFeatureConfig(naviCommand, str, endPromptParams, generic, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var)))), null);
    }

    @Override // jf0.d
    public final efm.d0 f(jf0.c deeplink, boolean z) {
        efm.d0 d0VarL;
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        String strE = deeplink.e(2);
        HashMap map = deeplink.d;
        if (!Intrinsics.f(strE, "remediation")) {
            throw new IllegalStateException(j6.a.q("provide handler for ", deeplink.e(2)));
        }
        String str = (String) map.get("remediationType");
        RemediationType.Generic generic = str != null ? new RemediationType.Generic(str) : null;
        String str2 = (String) map.get("portfolioId");
        if (str2 != null) {
            d0VarL = efm.d0.m(str2);
            Intrinsics.checkNotNullExpressionValue(d0VarL, "just(...)");
        } else {
            d0VarL = efm.d0.l(new IllegalStateException("Portfolio id missing from remediation deeplink but should be filtered out."));
            Intrinsics.checkNotNullExpressionValue(d0VarL, "error(...)");
        }
        ufm.i iVar = new ufm.i(new ufm.i(new ufm.i(new ufm.i(d0VarL, new jy2.a(new jp3.b(this, generic, 26), 27), 1), new jy2.a(new gae.a(z, this, 22), 28), 1), new jy2.a(new jud.d(this, 19), 29), 1), new g0(new d0(1), 0), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return ue0.e.F(iVar, Boolean.TRUE);
    }
}
