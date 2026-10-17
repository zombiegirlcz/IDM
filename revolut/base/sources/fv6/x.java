package fv6;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.q0;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.navbar.ActionNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.freelancer.common.models.acquiring_payment.payment.AcquiringPayment$Id;
import com.revolut.feature.freelancer.common.models.acquiring_payment.payment.AcquiringPaymentFilter;
import ip0.z;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.a0;
import zhm.d0;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class x implements cli.n {

    @NotNull
    public static final v Companion = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hv6.b f138380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o7.b f138381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bv6.b f138382c;

    public x(hv6.b paymentMapper, l57.c pagingHelper, o7.b filterMapper, iu6.c noResultsFactory, bv6.b filterChipsProvider) {
        Intrinsics.checkNotNullParameter(paymentMapper, "paymentMapper");
        Intrinsics.checkNotNullParameter(pagingHelper, "pagingHelper");
        Intrinsics.checkNotNullParameter(filterMapper, "filterMapper");
        Intrinsics.checkNotNullParameter(noResultsFactory, "noResultsFactory");
        Intrinsics.checkNotNullParameter(filterChipsProvider, "filterChipsProvider");
        this.f138380a = paymentMapper;
        this.f138381b = filterMapper;
        this.f138382c = filterChipsProvider;
    }

    public final aim.e a(AcquiringPaymentFilter acquiringPaymentFilter, String str, List list, Function1 function1) {
        int i;
        Set includedStates;
        Set includedMethods;
        Set set;
        List listA;
        aim.e eVarB = zhm.u.b();
        if (acquiringPaymentFilter != null) {
            i = (!acquiringPaymentFilter.f73367a.isEmpty() ? 1 : 0) + (acquiringPaymentFilter.f73368b != null ? 1 : 0) + (!acquiringPaymentFilter.f73369c.isEmpty() ? 1 : 0) + (!acquiringPaymentFilter.d.isEmpty() ? 1 : 0);
        } else {
            i = 0;
        }
        ActionsView.Item itemA = u17.l.a(i);
        bv6.b bVar = this.f138382c;
        u17.d dVar = bVar.f18970c;
        if (acquiringPaymentFilter == null || (includedStates = acquiringPaymentFilter.f73369c) == null) {
            includedStates = h0.f322473a;
        }
        Intrinsics.checkNotNullParameter(includedStates, "includedStates");
        ActionsView.Item itemA2 = u17.g.a(includedStates.size(), "ACQUIRING_PAYMENT_STATE_FILTER_CHIP", new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new u1.g(dVar, includedStates, 3), new an.l(4, includedStates));
        u17.c cVar = bVar.d;
        if (acquiringPaymentFilter == null || (includedMethods = acquiringPaymentFilter.d) == null) {
            includedMethods = h0.f322473a;
        }
        Intrinsics.checkNotNullParameter(includedMethods, "includedMethods");
        ActionsView.Item itemA3 = u17.g.a(includedMethods.size(), "ACQUIRING_PAYMENT_METHOD_FILTER_CHIP", new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new u1.g(cVar, includedMethods, 2), new an.l(3, includedMethods));
        ActionsView.Item itemA4 = bVar.f18969b.a(acquiringPaymentFilter != null ? acquiringPaymentFilter.f73368b : null);
        u17.h hVar = bVar.f18968a;
        if (acquiringPaymentFilter == null || (set = acquiringPaymentFilter.f73367a) == null) {
            set = h0.f322473a;
        }
        ActionsView.Item[] elements = {itemA, itemA2, itemA3, itemA4, hVar.b(set)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        eVarB.add(new z("LIST_ID_PAYMENT_FILTER", kotlin.collections.d.L(elements), null, mx0.l.SCROLLABLE, 0, 0, 116));
        if (list.isEmpty()) {
            listA = iu6.c.a(str, acquiringPaymentFilter != null);
        } else {
            listA = (List) function1.invoke(list);
        }
        a0.x(listA, eVarB);
        return zhm.u.a(eVarB);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final aim.e b(List list) {
        aim.e eVarB = zhm.u.b();
        List listP0 = d0.P0(list, new w());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : listP0) {
            LocalDate localDate = ((pr6.e) obj2).f238940c.toLocalDate();
            Object objU = linkedHashMap.get(localDate);
            if (objU == null) {
                objU = h30.l.u(linkedHashMap, localDate);
            }
            ((List) objU).add(obj2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            LocalDate localDate2 = (LocalDate) entry.getKey();
            List list2 = (List) entry.getValue();
            String strS = h30.l.s("ITEM_ID_PAYMENTS_HEADER_", localDate2);
            Intrinsics.h(localDate2);
            eVarB.add(new ListSubheaderDelegate.Model(strS, (Image) null, (Clause) new TimeClause(ebm.a.P(localDate2), new TimeClause.Format.Pretty(q0.ONLY_DATE), null, null, 12), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
            List<pr6.e> list3 = list2;
            ArrayList arrayList = new ArrayList(zhm.w.t(list3, 10));
            for (pr6.e payment : list3) {
                Intrinsics.checkNotNullParameter(payment, "payment");
                String str = payment.f238938a;
                CompositeClause compositeClauseC = this.f138380a.c(payment);
                Intrinsics.checkNotNullParameter(payment, "payment");
                lr6.a aVar = payment.f238939b;
                or6.e eVar = null;
                CompositeClause compositeClause = new CompositeClause(zhm.v.k(wu6.b.b(aVar), new TimeClause(oi0.d.R(payment.f238940c), new TimeClause.Format.Pretty(q0.ONLY_TIME), null, null, 12)), new DotDividerClause((Integer) null), null, null, 12);
                pr6.j jVar = payment.k;
                or6.g gVar = payment.f238944l;
                if (gVar != null) {
                    eVar = gVar.e;
                }
                boolean z = false;
                arrayList.add(new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image40(hv6.b.b(jVar, eVar), hv6.b.a(aVar, payment.f238943j), null, z, null, false, 60), compositeClauseC, null, 0, compositeClause, null, null, 0, new RowDelegate.Model.c.b(new MoneyClause(payment.f, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, 0 == true ? 1 : 0, z, 126), false, null, false, null, null, null, null, null, null, new AcquiringPayment$Id(payment.f238938a), null, 0, 0, 0, 0, 532675544));
            }
            yp0.b.k(arrayList, 0, 0, 0, 0, 31);
            a0.x(arrayList, eVarB);
        }
        return zhm.u.a(eVarB);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        List list;
        String str;
        final g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        final AcquiringPaymentFilter acquiringPaymentFilterW = this.f138381b.w(domainState.f138360b);
        boolean z = domainState.d;
        Data data = domainState.f138359a;
        List list2 = (List) data.getContent();
        l lVar = new l(z, (list2 == null || !(list2.isEmpty() ^ true)) ? f0.f322471a : zhm.u.c(new ActionNavBarMenuItem("MENU_ITEM_ID_SEARCH", new ResourceImage(R$drawable.uikit_icn_24_search, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254))));
        if (!z || (str = domainState.f138360b.f73370a) == null || kotlin.text.d0.W(str)) {
            final int i = 1;
            list = (List) iii.c.f(data, new n(2), new fv0.c(3), new Function3(this) { // from class: fv6.u

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ x f138378b;

                {
                    this.f138378b = this;
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    List payments = (List) obj2;
                    Boolean bool = (Boolean) obj3;
                    switch (i) {
                        case 0:
                            bool.getClass();
                            Intrinsics.checkNotNullParameter(payments, "payments");
                            String str2 = domainState.f138360b.f73370a;
                            x xVar = this.f138378b;
                            return xVar.a(acquiringPaymentFilterW, str2, payments, new fs2.k(xVar, 17));
                        default:
                            Intrinsics.checkNotNullParameter(payments, "payments");
                            String str3 = domainState.f138360b.f73370a;
                            x xVar2 = this.f138378b;
                            return xVar2.a(acquiringPaymentFilterW, str3, payments, new a09.z(xVar2, bool.booleanValue(), (Throwable) obj4, 28));
                    }
                }
            });
        } else {
            final int i2 = 0;
            list = (List) iii.c.f(domainState.f138361c, new n(1), new fv0.c(2), new Function3(this) { // from class: fv6.u

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ x f138378b;

                {
                    this.f138378b = this;
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    List payments = (List) obj2;
                    Boolean bool = (Boolean) obj3;
                    switch (i2) {
                        case 0:
                            bool.getClass();
                            Intrinsics.checkNotNullParameter(payments, "payments");
                            String str2 = domainState.f138360b.f73370a;
                            x xVar = this.f138378b;
                            return xVar.a(acquiringPaymentFilterW, str2, payments, new fs2.k(xVar, 17));
                        default:
                            Intrinsics.checkNotNullParameter(payments, "payments");
                            String str3 = domainState.f138360b.f73370a;
                            x xVar2 = this.f138378b;
                            return xVar2.a(acquiringPaymentFilterW, str3, payments, new a09.z(xVar2, bool.booleanValue(), (Throwable) obj4, 28));
                    }
                }
            });
        }
        return new m(list, lVar);
    }
}
