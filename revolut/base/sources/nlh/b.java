package nlh;

import com.revolut.feature.wealth.ui.api.navigation.trade.WealthTradeRedesignDestination;
import sih.c;

/* JADX INFO: loaded from: classes10.dex */
public final class b {
    public static WealthTradeRedesignDestination a(sih.b bVar) {
        c cVar;
        switch (bVar == null ? -1 : a.f217137a[bVar.ordinal()]) {
            case 1:
                cVar = c.STOCKS;
                break;
            case 2:
                cVar = c.COMMODITIES;
                break;
            case 3:
                cVar = c.BONDS;
                break;
            case 4:
                cVar = c.CFD;
                break;
            case 5:
                cVar = c.ETF;
                break;
            case 6:
                cVar = c.PRIVATE_MARKETS;
                break;
            case 7:
                cVar = c.MUTUAL_FUNDS;
                break;
            default:
                cVar = null;
                break;
        }
        return new WealthTradeRedesignDestination(cVar);
    }
}
