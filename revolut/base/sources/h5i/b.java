package h5i;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.domain.models.transactions.ThreeDSTransaction;
import com.revolut.feature.apm.multibanco.api.navigation.MultibancoFlowDestination;
import com.revolut.feature.apm.multibanco.api.navigation.MultibancoFlowInputData;
import com.revolut.feature_market_data.impl.R$string;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import d4i.a;
import do3.n;
import do3.q;
import h74.h;
import h74.r;
import ip0.pb0;
import ip0.um0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.ranges.IntRange;
import od0.i;
import qf1.t;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f149560a;

    public /* synthetic */ b(int i) {
        this.f149560a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f149560a) {
            case 0:
                Intrinsics.checkNotNullParameter((OrderQuote) obj2, "$this$fees");
                return new TextLocalisedClause(R$string.market_data_exchange_summary_fee, null, null, 14);
            case 1:
                OrderQuote taxes = (OrderQuote) obj2;
                Intrinsics.checkNotNullParameter(taxes, "$this$taxes");
                return new d4i.b(taxes.f104755g.f104732b);
            case 2:
                OrderQuote effectiveRate = (OrderQuote) obj2;
                Intrinsics.checkNotNullParameter(effectiveRate, "$this$effectiveRate");
                return a.C0664a.f111322a;
            case 3:
                OrderQuote price = (OrderQuote) obj2;
                Intrinsics.checkNotNullParameter(price, "$this$price");
                f8l.b bVar = price.f104753b;
                Amount amount = price.f104754c;
                Amount amount2 = price.e;
                int i = e.f149564b[bVar.ordinal()];
                if (i == 1) {
                    return new d4i.d(amount.f104718b, amount2.f104718b);
                }
                if (i == 2) {
                    return new d4i.d(amount2.f104718b, amount.f104718b);
                }
                throw new NoWhenBranchMatchedException();
            case 4:
                OrderQuote fees = (OrderQuote) obj2;
                Intrinsics.checkNotNullParameter(fees, "$this$fees");
                return new d4i.b(fees.f104755g.f104731a);
            case 5:
                OrderQuote amount3 = (OrderQuote) obj2;
                Intrinsics.checkNotNullParameter(amount3, "$this$amount");
                return new TextLocalisedClause(R$string.market_data_transaction_breakdown_received, null, null, 14);
            case 6:
                OrderQuote amount4 = (OrderQuote) obj2;
                Intrinsics.checkNotNullParameter(amount4, "$this$amount");
                return new TextLocalisedClause(R$string.market_data_transaction_breakdown_received, null, null, 14);
            case 7:
                OrderQuote fees2 = (OrderQuote) obj2;
                Intrinsics.checkNotNullParameter(fees2, "$this$fees");
                return new d4i.b(fees2.f104755g.f104731a);
            case 8:
                Intrinsics.checkNotNullParameter((OrderQuote) obj2, "$this$fees");
                return new TextLocalisedClause(R$string.market_data_exchange_summary_fee, null, null, 14);
            case 9:
                List pendingTransactions = (List) obj2;
                Intrinsics.checkNotNullParameter(pendingTransactions, "pendingTransactions");
                List list = pendingTransactions;
                boolean z = false;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it8 = list.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            if (((ThreeDSTransaction) it8.next()).f60536c > 0) {
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 10:
                n nVar = (n) obj2;
                Intrinsics.h(nVar);
                return q.y(nVar);
            case 11:
                h66.a update = (h66.a) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return h66.a.a(update, !update.f149593a, false, false, false, 14);
            case 12:
                h66.a update2 = (h66.a) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return h66.a.a(update2, false, !update2.f149594b, false, false, 13);
            case 13:
                h66.a update3 = (h66.a) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return h66.a.a(update3, false, false, !update3.f149595c, false, 11);
            case 14:
                h66.a update4 = (h66.a) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return h66.a.a(update4, false, false, false, true, 7);
            case 15:
                return h66.a.a((h66.a) obj2, false, false, false, false, 7);
            case 16:
                Function0 defaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(defaultLoadingItems, "defaultLoadingItems");
                return (List) defaultLoadingItems.invoke();
            case 17:
                lk0.e lowerPage = (lk0.e) obj2;
                Intrinsics.checkNotNullParameter(lowerPage, "lowerPage");
                String str = lowerPage.d;
                if (str == null) {
                    return null;
                }
                String portfolioId = ((i6h.e) lowerPage.f196172b).f159014a;
                Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                return new i6h.e(portfolioId, str);
            case 18:
                lk0.e it9 = (lk0.e) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return null;
            case 19:
                Boolean vvEnabled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(vvEnabled, "vvEnabled");
                return new MultibancoFlowDestination(vvEnabled.booleanValue() ? MultibancoFlowInputData.StartType.ViaVerde.f62552a : MultibancoFlowInputData.StartType.Area.f62547a);
            case 20:
                h74.a update5 = (h74.a) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return h74.a.a(update5, null, new Data(null, null, true, 3, null), 1);
            case 21:
                Function0 it10 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                m70.a.c(t0.f186434a);
                TextLocalisedClause textLocalisedClauseA = r.a("");
                IntRange intRange = new IntRange(1, 5, 1);
                ArrayList arrayList = new ArrayList(w.t(intRange, 10));
                vim.f it11 = intRange.iterator();
                while (it11.f289625c) {
                    pb0 pb0Var = new pb0(a0.d.n("ID_LOADING_ITEM_", it11.nextInt() - 1));
                    yp0.b.l(pb0Var, 0, 0, 0, 0, null, false, 63);
                    arrayList.add(pb0Var);
                }
                return new h(textLocalisedClauseA, arrayList);
            case 22:
                ListSubheaderDelegate.Model it12 = (ListSubheaderDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                Object obj3 = it12.f52715m;
                if (obj3 instanceof h87.h) {
                    return (h87.h) obj3;
                }
                return null;
            case 23:
                if (!((Boolean) obj2).booleanValue()) {
                    i.Companion.getClass();
                    return i.f224256b;
                }
                od0.h hVar = i.Companion;
                t tVar = new t("JUNIOR_POCKET_CREATION_ID");
                hVar.getClass();
                return od0.h.a(tVar);
            case 24:
                TradingAccount it13 = (TradingAccount) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return Boolean.valueOf(it13 instanceof TradingAccount.GIA);
            case 25:
                List events = (List) obj2;
                Intrinsics.checkNotNullParameter(events, "events");
                List listV0 = d0.V0(events, 3);
                return listV0 == null ? events : listV0;
            case 26:
                List events2 = (List) obj2;
                Intrinsics.checkNotNullParameter(events2, "events");
                List listV02 = d0.V0(events2, 1);
                return listV02 == null ? events2 : listV02;
            case 27:
                um0 it14 = (um0) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return Boolean.valueOf(Intrinsics.f(it14.f166695a, "CORPORATE_EVENTS_TWIN_BUTTON_ID"));
            case 28:
                Object obj4 = ((um0) obj2).d;
                kp3.a aVar = obj4 instanceof kp3.a ? (kp3.a) obj4 : null;
                iel.a aVar2 = aVar != null ? aVar.f188164a : null;
                iel.h hVar2 = aVar2 instanceof iel.h ? (iel.h) aVar2 : null;
                if (hVar2 != null) {
                    return oi0.d.i(hVar2);
                }
                return null;
            default:
                LargeActionButtonDelegate.Model it15 = (LargeActionButtonDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return Boolean.valueOf(Intrinsics.f(it15.f52613a, "CORPORATE_EVENTS_EARNING_CALL_BUTTON_ID"));
        }
    }
}
