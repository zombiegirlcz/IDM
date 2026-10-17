package c4h;

import ael.k;
import ael.y;
import boh.f;
import c1g.o;
import com.revolut.shared.feature.wealth.domain.api.interactors.InstrumentTickerInteractor$Companion;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccounts;
import efm.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kel.j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import od0.i;
import rd0.e;
import w4l.h;
import ybl.d;
import ybl.l;
import zhm.q0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f21295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f21296c;

    public /* synthetic */ a(b bVar, String str, int i) {
        this.f21294a = i;
        this.f21295b = bVar;
        this.f21296c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Flow flowV;
        Object next;
        Flow gVar;
        switch (this.f21294a) {
            case 0:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                i iVar = (i) pair.f186385a;
                InstrumentTicker instrumentTicker = (InstrumentTicker) pair.f186386b;
                if (!iVar.d()) {
                    i.Companion.getClass();
                    return zi0.c.i(i.f224256b);
                }
                b bVar = this.f21295b;
                d dVar = bVar.d;
                String string = com.revolut.shared.feature.wealth.models.trading_accounts.d.l((TradingAccount) iVar.c()).f105210a.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return nim.a.v(nim.a.v(((y) dVar).c(new j(this.f21296c, string), h.f294642c), new c42.j(6)), new o(bVar, 3, instrumentTicker, iVar));
            default:
                TradingAccounts tradingAccounts = (TradingAccounts) obj2;
                Intrinsics.checkNotNullParameter(tradingAccounts, "tradingAccounts");
                b bVar2 = this.f21295b;
                bVar2.getClass();
                ybl.b bVar3 = bVar2.f21299c;
                List list = tradingAccounts.f105278a;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    TradingAccount tradingAccount = (TradingAccount) obj3;
                    if (!(tradingAccount instanceof TradingAccount.GIA) && !(tradingAccount instanceof TradingAccount.TaxAdvantage)) {
                        if (!(tradingAccount instanceof TradingAccount.PaperTrading) && !(tradingAccount instanceof TradingAccount.MoneyMarketFunds) && !(tradingAccount instanceof TradingAccount.Robo) && !(tradingAccount instanceof TradingAccount.Unknown) && !(tradingAccount instanceof TradingAccount.Margin)) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (com.revolut.shared.feature.wealth.models.trading_accounts.d.e(tradingAccount)) {
                        arrayList.add(obj3);
                    }
                }
                boolean zIsEmpty = arrayList.isEmpty();
                String str = this.f21296c;
                h hVar = h.f294642c;
                if (zIsEmpty) {
                    flowV = zi0.c.i(r0.g());
                } else {
                    int iB = q0.b(w.t(arrayList, 10));
                    if (iB < 16) {
                        iB = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                    for (Object obj4 : arrayList) {
                        linkedHashMap.put(com.revolut.shared.feature.wealth.models.trading_accounts.d.l((TradingAccount) obj4).f105210a.toString(), obj4);
                    }
                    Set<String> setKeySet = linkedHashMap.keySet();
                    ArrayList arrayList2 = new ArrayList(w.t(setKeySet, 10));
                    for (String str2 : setKeySet) {
                        d dVar2 = bVar2.d;
                        Intrinsics.h(str2);
                        arrayList2.add(e.c(((y) dVar2).c(new j(str, str2), hVar), g.f186406a));
                    }
                    flowV = nim.a.v(e.b(nim.a.w(mif.a.l(arrayList2), new c42.j(8))), new awk.j(linkedHashMap, 4));
                }
                r rVarC = e.c(flowV, g.f186406a);
                List list2 = tradingAccounts.f105278a;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj5 : list2) {
                    if (obj5 instanceof TradingAccount.Margin) {
                        arrayList3.add(obj5);
                    }
                }
                Iterator it8 = arrayList3.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (com.revolut.shared.feature.wealth.models.trading_accounts.d.e((TradingAccount.Margin) next)) {
                        }
                    } else {
                        next = null;
                    }
                }
                TradingAccount.Margin margin = (TradingAccount.Margin) next;
                if (margin != null) {
                    gVar = f.e(e.b(ybl.b.c(bVar3)), new o(bVar2, margin, str, 4));
                } else {
                    i.Companion.getClass();
                    gVar = new go.g(zi0.c.P(i.f224256b, false, null, 3), 2);
                }
                g gVar2 = g.f186406a;
                r rVarC2 = e.c(gVar, gVar2);
                ybl.b.Companion.getClass();
                r rVarDistinctUntilChanged = e.c(((k) bVar3).p(str, hVar, InstrumentTickerInteractor$Companion.f105074b.a()), gVar2).distinctUntilChanged();
                Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
                return mif.a.f(rVarC, rVarC2, rVarDistinctUntilChanged, e.c(l.d(bVar2.e), gVar2));
        }
    }
}
