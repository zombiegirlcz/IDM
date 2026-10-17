package com.revolut.feature.rev_points.impl.ui.transactions.list;

import android.os.Parcelable;
import aw0.ka;
import aw0.p9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.ResourceId;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.q0;
import com.revolut.core.ui_kit.views.t;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.rev_points.api.R$string;
import com.revolut.feature.rev_points.impl.ui.transactions.list.RevPointsTransactionsListScreenContract$InputData;
import com.revolut.feature.rev_points.impl.ui.transactions.list.b;
import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.feature.rev_points.models.RevPointsTransaction;
import fub.k;
import ip0.nb0;
import ip0.pb0;
import ip0.zj;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.YearMonth;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.z;
import m1c.d1;
import m1c.e1;
import m1c.r1;
import m1c.s1;
import ms0.h4;
import org.jetbrains.annotations.NotNull;
import pyb.g;
import q0c.i;
import q0c.l;
import q0c.q;
import q0c.w;
import vim.f;
import yp0.e0;
import zhm.d0;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements n {

    @NotNull
    public static final w Companion = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f83896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RevPointsTransactionsListScreenContract$InputData f83897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l80.e f83898c;

    public e(k revPointsTransactionMapper, RevPointsTransactionsListScreenContract$InputData inputData, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(revPointsTransactionMapper, "revPointsTransactionMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f83896a = revPointsTransactionMapper;
        this.f83897b = inputData;
        this.f83898c = dateProvider;
    }

    public static ListSubheaderDelegate.Model a(RevPoints revPoints, long j2) {
        return new ListSubheaderDelegate.Model(p.a.m(j2, "DAILY_GROUP_HEADER_LIST_ID"), (Image) null, (Clause) new TimeClause(j2, new TimeClause.Format.Pretty(q0.ONLY_DATE), null, null, 12), (Image) null, (Clause) nub.a.q(revPoints, null, new nub.e(p9.ALWAYS), null, 5), (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, R$attr.uikit_dp32, R$attr.uikit_dp16, 0, 0, 53226);
    }

    public static ArrayList b() {
        IntRange intRange = new IntRange(0, 3, 1);
        ArrayList arrayList = new ArrayList(zhm.w.t(intRange, 10));
        f it8 = intRange.iterator();
        while (it8.f289625c) {
            arrayList.add(nb0.b(pb0.Companion, a0.d.n("ROW_LOADING_LIST_PREFIX", it8.nextInt()), false, 0, false, 30));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }

    @Override // cli.n
    public final o c(j jVar) {
        List list;
        Integer numValueOf;
        Long lN;
        boolean zF;
        Integer num;
        b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        if (!(domainState instanceof l)) {
            if (domainState instanceof b.a) {
                return new q(b(), null, false, f0.f322471a, null, null, false);
            }
            throw new NoWhenBranchMatchedException();
        }
        final l lVar = (l) domainState;
        final ArrayList arrayListB = b();
        q0c.k kVar = lVar.f241233a;
        YearMonth yearMonth = lVar.f241236g;
        if (kVar instanceof i) {
            final int i = 0;
            list = (List) iii.c.g(((i) kVar).f241231a, new jeg.i(22, arrayListB), new g(this, 18), new Function3(this) { // from class: q0c.v

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.rev_points.impl.ui.transactions.list.e f241253b;

                {
                    this.f241253b = this;
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    RevPointsTransaction revPointsTransaction;
                    int i2 = i;
                    List content = (List) obj2;
                    boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                    switch (i2) {
                        case 0:
                            Intrinsics.checkNotNullParameter(content, "content");
                            l lVar2 = lVar;
                            k71.q qVar = lVar2.f241234b;
                            String str = lVar2.f241235c;
                            com.revolut.feature.rev_points.impl.ui.transactions.list.e eVar = this.f241253b;
                            fub.k kVar2 = eVar.f83896a;
                            if (str.length() != 0) {
                                ArrayList arrayListH = ((pyb.s) kVar2).h(content, qVar);
                                int iB = zhm.q0.b(zhm.w.t(arrayListH, 10));
                                if (iB < 16) {
                                    iB = 16;
                                }
                                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                                for (Object obj5 : arrayListH) {
                                    linkedHashMap.put(((RowDelegate.Model) obj5).f53228a, obj5);
                                }
                                ArrayList arrayList = new ArrayList();
                                for (Object obj6 : content) {
                                    r1 r1Var = (r1) obj6;
                                    RowDelegate.Model model = (RowDelegate.Model) linkedHashMap.get("TransactionListItem_" + r1Var.f201449a.f84054a);
                                    if (model != null && i1c.b.a(model, str, r1Var.f201449a.f84064q)) {
                                        arrayList.add(obj6);
                                    }
                                }
                                content = arrayList;
                            }
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            for (Object obj7 : content) {
                                LocalDateTime localDateTimeY = oi0.d.Y(((r1) obj7).f201449a.d);
                                String strI = a0.d.i(localDateTimeY.getYear(), "_", localDateTimeY.getDayOfYear());
                                Object objO = linkedHashMap2.get(strI);
                                if (objO == null) {
                                    objO = v0.a.o(linkedHashMap2, strI);
                                }
                                ((List) objO).add(obj7);
                            }
                            aim.e eVarB = zhm.u.b();
                            Iterator it8 = linkedHashMap2.entrySet().iterator();
                            while (it8.hasNext()) {
                                List list2 = (List) ((Map.Entry) it8.next()).getValue();
                                ArrayList arrayListH2 = ((pyb.s) kVar2).h(list2, qVar);
                                if (!arrayListH2.isEmpty()) {
                                    RevPoints.INSTANCE.getClass();
                                    RevPoints revPointsA = RevPoints.Companion.a(0L);
                                    Iterator it9 = list2.iterator();
                                    while (it9.hasNext()) {
                                        RevPointsTransaction revPointsTransaction2 = ((r1) it9.next()).f201449a;
                                        if (revPointsTransaction2.f84057g != s1.CANCELLED) {
                                            revPointsA = revPointsA.z(revPointsTransaction2.f84056c);
                                        }
                                    }
                                    eVarB.addAll(yp0.b.g(arrayListH2, com.revolut.feature.rev_points.impl.ui.transactions.list.e.a(revPointsA, ((r1) d0.b0(list2)).f201449a.d), e0.OUTSIDE_BOX, 0, 0, 124));
                                }
                            }
                            aim.e eVarA = zhm.u.a(eVarB);
                            aim.e eVarB2 = zhm.u.b();
                            if (eVarA.isEmpty()) {
                                eVarB2.addAll(eVar.d());
                            } else {
                                eVarB2.addAll(eVarA);
                            }
                            if (zBooleanValue || lVar2.i) {
                                eVarB2.addAll(arrayListB);
                            }
                            return zhm.u.a(eVarB2);
                        default:
                            Intrinsics.checkNotNullParameter(content, "content");
                            l lVar3 = lVar;
                            k71.q qVar2 = lVar3.f241234b;
                            boolean z = lVar3.i;
                            String str2 = lVar3.f241235c;
                            com.revolut.feature.rev_points.impl.ui.transactions.list.e eVar2 = this.f241253b;
                            fub.k kVar3 = eVar2.f83896a;
                            if (str2.length() != 0) {
                                ArrayList arrayListD = ((pyb.s) kVar3).d(content, qVar2);
                                int iB2 = zhm.q0.b(zhm.w.t(arrayListD, 10));
                                if (iB2 < 16) {
                                    iB2 = 16;
                                }
                                LinkedHashMap linkedHashMap3 = new LinkedHashMap(iB2);
                                for (Object obj8 : arrayListD) {
                                    linkedHashMap3.put(((RowDelegate.Model) obj8).f53228a, obj8);
                                }
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj9 : content) {
                                    e1 e1Var = (e1) obj9;
                                    RowDelegate.Model model2 = (RowDelegate.Model) linkedHashMap3.get("TransactionListItem_" + e1Var.f201357a);
                                    String str3 = null;
                                    d1 d1Var = e1Var instanceof d1 ? (d1) e1Var : null;
                                    if (d1Var != null && (revPointsTransaction = d1Var.f201353c) != null) {
                                        str3 = revPointsTransaction.f84064q;
                                    }
                                    if (str3 == null) {
                                        str3 = "";
                                    }
                                    if (model2 != null && i1c.b.a(model2, str2, str3)) {
                                        arrayList2.add(obj9);
                                    }
                                }
                                content = arrayList2;
                            }
                            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                            for (Object obj10 : content) {
                                LocalDateTime localDateTimeY2 = oi0.d.Y(((e1) obj10).f201358b);
                                String strI2 = a0.d.i(localDateTimeY2.getYear(), "_", localDateTimeY2.getDayOfYear());
                                Object objO2 = linkedHashMap4.get(strI2);
                                if (objO2 == null) {
                                    objO2 = v0.a.o(linkedHashMap4, strI2);
                                }
                                ((List) objO2).add(obj10);
                            }
                            aim.e eVarB3 = zhm.u.b();
                            Iterator it10 = linkedHashMap4.entrySet().iterator();
                            while (it10.hasNext()) {
                                List<e1> list3 = (List) ((Map.Entry) it10.next()).getValue();
                                ArrayList arrayListD2 = ((pyb.s) kVar3).d(list3, qVar2);
                                if (!arrayListD2.isEmpty()) {
                                    RevPoints.INSTANCE.getClass();
                                    RevPoints revPointsA2 = RevPoints.Companion.a(0L);
                                    for (e1 e1Var2 : list3) {
                                        if (e1Var2 instanceof d1) {
                                            RevPointsTransaction revPointsTransaction3 = ((d1) e1Var2).f201353c;
                                            if (revPointsTransaction3.f84057g != s1.CANCELLED) {
                                                revPointsA2 = revPointsA2.z(revPointsTransaction3.f84056c);
                                            }
                                        }
                                    }
                                    eVarB3.addAll(yp0.b.g(arrayListD2, com.revolut.feature.rev_points.impl.ui.transactions.list.e.a(revPointsA2, ((e1) d0.b0(list3)).f201358b), e0.OUTSIDE_BOX, 0, 0, 124));
                                }
                            }
                            aim.e eVarA2 = zhm.u.a(eVarB3);
                            if (eVarA2.isEmpty() && !zBooleanValue && !z) {
                                return eVar2.d();
                            }
                            aim.e eVarB4 = zhm.u.b();
                            eVarB4.addAll(eVarA2);
                            if (zBooleanValue || z) {
                                eVarB4.addAll(arrayListB);
                            }
                            return zhm.u.a(eVarB4);
                    }
                }
            });
        } else {
            if (!(kVar instanceof q0c.j)) {
                throw new NoWhenBranchMatchedException();
            }
            final int i2 = 1;
            list = (List) iii.c.g(((q0c.j) kVar).f241232a, new jeg.i(23, arrayListB), new g(this, 19), new Function3(this) { // from class: q0c.v

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.rev_points.impl.ui.transactions.list.e f241253b;

                {
                    this.f241253b = this;
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    RevPointsTransaction revPointsTransaction;
                    int i22 = i2;
                    List content = (List) obj2;
                    boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                    switch (i22) {
                        case 0:
                            Intrinsics.checkNotNullParameter(content, "content");
                            l lVar2 = lVar;
                            k71.q qVar = lVar2.f241234b;
                            String str = lVar2.f241235c;
                            com.revolut.feature.rev_points.impl.ui.transactions.list.e eVar = this.f241253b;
                            fub.k kVar2 = eVar.f83896a;
                            if (str.length() != 0) {
                                ArrayList arrayListH = ((pyb.s) kVar2).h(content, qVar);
                                int iB = zhm.q0.b(zhm.w.t(arrayListH, 10));
                                if (iB < 16) {
                                    iB = 16;
                                }
                                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                                for (Object obj5 : arrayListH) {
                                    linkedHashMap.put(((RowDelegate.Model) obj5).f53228a, obj5);
                                }
                                ArrayList arrayList = new ArrayList();
                                for (Object obj6 : content) {
                                    r1 r1Var = (r1) obj6;
                                    RowDelegate.Model model = (RowDelegate.Model) linkedHashMap.get("TransactionListItem_" + r1Var.f201449a.f84054a);
                                    if (model != null && i1c.b.a(model, str, r1Var.f201449a.f84064q)) {
                                        arrayList.add(obj6);
                                    }
                                }
                                content = arrayList;
                            }
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            for (Object obj7 : content) {
                                LocalDateTime localDateTimeY = oi0.d.Y(((r1) obj7).f201449a.d);
                                String strI = a0.d.i(localDateTimeY.getYear(), "_", localDateTimeY.getDayOfYear());
                                Object objO = linkedHashMap2.get(strI);
                                if (objO == null) {
                                    objO = v0.a.o(linkedHashMap2, strI);
                                }
                                ((List) objO).add(obj7);
                            }
                            aim.e eVarB = zhm.u.b();
                            Iterator it8 = linkedHashMap2.entrySet().iterator();
                            while (it8.hasNext()) {
                                List list2 = (List) ((Map.Entry) it8.next()).getValue();
                                ArrayList arrayListH2 = ((pyb.s) kVar2).h(list2, qVar);
                                if (!arrayListH2.isEmpty()) {
                                    RevPoints.INSTANCE.getClass();
                                    RevPoints revPointsA = RevPoints.Companion.a(0L);
                                    Iterator it9 = list2.iterator();
                                    while (it9.hasNext()) {
                                        RevPointsTransaction revPointsTransaction2 = ((r1) it9.next()).f201449a;
                                        if (revPointsTransaction2.f84057g != s1.CANCELLED) {
                                            revPointsA = revPointsA.z(revPointsTransaction2.f84056c);
                                        }
                                    }
                                    eVarB.addAll(yp0.b.g(arrayListH2, com.revolut.feature.rev_points.impl.ui.transactions.list.e.a(revPointsA, ((r1) d0.b0(list2)).f201449a.d), e0.OUTSIDE_BOX, 0, 0, 124));
                                }
                            }
                            aim.e eVarA = zhm.u.a(eVarB);
                            aim.e eVarB2 = zhm.u.b();
                            if (eVarA.isEmpty()) {
                                eVarB2.addAll(eVar.d());
                            } else {
                                eVarB2.addAll(eVarA);
                            }
                            if (zBooleanValue || lVar2.i) {
                                eVarB2.addAll(arrayListB);
                            }
                            return zhm.u.a(eVarB2);
                        default:
                            Intrinsics.checkNotNullParameter(content, "content");
                            l lVar3 = lVar;
                            k71.q qVar2 = lVar3.f241234b;
                            boolean z = lVar3.i;
                            String str2 = lVar3.f241235c;
                            com.revolut.feature.rev_points.impl.ui.transactions.list.e eVar2 = this.f241253b;
                            fub.k kVar3 = eVar2.f83896a;
                            if (str2.length() != 0) {
                                ArrayList arrayListD = ((pyb.s) kVar3).d(content, qVar2);
                                int iB2 = zhm.q0.b(zhm.w.t(arrayListD, 10));
                                if (iB2 < 16) {
                                    iB2 = 16;
                                }
                                LinkedHashMap linkedHashMap3 = new LinkedHashMap(iB2);
                                for (Object obj8 : arrayListD) {
                                    linkedHashMap3.put(((RowDelegate.Model) obj8).f53228a, obj8);
                                }
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj9 : content) {
                                    e1 e1Var = (e1) obj9;
                                    RowDelegate.Model model2 = (RowDelegate.Model) linkedHashMap3.get("TransactionListItem_" + e1Var.f201357a);
                                    String str3 = null;
                                    d1 d1Var = e1Var instanceof d1 ? (d1) e1Var : null;
                                    if (d1Var != null && (revPointsTransaction = d1Var.f201353c) != null) {
                                        str3 = revPointsTransaction.f84064q;
                                    }
                                    if (str3 == null) {
                                        str3 = "";
                                    }
                                    if (model2 != null && i1c.b.a(model2, str2, str3)) {
                                        arrayList2.add(obj9);
                                    }
                                }
                                content = arrayList2;
                            }
                            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                            for (Object obj10 : content) {
                                LocalDateTime localDateTimeY2 = oi0.d.Y(((e1) obj10).f201358b);
                                String strI2 = a0.d.i(localDateTimeY2.getYear(), "_", localDateTimeY2.getDayOfYear());
                                Object objO2 = linkedHashMap4.get(strI2);
                                if (objO2 == null) {
                                    objO2 = v0.a.o(linkedHashMap4, strI2);
                                }
                                ((List) objO2).add(obj10);
                            }
                            aim.e eVarB3 = zhm.u.b();
                            Iterator it10 = linkedHashMap4.entrySet().iterator();
                            while (it10.hasNext()) {
                                List<e1> list3 = (List) ((Map.Entry) it10.next()).getValue();
                                ArrayList arrayListD2 = ((pyb.s) kVar3).d(list3, qVar2);
                                if (!arrayListD2.isEmpty()) {
                                    RevPoints.INSTANCE.getClass();
                                    RevPoints revPointsA2 = RevPoints.Companion.a(0L);
                                    for (e1 e1Var2 : list3) {
                                        if (e1Var2 instanceof d1) {
                                            RevPointsTransaction revPointsTransaction3 = ((d1) e1Var2).f201353c;
                                            if (revPointsTransaction3.f84057g != s1.CANCELLED) {
                                                revPointsA2 = revPointsA2.z(revPointsTransaction3.f84056c);
                                            }
                                        }
                                    }
                                    eVarB3.addAll(yp0.b.g(arrayListD2, com.revolut.feature.rev_points.impl.ui.transactions.list.e.a(revPointsA2, ((e1) d0.b0(list3)).f201358b), e0.OUTSIDE_BOX, 0, 0, 124));
                                }
                            }
                            aim.e eVarA2 = zhm.u.a(eVarB3);
                            if (eVarA2.isEmpty() && !zBooleanValue && !z) {
                                return eVar2.d();
                            }
                            aim.e eVarB4 = zhm.u.b();
                            eVarB4.addAll(eVarA2);
                            if (zBooleanValue || z) {
                                eVarB4.addAll(arrayListB);
                            }
                            return zhm.u.a(eVarB4);
                    }
                }
            });
        }
        List list2 = list;
        List list3 = lVar.f;
        int iJ = ((l80.f) this.f83898c).j();
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        List list4 = list3;
        ArrayList arrayList = new ArrayList(zhm.w.t(list4, 10));
        Iterator it8 = list4.iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            YearMonth yearMonth2 = (YearMonth) it8.next();
            TimeClause.Format month = yearMonth2.getYear() == iJ ? new TimeClause.Format.Month(0) : new TimeClause.Format.MonthAndYear((ka) null, 3);
            String string = yearMonth2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            arrayList.add(new com.revolut.core.ui_kit.views.q(string, new t(new TimeClause(yearMonth2.atDay(1).atStartOfDay(zoneIdSystemDefault).toInstant().toEpochMilli(), month, null, zoneIdSystemDefault, 4)), 58));
            arrayListB = arrayListB;
        }
        ArrayList arrayList2 = arrayListB;
        boolean z = lVar.i;
        if (!z || lVar.f241238j) {
            if (!z && yearMonth != null) {
                Iterator it9 = list2.iterator();
                int i3 = 0;
                while (true) {
                    if (!it9.hasNext()) {
                        i3 = -1;
                        break;
                    }
                    koi.j jVar2 = (koi.j) it9.next();
                    if ((jVar2 instanceof ListSubheaderDelegate.Model) && (lN = z.n(kotlin.text.d0.e0(((ListSubheaderDelegate.Model) jVar2).f52708a, "DAILY_GROUP_HEADER_LIST_ID"))) != null) {
                        LocalDate localDate = oi0.d.Y(lN.longValue()).toLocalDate();
                        zF = Intrinsics.f(YearMonth.of(localDate.getYear(), localDate.getMonth()), yearMonth);
                    } else {
                        zF = false;
                    }
                    if (zF) {
                        break;
                    }
                    i3++;
                }
                numValueOf = i3 != -1 ? Integer.valueOf(i3) : null;
            }
        } else {
            int size = list2.size() - arrayList2.size();
            numValueOf = Integer.valueOf(size);
            num = size >= 0 ? numValueOf : null;
        }
        String str = lVar.d;
        boolean z3 = lVar.e;
        if (yearMonth == null) {
            yearMonth = lVar.f241237h;
        }
        return new q(list2, str, z3, arrayList, yearMonth != null ? yearMonth.toString() : null, num, lVar.i);
    }

    public final List d() {
        ComplexImage regular;
        ResourceId resourceId;
        ResourceId resourceId2;
        ResourceId resourceId3;
        RevPointsTransactionsListScreenContract$InputData.EmptyStateOverride emptyStateOverride = this.f83897b.f83877b.d;
        TextLocalisedClause textLocalisedClause = (emptyStateOverride == null || (resourceId3 = emptyStateOverride.f83878a) == null) ? new TextLocalisedClause(R$string.rev_points_transactions_empty, null, null, 14) : new TextLocalisedClause(resourceId3, (List) null, (Style) null, (Clause) null, 30);
        TextLocalisedClause textLocalisedClause2 = (emptyStateOverride == null || (resourceId2 = emptyStateOverride.f83879b) == null) ? new TextLocalisedClause(R$string.rev_points_transactions_empty_caption, null, null, 14) : new TextLocalisedClause(resourceId2, (List) null, (Style) null, (Clause) null, 30);
        TextLocalisedClause textLocalisedClause3 = (emptyStateOverride == null || (resourceId = emptyStateOverride.f83880c) == null) ? new TextLocalisedClause(R$string.rev_points_earn_hub_title, null, null, 14) : new TextLocalisedClause(resourceId, (List) null, (Style) null, (Clause) null, 30);
        if (emptyStateOverride == null || (regular = emptyStateOverride.d) == null) {
            regular = new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D097", null, null, null, 30));
        }
        List listC = u.c(new FullScreenStateDelegate.Model("EMPTY_ITEM_LIST_ID", textLocalisedClause, textLocalisedClause2, regular, new l6(12, textLocalisedClause3, null, h4.ACCENT), zj.REGULAR, false, null, null, null, 1984));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        return listC;
    }
}
