package com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/flow/SavingsOnboardingFlowContract$FailResolveFirstStepException", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "", "toString", "()Ljava/lang/String;", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SavingsOnboardingFlowContract$FailResolveFirstStepException extends IllegalStateException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f83236a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavingsOnboardingFlowContract$FailResolveFirstStepException(Throwable throwable) {
        super("Fail to resolve savings onboarding step");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.f83236a = throwable;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof SavingsOnboardingFlowContract$FailResolveFirstStepException) && Intrinsics.f(this.f83236a, ((SavingsOnboardingFlowContract$FailResolveFirstStepException) obj2).f83236a);
    }

    public final int hashCode() {
        return this.f83236a.hashCode();
    }
}
