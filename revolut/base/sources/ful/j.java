package ful;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import k4l.r0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import nel.n;
import nel.z;
import wul.o;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f138294a;

    public j(o tradingOrderMapper) {
        Intrinsics.checkNotNullParameter(tradingOrderMapper, "tradingOrderMapper");
        this.f138294a = tradingOrderMapper;
    }

    public static TextLocalisedClause a(bfl.g tradeSide) {
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        m70.a.c(t0.f186434a);
        return c(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), tradeSide);
    }

    public static Clause b(n instrument, r0 orderType) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        if (instrument.b() && orderType == r0.MARKET) {
            return yoj.b.m(new TextClause(":", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new TextClause(instrument.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.wealth_trading_modesto_order_tag, null, null, 14)));
        }
        z zVar = instrument.f214597c;
        return (zVar == z.BOND || zVar == z.FUND || zVar == z.MUTUAL_FUND || zVar == z.STRUCTURED_NOTE) ? new TextClause(instrument.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : new TextClause(instrument.e, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    public static TextLocalisedClause c(Clause titleClause, bfl.g tradeSide) {
        int i;
        Intrinsics.checkNotNullParameter(titleClause, "titleClause");
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        int i2 = i.f138293c[tradeSide.ordinal()];
        if (i2 == 1) {
            i = R$string.wealth_stock_buy_screen_title;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.wealth_stock_sell_screen_title;
        }
        return new TextLocalisedClause(i, u.c(titleClause), null, 12);
    }
}
