package cv6;

import com.revolut.feature.freelancer.common.models.acquiring_order.AcquiringOrderFilter;
import com.revolut.feature.freelancer.common.models.acquiring_payment.payment.AcquiringPaymentFilter;
import com.revolut.feature.freelancer.common.models.sale.FilteringDateRange;
import com.revolut.feature.freelancer.common.models.sale.FreelancerSalesFilters$CompoundFreelancerSalesFilter;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FilteringDateRange f109296b;

    public /* synthetic */ o(FilteringDateRange filteringDateRange, int i) {
        this.f109295a = i;
        this.f109296b = filteringDateRange;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        AcquiringPaymentFilter acquiringPaymentFilterA;
        switch (this.f109295a) {
            case 0:
                j update = (j) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                AcquiringPaymentFilter acquiringPaymentFilter = update.f109287b;
                FilteringDateRange filteringDateRange = acquiringPaymentFilter != null ? acquiringPaymentFilter.f73368b : null;
                FilteringDateRange filteringDateRange2 = this.f109296b;
                if (Intrinsics.f(filteringDateRange, filteringDateRange2)) {
                    acquiringPaymentFilterA = AcquiringPaymentFilter.a(update.f109287b, null, null, null, null, 13);
                    if (acquiringPaymentFilterA.b()) {
                        acquiringPaymentFilterA = null;
                    }
                } else {
                    AcquiringPaymentFilter acquiringPaymentFilter2 = update.f109287b;
                    if (acquiringPaymentFilter2 == null) {
                        acquiringPaymentFilter2 = new AcquiringPaymentFilter(0);
                    }
                    acquiringPaymentFilterA = AcquiringPaymentFilter.a(acquiringPaymentFilter2, null, filteringDateRange2, null, null, 13);
                }
                return j.a(update, null, acquiringPaymentFilterA, 5);
            case 1:
                lu6.l update2 = (lu6.l) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                AcquiringOrderFilter acquiringOrderFilter = update2.f200048b;
                FilteringDateRange filteringDateRangeB2 = acquiringOrderFilter != null ? acquiringOrderFilter.B2() : null;
                FilteringDateRange filteringDateRange3 = this.f109296b;
                return Intrinsics.f(filteringDateRangeB2, filteringDateRange3) ? lu6.l.a(update2, null, acquiringOrderFilter.j9(o0.f186429a.b(AcquiringOrderFilter.DateRange.class)), 5) : lu6.l.a(update2, null, com.revolut.feature.freelancer.impl.ui.acquiring_order.filters.screen.a.J2(acquiringOrderFilter, new AcquiringOrderFilter.DateRange(filteringDateRange3)), 5);
            default:
                FreelancerSalesFilters$CompoundFreelancerSalesFilter updateFilter = (FreelancerSalesFilters$CompoundFreelancerSalesFilter) obj2;
                Intrinsics.checkNotNullParameter(updateFilter, "$this$updateFilter");
                return FreelancerSalesFilters$CompoundFreelancerSalesFilter.a(updateFilter, null, null, null, this.f109296b, null, null, null, 239);
        }
    }

    public /* synthetic */ o(FilteringDateRange filteringDateRange, com.revolut.feature.freelancer.impl.ui.acquiring_order.filters.screen.a aVar) {
        this.f109295a = 1;
        this.f109296b = filteringDateRange;
    }
}
