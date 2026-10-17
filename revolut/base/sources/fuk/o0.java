package fuk;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.wealth.resources.R$string;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ytk.c;

/* JADX INFO: loaded from: classes12.dex */
public final class o0 {
    public o0(ytk.c percentageClauseMapper) {
        Intrinsics.checkNotNullParameter(percentageClauseMapper, "percentageClauseMapper");
    }

    public final Clause a(m0 m0Var, j0 j0Var) {
        huk.b bVar;
        Object next;
        Object next2;
        vrk.g gVar = m0Var.d;
        if (gVar instanceof vrk.b) {
            Iterator it8 = j0Var.f138245a.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it8.next();
                huk.b bVar2 = (huk.b) next2;
                vrk.b bVar3 = (vrk.b) gVar;
                if (bVar2.f155704a == bVar3.f291610a) {
                    Integer num = bVar2.f155705b;
                    int iB = bVar3.f291611b.b();
                    if (num != null && num.intValue() == iB) {
                        break;
                    }
                }
            }
            bVar = (huk.b) next2;
        } else if (gVar instanceof vrk.e) {
            Iterator it9 = j0Var.f138245a.iterator();
            while (true) {
                if (!it9.hasNext()) {
                    next = null;
                    break;
                }
                next = it9.next();
                if (((huk.b) next).f155704a == ((vrk.e) gVar).f291613a) {
                    break;
                }
            }
            bVar = (huk.b) next;
        } else {
            if (!Intrinsics.f(gVar, vrk.a.f291609a) && !Intrinsics.f(gVar, vrk.d.f291612a)) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = null;
        }
        if (bVar == null) {
            return null;
        }
        BigDecimal percentageValue = bVar.f155706c;
        rwk.k kVar = j0Var.f138246b;
        if (kVar instanceof rwk.g) {
            return new MoneyClause(new dj0.d(percentageValue.longValue(), ((rwk.g) kVar).f257988a), m0Var.e, null, null, 12);
        }
        if (kVar.equals(rwk.h.f257989a)) {
            c.a aVar = ytk.c.Companion;
            Intrinsics.checkNotNullParameter(percentageValue, "percentageValue");
            return new PercentageClause(percentageValue, new PercentageClause.Format.Custom(2, 12, null, null, RoundingMode.HALF_UP), (Style) null);
        }
        if (kVar.equals(rwk.j.f257991a)) {
            return new TextLocalisedClause(R$string.instrument_fundamentals_expected_return_graph_pe_multiple_label, zhm.u.c(new NumberClause(bVar.f155706c, new NumberClause.Format.FixedDigitsAfterDot(2, 14, null, null, null), null, null, 12)), null, 12);
        }
        if (kVar instanceof rwk.i) {
            return new MoneyClause(mif.a.Q(new ej0.b(percentageValue, ((rwk.i) kVar).f257990a)), new MoneyClause.Format.Shorts(false, 55), null, null, 12);
        }
        throw new NoWhenBranchMatchedException();
    }
}
