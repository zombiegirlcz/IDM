package ta9;

import com.revolut.feature.onboarding.impl.onboarding.service.OnboardingCountriesService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class s0 implements e4m.e {
    public static OnboardingCountriesService a(ek.a converterFactory, ik0.b retrofitFactory) {
        r0.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(OnboardingCountriesService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        OnboardingCountriesService onboardingCountriesService = (OnboardingCountriesService) objCreate;
        vc.s.k(onboardingCountriesService);
        return onboardingCountriesService;
    }
}
