package anf;

import aw0.j0;
import aw0.o9;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
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
import com.revolut.feature.transactions.impl.R$plurals;
import com.revolut.feature.transactions.impl.R$string;
import com.revolut.tracking.v3.IdContext;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
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
import whf.j;
import zhm.a0;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.q0;

/* JADX INFO: loaded from: classes8.dex */
public final class w implements whf.n {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f7761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final thf.l f7762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final thf.i f7763c;

    public w(b transactionSumCalculator, thf.l swipeActionMapper, thf.i selectableMapper) {
        Intrinsics.checkNotNullParameter(transactionSumCalculator, "transactionSumCalculator");
        Intrinsics.checkNotNullParameter(swipeActionMapper, "swipeActionMapper");
        Intrinsics.checkNotNullParameter(selectableMapper, "selectableMapper");
        this.f7761a = transactionSumCalculator;
        this.f7762b = swipeActionMapper;
        this.f7763c = selectableMapper;
    }

    public final ArrayList b(List list, k71.q qVar, Map map, whf.m mVar) {
        qv0.o oVarP;
        List<a3> list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        for (a3 a3Var : list2) {
            k71.q qVar2 = (k71.q) map.get(a3Var.f272584c);
            k71.q qVar3 = qVar2 == null ? qVar : qVar2;
            if (mVar instanceof whf.k) {
                oVarP = ((l) this.f7763c).p(a3Var, qVar3, ((whf.k) mVar).f297644a);
            } else {
                if (!(mVar instanceof whf.l)) {
                    throw new NoWhenBranchMatchedException();
                }
                oVarP = ((o) this.f7762b).p(a3Var, qVar3, ((whf.l) mVar).f297645a, null, null);
            }
            arrayList.add(oVarP);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v7, types: [anf.b] */
    /* JADX WARN: Type inference failed for: r25v10, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r25v12 */
    /* JADX WARN: Type inference failed for: r25v9 */
    /* JADX WARN: Type inference failed for: r3v39, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v41, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r49v0, types: [anf.w] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final ArrayList c(whf.p transactionsContent, whf.m itemMapping, whf.j jVar) {
        Iterator it8;
        List list;
        boolean z;
        boolean z3;
        Object obj2;
        u uVar;
        dj0.d dVar;
        dj0.d dVarO;
        qv0.i iVar;
        qv0.i model;
        Iterator it9;
        Pair pair;
        ?? arrayList;
        dj0.d dVar2;
        whf.j groupingType = jVar;
        Intrinsics.checkNotNullParameter(transactionsContent, "transactionsContent");
        Intrinsics.checkNotNullParameter(itemMapping, "itemMapping");
        Intrinsics.checkNotNullParameter(groupingType, "groupingType");
        List list2 = transactionsContent.f297646a;
        Map map = transactionsContent.d;
        k71.q qVar = transactionsContent.f297647b;
        if (!(groupingType instanceof whf.i)) {
            if (groupingType instanceof j.a) {
                return b(list2, qVar, map, itemMapping);
            }
            throw new NoWhenBranchMatchedException();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj3 : list2) {
            a3 a3Var = (a3) obj3;
            String strI = a0.d.i(a3Var.f272593h.getYear(), "_", a3Var.f272593h.getDayOfYear());
            Object objO = linkedHashMap.get(strI);
            if (objO == null) {
                objO = v0.a.o(linkedHashMap, strI);
            }
            ((List) objO).add(obj3);
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap.size() + list2.size());
        Iterator it10 = linkedHashMap.entrySet().iterator();
        while (it10.hasNext()) {
            List list3 = (List) ((Map.Entry) it10.next()).getValue();
            Map map2 = qVar.f181795b;
            whf.i iVar2 = (whf.i) groupingType;
            whf.h hVar = iVar2.f297642b;
            boolean z4 = hVar instanceof whf.g;
            if (z4) {
                dj0.d.Companion.getClass();
                uVar = new u(null, dj0.d.d, h0.f322473a);
                it8 = it10;
                list = list3;
                z = z4;
                dVar = null;
            } else {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                List list4 = list3;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : list4) {
                    Iterator it11 = it10;
                    List list5 = list3;
                    a3 a3Var2 = (a3) obj4;
                    boolean z6 = z4;
                    if (a3Var2.q0 != null) {
                        d3 d3Var = a3Var2.E;
                        if ((d3Var != null ? d3Var.f272683b : null) == yvh.f.SPARE_CHANGE && (k71.k.o0(a3Var2) != null || a3Var2.B == null)) {
                            arrayList3.add(obj4);
                        }
                    }
                    it10 = it11;
                    list3 = list5;
                    z4 = z6;
                }
                it8 = it10;
                list = list3;
                z = z4;
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
                int iB = q0.b(zhm.w.t(arrayList5, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(iB);
                for (a3 a3Var3 : arrayList5) {
                    ArrayList arrayList6 = arrayList4;
                    String str = a3Var3.q0;
                    Intrinsics.h(str);
                    linkedHashMap3.put(str, a3Var3.k);
                    arrayList4 = arrayList6;
                }
                ArrayList arrayList7 = arrayList4;
                linkedHashMap2.putAll(linkedHashMap3);
                Unit unit = Unit.f186387a;
                ArrayList arrayList8 = new ArrayList(zhm.w.t(arrayList5, 10));
                Iterator it14 = arrayList5.iterator();
                while (it14.hasNext()) {
                    arrayList8.add(((a3) it14.next()).f272624y.f273143a);
                }
                linkedHashSet.addAll(arrayList8);
                ArrayList<Pair> arrayList9 = new ArrayList();
                Iterator it15 = list4.iterator();
                while (it15.hasNext()) {
                    a3 a3Var4 = (a3) it15.next();
                    p2 p2VarZ1 = k71.k.z1(a3Var4, map2);
                    if (p2VarZ1 != null) {
                        it9 = it15;
                        pair = new Pair(a3Var4.f272581b, p2VarZ1);
                    } else {
                        it9 = it15;
                        pair = null;
                    }
                    if (pair != null) {
                        arrayList9.add(pair);
                    }
                    it15 = it9;
                }
                int iB2 = q0.b(zhm.w.t(arrayList9, 10));
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(iB2 < 16 ? 16 : iB2);
                for (Pair pair2 : arrayList9) {
                    linkedHashMap4.put((String) pair2.f186385a, ((p2) pair2.f186386b).d);
                }
                linkedHashMap2.putAll(linkedHashMap4);
                Unit unit2 = Unit.f186387a;
                ArrayList arrayList10 = new ArrayList();
                Iterator it16 = list4.iterator();
                while (it16.hasNext()) {
                    p2 p2VarZ12 = k71.k.z1((a3) it16.next(), map2);
                    String str2 = p2VarZ12 != null ? p2VarZ12.f : null;
                    if (str2 != null) {
                        arrayList10.add(str2);
                    }
                }
                linkedHashSet.addAll(arrayList10);
                boolean z11 = hVar instanceof whf.e;
                whf.e eVar = z11 ? (whf.e) hVar : null;
                if (eVar == null || !eVar.f297638b) {
                    z3 = z11;
                    obj2 = f0.f322471a;
                } else {
                    ArrayList arrayList11 = new ArrayList();
                    for (Object obj5 : arrayList7) {
                        boolean z12 = z11;
                        if (d0.T(linkedHashMap2.keySet(), ((a3) obj5).q0)) {
                            arrayList11.add(obj5);
                        }
                        z11 = z12;
                    }
                    z3 = z11;
                    obj2 = arrayList11;
                }
                Iterable iterable = (Iterable) obj2;
                ArrayList arrayListE0 = d0.E0(iterable, arrayList5);
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                Iterator it17 = arrayListE0.iterator();
                while (it17.hasNext()) {
                    linkedHashSet2.add(((a3) it17.next()).f272579a);
                }
                if (linkedHashMap2.isEmpty() || linkedHashSet.isEmpty()) {
                    dj0.d.Companion.getClass();
                    dVar = null;
                    uVar = new u(null, dj0.d.d, linkedHashSet2);
                } else {
                    Collection collectionValues = linkedHashMap2.values();
                    ArrayList arrayList12 = new ArrayList(zhm.w.t(iterable, 10));
                    Iterator it18 = iterable.iterator();
                    while (it18.hasNext()) {
                        arrayList12.add(((a3) it18.next()).k);
                    }
                    ArrayList arrayListE02 = d0.E0(arrayList12, collectionValues);
                    ArrayList arrayList13 = new ArrayList(zhm.w.t(arrayListE02, 10));
                    Iterator it19 = arrayListE02.iterator();
                    while (it19.hasNext()) {
                        arrayList13.add(((dj0.d) it19.next()).f115083b);
                    }
                    if (d0.U(arrayList13).size() == 1) {
                        dj0.d.Companion.getClass();
                        dVarO = dj0.d.e;
                        int i = 0;
                        for (Object obj6 : arrayListE02) {
                            int i2 = i + 1;
                            if (i < 0) {
                                zhm.v.s();
                                throw null;
                            }
                            dVarO = i == 0 ? (dj0.d) obj6 : pyd.c.O(dVarO, (dj0.d) obj6);
                            i = i2;
                        }
                    } else {
                        dj0.d.Companion.getClass();
                        dVarO = dj0.d.d;
                    }
                    if (z3) {
                        DateTime dateTime = ((a3) d0.b0(list)).f272593h;
                        dj0.d.Companion.getClass();
                        MoneyClause moneyClauseB = !Intrinsics.f(dVarO, dj0.d.d) ? sx4.f.b(3, null, null, dVarO) : null;
                        Object[] elements = {moneyClauseB, new TimeClause(dateTime.getMillis(), new TimeClause.Format.Pretty(com.revolut.core.ui_kit.models.q0.ONLY_DATE), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), null, 8)};
                        Intrinsics.checkNotNullParameter(elements, "elements");
                        MoneyClause moneyClause = moneyClauseB;
                        String str3 = "SPARE_CHANGE_ITEM_GROUP_LIST_ID_PREFIX" + dateTime;
                        t2 t2Var = new t2(d0.i1(linkedHashMap2.keySet()), linkedHashSet, new CompositeClause(kotlin.collections.d.L(elements), new DotDividerClause((Integer) null), null, null, 12));
                        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
                        IdContext.a aVarNewBuilder = IdContext.newBuilder();
                        aVarNewBuilder.h("spare_change_" + dateTime);
                        w0 w0VarA = aVarNewBuilder.a();
                        companion.getClass();
                        w0 w0VarA2 = AnalyticsContext.Companion.a(w0VarA);
                        int i3 = v.f7759a[((whf.e) hVar).f297637a.ordinal()];
                        if (i3 == 1) {
                            model = new RowDelegate.Model(str3, LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_coins, R$attr.uikit_colorWhite, R$attr.uikit_colorBlue), null, null, new TextLocalisedClause(R$string.transactionUI_transaction_details_spare_change_section_spare_change, null, null, 14), new TextLocalisedQuantityClause(R$plurals.transactionUI_transaction_list_subtitle_amount, Integer.valueOf(linkedHashMap2.size()), zhm.u.c(Integer.valueOf(linkedHashMap2.size())), (Style) null, 24), null, null, 0, moneyClause != null ? new RowDelegate.Model.c.b(moneyClause, null, null, false, 126) : null, false, false, null, null, null, null, null, t2Var, new AnalyticsContext(w0VarA2), 0, 0, 0, 0, 1023407980);
                        } else {
                            if (i3 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            List listK = zhm.v.k(new TextLocalisedClause(R$string.transactionUI_transaction_details_spare_change_section_spare_change, null, null, 14), new ImageClause(R$drawable.uikit_icn_20_transaction_badge_spare_change, new ImageClauseTint.Color(R$attr.uikit_colorGreyTone20), (Float) null, (Float) null, 28));
                            m70.a.t(t0.f186434a);
                            model = new InputDisclosureDelegate.Model(str3, new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), new NumberClause(linkedHashMap2.size(), (NumberClause.Format.Compact) null, (Custom) (false ? 1 : 0), 6), t2Var, new AnalyticsContext(w0VarA2), 968);
                        }
                        qv0.i iVar3 = model;
                        yp0.b.l(iVar3, R$attr.uikit_dp16, R$attr.uikit_dp0, 0, 0, null, false, 60);
                        iVar = iVar3;
                    } else {
                        iVar = null;
                    }
                    uVar = new u(iVar, dVarO, linkedHashSet2);
                    dVar = null;
                }
            }
            if (z) {
                arrayList = list;
            } else {
                if (!(hVar instanceof whf.e) && !(hVar instanceof whf.f)) {
                    throw new NoWhenBranchMatchedException();
                }
                arrayList = new ArrayList();
                for (Object obj7 : list) {
                    if (!uVar.f7758c.contains(((a3) obj7).f272579a)) {
                        arrayList.add(obj7);
                    }
                }
            }
            if (!(hVar instanceof whf.f) || !arrayList.isEmpty()) {
                a3 a3Var5 = (a3) d0.b0(list);
                whf.a aVar = transactionsContent.f297648c;
                dj0.d.Companion.getClass();
                dj0.d dVar3 = dj0.d.d;
                dj0.d dVar4 = uVar.f7757b;
                if (Intrinsics.f(dVar4, dVar3)) {
                    dVar4 = dVar;
                }
                if (iVar2.f297641a) {
                    dj0.d dVarA = this.f7761a.a(arrayList, aVar);
                    if (Intrinsics.f(dVarA.f115083b, dVar4 != null ? dVar4.f115083b : dVar)) {
                        dVarA = pyd.c.O(dVarA, dVar4);
                    }
                    dVar2 = dVarA;
                } else {
                    dVar2 = dVar3;
                }
                ?? moneyClause2 = !Intrinsics.f(dVar2, dVar3) ? new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12) : dVar;
                TimeClause timeClause = new TimeClause(a3Var5.f272593h.getMillis(), new TimeClause.Format.Pretty(com.revolut.core.ui_kit.models.q0.ONLY_DATE), null, null, 12);
                DateTime dateTime2 = a3Var5.f272593h;
                Intrinsics.checkNotNullParameter(dateTime2, "<this>");
                Intrinsics.checkNotNullParameter(dateTime2, "<this>");
                LocalDate localDateOf = LocalDate.of(dateTime2.getYear(), dateTime2.getMonthOfYear(), dateTime2.getDayOfMonth());
                Intrinsics.checkNotNullExpressionValue(localDateOf, "run(...)");
                Intrinsics.checkNotNullParameter(localDateOf, "<this>");
                arrayList2.add(new ListSubheaderDelegate.Model(h30.l.s("ITEM_GROUP_DATE_TITLE_LIST_ID_PREFIX_", localDateOf), null, timeClause, null, moneyClause2, null, j0.TRANSPARENT, null, null, false, false, a3Var5, null, R$attr.uikit_dp32, R$attr.uikit_dp16, 0, 0, 13627306));
                ArrayList arrayListB = b(arrayList, qVar, map, itemMapping);
                int i5 = R$attr.uikit_dp0;
                yp0.b.k(arrayListB, i5, i5, 0, 0, 28);
                a0.x(arrayListB, arrayList2);
                qv0.i iVar4 = uVar.f7756a;
                if (iVar4 != null) {
                    arrayList2.add(iVar4);
                }
            }
            groupingType = jVar;
            it10 = it8;
        }
        return arrayList2;
    }

    public final ArrayList d(whf.p transactionsContent, whf.o mappingType, whf.j groupingType, whf.c formattingOptions) {
        whf.m kVar;
        Intrinsics.checkNotNullParameter(transactionsContent, "transactionsContent");
        Intrinsics.checkNotNullParameter(mappingType, "mappingType");
        Intrinsics.checkNotNullParameter(groupingType, "groupingType");
        Intrinsics.checkNotNullParameter(formattingOptions, "formattingOptions");
        int i = v.f7760b[mappingType.ordinal()];
        if (i == 1) {
            kVar = new whf.k(new thf.h(formattingOptions.f297635a, formattingOptions.f297636b, 1));
        } else {
            if (i != 2 && i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            kVar = new whf.l(new thf.k(790, mappingType == whf.o.SWIPE_ITEM, groupingType instanceof whf.i, formattingOptions.f297635a, formattingOptions.f297636b, false));
        }
        return c(transactionsContent, kVar, groupingType);
    }
}
