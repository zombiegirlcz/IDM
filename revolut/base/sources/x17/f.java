package x17;

import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceCustomerDetails;
import com.revolut.feature.freelancer.common.models.sale.FilteringDateRange;
import com.revolut.feature.freelancer.common.models.sale.FreelancerSalesFilters$CompoundFreelancerSalesFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import x1.n;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f302319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f302320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f302321c;
    public final e d;
    public final c e;
    public final h f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f302322g;

    public f(k salesStatusFilterDelegate, g salesPaymentMethodFilterDelegate, l salesTypeFilterDelegate, e salesDateRangeFilterDelegate, c salesAmountFilterDelegate, h salesSearchFilterDelegate, d salesCurrenciesFilterDelegate) {
        Intrinsics.checkNotNullParameter(salesStatusFilterDelegate, "salesStatusFilterDelegate");
        Intrinsics.checkNotNullParameter(salesPaymentMethodFilterDelegate, "salesPaymentMethodFilterDelegate");
        Intrinsics.checkNotNullParameter(salesTypeFilterDelegate, "salesTypeFilterDelegate");
        Intrinsics.checkNotNullParameter(salesDateRangeFilterDelegate, "salesDateRangeFilterDelegate");
        Intrinsics.checkNotNullParameter(salesAmountFilterDelegate, "salesAmountFilterDelegate");
        Intrinsics.checkNotNullParameter(salesSearchFilterDelegate, "salesSearchFilterDelegate");
        Intrinsics.checkNotNullParameter(salesCurrenciesFilterDelegate, "salesCurrenciesFilterDelegate");
        this.f302319a = salesStatusFilterDelegate;
        this.f302320b = salesPaymentMethodFilterDelegate;
        this.f302321c = salesTypeFilterDelegate;
        this.d = salesDateRangeFilterDelegate;
        this.e = salesAmountFilterDelegate;
        this.f = salesSearchFilterDelegate;
        this.f302322g = salesCurrenciesFilterDelegate;
    }

    public final List a(ArrayList invoices, FreelancerSalesFilters$CompoundFreelancerSalesFilter compoundFilter, String str) {
        String str2;
        Intrinsics.checkNotNullParameter(invoices, "invoices");
        Intrinsics.checkNotNullParameter(compoundFilter, "compoundFilter");
        List selectedStatuses = compoundFilter.f73470b;
        k kVar = this.f302319a;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(invoices, "invoices");
        Intrinsics.checkNotNullParameter(selectedStatuses, "selectedStatuses");
        List invoices2 = k.a(invoices, selectedStatuses, new i(kVar, 1));
        List selectedPaymentMethods = compoundFilter.f73471c;
        this.f302320b.getClass();
        Intrinsics.checkNotNullParameter(invoices2, "invoices");
        Intrinsics.checkNotNullParameter(selectedPaymentMethods, "selectedPaymentMethods");
        if (!selectedPaymentMethods.isEmpty() && !selectedPaymentMethods.contains(cs6.e.INVOICE)) {
            invoices2 = null;
        }
        if (invoices2 == null) {
            invoices2 = f0.f322471a;
        }
        List selectedTypes = compoundFilter.d;
        this.f302321c.getClass();
        Intrinsics.checkNotNullParameter(invoices2, "invoices");
        Intrinsics.checkNotNullParameter(selectedTypes, "selectedTypes");
        if (!selectedTypes.isEmpty()) {
            invoices2 = f0.f322471a;
        }
        FilteringDateRange filteringDateRange = compoundFilter.e;
        e eVar = this.d;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(invoices2, "invoices");
        List invoices3 = eVar.a(invoices2, filteringDateRange, new n(11));
        String str3 = compoundFilter.f;
        String str4 = compoundFilter.f73472g;
        c cVar = this.e;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(invoices3, "invoices");
        List invoices4 = cVar.a(invoices3, str3, str4, new n(8));
        this.f.getClass();
        Intrinsics.checkNotNullParameter(invoices4, "invoices");
        if (str != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : invoices4) {
                FreelancerInvoice freelancerInvoice = (FreelancerInvoice) obj2;
                FreelancerInvoiceCustomerDetails freelancerInvoiceCustomerDetails = freelancerInvoice.f73383p;
                if (pd.b.j((freelancerInvoiceCustomerDetails == null || (str2 = freelancerInvoiceCustomerDetails.f73391a) == null) ? null : Boolean.valueOf(d0.J(str2, str, true))) || d0.J(freelancerInvoice.f73375b, str, true)) {
                    arrayList.add(obj2);
                }
            }
            invoices4 = arrayList;
        }
        Set selectedCurrencies = compoundFilter.f73473h;
        this.f302322g.getClass();
        Intrinsics.checkNotNullParameter(invoices4, "invoices");
        Intrinsics.checkNotNullParameter(selectedCurrencies, "selectedCurrencies");
        if (invoices4.isEmpty() || selectedCurrencies.isEmpty()) {
            return invoices4;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : invoices4) {
            FreelancerInvoice it8 = (FreelancerInvoice) obj3;
            Intrinsics.checkNotNullParameter(it8, "it");
            if (selectedCurrencies.contains(it8.f73379j.f115083b)) {
                arrayList2.add(obj3);
            }
        }
        return arrayList2;
    }
}
