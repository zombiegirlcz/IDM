package n1j;

import aw0.m6;
import aw0.n6;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.ai;
import com.revolut.core.ui_kit.delegates.g6;
import com.revolut.data.model.Data;
import com.revolut.feature.card_order_new.impl.newcard.OrderNewCardActivity;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.feature_exchange.impl.ui.exchange.market_order.model.ExchangeOrderDraft;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import ip0.s7;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import v30.s0;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class t implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f211403a;

    public /* synthetic */ t(int i) {
        this.f211403a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        boolean z = true;
        switch (this.f211403a) {
            case 0:
                m it8 = (m) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                r rVar = it8.f211391c;
                if (rVar != null) {
                    return rVar.f211398a;
                }
                return null;
            case 1:
                m state = (m) obj2;
                Intrinsics.checkNotNullParameter(state, "state");
                return (List) state.f211389a.getContent();
            case 2:
                List accounts = (List) obj2;
                Intrinsics.checkNotNullParameter(accounts, "accounts");
                List list = accounts;
                if ((list instanceof Collection) && list.isEmpty()) {
                    z = false;
                } else {
                    Iterator it9 = list.iterator();
                    while (it9.hasNext()) {
                        if (((WealthAccount) it9.next()) instanceof WealthAccount.TaxAdvantageWealthAccount.JIsa.Personal) {
                        }
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            case 3:
                WealthAccount it10 = (WealthAccount) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return Boolean.valueOf(it10.Q2());
            case 4:
                WealthAccount account = (WealthAccount) obj2;
                Intrinsics.checkNotNullParameter(account, "account");
                return Boolean.valueOf(account.Q2());
            case 5:
                List accounts2 = (List) obj2;
                Intrinsics.checkNotNullParameter(accounts2, "accounts");
                List<WealthAccount> list2 = accounts2;
                if ((list2 instanceof Collection) && list2.isEmpty()) {
                    z = false;
                } else {
                    for (WealthAccount wealthAccount : list2) {
                        if (!wealthAccount.available() || !(wealthAccount instanceof WealthAccount.Securities)) {
                        }
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            case 6:
                ybl.h it11 = (ybl.h) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return Boolean.valueOf(it11.d(TradingAccountType.Gia.f105270a));
            case 7:
                rlm.f Json = (rlm.f) obj2;
                Intrinsics.checkNotNullParameter(Json, "$this$Json");
                Json.f255101c = true;
                return Unit.f186387a;
            case 8:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return new lw0.h(lw0.i.TITLE_SUBTITLE);
            case 9:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                IntRange intRangeO = kotlin.ranges.f.o(0, 3);
                ArrayList arrayList = new ArrayList(zhm.w.t(intRangeO, 10));
                vim.f it12 = intRangeO.iterator();
                while (it12.f289625c) {
                    arrayList.add(new s7(a0.d.n("CELL_DELEGATE_LOADING_ITEM_ID", it12.nextInt()), 0, 0, 0, 0, false, null, 126));
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                return arrayList;
            case 10:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                n6.Companion.getClass();
                return new aw0.e(false, null, null, m6.a(), null, null, 55);
            case 11:
                ExchangeOrderDraft draft = (ExchangeOrderDraft) obj2;
                Intrinsics.checkNotNullParameter(draft, "draft");
                return draft.e;
            case 12:
                CellDetailsSwitcherDelegate.Model it13 = (CellDetailsSwitcherDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return Boolean.valueOf(Intrinsics.f(it13.f51913a, "BUY_TAKE_PROFIT_STOP_LOSS_ITEM_ID"));
            case 13:
                LargeActionButtonDelegate.Model it14 = (LargeActionButtonDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return Boolean.valueOf(Intrinsics.f(it14.f52613a, "TAKE_PROFIT_STOP_LOSS_LARGE_BUTTON_LIST_ID"));
            case 14:
                List wrappers = (List) obj2;
                Intrinsics.checkNotNullParameter(wrappers, "wrappers");
                return wrappers.isEmpty() ? m2j.a.f202010a : new m2j.b(new k1j.b(k1j.c.DEFI, null, wrappers, 6));
            case 15:
                List wrappers2 = (List) obj2;
                Intrinsics.checkNotNullParameter(wrappers2, "wrappers");
                return zhm.w.u(wrappers2);
            case 16:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return f0.f322471a;
            case 17:
                List walletsWithPockets = (List) obj2;
                Intrinsics.checkNotNullParameter(walletsWithPockets, "walletsWithPockets");
                return (List) ((Pair) zhm.d0.b0(walletsWithPockets)).f186386b;
            case 18:
                do3.n it15 = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return it15.f116408a;
            case 19:
                v20.l clientInfo = (v20.l) obj2;
                Intrinsics.checkNotNullParameter(clientInfo, "clientInfo");
                return Boolean.valueOf(clientInfo.f285455a);
            case 20:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list3 = (List) pair.f186385a;
                List list4 = (List) pair.f186386b;
                ArrayList arrayList2 = new ArrayList(list4.size() + list3.size());
                zhm.a0.x(list3, arrayList2);
                zhm.a0.x(list4, arrayList2);
                return zhm.d0.P0(arrayList2, new n30.h());
            case 21:
                Object[] tickets = (Object[]) obj2;
                Intrinsics.checkNotNullParameter(tickets, "tickets");
                List listV0 = kotlin.collections.d.v0(tickets);
                Intrinsics.i(listV0, "null cannot be cast to non-null type kotlin.collections.List<com.revolut.chat.domain.model.SupportTicket>");
                return listV0;
            case 22:
                List tickets2 = (List) obj2;
                Intrinsics.checkNotNullParameter(tickets2, "tickets");
                List<v30.j> list5 = tickets2;
                if ((list5 instanceof Collection) && list5.isEmpty()) {
                    z = false;
                } else {
                    for (v30.j jVar : list5) {
                        if (jVar.p() == s0.OPEN || jVar.p() == s0.RESOLVED) {
                        }
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            case 23:
                Throwable it16 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return new Data(null, it16, false, 5, null);
            case 24:
                List it17 = (List) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return Integer.valueOf(it17.size());
            case 25:
                g6 it18 = (g6) obj2;
                KProperty[] kPropertyArr = OrderNewCardActivity.J0;
                Intrinsics.checkNotNullParameter(it18, "it");
                return it18.f54199a;
            case 26:
                ai it19 = (ai) obj2;
                KProperty[] kPropertyArr2 = OrderNewCardActivity.J0;
                Intrinsics.checkNotNullParameter(it19, "it");
                return it19.f53687a;
            case 27:
                ProductSelectionDelegate.Model it20 = (ProductSelectionDelegate.Model) obj2;
                KProperty[] kPropertyArr3 = OrderNewCardActivity.J0;
                Intrinsics.checkNotNullParameter(it20, "it");
                Object obj3 = it20.i;
                if (obj3 instanceof n33.e) {
                    return (n33.e) obj3;
                }
                return null;
            case 28:
                LargeActionButtonDelegate.Model it21 = (LargeActionButtonDelegate.Model) obj2;
                KProperty[] kPropertyArr4 = OrderNewCardActivity.J0;
                Intrinsics.checkNotNullParameter(it21, "it");
                return it21.f52613a;
            default:
                TextDelegate.Model it22 = (TextDelegate.Model) obj2;
                KProperty[] kPropertyArr5 = OrderNewCardActivity.J0;
                Intrinsics.checkNotNullParameter(it22, "it");
                return it22.f53531a;
        }
    }

    public /* synthetic */ t(n2j.c cVar) {
        this.f211403a = 14;
    }
}
