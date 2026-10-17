package izk;

import a08.o0;
import a1l.c;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.retail.feature.trading_onboarding.api.domain.model.OnboardingPart;
import com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig;
import com.revolut.retail.feature.trading_onboarding.impl.ui.helper_next.NextContract$Configuration;
import gzk.d;
import i2i.d0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ofm.h;
import te0.w;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends pri.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f169892h;
    public final NextContract$Configuration i;

    public b(d router, NextContract$Configuration configuration) {
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f169892h = router;
        this.i = configuration;
    }

    @Override // pri.b, pri.e
    public final void h(rri.a aVar) {
        gzk.b view = (gzk.b) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.h(view);
        NextContract$Configuration nextContract$Configuration = this.i;
        OnboardingPart currentOnboardingPart = nextContract$Configuration.f104174a;
        TradingOnboardingFeatureConfig onboardingLaunchingConfig = nextContract$Configuration.f104175b;
        d dVar = this.f169892h;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(currentOnboardingPart, "currentOnboardingPart");
        Intrinsics.checkNotNullParameter(onboardingLaunchingConfig, "onboardingLaunchingConfig");
        efm.b bVarC0 = dVar.f148159a.c0(myk.a.a(onboardingLaunchingConfig, currentOnboardingPart, true, true));
        Function1 function1K = K();
        pfm.a aVar2 = new pfm.a(bVarC0, new f61.a(new d0(new BreadcrumbException(), 27), (byte) 0), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        a function = a.f169891a;
        Intrinsics.checkNotNullParameter(function, "function");
        h hVarW = aVar2.w(new o0(25, function1K), new c(8));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        w.j0(this.f239031a, hVarW);
    }
}
