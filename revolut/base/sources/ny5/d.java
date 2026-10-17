package ny5;

import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public interface d extends pri.f {
    static efm.r e(d dVar, List sortedCurrencies, gw5.a ratesStyle, List list, int i) {
        tzg.j timeFrame = tzg.j.ONE_DAY;
        if ((i & 32) != 0) {
            list = f0.f322471a;
        }
        List selectedCurrencies = list;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(sortedCurrencies, "sortedCurrencies");
        Intrinsics.checkNotNullParameter(ratesStyle, "ratesStyle");
        Intrinsics.checkNotNullParameter("RatesListSubheader", "listId");
        Intrinsics.checkNotNullParameter(timeFrame, "timeFrame");
        Intrinsics.checkNotNullParameter(selectedCurrencies, "selectedCurrencies");
        efm.r map = s(dVar, null, null, sortedCurrencies, ratesStyle, timeFrame, selectedCurrencies, 208).map(new nx7.i(new nxa.v(5), 12));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    static efm.r s(d dVar, TextLocalisedClause textLocalisedClause, CompositeClause compositeClause, List sortedCurrencies, gw5.a ratesStyle, tzg.j jVar, List selectedCurrencies, int i) {
        tzg.j timeFrame = jVar;
        int i2 = R$attr.uikit_dp16;
        if ((i & 256) != 0) {
            timeFrame = tzg.j.ONE_DAY;
        }
        if ((i & 512) != 0) {
            selectedCurrencies = f0.f322471a;
        }
        i iVar = (i) dVar;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(sortedCurrencies, "sortedCurrencies");
        Intrinsics.checkNotNullParameter(ratesStyle, "ratesStyle");
        Intrinsics.checkNotNullParameter("RatesListSubheader", "listId");
        Intrinsics.checkNotNullParameter(timeFrame, "timeFrame");
        Intrinsics.checkNotNullParameter(selectedCurrencies, "selectedCurrencies");
        g gVar = iVar.f220676h;
        efm.r map = te0.w.l(m70.a.g(zi0.c.o(gVar.a(sortedCurrencies)), null, new nsl.d(19), 1), m70.a.g(zi0.c.o(gVar.b(sortedCurrencies, timeFrame)), null, new nsl.d(20), 1)).map(new nx7.i(new njf.e(sortedCurrencies, 6), 13)).map(new nx7.i(new h(iVar, textLocalisedClause, compositeClause, ratesStyle, i2, selectedCurrencies), 14));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }
}
