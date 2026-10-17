package bah;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.wealth.api.domain.model.statement.StatementType;
import com.revolut.feature.wealth.impl.R$string;
import com.revolut.shared.feature.wealth.models.config.Links;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import z0h.a0;
import z0h.f1;
import z0h.n1;
import z0h.y;
import z0h.z;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class n implements pzg.a {
    @Override // pzg.a
    public final Clause a(f1 disclaimer) {
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        a0 a0Var = (a0) disclaimer;
        if (a0Var instanceof y) {
            y yVar = (y) a0Var;
            hel.b bVar = yVar.f318576b;
            Links links = yVar.f318575a;
            switch (m.f14087a[bVar.ordinal()]) {
                case 1:
                    int i = R$string.wealth_footer_disclosure_robo_us_automated_investing_text;
                    int i2 = R$string.wealth_footer_disclosure_us_disclosures_link;
                    String str = links.f105098p;
                    if (str == null) {
                        m70.a.c(t0.f186434a);
                        str = "";
                    }
                    return new CompositeClause(u.c(new TextLocalisedClause(i, u.c(new TextLocalisedClause(i2, null, new Click(28, (Integer) null, (Object) new n1(str), "ADVISORY_CLICK_ID", false), 10)), null, 12)), null, null, null, 12);
                case 2:
                    String str2 = links.f105100r;
                    if (str2 != null) {
                        return new TextLocalisedClause(R$string.wealth_footer_disclosure_robo_eea_view_text, u.c(new TextLocalisedClause(R$string.wealth_footer_disclosure_robo_eea_terms_and_conditions, null, new Click(28, (Integer) null, (Object) new n1(str2), "TERMS_AND_CONDITIONS_CLICK_ID", false), 10)), null, 12);
                    }
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    return null;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } else {
            if (!(a0Var instanceof z)) {
                throw new NoWhenBranchMatchedException();
            }
            z zVar = (z) a0Var;
            StatementType statementType = zVar.f318579b;
            ybl.n nVar = zVar.f318578a;
            hel.b bVar2 = zVar.f318580c;
            if (!Intrinsics.f(statementType, StatementType.Account.f95315a)) {
                if (!Intrinsics.f(statementType, StatementType.Pnl.f95316a)) {
                    throw new NoWhenBranchMatchedException();
                }
                int i3 = m.f14088b[nVar.ordinal()];
                if (i3 == 1) {
                    switch (m.f14087a[bVar2.ordinal()]) {
                        case 1:
                            return new TextLocalisedClause(R$string.trading_statement_footer_pdf_us, null, null, 14);
                        case 2:
                            return new TextLocalisedClause(R$string.trading_statements_footer_note_eea_pnl, null, null, 14);
                        case 3:
                            return new TextLocalisedClause(R$string.trading_statements_footer_note, null, null, 14);
                        case 4:
                            return new TextLocalisedClause(R$string.trading_statements_footer_note_au_pnl, null, null, 14);
                        case 5:
                        case 6:
                        case 7:
                            return new TextLocalisedClause(R$string.trading_statements_footer_note_sg_pnl, null, null, 14);
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                }
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                switch (m.f14087a[bVar2.ordinal()]) {
                    case 1:
                    case 3:
                        return new TextLocalisedClause(R$string.trading_statements_footer_note_csv, null, null, 14);
                    case 2:
                        return new TextLocalisedClause(R$string.trading_statements_footer_note_eea_pnl, null, null, 14);
                    case 4:
                        return new TextLocalisedClause(R$string.trading_statements_footer_note_au_pnl, null, null, 14);
                    case 5:
                    case 6:
                    case 7:
                        return new TextLocalisedClause(R$string.trading_statements_footer_note_sg_pnl, null, null, 14);
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
            int i5 = m.f14088b[nVar.ordinal()];
            if (i5 != 1) {
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                switch (m.f14087a[bVar2.ordinal()]) {
                    case 1:
                    case 3:
                        return new TextLocalisedClause(R$string.trading_statements_footer_note_csv, null, null, 14);
                    case 2:
                        return new TextLocalisedClause(R$string.trading_statements_footer_note_eea, null, null, 14);
                    case 4:
                        return new TextLocalisedClause(R$string.trading_statement_footer_csv_au, null, null, 14);
                    case 5:
                    case 6:
                    case 7:
                        return new TextLocalisedClause(R$string.trading_statements_footer_note_sg, null, null, 14);
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
            switch (m.f14087a[bVar2.ordinal()]) {
                case 1:
                    return new TextLocalisedClause(R$string.wealth_robo_statements_disclaimer, null, null, 14);
                case 2:
                    return new TextLocalisedClause(R$string.trading_statements_footer_note_eea, null, null, 14);
                case 3:
                    return new TextLocalisedClause(R$string.trading_statements_footer_note, null, null, 14);
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
        return disclaimer instanceof a0;
    }
}
