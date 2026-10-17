package yj7;

import aii.r;
import com.revolut.feature.insurance.impl.ui.cfac.claim.CFACInsuranceClaimFlowContract$Step;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CFACInsuranceClaimFlowContract$Step.SelectExpenses f314429a;

    public f(CFACInsuranceClaimFlowContract$Step.SelectExpenses nextStep) {
        Intrinsics.checkNotNullParameter(nextStep, "nextStep");
        this.f314429a = nextStep;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f314429a.equals(((f) obj2).f314429a);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f314429a.f75056a);
    }
}
