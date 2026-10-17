package l4j;

import aii.r;
import com.revolut.domain.models.beneficiary.BeneficiaryRouteDetails;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BeneficiaryRouteDetails f192144a;

    public b(BeneficiaryRouteDetails selectedRoute) {
        Intrinsics.checkNotNullParameter(selectedRoute, "selectedRoute");
        this.f192144a = selectedRoute;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f192144a, ((b) obj2).f192144a);
    }

    public final int hashCode() {
        return this.f192144a.hashCode();
    }
}
