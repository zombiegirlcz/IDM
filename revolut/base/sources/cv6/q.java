package cv6;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.feature.freelancer.common.models.acquiring_payment.payment.AcquiringPaymentFilter;
import com.revolut.feature.freelancer.common.models.sale.FilteringDateRange;
import com.revolut.feature.freelancer.impl.R$string;
import cul.n2;
import cul.r1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.a0;
import zhm.h0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements cli.n {

    @NotNull
    public static final p Companion = new p();
    public static final Set e;
    public static final Set f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qy5.a f109297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t17.d f109298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t17.g f109299c;
    public final t17.h d;

    static {
        FilteringDateRange[] elements = {FilteringDateRange.Today.f73467a, FilteringDateRange.ThisWeek.f73466a, FilteringDateRange.ThisMonth.f73464a, FilteringDateRange.ThisQuarter.f73465a};
        Intrinsics.checkNotNullParameter(elements, "elements");
        e = kotlin.collections.d.y0(elements);
        lr6.a[] elements2 = {lr6.a.PENDING, lr6.a.AUTHORISED, lr6.a.CAPTURED, lr6.a.COMPLETED, lr6.a.FAILED, lr6.a.DECLINED, lr6.a.CANCELLED};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        f = kotlin.collections.d.y0(elements2);
    }

    public q(qy5.a acquiringPaymentFilterChipsMapper, t17.a acquiringFilterChipsMapper, t17.d chipsFilterProvider, t17.g currencyFilterProvider, t17.h dateRangeFilterProvider) {
        Intrinsics.checkNotNullParameter(acquiringPaymentFilterChipsMapper, "acquiringPaymentFilterChipsMapper");
        Intrinsics.checkNotNullParameter(acquiringFilterChipsMapper, "acquiringFilterChipsMapper");
        Intrinsics.checkNotNullParameter(chipsFilterProvider, "chipsFilterProvider");
        Intrinsics.checkNotNullParameter(currencyFilterProvider, "currencyFilterProvider");
        Intrinsics.checkNotNullParameter(dateRangeFilterProvider, "dateRangeFilterProvider");
        this.f109297a = acquiringPaymentFilterChipsMapper;
        this.f109298b = chipsFilterProvider;
        this.f109299c = currencyFilterProvider;
        this.d = dateRangeFilterProvider;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        Set set;
        qy5.a aVar;
        Set set2;
        j domainState = (j) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = u.b();
        AcquiringPaymentFilter acquiringPaymentFilter = domainState.f109287b;
        if (acquiringPaymentFilter == null || (set = acquiringPaymentFilter.f73369c) == null) {
            set = h0.f322473a;
        }
        aim.e eVarB2 = u.b();
        Set set3 = f;
        int size = set3.size();
        int size2 = set.size();
        int i = R$string.freelancer_sales_filters_statuses_header_title_selected;
        int i2 = R$string.freelancer_sales_filters_statuses_header_title;
        Intrinsics.checkNotNullParameter("ITEM_ID_STATUS_HEADER", "headerId");
        eVarB2.add(t17.p.a(size, size2, i, i2, "ITEM_ID_STATUS_HEADER"));
        ArrayList arrayList = new ArrayList();
        Iterator it8 = set3.iterator();
        while (true) {
            boolean zHasNext = it8.hasNext();
            aVar = this.f109297a;
            if (!zHasNext) {
                break;
            }
            t17.l lVarP = aVar.p((lr6.a) it8.next());
            if (lVarP != null) {
                arrayList.add(lVarP);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it9 = set.iterator();
        while (it9.hasNext()) {
            t17.l lVarP2 = aVar.p((lr6.a) it9.next());
            if (lVarP2 != null) {
                arrayList2.add(lVarP2);
            }
        }
        t17.d dVar = this.f109298b;
        eVarB2.add(dVar.a(arrayList, arrayList2, "ITEM_ID_STATUS_GROUP"));
        a0.x(u.a(eVarB2), eVarB);
        if (acquiringPaymentFilter == null || (set2 = acquiringPaymentFilter.d) == null) {
            set2 = h0.f322473a;
        }
        aim.e eVarB3 = u.b();
        int size3 = pr6.k.a().size();
        int size4 = set2.size();
        int i3 = R$string.freelancer_sales_filters_payment_methods_header_title_selected;
        int i5 = R$string.freelancer_sales_filters_payment_methods_header_title;
        Intrinsics.checkNotNullParameter("ITEM_ID_PAYMENT_METHOD_HEADER", "headerId");
        eVarB3.add(t17.p.a(size3, size4, i3, i5, "ITEM_ID_PAYMENT_METHOD_HEADER"));
        EnumEntries enumEntriesA = pr6.k.a();
        ArrayList arrayList3 = new ArrayList(w.t(enumEntriesA, 10));
        Iterator<E> it10 = enumEntriesA.iterator();
        while (it10.hasNext()) {
            arrayList3.add(aVar.q((pr6.k) it10.next()));
        }
        Set set4 = set2;
        ArrayList arrayList4 = new ArrayList(w.t(set4, 10));
        Iterator it11 = set4.iterator();
        while (it11.hasNext()) {
            arrayList4.add(aVar.q((pr6.k) it11.next()));
        }
        eVarB3.add(dVar.a(arrayList3, arrayList4, "ITEM_ID_PAYMENT_METHOD_GROUP"));
        a0.x(u.a(eVarB3), eVarB);
        FilteringDateRange filteringDateRange = acquiringPaymentFilter != null ? acquiringPaymentFilter.f73368b : null;
        aim.e eVarB4 = u.b();
        eVarB4.add(t17.h.a("ITEM_ID_DATE_RANGE_HEADER", filteringDateRange));
        aim.e eVarB5 = u.b();
        eVarB5.add(t17.a.a(filteringDateRange));
        Set set5 = e;
        ArrayList arrayList5 = new ArrayList(w.t(set5, 10));
        Iterator it12 = set5.iterator();
        while (it12.hasNext()) {
            arrayList5.add(t17.a.b((FilteringDateRange) it12.next()));
        }
        a0.x(arrayList5, eVarB5);
        eVarB4.add(this.d.b("ITEM_ID_DATE_RANGE_GROUP", u.a(eVarB5), filteringDateRange != null ? t17.a.b(filteringDateRange) : null));
        a0.x(u.a(eVarB4), eVarB);
        a0.x((Iterable) iii.c.f(domainState.f109286a, new n2(16), new r1(6), new cab.m(this, domainState, 11)), eVarB);
        aim.e eVarA = u.a(eVarB);
        aim.e eVarB6 = u.b();
        if (acquiringPaymentFilter != null && !acquiringPaymentFilter.b()) {
            eVarB6.add(new TextNavBarMenuItem("ITEM_ID_MENU_RESET", new TextLocalisedClause(R$string.freelancer_common_action_reset, null, null, 14), null, null, 12));
        }
        return new m(eVarA, u.a(eVarB6));
    }
}
