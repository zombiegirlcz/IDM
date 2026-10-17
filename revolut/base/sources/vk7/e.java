package vk7;

import aii.r;
import com.revolut.feature.insurance.impl.ui.cfac.CFACInsuranceFlowContract$Step;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CFACInsuranceFlowContract$Step.ClaimDetails f289876a;

    public e(CFACInsuranceFlowContract$Step.ClaimDetails nextStep) {
        Intrinsics.checkNotNullParameter(nextStep, "nextStep");
        this.f289876a = nextStep;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f289876a.equals(((e) obj2).f289876a);
    }

    public final int hashCode() {
        return this.f289876a.hashCode();
    }
}
