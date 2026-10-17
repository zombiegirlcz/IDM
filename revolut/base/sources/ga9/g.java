package ga9;

import com.revolut.feature.onboarding.impl.onboarding.OnboardingFlowContract$State;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OnboardingFlowContract$State f142075b;

    public /* synthetic */ g(OnboardingFlowContract$State onboardingFlowContract$State, int i) {
        this.f142074a = i;
        this.f142075b = onboardingFlowContract$State;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        OnboardingFlowContract$State update = (OnboardingFlowContract$State) obj2;
        switch (this.f142074a) {
            case 0:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                break;
            default:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                break;
        }
        return OnboardingFlowContract$State.a(this.f142075b, null, null, null, 11);
    }
}
