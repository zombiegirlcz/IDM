package uzg;

import ael.h0;
import cfl.p;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.q;
import w4l.h;
import w4l.k;
import xi0.b;
import z8h.e;
import z8h.g;
import zi0.c;

/* JADX INFO: loaded from: classes9.dex */
public interface a {
    static Flow a(g gVar, String portfolioId, String instrumentRef, b currency, List list, k loadingStrategy) {
        Set setB;
        n9l.b updatePeriod = n9l.b.SEC_30;
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(instrumentRef, "instrumentRef");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(updatePeriod, "updatePeriod");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Map map = gVar.f;
        p pVar = p.MARGIN_TRADING;
        ybl.a aVar = (ybl.a) map.get(pVar);
        return xam.a.h(new e(gVar, portfolioId, currency, loadingStrategy, instrumentRef, updatePeriod, list, null), (aVar == null || (setB = aVar.b()) == null) ? c.i(Boolean.FALSE) : nim.a.v(((h0) gVar.f320146c).b(pVar), new g36.a(setB, portfolioId, 13)));
    }

    static Flow b(g gVar, String portfolioId, n9l.b period, int i) {
        gVar.getClass();
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(period, "period");
        h loadingStrategy = h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return xam.a.h(new z8h.c(gVar, portfolioId, loadingStrategy, period, null), q.q(gVar.d.b()));
    }
}
