package gyk;

import com.revolut.retail.feature.trading_onboarding.impl.data.network.OnboardingService;
import e4m.e;
import kotlin.jvm.internal.Intrinsics;
import vc.s;

/* JADX INFO: loaded from: classes12.dex */
public abstract class b implements e {
    public static OnboardingService a(a aVar, ik0.b retrofitFactory, ek.a converterFactory) {
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(OnboardingService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        OnboardingService onboardingService = (OnboardingService) objCreate;
        s.k(onboardingService);
        return onboardingService;
    }
}
