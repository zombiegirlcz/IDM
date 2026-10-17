package na5;

import com.revolut.feature.credit.post_termination_plan.api.models.CreditPostTerminationPlanDetails;
import ha5.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f213794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditPostTerminationPlanDetails f213795b;

    public a(d deeplink, CreditPostTerminationPlanDetails planDetails) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(planDetails, "planDetails");
        this.f213794a = deeplink;
        this.f213795b = planDetails;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f213794a, aVar.f213794a) && Intrinsics.f(this.f213795b, aVar.f213795b);
    }

    public final int hashCode() {
        return this.f213795b.hashCode() + (this.f213794a.hashCode() * 31);
    }
}
