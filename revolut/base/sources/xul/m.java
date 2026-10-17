package xul;

import aw0.o9;
import com.revolut.core.model.money.ScaleMode;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import java.math.BigDecimal;
import java.math.RoundingMode;
import k4l.r0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nel.z;
import wul.o;

/* JADX INFO: loaded from: classes12.dex */
public interface m {
    static Clause a(m mVar, nel.n instrument, InstrumentTicker instrumentTicker, bfl.g tradeSide, BigDecimal bigDecimal, Click click, r0 r0Var, int i) {
        ej0.b bVarY;
        if ((i & 8) != 0) {
            bigDecimal = null;
        }
        if ((i & 16) != 0) {
            click = null;
        }
        if ((i & 32) != 0) {
            r0Var = null;
        }
        ((o) mVar).getClass();
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(instrumentTicker, "instrumentTicker");
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        z zVar = instrumentTicker.d;
        dj0.d dVar = instrumentTicker.e;
        int i2 = wul.n.f300245a[zVar.ordinal()];
        if (i2 != 2) {
            if (i2 != 4) {
                return new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), click, o9.NON_SENSITIVE);
            }
            ej0.b bVarA = p2b.c.a(instrumentTicker, tradeSide, r0Var);
            Integer num = instrument.f214603n;
            return o.h(bVarA, click, num != null ? new ScaleMode.SimpleLen(num.intValue(), RoundingMode.HALF_UP) : null);
        }
        int i3 = wul.n.f300246b[tradeSide.ordinal()];
        if (i3 == 1) {
            bVarY = instrumentTicker.u;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            bVarY = instrumentTicker.f105124t;
        }
        if (bVarY == null && (bVarY = instrumentTicker.f) == null) {
            bVarY = new ej0.b(pyd.c.j(dVar), dVar.f115083b);
        }
        if (bigDecimal != null) {
            bVarY = mif.a.y(bVarY, bigDecimal);
        }
        return o.h(bVarY, click, ScaleMode.TradingPrecise.f51443a);
    }
}
