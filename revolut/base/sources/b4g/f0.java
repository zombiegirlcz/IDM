package b4g;

import androidx.room.support.AutoClosingRoomOpenHelper;
import androidx.sqlite.db.SupportSQLiteDatabase;
import b6k.h;
import com.revolut.data.model.Data;
import com.revolut.feature.bank_transfer.models.PaymentVendor;
import com.revolut.feature.joint.impl.ui.invite_flow.InviteFlowContract$State;
import com.revolut.feature.travel.flights.models.domain.search.ChildPassenger;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.feature_move_money.api.model.OrderMode;
import com.revolut.feature_move_money.impl.amount.MoveMoneyAmountScreen;
import com.revolut.retail.trading.core.domain.orders.InvestCommodityOrder;
import com.revolut.retail.trading.core.domain.orders.InvestFundOrder;
import com.revolut.retail.trading.core.domain.orders.InvestMarginOrder;
import com.revolut.retail.trading.core.domain.orders.InvestMutualFundOrder;
import com.revolut.retail.trading.core.domain.orders.InvestOptionOrder;
import com.revolut.retail.trading.core.domain.orders.InvestOrder;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import jel.w2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import x2h.b;
import zhm.q0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12332a;

    public /* synthetic */ f0(int i) {
        this.f12332a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        OrderQuote orderQuote;
        OrderQuote orderQuote2;
        switch (this.f12332a) {
            case 0:
                ChildPassenger it8 = (ChildPassenger) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                String string = it8.f93564a.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return string;
            case 1:
                InvestOrder order = (InvestOrder) obj2;
                Intrinsics.checkNotNullParameter(order, "order");
                if (order instanceof InvestOrder.InvestSecuritiesOrder) {
                    return ((InvestOrder.InvestSecuritiesOrder) order).getD();
                }
                if (order instanceof InvestCommodityOrder) {
                    return ((InvestCommodityOrder) order).v;
                }
                if ((order instanceof InvestMarginOrder) || (order instanceof InvestFundOrder) || (order instanceof InvestMutualFundOrder) || (order instanceof InvestOptionOrder)) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            case 2:
                List vendors = (List) obj2;
                Intrinsics.checkNotNullParameter(vendors, "vendors");
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : vendors) {
                    if (!((PaymentVendor) obj3).f.isEmpty()) {
                        arrayList.add(obj3);
                    }
                }
                return arrayList;
            case 3:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return zhm.f0.f322471a;
            case 4:
                InviteFlowContract$State update = (InviteFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return InviteFlowContract$State.a(update, zhm.f0.f322471a, null, 2);
            case 5:
                InviteFlowContract$State update2 = (InviteFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return InviteFlowContract$State.a(update2, null, null, 1);
            case 6:
                b5e.i update3 = (b5e.i) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return b5e.i.a(update3, null, null, null, zi0.c.P(new hdh.e(zhm.f0.f322471a), false, null, 3), 15);
            case 7:
                jel.c it9 = (jel.c) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                if (it9 instanceof w2) {
                    return (w2) it9;
                }
                return null;
            case 8:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return b5e.l.f12500a;
            case 9:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return b.C1676b.f302573a;
            case 10:
                return AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.pokeOpen$lambda$0((SupportSQLiteDatabase) obj2);
            case 11:
                b6i.h it10 = (b6i.h) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return it10.f12783a;
            case 12:
                b6i.h newState = (b6i.h) obj2;
                Intrinsics.checkNotNullParameter(newState, "newState");
                s6i.e eVar = newState.f12783a;
                if (eVar != null) {
                    return new Pair(eVar, newState.f12787h);
                }
                return null;
            case 13:
                b6i.h newState2 = (b6i.h) obj2;
                Intrinsics.checkNotNullParameter(newState2, "newState");
                s6i.e eVar2 = newState2.f12783a;
                if (eVar2 == null) {
                    return null;
                }
                Pair pairN = v13.d.n(newState2.f12785c, eVar2);
                return new b6i.v((x5i.a) pairN.f186385a, (x5i.a) pairN.f186386b, newState2.f12787h);
            case 14:
                b6i.h newState3 = (b6i.h) obj2;
                Intrinsics.checkNotNullParameter(newState3, "newState");
                s6i.e eVar3 = newState3.f12783a;
                b6i.j jVar = newState3.f12784b;
                if (eVar3 == null) {
                    return null;
                }
                int i = b6i.a0.e[jVar.ordinal()];
                if (i == 1) {
                    return new b6i.y(jVar, eVar3.f260362a.f302979a.f115082a);
                }
                if (i == 2) {
                    return new b6i.y(jVar, eVar3.f260363b.f302979a.f115082a);
                }
                throw new NoWhenBranchMatchedException();
            case 15:
                b6i.h newState4 = (b6i.h) obj2;
                Intrinsics.checkNotNullParameter(newState4, "newState");
                s6i.e eVar4 = newState4.f12783a;
                b6i.l lVar = newState4.f12785c;
                if (eVar4 == null) {
                    return null;
                }
                Pair pairS2 = com.revolut.feature_move_money.impl.amount.c.S2(lVar, eVar4);
                return new b6i.z(lVar, (AccountWrapper) pairS2.f186386b, (AccountWrapper) pairS2.f186385a, newState4.f12787h);
            case 16:
                b6i.h update4 = (b6i.h) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return b6i.h.a(update4, null, null, null, null, false, false, null, new OrderMode.Market(null), 0, 383);
            case 17:
                b6i.h newState5 = (b6i.h) obj2;
                Intrinsics.checkNotNullParameter(newState5, "newState");
                s6i.e eVar5 = newState5.f12783a;
                if (eVar5 == null || (orderQuote = eVar5.e) == null) {
                    return null;
                }
                return orderQuote.f104761p;
            case 18:
                b6i.h newState6 = (b6i.h) obj2;
                Intrinsics.checkNotNullParameter(newState6, "newState");
                s6i.e eVar6 = newState6.f12783a;
                if (eVar6 == null || (orderQuote2 = eVar6.e) == null) {
                    return null;
                }
                return orderQuote2.f104760n;
            case 19:
                b6i.h update5 = (b6i.h) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return b6i.h.a(update5, null, null, null, null, false, false, null, null, update5.i + 1, 255);
            case 20:
                s6i.e eVar7 = ((b6i.h) obj2).f12783a;
                if (eVar7 != null) {
                    return eVar7.e;
                }
                return null;
            case 21:
                com.revolut.core.ui_kit.delegates.v model = (com.revolut.core.ui_kit.delegates.v) obj2;
                KProperty[] kPropertyArr = MoveMoneyAmountScreen.W;
                Intrinsics.checkNotNullParameter(model, "model");
                bw0.m mVar = model.f54837b.f164618g;
                Object obj4 = mVar != null ? mVar.e : null;
                if (obj4 instanceof q6i.r) {
                    return (q6i.r) obj4;
                }
                return null;
            case 22:
                com.revolut.core.ui_kit.delegates.v model2 = (com.revolut.core.ui_kit.delegates.v) obj2;
                KProperty[] kPropertyArr2 = MoveMoneyAmountScreen.W;
                Intrinsics.checkNotNullParameter(model2, "model");
                bw0.m mVar2 = model2.f54838c.f164618g;
                Object obj5 = mVar2 != null ? mVar2.e : null;
                if (obj5 instanceof q6i.r) {
                    return (q6i.r) obj5;
                }
                return null;
            case 23:
                com.revolut.core.ui_kit.delegates.v model3 = (com.revolut.core.ui_kit.delegates.v) obj2;
                KProperty[] kPropertyArr3 = MoveMoneyAmountScreen.W;
                Intrinsics.checkNotNullParameter(model3, "model");
                bw0.m mVar3 = model3.f54837b.f;
                Object obj6 = mVar3 != null ? mVar3.e : null;
                if (obj6 instanceof q6i.v) {
                    return (q6i.v) obj6;
                }
                return null;
            case 24:
                com.revolut.core.ui_kit.delegates.v model4 = (com.revolut.core.ui_kit.delegates.v) obj2;
                KProperty[] kPropertyArr4 = MoveMoneyAmountScreen.W;
                Intrinsics.checkNotNullParameter(model4, "model");
                bw0.m mVar4 = model4.f54838c.f;
                Object obj7 = mVar4 != null ? mVar4.e : null;
                if (obj7 instanceof q6i.v) {
                    return (q6i.v) obj7;
                }
                return null;
            case 25:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return h.a.f12853a;
            case 26:
                List walletProfilesExtended = (List) obj2;
                Intrinsics.checkNotNullParameter(walletProfilesExtended, "walletProfilesExtended");
                List<vf8.b> list = walletProfilesExtended;
                int iB = q0.b(zhm.w.t(list, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                for (vf8.b bVar : list) {
                    linkedHashMap.put(bVar.f288535a.f239484a, bVar.f288536b.f77099b);
                }
                return linkedHashMap;
            case 27:
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                od0.i iVar = (od0.i) rVar.f314201a;
                List list2 = (List) rVar.f314202b;
                List list3 = (List) rVar.f314203c;
                aim.e eVarB = zhm.u.b();
                String str = (String) iVar.f224257a;
                if (str != null) {
                    eVarB.add(str);
                }
                Intrinsics.h(list2);
                eVarB.addAll(list2);
                eVarB.addAll(list3);
                eVarB.add(null);
                return zhm.u.a(eVarB);
            case 28:
                Data it11 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return Boolean.valueOf(!it11.getLoading());
            default:
                Data walletProfiles = (Data) obj2;
                Intrinsics.checkNotNullParameter(walletProfiles, "walletProfiles");
                List list4 = (List) walletProfiles.getContent();
                if (list4 == null) {
                    return zhm.f0.f322471a;
                }
                List list5 = list4;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list5, 10));
                Iterator it12 = list5.iterator();
                while (it12.hasNext()) {
                    arrayList2.add(((psg.a) it12.next()).f239484a);
                }
                return arrayList2;
        }
    }

    public /* synthetic */ f0(com.revolut.feature_move_money.impl.amount.c cVar) {
        this.f12332a = 15;
    }
}
