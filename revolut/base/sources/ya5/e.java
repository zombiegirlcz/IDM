package ya5;

import com.revolut.feature.credit.post_termination_plan.api.models.CreditPostTerminationPlanDetails;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditPostTerminationPlanDetails f311931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f311932b;

    public e(CreditPostTerminationPlanDetails planDetails, dj0.d availableBalance) {
        Intrinsics.checkNotNullParameter(planDetails, "planDetails");
        Intrinsics.checkNotNullParameter(availableBalance, "availableBalance");
        this.f311931a = planDetails;
        this.f311932b = availableBalance;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f311931a, eVar.f311931a) && Intrinsics.f(this.f311932b, eVar.f311932b);
    }

    public final int hashCode() {
        return this.f311932b.hashCode() + (this.f311931a.hashCode() * 31);
    }
}
