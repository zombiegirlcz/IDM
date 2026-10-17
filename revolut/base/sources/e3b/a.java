package e3b;

import d3b.g;
import dj0.d;
import ej0.b;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import y49.c;
import y49.e;
import y49.f;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a {
    public static final f a(g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        d dVarO = mo3.a.o(gVar.getUnrealisedPnl());
        BigDecimal bigDecimal = new BigDecimal(gVar.getUnrealisedPerformance());
        d dVarO2 = mo3.a.o(gVar.getValue());
        List<g.a> cashBalances = gVar.getCashBalances();
        ArrayList arrayList = new ArrayList(w.t(cashBalances, 10));
        for (g.a aVar : cashBalances) {
            Intrinsics.checkNotNullParameter(aVar, "<this>");
            arrayList.add(new c(aVar.getId(), aVar.getCurrency(), mo3.a.o(aVar.getInvestable()), mo3.a.o(aVar.getWithdrawable()), mo3.a.o(aVar.getBlocked())));
        }
        List<g.b> positions = gVar.getPositions();
        ArrayList arrayList2 = new ArrayList(w.t(positions, 10));
        for (g.b bVar : positions) {
            Intrinsics.checkNotNullParameter(bVar, "<this>");
            String id10 = bVar.getId();
            String instrumentRef = bVar.getInstrumentRef();
            BigDecimal bigDecimal2 = new BigDecimal(bVar.getUnrealisedPerformance());
            d dVarO3 = mo3.a.o(bVar.getUnrealisedPnl());
            d dVarO4 = mo3.a.o(bVar.getValue());
            ko3.a midPrice = bVar.getMidPrice();
            b bVarQ = midPrice != null ? cj9.c.Q(midPrice) : null;
            b bVarQ2 = cj9.c.Q(bVar.getCurrentPrice());
            d dVarO5 = mo3.a.o(bVar.getExposure());
            String quantity = bVar.getQuantity();
            BigDecimal bigDecimal3 = quantity != null ? new BigDecimal(quantity) : null;
            ko3.a openingPrice = bVar.getOpeningPrice();
            b bVarQ3 = openingPrice != null ? cj9.c.Q(openingPrice) : null;
            String leverage = bVar.getLeverage();
            arrayList2.add(new e(id10, instrumentRef, dVarO3, bigDecimal2, dVarO4, dVarO5, bVarQ, bVarQ2, bVarQ3, bigDecimal3, leverage != null ? new BigDecimal(leverage) : null, bVar.getCreatedDate()));
        }
        return new f(dVarO, bigDecimal, dVarO2, arrayList, arrayList2);
    }
}
