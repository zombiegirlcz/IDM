package wfh;

import ael.y;
import com.revolut.feature.wealth.api.ui.invest.transactions.list.InvestTransactionsListContract$Disclaimers;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.revolut.shared.feature.wealth.models.transaction.InvestTransactionsFilter;
import com.revolut.trading.orders.domain.models.InvestOrdersParams;
import fsl.w;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.r0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f297137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.wealth.private_equity.impl.ui.fund_details.d f297138b;

    public /* synthetic */ p(com.revolut.feature.wealth.private_equity.impl.ui.fund_details.d dVar, int i) {
        this.f297137a = i;
        this.f297138b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f297137a) {
            case 0:
                nel.n instrument = (nel.n) obj2;
                Intrinsics.checkNotNullParameter(instrument, "instrument");
                hbh.o oVar = this.f297138b.f95791t;
                InvestTransactionsFilter.Companion companion = InvestTransactionsFilter.INSTANCE;
                xi0.a aVar = xi0.b.Companion;
                String str = instrument.f214596b;
                aVar.getClass();
                List listC = zhm.u.c(xi0.a.a(str));
                companion.getClass();
                return oVar.b(InvestTransactionsFilter.Companion.b(listC), w4l.h.f294642c);
            case 1:
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                nel.n nVar = (nel.n) rVar.f314201a;
                od0.i iVar = (od0.i) rVar.f314202b;
                InstrumentTicker instrumentTicker = (InstrumentTicker) rVar.f314203c;
                com.revolut.feature.wealth.private_equity.impl.ui.fund_details.d dVar = this.f297138b;
                ybl.d dVar2 = dVar.f95793x;
                String str2 = nVar.f214596b;
                String string = com.revolut.shared.feature.wealth.models.trading_accounts.d.l((TradingAccount) iVar.c()).f105210a.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return nim.a.v(((y) dVar2).c(new kel.j(str2, string), w4l.h.f294642c), new w38.v(dVar, instrumentTicker, 29));
            case 2:
                Set refs = (Set) obj2;
                Intrinsics.checkNotNullParameter(refs, "refs");
                return refs.isEmpty() ? zi0.c.i(r0.g()) : nim.a.v(((ael.k) this.f297138b.f95788q).l(refs), new wf6.p(19));
            case 3:
                List it8 = (List) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                h1h.b bVar = this.f297138b.u;
                InvestTransactionsFilter.INSTANCE.getClass();
                InvestTransactionsFilter.InvestTransactionsFilterImpl investTransactionsFilterImplB = InvestTransactionsFilter.Companion.b(it8);
                InvestTransactionsListContract$Disclaimers.INSTANCE.getClass();
                return bVar.c3(investTransactionsFilterImplB, w4l.h.f294642c, new h1h.c(false, InvestTransactionsListContract$Disclaimers.Companion.b()));
            case 4:
                Set it9 = (Set) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return ((w) this.f297138b.f95790s).a(new InvestOrdersParams.OrdersByCurrencies(it9, null, 30));
            case 5:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                nel.n nVar2 = (nel.n) pair.f186385a;
                od0.i iVar2 = (od0.i) pair.f186386b;
                vrl.s sVar = this.f297138b.f95794y;
                String string2 = com.revolut.shared.feature.wealth.models.trading_accounts.d.l((TradingAccount) iVar2.c()).f105210a.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                return rd0.e.b(sVar.a(string2, nVar2.f214596b, bfl.g.BUY, (56 & 8) != 0 ? null : null, (56 & 16) != 0 ? null : Boolean.FALSE, null, (56 & 64) != 0 ? w4l.h.f294642c : w4l.h.f294642c));
            default:
                l update = (l) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return l.e(update, null, null, null, null, null, null, !((l) ((j2) this.f297138b.E.f22677a).getValue()).f297124h, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097023);
        }
    }
}
