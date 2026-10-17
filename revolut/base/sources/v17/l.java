package v17;

import com.revolut.feature.freelancer.common.models.sale.FreelancerSalesFilters$CompoundFreelancerSalesFilter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FreelancerSalesFilters$CompoundFreelancerSalesFilter f285247a;

    public l(FreelancerSalesFilters$CompoundFreelancerSalesFilter filter) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        this.f285247a = filter;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f285247a, ((l) obj2).f285247a);
    }

    public final int hashCode() {
        return this.f285247a.hashCode();
    }
}
