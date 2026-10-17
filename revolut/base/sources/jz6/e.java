package jz6;

import com.revolut.feature.freelancer.impl.ui.onboarding.validation.OnboardingInputDataValidator$ValidationState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f179589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OnboardingInputDataValidator$ValidationState f179590b;

    public e(String businessDescription, OnboardingInputDataValidator$ValidationState businessDescriptionValidationState) {
        Intrinsics.checkNotNullParameter(businessDescription, "businessDescription");
        Intrinsics.checkNotNullParameter(businessDescriptionValidationState, "businessDescriptionValidationState");
        this.f179589a = businessDescription;
        this.f179590b = businessDescriptionValidationState;
    }

    public static e a(e eVar, String businessDescription, OnboardingInputDataValidator$ValidationState businessDescriptionValidationState, int i) {
        if ((i & 1) != 0) {
            businessDescription = eVar.f179589a;
        }
        if ((i & 2) != 0) {
            businessDescriptionValidationState = eVar.f179590b;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(businessDescription, "businessDescription");
        Intrinsics.checkNotNullParameter(businessDescriptionValidationState, "businessDescriptionValidationState");
        return new e(businessDescription, businessDescriptionValidationState);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f179589a, eVar.f179589a) && Intrinsics.f(this.f179590b, eVar.f179590b);
    }

    public final int hashCode() {
        return this.f179590b.hashCode() + (this.f179589a.hashCode() * 31);
    }
}
