package nbh;

import aw0.o9;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import d9.t0;
import java.math.BigDecimal;
import jb3.l;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nel.n;

/* JADX INFO: loaded from: classes9.dex */
public final class c {
    public final CompositeClause a(n instrument, InstrumentTicker instrumentTicker) {
        BigDecimal bigDecimalN;
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        switch (b.f214079a[instrument.f214597c.ordinal()]) {
            case 1:
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
                if (instrumentTicker == null || (bigDecimalN = l.N(instrumentTicker)) == null) {
                    return null;
                }
                return l9.l.N(bigDecimalN);
            case 2:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final MoneyClause b(n instrument, InstrumentTicker instrumentTicker, MoneyClause.Format primaryMoneyFormat) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(instrumentTicker, "instrumentTicker");
        Intrinsics.checkNotNullParameter(primaryMoneyFormat, "primaryMoneyFormat");
        switch (b.f214079a[instrument.f214597c.ordinal()]) {
            case 1:
            case 2:
                ej0.b bVar = instrumentTicker.f;
                return new MoneyClause(bVar != null ? t0.D(bVar, instrument) : instrumentTicker.e, primaryMoneyFormat, null, o9.NON_SENSITIVE, 4);
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
                return new MoneyClause(instrumentTicker.e, primaryMoneyFormat, null, o9.NON_SENSITIVE, 4);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
