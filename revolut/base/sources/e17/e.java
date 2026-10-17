package e17;

import c17.o;
import c17.r;
import com.revolut.feature.freelancer.impl.ui.profile.website.FreelancerWebsiteScreenContract$InputData;
import dce.s0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import yji.n;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends n implements c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final oz6.a f121900l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final sz6.a f121901m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public FreelancerWebsiteScreenContract$InputData f121902n;

    public e(oz6.a freelancerOnboardingProgressDelegate, sz6.a onboardingInputDataValidator) {
        Intrinsics.checkNotNullParameter(freelancerOnboardingProgressDelegate, "freelancerOnboardingProgressDelegate");
        Intrinsics.checkNotNullParameter(onboardingInputDataValidator, "onboardingInputDataValidator");
        this.f121900l = freelancerOnboardingProgressDelegate;
        this.f121901m = onboardingInputDataValidator;
    }

    @Override // e17.c
    public final Object E0(c17.h hVar, r rVar) {
        return Unit.f186387a;
    }

    @Override // e17.c
    public final Unit p0(c17.h hVar) {
        String str = hVar.f20389b;
        if (str == null) {
            return Unit.f186387a;
        }
        FreelancerWebsiteScreenContract$InputData freelancerWebsiteScreenContract$InputData = this.f121902n;
        Continuation continuation = null;
        if (freelancerWebsiteScreenContract$InputData == null) {
            Intrinsics.r("inputData");
            throw null;
        }
        n.j2(this, rd0.e.b(((com.revolut.feature.freelancer.impl.ui.onboarding.validation.a) this.f121901m).b(str, freelancerWebsiteScreenContract$InputData.f74076b)), null, new s0(this, hVar, continuation, 28), 3);
        return Unit.f186387a;
    }

    @Override // e17.c
    public final void y1(FreelancerWebsiteScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f121902n = inputData;
    }

    @Override // e17.c
    public final o z1(gs6.a urlVerificationMode) {
        Intrinsics.checkNotNullParameter(urlVerificationMode, "urlVerificationMode");
        return o.ONBOARDING;
    }
}
