package yd9;

import aw0.ka;
import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.feature.recurringbuys.common.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import ofm.q;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import qua.p;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public abstract class n {
    public static final Clause a(p pVar) {
        Clause textClause;
        Clause textClause2;
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        boolean z = cp5.d.z(c(pVar));
        LocalDate localDate = pVar.f249314a.f;
        if (localDate != null) {
            textClause = new TimeClause(localDate.toDateTimeAtStartOfDay(DateTimeZone.UTC).getMillis(), new TimeClause.Format.DayAndMonth(ka.SHORT), null, null, 12);
        } else {
            m70.a.c(t0.f186434a);
            textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        if (q.x(pVar)) {
            textClause2 = new TextLocalisedClause(R$string.wealthcore_recurringbuys_common_order_freqency_monthly, null, null, 14);
        } else if (q.I(pVar)) {
            textClause2 = new TextLocalisedClause(R$string.wealthcore_recurringbuys_common_order_freqency_weekly, null, null, 14);
        } else if (q.r(pVar)) {
            textClause2 = new TextLocalisedClause(R$string.wealthcore_recurringbuys_common_order_freqency_daily, null, null, 14);
        } else {
            m70.a.c(t0.f186434a);
            textClause2 = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(z ? com.revolut.retail.wealth.resources.R$string.wealth_trading_orders_recurring_order_buy_subtitle_format : com.revolut.retail.wealth.resources.R$string.wealth_trading_orders_recurring_order_buy_subtitle, v.k(textClause2, textClause), null, 12);
        ibd.f fVar = pVar.f249316b;
        boolean z3 = fVar == ibd.f.INACTIVE || fVar == ibd.f.BLOCKED;
        TextLocalisedClause textLocalisedClause2 = z3 ? new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_orders_recurring_order_deactivated_subtitle, null, null, 14) : null;
        if (z3 && z && textLocalisedClause2 != null) {
            return textLocalisedClause2;
        }
        TextLocalisedClause[] elements = {textLocalisedClause, textLocalisedClause2};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return yoj.b.m(new TextClause("\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), kotlin.collections.d.L(elements));
    }

    public static final TextLocalisedClause b(p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        return new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_orders_recurring_order_buy_title, u.c(new CurrencyClause(c(pVar), CurrencyClause.Format.Ticker.f57756a, null, 4)), null, 12);
    }

    public static final xi0.b c(p pVar) {
        xi0.a aVar = xi0.b.Companion;
        wua.a aVar2 = pVar.f249328q;
        String str = aVar2 != null ? aVar2.f300093b : null;
        if (str == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        aVar.getClass();
        return xi0.a.a(str);
    }
}
