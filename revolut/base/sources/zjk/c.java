package zjk;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import com.youTransactor.uCube.rpc.Constants;
import dj0.d;
import hha.h0;
import hha.o;
import hha.t0;
import java.util.List;
import jli.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Period;
import zhm.d0;
import zhm.u;
import zhm.v;
import zjk.a;

/* JADX INFO: loaded from: classes11.dex */
public final class c {
    public static Clause a(o charge, a chargeDisplayStyle, boolean z, Function1 moneyFormatting) {
        Intrinsics.checkNotNullParameter(charge, "charge");
        Intrinsics.checkNotNullParameter(chargeDisplayStyle, "chargeDisplayStyle");
        Intrinsics.checkNotNullParameter(moneyFormatting, "moneyFormatting");
        Custom custom = z ? new Custom(null, true, null, false, null, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION) : null;
        d dVar = charge.f152326a;
        List list = charge.f152328c;
        Clause clause = (Clause) moneyFormatting.invoke(dok.b.b(dVar, null, custom, null, 5));
        if (!Intrinsics.f(chargeDisplayStyle, a.C1791a.f322873a)) {
            if (!Intrinsics.f(chargeDisplayStyle, a.b.f322874a)) {
                throw new NoWhenBranchMatchedException();
            }
            Clause clause2 = (Clause) moneyFormatting.invoke(dok.b.b(charge.f152327b, null, null, null, 7));
            if (!list.isEmpty()) {
                t0 t0Var = (t0) d0.b0(list);
                int i = b.f322875a[t0Var.f152341b.ordinal()];
                if (i == 1) {
                    return new TextLocalisedClause(R$string.plan_money_with_vat, v.k(clause2, dok.b.b(t0Var.f152340a, null, null, null, 7)), custom, 8);
                }
                if (i != 2 && i != 3 && i != 4 && i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        return clause;
    }

    public static /* synthetic */ Clause b(o oVar, a aVar, int i) {
        return a(oVar, aVar, (i & 4) == 0, new zii.c(23));
    }

    public static TextLocalisedClause c(o charge, Period period, o discountCharge, Long l2, a chargeDisplayStyle, h0 h0Var) {
        Intrinsics.checkNotNullParameter(charge, "charge");
        Intrinsics.checkNotNullParameter(discountCharge, "discountCharge");
        Intrinsics.checkNotNullParameter(chargeDisplayStyle, "chargeDisplayStyle");
        Period period2 = e.f175845h;
        if (Intrinsics.f(period, period2) && d0.T(v.k(h0.PARTNER_SALARY_DISCOUNT, h0.SALARY_HUB_DISCOUNT), h0Var)) {
            return new TextLocalisedClause(R$string.dashboard_header_monthly_price_partner_salary_discount, u.c(yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(b(charge, chargeDisplayStyle, 8), b(discountCharge, chargeDisplayStyle, 12)))), null, 12);
        }
        if (l2 == null) {
            return new TextLocalisedClause(Intrinsics.f(period, period2) ? R$string.dashboard_header_monthly_price : R$string.dashboard_header_annual_price, u.c(yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(b(charge, chargeDisplayStyle, 8), b(discountCharge, chargeDisplayStyle, 12)))), null, 12);
        }
        long jLongValue = l2.longValue();
        int i = Intrinsics.f(period, period2) ? R$string.plan_manage_screen_billing_cycle_title_monthly_discount : R$string.plan_manage_screen_billing_cycle_title_yearly_discount;
        a.C1791a c1791a = a.C1791a.f322873a;
        Clause clauseB = b(discountCharge, c1791a, 12);
        TimeClause.Format.INSTANCE.getClass();
        return new TextLocalisedClause(i, v.k(clauseB, new TimeClause(jLongValue, TimeClause.Format.f57959a, null, null, 12), b(charge, c1791a, 12)), null, 12);
    }
}
