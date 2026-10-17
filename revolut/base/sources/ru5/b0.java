package ru5;

import aw0.e4;
import aw0.ka;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.navbar.PlusActionNavBarMenuItem;
import com.revolut.core.ui_kit.views.q;
import com.revolut.core.ui_kit.views.t;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.crypto_investments.api.R$string;
import com.revolut.feature.crypto_investments.api.model.transaction_filter.CryptoTransactionFilter;
import com.revolut.feature.crypto_investments.impl.ui.screens.activity.ActivityScreenContract$InputData;
import cul.n2;
import cul.r1;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import koi.j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l80.f;
import org.joda.time.LocalDate;
import tof.a3;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 implements jki.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActivityScreenContract$InputData f257409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pt5.f f257410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uu5.a f257411c;
    public final cv5.a d;

    public b0(ActivityScreenContract$InputData inputData, pt5.f activityWidgetMapper, uu5.a monthTabHandler, cv5.a activityTransactionsMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(activityWidgetMapper, "activityWidgetMapper");
        Intrinsics.checkNotNullParameter(monthTabHandler, "monthTabHandler");
        Intrinsics.checkNotNullParameter(activityTransactionsMapper, "activityTransactionsMapper");
        this.f257409a = inputData;
        this.f257410b = activityWidgetMapper;
        this.f257411c = monthTabHandler;
        this.d = activityTransactionsMapper;
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        List listB;
        List list;
        Integer numValueOf;
        j domainState = (j) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        ActivityScreenContract$InputData activityScreenContract$InputData = this.f257409a;
        if (activityScreenContract$InputData.f71428c || activityScreenContract$InputData.e == lt5.a.DEFI) {
            listB = b(domainState);
        } else {
            pt5.b selectedTab = domainState.f257416a;
            dv5.f fVar = (dv5.f) this.f257410b;
            fVar.getClass();
            Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
            listB = i2b.a.q(new FixedTabsDelegate.Model("LIST_ID_TABS", (List) fVar.f118038c.getValue(), selectedTab.getId(), null, null, R$attr.uikit_dp8, R$attr.uikit_dp24, 0, 0, 408), b(domainState));
        }
        List items = listB;
        pt5.b bVar = domainState.f257416a;
        pt5.b bVar2 = pt5.b.TRANSACTIONS;
        uu5.a aVar = this.f257411c;
        if (bVar != bVar2 || domainState.i) {
            list = f0.f322471a;
        } else {
            final uu5.d dVar = (uu5.d) aVar;
            dVar.getClass();
            Intrinsics.checkNotNullParameter(items, "items");
            List listI0 = dVar.f283139c;
            if (listI0.isEmpty()) {
                final int i = 1;
                nkm.c cVarL = nkm.y.l(nkm.y.x(nkm.y.z(nkm.y.n(d0.Q(items), uu5.c.f283136a), new urd.y(23)), new urd.y(24)), new Function1() { // from class: uu5.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        LocalDate localDate;
                        Pair pair = (Pair) obj2;
                        switch (i) {
                            case 0:
                                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                                j jVar = (j) pair.f186386b;
                                ListSubheaderDelegate.Model model = jVar instanceof ListSubheaderDelegate.Model ? (ListSubheaderDelegate.Model) jVar : null;
                                Object obj3 = model != null ? model.f52715m : null;
                                a3 a3Var = obj3 instanceof a3 ? (a3) obj3 : null;
                                if (a3Var == null || (localDate = a3Var.f272593h.toLocalDate()) == null) {
                                    return null;
                                }
                                dVar.getClass();
                                return Long.valueOf((((long) localDate.getYear()) * 100) + ((long) localDate.getMonthOfYear()));
                            case 1:
                                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                                LocalDate localDate2 = (LocalDate) pair.f186386b;
                                Intrinsics.h(localDate2);
                                dVar.getClass();
                                return Long.valueOf((((long) localDate2.getYear()) * 100) + ((long) localDate2.getMonthOfYear()));
                            default:
                                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                                String str = (String) pair.f186385a;
                                LocalDate localDate3 = (LocalDate) pair.f186386b;
                                Intrinsics.h(localDate3);
                                d dVar2 = dVar;
                                dVar2.getClass();
                                long millis = localDate3.toDateTimeAtStartOfDay().getMillis();
                                return new q(str, new t(localDate3.getYear() == ((f) dVar2.f283137a).j() ? new TimeClause(millis, new TimeClause.Format.Month(0), null, null, 12) : new TimeClause(millis, new TimeClause.Format.MonthAndYear((ka) null, 3), null, null, 12)), 58);
                        }
                    }
                });
                final int i2 = 2;
                listI0 = d0.I0(nkm.y.J(nkm.y.x(cVarL, new Function1() { // from class: uu5.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        LocalDate localDate;
                        Pair pair = (Pair) obj2;
                        switch (i2) {
                            case 0:
                                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                                j jVar = (j) pair.f186386b;
                                ListSubheaderDelegate.Model model = jVar instanceof ListSubheaderDelegate.Model ? (ListSubheaderDelegate.Model) jVar : null;
                                Object obj3 = model != null ? model.f52715m : null;
                                a3 a3Var = obj3 instanceof a3 ? (a3) obj3 : null;
                                if (a3Var == null || (localDate = a3Var.f272593h.toLocalDate()) == null) {
                                    return null;
                                }
                                dVar.getClass();
                                return Long.valueOf((((long) localDate.getYear()) * 100) + ((long) localDate.getMonthOfYear()));
                            case 1:
                                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                                LocalDate localDate2 = (LocalDate) pair.f186386b;
                                Intrinsics.h(localDate2);
                                dVar.getClass();
                                return Long.valueOf((((long) localDate2.getYear()) * 100) + ((long) localDate2.getMonthOfYear()));
                            default:
                                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                                String str = (String) pair.f186385a;
                                LocalDate localDate3 = (LocalDate) pair.f186386b;
                                Intrinsics.h(localDate3);
                                d dVar2 = dVar;
                                dVar2.getClass();
                                long millis = localDate3.toDateTimeAtStartOfDay().getMillis();
                                return new q(str, new t(localDate3.getYear() == ((f) dVar2.f283137a).j() ? new TimeClause(millis, new TimeClause.Format.Month(0), null, null, 12) : new TimeClause(millis, new TimeClause.Format.MonthAndYear((ka) null, 3), null, null, 12)), 58);
                        }
                    }
                })));
                dVar.f283139c = listI0;
            }
            list = listI0;
        }
        final uu5.d dVar2 = (uu5.d) aVar;
        if (list.size() != dVar2.f283138b.size()) {
            Intrinsics.checkNotNullParameter(items, "items");
            final int i3 = 0;
            dVar2.f283138b = nkm.y.J(nkm.y.x(nkm.y.l(nkm.y.n(nkm.y.y(d0.Q(items), new utk.b(1)), new urd.y(21)), new Function1() { // from class: uu5.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    LocalDate localDate;
                    Pair pair = (Pair) obj2;
                    switch (i3) {
                        case 0:
                            Intrinsics.checkNotNullParameter(pair, "<destruct>");
                            j jVar = (j) pair.f186386b;
                            ListSubheaderDelegate.Model model = jVar instanceof ListSubheaderDelegate.Model ? (ListSubheaderDelegate.Model) jVar : null;
                            Object obj3 = model != null ? model.f52715m : null;
                            a3 a3Var = obj3 instanceof a3 ? (a3) obj3 : null;
                            if (a3Var == null || (localDate = a3Var.f272593h.toLocalDate()) == null) {
                                return null;
                            }
                            dVar2.getClass();
                            return Long.valueOf((((long) localDate.getYear()) * 100) + ((long) localDate.getMonthOfYear()));
                        case 1:
                            Intrinsics.checkNotNullParameter(pair, "<destruct>");
                            LocalDate localDate2 = (LocalDate) pair.f186386b;
                            Intrinsics.h(localDate2);
                            dVar2.getClass();
                            return Long.valueOf((((long) localDate2.getYear()) * 100) + ((long) localDate2.getMonthOfYear()));
                        default:
                            Intrinsics.checkNotNullParameter(pair, "<destruct>");
                            String str = (String) pair.f186385a;
                            LocalDate localDate3 = (LocalDate) pair.f186386b;
                            Intrinsics.h(localDate3);
                            d dVar22 = dVar2;
                            dVar22.getClass();
                            long millis = localDate3.toDateTimeAtStartOfDay().getMillis();
                            return new q(str, new t(localDate3.getYear() == ((f) dVar22.f283137a).j() ? new TimeClause(millis, new TimeClause.Format.Month(0), null, null, 12) : new TimeClause(millis, new TimeClause.Format.MonthAndYear((ka) null, 3), null, null, 12)), 58);
                    }
                }
            }), new urd.y(22)));
        }
        String str = domainState.k;
        if (str == null) {
            Pair pair = (Pair) d0.d0(dVar2.f283138b);
            str = pair != null ? (String) pair.f186386b : null;
        }
        String str2 = str;
        String str3 = domainState.f257421j;
        if (str3 != null) {
            Iterator it8 = items.iterator();
            int i5 = 0;
            while (true) {
                if (!it8.hasNext()) {
                    i5 = -1;
                    break;
                }
                if (Intrinsics.f(((koi.j) it8.next()).getF55265b(), str3)) {
                    break;
                }
                i5++;
            }
            numValueOf = Integer.valueOf(i5);
        } else {
            numValueOf = null;
        }
        e4 e4VarC = c(domainState.f257420h, bVar);
        List listC = bVar == pt5.b.ORDERS ? zhm.u.c(PlusActionNavBarMenuItem.Companion.c(PlusActionNavBarMenuItem.INSTANCE, "NEW_ORDER_ITEM_ID", new TextLocalisedClause(R$string.crypto_investments_activity_screen_toolbar_action, null, null, 14), null, 60)) : f0.f322471a;
        Clause textLocalisedClause = activityScreenContract$InputData.d;
        if (textLocalisedClause == null) {
            textLocalisedClause = new TextLocalisedClause(activityScreenContract$InputData.e == lt5.a.DEFI ? R$string.crypto_investments_transactions_title : R$string.crypto_investments_activity_widget_title, null, null, 14);
        }
        return new l(items, e4VarC, listC, list, str2, numValueOf, textLocalisedClause);
    }

    public final List b(j jVar) {
        int i = a0.f257408a[jVar.f257416a.ordinal()];
        if (i == 1) {
            return (List) iii.c.f(jVar.f257418c, new rsl.c(28), new m(1), new rbe.c(this, jVar, 12));
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        Data transactionsWithFiltersAndQueryApplied = jVar.f;
        Data suspiciousDeposits = jVar.e;
        boolean z = jVar.i;
        String searchQuery = jVar.f257419g;
        boolean z3 = c(jVar.f257420h, jVar.f257416a) == e4.ACTIVE;
        Intrinsics.checkNotNullParameter(transactionsWithFiltersAndQueryApplied, "transactionsWithFiltersAndQueryApplied");
        Intrinsics.checkNotNullParameter(suspiciousDeposits, "suspiciousDeposits");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        cv5.a aVar = this.d;
        return i2b.a.o((z || ue0.e.n((List) suspiciousDeposits.getContent())) ? f0.f322471a : (List) iii.c.f(suspiciousDeposits, new n2(5), new r1(5), new cab.m(aVar, transactionsWithFiltersAndQueryApplied, 10)), (List) iii.c.f(transactionsWithFiltersAndQueryApplied, new n2(4), new r1(4), new a4b.i(aVar, searchQuery, z3, 5)));
    }

    public final e4 c(List list, pt5.b bVar) {
        if (this.f257409a.e == lt5.a.DEFI || ue0.e.n(list) || bVar != pt5.b.TRANSACTIONS) {
            return e4.GONE;
        }
        List list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                if (((CryptoTransactionFilter) it8.next()).getF71395b()) {
                    return e4.ACTIVE;
                }
            }
        }
        return e4.INACTIVE;
    }
}
