package upd;

import ael.y;
import com.revolut.data.model.Data;
import com.revolut.feature.wealth.ui.api.WealthUiApi$Toggles;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import zh9.u0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.spending_analytics.api.models.income_sorter.a f281964w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, com.revolut.feature.spending_analytics.api.models.income_sorter.a aVar, Continuation continuation) {
        super(2, continuation);
        this.v = hVar;
        this.f281964w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, this.f281964w, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        h hVar;
        w4l.h hVar2;
        Flow flowI;
        Pair pair = (Pair) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        List list = (List) pair.f186385a;
        TradingLegalEntityInformation tradingLegalEntityInformation = (TradingLegalEntityInformation) pair.f186386b;
        if (list.isEmpty()) {
            return new go.g(new Data(f0.f322471a, null, false, 6, null), 2);
        }
        List<TradingAccount> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (TradingAccount tradingAccount : list2) {
            hel.b bVar = tradingLegalEntityInformation.f105106a;
            List listJ = tradingAccount.J();
            ArrayList arrayList2 = new ArrayList(w.t(listJ, 10));
            Iterator it8 = listJ.iterator();
            while (true) {
                boolean zHasNext = it8.hasNext();
                hVar = this.v;
                hVar2 = w4l.h.f294642c;
                if (!zHasNext) {
                    break;
                }
                TradingAccount.Portfolio portfolio = (TradingAccount.Portfolio) it8.next();
                ybl.d dVar = hVar.d;
                String string = portfolio.f105210a.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                arrayList2.add(((y) dVar).e(string, hVar2));
            }
            akg.n nVarV = nim.a.v(u0.k(arrayList2), new upc.b(8));
            com.revolut.feature.spending_analytics.api.models.income_sorter.a investmentType = this.f281964w;
            Flow flowH = xam.a.h(new g(hVar, tradingAccount, investmentType, bVar, null), nVarV);
            c cVar = hVar.f;
            Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
            Intrinsics.checkNotNullParameter(investmentType, "investmentType");
            if (((jte.d) cVar.e).c(WealthUiApi$Toggles.InvestIncomeSorterV2.f95859c) && tradingAccount.getI() == cfl.d.BUY_SELL) {
                String string2 = com.revolut.shared.feature.wealth.models.trading_accounts.d.l(tradingAccount).f105210a.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                flowI = boh.f.e(u0.m(((y) cVar.f281960a).e(string2, hVar2), rd0.e.b(ybl.b.c(cVar.f281961b))), new ryd.f((Object) cVar, string2, (Object) tradingAccount, (Object) investmentType, (Object) bVar, 8));
            } else {
                flowI = zi0.c.i(f0.f322471a);
            }
            arrayList.add(nim.a.v(u0.m(flowH, flowI), new upc.b(7)));
        }
        return nim.a.v(u0.k(arrayList), new upc.b(9));
    }
}
