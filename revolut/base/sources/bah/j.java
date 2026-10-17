package bah;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.wealth.api.domain.model.statement.StatementType;
import com.revolut.feature.wealth.impl.R$string;
import com.revolut.shared.feature.wealth.models.config.Links;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import z0h.f1;
import z0h.m1;
import z0h.n1;
import z0h.s;
import z0h.t;
import z0h.u;
import z0h.w;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class j implements pzg.a {
    public static TextLocalisedClause c(Links links) {
        return new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_eea_car_text, v.k(new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_eea_car_link, null, new Click(28, (Integer) null, (Object) new n1(links.d), "SECURITIES_CAR", false), 10), new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_eea_stock_trading_disclosures_link, null, new Click(28, (Integer) null, (Object) m1.f318535a, "SECURITIES_DISCLOSURES", false), 10)), null, 12);
    }

    public static CompositeClause d(Links links) {
        List listK = v.k(new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_eea_past_performance, null, null, 14), new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_eea_services_are_provided_by_revolut, null, null, 14), c(links));
        t0 t0Var = t0.f186434a;
        return new CompositeClause(listK, new TextClause(a0.d.r(m70.a.o(t0Var), m70.a.o(t0Var)), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
    }

    @Override // pzg.a
    public final Clause a(f1 disclaimer) {
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        w wVar = (w) disclaimer;
        if (wVar instanceof s) {
            List listK = v.k(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealthcore_cfds_eu_disclaimer, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealthcore_footer_disclosure_securities_past_performance, null, null, 14), new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_eea_services_are_provided_by_revolut, null, null, 14), c(((s) wVar).f318557a));
            t0 t0Var = t0.f186434a;
            return new CompositeClause(listK, new TextClause(a0.d.r(m70.a.o(t0Var), m70.a.o(t0Var)), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
        }
        if (wVar instanceof u) {
            u uVar = (u) wVar;
            switch (i.f14084a[uVar.f318566b.ordinal()]) {
                case 1:
                    StatementType statementType = uVar.f318565a;
                    if (Intrinsics.f(statementType, StatementType.Account.f95315a)) {
                        return new TextLocalisedClause(R$string.wealth_margin_statements_footer_note_eea, null, null, 14);
                    }
                    if (Intrinsics.f(statementType, StatementType.Pnl.f95316a)) {
                        return new TextLocalisedClause(R$string.trading_statements_footer_note_eea_pnl, null, null, 14);
                    }
                    throw new NoWhenBranchMatchedException();
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } else {
            if (wVar instanceof z0h.v) {
                return d(((z0h.v) wVar).f318567a);
            }
            if (!(wVar instanceof t)) {
                throw new NoWhenBranchMatchedException();
            }
            t tVar = (t) wVar;
            switch (i.f14084a[tVar.f318559b.ordinal()]) {
                case 1:
                    return d(tVar.f318558a);
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        return null;
    }

    @Override // pzg.a
    public final boolean b(f1 disclaimer) {
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        return disclaimer instanceof w;
    }
}
