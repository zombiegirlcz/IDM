package v17;

import com.revolut.data.model.Data;
import com.revolut.feature.freelancer.common.models.sale.FreelancerSalesFilters$CompoundFreelancerSalesFilter;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FreelancerSalesFilters$CompoundFreelancerSalesFilter f285244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f285245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f285246c;
    public final List d;
    public final List e;
    public final boolean f;

    public k(FreelancerSalesFilters$CompoundFreelancerSalesFilter filter, Data filterInfoData, List allStatuses, List allTypes, List allDateRanges, boolean z) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(filterInfoData, "filterInfoData");
        Intrinsics.checkNotNullParameter(allStatuses, "allStatuses");
        Intrinsics.checkNotNullParameter(allTypes, "allTypes");
        Intrinsics.checkNotNullParameter(allDateRanges, "allDateRanges");
        this.f285244a = filter;
        this.f285245b = filterInfoData;
        this.f285246c = allStatuses;
        this.d = allTypes;
        this.e = allDateRanges;
        this.f = z;
    }

    public static k a(k kVar, FreelancerSalesFilters$CompoundFreelancerSalesFilter freelancerSalesFilters$CompoundFreelancerSalesFilter, Data data, int i) {
        if ((i & 1) != 0) {
            freelancerSalesFilters$CompoundFreelancerSalesFilter = kVar.f285244a;
        }
        FreelancerSalesFilters$CompoundFreelancerSalesFilter filter = freelancerSalesFilters$CompoundFreelancerSalesFilter;
        if ((i & 2) != 0) {
            data = kVar.f285245b;
        }
        Data filterInfoData = data;
        List allStatuses = kVar.f285246c;
        List allTypes = kVar.d;
        List allDateRanges = kVar.e;
        boolean z = (i & 32) != 0 ? kVar.f : true;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(filterInfoData, "filterInfoData");
        Intrinsics.checkNotNullParameter(allStatuses, "allStatuses");
        Intrinsics.checkNotNullParameter(allTypes, "allTypes");
        Intrinsics.checkNotNullParameter(allDateRanges, "allDateRanges");
        return new k(filter, filterInfoData, allStatuses, allTypes, allDateRanges, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f285244a, kVar.f285244a) && Intrinsics.f(this.f285245b, kVar.f285245b) && Intrinsics.f(this.f285246c, kVar.f285246c) && Intrinsics.f(this.d, kVar.d) && Intrinsics.f(this.e, kVar.e) && this.f == kVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + p.a.d(p.a.d(p.a.d(kii.e.c(this.f285245b, this.f285244a.hashCode() * 31, 31), 31, this.f285246c), 31, this.d), 31, this.e);
    }
}
