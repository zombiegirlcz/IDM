package et6;

import com.revolut.data.model.Data;
import com.revolut.feature.freelancer.common.models.FreelancerAccountDetails;
import com.revolut.feature.freelancer.common.models.FreelancerAccountOnboardingState;
import com.revolut.feature.freelancer.common.models.FreelancerCashbackRates;
import com.revolut.feature.freelancer.common.models.FreelancerPermissions;
import com.revolut.feature.freelancer.common.models.FreelancerProfileSettings;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceSettings;
import com.revolut.feature.freelancer.common.models.invoices.InvoiceMethodsDetails;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f129359a;

    public /* synthetic */ w(int i) {
        this.f129359a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        k6d.f fVar;
        BigDecimal value;
        Object next;
        Object next2;
        rr6.d dVar;
        Object next3;
        Object next4;
        sr6.i iVar;
        int i = this.f129359a;
        boolean z = true;
        od0.i iVar2 = od0.i.f224256b;
        lr6.d dVar2 = null;
        od0.i iVarA = null;
        value = null;
        BigDecimal value2 = null;
        dVar = null;
        rr6.d dVar3 = null;
        switch (i) {
            case 0:
                pr6.g it8 = (pr6.g) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                od0.i.Companion.getClass();
                return od0.h.a(it8);
            case 1:
                Set it9 = (Set) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return zi0.c.P(it9, false, null, 3);
            case 2:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                FreelancerAccountOnboardingState freelancerAccountOnboardingState = (FreelancerAccountOnboardingState) pair.f186385a;
                if (!(freelancerAccountOnboardingState instanceof FreelancerAccountOnboardingState.Onboarded)) {
                    if (!(freelancerAccountOnboardingState instanceof FreelancerAccountOnboardingState.NotOnboarded) && !(freelancerAccountOnboardingState instanceof FreelancerAccountOnboardingState.Pending)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    od0.i.Companion.getClass();
                    return iVar2;
                }
                FreelancerPermissions freelancerPermissions = ((FreelancerAccountOnboardingState.Onboarded) freelancerAccountOnboardingState).f73273a.f73270b;
                od0.h hVar = od0.i.Companion;
                if (com.revolut.feature.freelancer.common.models.a.c(freelancerAccountOnboardingState)) {
                    dVar2 = lr6.d.ACCOUNT_CLOSED_MANUALLY;
                } else {
                    boolean z3 = freelancerPermissions.f73321a;
                    boolean z4 = freelancerPermissions.f73322b;
                    if (z3) {
                        boolean z6 = freelancerPermissions.f73323c;
                        if (!z6 && !z4) {
                            dVar2 = lr6.d.INBOUND_OUTBOUND_BLOCKED;
                        } else if (!z6) {
                            dVar2 = lr6.d.INBOUND_BLOCKED;
                        } else if (!z4) {
                            dVar2 = lr6.d.OUTBOUND_BLOCKED;
                        }
                    } else {
                        dVar2 = lr6.d.ACCOUNT_CLOSED;
                    }
                }
                hVar.getClass();
                return od0.h.a(dVar2);
            case 3:
                List settingsList = (List) obj2;
                Intrinsics.checkNotNullParameter(settingsList, "settingsList");
                List list = settingsList;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                Iterator it10 = list.iterator();
                while (it10.hasNext()) {
                    lr6.d0 d0Var = ((lr6.f) it10.next()).f199400a;
                    Object obj3 = ft6.f.f137943a;
                    Intrinsics.checkNotNullParameter(d0Var, "<this>");
                    switch (ft6.e.f137942a[d0Var.ordinal()]) {
                        case 1:
                            fVar = k6d.f.CARD;
                            break;
                        case 2:
                            fVar = k6d.f.CARD_PRESENT;
                            break;
                        case 3:
                            fVar = k6d.f.BANK_TRANSFER;
                            break;
                        case 4:
                            fVar = k6d.f.GOOGLE_PAY;
                            break;
                        case 5:
                            fVar = k6d.f.APPLE_PAY;
                            break;
                        case 6:
                            fVar = k6d.f.OPEN_BANKING;
                            break;
                        case 7:
                            fVar = k6d.f.PAY_WITH_REVOLUT;
                            break;
                        case 8:
                            fVar = k6d.f.CLICK_TO_PAY;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    arrayList.add(fVar);
                }
                return arrayList;
            case 4:
                FreelancerProfileSettings settings = (FreelancerProfileSettings) obj2;
                Intrinsics.checkNotNullParameter(settings, "settings");
                String str = settings.f73325b;
                m70.a.c(kotlin.jvm.internal.t0.f186434a);
                String str2 = settings.d;
                if (str2 == null) {
                    str2 = "";
                }
                return new k6d.j(str, str2, settings.f73326c);
            case 5:
                rr6.g boosterInfo = (rr6.g) obj2;
                Intrinsics.checkNotNullParameter(boosterInfo, "boosterInfo");
                od0.h hVar2 = od0.i.Companion;
                Double d = boosterInfo.f256708c;
                if (d == null || (value = BigDecimal.valueOf(d.doubleValue())) == null) {
                    value = BigDecimal.ZERO;
                }
                Intrinsics.h(value);
                Intrinsics.checkNotNullParameter(value, "value");
                rr6.o oVar = new rr6.o(value);
                hVar2.getClass();
                return od0.h.a(oVar);
            case 6:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                od0.i.Companion.getClass();
                return iVar2;
            case 7:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                rr6.h hVar3 = (rr6.h) pair2.f186385a;
                rr6.a aVar = (rr6.a) pair2.f186386b;
                ArrayList arrayList2 = aVar.f256696a;
                dj0.d dVar4 = aVar.f256698c;
                Iterator it11 = arrayList2.iterator();
                while (true) {
                    if (it11.hasNext()) {
                        next = it11.next();
                        if (((rr6.i) next).f256711a == hVar3.f256710b.f256727a) {
                        }
                    } else {
                        next = null;
                    }
                }
                rr6.i iVar3 = (rr6.i) next;
                if (iVar3 == null) {
                    throw new NullPointerException("Next tier does not exist.");
                }
                rr6.l lVar = hVar3.f256709a;
                if (lVar != null) {
                    Iterator it12 = aVar.f256696a.iterator();
                    while (true) {
                        if (it12.hasNext()) {
                            next2 = it12.next();
                            if (((rr6.i) next2).f256711a == lVar.f256719a) {
                            }
                        } else {
                            next2 = null;
                        }
                    }
                    rr6.i iVar4 = (rr6.i) next2;
                    if (iVar4 != null) {
                        dVar3 = new rr6.d(iVar4, lVar.f256720b);
                    }
                }
                return new rr6.g(new rr6.f(dVar3, new rr6.e(iVar3, hVar3.f256710b.f256728b, (dj0.d) cim.c.k(pyd.c.H(iVar3.f256713c, dVar4), new dj0.d(0L, dVar4.f115083b)))), aVar);
            case 8:
                rr6.g boosterInfo2 = (rr6.g) obj2;
                Intrinsics.checkNotNullParameter(boosterInfo2, "boosterInfo");
                od0.i.Companion.getClass();
                return od0.h.a(boosterInfo2);
            case 9:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                od0.i.Companion.getClass();
                return iVar2;
            case 10:
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                BigDecimal value3 = ((rr6.o) pair3.f186385a).getValue();
                rr6.g gVar = (rr6.g) ((od0.i) pair3.f186386b).g();
                if (gVar != null && (dVar = gVar.f256706a.f256704a) != null) {
                    double d5 = dVar.f256699a.f256712b;
                    rr6.o.INSTANCE.getClass();
                    value2 = BigDecimal.valueOf(d5);
                    Intrinsics.checkNotNullExpressionValue(value2, "valueOf(...)");
                    Intrinsics.checkNotNullParameter(value2, "value");
                }
                return new rr6.m(value3, value2);
            case 11:
                Pair pair4 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair4, "<destruct>");
                hha.d dVar5 = (hha.d) pair4.f186385a;
                return new rr6.n(y0.a((FreelancerCashbackRates) pair4.f186386b, dVar5.f152289c), dVar5);
            case 12:
                Pair pair5 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair5, "<destruct>");
                List list2 = (List) pair5.f186385a;
                FreelancerCashbackRates freelancerCashbackRates = (FreelancerCashbackRates) pair5.f186386b;
                BigDecimal bigDecimal = freelancerCashbackRates.f73280b;
                LinkedHashMap linkedHashMap = freelancerCashbackRates.f73279a;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    String str3 = (String) entry.getKey();
                    List list3 = list2;
                    if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                        Iterator it13 = list3.iterator();
                        while (true) {
                            if (it13.hasNext()) {
                                hha.d dVar6 = (hha.d) it13.next();
                                if (Intrinsics.f(dVar6.f152289c, str3) && dVar6.k == hha.g0.AVAILABLE) {
                                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                                }
                            }
                        }
                    }
                }
                Iterator it14 = linkedHashMap2.entrySet().iterator();
                if (it14.hasNext()) {
                    next3 = it14.next();
                    if (it14.hasNext()) {
                        BigDecimal bigDecimal2 = (BigDecimal) ((Map.Entry) next3).getValue();
                        do {
                            Object next5 = it14.next();
                            BigDecimal bigDecimal3 = (BigDecimal) ((Map.Entry) next5).getValue();
                            if (bigDecimal2.compareTo(bigDecimal3) < 0) {
                                next3 = next5;
                                bigDecimal2 = bigDecimal3;
                            }
                        } while (it14.hasNext());
                    }
                } else {
                    next3 = null;
                }
                Map.Entry entry2 = (Map.Entry) next3;
                BigDecimal bigDecimal4 = entry2 != null ? (BigDecimal) entry2.getValue() : null;
                if (bigDecimal != null || bigDecimal4 != null) {
                    if (bigDecimal == null) {
                        bigDecimal = BigDecimal.ZERO;
                    }
                    Intrinsics.h(bigDecimal);
                    if (bigDecimal4 == null) {
                        bigDecimal4 = BigDecimal.ZERO;
                    }
                    Intrinsics.h(bigDecimal4);
                    BigDecimal value4 = (BigDecimal) cim.c.k(bigDecimal, bigDecimal4);
                    od0.h hVar4 = od0.i.Companion;
                    Intrinsics.h(value4);
                    Intrinsics.checkNotNullParameter(value4, "value");
                    rr6.o oVar2 = new rr6.o(value4);
                    hVar4.getClass();
                    iVarA = od0.h.a(oVar2);
                }
                if (iVarA != null) {
                    return iVarA;
                }
                od0.i.Companion.getClass();
                return iVar2;
            case 13:
                Pair pair6 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair6, "<destruct>");
                od0.i iVar5 = (od0.i) pair6.f186385a;
                od0.i iVar6 = (od0.i) pair6.f186386b;
                if (!iVar5.d() && !iVar6.d()) {
                    od0.i.Companion.getClass();
                    return iVar2;
                }
                rr6.o oVar3 = (rr6.o) iVar5.g();
                BigDecimal value5 = oVar3 != null ? oVar3.getValue() : null;
                if (value5 == null) {
                    value5 = BigDecimal.ZERO;
                }
                rr6.o oVar4 = (rr6.o) iVar6.g();
                BigDecimal value6 = oVar4 != null ? oVar4.getValue() : null;
                if (value6 == null) {
                    value6 = BigDecimal.ZERO;
                }
                od0.h hVar5 = od0.i.Companion;
                Intrinsics.h(value5);
                Intrinsics.h(value6);
                BigDecimal value7 = value5.add(value6);
                Intrinsics.checkNotNullExpressionValue(value7, "add(...)");
                Intrinsics.checkNotNullParameter(value7, "value");
                rr6.o oVar5 = new rr6.o(value7);
                hVar5.getClass();
                return od0.h.a(oVar5);
            case 14:
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                List list4 = (List) rVar.f314201a;
                FreelancerCashbackRates freelancerCashbackRates2 = (FreelancerCashbackRates) rVar.f314202b;
                rr6.m mVar = (rr6.m) rVar.f314203c;
                LinkedHashMap linkedHashMap3 = freelancerCashbackRates2.f73279a;
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
                    if (((BigDecimal) entry3.getValue()).compareTo(mVar.f256721a) > 0) {
                        linkedHashMap4.put(entry3.getKey(), entry3.getValue());
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it15 = linkedHashMap4.entrySet().iterator();
                while (it15.hasNext()) {
                    String str4 = (String) ((Map.Entry) it15.next()).getKey();
                    Iterator it16 = list4.iterator();
                    while (true) {
                        if (it16.hasNext()) {
                            next4 = it16.next();
                            if (Intrinsics.f(((hha.d) next4).f152289c, str4)) {
                            }
                        } else {
                            next4 = null;
                        }
                    }
                    hha.d dVar7 = (hha.d) next4;
                    rr6.n nVar = dVar7 != null ? new rr6.n(y0.a(freelancerCashbackRates2, dVar7.f152289c), dVar7) : null;
                    if (nVar != null) {
                        arrayList3.add(nVar);
                    }
                }
                return arrayList3;
            case 15:
                List currencySettings = (List) obj2;
                Intrinsics.checkNotNullParameter(currencySettings, "currencySettings");
                Set setL = nkm.y.L(nkm.y.x(nkm.y.t(zhm.d0.Q(currencySettings), new w(16)), new w(17)));
                Set set = a1.e;
                return zhm.a1.l(zhm.d0.h0(setL, set), zhm.d0.Q0(setL, set));
            case 16:
                lr6.f it17 = (lr6.f) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return it17.f199401b;
            case 17:
                lr6.t it18 = (lr6.t) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return it18.f199416a;
            case 18:
                lr6.f it19 = (lr6.f) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return it19.f199401b;
            case 19:
                lr6.t it20 = (lr6.t) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return it20.f199416a;
            case 20:
                Set enabledPlugins = (Set) obj2;
                Intrinsics.checkNotNullParameter(enabledPlugins, "enabledPlugins");
                return Boolean.valueOf(!enabledPlugins.isEmpty());
            case 21:
                Pair pair7 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair7, "<destruct>");
                List list5 = (List) pair7.f186386b;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj4 : list5) {
                    if (((io3.d) obj4).e == io3.l.MERCHANT) {
                        arrayList4.add(obj4);
                    }
                }
                return arrayList4;
            case 22:
                lr6.i it21 = (lr6.i) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                return new Data(it21, null, false, 6, null);
            case 23:
                List sales = (List) obj2;
                Intrinsics.checkNotNullParameter(sales, "sales");
                return sales;
            case 24:
                rr6.m currentRate = (rr6.m) obj2;
                Intrinsics.checkNotNullParameter(currentRate, "currentRate");
                return currentRate.f256721a;
            case 25:
                List orders = (List) obj2;
                Intrinsics.checkNotNullParameter(orders, "orders");
                return zhm.d0.P0(orders, new g1());
            case 26:
                Pair pair8 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair8, "<destruct>");
                ArrayList arrayListE0 = zhm.d0.E0((List) pair8.f186386b, (List) pair8.f186385a);
                ArrayList arrayList5 = new ArrayList();
                for (Object obj5 : arrayListE0) {
                    FreelancerInvoice freelancerInvoice = (FreelancerInvoice) obj5;
                    Intrinsics.checkNotNullParameter(freelancerInvoice, "<this>");
                    if (freelancerInvoice.f73378h == sr6.n.DRAFT && (freelancerInvoice.f73381m != null || freelancerInvoice.f73383p != null || !freelancerInvoice.f73387t.isEmpty())) {
                        arrayList5.add(obj5);
                    }
                }
                return Integer.valueOf(arrayList5.size());
            case 27:
                yhm.r rVar2 = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar2, "<destruct>");
                FreelancerInvoice freelancerInvoice2 = (FreelancerInvoice) rVar2.f314201a;
                FreelancerInvoiceSettings freelancerInvoiceSettings = (FreelancerInvoiceSettings) rVar2.f314202b;
                List list6 = (List) rVar2.f314203c;
                ArrayList arrayList6 = new ArrayList();
                for (Object obj6 : list6) {
                    ArrayList arrayList7 = ((lr6.f) obj6).f199401b;
                    ArrayList arrayList8 = new ArrayList(zhm.w.t(arrayList7, 10));
                    Iterator it22 = arrayList7.iterator();
                    while (it22.hasNext()) {
                        arrayList8.add(((lr6.t) it22.next()).f199416a);
                    }
                    if (arrayList8.contains(freelancerInvoice2.i)) {
                        arrayList6.add(obj6);
                    }
                }
                ArrayList arrayList9 = new ArrayList(zhm.w.t(arrayList6, 10));
                Iterator it23 = arrayList6.iterator();
                while (it23.hasNext()) {
                    lr6.d0 d0Var2 = ((lr6.f) it23.next()).f199400a;
                    Intrinsics.checkNotNullParameter(d0Var2, "<this>");
                    switch (yv6.a.f317126a[d0Var2.ordinal()]) {
                        case 1:
                            iVar = sr6.i.CARD;
                            break;
                        case 2:
                            iVar = sr6.i.CARD;
                            break;
                        case 3:
                            iVar = sr6.i.BANK_TRANSFER;
                            break;
                        case 4:
                            iVar = sr6.i.OPEN_BANKING;
                            break;
                        case 5:
                            iVar = sr6.i.CARD;
                            break;
                        case 6:
                            iVar = sr6.i.CARD;
                            break;
                        case 7:
                            iVar = sr6.i.PAY_WITH_REVOLUT;
                            break;
                        case 8:
                            iVar = sr6.i.CLICK_TO_PAY;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    arrayList9.add(iVar);
                }
                Set setI1 = zhm.d0.i1(arrayList9);
                ArrayList arrayList10 = freelancerInvoiceSettings.f73403a;
                ArrayList arrayList11 = new ArrayList();
                for (Object obj7 : arrayList10) {
                    if (((InvoiceMethodsDetails) obj7).f73441b == sr6.o.ACTIVE) {
                        arrayList11.add(obj7);
                    }
                }
                ArrayList arrayList12 = new ArrayList(zhm.w.t(arrayList11, 10));
                Iterator it24 = arrayList11.iterator();
                while (it24.hasNext()) {
                    arrayList12.add(((InvoiceMethodsDetails) it24.next()).f73440a);
                }
                return zhm.d0.h0(arrayList12, setI1);
            case 28:
                List taxRates = (List) obj2;
                Intrinsics.checkNotNullParameter(taxRates, "taxRates");
                return zhm.d0.P0(taxRates, new m1());
            default:
                FreelancerAccountDetails details = (FreelancerAccountDetails) obj2;
                Intrinsics.checkNotNullParameter(details, "details");
                List list7 = details.f73271c;
                if ((list7 instanceof Collection) && list7.isEmpty()) {
                    z = false;
                } else {
                    Iterator it25 = list7.iterator();
                    while (it25.hasNext()) {
                        if (v1.f129354c.contains((lr6.a0) it25.next())) {
                        }
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }

    public /* synthetic */ w(y0 y0Var, int i) {
        this.f129359a = i;
    }
}
