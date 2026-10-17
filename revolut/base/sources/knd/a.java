package knd;

import com.revolut.data.model.Data;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_single_offer.PlanSingleOfferScreen;
import ip0.m20;
import ip0.nb0;
import ip0.pb0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f186052a;

    public /* synthetic */ a(int i) {
        this.f186052a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        dj0.d dVar;
        he3.l lVar;
        dj0.d dVar2;
        int i = this.f186052a;
        od0.i iVar = od0.i.f224256b;
        int i2 = 0;
        switch (i) {
            case 0:
                dj0.d it8 = (dj0.d) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                od0.i.Companion.getClass();
                return od0.h.a(it8);
            case 1:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, error, h0Var);
                od0.i.Companion.getClass();
                return iVar;
            case 2:
                pcd.s savingsAccount = (pcd.s) obj2;
                Intrinsics.checkNotNullParameter(savingsAccount, "savingsAccount");
                return new dj0.d(savingsAccount.f234885h.f234861c, kii.e.u(savingsAccount, xi0.b.Companion));
            case 3:
                return new dj0.d(0L, (xi0.b) obj2);
            case 4:
                Data it9 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return (g) it9.getContent();
            case 5:
                List salesGroups = (List) obj2;
                Intrinsics.checkNotNullParameter(salesGroups, "salesGroups");
                return new g(zhm.q0.c(new Pair("SALES", salesGroups)), null, zhm.f0.f322471a, null);
            case 6:
                Data it10 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return (g) it10.getContent();
            case 7:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                xi0.b bVar = (xi0.b) pair.f186385a;
                List list = (List) pair.f186386b;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj3 : list) {
                    jia.c cVar = ((jia.a) obj3).f174414a;
                    Object arrayList = linkedHashMap.get(cVar);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(cVar, arrayList);
                    }
                    ((List) arrayList).add(obj3);
                }
                ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    jia.c cVar2 = (jia.c) entry.getKey();
                    List list2 = (List) entry.getValue();
                    List list3 = list2;
                    if (list3.isEmpty()) {
                        dVar = new dj0.d(0L, bVar);
                    } else {
                        dj0.d.Companion.getClass();
                        dj0.d dVarO = dj0.d.e;
                        int i3 = i2;
                        for (Object obj4 : list3) {
                            int i5 = i3 + 1;
                            if (i3 < 0) {
                                zhm.v.s();
                                throw null;
                            }
                            dVarO = i3 == 0 ? ((jia.a) obj4).f174416c : pyd.c.O(dVarO, ((jia.a) obj4).f174416c);
                            i3 = i5;
                        }
                        dVar = dVarO;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it11 = list2.iterator();
                    while (it11.hasNext()) {
                        zhm.a0.x(((jia.a) it11.next()).f174415b, arrayList3);
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Object obj5 : arrayList3) {
                        LocalDate localDateI = jli.b.i(((jia.b) obj5).f174417a);
                        Object arrayList4 = linkedHashMap2.get(localDateI);
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                            linkedHashMap2.put(localDateI, arrayList4);
                        }
                        ((List) arrayList4).add(obj5);
                    }
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(zhm.q0.b(linkedHashMap2.size()));
                    for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                        Object key = entry2.getKey();
                        List list4 = (List) entry2.getValue();
                        List list5 = list4;
                        if (list5.isEmpty()) {
                            dVar2 = new dj0.d(0L, bVar);
                        } else {
                            dj0.d.Companion.getClass();
                            dj0.d dVarO2 = dj0.d.e;
                            int i6 = i2;
                            for (Object obj6 : list5) {
                                int i21 = i6 + 1;
                                if (i6 < 0) {
                                    zhm.v.s();
                                    throw null;
                                }
                                dVarO2 = i6 == 0 ? ((jia.b) obj6).f174419c : pyd.c.O(dVarO2, ((jia.b) obj6).f174419c);
                                i6 = i21;
                            }
                            dVar2 = dVarO2;
                        }
                        long j2 = dVar2.f115082a;
                        Iterator it12 = list4.iterator();
                        int i22 = i2;
                        while (it12.hasNext()) {
                            i22 += ((jia.b) it12.next()).d;
                            i2 = i2;
                        }
                        linkedHashMap3.put(key, new he3.i(j2, i22));
                    }
                    int i32 = i2;
                    String strName = cVar2.name();
                    Intrinsics.checkNotNullParameter(cVar2, "<this>");
                    switch (n1.f186119a[cVar2.ordinal()]) {
                        case 1:
                            lVar = he3.l.PRO_APPLE_PAY;
                            break;
                        case 2:
                            lVar = he3.l.PRO_CARD_READER;
                            break;
                        case 3:
                            lVar = he3.l.PRO_POS;
                            break;
                        case 4:
                            lVar = he3.l.PRO_E_COMMERCE;
                            break;
                        case 5:
                            lVar = he3.l.PRO_INVOICE;
                            break;
                        case 6:
                            lVar = he3.l.PRO_PAYMENT_LINK;
                            break;
                        case 7:
                            lVar = he3.l.PRO_QR_CODE;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    arrayList2.add(new he3.j(strName, dVar, linkedHashMap3, lVar, zhm.f0.f322471a));
                    i2 = i32;
                }
                a aVar = new a(8);
                a aVar2 = new a(9);
                Function1[] function1Arr = new Function1[2];
                function1Arr[i2] = aVar;
                function1Arr[1] = aVar2;
                return zhm.d0.P0(arrayList2, cim.b.a(function1Arr));
            case 8:
                he3.j it13 = (he3.j) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return Integer.valueOf(-it13.e.size());
            case 9:
                he3.j it14 = (he3.j) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return Long.valueOf(-it14.f151564b.f115082a);
            case 10:
                Intrinsics.checkNotNullParameter((xme.e) obj2, "it");
                return Boolean.TRUE;
            case 11:
                String str = (String) obj2;
                KProperty[] kPropertyArr = PlanSingleOfferScreen.U;
                return prk.o.m(str, "it", str, "ID_NAV_BAR_ITEM");
            case 12:
                ggk.d offer = (ggk.d) obj2;
                Intrinsics.checkNotNullParameter(offer, "offer");
                if (offer instanceof ggk.b) {
                    return ((ggk.b) offer).f143702a;
                }
                if (offer instanceof ggk.c) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            case 13:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return null;
            case 14:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return null;
            case 15:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return mmk.e.a();
            case 16:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return null;
            case 17:
                ko7.d updateState = (ko7.d) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return ko7.d.a(updateState, null, new Data(null, null, true, 3, null), null, 13);
            case 18:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return ko7.m.b();
            case 19:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return ko7.m.b();
            case 20:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return new koe.q((List) getDefaultLoadingItems.invoke(), false, false);
            case 21:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return zi0.c.P(kof.d.f186342a, false, null, 3);
            case 22:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return zhm.f0.f322471a;
            case 23:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return zhm.r0.g();
            case 24:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                od0.i.Companion.getClass();
                return iVar;
            case 25:
                CharSequence it15 = (CharSequence) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return it15.toString();
            case 26:
                kl7.g1 it16 = (kl7.g1) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return it16.f185319a;
            case 27:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                aim.e eVarB = zhm.u.b();
                m20 m20Var = new m20("PlanTileLoadingDelegate");
                yp0.b.l(m20Var, 0, 0, 0, 0, null, false, 63);
                eVarB.add(m20Var);
                nb0 nb0Var = pb0.Companion;
                pb0 pb0VarA = nb0.a(nb0Var, "RowLoadingDelegate_1", false, 6);
                yp0.b.l(pb0VarA, 0, 0, 0, 0, null, false, 63);
                eVarB.add(pb0VarA);
                List listK = zhm.v.k(nb0.a(nb0Var, "RowLoadingDelegate_2", false, 6), nb0.a(nb0Var, "RowLoadingDelegate_3", false, 6), nb0.a(nb0Var, "RowLoadingDelegate_4", false, 6));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                eVarB.addAll(listK);
                return new kpb.i(zhm.u.a(eVarB), false);
            case 28:
                kpi.a it17 = (kpi.a) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return Boolean.valueOf(it17.f188247b == -1);
            default:
                kpi.a it18 = (kpi.a) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return Boolean.valueOf(it18.f188247b == 0);
        }
    }

    public /* synthetic */ a(Object obj2, int i) {
        this.f186052a = i;
    }
}
