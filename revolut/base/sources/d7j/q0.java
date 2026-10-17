package d7j;

import com.revolut.feature.trading_orders.api.invest.placement.account.selector.InvestAccountSelectorContract$Account;
import com.revolut.feature.trading_orders.api.invest.placement.account.selector.InvestAccountSelectorContract$CommodityAccount;
import com.revolut.feature.trading_orders.api.invest.placement.account.selector.InvestAccountSelectorContract$InvestAccount;
import com.revolut.feature.trading_orders.api.invest.placement.account.selector.InvestAccountSelectorContract$MainAccount;
import com.revolut.feature.trading_orders.api.invest.placement.account.selector.InvestAccountSelectorContract$OutputData;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangeOrderDraft;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.MoneyDetails;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.RecurringBuySettings;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class q0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g f112043b;

    public /* synthetic */ q0(com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g gVar, int i) {
        this.f112042a = i;
        this.f112043b = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        yhm.r rVar;
        Object next;
        TradingAccount.Portfolio portfolio;
        i7j.j jVar;
        int i = this.f112042a;
        com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g gVar = this.f112043b;
        switch (i) {
            case 0:
                InvestAccountSelectorContract$OutputData outputData = (InvestAccountSelectorContract$OutputData) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                InvestAccountSelectorContract$Account investAccountSelectorContract$Account = outputData.f91715a;
                if (investAccountSelectorContract$Account instanceof InvestAccountSelectorContract$InvestAccount) {
                    kel.a aVar = ((InvestAccountSelectorContract$InvestAccount) investAccountSelectorContract$Account).f91713a.f183148a;
                    rVar = new yhm.r(aVar.e, wd6.i.TRADING, aVar.f183145a);
                } else if (investAccountSelectorContract$Account instanceof InvestAccountSelectorContract$MainAccount) {
                    io3.d dVar = ((InvestAccountSelectorContract$MainAccount) investAccountSelectorContract$Account).f91714a;
                    rVar = new yhm.r(dVar.f163147c, wd6.i.CURRENT, dVar.f163145a);
                } else {
                    if (!(investAccountSelectorContract$Account instanceof InvestAccountSelectorContract$CommodityAccount)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    InvestAccountSelectorContract$CommodityAccount investAccountSelectorContract$CommodityAccount = (InvestAccountSelectorContract$CommodityAccount) investAccountSelectorContract$Account;
                    String str = investAccountSelectorContract$CommodityAccount.f91703a.f306286a;
                    wd6.i iVar = wd6.i.CURRENT;
                    io3.d dVar2 = investAccountSelectorContract$CommodityAccount.f91704b;
                    rVar = new yhm.r(str, iVar, dVar2 != null ? dVar2.f163145a : null);
                }
                String str2 = (String) rVar.f314201a;
                wd6.i iVar2 = (wd6.i) rVar.f314202b;
                String str3 = (String) rVar.f314203c;
                xi0.b.Companion.getClass();
                com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g gVar2 = this.f112043b;
                gVar2.n2(new c5a.m0(19, gVar2, xi0.a.a(str2), str3, iVar2, null), new whi.b(6));
                return Unit.f186387a;
            case 1:
                List accounts = (List) obj2;
                Intrinsics.checkNotNullParameter(accounts, "accounts");
                Iterator it8 = accounts.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (next instanceof WealthAccount.Securities) {
                        }
                    } else {
                        next = null;
                    }
                }
                WealthAccount.Securities securities = (WealthAccount.Securities) next;
                if (securities != null && (portfolio = securities.f95240c) != null) {
                    obj = portfolio.f105210a;
                }
                String strValueOf = String.valueOf(obj);
                ybl.d dVar3 = gVar.D;
                ybl.c cVar = ybl.d.Companion;
                return nim.a.v(((ael.y) dVar3).e(strValueOf, w4l.h.f294642c), new p0(5));
            case 2:
                h1j.b outputData2 = (h1j.b) obj2;
                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                if (outputData2 instanceof h1j.d) {
                    h1j.d dVar4 = (h1j.d) outputData2;
                    com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g gVar3 = this.f112043b;
                    gVar3.n2(new c5a.m0(19, gVar3, dVar4.f148581b, dVar4.f148580a, wd6.i.CURRENT, null), new whi.b(6));
                }
                return Unit.f186387a;
            case 3:
                o7j.p output = (o7j.p) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                gVar.n2(new com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.c(gVar, output, null), new whi.b(6));
                return Unit.f186387a;
            case 4:
                h1j.b outputData3 = (h1j.b) obj2;
                Intrinsics.checkNotNullParameter(outputData3, "outputData");
                if (outputData3 instanceof h1j.c) {
                    xi0.a aVar2 = xi0.b.Companion;
                    String str4 = ((h1j.c) outputData3).f148579a;
                    aVar2.getClass();
                    com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g gVar4 = this.f112043b;
                    gVar4.n2(new c5a.m0(19, gVar4, xi0.a.a(str4), null, wd6.i.CURRENT, null), new whi.b(6));
                }
                return Unit.f186387a;
            case 5:
                ExchangeOrderDraft orderDraft = (ExchangeOrderDraft) obj2;
                Intrinsics.checkNotNullParameter(orderDraft, "orderDraft");
                b7j.b bVar = gVar.f99865w;
                return b7j.b.m(bVar.k(bVar.l(orderDraft, wd6.h.RECURRING), i7j.j.BOTTOM, true), new RecurringBuySettings(((l80.f) gVar.K.f138226a).e(), sel.a.WEEKLY));
            case 6:
                ExchangeOrderDraft draft = (ExchangeOrderDraft) obj2;
                Intrinsics.checkNotNullParameter(draft, "draft");
                MoneyDetails moneyDetails = draft.f99886b;
                b7j.b bVar2 = gVar.f99865w;
                l4i.a aVar3 = gVar.o;
                dj0.d dVar5 = new dj0.d(moneyDetails.f99905c, moneyDetails.f99903a);
                aVar3.getClass();
                return bVar2.o(draft, l4i.a.e(dVar5));
            case 7:
                ExchangeOrderDraft draft2 = (ExchangeOrderDraft) obj2;
                Intrinsics.checkNotNullParameter(draft2, "draft");
                return gVar.f99865w.n(draft2, 100);
            case 8:
                ExchangeOrderDraft exchangeOrderDraft = (ExchangeOrderDraft) obj2;
                if (exchangeOrderDraft.f99887c != wd6.e.SELL) {
                    return exchangeOrderDraft;
                }
                b7j.b bVar3 = gVar.f99865w;
                l4i.a aVar4 = gVar.o;
                MoneyDetails moneyDetails2 = exchangeOrderDraft.f99885a;
                dj0.d dVar6 = new dj0.d(moneyDetails2.f99905c, moneyDetails2.f99903a);
                aVar4.getClass();
                return bVar3.o(exchangeOrderDraft, l4i.a.e(dVar6));
            default:
                ExchangeOrderDraft exchangeOrderDraft2 = (ExchangeOrderDraft) obj2;
                int i2 = u1.f112062a[exchangeOrderDraft2.f.ordinal()];
                if (i2 == 1) {
                    jVar = i7j.j.BOTTOM;
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jVar = i7j.j.TOP;
                }
                return gVar.f99865w.k(exchangeOrderDraft2, jVar, true);
        }
    }
}
