package ek7;

import com.revolut.feature.insurance.impl.ui.cfac.claim.CFACInsuranceClaimFlowContract$Step;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CFACInsuranceClaimFlowContract$Step f126969a;

    public k(CFACInsuranceClaimFlowContract$Step nextStep) {
        Intrinsics.checkNotNullParameter(nextStep, "nextStep");
        this.f126969a = nextStep;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f126969a, ((k) obj2).f126969a);
    }

    public final int hashCode() {
        return this.f126969a.hashCode();
    }
}
