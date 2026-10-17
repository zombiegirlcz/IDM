package gqa;

import aim.e;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.feature.recurring_payments.api.data.models.RecurringPaymentWithExtra;
import com.revolut.feature.transfer.core.impl.ui.reason.chooser.ReasonForTransferChooserScreen;
import com.revolut.retail.feature.api.custom_assets.models.CustomAssetFieldDefinitions;
import gqd.k;
import gqd.z;
import ip0.nb0;
import ip0.pb0;
import ip0.v7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k71.q;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import l35.d;
import od0.h;
import od0.i;
import org.joda.time.LocalDate;
import pjb.c;
import qsi.f;
import qzi.l;
import te0.w;
import tof.i3;
import yhm.r;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f145613a;

    public /* synthetic */ a(int i) {
        this.f145613a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        qzi.a aVar;
        int i = this.f145613a;
        i iVar = i.f224256b;
        Object obj3 = null;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Boolean.FALSE;
            case 1:
                c upgradesData = (c) obj2;
                Intrinsics.checkNotNullParameter(upgradesData, "upgradesData");
                Iterator it8 = upgradesData.f236722a.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        Object next = it8.next();
                        if (((pjb.b) next).f236719a == 0) {
                            obj3 = next;
                        }
                    }
                }
                pjb.b bVar = (pjb.b) obj3;
                i.Companion.getClass();
                return bVar != null ? h.a(bVar) : iVar;
            case 2:
                fo3.c it9 = (fo3.c) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return it9.f136801a;
            case 3:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                i.Companion.getClass();
                return iVar;
            case 4:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                e eVarB = u.b();
                nb0 nb0Var = pb0.Companion;
                pb0 pb0VarB = nb0.b(nb0Var, "TRANSACTION_ITEM_ID", false, 0, false, 30);
                yp0.b.l(pb0VarB, 0, 0, 0, 0, null, false, 63);
                eVarB.add(pb0VarB);
                v7.C("SORTED_LIST_HEADER_ID", 0, 0, 30, eVarB);
                List listK = v.k(nb0.b(nb0Var, "DESTINATION_LOADING_ITEM_ID_1", false, 0, false, 30), nb0.b(nb0Var, "DESTINATION_LOADING_ITEM_ID_2", false, 0, false, 30), nb0.b(nb0Var, "DESTINATION_LOADING_ITEM_ID_3", false, 0, false, 30));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                eVarB.addAll(listK);
                return new k(u.a(eVarB), gqd.i.f145685a);
            case 5:
                SelectableDelegate.Model it10 = (SelectableDelegate.Model) obj2;
                KProperty[] kPropertyArr = ReasonForTransferChooserScreen.f92189b0;
                Intrinsics.checkNotNullParameter(it10, "it");
                Object obj4 = ((RowDelegate.Model) it10.f53305b).u;
                if (obj4 instanceof krf.c) {
                    return (krf.c) obj4;
                }
                return null;
            case 6:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return d.f191853a;
            case 7:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return new gqk.c(0);
            case 8:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return new gqk.c((Map) pair.f186386b, (Map) pair.f186385a, true);
            case 9:
                Throwable it11 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return new Data(f0.f322471a, it11, false, 4, null);
            case 10:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                q qVar = (q) pair2.f186385a;
                gqk.c cVar = (gqk.c) pair2.f186386b;
                return q.a(qVar, cVar.f145764a, cVar.f145765b, cVar.f145766c, null, 33525759);
            case 11:
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                List list = (List) pair3.f186385a;
                q qVar2 = (q) pair3.f186386b;
                Intrinsics.h(qVar2);
                return w.h(new f(list, qVar2));
            case 12:
                Pair pair4 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair4, "<destruct>");
                return new f((List) pair4.f186385a, (q) pair4.f186386b);
            case 13:
                CustomAssetFieldDefinitions it12 = (CustomAssetFieldDefinitions) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return new Pair(it12.f99231b, it12.f99232c);
            case 14:
                grd.a update = (grd.a) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return grd.a.a(update, null, null, null, null, null, null, false, null, null, null, 31743);
            case 15:
                return grd.a.a((grd.a) obj2, null, null, null, null, null, null, true, null, null, null, 31743);
            case 16:
                return grd.a.a((grd.a) obj2, null, null, null, null, null, null, true, null, null, null, 31743);
            case 17:
                Data data = (Data) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                return (!data.getLoading() || data.getError() == null) ? data : Data.copy$default(data, null, null, false, 5, null);
            case 18:
                qzi.h overview = (qzi.h) obj2;
                Intrinsics.checkNotNullParameter(overview, "overview");
                i.Companion.getClass();
                return h.a(overview);
            case 19:
                xi0.b it13 = (xi0.b) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return zi0.c.P(it13, false, null, 3);
            case 20:
                List list2 = (List) obj2;
                Intrinsics.checkNotNullParameter(list2, "list");
                List list3 = list2;
                ArrayList arrayList = new ArrayList(zhm.w.t(list3, 10));
                Iterator it14 = list3.iterator();
                while (it14.hasNext()) {
                    arrayList.add(v13.d.t((i3) it14.next()));
                }
                return zi0.c.P(arrayList, false, null, 3);
            case 21:
                r rVar = (r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                xi0.b bVar2 = (xi0.b) rVar.f314201a;
                List<qzi.a> list4 = (List) rVar.f314202b;
                List list5 = (List) rVar.f314203c;
                ArrayList arrayList2 = new ArrayList();
                for (qzi.a aVar2 : list4) {
                    if (Intrinsics.f(aVar2.d, v13.d.u(l.OVERALL)) || list5.contains(aVar2.d)) {
                        dj0.d plannedMoney = new dj0.d(aVar2.f250648c.f115082a, bVar2);
                        String id10 = aVar2.f250646a;
                        String walletId = aVar2.f250647b;
                        String budgetingCategory = aVar2.d;
                        LocalDate startDate = aVar2.e;
                        LocalDate endDate = aVar2.f;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        Intrinsics.checkNotNullParameter(walletId, "walletId");
                        Intrinsics.checkNotNullParameter(plannedMoney, "plannedMoney");
                        Intrinsics.checkNotNullParameter(budgetingCategory, "budgetingCategory");
                        Intrinsics.checkNotNullParameter(startDate, "startDate");
                        Intrinsics.checkNotNullParameter(endDate, "endDate");
                        aVar = new qzi.a(id10, walletId, plannedMoney, budgetingCategory, startDate, endDate);
                    } else {
                        aVar = null;
                    }
                    if (aVar != null) {
                        arrayList2.add(aVar);
                    }
                }
                return arrayList2;
            case 22:
                return gs.k.a((gs.k) obj2, null, null, 0, false, 27);
            case 23:
                Data it15 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                PricingPlanSubscription pricingPlanSubscription = (PricingPlanSubscription) it15.getContent();
                return Boolean.valueOf(pricingPlanSubscription != null ? pricingPlanSubscription.o : false);
            case 24:
                b9e.e it16 = (b9e.e) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                List list6 = it16.f13741h;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj5 : list6) {
                    RecurringPaymentWithExtra recurringPaymentWithExtra = (RecurringPaymentWithExtra) obj5;
                    if (qua.u.r(recurringPaymentWithExtra.getF81653a()) || qua.u.w(recurringPaymentWithExtra.getF81653a())) {
                        arrayList3.add(obj5);
                    }
                }
                return arrayList3;
            case 25:
                b9e.e it17 = (b9e.e) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                List list7 = it17.f13741h;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj6 : list7) {
                    RecurringPaymentWithExtra recurringPaymentWithExtra2 = (RecurringPaymentWithExtra) obj6;
                    if (recurringPaymentWithExtra2.getF81653a().f249314a.f160152c == ibd.h.GIRO_HU_DIRECT_DEBIT || recurringPaymentWithExtra2.getF81653a().f249314a.f160152c == ibd.h.MASAV_IL_DIRECT_DEBIT) {
                        arrayList4.add(obj6);
                    }
                }
                return arrayList4;
            case 26:
                b9e.e it18 = (b9e.e) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                List list8 = it18.f13745n;
                ArrayList arrayList5 = new ArrayList();
                for (Object obj7 : list8) {
                    RecurringPaymentWithExtra recurringPaymentWithExtra3 = (RecurringPaymentWithExtra) obj7;
                    if (qua.u.n(recurringPaymentWithExtra3.getF81653a()) || qua.u.H(recurringPaymentWithExtra3.getF81653a())) {
                        arrayList5.add(obj7);
                    }
                }
                return arrayList5;
            case 27:
                b9e.e it19 = (b9e.e) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                List list9 = it19.i;
                ArrayList arrayList6 = new ArrayList();
                for (Object obj8 : list9) {
                    if (v.k(ibd.h.CARD_MANDATE, ibd.h.MANUAL_CARD_MANDATE, ibd.h.PREDEFINED_CARD_MANDATE, ibd.h.BIZUM_MANDATE).contains(((RecurringPaymentWithExtra) obj8).getF81653a().f249314a.f160152c)) {
                        arrayList6.add(obj8);
                    }
                }
                return d0.E0(it19.o, arrayList6);
            case 28:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return u.c(new pb0("ID_SUBSCRIPTION_EMPTY_ITEM"));
            default:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return u.c(new pb0("ID_UPI_LOADING_ITEM"));
        }
    }

    public /* synthetic */ a(z zVar) {
        this.f145613a = 4;
    }
}
