package g5b;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsStandaloneNoteDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.retail.trading.core.domain.orders.TradingOrderExitStrategy;
import d9.e1;
import g3e.s;
import java.math.BigDecimal;
import java.util.List;
import k4l.n0;
import kotlin.jvm.internal.Intrinsics;
import nel.n;

/* JADX INFO: loaded from: classes6.dex */
public final class m implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q2b.b f140737a;

    public m(q2b.b exitStrategyPriceCalculator) {
        Intrinsics.checkNotNullParameter(exitStrategyPriceCalculator, "exitStrategyPriceCalculator");
        this.f140737a = exitStrategyPriceCalculator;
    }

    public final CellDetailsStandaloneNoteDelegate.Model a(String str, int i, BigDecimal bigDecimal, BigDecimal bigDecimal2, n0 n0Var, TradingOrderExitStrategy tradingOrderExitStrategy, n nVar, bfl.g gVar) {
        Clause textClause;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
        if (bigDecimal2 != null) {
            BigDecimal bigDecimal3 = e1.I(bigDecimal) ? BigDecimal.ONE : bigDecimal;
            Intrinsics.h(bigDecimal3);
            xi0.b bVar = nVar.i;
            Integer num = nVar.f214603n;
            textClause = new MoneyClause(mif.a.R(this.f140737a.c(gVar, bigDecimal3, bigDecimal2, n0Var, tradingOrderExitStrategy, bVar, num != null ? num.intValue() : bigDecimal2.scale())), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4);
        } else {
            textClause = new TextClause("-", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        return new CellDetailsStandaloneNoteDelegate.Model(str, null, textLocalisedClause, textClause, null, false, null, 0, 0, 2034);
    }

    public final List b(Data exitStrategiesData, BigDecimal quantity, n instrument, bfl.g tradeSide, boolean z) {
        Intrinsics.checkNotNullParameter(exitStrategiesData, "exitStrategiesData");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        return (List) iii.c.f(exitStrategiesData, new g3e.h(23), new s(28), new k(0, instrument, quantity, this, tradeSide, z));
    }
}
