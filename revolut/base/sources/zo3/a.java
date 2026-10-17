package zo3;

import com.revolut.feature.corporate_events.impl.navigation.CorporateEventsHomeFeatureConfig;
import com.revolut.feature.corporate_events.impl.ui.flow.home.CorporateEventsHomeFlowContract$Input;
import com.revolut.feature.corporate_events.navigation.CorporateEventsFeatureConfig;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import efm.d0;
import jf0.c;
import jf0.d;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import q06.b;
import q06.h;
import q06.k;
import sri.m;
import wp5.y;
import zh9.u0;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements d, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f323873a;

    public a(m navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f323873a = navigator;
    }

    @Override // jf0.d, q06.k
    public final boolean a(c cVar) {
        return y.D(cVar, "deeplink", 1, "trading") && Intrinsics.f(cVar.e(2), "corporate-events");
    }

    @Override // q06.k
    public final Object e(c cVar, Continuation continuation) {
        return new h(new CorporateEventsHomeFeatureConfig.CorporateEventsHomeDestination(new CorporateEventsHomeFlowContract$Input(new CorporateEventsFeatureConfig.CorporateEventsConfig(null, 7))), new b(ibb.c.f160141b, null));
    }

    @Override // jf0.d
    public final d0 f(c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        NaviCommand naviCommandF = u0.f(new CorporateEventsHomeFeatureConfig.CorporateEventsHomeDestination(new CorporateEventsHomeFlowContract$Input(new CorporateEventsFeatureConfig.CorporateEventsConfig(null, 7))));
        if (z) {
            naviCommandF = com.revolut.retail.core.navigation.a.c(new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(new MainContainerNavigationId.NewMainScreenContainerTabId(ibb.c.f160141b.f83420a, null), null, null, 6))), naviCommandF);
        }
        this.f323873a.c(naviCommandF);
        ufm.b bVarM = d0.m(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }
}
