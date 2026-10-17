package li8;

import com.revolut.data.model.Data;
import com.revolut.feature.acquiring.card_reader.data.api.domain.model.PairingInfo;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.OfferV2FlowContract$OfferUpdateContext;
import com.revolut.feature.travel.flights.models.domain.itinerary.PassengerRequirement;
import com.revolut.feature.travel.flights.models.domain.itinerary.RequiredPassengerField;
import com.revolut.feature.travel.flights.models.domain.offer_details.TravelFlightsOfferDetails;
import com.revolut.retail.feature.api.AnalyticsAccount;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.EsimMobilePlanSubscriptionFlowContract$Step;
import efm.r;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import lu6.p;
import m6g.q;
import ma1.x;
import org.jmrtd.lds.LDSFile;
import p6g.a0;
import p6g.u;
import vkm.j2;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f195437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f195438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f195439c;
    public final /* synthetic */ Object d;

    public /* synthetic */ n(Data data, com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.personal_details.c cVar, Data data2) {
        this.f195437a = 0;
        this.f195438b = data;
        this.d = cVar;
        this.f195439c = data2;
    }

    private final Object a(Object obj2) {
        ArrayList arrayList;
        Set set;
        Set set2 = (Set) this.f195438b;
        m3d.f fVar = (m3d.f) this.f195439c;
        Set set3 = (Set) this.d;
        e7l.f config = (e7l.f) obj2;
        Intrinsics.checkNotNullParameter(config, "config");
        LinkedHashSet linkedHashSet = config.M;
        Set set4 = config.T;
        ArrayList arrayList2 = new ArrayList(w.t(set4, 10));
        Iterator it8 = set4.iterator();
        while (it8.hasNext()) {
            arrayList2.add(((xi0.b) it8.next()).f306286a);
        }
        List list = config.P0;
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(w.t(list2, 10));
            Iterator it9 = list2.iterator();
            while (it9.hasNext()) {
                arrayList.add(((e7l.h) it9.next()).f123408a.f306286a);
            }
        } else {
            arrayList = null;
        }
        Collection[] elements = {linkedHashSet, arrayList2, arrayList};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set setI1 = d0.i1(w.u(kotlin.collections.d.L(elements)));
        Intrinsics.h(set2);
        fVar.getClass();
        if (set3.equals(set2)) {
            set = setI1;
        } else {
            y1d.b.Companion.getClass();
            boolean zContains = set2.contains(y1d.a.f310358b);
            boolean zContains2 = set2.contains(y1d.a.f310359c);
            boolean zContains3 = set2.contains(y1d.a.d);
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : setI1) {
                xi0.b.Companion.getClass();
                xi0.b bVarA = xi0.a.a((String) obj3);
                if (!cp5.d.A(bVarA) || zContains) {
                    if (!cp5.d.z(bVarA) || zContains2) {
                        if (!cp5.d.y(bVarA) || zContains3) {
                            arrayList3.add(obj3);
                        }
                    }
                }
            }
            set = arrayList3;
        }
        y1d.b.Companion.getClass();
        Set setC = set2.contains(y1d.a.f310358b) ? fVar.f202370b.c(td0.a.LISTED) : null;
        if (setC == null) {
            setC = h0.f322473a;
        }
        return d0.j1(setC, set);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r5v21, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v2, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v9 */
    private final Object b(Object obj2) {
        ?? arrayList;
        Object next;
        LocalDate localDate;
        String str;
        String str2;
        List list;
        Object next2;
        com.revolut.feature.travel.flights.impl.ui.screen.passengers_details.a aVar = (com.revolut.feature.travel.flights.impl.ui.screen.passengers_details.a) this.d;
        Data data = (Data) this.f195438b;
        Data data2 = (Data) this.f195439c;
        m6g.i update = (m6g.i) obj2;
        Intrinsics.checkNotNullParameter(update, "$this$update");
        Object obj3 = aVar.C;
        TravelFlightsOfferDetails travelFlightsOfferDetails = (TravelFlightsOfferDetails) data.getContent();
        if (travelFlightsOfferDetails == null || (list = travelFlightsOfferDetails.d) == null) {
            arrayList = f0.f322471a;
        } else {
            ArrayList<PassengerRequirement> arrayList2 = new ArrayList();
            for (Object obj4 : list) {
                if (((PassengerRequirement) obj4).f93513b != m7g.j.UNKNOWN) {
                    arrayList2.add(obj4);
                }
            }
            arrayList = new ArrayList(w.t(arrayList2, 10));
            ?? r56 = obj3;
            for (PassengerRequirement passengerRequirement : arrayList2) {
                Iterator it8 = com.revolut.feature.travel.flights.impl.ui.screen.passengers_details.a.I2(r56).iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it8.next();
                    if (Intrinsics.f(((m6g.n) next2).f203100a, passengerRequirement.f93512a)) {
                        break;
                    }
                }
                m6g.n nVar = (m6g.n) next2;
                String str3 = passengerRequirement.f93512a;
                m7g.j jVar = passengerRequirement.f93513b;
                ArrayList<RequiredPassengerField> arrayList3 = passengerRequirement.f93514c;
                ArrayList arrayList4 = new ArrayList();
                ?? r59 = r56;
                for (RequiredPassengerField requiredPassengerField : arrayList3) {
                    o6g.d dVar = aVar.f93365p;
                    ?? r172 = r59;
                    cam.f gVar = q.f203108a[requiredPassengerField.f93515a.ordinal()] == 3 ? new o6g.g(passengerRequirement.f93512a, passengerRequirement.f93513b, ((m6g.i) ((j2) aVar.D.f22677a).getValue()).f203093a, nVar != null ? nVar.f203102c : null, null) : new o6g.f(passengerRequirement.f93512a, requiredPassengerField.f93515a);
                    dVar.getClass();
                    p6g.w wVarA = o6g.d.a(gVar);
                    if (wVarA != null) {
                        arrayList4.add(wVarA);
                    }
                    r59 = r172;
                }
                arrayList.add(new a0(str3, jVar, arrayList4));
                r56 = r59;
            }
        }
        do3.n nVar2 = (do3.n) data2.getContent();
        int i = 1;
        ?? r62 = arrayList;
        if (nVar2 != null) {
            String str4 = nVar2.f116410c;
            String str5 = nVar2.e;
            r62 = arrayList;
            if (str4 != null || str5 != null) {
                Iterable iterable = (Iterable) arrayList;
                ArrayList arrayList5 = new ArrayList(w.t(iterable, 10));
                int i2 = 0;
                for (Object obj5 : iterable) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        v.s();
                        throw null;
                    }
                    a0 a0VarA = (a0) obj5;
                    if (i2 > 0) {
                        str = str5;
                    } else {
                        ArrayList<p6g.w> arrayList6 = a0VarA.f233268c;
                        ArrayList arrayList7 = new ArrayList(w.t(arrayList6, 10));
                        for (p6g.w wVar : arrayList6) {
                            int i5 = q.f203108a[wVar.a().ordinal()];
                            if (i5 == i) {
                                str2 = str5;
                                if (str4 != null) {
                                    p6g.v vVarG = wVar instanceof p6g.v ? (p6g.v) wVar : null;
                                    if (vVarG == null) {
                                        vVarG = null;
                                    } else if (vVarG.d == null) {
                                        p6g.v vVarG2 = p6g.v.g(vVarG, new u(str4), null, LDSFile.EF_SOD_TAG);
                                        vVarG = p6g.v.g(vVarG2, null, aVar.K2(vVarG2), 95);
                                    }
                                    if (vVarG != null) {
                                        wVar = vVarG;
                                    }
                                }
                            } else if (i5 == 2 && str5 != null) {
                                p6g.v vVarG3 = wVar instanceof p6g.v ? (p6g.v) wVar : null;
                                if (vVarG3 == null) {
                                    str2 = str5;
                                    vVarG3 = null;
                                } else if (vVarG3.d == null) {
                                    str2 = str5;
                                    p6g.v vVarG4 = p6g.v.g(vVarG3, new u(str5), null, LDSFile.EF_SOD_TAG);
                                    vVarG3 = p6g.v.g(vVarG4, null, aVar.K2(vVarG4), 95);
                                } else {
                                    str2 = str5;
                                }
                                if (vVarG3 != null) {
                                    wVar = vVarG3;
                                }
                            } else {
                                str2 = str5;
                            }
                            arrayList7.add(wVar);
                            str5 = str2;
                            i = 1;
                        }
                        str = str5;
                        a0VarA = a0.a(a0VarA, arrayList7);
                    }
                    arrayList5.add(a0VarA);
                    i2 = i3;
                    str5 = str;
                    i = 1;
                }
                r62 = arrayList5;
            }
        }
        ?? r06 = aVar.C;
        Iterable<a0> iterable2 = (Iterable) r62;
        ArrayList arrayList8 = new ArrayList(w.t(iterable2, 10));
        for (a0 a0VarA2 : iterable2) {
            ArrayList arrayList9 = a0VarA2.f233268c;
            if (!arrayList9.isEmpty()) {
                Iterator it9 = arrayList9.iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        break;
                    }
                    p6g.w wVar2 = (p6g.w) it9.next();
                    if (wVar2.a() == p7g.b.DATE_OF_BIRTH && (wVar2 instanceof p6g.n) && ((p6g.n) wVar2).d == null) {
                        Iterator it10 = com.revolut.feature.travel.flights.impl.ui.screen.passengers_details.a.I2(r06).iterator();
                        while (true) {
                            if (!it10.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it10.next();
                            if (Intrinsics.f(((m6g.n) next).f203100a, a0VarA2.f233266a)) {
                                break;
                            }
                        }
                        m6g.n nVar3 = (m6g.n) next;
                        if (nVar3 == null || (localDate = nVar3.f203102c) == null) {
                            break;
                        }
                        ArrayList<p6g.w> arrayList10 = a0VarA2.f233268c;
                        ArrayList arrayList11 = new ArrayList(w.t(arrayList10, 10));
                        for (p6g.w wVarG : arrayList10) {
                            if (wVarG.a() == p7g.b.DATE_OF_BIRTH && (wVarG instanceof p6g.n) && ((p6g.n) wVarG).d == null) {
                                p6g.n nVarG = p6g.n.g((p6g.n) wVarG, new p6g.k(localDate), null, 55);
                                wVarG = p6g.n.g(nVarG, null, aVar.K2(nVarG), 31);
                            }
                            arrayList11.add(wVarG);
                        }
                        a0VarA2 = a0.a(a0VarA2, arrayList11);
                    }
                }
            }
            arrayList8.add(a0VarA2);
        }
        return m6g.i.a(update, arrayList8, data2, data, 1);
    }

    private final Object c(Object obj2) {
        x xVar = (x) this.f195438b;
        dj0.d totalAmount = (dj0.d) this.f195439c;
        Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.d;
        String orderId = (String) obj2;
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        sa1.u uVar = xVar.f203913a;
        ha1.f fVar = (ha1.f) xVar.d;
        PairingInfo pairingInfoC = fVar.c();
        List list = pairingInfoC != null ? pairingInfoC.f60567b : null;
        if (list == null) {
            throw new IllegalArgumentException("Plain EMV tags are required");
        }
        PairingInfo pairingInfoC2 = fVar.c();
        List list2 = pairingInfoC2 != null ? pairingInfoC2.f60568c : null;
        if (list2 == null) {
            throw new IllegalArgumentException("Secured EMV tags are required");
        }
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        List plainEmvTags = list;
        List securedEmvTags = list2;
        lal.a authorizationDelegate = new lal.a(xVar, orderId);
        sa1.v vVar = (sa1.v) uVar;
        vVar.getClass();
        Intrinsics.checkNotNullParameter(totalAmount, "totalAmount");
        Intrinsics.checkNotNullParameter(plainEmvTags, "plainEmvTags");
        Intrinsics.checkNotNullParameter(securedEmvTags, "securedEmvTags");
        Intrinsics.checkNotNullParameter(authorizationDelegate, "authorizationDelegate");
        vVar.f261259b = new ihm.f();
        r rVarCreate = r.create(new q6.c(vVar, totalAmount, plainEmvTags, securedEmvTags, authorizationDelegate));
        Intrinsics.checkNotNullExpressionValue(rVarCreate, "create(...)");
        ihm.f fVar2 = vVar.f261259b;
        Intrinsics.h(fVar2);
        r rVarStartWith = fVar2.startWith(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
        r map = te0.w.l(rVarCreate, rVarStartWith).map(new s65.o(new s8h.h(13), 26));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map.doOnSubscribe(new ma1.v(4, new p(orderId, 15))).doOnNext(new m78.e(new b79.i(ref$ObjectRef, 7), 28)).flatMap(new m78.e(new lul.d(xVar, orderId, 28), 29)).doFinally(new ly2.d(orderId, 6, ref$ObjectRef, xVar));
    }

    private final Object d(Object obj2) {
        String str = (String) this.f195438b;
        dmd.b bVar = ((mc7.d) this.f195439c).d;
        AnalyticsAccount analyticsAccount = (AnalyticsAccount) this.d;
        Pair pair = (Pair) obj2;
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        yld.e eVar = (yld.e) pair.f186385a;
        od0.i iVar = (od0.i) pair.f186386b;
        yld.a aVar = eVar.f314693b;
        if (Intrinsics.f(str, "AnalyticsSmall")) {
            he3.p pVar = eVar.f314692a;
            qzi.h hVar = (qzi.h) iVar.f224257a;
            qzi.g gVar = hVar != null ? hVar.f250656c : null;
            Intrinsics.h(analyticsAccount);
            return ((end.a) bVar).b(aVar, pVar, gVar, analyticsAccount, dmd.a.NEGATIVE_SURPLUS_TREND);
        }
        if (!Intrinsics.f(str, "AnalyticsMedium")) {
            throw new IllegalArgumentException(j6.a.q("Unknown analytics widget type ", str));
        }
        he3.p pVar2 = eVar.f314692a;
        qzi.h hVar2 = (qzi.h) iVar.f224257a;
        qzi.g gVar2 = hVar2 != null ? hVar2.f250656c : null;
        Intrinsics.h(analyticsAccount);
        return ((end.a) bVar).a(aVar, pVar2, gVar2, analyticsAccount, dmd.a.NEGATIVE_SURPLUS_TREND);
    }

    private final Object e(Object obj2) {
        com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.g gVar = (com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.g) this.f195438b;
        OfferV2FlowContract$OfferUpdateContext offerV2FlowContract$OfferUpdateContext = (OfferV2FlowContract$OfferUpdateContext) this.f195439c;
        hu3.a aVar = (hu3.a) this.d;
        yf4.f outputData = (yf4.f) obj2;
        Intrinsics.checkNotNullParameter(outputData, "outputData");
        if (outputData == null) {
            throw new NoWhenBranchMatchedException();
        }
        gVar.l2(new km2.n(27, gVar, offerV2FlowContract$OfferUpdateContext, aVar, outputData, (Continuation) null), new yi5.b(26));
        return Unit.f186387a;
    }

    private final Object g(Object obj2) {
        com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.b bVar = (com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.b) this.f195438b;
        yki.l lVar = (yki.l) this.f195439c;
        EsimMobilePlanSubscriptionFlowContract$Step esimMobilePlanSubscriptionFlowContract$Step = (EsimMobilePlanSubscriptionFlowContract$Step) this.d;
        pkj.h result = (pkj.h) obj2;
        Intrinsics.checkNotNullParameter(result, "result");
        if (!(result instanceof pkj.g)) {
            throw new NoWhenBranchMatchedException();
        }
        EsimMobilePlanSubscriptionFlowContract$Step.NumberTransferCreation numberTransferCreation = (EsimMobilePlanSubscriptionFlowContract$Step.NumberTransferCreation) esimMobilePlanSubscriptionFlowContract$Step;
        pkj.g gVar = (pkj.g) result;
        oki.h.t2(bVar, lVar, new EsimMobilePlanSubscriptionFlowContract$Step.NumberTransferConfirmation(numberTransferCreation.f100846a, gVar.f237201a, numberTransferCreation.f100848c, gVar.f237202b), true, null, false, 12);
        return Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:256:0x07af  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x07c6  */
    /* JADX WARN: Removed duplicated region for block: B:450:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r31) {
        /*
            Method dump skipped, instruction units count: 3610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: li8.n.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ n(com.revolut.feature.travel.flights.impl.ui.screen.passengers_details.a aVar, Data data, Data data2) {
        this.f195437a = 21;
        this.d = aVar;
        this.f195438b = data;
        this.f195439c = data2;
    }

    public /* synthetic */ n(Object obj2, int i, Object obj3, Object obj4) {
        this.f195437a = i;
        this.f195438b = obj2;
        this.f195439c = obj3;
        this.d = obj4;
    }

    public /* synthetic */ n(Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f195437a = i;
        this.f195438b = obj3;
        this.f195439c = obj4;
        this.d = obj5;
    }
}
