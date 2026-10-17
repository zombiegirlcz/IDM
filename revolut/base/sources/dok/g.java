package dok;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import hha.s;
import hha.w0;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.joda.time.Period;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public abstract class g {
    public static final hha.g a(hha.d dVar, hha.i code) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(code, "code");
        int i = f.f116583b[code.ordinal()];
        if (i == 1) {
            return c(dVar);
        }
        if (i == 2) {
            return b(dVar);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final hha.g b(hha.d dVar) {
        Object next;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Iterator it8 = dVar.f152291h.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((hha.g) next).f152306a, jli.e.f175842b)) {
                break;
            }
        }
        return (hha.g) next;
    }

    public static final hha.g c(hha.d dVar) {
        Object next;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Iterator it8 = dVar.f152291h.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((hha.g) next).f152306a, jli.e.f175845h)) {
                break;
            }
        }
        return (hha.g) next;
    }

    public static final Clause d(hha.d dVar, Style style) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        TextLocalisedClause textLocalisedClauseE = e(s.f(dVar), style);
        return textLocalisedClauseE == null ? new TextClause(jli.g.c(dVar.f152289c), style, (Integer) null, false, (o9) null, (List) null, 124) : textLocalisedClauseE;
    }

    public static final TextLocalisedClause e(w0 w0Var, Style style) {
        int i;
        Intrinsics.checkNotNullParameter(w0Var, "<this>");
        switch (f.f116582a[w0Var.ordinal()]) {
            case 1:
                i = R$string.plan_standard_short_name;
                break;
            case 2:
                i = R$string.plan_basic_short_name;
                break;
            case 3:
                i = R$string.plan_essentials_short_name;
                break;
            case 4:
                i = R$string.plan_plus_short_name;
                break;
            case 5:
                i = R$string.plan_premium_short_name;
                break;
            case 6:
                i = R$string.plan_metal_short_name;
                break;
            case 7:
                i = R$string.plan_ultra_short_name;
                break;
            case 8:
                i = R$string.plan_private_short_name;
                break;
            case 9:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new TextLocalisedClause(i, null, style, 10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Clause f(hha.g gVar) {
        int i;
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Object[] objArr = 0 == true ? 1 : 0;
        MoneyClause moneyClause = new MoneyClause(gVar.f152308c, new MoneyClause.Format.Defaults(null, null, false, false, 15), objArr, o9.NON_SENSITIVE, 4);
        Period period = gVar.f152306a;
        if (Intrinsics.f(period, jli.e.f175845h)) {
            i = R$string.dashboard_header_monthly_price;
        } else {
            if (!Intrinsics.f(period, jli.e.f175842b)) {
                m70.a.c(t0.f186434a);
                return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            }
            i = R$string.dashboard_header_annual_price;
        }
        return new TextLocalisedClause(i, u.c(moneyClause), null, 12);
    }

    public static TextLocalisedClause g(MoneyClause moneyClause, hha.i iVar) {
        int i;
        int i2 = f.f116583b[iVar.ordinal()];
        if (i2 == 1) {
            i = R$string.dashboard_header_monthly_price;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.dashboard_header_annual_price;
        }
        return new TextLocalisedClause(i, u.c(moneyClause), null, 12);
    }

    public static final boolean h(hha.d dVar, hha.d other) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return dVar.f152294m > other.f152294m;
    }
}
