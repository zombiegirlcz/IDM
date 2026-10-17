package rkg;

import aw0.j0;
import aw0.o9;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.wh;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.transactions.api.filter.TransactionsFilterWithContext;
import com.revolut.feature.unified_transactions.api.filter.UnifiedTransactionsFilter;
import com.revolut.feature.unified_transactions.impl.R$plurals;
import com.revolut.feature.unified_transactions.impl.R$string;
import com.revolut.feature.unified_transactions.models.UnifiedTransaction;
import com.revolut.tracking.v3.IdContext;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import k71.k;
import k71.p;
import k71.q;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import tof.a3;
import tof.d3;
import tof.p2;
import tof.t2;
import whf.i;
import whf.l;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.q0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements kkg.b {

    @NotNull
    private static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f254865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final anf.b f254866b;

    public h(d itemMapper, anf.b transactionSumCalculator) {
        Intrinsics.checkNotNullParameter(itemMapper, "itemMapper");
        Intrinsics.checkNotNullParameter(transactionSumCalculator, "transactionSumCalculator");
        this.f254865a = itemMapper;
        this.f254866b = transactionSumCalculator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.lang.Integer, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r26v6, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13, types: [whf.e] */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v37, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v39 */
    /* JADX WARN: Type inference failed for: r9v40, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v75 */
    /* JADX WARN: Type inference failed for: r9v76 */
    /* JADX WARN: Type inference failed for: r9v77 */
    @Override // kkg.b
    public final List a(kkg.a unifiedContent, l lVar, i groupingType) {
        Iterator it8;
        List list;
        ArrayList arrayList;
        boolean z;
        Object obj2;
        f fVar;
        dj0.d dVarO;
        qv0.i iVar;
        qv0.i model;
        Iterator it9;
        ?? pair;
        ArrayList arrayList2;
        LinkedHashSet linkedHashSet;
        dj0.d dVar;
        q qVarA;
        whf.h hVar;
        wh whVarA;
        List list2;
        l itemMapping = lVar;
        Intrinsics.checkNotNullParameter(unifiedContent, "unifiedContent");
        Intrinsics.checkNotNullParameter(itemMapping, "itemMapping");
        Intrinsics.checkNotNullParameter(groupingType, "groupingType");
        List list3 = unifiedContent.f185062a;
        whf.h hVar2 = groupingType.f297642b;
        aim.e eVarB = u.b();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj3 : list3) {
            LocalDate localDate = Instant.ofEpochMilli(((UnifiedTransaction) obj3).getF94576c()).atZone(ZoneId.systemDefault()).toLocalDate();
            Object objU = linkedHashMap.get(localDate);
            if (objU == null) {
                objU = h30.l.u(linkedHashMap, localDate);
            }
            ((List) objU).add(obj3);
        }
        Iterator it10 = linkedHashMap.entrySet().iterator();
        while (it10.hasNext()) {
            Map.Entry entry = (Map.Entry) it10.next();
            LocalDate localDate2 = (LocalDate) entry.getKey();
            List list4 = (List) entry.getValue();
            ArrayList arrayListA = com.revolut.feature.unified_transactions.models.a.a(list4);
            Map map = unifiedContent.f185063b.f181795b;
            ArrayList arrayListA2 = com.revolut.feature.unified_transactions.models.a.a(list4);
            yvh.f fVar2 = null;
            if (hVar2 instanceof whf.g) {
                dj0.d.Companion.getClass();
                fVar = new f(null, dj0.d.d, h0.f322473a);
                it8 = it10;
                list = list4;
                arrayList = arrayListA;
            } else {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : arrayListA2) {
                    yvh.f fVar3 = fVar2;
                    Iterator it11 = it10;
                    a3 a3Var = (a3) obj4;
                    List list5 = list4;
                    if (a3Var.q0 != null) {
                        d3 d3Var = a3Var.E;
                        arrayList2 = arrayListA;
                        if ((d3Var != null ? d3Var.f272683b : fVar3) == yvh.f.SPARE_CHANGE && (k.o0(a3Var) != null || a3Var.B == null)) {
                            arrayList3.add(obj4);
                        }
                    } else {
                        arrayList2 = arrayListA;
                    }
                    fVar2 = fVar3;
                    it10 = it11;
                    list4 = list5;
                    arrayListA = arrayList2;
                }
                it8 = it10;
                list = list4;
                arrayList = arrayListA;
                ?? r172 = fVar2;
                ArrayList arrayList4 = new ArrayList();
                ArrayList<a3> arrayList5 = new ArrayList();
                Iterator it12 = arrayList3.iterator();
                while (it12.hasNext()) {
                    Object next = it12.next();
                    Iterator it13 = it12;
                    if (((a3) next).k.f(dj0.d.e)) {
                        arrayList4.add(next);
                    } else {
                        arrayList5.add(next);
                    }
                    it12 = it13;
                }
                int iB = q0.b(w.t(arrayList5, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(iB);
                for (a3 a3Var2 : arrayList5) {
                    ArrayList arrayList6 = arrayList4;
                    String str = a3Var2.q0;
                    Intrinsics.h(str);
                    linkedHashMap3.put(str, a3Var2.k);
                    arrayList4 = arrayList6;
                }
                ArrayList arrayList7 = arrayList4;
                linkedHashMap2.putAll(linkedHashMap3);
                Unit unit = Unit.f186387a;
                Iterator it14 = arrayList5.iterator();
                while (it14.hasNext()) {
                    linkedHashSet2.add(((a3) it14.next()).f272624y.f273143a);
                }
                ArrayList<Pair> arrayList8 = new ArrayList();
                Iterator it15 = arrayListA2.iterator();
                while (it15.hasNext()) {
                    a3 a3Var3 = (a3) it15.next();
                    p2 p2VarZ1 = k.z1(a3Var3, map);
                    if (p2VarZ1 != null) {
                        it9 = it15;
                        pair = new Pair(a3Var3.f272581b, p2VarZ1);
                    } else {
                        it9 = it15;
                        pair = r172;
                    }
                    if (pair != 0) {
                        arrayList8.add(pair);
                    }
                    it15 = it9;
                }
                int iB2 = q0.b(w.t(arrayList8, 10));
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(iB2 < 16 ? 16 : iB2);
                for (Pair pair2 : arrayList8) {
                    linkedHashMap4.put((String) pair2.f186385a, ((p2) pair2.f186386b).d);
                }
                linkedHashMap2.putAll(linkedHashMap4);
                Unit unit2 = Unit.f186387a;
                Iterator it16 = arrayListA2.iterator();
                while (it16.hasNext()) {
                    p2 p2VarZ12 = k.z1((a3) it16.next(), map);
                    ?? r92 = p2VarZ12 != null ? p2VarZ12.f : r172;
                    if (r92 != 0) {
                        linkedHashSet2.add(r92);
                    }
                }
                boolean z3 = hVar2 instanceof whf.e;
                ?? r98 = z3 ? (whf.e) hVar2 : r172;
                if (r98 == 0 || !r98.f297638b) {
                    z = z3;
                    obj2 = f0.f322471a;
                } else {
                    ArrayList arrayList9 = new ArrayList();
                    for (Object obj5 : arrayList7) {
                        boolean z4 = z3;
                        if (d0.T(linkedHashMap2.keySet(), ((a3) obj5).q0)) {
                            arrayList9.add(obj5);
                        }
                        z3 = z4;
                    }
                    z = z3;
                    obj2 = arrayList9;
                }
                Iterable iterable = (Iterable) obj2;
                ArrayList arrayListE0 = d0.E0(iterable, arrayList5);
                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                Iterator it17 = arrayListE0.iterator();
                while (it17.hasNext()) {
                    linkedHashSet3.add(((a3) it17.next()).f272579a);
                }
                if (linkedHashMap2.isEmpty() || linkedHashSet2.isEmpty()) {
                    dj0.d.Companion.getClass();
                    fVar = new f(null, dj0.d.d, linkedHashSet3);
                } else {
                    Collection collectionValues = linkedHashMap2.values();
                    ArrayList arrayList10 = new ArrayList(w.t(iterable, 10));
                    Iterator it18 = iterable.iterator();
                    while (it18.hasNext()) {
                        arrayList10.add(((a3) it18.next()).k);
                    }
                    ArrayList arrayListE02 = d0.E0(arrayList10, collectionValues);
                    ArrayList arrayList11 = new ArrayList(w.t(arrayListE02, 10));
                    Iterator it19 = arrayListE02.iterator();
                    while (it19.hasNext()) {
                        arrayList11.add(((dj0.d) it19.next()).f115083b);
                    }
                    if (d0.U(arrayList11).size() == 1) {
                        dj0.d.Companion.getClass();
                        dVarO = dj0.d.e;
                        int i = 0;
                        for (Object obj6 : arrayListE02) {
                            int i2 = i + 1;
                            if (i < 0) {
                                v.s();
                                throw r172;
                            }
                            dVarO = i == 0 ? (dj0.d) obj6 : pyd.c.O(dVarO, (dj0.d) obj6);
                            i = i2;
                        }
                    } else {
                        dj0.d.Companion.getClass();
                        dVarO = dj0.d.d;
                    }
                    if (z) {
                        DateTime dateTime = ((a3) d0.b0(arrayListA2)).f272593h;
                        dj0.d.Companion.getClass();
                        ?? moneyClause = !Intrinsics.f(dVarO, dj0.d.d) ? new MoneyClause(dVarO, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12) : r172;
                        Object[] elements = {moneyClause, new TimeClause(dateTime.getMillis(), new TimeClause.Format.Pretty(com.revolut.core.ui_kit.models.q0.ONLY_DATE), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), null, 8)};
                        Intrinsics.checkNotNullParameter(elements, "elements");
                        String str2 = "SPARE_CHANGE_ITEM_GROUP_LIST_ID_PREFIX" + dateTime;
                        t2 t2Var = new t2(d0.i1(linkedHashMap2.keySet()), linkedHashSet2, new CompositeClause(kotlin.collections.d.L(elements), new DotDividerClause((Integer) r172), null, null, 12));
                        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
                        IdContext.a aVarNewBuilder = IdContext.newBuilder();
                        aVarNewBuilder.h("spare_change_" + dateTime);
                        w0 w0VarA = aVarNewBuilder.a();
                        companion.getClass();
                        w0 w0VarA2 = AnalyticsContext.Companion.a(w0VarA);
                        int i3 = g.f254864a[((whf.e) hVar2).f297637a.ordinal()];
                        if (i3 == 1) {
                            model = new RowDelegate.Model(str2, LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_coins, R$attr.uikit_colorWhite, R$attr.uikit_colorBlue), null, null, new TextLocalisedClause(R$string.transactionUI_transaction_details_spare_change_section_spare_change, null, null, 14), new TextLocalisedQuantityClause(R$plurals.transactionUI_transaction_list_subtitle_amount, Integer.valueOf(linkedHashMap2.size()), u.c(Integer.valueOf(linkedHashMap2.size())), (Style) null, 24), null, null, 0, moneyClause != 0 ? new RowDelegate.Model.c.b(moneyClause, null, null, false, 126) : null, false, false, null, null, null, null, null, t2Var, new AnalyticsContext(w0VarA2), 0, 0, 0, 0, 1023407980);
                        } else {
                            if (i3 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            List listK = v.k(new TextLocalisedClause(R$string.transactionUI_transaction_details_spare_change_section_spare_change, null, null, 14), new ImageClause(R$drawable.uikit_icn_20_transaction_badge_spare_change, new ImageClauseTint.Color(R$attr.uikit_colorGreyTone20), (Float) null, (Float) null, 28));
                            m70.a.t(t0.f186434a);
                            model = new InputDisclosureDelegate.Model(str2, new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), new NumberClause(linkedHashMap2.size(), (NumberClause.Format.Compact) null, (Custom) null, 6), t2Var, new AnalyticsContext(w0VarA2), 968);
                        }
                        qv0.i iVar2 = model;
                        yp0.b.l(iVar2, R$attr.uikit_dp16, R$attr.uikit_dp0, 0, 0, null, false, 60);
                        iVar = iVar2;
                    } else {
                        iVar = null;
                    }
                    fVar = new f(iVar, dVarO, linkedHashSet3);
                }
            }
            if (Intrinsics.f(hVar2, whf.g.f297640a)) {
                linkedHashSet = new LinkedHashSet();
                Iterator it20 = arrayList.iterator();
                while (it20.hasNext()) {
                    linkedHashSet.add(((a3) it20.next()).f272579a);
                }
            } else {
                if (!(hVar2 instanceof whf.e) && !Intrinsics.f(hVar2, whf.f.f297639a)) {
                    throw new NoWhenBranchMatchedException();
                }
                ArrayList arrayList12 = new ArrayList();
                for (Object obj7 : arrayList) {
                    if (!fVar.f254863c.contains(((a3) obj7).f272579a)) {
                        arrayList12.add(obj7);
                    }
                }
                LinkedHashSet linkedHashSet4 = new LinkedHashSet();
                Iterator it21 = arrayList12.iterator();
                while (it21.hasNext()) {
                    linkedHashSet4.add(((a3) it21.next()).f272579a);
                }
                linkedHashSet = linkedHashSet4;
            }
            List<UnifiedTransaction> list6 = list;
            ArrayList arrayList13 = new ArrayList();
            for (UnifiedTransaction unifiedTransaction : list6) {
                if (!(unifiedTransaction instanceof UnifiedTransaction.Standard) || linkedHashSet.contains(((UnifiedTransaction.Standard) unifiedTransaction).f94575b)) {
                    if (unifiedTransaction instanceof UnifiedTransaction.Standard) {
                        qVarA = (q) unifiedContent.d.get(((UnifiedTransaction.Standard) unifiedTransaction).f94574a.f272584c);
                        if (qVarA == null) {
                            qVarA = unifiedContent.f185063b;
                        }
                    } else {
                        q.Companion.getClass();
                        qVarA = p.a();
                    }
                    hVar = hVar2;
                    whVarA = this.f254865a.a(unifiedTransaction, new UnifiedTransactionsFilter((TransactionsFilterWithContext) null, 3), qVarA, itemMapping);
                    if (whVarA == null) {
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        list2 = list6;
                        rd0.d.a(rd0.c.ERROR, "UnifiedTransactionsListMapper", a0.d.s("Could not map ", unifiedTransaction.getClass().getSimpleName(), " with id=", unifiedTransaction.getF94575b()), null, h0Var);
                    } else {
                        list2 = list6;
                    }
                } else {
                    hVar = hVar2;
                    list2 = list6;
                    whVarA = null;
                }
                if (whVarA != null) {
                    arrayList13.add(whVarA);
                }
                itemMapping = lVar;
                list6 = list2;
                hVar2 = hVar;
            }
            whf.h hVar3 = hVar2;
            List list7 = list6;
            boolean zIsEmpty = arrayList13.isEmpty();
            qv0.i iVar3 = fVar.f254861a;
            if (!zIsEmpty || iVar3 != null) {
                ArrayList arrayList14 = new ArrayList();
                for (Object obj8 : list7) {
                    UnifiedTransaction unifiedTransaction2 = (UnifiedTransaction) obj8;
                    if (!(unifiedTransaction2 instanceof UnifiedTransaction.Standard) || linkedHashSet.contains(((UnifiedTransaction.Standard) unifiedTransaction2).f94575b)) {
                        arrayList14.add(obj8);
                    }
                }
                Intrinsics.h(localDate2);
                Intrinsics.checkNotNullParameter(localDate2, "<this>");
                String str3 = "ITEM_GROUP_DATE_TITLE_LIST_ID_PREFIX_" + localDate2;
                UnifiedTransaction unifiedTransaction3 = (UnifiedTransaction) d0.b0(list);
                whf.a aVar = unifiedContent.f185064c;
                dj0.d.Companion.getClass();
                dj0.d dVar2 = dj0.d.d;
                dj0.d dVar3 = fVar.f254862b;
                if (Intrinsics.f(dVar3, dVar2)) {
                    dVar3 = null;
                }
                boolean z6 = groupingType.f297641a;
                ArrayList arrayListA3 = com.revolut.feature.unified_transactions.models.a.a(arrayList14);
                if (z6) {
                    dj0.d dVarA = this.f254866b.a(arrayListA3, aVar);
                    if (Intrinsics.f(dVarA.f115083b, dVar3 != null ? dVar3.f115083b : null)) {
                        dVarA = pyd.c.O(dVarA, dVar3);
                    }
                    dVar = dVarA;
                } else {
                    dVar = dVar2;
                }
                dj0.d dVar4 = !Intrinsics.f(dVar, dVar2) ? dVar : null;
                eVarB.add(new ListSubheaderDelegate.Model(str3, null, new TimeClause(unifiedTransaction3.getF94576c(), new TimeClause.Format.Pretty(com.revolut.core.ui_kit.models.q0.ONLY_DATE), null, null, 12), null, dVar4 != null ? new MoneyClause(dVar4, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12) : null, null, j0.TRANSPARENT, null, null, false, false, unifiedTransaction3, null, R$attr.uikit_dp32, R$attr.uikit_dp16, 0, 0, 13627306));
                int i5 = R$attr.uikit_dp0;
                yp0.b.k(arrayList13, i5, i5, 0, 0, 28);
                eVarB.addAll(arrayList13);
                if (iVar3 != null) {
                    eVarB.add(iVar3);
                }
            }
            itemMapping = lVar;
            it10 = it8;
            hVar2 = hVar3;
        }
        return u.a(eVarB);
    }
}
