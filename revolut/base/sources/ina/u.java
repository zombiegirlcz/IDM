package ina;

import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.profile.impl.R$string;
import com.revolut.feature.statements.api.navigation.AccountStatementProduct;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class u implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f162755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f162756b;

    public /* synthetic */ u(w wVar, int i) {
        this.f162755a = i;
        this.f162756b = wVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f162755a) {
            case 0:
                fna.a domainState = (fna.a) obj2;
                Intrinsics.checkNotNullParameter(domainState, "domainState");
                fna.i iVar = this.f162756b.f162762r;
                int i = R$string.documents_item_account_statement;
                AccountId.Personal personal = AccountId.Personal.f51414a;
                RowDelegate.Model modelC = fna.i.c(iVar, "ID_ACCOUNT_STATEMENT", i, null, personal, null, 52);
                if (!domainState.f136561h) {
                    modelC = null;
                }
                RowDelegate.Model modelC2 = domainState.i ? fna.i.c(iVar, "ID_ANNUAL_FEE_STATEMENT", com.revolut.feature.statements.R$string.documents_item_annual_fee_statement, null, personal, null, 52) : null;
                RowDelegate.Model modelC3 = domainState.f136559c ? fna.i.c(iVar, "ID_STATEMENT_OF_FEES", R$string.documents_item_statement_of_fees, null, personal, null, 52) : null;
                RowDelegate.Model modelC4 = domainState.e ? fna.i.c(iVar, "ID_ANNUAL_AVERAGE", com.revolut.feature.statements.R$string.statement_annual_statement_title, null, personal, null, 52) : null;
                RowDelegate.Model modelC5 = fna.i.c(iVar, "ID_FINANCIAL_SUMMARY_STATEMENTS", com.revolut.feature.statements.R$string.documents_item_annual_financial_summary, null, personal, null, 52);
                if (!domainState.d) {
                    modelC5 = null;
                }
                RowDelegate.Model[] elements = {modelC, modelC2, modelC3, modelC4, modelC5};
                Intrinsics.checkNotNullParameter(elements, "elements");
                List listE = fna.i.e(kotlin.collections.d.L(elements), fna.i.a(R$string.documents_type_statements, "STATEMENTS_HEADER"));
                RowDelegate.Model modelC6 = domainState.f136558b ? fna.i.c(iVar, "ID_RIB_STATEMENT", R$string.documents_item_rib, null, personal, null, 52) : null;
                RowDelegate.Model modelC7 = fna.i.c(iVar, "ID_ACCOUNT_CONFIRMATION", R$string.documents_item_account_confirmation, null, personal, null, 52);
                if (!domainState.f136560g) {
                    modelC7 = null;
                }
                RowDelegate.Model[] elements2 = {modelC6, modelC7};
                Intrinsics.checkNotNullParameter(elements2, "elements");
                return zhm.d0.E0(fna.i.e(zhm.v.l(domainState.f ? fna.i.c(iVar, "ID_CONTRACT_SUMMARY", R$string.documents_item_account_contract_summary, null, personal, null, 52) : null), fna.i.a(R$string.documents_type_contract_summary, "CONTRACT_SUMMARY")), zhm.d0.E0(fna.i.e(kotlin.collections.d.L(elements2), fna.i.a(R$string.documents_type_confirmations, "CONFIRMATION_HEADER")), listE));
            default:
                this.f162756b.f3(AccountStatementProduct.PersonalCurrent.f88237a, (Set) obj2);
                return Unit.f186387a;
        }
    }
}
