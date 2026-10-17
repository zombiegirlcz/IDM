package fvk;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.data.model.Data;
import com.revolut.feature.devicemanagement.api.model.UserDevice;
import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import dej.q3;
import dej.r3;
import dej.t1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f138457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f138458b;

    public /* synthetic */ q(List list, int i) {
        this.f138457a = i;
        this.f138458b = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        Object next2;
        io3.k kVar;
        kp3.b cVar;
        Object next3;
        String strE;
        Object next4;
        switch (this.f138457a) {
            case 0:
                return m.f((m) obj2, null, this.f138458b, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048573);
            case 1:
                return m.f((m) obj2, null, null, null, null, null, null, null, null, null, null, null, null, this.f138458b, null, null, null, null, null, null, null, 1044479);
            case 2:
                return m.f((m) obj2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.f138458b, 524287);
            case 3:
                return m.f((m) obj2, null, null, null, null, null, this.f138458b, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048543);
            case 4:
                List list = this.f138458b;
                Intrinsics.h(list);
                return fx5.e.a((fx5.e) obj2, null, list, 1);
            case 5:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list2 = (List) pair.f186385a;
                List list3 = (List) pair.f186386b;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list2) {
                    io3.d dVar = (io3.d) obj3;
                    if (dVar.e == io3.l.CURRENT && ((kVar = dVar.f) == io3.k.ACTIVE || kVar == io3.k.INACTIVE)) {
                        arrayList.add(obj3);
                    }
                }
                List list4 = this.f138458b;
                Intrinsics.h(list4);
                List list5 = list4;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list5, 10));
                Iterator it8 = list5.iterator();
                while (true) {
                    Object next5 = null;
                    if (!it8.hasNext()) {
                        Iterator it9 = arrayList2.iterator();
                        if (it9.hasNext()) {
                            next5 = it9.next();
                            if (it9.hasNext()) {
                                dj0.d dVar2 = (dj0.d) ((Pair) next5).f186386b;
                                long j2 = dVar2 != null ? dVar2.f115082a : 0L;
                                do {
                                    Object next6 = it9.next();
                                    dj0.d dVar3 = (dj0.d) ((Pair) next6).f186386b;
                                    long j3 = dVar3 != null ? dVar3.f115082a : 0L;
                                    if (j2 < j3) {
                                        next5 = next6;
                                        j2 = j3;
                                    }
                                } while (it9.hasNext());
                            }
                        }
                        return (Pair) next5;
                    }
                    xi0.b bVar = (xi0.b) it8.next();
                    Iterator it10 = arrayList.iterator();
                    while (true) {
                        if (it10.hasNext()) {
                            next = it10.next();
                            if (Intrinsics.f(((io3.d) next).f163147c, bVar.f306286a)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    io3.d dVar4 = (io3.d) next;
                    dj0.d dVar5 = dVar4 != null ? new dj0.d(dVar4.i, bVar) : null;
                    Iterator it11 = list3.iterator();
                    while (true) {
                        if (it11.hasNext()) {
                            next2 = it11.next();
                            if (Intrinsics.f(((qta.c) next2).f249046a, bVar)) {
                            }
                        } else {
                            next2 = null;
                        }
                    }
                    qta.c cVar2 = (qta.c) next2;
                    n9l.a aVarF0 = cVar2 != null ? ofm.q.f0(cVar2) : null;
                    if (dVar5 != null && dVar5.f115082a != 0 && aVarF0 != null) {
                        next5 = pyd.c.K(dVar5, aVarF0.f213663c, aVarF0.f213662b);
                    }
                    arrayList2.add(new Pair(bVar, next5));
                }
                break;
            case 6:
                g42.a aVar = (g42.a) obj2;
                Data termsData = zi0.c.P(this.f138458b, false, null, 3);
                int i = aVar.f140321b;
                Clause clause = aVar.f140322c;
                Clause clause2 = aVar.d;
                Intrinsics.checkNotNullParameter(termsData, "termsData");
                return new g42.a(termsData, i, clause, clause2);
            case 7:
                return g7b.n.a((g7b.n) obj2, null, null, this.f138458b, false, 11);
            case 8:
                return g8i.r.a((g8i.r) obj2, null, false, null, null, null, null, this.f138458b, 2047);
            case 9:
                return gc1.j.a((gc1.j) obj2, null, this.f138458b, 1);
            case 10:
                gd2.e eVar = (gd2.e) obj2;
                List list6 = this.f138458b;
                List list7 = list6;
                ArrayList arrayList3 = new ArrayList(zhm.w.t(list7, 10));
                Iterator it12 = list7.iterator();
                while (it12.hasNext()) {
                    arrayList3.add(((g02.a) it12.next()).f139251b);
                }
                return gd2.e.a(eVar, list6, arrayList3, 2);
            case 11:
                gk7.f updateState = (gk7.f) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return gk7.f.a(updateState, null, this.f138458b, null, null, 13);
            case 12:
                return god.a.a((god.a) obj2, this.f138458b, null, null, null, 14);
            case 13:
                ((gq1.h) obj2).getClass();
                List forms = this.f138458b;
                Intrinsics.checkNotNullParameter(forms, "forms");
                return new gq1.h(forms);
            case 14:
                io3.d it13 = (io3.d) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return Boolean.valueOf(this.f138458b.contains(it13.e));
            case 15:
                return h2j.i.e((h2j.i) obj2, null, null, null, null, null, null, null, null, this.f138458b, null, null, 7167);
            case 16:
                return h3b.j.a((h3b.j) obj2, null, null, this.f138458b, null, 11);
            case 17:
                ArrayList arrayList4 = new ArrayList();
                for (Object obj4 : (List) obj2) {
                    if (!this.f138458b.contains(((qua.p) obj4).f249314a.f160150a)) {
                        arrayList4.add(obj4);
                    }
                }
                return arrayList4;
            case 18:
                ((h5g.b) obj2).getClass();
                List bookings = this.f138458b;
                Intrinsics.checkNotNullParameter(bookings, "bookings");
                return new h5g.b(bookings);
            case 19:
                List instruments = (List) obj2;
                Intrinsics.checkNotNullParameter(instruments, "instruments");
                List<iel.i> list8 = this.f138458b;
                ArrayList arrayList5 = new ArrayList();
                for (iel.i iVar : list8) {
                    if (iVar instanceof iel.a) {
                        Iterator it14 = instruments.iterator();
                        while (true) {
                            cVar = null;
                            if (it14.hasNext()) {
                                next3 = it14.next();
                                if (Intrinsics.f(((nel.n) next3).f214596b, ((iel.a) iVar).i())) {
                                }
                            } else {
                                next3 = null;
                            }
                        }
                        nel.n nVar = (nel.n) next3;
                        if (nVar != null) {
                            String str = nVar.d;
                            iel.a aVar2 = (iel.a) iVar;
                            if (io3.h.i(nVar.f214597c) && (strE = ifk.b.e(nVar)) != null) {
                                str = strE;
                            }
                            cVar = new kp3.a(aVar2, str);
                        }
                    } else {
                        cVar = new kp3.c(iVar);
                    }
                    if (cVar != null) {
                        arrayList5.add(cVar);
                    }
                }
                return arrayList5;
            case 20:
                return hbf.i.a((hbf.i) obj2, null, null, null, this.f138458b, false, false, 55);
            case 21:
                return hfh.d.a((hfh.d) obj2, null, this.f138458b, 1);
            case 22:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                Map map = (Map) pair2.f186385a;
                List<EsimGiftRecipient> list9 = (List) pair2.f186386b;
                List list10 = this.f138458b;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj5 : list10) {
                    String str2 = ((t1) obj5).e.f;
                    Object objO = linkedHashMap.get(str2);
                    if (objO == null) {
                        objO = v0.a.o(linkedHashMap, str2);
                    }
                    ((List) objO).add(obj5);
                }
                aim.f builder = new aim.f();
                for (Map.Entry entry : map.entrySet()) {
                    UserDevice userDevice = (UserDevice) entry.getKey();
                    List list11 = (List) entry.getValue();
                    q3 q3Var = new q3(userDevice);
                    ArrayList arrayList6 = new ArrayList();
                    for (Object obj6 : list11) {
                        if (((t1) obj6).e.f == null) {
                            arrayList6.add(obj6);
                        }
                    }
                    builder.put(q3Var, arrayList6);
                }
                for (EsimGiftRecipient esimGiftRecipient : list9) {
                    String str3 = esimGiftRecipient.f100269b;
                    if (str3 == null) {
                        str3 = esimGiftRecipient.f100270c;
                    }
                    Collection collection = (List) linkedHashMap.get(str3);
                    if (collection == null) {
                        collection = f0.f322471a;
                    }
                    if (!collection.isEmpty()) {
                        builder.put(new r3(esimGiftRecipient), collection);
                    }
                }
                Intrinsics.checkNotNullParameter(builder, "builder");
                return builder.b();
            case 23:
                List taxCertifications = (List) obj2;
                Intrinsics.checkNotNullParameter(taxCertifications, "taxCertifications");
                List list12 = this.f138458b;
                ArrayList arrayList7 = new ArrayList();
                Iterator it15 = list12.iterator();
                while (true) {
                    Object obj7 = null;
                    if (!it15.hasNext()) {
                        return zi0.c.P(arrayList7, false, null, 3);
                    }
                    Object next7 = it15.next();
                    zme.f fVar = (zme.f) next7;
                    Iterator it16 = taxCertifications.iterator();
                    while (true) {
                        if (it16.hasNext()) {
                            Object next8 = it16.next();
                            zme.d dVar6 = (zme.d) next8;
                            if (dVar6.f323479a.equals(fVar.f323482a) && Intrinsics.f(dVar6.f323481c, "JUSTIFIED_EXEMPTION")) {
                                obj7 = next8;
                            }
                        }
                    }
                    if (((zme.d) obj7) == null) {
                        arrayList7.add(next7);
                    }
                }
                break;
            case 24:
                ((hq1.d) obj2).getClass();
                List forms2 = this.f138458b;
                Intrinsics.checkNotNullParameter(forms2, "forms");
                return new hq1.d(forms2);
            case 25:
                List filteredPockets = (List) obj2;
                Intrinsics.checkNotNullParameter(filteredPockets, "filteredPockets");
                List list13 = filteredPockets;
                ArrayList arrayList8 = new ArrayList(zhm.w.t(list13, 10));
                Iterator it17 = list13.iterator();
                while (it17.hasNext()) {
                    arrayList8.add(((io3.d) it17.next()).f163145a);
                }
                Set setI1 = d0.i1(arrayList8);
                List<Pair> list14 = this.f138458b;
                ArrayList arrayList9 = new ArrayList(zhm.w.t(list14, 10));
                for (Pair pair3 : list14) {
                    fo3.c cVar3 = (fo3.c) pair3.f186385a;
                    List list15 = (List) pair3.f186386b;
                    ArrayList arrayList10 = new ArrayList();
                    for (Object obj8 : list15) {
                        if (setI1.contains(((io3.d) obj8).f163145a)) {
                            arrayList10.add(obj8);
                        }
                    }
                    arrayList9.add(new Pair(cVar3, arrayList10));
                }
                return arrayList9;
            case 26:
                return hud.i.a((hud.i) obj2, null, null, null, null, null, this.f138458b, null, 1535);
            case 27:
                return hui.k.a((hui.k) obj2, null, null, null, null, null, this.f138458b, null, 95);
            case 28:
                List tickers = (List) obj2;
                Intrinsics.checkNotNullParameter(tickers, "tickers");
                List<fvg.c> list16 = this.f138458b;
                ArrayList arrayList11 = new ArrayList();
                for (fvg.c cVar4 : list16) {
                    Iterator it18 = tickers.iterator();
                    while (true) {
                        if (it18.hasNext()) {
                            next4 = it18.next();
                            if (Intrinsics.f(((InstrumentTicker) next4).f105112b, cVar4.f138421a)) {
                            }
                        } else {
                            next4 = null;
                        }
                    }
                    InstrumentTicker instrumentTicker = (InstrumentTicker) next4;
                    lwg.a aVar3 = instrumentTicker != null ? new lwg.a(cVar4.f138421a, instrumentTicker.f105113c, cVar4.f138422b) : null;
                    if (aVar3 != null) {
                        arrayList11.add(aVar3);
                    }
                }
                return arrayList11;
            default:
                hyh.c cVar5 = (hyh.c) obj2;
                String selectedPagerItemId = cVar5.f156876a;
                cVar5.getClass();
                Intrinsics.checkNotNullParameter(selectedPagerItemId, "selectedPagerItemId");
                List pagerItems = this.f138458b;
                Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
                return new hyh.c(selectedPagerItemId, pagerItems);
        }
    }

    public /* synthetic */ q(r10.d dVar, List list) {
        this.f138457a = 22;
        this.f138458b = list;
    }
}
