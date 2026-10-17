package a26;

import com.revolut.data.model.Data;
import com.revolut.feature.credit.application.plugins.impl.ui.agreements.v2.CreditAgreementsV2FlowContract$State;
import com.revolut.feature.joint.impl.ui.invite_flow.InviteFlowContract$State;
import com.revolut.feature.junior_allowance.impl.ui.flow.allowance.JuniorAllowanceFlowContract$State;
import com.revolut.feature.tab.accounts.impl.ui.spaces.AccountSpacesContract$State;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import com.youTransactor.uCube.rpc.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nel.a0;
import org.joda.time.DateTime;
import qua.u;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f679b;

    public /* synthetic */ j(List list, int i) {
        this.f678a = i;
        this.f679b = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        boolean z;
        switch (this.f678a) {
            case 0:
                return c.a((c) obj2, null, this.f679b, 1);
            case 1:
                return a2g.g.a((a2g.g) obj2, null, this.f679b, false, false, false, null, Constants.TAG_FB_CHARGING_STATUS);
            case 2:
                List recurringPayments = (List) obj2;
                Intrinsics.checkNotNullParameter(recurringPayments, "recurringPayments");
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : recurringPayments) {
                    qua.p pVar = (qua.p) obj3;
                    if (this.f679b.contains(pVar.getId())) {
                        DateTime dateTimeNow = DateTime.now();
                        Intrinsics.checkNotNullExpressionValue(dateTimeNow, "now(...)");
                        if (u.o(pVar, dateTimeNow)) {
                            arrayList.add(obj3);
                        }
                    }
                }
                return arrayList;
            case 3:
                return CreditAgreementsV2FlowContract$State.a((CreditAgreementsV2FlowContract$State) obj2, this.f679b, null, 2);
            case 4:
                return a83.o.a((a83.o) obj2, null, null, null, this.f679b, null, null, null, null, false, null, null, false, null, null, 65527);
            case 5:
                wi0.b it8 = (wi0.b) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.valueOf(!this.f679b.contains(it8));
            case 6:
                ((JuniorAllowanceFlowContract$State) obj2).getClass();
                List pockets = this.f679b;
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                return new JuniorAllowanceFlowContract$State(pockets);
            case 7:
                aed.h params = (aed.h) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                List<pcd.s> list = this.f679b;
                if ((list instanceof Collection) && list.isEmpty()) {
                    z = false;
                } else {
                    for (pcd.s sVar : list) {
                        String str = params.f3535a;
                        if (Intrinsics.f(sVar.f234881a, str) || Intrinsics.f(sVar.f234882b, str)) {
                            z = true;
                        }
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            case 8:
                List instruments = (List) obj2;
                Intrinsics.checkNotNullParameter(instruments, "instruments");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : instruments) {
                    List list2 = ((nel.n) obj4).f214604p;
                    ArrayList arrayList3 = new ArrayList(w.t(list2, 10));
                    Iterator it9 = list2.iterator();
                    while (it9.hasNext()) {
                        arrayList3.add(Boolean.valueOf(this.f679b.contains((String) it9.next())));
                    }
                    if (!arrayList3.isEmpty()) {
                        Iterator it10 = arrayList3.iterator();
                        while (true) {
                            if (!it10.hasNext()) {
                            }
                            if (((Boolean) it10.next()).booleanValue()) {
                                arrayList2.add(obj4);
                            }
                            break;
                        }
                    }
                }
                return arrayList2;
            case 9:
                Data tickersListData = (Data) obj2;
                Intrinsics.checkNotNullParameter(tickersListData, "tickersListData");
                List<nel.n> list3 = this.f679b;
                ArrayList arrayList4 = new ArrayList(w.t(list3, 10));
                for (nel.n nVar : list3) {
                    List list4 = (List) tickersListData.getContent();
                    InstrumentTicker instrumentTicker = null;
                    Object obj5 = null;
                    if (list4 != null) {
                        Iterator it11 = list4.iterator();
                        while (true) {
                            if (it11.hasNext()) {
                                Object next = it11.next();
                                if (Intrinsics.f(((InstrumentTicker) next).f105112b, nVar.f214596b)) {
                                    obj5 = next;
                                }
                            }
                        }
                        instrumentTicker = (InstrumentTicker) obj5;
                    }
                    arrayList4.add(new a0(nVar, instrumentTicker));
                }
                return arrayList4;
            case 10:
                return ag1.a.a((ag1.a) obj2, null, this.f679b, 1);
            case 11:
                return AccountSpacesContract$State.a((AccountSpacesContract$State) obj2, null, null, null, null, this.f679b, 15);
            case 12:
                List list5 = this.f679b;
                Intrinsics.h(list5);
                return ajd.h.a((ajd.h) obj2, list5, null, null, false, null, 30);
            case 13:
                anl.c updateState = (anl.c) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                Data accountsSessions = new Data(this.f679b, null, false, 6, null);
                updateState.getClass();
                Intrinsics.checkNotNullParameter(accountsSessions, "accountsSessions");
                return new anl.c(accountsSessions);
            case 14:
                xi0.b baseCurrency = (xi0.b) obj2;
                Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
                List list6 = this.f679b;
                ArrayList arrayList5 = new ArrayList();
                for (Object obj6 : list6) {
                    if (!Intrinsics.f((xi0.b) obj6, baseCurrency)) {
                        arrayList5.add(obj6);
                    }
                }
                ArrayList arrayList6 = new ArrayList(w.t(arrayList5, 10));
                Iterator it12 = arrayList5.iterator();
                while (it12.hasNext()) {
                    v1.c.A(arrayList6, (xi0.b) it12.next(), baseCurrency);
                }
                return arrayList6;
            case 15:
                ard.a update = (ard.a) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return ard.a.a(update, null, d0.i1(this.f679b), true, null, null, null, null, null, 1013);
            case 16:
                av8.j update2 = (av8.j) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                List list7 = this.f679b;
                av8.i hVar = list7.size() == 1 ? new av8.h((my8.l) d0.b0(list7)) : new av8.g(list7);
                return av8.j.a(update2, null, new Data(zhm.u.c(hVar), null, false, 6, null), hVar, 1);
            case 17:
                return avk.m.c((avk.m) obj2, null, null, null, this.f679b, null, null, null, null, null, null, null, null, null, null, null, null, 65527);
            case 18:
                return avk.m.c((avk.m) obj2, null, this.f679b, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65533);
            case 19:
                return avk.m.c((avk.m) obj2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.f679b, 32767);
            case 20:
                return avk.m.c((avk.m) obj2, null, null, null, null, null, this.f679b, null, null, null, null, null, null, null, null, null, null, 65503);
            case 21:
                return avk.m.c((avk.m) obj2, null, null, null, null, null, null, null, null, null, this.f679b, null, null, null, null, null, null, 65023);
            case 22:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return new cw5.a(this.f679b, (List) pair.f186385a, (List) pair.f186386b);
            case 23:
                InviteFlowContract$State update3 = (InviteFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return InviteFlowContract$State.a(update3, this.f679b, null, 2);
            case 24:
                b9c.e eVar = (b9c.e) obj2;
                List list8 = this.f679b;
                Intrinsics.h(list8);
                io3.d dVar = (io3.d) d0.d0(list8);
                return b9c.e.a(eVar, null, list8, dVar != null ? dVar.f163145a : null, null, 19);
            case 25:
                ((ba4.f) obj2).getClass();
                List documents = this.f679b;
                Intrinsics.checkNotNullParameter(documents, "documents");
                return new ba4.f(documents);
            case 26:
                return bbk.i.a((bbk.i) obj2, false, null, this.f679b, null, null, 27);
            case 27:
                dj0.d totalSum = (dj0.d) obj2;
                Intrinsics.checkNotNullParameter(totalSum, "totalSum");
                return new hce.d(this.f679b, totalSum);
            case 28:
                return bec.i.a((bec.i) obj2, null, null, null, this.f679b, 2047);
            default:
                return ake.a.a((ake.a) obj2, null, null, null, this.f679b, null, null, null, null, null, null, 1015);
        }
    }

    public /* synthetic */ j(List list, aed.o oVar) {
        this.f678a = 7;
        this.f679b = list;
    }
}
