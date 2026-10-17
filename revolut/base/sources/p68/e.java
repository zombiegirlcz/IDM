package p68;

import cli.j;
import com.revolut.feature.junior_onboarding.api.model.OnboardingTerms;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OnboardingTerms f233226a;

    public e(OnboardingTerms onboardingTerms) {
        this.f233226a = onboardingTerms;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f233226a, ((e) obj2).f233226a);
    }

    public final int hashCode() {
        OnboardingTerms onboardingTerms = this.f233226a;
        if (onboardingTerms == null) {
            return 0;
        }
        return onboardingTerms.hashCode();
    }
}
