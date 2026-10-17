package kmc;

import com.revolut.feature.robo.impl.ui.flow.onboarding.OnboardingFlowContract$State;
import com.revolut.feature.wealth.models.robo.Template;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        OnboardingFlowContract$State currentState = (OnboardingFlowContract$State) obj2;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        Template template = currentState.f85123c;
        if (template != null) {
            return new alc.a(template.f95706a);
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
