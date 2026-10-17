package av8;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.amount.strategypicker.StrategyPickerContract$RepaymentStrategyType;
import com.revolut.feature.freelancer.common.models.FreelancerInboundVolume;
import com.revolut.feature.revolutpay.impl.domain.models.payment_schedule.PaymentScheduleSelection;
import com.revolut.feature.travel.miles.api.model.TravelMilesSearchLocation;
import com.revolut.retail.feature.esim.api.model.EsimFeaturedPhoneNumber;
import dfl.i0;
import hfg.m0;
import hfg.n0;
import hha.z0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pcd.x;
import svi.d0;
import zhm.h0;
import zhm.q0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9959b;

    public /* synthetic */ o(com.revolut.feature.travel.miles.impl.ui.screen.flight_finder.c cVar, Object obj2) {
        this.f9958a = 22;
        this.f9959b = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f9958a;
        Object obj3 = this.f9959b;
        switch (i) {
            case 0:
                j update = (j) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return j.a(update, null, null, (i) obj3, 3);
            case 1:
                axi.l update2 = (axi.l) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return axi.l.a(update2, 0, null, null, null, (d0) obj3, false, null, null, null, null, null, 4063);
            case 2:
                Map refIpoSummaryMap = (Map) obj2;
                Intrinsics.checkNotNullParameter(refIpoSummaryMap, "refIpoSummaryMap");
                ArrayList arrayList = new ArrayList();
                for (nel.n nVar : (Iterable) obj3) {
                    oel.l lVar = (oel.l) refIpoSummaryMap.get(nVar.f214596b);
                    blh.e eVar = lVar != null ? new blh.e(nVar, lVar) : null;
                    if (eVar != null) {
                        arrayList.add(eVar);
                    }
                }
                return arrayList;
            case 3:
                c7k.a updateState = (c7k.a) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return c7k.a.a(updateState, (String) obj3, false, 5);
            case 4:
                cui.l update3 = (cui.l) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return cui.l.a(update3, null, null, null, null, (bti.f) obj3, null, null, false, null, 495);
            case 5:
                d47.f update4 = (d47.f) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                Set setH1 = zhm.d0.h1(update4.f111234b);
                if (setH1.contains(obj3)) {
                    setH1.remove(obj3);
                } else {
                    setH1.add(obj3);
                }
                Unit unit = Unit.f186387a;
                return d47.f.a(update4, setH1);
            case 6:
                i0 it8 = (i0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return obj3;
            case 7:
                dkj.g update5 = (dkj.g) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return dkj.g.a(update5, null, (EsimFeaturedPhoneNumber) obj3, 7);
            case 8:
                Data data = (Data) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                Throwable error = data.getError();
                if (error == null || data.getContent() != null || data.getLoading()) {
                    return data;
                }
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, error, h0Var);
                return new Data(this.f9959b, null, false, 6, null);
            case 9:
                Data data2 = (Data) obj2;
                Intrinsics.checkNotNullParameter(data2, "data");
                Throwable error2 = data2.getError();
                if (error2 == null || data2.getContent() != null || data2.getLoading()) {
                    return data2;
                }
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, error2, h0Var2);
                return new Data(this.f9959b, null, false, 6, null);
            case 10:
                e1c.j update6 = (e1c.j) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                z0 z0Var = ((e1c.b) obj3).f121945a;
                Data loyaltyEarningRatesData = update6.f121951a;
                Intrinsics.checkNotNullParameter(loyaltyEarningRatesData, "loyaltyEarningRatesData");
                return new e1c.j(loyaltyEarningRatesData, z0Var);
            case 11:
                i0 it9 = (i0) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return obj3;
            case 12:
                e8e.m updateState2 = (e8e.m) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                return e8e.m.a(updateState2, null, null, gc0.c.A(updateState2.d, obj3), null, 55);
            case 13:
                List availableIndexes = (List) obj2;
                Intrinsics.checkNotNullParameter(availableIndexes, "availableIndexes");
                List list = availableIndexes;
                int iB = q0.b(w.t(list, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                for (Object obj4 : list) {
                    linkedHashMap.put(((lel.b) obj4).f194590b, obj4);
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it10 = ((Iterable) obj3).iterator();
                while (it10.hasNext()) {
                    lel.b bVar = (lel.b) linkedHashMap.get((String) it10.next());
                    if (bVar != null) {
                        arrayList2.add(bVar);
                    }
                }
                return arrayList2;
            case 14:
                f1c.l update7 = (f1c.l) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                f1c.d dVar = (f1c.d) obj3;
                return f1c.l.a(update7, null, r0.q(update7.f131245b, new Pair(dVar.f131236a, new f1c.p(dVar.f131237b))), null, 5);
            case 15:
                f1c.l update8 = (f1c.l) obj2;
                Intrinsics.checkNotNullParameter(update8, "$this$update");
                f1c.c cVar = (f1c.c) obj3;
                return f1c.l.a(update8, null, r0.q(update8.f131245b, new Pair(cVar.f131234a, new f1c.o(cVar.f131235b))), null, 5);
            case 16:
                f47.f update9 = (f47.f) obj2;
                Intrinsics.checkNotNullParameter(update9, "$this$update");
                Set setH12 = zhm.d0.h1(update9.f132014b);
                if (setH12.contains(obj3)) {
                    setH12.remove(obj3);
                } else {
                    setH12.add(obj3);
                }
                Unit unit2 = Unit.f186387a;
                return f47.f.a(update9, setH12);
            case 17:
                fb6.d update10 = (fb6.d) obj2;
                Intrinsics.checkNotNullParameter(update10, "$this$update");
                return fb6.d.a(update10, null, ((Number) obj3).intValue(), null, null, 13);
            case 18:
                Data data3 = (Data) obj2;
                Intrinsics.checkNotNullParameter(data3, "data");
                Throwable error3 = data3.getError();
                if (error3 == null || data3.getContent() != null || data3.getLoading()) {
                    return data3;
                }
                h0 h0Var3 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, error3, h0Var3);
                return new Data(this.f9959b, null, false, 6, null);
            case 19:
                fx6.e update11 = (fx6.e) obj2;
                Intrinsics.checkNotNullParameter(update11, "$this$update");
                return fx6.e.a(update11, null, (FreelancerInboundVolume) obj3, 1);
            case 20:
                g4b.l update12 = (g4b.l) obj2;
                Intrinsics.checkNotNullParameter(update12, "$this$update");
                return g4b.l.a(update12, null, null, null, !((g4b.p) obj3).f140456a, 55);
            case 21:
                g85.b update13 = (g85.b) obj2;
                Intrinsics.checkNotNullParameter(update13, "$this$update");
                List availableStrategies = update13.f141284a;
                Intrinsics.checkNotNullParameter(availableStrategies, "availableStrategies");
                return new g85.b(availableStrategies, (StrategyPickerContract$RepaymentStrategyType) obj3);
            case 22:
                ghg.g update14 = (ghg.g) obj2;
                Intrinsics.checkNotNullParameter(update14, "$this$update");
                n0 n0Var = (n0) obj3;
                m0 m0Var = n0Var.f151872g;
                TravelMilesSearchLocation.City city = new TravelMilesSearchLocation.City(m0Var.f151866a, m0Var.f151867b);
                m0 m0Var2 = n0Var.f151873h;
                return ghg.g.a(update14, null, null, null, new TravelMilesSearchLocation.City(m0Var2.f151866a, m0Var2.f151867b), city, false, true, 39);
            case 23:
                gp3.b update15 = (gp3.b) obj2;
                Intrinsics.checkNotNullParameter(update15, "$this$update");
                return gp3.b.a(update15, null, null, r0.q(update15.d, new Pair(obj3, Boolean.valueOf(!((Boolean) r0.h(obj3, r2)).booleanValue()))), 23);
            case 24:
                h2j.i update16 = (h2j.i) obj2;
                Intrinsics.checkNotNullParameter(update16, "$this$update");
                return h2j.i.e(update16, null, null, (j1j.d) obj3, null, null, null, null, null, null, null, null, 8155);
            case 25:
                h8e.e updateState3 = (h8e.e) obj2;
                Intrinsics.checkNotNullParameter(updateState3, "$this$updateState");
                LinkedHashSet usersWithWithdraw = gc0.c.A(updateState3.f150021b, ((x) obj3).f234903a);
                List members = updateState3.f150020a;
                do3.n user = updateState3.f150022c;
                Intrinsics.checkNotNullParameter(members, "members");
                Intrinsics.checkNotNullParameter(usersWithWithdraw, "usersWithWithdraw");
                Intrinsics.checkNotNullParameter(user, "user");
                return new h8e.e(members, usersWithWithdraw, user);
            case 26:
                hz4.f update17 = (hz4.f) obj2;
                Intrinsics.checkNotNullParameter(update17, "$this$update");
                String string = ((InputTextDelegate.TextData) obj3).f52598b.toString();
                update17.getClass();
                return new hz4.f(string);
            case 27:
                i47.h update18 = (i47.h) obj2;
                Intrinsics.checkNotNullParameter(update18, "$this$update");
                Set setH13 = zhm.d0.h1(update18.f158288b);
                if (setH13.contains(obj3)) {
                    setH13.remove(obj3);
                } else {
                    setH13.add(obj3);
                }
                Unit unit3 = Unit.f186387a;
                return i47.h.a(update18, null, setH13, null, 5);
            case 28:
                i47.h update19 = (i47.h) obj2;
                Intrinsics.checkNotNullParameter(update19, "$this$update");
                Set setH14 = zhm.d0.h1(update19.f158289c);
                if (setH14.contains(obj3)) {
                    setH14.remove(obj3);
                } else {
                    setH14.add(obj3);
                }
                Unit unit4 = Unit.f186387a;
                return i47.h.a(update19, null, null, setH14, 3);
            default:
                i9c.a update20 = (i9c.a) obj2;
                Intrinsics.checkNotNullParameter(update20, "$this$update");
                PaymentScheduleSelection selectedPaymentSchedule = (PaymentScheduleSelection) obj3;
                dj0.d totalWithDiscount = update20.f159619a;
                List paymentScheduleList = update20.f159620b;
                Intrinsics.checkNotNullParameter(totalWithDiscount, "totalWithDiscount");
                Intrinsics.checkNotNullParameter(paymentScheduleList, "paymentScheduleList");
                Intrinsics.checkNotNullParameter(selectedPaymentSchedule, "selectedPaymentSchedule");
                return new i9c.a(totalWithDiscount, paymentScheduleList, selectedPaymentSchedule);
        }
    }

    public /* synthetic */ o(Object obj2, int i) {
        this.f9958a = i;
        this.f9959b = obj2;
    }
}
