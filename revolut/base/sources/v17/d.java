package v17;

import com.revolut.feature.freelancer.common.models.sale.FilteringDateRange;
import com.revolut.feature.freelancer.common.models.sale.FreelancerSalesFilters$CompoundFreelancerSalesFilter;
import com.revolut.feature.freelancer.impl.ui.sales.filters.screen.sales_filters.FreelancerSalesFiltersScreen;
import com.youTransactor.uCube.rpc.Constants;
import ip0.y;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ FreelancerSalesFiltersScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(FreelancerSalesFiltersScreen freelancerSalesFiltersScreen, Continuation continuation) {
        super(2, continuation);
        this.v = freelancerSalesFiltersScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((y) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        y yVar = (y) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVarH3 = this.v.T2();
        Object obj3 = yVar.f167226b.f58324n;
        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.sales.filters.provider.FreelancerSelectableFilterChip");
        t17.l selectableFilterChip = (t17.l) obj3;
        r rVar = (r) mVarH3;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(selectableFilterChip, "selectableFilterChip");
        final FreelancerSalesFilters$CompoundFreelancerSalesFilter freelancerSalesFilters$CompoundFreelancerSalesFilter = ((k) rVar.t2()).f285244a;
        final Object obj4 = selectableFilterChip.f267207c;
        if (obj4 instanceof cs6.f) {
            final int i = 0;
            rVar.y2(new Function1() { // from class: v17.p
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj5) {
                    switch (i) {
                        case 0:
                            FreelancerSalesFilters$CompoundFreelancerSalesFilter updateFilter = (FreelancerSalesFilters$CompoundFreelancerSalesFilter) obj5;
                            Intrinsics.checkNotNullParameter(updateFilter, "$this$updateFilter");
                            return FreelancerSalesFilters$CompoundFreelancerSalesFilter.a(updateFilter, ue0.e.Q(obj4, freelancerSalesFilters$CompoundFreelancerSalesFilter.f73470b), null, null, null, null, null, null, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION);
                        case 1:
                            FreelancerSalesFilters$CompoundFreelancerSalesFilter updateFilter2 = (FreelancerSalesFilters$CompoundFreelancerSalesFilter) obj5;
                            Intrinsics.checkNotNullParameter(updateFilter2, "$this$updateFilter");
                            return FreelancerSalesFilters$CompoundFreelancerSalesFilter.a(updateFilter2, null, ue0.e.Q(obj4, freelancerSalesFilters$CompoundFreelancerSalesFilter.f73471c), null, null, null, null, null, Constants.TAG_FB_CHARGING_STATUS);
                        default:
                            FreelancerSalesFilters$CompoundFreelancerSalesFilter updateFilter3 = (FreelancerSalesFilters$CompoundFreelancerSalesFilter) obj5;
                            Intrinsics.checkNotNullParameter(updateFilter3, "$this$updateFilter");
                            return FreelancerSalesFilters$CompoundFreelancerSalesFilter.a(updateFilter3, null, null, ue0.e.Q(obj4, freelancerSalesFilters$CompoundFreelancerSalesFilter.d), null, null, null, null, Constants.TAG_BLE_FIRMWARE_VERSION);
                    }
                }
            });
        } else if (obj4 instanceof cs6.e) {
            final int i2 = 1;
            rVar.y2(new Function1() { // from class: v17.p
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj5) {
                    switch (i2) {
                        case 0:
                            FreelancerSalesFilters$CompoundFreelancerSalesFilter updateFilter = (FreelancerSalesFilters$CompoundFreelancerSalesFilter) obj5;
                            Intrinsics.checkNotNullParameter(updateFilter, "$this$updateFilter");
                            return FreelancerSalesFilters$CompoundFreelancerSalesFilter.a(updateFilter, ue0.e.Q(obj4, freelancerSalesFilters$CompoundFreelancerSalesFilter.f73470b), null, null, null, null, null, null, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION);
                        case 1:
                            FreelancerSalesFilters$CompoundFreelancerSalesFilter updateFilter2 = (FreelancerSalesFilters$CompoundFreelancerSalesFilter) obj5;
                            Intrinsics.checkNotNullParameter(updateFilter2, "$this$updateFilter");
                            return FreelancerSalesFilters$CompoundFreelancerSalesFilter.a(updateFilter2, null, ue0.e.Q(obj4, freelancerSalesFilters$CompoundFreelancerSalesFilter.f73471c), null, null, null, null, null, Constants.TAG_FB_CHARGING_STATUS);
                        default:
                            FreelancerSalesFilters$CompoundFreelancerSalesFilter updateFilter3 = (FreelancerSalesFilters$CompoundFreelancerSalesFilter) obj5;
                            Intrinsics.checkNotNullParameter(updateFilter3, "$this$updateFilter");
                            return FreelancerSalesFilters$CompoundFreelancerSalesFilter.a(updateFilter3, null, null, ue0.e.Q(obj4, freelancerSalesFilters$CompoundFreelancerSalesFilter.d), null, null, null, null, Constants.TAG_BLE_FIRMWARE_VERSION);
                    }
                }
            });
        } else {
            final int i3 = 2;
            if (obj4 instanceof cs6.h) {
                rVar.y2(new Function1() { // from class: v17.p
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        switch (i3) {
                            case 0:
                                FreelancerSalesFilters$CompoundFreelancerSalesFilter updateFilter = (FreelancerSalesFilters$CompoundFreelancerSalesFilter) obj5;
                                Intrinsics.checkNotNullParameter(updateFilter, "$this$updateFilter");
                                return FreelancerSalesFilters$CompoundFreelancerSalesFilter.a(updateFilter, ue0.e.Q(obj4, freelancerSalesFilters$CompoundFreelancerSalesFilter.f73470b), null, null, null, null, null, null, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION);
                            case 1:
                                FreelancerSalesFilters$CompoundFreelancerSalesFilter updateFilter2 = (FreelancerSalesFilters$CompoundFreelancerSalesFilter) obj5;
                                Intrinsics.checkNotNullParameter(updateFilter2, "$this$updateFilter");
                                return FreelancerSalesFilters$CompoundFreelancerSalesFilter.a(updateFilter2, null, ue0.e.Q(obj4, freelancerSalesFilters$CompoundFreelancerSalesFilter.f73471c), null, null, null, null, null, Constants.TAG_FB_CHARGING_STATUS);
                            default:
                                FreelancerSalesFilters$CompoundFreelancerSalesFilter updateFilter3 = (FreelancerSalesFilters$CompoundFreelancerSalesFilter) obj5;
                                Intrinsics.checkNotNullParameter(updateFilter3, "$this$updateFilter");
                                return FreelancerSalesFilters$CompoundFreelancerSalesFilter.a(updateFilter3, null, null, ue0.e.Q(obj4, freelancerSalesFilters$CompoundFreelancerSalesFilter.d), null, null, null, null, Constants.TAG_BLE_FIRMWARE_VERSION);
                        }
                    }
                });
            } else if (obj4 instanceof FilteringDateRange) {
                FilteringDateRange filteringDateRange = (FilteringDateRange) obj4;
                if (!(filteringDateRange instanceof FilteringDateRange.Custom) && !filteringDateRange.equals(FilteringDateRange.Today.f73467a) && !filteringDateRange.equals(FilteringDateRange.ThisWeek.f73466a) && !filteringDateRange.equals(FilteringDateRange.ThisMonth.f73464a) && !filteringDateRange.equals(FilteringDateRange.ThisQuarter.f73465a)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (Intrinsics.f(((k) rVar.t2()).f285244a.e, filteringDateRange)) {
                    filteringDateRange = null;
                }
                rVar.y2(new cv6.o(filteringDateRange, 2));
            }
        }
        return Unit.f186387a;
    }
}
