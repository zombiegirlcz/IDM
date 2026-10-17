package vyd;

import com.revolut.core.ui_kit.models.CountryClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.statements.R$string;
import com.revolut.feature.statements.api.StatementsMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class b {
    public final TextLocalisedClause a(StatementsMode statementsMode) {
        if (statementsMode instanceof StatementsMode.Consolidated) {
            wi0.b bVar = ((StatementsMode.Consolidated) statementsMode).f88213a;
            wi0.b.Companion.getClass();
            return new TextLocalisedClause(Intrinsics.f(bVar, wi0.b.O) ? R$string.statements_group_consolidated_statement_co_title : R$string.statements_group_consolidated_statement_title, null, null, 14);
        }
        if (statementsMode instanceof StatementsMode.TaxCertificate) {
            wi0.b bVar2 = ((StatementsMode.TaxCertificate) statementsMode).f88214a;
            wi0.b.Companion.getClass();
            return new TextLocalisedClause(Intrinsics.f(bVar2, wi0.b.Y1) ? R$string.statements_group_tax_certificate_mx_title : R$string.statements_group_tax_certificate_title, null, null, 14);
        }
        if (statementsMode instanceof StatementsMode.TaxFiling) {
            return new TextLocalisedClause(R$string.statements_group_tax_filing_title, u.c(new CountryClause(((StatementsMode.TaxFiling) statementsMode).f88215a, null)), null, 12);
        }
        if (statementsMode instanceof StatementsMode.BankIDAnnualStatements) {
            return new TextLocalisedClause(R$string.statements_group_bank_id_title, null, null, 14);
        }
        throw new NoWhenBranchMatchedException();
    }
}
