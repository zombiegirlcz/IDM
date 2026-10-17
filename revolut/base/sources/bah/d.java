package bah;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.wealth.api.domain.model.statement.StatementType;
import com.revolut.feature.wealth.ui.api.WealthUiApi$Toggles;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import z0h.f1;
import z0h.g1;
import z0h.k1;
import z0h.n1;
import z0h.r1;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements pzg.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f14077a;

    public d(aah.b parcelWrapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(parcelWrapper, "parcelWrapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f14077a = featureToggleInteractor;
    }

    public static CompositeClause f(z0h.p pVar) {
        int i = R$string.invest_disclaimer_eea_commodities_with_terms_of_business;
        int i2 = R$string.invest_disclaimer_eea_commodities_terms_of_business;
        pVar.getClass();
        return new CompositeClause(u.c(new TextLocalisedClause(i, u.c(new TextLocalisedClause(i2, null, new Click(28, (Integer) null, (Object) new n1("https://www.revolut.com/legal/precious-metals/?geo-redirect=true"), "COMMODITIES_TERMS_OF_BUSINESS", false), 10)), null, 12)), null, null, null, 14);
    }

    public static TextClause g() {
        return new TextClause("\n\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    @Override // pzg.a
    public final Clause a(f1 disclaimer) {
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        z0h.q qVar = (z0h.q) disclaimer;
        boolean z = qVar instanceof z0h.l;
        g1 g1Var = g1.f318505a;
        if (z) {
            z0h.l lVar = (z0h.l) qVar;
            z0h.b bVar = lVar.f318524a;
            r1 r1Var = lVar.f318525b;
            switch (c.f14074a[bVar.ordinal()]) {
                case 1:
                    return new CompositeClause(u.c(new TextLocalisedClause(com.revolut.feature.wealth.impl.R$string.wealthcore_footer_disclosure_commodities_uk_general_text, u.c(new TextLocalisedClause(com.revolut.feature.wealth.impl.R$string.wealthcore_footer_disclosure_commodities_uk_general_link, null, new Click(28, (Integer) null, aah.b.a(g1Var, r1Var), "COMMODITIES_DISCLOSURES", false), 10)), null, 12)), null, null, null, 14);
                case 2:
                    return k(r1Var);
                case 3:
                    return e(r1Var);
                case 4:
                    return c(r1Var);
                case 5:
                    return i(r1Var);
                case 6:
                    return h(r1Var);
                case 7:
                    return j(r1Var);
                case 8:
                case 9:
                    return d(r1Var);
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        boolean z3 = qVar instanceof z0h.m;
        gte.a aVar = this.f14077a;
        if (z3) {
            z0h.m mVar = (z0h.m) qVar;
            z0h.b bVar2 = mVar.f318531a;
            r1 r1Var2 = mVar.f318532b;
            switch (c.f14074a[bVar2.ordinal()]) {
                case 1:
                    return new TextLocalisedClause(R$string.wealthcore_footer_disclosure_commodities_uk_general_text_short, null, null, 14);
                case 2:
                    return k(r1Var2);
                case 3:
                    return e(r1Var2);
                case 4:
                    if (!((jte.d) aVar).c(WealthUiApi$Toggles.InvestDisclaimersUpdateAu.f95857c)) {
                        return c(r1Var2);
                    }
                    break;
                case 5:
                    return i(r1Var2);
                case 6:
                    return h(r1Var2);
                case 7:
                    return j(r1Var2);
                case 8:
                case 9:
                    return d(r1Var2);
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } else {
            boolean z4 = qVar instanceof z0h.k;
            k1 k1Var = k1.f318523a;
            if (z4) {
                switch (c.f14074a[((z0h.k) qVar).f318519a.ordinal()]) {
                    case 1:
                        return new CompositeClause(v.k(new TextLocalisedClause(R$string.wealthcore_footer_disclosure_commodities_uk_general_text_short, null, null, 14), new TextLocalisedClause(com.revolut.feature.wealth.impl.R$string.wealth_footer_disclosure_gb_commodities_data_provided_from_third_parties, null, null, 14), new TextLocalisedClause(com.revolut.feature.wealth.impl.R$string.wealth_footer_disclosure_gb_read_our_disclosure, u.c(new TextLocalisedClause(R$string.wealthcore_footer_disclosure_general_uk_services_provided_by_revolut_link, null, new Click(28, (Integer) null, (Object) k1Var, "INVEST_DISCLOSURES", false), 10)), null, 12)), g(), null, null, 12);
                    case 2:
                        return yoj.b.m(g(), v.k(new TextLocalisedClause(com.revolut.feature.wealth.impl.R$string.wealthcore_footer_disclosure_commodities_sng_chart_text, null, null, 14), new TextLocalisedClause(com.revolut.feature.wealth.impl.R$string.wealthcore_footer_disclosure_commodities_price_targets_text, null, null, 14), new TextLocalisedClause(com.revolut.feature.wealth.impl.R$string.wealthcore_footer_disclosure_commodities_sng_general_text, u.c(new TextLocalisedClause(com.revolut.feature.wealth.impl.R$string.wealthcore_footer_disclosure_commodities_sng_general_link, null, new Click(28, (Integer) null, (Object) g1Var, "COMMODITIES_DISCLOSURES", false), 10)), null, 12)));
                    case 3:
                        return yoj.b.m(g(), v.k(new TextLocalisedClause(com.revolut.feature.wealth.impl.R$string.wealthcore_footer_disclosure_commodities_eea_chart_text, null, null, 14), new TextLocalisedClause(com.revolut.feature.wealth.impl.R$string.wealthcore_footer_disclosure_commodities_price_targets_text, null, null, 14), new TextLocalisedClause(com.revolut.feature.wealth.impl.R$string.wealthcore_footer_disclosure_commodities_eea_general_text, u.c(new TextLocalisedClause(com.revolut.feature.wealth.impl.R$string.wealthcore_footer_disclosure_commodities_eea_general_link, null, new Click(28, (Integer) null, (Object) g1Var, "COMMODITIES_DISCLOSURES", false), 10)), null, 12)));
                    case 4:
                        return yoj.b.m(g(), v.k(new TextLocalisedClause(com.revolut.feature.wealth.impl.R$string.wealthcore_footer_disclosure_commodities_aus_chart_text, null, null, 14), new TextLocalisedClause(com.revolut.feature.wealth.impl.R$string.wealthcore_footer_disclosure_commodities_price_targets_text, null, null, 14), new TextLocalisedClause(com.revolut.feature.wealth.impl.R$string.wealthcore_footer_disclosure_commodities_aus_general_text, u.c(new TextLocalisedClause(com.revolut.feature.wealth.impl.R$string.wealthcore_footer_disclosure_commodities_aus_general_link, null, new Click(28, (Integer) null, (Object) g1Var, "COMMODITIES_DISCLOSURES", false), 10)), null, 12)));
                    case 5:
                        return i(r1.NONE);
                    case 6:
                        return h(r1.NONE);
                    case 7:
                        return j(r1.NONE);
                    case 8:
                    case 9:
                        return d(r1.NONE);
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
            if (qVar instanceof z0h.n) {
                z0h.n nVar = (z0h.n) qVar;
                StatementType statementType = nVar.f318538c;
                if (!Intrinsics.f(statementType, StatementType.Account.f95315a)) {
                    if (!Intrinsics.f(statementType, StatementType.Pnl.f95316a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i = c.f14075b[nVar.f318536a.ordinal()];
                    if (i == 1) {
                        switch (c.f14074a[nVar.f318537b.ordinal()]) {
                            case 1:
                                return new TextLocalisedClause(com.revolut.feature.wealth.impl.R$string.trading_statements_footer_note, null, null, 14);
                            case 2:
                                return new TextLocalisedClause(com.revolut.feature.wealth.impl.R$string.trading_statements_footer_note_sg_pnl, null, null, 14);
                            case 3:
                                return new TextLocalisedClause(com.revolut.feature.wealth.impl.R$string.trading_statements_footer_note_eea_pnl, null, null, 14);
                            case 4:
                                return new TextLocalisedClause(com.revolut.feature.wealth.impl.R$string.trading_statements_footer_note_au_pnl, null, null, 14);
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                break;
                            case 9:
                                return new TextLocalisedClause(com.revolut.feature.wealth.impl.R$string.trading_statement_footer_pdf_us, null, null, 14);
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    } else if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            } else {
                if (!(qVar instanceof z0h.p)) {
                    throw new NoWhenBranchMatchedException();
                }
                z0h.p pVar = (z0h.p) qVar;
                z0h.o oVar = pVar.f318544a;
                z0h.b bVar3 = pVar.f318545b;
                int i2 = c.f14076c[oVar.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    switch (c.f14074a[bVar3.ordinal()]) {
                        case 1:
                            return new CompositeClause(u.c(new TextLocalisedClause(R$string.invest_disclaimer_uk_commodities_with_terms_of_business, u.c(new TextLocalisedClause(R$string.invest_disclaimer_uk_commodities_terms_of_business, null, new Click(28, (Integer) null, (Object) new n1("https://www.revolut.com/legal/precious-metals/?geo-redirect=true"), "COMMODITIES_TERMS_OF_BUSINESS", false), 10)), null, 12)), null, null, null, 14);
                        case 2:
                            return k(r1.NONE);
                        case 3:
                            return f(pVar);
                        case 4:
                            return c(r1.NONE);
                        case 5:
                            return i(r1.NONE);
                        case 6:
                            return h(r1.NONE);
                        case 7:
                            return j(r1.NONE);
                        case 8:
                        case 9:
                            return d(r1.NONE);
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                }
                switch (c.f14074a[bVar3.ordinal()]) {
                    case 1:
                        return new CompositeClause(v.k(new TextLocalisedClause(R$string.wealthcore_footer_disclosure_commodities_uk_general_text_short, null, null, 14), new TextLocalisedClause(R$string.wealthcore_footer_disclosure_general_uk_services_provided_by_revolut_link, null, new Click(28, (Integer) null, (Object) k1Var, "INVEST_DISCLOSURES", false), 10)), g(), null, null, 12);
                    case 2:
                        return k(r1.NONE);
                    case 3:
                        return f(pVar);
                    case 4:
                        r1 r1Var3 = r1.NONE;
                        if (!((jte.d) aVar).c(WealthUiApi$Toggles.InvestDisclaimersUpdateAu.f95857c)) {
                            return c(r1Var3);
                        }
                        break;
                    case 5:
                        return i(r1.NONE);
                    case 6:
                        return h(r1.NONE);
                    case 7:
                        return j(r1.NONE);
                    case 8:
                    case 9:
                        return d(r1.NONE);
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }
        return null;
    }

    @Override // pzg.a
    public final boolean b(f1 disclaimer) {
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        return disclaimer instanceof z0h.q;
    }

    public final CompositeClause c(r1 r1Var) {
        return new CompositeClause(u.c(new TextLocalisedClause(((jte.d) this.f14077a).c(WealthUiApi$Toggles.InvestDisclaimersUpdateAu.f95857c) ? com.revolut.feature.wealth.impl.R$string.wealthcore_footer_disclosure_commodities_common_general_text : com.revolut.feature.wealth.impl.R$string.wealthcore_footer_disclosure_commodities_aus_general_text, u.c(new TextLocalisedClause(com.revolut.feature.wealth.impl.R$string.wealthcore_footer_disclosure_commodities_aus_general_link, null, new Click(28, (Integer) null, aah.b.a(g1.f318505a, r1Var), "COMMODITIES_DISCLOSURES", false), 10)), null, 12)), null, null, null, 14);
    }

    public final CompositeClause d(r1 r1Var) {
        return new CompositeClause(u.c(new TextLocalisedClause(com.revolut.feature.wealth.impl.R$string.wealthcore_footer_disclosure_commodities_common_general_text, u.c(new TextLocalisedClause(com.revolut.feature.wealth.impl.R$string.wealthcore_footer_disclosure_commodities_common_general_link, null, new Click(28, (Integer) null, aah.b.a(g1.f318505a, r1Var), "COMMODITIES_DISCLOSURES", false), 10)), null, 12)), null, null, null, 14);
    }

    public final CompositeClause e(r1 r1Var) {
        return new CompositeClause(u.c(new TextLocalisedClause(com.revolut.feature.wealth.impl.R$string.wealthcore_footer_disclosure_commodities_eea_general_text, u.c(new TextLocalisedClause(com.revolut.feature.wealth.impl.R$string.wealthcore_footer_disclosure_commodities_eea_general_link, null, new Click(28, (Integer) null, aah.b.a(g1.f318505a, r1Var), "COMMODITIES_DISCLOSURES", false), 10)), null, 12)), null, null, null, 14);
    }

    public final CompositeClause h(r1 r1Var) {
        return new CompositeClause(u.c(new TextLocalisedClause(com.revolut.feature.wealth.impl.R$string.wealthcore_footer_disclosure_commodities_rbsa_general_text, u.c(new TextLocalisedClause(com.revolut.feature.wealth.impl.R$string.wealthcore_footer_disclosure_commodities_rbsa_general_link, null, new Click(28, (Integer) null, aah.b.a(g1.f318505a, r1Var), "COMMODITIES_DISCLOSURES", false), 10)), null, 12)), null, null, null, 14);
    }

    public final CompositeClause i(r1 r1Var) {
        return new CompositeClause(u.c(new TextLocalisedClause(com.revolut.feature.wealth.impl.R$string.wealthcore_footer_disclosure_commodities_rpnzpl_general_text, u.c(new TextLocalisedClause(com.revolut.feature.wealth.impl.R$string.wealthcore_footer_disclosure_commodities_rpnzpl_general_link, null, new Click(28, (Integer) null, aah.b.a(g1.f318505a, r1Var), "COMMODITIES_DISCLOSURES", false), 10)), null, 12)), null, null, null, 14);
    }

    public final CompositeClause j(r1 r1Var) {
        return new CompositeClause(u.c(new TextLocalisedClause(com.revolut.feature.wealth.impl.R$string.wealthcore_footer_disclosure_commodities_jpn_general_text, u.c(new TextLocalisedClause(com.revolut.feature.wealth.impl.R$string.wealthcore_footer_disclosure_commodities_jpn_general_link, null, new Click(28, (Integer) null, aah.b.a(g1.f318505a, r1Var), "COMMODITIES_DISCLOSURES", false), 10)), null, 12)), null, null, null, 14);
    }

    public final CompositeClause k(r1 r1Var) {
        return new CompositeClause(u.c(new TextLocalisedClause(com.revolut.feature.wealth.impl.R$string.wealthcore_footer_disclosure_commodities_sng_general_text, u.c(new TextLocalisedClause(com.revolut.feature.wealth.impl.R$string.wealthcore_footer_disclosure_commodities_sng_general_link, null, new Click(28, (Integer) null, aah.b.a(g1.f318505a, r1Var), "COMMODITIES_DISCLOSURES", false), 10)), null, 12)), null, null, null, 14);
    }
}
