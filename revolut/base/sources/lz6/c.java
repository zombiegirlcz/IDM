package lz6;

import kotlin.jvm.internal.Intrinsics;
import yji.n;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final oz6.a f200940l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final sz6.a f200941m;

    public c(oz6.a freelancerOnboardingProgressDelegate, sz6.a onboardingInputDataValidator) {
        Intrinsics.checkNotNullParameter(freelancerOnboardingProgressDelegate, "freelancerOnboardingProgressDelegate");
        Intrinsics.checkNotNullParameter(onboardingInputDataValidator, "onboardingInputDataValidator");
        this.f200940l = freelancerOnboardingProgressDelegate;
        this.f200941m = onboardingInputDataValidator;
    }
}
