package nrb;

import aim.e;
import amd.j;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.delegates.vh;
import com.revolut.feature.payments.groups.impl.mappers.transactions.GroupTransactionItem;
import com.revolut.feature.payments.groups.impl.ui_chat.group_transactions.GroupTransactionsScreen;
import com.revolut.feature.payments.groups.impl.ui_new.group_creation.GroupCreationScreen;
import com.revolut.feature.transfer_reasons.impl.ui.search.TransferReasonsSearchScreen;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasonNode;
import com.revolut.retail.feature.api.custom_assets.models.CustomAssetFieldDefinitions;
import com.revolut.retail.trading.core.domain.orders.InvestOrder;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import e7l.f;
import ip0.nb0;
import ip0.p10;
import ip0.pb0;
import ip0.s7;
import ip0.t10;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import jsl.g0;
import jsl.j0;
import jv0.q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import le.u1;
import ns9.g;
import od0.i;
import qrb.n;
import y49.h;
import zhm.a0;
import zhm.d0;
import zhm.h0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f218602a;

    public /* synthetic */ c(int i) {
        this.f218602a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f218602a) {
            case 0:
                h it8 = (h) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return u1.a(it8);
            case 1:
                n it9 = (n) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return new d1b.b(it9.f248701a, it9.f248702b, it9.f248703c, it9.d, it9.e, it9.f);
            case 2:
                CustomAssetFieldDefinitions it10 = (CustomAssetFieldDefinitions) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return it10.f99230a;
            case 3:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return new nrd.c((List) getDefaultLoadingItems.invoke(), false);
            case 4:
                f it11 = (f) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                od0.h hVar = i.Companion;
                e7l.c cVar = it11.f123387p1;
                hVar.getClass();
                return od0.h.a(cVar);
            case 5:
                RowDelegate.Model it12 = (RowDelegate.Model) obj2;
                KProperty[] kPropertyArr = GroupTransactionsScreen.S;
                Intrinsics.checkNotNullParameter(it12, "it");
                Object obj3 = it12.u;
                if (obj3 instanceof GroupTransactionItem) {
                    return (GroupTransactionItem) obj3;
                }
                return null;
            case 6:
                vh it13 = (vh) obj2;
                KProperty[] kPropertyArr2 = GroupTransactionsScreen.S;
                Intrinsics.checkNotNullParameter(it13, "it");
                Object obj4 = ((RowDelegate.Model) it13.f54884b).u;
                if (obj4 instanceof GroupTransactionItem.Bill) {
                    return (GroupTransactionItem.Bill) obj4;
                }
                return null;
            case 7:
                Function0 getDefaultLoadingItems2 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems2, "getDefaultLoadingItems");
                return new g((List) getDefaultLoadingItems2.invoke());
            case 8:
                IntRange intRangeU = t61.a.u((Function0) obj2, "it", 0, 3, 1);
                ArrayList arrayList = new ArrayList(w.t(intRangeU, 10));
                vim.f it14 = intRangeU.iterator();
                while (it14.f289625c) {
                    arrayList.add(nb0.b(pb0.Companion, a0.d.n("TRUSTED_ENTITIES_CELL_LIST_ID_", it14.nextInt()), false, 0, false, 30));
                }
                return arrayList;
            case 9:
                List groupsUnsorted = (List) obj2;
                Intrinsics.checkNotNullParameter(groupsUnsorted, "groupsUnsorted");
                List listP0 = d0.P0(groupsUnsorted, new k2j.d(new nsd.a(), 19));
                if (listP0.size() <= 1) {
                    if (listP0.size() == 1) {
                        return (j) d0.K0(listP0);
                    }
                    return null;
                }
                amd.b bVar = amd.b.CREDIT;
                List list = listP0;
                ArrayList arrayList2 = new ArrayList();
                Iterator it15 = list.iterator();
                while (it15.hasNext()) {
                    a0.x(((j) it15.next()).f6333b, arrayList2);
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it16 = list.iterator();
                while (it16.hasNext()) {
                    a0.x(((j) it16.next()).f6334c, arrayList3);
                }
                return new j(bVar, arrayList2, arrayList3, false, null, 24);
            case 10:
                tsl.b it17 = (tsl.b) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return com.revolut.retail.trading.core.domain.orders.a.k(it17.f274172a);
            case 11:
                InvestOrder it18 = (InvestOrder) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return Boolean.valueOf(com.revolut.retail.trading.core.domain.orders.a.l(it18));
            case 12:
                InvestOrder it19 = (InvestOrder) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return tsl.g.b(it19);
            case 13:
                tsl.f it20 = (tsl.f) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                if (it20 instanceof tsl.b) {
                    return (tsl.b) it20;
                }
                return null;
            case 14:
                jsl.w it21 = (jsl.w) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                return it21.f178246a;
            case 15:
                i it22 = (i) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                return Optional.ofNullable(it22.g());
            case 16:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, error, h0Var);
                return Optional.empty();
            case 17:
                InvestOrder it23 = (InvestOrder) obj2;
                Intrinsics.checkNotNullParameter(it23, "it");
                return tsl.g.b(it23);
            case 18:
                ChargeBreakdown it24 = (ChargeBreakdown) obj2;
                Intrinsics.checkNotNullParameter(it24, "it");
                return Optional.of(it24);
            case 19:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Optional.empty();
            case 20:
                return ((jsl.w) obj2).f178246a;
            case 21:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                e eVarB = u.b();
                t10 t10Var = new t10("FUND_ORDER_DETAILS_CELL_NEXT_PRICE_PUBLICATION_INFO_LOADING", p10.f165755a);
                yp0.b.l(t10Var, 0, 0, 0, 0, null, false, 63);
                eVarB.add(t10Var);
                List listK = v.k(new s7("FUND_ORDER_DETAILS_CELL_STATUS", 0, 0, 0, 0, false, null, 126), new s7("FUND_ORDER_DETAILS_CELL_EXECUTION_DATE", 0, 0, 0, 0, false, null, 126), new s7("FUND_ORDER_DETAILS_CELL_CANCELLATION_DEADLINE", 0, 0, 0, 0, false, null, 126));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                eVarB.addAll(listK);
                List listK2 = v.k(new s7("FUND_ORDER_DETAILS_CELL_AMOUNT", 0, 0, 0, 0, false, null, 126), new s7("FUND_ORDER_DETAILS_CELL_LAST_AVAILABLE_PRICE", 0, 0, 0, 0, false, null, 126), new s7("FUND_ORDER_DETAILS_CELL_ESTIMATED_SHARES", 0, 0, 0, 0, false, null, 126));
                yp0.b.k(listK2, 0, 0, 0, 0, 31);
                eVarB.addAll(listK2);
                s7 s7Var = new s7("FUND_ORDER_DETAILS_CELL_ACCOUNT", 0, 0, 0, 0, false, null, 126);
                yp0.b.l(s7Var, 0, 0, 0, 0, null, false, 63);
                eVarB.add(s7Var);
                s7 s7Var2 = new s7("FUND_ORDER_DETAILS_CELL_FAQ_BUTTON_LOADING", 0, 0, 0, 0, false, null, 126);
                yp0.b.l(s7Var2, 0, 0, 0, 0, null, false, 63);
                eVarB.add(s7Var2);
                return new j0(g0.f178213a, u.a(eVarB));
            case 22:
                Function0 getDefaultLoadingItems3 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems3, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems3.invoke();
            case 23:
                SuggestionsBarDelegate.Suggestion it25 = (SuggestionsBarDelegate.Suggestion) obj2;
                KProperty[] kPropertyArr3 = GroupCreationScreen.T;
                Intrinsics.checkNotNullParameter(it25, "it");
                Object obj5 = it25.f53496h;
                if (obj5 instanceof nt9.h) {
                    return (nt9.h) obj5;
                }
                return null;
            case 24:
                SelectableDelegate.Model it26 = (SelectableDelegate.Model) obj2;
                KProperty[] kPropertyArr4 = TransferReasonsSearchScreen.T;
                Intrinsics.checkNotNullParameter(it26, "it");
                Object obj6 = it26.k;
                if (obj6 instanceof TransferReasonNode) {
                    return (TransferReasonNode) obj6;
                }
                return null;
            case 25:
                SingleChoiceDelegate.Model it27 = (SingleChoiceDelegate.Model) obj2;
                KProperty[] kPropertyArr5 = TransferReasonsSearchScreen.T;
                Intrinsics.checkNotNullParameter(it27, "it");
                Object obj7 = it27.f;
                if (obj7 instanceof TransferReasonNode) {
                    return (TransferReasonNode) obj7;
                }
                return null;
            case 26:
                ntf.g it28 = (ntf.g) obj2;
                Intrinsics.checkNotNullParameter(it28, "it");
                return it28.d;
            case 27:
                q it29 = (q) obj2;
                int i = nu0.c.f219166y;
                Intrinsics.checkNotNullParameter(it29, "it");
                od0.h hVar2 = i.Companion;
                oz0.a aVar = it29.f178759a;
                hVar2.getClass();
                return od0.h.a(aVar);
            case 28:
                nuc.h update = (nuc.h) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return nuc.h.a(update, null, null, null, nuc.i.f219286a, 15);
            default:
                nuc.h update2 = (nuc.h) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return nuc.h.a(update2, null, null, null, null, 15);
        }
    }

    public /* synthetic */ c(Object obj2, int i) {
        this.f218602a = i;
    }
}
