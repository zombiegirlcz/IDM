package a6j;

import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import efm.d0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import sri.m;
import ue0.e;
import ufm.i;
import wp5.y;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements s5j.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f1701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xoj.a f1702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sj3.a f1703c;

    public d(m navigator, xoj.a featuresInteractor, sj3.a commoditiesOnboardingStartCommandProvider) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(commoditiesOnboardingStartCommandProvider, "commoditiesOnboardingStartCommandProvider");
        this.f1701a = navigator;
        this.f1702b = featuresInteractor;
        this.f1703c = commoditiesOnboardingStartCommandProvider;
    }

    public static FeatureCommand b(NaviCommand naviCommand) {
        return new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(new MainContainerNavigationId.NewMainScreenContainerTabId(ibb.c.f160141b.f83420a, null), null, naviCommand, 2)));
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "commodities-volatility");
    }

    public final i c(jf0.c cVar) {
        String strE = cVar.e(3);
        String strE2 = cVar.e(2);
        String str = (String) cVar.d.get("baseCurrency");
        i iVar = new i(((cpj.b) this.f1702b).f(yoj.c.COMMODITIES, yoj.d.DISABLED), new a6b.a(new a5b.b(this, strE, str, strE2, 1), 2), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        return nim.a.b(c(cVar), continuation);
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        i iVar = new i(c(deeplink), new a6b.a(new a(this, z, 0), 1), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return e.F(iVar, Boolean.TRUE);
    }
}
