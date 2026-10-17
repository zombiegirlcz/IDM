package ds4;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.core.ui_kit.delegates.g6;
import com.revolut.feature.credit.card.impl.ui.instalment.hub.CreditCardInstalmentHubScreen;
import com.revolut.feature.exchange.models.ExchangeOrder;
import com.revolut.feature.transport.impl.ui.hub.ticket_details.TicketDetailsScreen;
import ip0.nb0;
import ip0.pb0;
import ip0.s7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import svi.g1;
import svi.i1;
import tof.a3;
import tof.cc;
import tof.i7;
import tof.n7;
import tof.na;
import tof.o7;
import tof.oa;
import tof.p8;
import tof.q7;
import tof.r8;
import tof.s8;
import tof.u9;
import tof.v6;
import tof.va;
import tof.y6;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f117198a;

    public /* synthetic */ b(int i) {
        this.f117198a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object obj3 = null;
        switch (this.f117198a) {
            case 0:
                VoucherSmallTileDelegate.Model it8 = (VoucherSmallTileDelegate.Model) obj2;
                KProperty[] kPropertyArr = CreditCardInstalmentHubScreen.f69386a0;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8.f53623w;
            case 1:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                r rVar = new r(f0.f322471a);
                aim.e eVarB = zhm.u.b();
                IntRange intRange = new IntRange(1, 2, 1);
                ArrayList arrayList = new ArrayList(zhm.w.t(intRange, 10));
                vim.f it9 = intRange.iterator();
                while (it9.f289625c) {
                    arrayList.add(new s7(a0.d.n("id_credit_card_instalment_hub_item_due_", it9.nextInt()), 0, 0, 0, 0, false, null, 126));
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                eVarB.addAll(arrayList);
                nb0 nb0Var = pb0.Companion;
                eVarB.addAll(yp0.b.i(nb0.b(nb0Var, "id_credit_card_instalment_hub_loading_current_instalment", false, 0, false, 30), fs4.g.d(), null, 0, 0, 126));
                eVarB.addAll(yp0.b.i(nb0.b(nb0Var, "id_credit_card_instalment_hub_loading_past_instalment", false, 0, false, 30), fs4.g.f(), null, 0, 0, 126));
                return new s(rVar, zhm.u.a(eVarB));
            case 2:
                cs3.b it10 = (cs3.b) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return it10.f.f108445a;
            case 3:
                List list = (List) obj2;
                Intrinsics.checkNotNullParameter(list, "list");
                return m72.b.x(list, od0.i.Companion);
            case 4:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                Object obj4 = pair.f186385a;
                Intrinsics.checkNotNullExpressionValue(obj4, "component1(...)");
                Boolean bool = (Boolean) obj4;
                Object obj5 = pair.f186386b;
                Intrinsics.checkNotNullExpressionValue(obj5, "component2(...)");
                if (((Boolean) obj5).booleanValue() && !bool.booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 5:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Boolean.TRUE;
            case 6:
                List portfolios = (List) obj2;
                Intrinsics.checkNotNullParameter(portfolios, "portfolios");
                Iterator it11 = portfolios.iterator();
                while (true) {
                    if (it11.hasNext()) {
                        Object next = it11.next();
                        ArrayList<kel.g> arrayList2 = ((wel.e) next).e;
                        if (arrayList2 == null || !arrayList2.isEmpty()) {
                            for (kel.g gVar : arrayList2) {
                                if ((gVar instanceof kel.b) && ((kel.b) gVar).i.f115082a < 0) {
                                    obj3 = next;
                                }
                            }
                        }
                    }
                }
                wel.e eVar = (wel.e) obj3;
                return eVar == null ? rfm.h.f253943a : efm.k.g(eVar);
            case 7:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return ytk.a.a(3);
            case 8:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 9:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 10:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                return d0.E0((List) pair2.f186385a, (List) pair2.f186386b);
            case 11:
                io3.d it12 = (io3.d) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                lu5.r.Companion.getClass();
                return Boolean.valueOf(lu5.r.f.contains(it12.f));
            case 12:
                List payments = (List) obj2;
                Intrinsics.checkNotNullParameter(payments, "payments");
                List listP0 = d0.P0(payments, new a9j.f(new dv5.k(), 22));
                ArrayList arrayList3 = new ArrayList(zhm.w.t(listP0, 10));
                Iterator it13 = listP0.iterator();
                while (it13.hasNext()) {
                    arrayList3.add(new pt5.v((qua.p) it13.next()));
                }
                return arrayList3;
            case 13:
                io3.d it14 = (io3.d) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                lu5.r.Companion.getClass();
                Intrinsics.checkNotNullParameter(it14, "<this>");
                return Boolean.valueOf(lu5.r.e.contains(it14.e));
            case 14:
                SwipeToActionDelegate.SwipeAction action = (SwipeToActionDelegate.SwipeAction) obj2;
                Intrinsics.checkNotNullParameter(action, "action");
                Object obj6 = action.f;
                String id10 = action.f53505a;
                if (!(obj6 instanceof ExchangeOrder)) {
                    if (obj6 instanceof qua.p) {
                        return czi.c.r((qua.p) obj6, id10);
                    }
                    return null;
                }
                ExchangeOrder exchangeOrder = (ExchangeOrder) obj6;
                Intrinsics.checkNotNullParameter(exchangeOrder, "<this>");
                Intrinsics.checkNotNullParameter(id10, "id");
                if (Intrinsics.f(id10, "ORDERS_MAPPER_SWIPE_ACTION_ID_CANCEL")) {
                    return new pt5.n(exchangeOrder);
                }
                return null;
            case 15:
                g6 it15 = (g6) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return Boolean.valueOf(Intrinsics.f(it15.f54200b.f52342a, "LIST_ID_TABS"));
            case 16:
                Intrinsics.checkNotNullParameter((g6) obj2, "it");
                return Unit.f186387a;
            case 17:
                qv0.p pVar = (qv0.p) obj2;
                if (!(pVar.getF55862c() instanceof pt5.j)) {
                    return null;
                }
                Object e = pVar.getF55862c();
                Intrinsics.i(e, "null cannot be cast to non-null type com.revolut.feature.crypto_investments.api.widget.activity.ActivityWidgetContract.Navigation");
                return new Pair((pt5.j) e, ((koi.j) obj2).getF55860a());
            case 18:
                Set pocketSet = (Set) obj2;
                Intrinsics.checkNotNullParameter(pocketSet, "pocketSet");
                Intrinsics.checkNotNullParameter(pocketSet, "pocketSet");
                i7.c cVar = i7.Companion;
                u9 u9Var = new u9(false);
                Set set = pocketSet;
                ArrayList arrayList4 = new ArrayList(zhm.w.t(set, 10));
                Iterator it16 = set.iterator();
                while (it16.hasNext()) {
                    arrayList4.add(((io3.d) it16.next()).f163145a);
                }
                va vaVar = new va(d0.i1(arrayList4));
                i7.c cVar2 = i7.Companion;
                y6[] y6VarArr = {y6.REVX_TRANSFER, y6.REVX_EXCHANGE, y6.EXCHANGE, y6.TRANSFER, y6.TOPUP};
                cVar2.getClass();
                cc ccVarD = i7.c.d(y6VarArr);
                i7[] i7VarArr = {new o7(), new n7()};
                cVar2.getClass();
                oa oaVarB = i7.c.b(i7VarArr);
                v6[] v6VarArr = {v6.COMPLETED};
                cVar2.getClass();
                i7[] i7VarArr2 = {u9Var, vaVar, ccVarD, oaVarB, i7.c.c(v6VarArr)};
                cVar.getClass();
                q7 q7VarA = i7.c.a(i7VarArr2);
                u9 u9Var2 = new u9(false);
                ArrayList arrayList5 = new ArrayList(zhm.w.t(set, 10));
                Iterator it17 = set.iterator();
                while (it17.hasNext()) {
                    arrayList5.add(((io3.d) it17.next()).f163145a);
                }
                p8 p8Var = new p8(d0.i1(arrayList5));
                i7.c cVar3 = i7.Companion;
                y6[] y6VarArr2 = {y6.REVX_TRANSFER, y6.REVX_EXCHANGE, y6.EXCHANGE, y6.TRANSFER, y6.TOPUP};
                cVar3.getClass();
                cc ccVarD2 = i7.c.d(y6VarArr2);
                i7[] i7VarArr3 = {new s8(), new r8()};
                cVar3.getClass();
                na naVarE = i7.c.e(i7VarArr3);
                v6[] v6VarArr2 = {v6.COMPLETED};
                cVar3.getClass();
                return i7.c.b(q7VarA, i7.c.a(u9Var2, p8Var, ccVarD2, naVarE, i7.c.c(v6VarArr2)));
            case 19:
                io3.d it18 = (io3.d) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return Boolean.valueOf(it18.e == io3.l.REVX_FIAT);
            case 20:
                io3.d it19 = (io3.d) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                lu5.r.Companion.getClass();
                return Boolean.valueOf(lu5.r.f.contains(it19.f));
            case 21:
                io3.d it20 = (io3.d) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                lu5.r.Companion.getClass();
                Intrinsics.checkNotNullParameter(it20, "<this>");
                return Boolean.valueOf(lu5.r.e.contains(it20.e));
            case 22:
                io3.d it21 = (io3.d) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                lu5.r.Companion.getClass();
                return Boolean.valueOf(lu5.r.f.contains(it21.f));
            case 23:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return zhm.u.c(nb0.a(pb0.Companion, "LOADING_STATE_ID", false, 6));
            case 24:
                List list2 = (List) obj2;
                Intrinsics.checkNotNullParameter(list2, "list");
                List list3 = list2;
                ArrayList arrayList6 = new ArrayList(zhm.w.t(list3, 10));
                Iterator it22 = list3.iterator();
                while (it22.hasNext()) {
                    arrayList6.add(((pwd.b) it22.next()).getLockedTransactionId());
                }
                return arrayList6;
            case 25:
                RowDelegate.Model it23 = (RowDelegate.Model) obj2;
                KProperty[] kPropertyArr2 = TicketDetailsScreen.U;
                Intrinsics.checkNotNullParameter(it23, "it");
                return Boolean.valueOf(it23.u instanceof a3);
            case 26:
                CellDetailsChevronDelegate.Model it24 = (CellDetailsChevronDelegate.Model) obj2;
                KProperty[] kPropertyArr3 = TicketDetailsScreen.U;
                Intrinsics.checkNotNullParameter(it24, "it");
                return Boolean.valueOf(Intrinsics.f(it24.f51822a, "GET_HELP_ITEM_ID"));
            case 27:
                List it25 = (List) obj2;
                Intrinsics.checkNotNullParameter(it25, "it");
                j61.c cVar4 = (j61.c) d0.d0(it25);
                if (cVar4 != null) {
                    return cVar4.f171656a;
                }
                return null;
            case 28:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            default:
                svi.r rVar2 = (svi.r) obj2;
                int i = dwi.c.f120412a[rVar2.f265980r.ordinal()];
                return i != 1 ? (i == 2 || i == 3) ? dwi.l.f120439a : new dwi.m(new i1(rVar2.f265980r)) : new dwi.m(new g1(rVar2));
        }
    }

    public /* synthetic */ b(Object obj2, int i) {
        this.f117198a = i;
    }
}
