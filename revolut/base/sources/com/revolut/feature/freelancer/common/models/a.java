package com.revolut.feature.freelancer.common.models;

import com.revolut.feature.freelancer.common.models.FreelancerAccountClosureState;
import com.revolut.feature.freelancer.common.models.FreelancerAccountOnboardingState;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static final FreelancerAccountClosureState a(FreelancerAccountOnboardingState freelancerAccountOnboardingState) {
        FreelancerAccountDetails freelancerAccountDetails;
        FreelancerAccountClosure freelancerAccountClosure;
        Intrinsics.checkNotNullParameter(freelancerAccountOnboardingState, "<this>");
        FreelancerAccountOnboardingState.Onboarded onboarded = freelancerAccountOnboardingState instanceof FreelancerAccountOnboardingState.Onboarded ? (FreelancerAccountOnboardingState.Onboarded) freelancerAccountOnboardingState : null;
        if (onboarded == null || (freelancerAccountDetails = onboarded.f73273a) == null || (freelancerAccountClosure = freelancerAccountDetails.f) == null) {
            return null;
        }
        return freelancerAccountClosure.f73265a;
    }

    public static final boolean b(FreelancerAccountOnboardingState freelancerAccountOnboardingState) {
        Intrinsics.checkNotNullParameter(freelancerAccountOnboardingState, "<this>");
        return a(freelancerAccountOnboardingState) instanceof FreelancerAccountClosureState.Closed;
    }

    public static final boolean c(FreelancerAccountOnboardingState freelancerAccountOnboardingState) {
        Intrinsics.checkNotNullParameter(freelancerAccountOnboardingState, "<this>");
        return a(freelancerAccountOnboardingState) instanceof FreelancerAccountClosureState.Closed.Manually;
    }

    public static final boolean d(FreelancerAccountOnboardingState freelancerAccountOnboardingState) {
        Intrinsics.checkNotNullParameter(freelancerAccountOnboardingState, "<this>");
        return (freelancerAccountOnboardingState instanceof FreelancerAccountOnboardingState.NotOnboarded) || b(freelancerAccountOnboardingState);
    }

    public static final FreelancerAccountDetails e(FreelancerAccountOnboardingState freelancerAccountOnboardingState) {
        Intrinsics.checkNotNullParameter(freelancerAccountOnboardingState, "<this>");
        if (freelancerAccountOnboardingState instanceof FreelancerAccountOnboardingState.Onboarded) {
            return ((FreelancerAccountOnboardingState.Onboarded) freelancerAccountOnboardingState).f73273a;
        }
        if ((freelancerAccountOnboardingState instanceof FreelancerAccountOnboardingState.NotOnboarded) || (freelancerAccountOnboardingState instanceof FreelancerAccountOnboardingState.Pending)) {
            throw new IllegalStateException("Unable to get freelancer account data for not onboarded user)");
        }
        throw new NoWhenBranchMatchedException();
    }
}
