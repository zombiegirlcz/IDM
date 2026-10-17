package c17;

import com.revolut.feature.freelancer.impl.ui.onboarding.validation.OnboardingInputDataValidator$ValidationState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OnboardingInputDataValidator$ValidationState f20404b;

    public /* synthetic */ q(OnboardingInputDataValidator$ValidationState onboardingInputDataValidator$ValidationState, int i) {
        this.f20403a = i;
        this.f20404b = onboardingInputDataValidator$ValidationState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f20403a) {
            case 0:
                OnboardingInputDataValidator$ValidationState onboardingInputDataValidator$ValidationState = this.f20404b;
                Intrinsics.h(onboardingInputDataValidator$ValidationState);
                return h.a((h) obj2, null, onboardingInputDataValidator$ValidationState, 23);
            default:
                OnboardingInputDataValidator$ValidationState onboardingInputDataValidator$ValidationState2 = this.f20404b;
                Intrinsics.h(onboardingInputDataValidator$ValidationState2);
                return jz6.e.a((jz6.e) obj2, null, onboardingInputDataValidator$ValidationState2, 1);
        }
    }
}
