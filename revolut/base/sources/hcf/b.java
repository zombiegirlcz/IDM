package hcf;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.feature.trading_add_ons.impl.R$string;
import java.time.Period;
import java.time.ZonedDateTime;
import java.util.Iterator;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import lbf.e;
import lbf.j;
import lbf.m;
import lbf.p;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements a {
    public b(c tradingAddOnsImageProvider) {
        Intrinsics.checkNotNullParameter(tradingAddOnsImageProvider, "tradingAddOnsImageProvider");
    }

    public static lbf.b b(m mVar) {
        Object next;
        Iterator it8 = mVar.f193682c.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((lbf.b) next).f193666a == lbf.c.MONTHLY) {
                break;
            }
        }
        return (lbf.b) next;
    }

    public final Clause c(p addOn) {
        ZonedDateTime zonedDateTime;
        ZonedDateTime zonedDateTime2;
        e eVar;
        Period period;
        String strValueOf;
        Intrinsics.checkNotNullParameter(addOn, "addOn");
        boolean zA = addOn.a();
        m mVar = addOn.f193684a;
        if (zA) {
            int i = R$string.price_plan_add_ons_add_on_price_monthly;
            lbf.b bVarB = b(mVar);
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, v.l(bVarB != null ? new MoneyClause(bVarB.f193668c, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12) : null), null, 12);
            j jVar = addOn.f193685b;
            TextLocalisedClause[] elements = {textLocalisedClause, (jVar == null || (zonedDateTime2 = jVar.f193678b) == null) ? (jVar == null || (zonedDateTime = jVar.d) == null) ? null : new TextLocalisedClause(R$string.price_plan_add_ons_add_on_end_billing_date, u.c(new TimeClause(zonedDateTime.toInstant().toEpochMilli(), TimeClause.Format.DateLong.f57962b, null, null, 12)), null, 12) : new TextLocalisedClause(R$string.price_plan_add_ons_add_on_next_billing_date, v.l(new TimeClause(zonedDateTime2.toInstant().toEpochMilli(), TimeClause.Format.DateLong.f57962b, null, null, 12)), null, 12)};
            Intrinsics.checkNotNullParameter(elements, "elements");
            return v1.c.f(d.L(elements), null);
        }
        lbf.b bVarB2 = b(mVar);
        if (bVarB2 == null || (eVar = bVarB2.e) == null || (period = eVar.f193672a) == null || (strValueOf = String.valueOf(period.getDays())) == null) {
            int i2 = R$string.price_plan_add_ons_add_on_subscription_confirmation_title_monthly_noTrial;
            lbf.b bVarB3 = b(mVar);
            return new TextLocalisedClause(i2, v.l(bVarB3 != null ? new MoneyClause(bVarB3.f193668c, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12) : null), null, 12);
        }
        int i3 = R$string.price_plan_add_ons_add_on_title_free_trial_monthly;
        lbf.b bVarB4 = b(mVar);
        Object[] elements2 = {strValueOf, bVarB4 != null ? new MoneyClause(bVarB4.f193668c, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12) : null};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        return new TextLocalisedClause(i3, d.L(elements2), null, 12);
    }
}
