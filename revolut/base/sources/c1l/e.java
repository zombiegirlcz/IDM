package c1l;

import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig;
import kotlin.jvm.internal.Intrinsics;
import skm.p0;
import te0.w;

/* JADX INFO: loaded from: classes13.dex */
public final class e implements qxk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f20540a;

    public e(b onboardingStatusToCommandTransformer) {
        Intrinsics.checkNotNullParameter(onboardingStatusToCommandTransformer, "onboardingStatusToCommandTransformer");
        this.f20540a = onboardingStatusToCommandTransformer;
    }

    public final ufm.b b(NaviCommand targetCommandIfOnboardingComplete, TradingOnboardingFeatureConfig.TradingAccountOnboardingFeatureConfig configIfOnboardingNeeded, NaviCommand naviCommand) {
        Intrinsics.checkNotNullParameter(targetCommandIfOnboardingComplete, "targetCommandIfOnboardingComplete");
        Intrinsics.checkNotNullParameter(configIfOnboardingNeeded, "configIfOnboardingNeeded");
        Intrinsics.checkNotNullParameter(targetCommandIfOnboardingComplete, "targetCommandIfOnboardingComplete");
        Intrinsics.checkNotNullParameter(configIfOnboardingNeeded, "configIfOnboardingNeeded");
        return w.o0(p0.f264003c, new a(this.f20540a, configIfOnboardingNeeded, targetCommandIfOnboardingComplete, naviCommand, null));
    }
}
