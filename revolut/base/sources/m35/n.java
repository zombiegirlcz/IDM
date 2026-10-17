package m35;

import com.revolut.feature.credit.post_termination_plan.api.navigation.CreditPostTerminationPlanEntryPoint;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class n implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditPostTerminationPlanEntryPoint.PlanDetailsFlow f202290a;

    public n(CreditPostTerminationPlanEntryPoint.PlanDetailsFlow descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f202290a = descriptor;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && this.f202290a.equals(((n) obj2).f202290a);
    }

    public final int hashCode() {
        return this.f202290a.hashCode();
    }
}
