package p1h;

import aw0.wa;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import l9.l;
import nbh.c;
import nbh.e;
import nbh.f;
import nel.e0;
import nel.n;
import nel.z;

/* JADX INFO: loaded from: classes9.dex */
public interface a {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    static RowDelegate.Model.c.b a(a aVar, n instrument, InstrumentTicker instrumentTicker, MoneyClause.Format.Defaults defaults, BigDecimal bigDecimal, int i) {
        PercentageClause percentageClause;
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        MoneyClause.Format.Defaults primaryMoneyFormat = (i & 4) != 0 ? new MoneyClause.Format.Defaults(null, null, false, false, 7) : defaults;
        BigDecimal bigDecimal4 = (i & 8) != 0 ? null : bigDecimal;
        f fVar = (f) aVar;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(primaryMoneyFormat, "primaryMoneyFormat");
        z zVar = instrument.f214597c;
        int[] iArr = e.f214080a;
        switch (iArr[zVar.ordinal()]) {
            case 1:
                if (instrumentTicker == null || (bigDecimal2 = instrumentTicker.f105125w) == null) {
                    percentageClause = null;
                } else {
                    BigDecimal bigDecimalMultiply = bigDecimal2.multiply(new BigDecimal(100));
                    Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
                    percentageClause = new PercentageClause(bigDecimalMultiply, new PercentageClause.Format.Custom(2, 4, null, wa.SHOW_ALL_ZEROES, RoundingMode.HALF_UP), (Style) null, 4);
                }
                return new RowDelegate.Model.c.b(percentageClause, (instrumentTicker != null ? instrumentTicker.f105125w : null) != null ? new TextLocalisedClause(R$string.trading_bonds_stats_screen_tabs_yield, null, null, 14) : null, null, false, 124);
            case 2:
                return null;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
                c cVar = fVar.f214081a;
                MoneyClause moneyClauseB = instrumentTicker != null ? cVar.b(instrument, instrumentTicker, primaryMoneyFormat) : null;
                switch (iArr[instrument.f214597c.ordinal()]) {
                    case 1:
                        break;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        if (bigDecimal4 != null) {
                            clauseA = l.N(bigDecimal4);
                        }
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                if (clauseA == null) {
                    clauseA = cVar.a(instrument, instrumentTicker);
                }
                return new RowDelegate.Model.c.b(moneyClauseB, clauseA, null, false, 124);
            case 13:
                nel.a aVar2 = instrument.f214599h;
                e0 e0Var = aVar2 instanceof e0 ? (e0) aVar2 : null;
                if (e0Var != null && (bigDecimal3 = e0Var.f214566b) != null) {
                    BigDecimal bigDecimalMultiply2 = bigDecimal3.multiply(new BigDecimal(100));
                    Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply2, "multiply(...)");
                    return new RowDelegate.Model.c.b(l.N(bigDecimalMultiply2), new TextLocalisedClause(R$string.trading_structured_notes_instrument_widget_target_profit, null, null, 14), null, false, 124);
                }
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
