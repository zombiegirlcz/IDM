package v17;

import com.revolut.data.model.Data;
import com.revolut.feature.freelancer.common.models.sale.FilteringDateRange;
import com.revolut.feature.freelancer.common.models.sale.FreelancerSalesFilters$CompoundFreelancerSalesFilter;
import com.revolut.feature.freelancer.impl.ui.sales.filters.screen.sales_filters.FreelancerSalesFiltersScreenContract$InputData;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import r10.v;
import uyh.k0;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends jki.g implements m {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final gr6.i f285258p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final v f285259q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final FreelancerSalesFiltersScreenContract$InputData f285260r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final jf1.a f285261s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final List f285262t;
    public final Object u;
    public final List v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final k f285263w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final vii.b f285264x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(gr6.i freelancerCurrencyInteractor, v freelancerSaleChannelAvailabilityInteractor, FreelancerSalesFiltersScreenContract$InputData inputData, jf1.a proMerchantTogglesInteractor, jki.p stateMapper) {
        List listK;
        List listA;
        super(stateMapper);
        Intrinsics.checkNotNullParameter(freelancerCurrencyInteractor, "freelancerCurrencyInteractor");
        Intrinsics.checkNotNullParameter(freelancerSaleChannelAvailabilityInteractor, "freelancerSaleChannelAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(proMerchantTogglesInteractor, "proMerchantTogglesInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f285258p = freelancerCurrencyInteractor;
        this.f285259q = freelancerSaleChannelAvailabilityInteractor;
        this.f285260r = inputData;
        this.f285261s = proMerchantTogglesInteractor;
        FreelancerSalesFilters$CompoundFreelancerSalesFilter freelancerSalesFilters$CompoundFreelancerSalesFilter = inputData.f74140a;
        cs6.g gVar = freelancerSalesFilters$CompoundFreelancerSalesFilter.f73469a;
        int[] iArr = q.f285256a;
        switch (iArr[gVar.ordinal()]) {
            case 1:
                listK = zhm.v.k(cs6.f.DRAFT, cs6.f.PENDING, cs6.f.COMPLETED, cs6.f.OVERDUE, cs6.f.EXPIRED, cs6.f.CANCELLED);
                break;
            case 2:
                listK = zhm.v.k(cs6.f.ACTIVE, cs6.f.SUSPENDED, cs6.f.COMPLETED);
                break;
            case 3:
                listK = zhm.v.k(cs6.f.DRAFT, cs6.f.PENDING, cs6.f.COMPLETED, cs6.f.OVERDUE, cs6.f.CANCELLED);
                break;
            case 4:
                listK = zhm.v.k(cs6.f.DRAFT, cs6.f.PENDING, cs6.f.COMPLETED, cs6.f.CANCELLED);
                break;
            case 5:
                listK = zhm.v.k(cs6.f.PENDING, cs6.f.COMPLETED, cs6.f.EXPIRED, cs6.f.CANCELLED);
                break;
            case 6:
                listK = zhm.v.k(cs6.f.PENDING, cs6.f.COMPLETED, cs6.f.EXPIRED, cs6.f.CANCELLED);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        List list = listK;
        this.f285262t = list;
        switch (iArr[freelancerSalesFilters$CompoundFreelancerSalesFilter.f73469a.ordinal()]) {
            case 1:
            case 5:
            case 6:
                listA = cs6.h.a();
                break;
            case 2:
            case 3:
            case 4:
                listA = f0.f322471a;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        List list2 = listA;
        this.u = list2;
        List listK2 = zhm.v.k(FilteringDateRange.Today.f73467a, FilteringDateRange.ThisWeek.f73466a, FilteringDateRange.ThisMonth.f73464a, FilteringDateRange.ThisQuarter.f73465a);
        this.v = listK2;
        this.f285263w = new k(inputData.f74140a, new Data(null, null, true, 3, null), list, list2, listK2, false);
        this.f285264x = new vii.b();
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, vkm.q.Q(this.f285264x, new uec.d(continuation, this, 15)), null, null, new up2.q(this, continuation, 22), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f285263w;
    }

    public final void y2(Function1 function1) {
        x2(new k0(function1, this, 9));
    }
}
