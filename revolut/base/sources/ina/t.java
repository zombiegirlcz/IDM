package ina;

import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.profile.api.DocumentsPage;
import com.revolut.feature.profile.impl.R$string;
import com.revolut.feature.profile.impl.ui.documents_redesigned.DocumentFlowInternalDestination;
import com.revolut.feature.statements.api.StatementsApi$FeatureToggles;
import com.revolut.feature.statements.api.models.ContractSummaryType;
import com.revolut.feature.statements.api.models.StatementProductType;
import com.revolut.feature.statements.api.navigation.AnnualFeeDestination;
import com.revolut.feature.statements.api.navigation.DocumentsHubProduct;
import com.revolut.feature.statements.api.navigation.DocumentsHubType;
import com.revolut.feature.statements.api.navigation.StatementOfFeesDestination;
import g48.r0;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes5.dex */
public final class t extends k {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final fna.h f162747l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final zxd.c f162748m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final zxd.a f162749n;
    public final gte.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r0 f162750p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ij0.a f162751q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vyd.a f162752r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final fna.i f162753s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final jna.b f162754t;

    public t(fna.h interactor, zxd.c statementsInteractor, zxd.a currencySelectionInteractor, gte.a featureToggleInteractor, r0 jointAccountsInteractor, ij0.a coreNetworkConfiguration, vyd.a dialogModelConfigurationFactory, fna.i itemsFactory, jna.b accountConfirmationDelegate) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(statementsInteractor, "statementsInteractor");
        Intrinsics.checkNotNullParameter(currencySelectionInteractor, "currencySelectionInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(coreNetworkConfiguration, "coreNetworkConfiguration");
        Intrinsics.checkNotNullParameter(dialogModelConfigurationFactory, "dialogModelConfigurationFactory");
        Intrinsics.checkNotNullParameter(itemsFactory, "itemsFactory");
        Intrinsics.checkNotNullParameter(accountConfirmationDelegate, "accountConfirmationDelegate");
        this.f162747l = interactor;
        this.f162748m = statementsInteractor;
        this.f162749n = currencySelectionInteractor;
        this.o = featureToggleInteractor;
        this.f162750p = jointAccountsInteractor;
        this.f162751q = coreNetworkConfiguration;
        this.f162752r = dialogModelConfigurationFactory;
        this.f162753s = itemsFactory;
        this.f162754t = accountConfirmationDelegate;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // ina.k
    public final void Z2(RowDelegate.Model item) {
        Intrinsics.checkNotNullParameter(item, "item");
        Object obj2 = item.u;
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.model.account.AccountId.Joint");
        AccountId.Joint accountId = (AccountId.Joint) obj2;
        String id10 = accountId.f51413b;
        Intrinsics.checkNotNullParameter(id10, "id");
        String str = item.f53228a;
        int iHashCode = str.hashCode();
        vyd.a aVar = this.f162752r;
        ij0.a aVar2 = this.f162751q;
        zxd.c cVar = this.f162748m;
        switch (iHashCode) {
            case -1837899911:
                if (str.equals("ID_ACCOUNT_STATEMENT")) {
                    StatementsApi$FeatureToggles.DocumentsHub documentsHub = StatementsApi$FeatureToggles.DocumentsHub.f88209c;
                    jte.d dVar = (jte.d) this.o;
                    if (dVar.c(documentsHub) || dVar.c(StatementsApi$FeatureToggles.DocumentsHubMvp.f88210c)) {
                        DocumentsHubType.INSTANCE.getClass();
                        DocumentsHubProduct.INSTANCE.getClass();
                        e3("JOINT_CURRENT");
                    } else {
                        yji.n.l2(this, mo3.a.g(((ryd.b) this.f162749n).b(accountId, io3.l.CURRENT), null, new ijj.r(19), 1), null, new s(this, accountId, null), 3);
                    }
                    break;
                }
                break;
            case -1382657215:
                if (str.equals("ID_ANNUAL_AVERAGE")) {
                    A2(new DocumentFlowInternalDestination(new DocumentsPage.AnnualAverage(id10)));
                    break;
                }
                break;
            case -1188257286:
                if (str.equals("ID_ANNUAL_FEE_STATEMENT")) {
                    A2(new AnnualFeeDestination(accountId));
                    break;
                }
                break;
            case -1008007305:
                if (str.equals("ID_FINANCIAL_SUMMARY_STATEMENTS")) {
                    A2(new DocumentFlowInternalDestination(new DocumentsPage.FinancialSummary(id10)));
                    break;
                }
                break;
            case -954532867:
                if (str.equals("ID_CONTRACT_SUMMARY")) {
                    ContractSummaryType type = ContractSummaryType.JOINT_CURRENT;
                    ryd.w wVar = (ryd.w) cVar;
                    wVar.getClass();
                    Intrinsics.checkNotNullParameter(type, "type");
                    b3(wVar.n(2, new rsl.p(wVar, type, 12)), aVar2, aVar);
                    break;
                }
                break;
            case -841689385:
                if (str.equals("ID_RIB_STATEMENT")) {
                    ryd.w wVar2 = (ryd.w) cVar;
                    wVar2.getClass();
                    b3(wVar2.n(2, new ryd.g(wVar2, id10, 1)), aVar2, aVar);
                    break;
                }
                break;
            case -442876415:
                if (str.equals("ID_STATEMENT_OF_FEES")) {
                    A2(new StatementOfFeesDestination(StatementProductType.JOINT_CURRENT, id10, null));
                    break;
                }
                break;
            case 2007115211:
                if (str.equals("ID_ACCOUNT_CONFIRMATION")) {
                    io3.l pocketType = io3.l.CURRENT;
                    Intrinsics.checkNotNullParameter(this, "<this>");
                    Intrinsics.checkNotNullParameter(accountId, "accountId");
                    Intrinsics.checkNotNullParameter(pocketType, "pocketType");
                    this.f162754t.a(this, accountId, pocketType);
                    break;
                }
                break;
        }
    }

    @Override // ina.k
    public final Flow c3(DocumentsPage documentsPage) {
        DocumentsPage.Joint documentsPage2 = (DocumentsPage.Joint) documentsPage;
        Intrinsics.checkNotNullParameter(documentsPage2, "documentsPage");
        final int i = 0;
        Flow flowE = boh.f.e(this.f162750p.i(false), new Function1(this) { // from class: ina.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t f162745b;

            {
                this.f162745b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        od0.i jointAccountOptional = (od0.i) obj2;
                        Intrinsics.checkNotNullParameter(jointAccountOptional, "jointAccountOptional");
                        fna.h hVar = this.f162745b.f162747l;
                        n38.a aVar = (n38.a) jointAccountOptional.f224257a;
                        if (aVar != null) {
                            return hVar.a(l38.a.c(aVar));
                        }
                        throw new NullPointerException("No joint account");
                    default:
                        fna.a configuration = (fna.a) obj2;
                        Intrinsics.checkNotNullParameter(configuration, "configuration");
                        AccountId accountId = configuration.f136557a;
                        fna.i iVar = this.f162745b.f162753s;
                        RowDelegate.Model modelC = fna.i.c(iVar, "ID_ACCOUNT_STATEMENT", R$string.documents_item_account_statement, null, accountId, null, 52);
                        if (!configuration.f136561h) {
                            modelC = null;
                        }
                        RowDelegate.Model modelC2 = configuration.i ? fna.i.c(iVar, "ID_ANNUAL_FEE_STATEMENT", com.revolut.feature.statements.R$string.documents_item_annual_fee_statement, null, accountId, null, 52) : null;
                        RowDelegate.Model modelC3 = configuration.f136559c ? fna.i.c(iVar, "ID_STATEMENT_OF_FEES", R$string.documents_item_statement_of_fees, null, accountId, null, 52) : null;
                        RowDelegate.Model modelC4 = configuration.e ? fna.i.c(iVar, "ID_ANNUAL_AVERAGE", com.revolut.feature.statements.R$string.statement_annual_statement_title, null, accountId, null, 52) : null;
                        RowDelegate.Model modelC5 = fna.i.c(iVar, "ID_FINANCIAL_SUMMARY_STATEMENTS", com.revolut.feature.statements.R$string.documents_item_annual_financial_summary, null, accountId, null, 52);
                        if (!configuration.d) {
                            modelC5 = null;
                        }
                        RowDelegate.Model[] elements = {modelC, modelC2, modelC3, modelC4, modelC5};
                        Intrinsics.checkNotNullParameter(elements, "elements");
                        List listE = fna.i.e(kotlin.collections.d.L(elements), fna.i.a(R$string.documents_type_statements, "STATEMENTS_HEADER"));
                        RowDelegate.Model modelC6 = configuration.f136558b ? fna.i.c(iVar, "ID_RIB_STATEMENT", R$string.documents_item_rib, null, accountId, null, 52) : null;
                        RowDelegate.Model modelC7 = fna.i.c(iVar, "ID_ACCOUNT_CONFIRMATION", R$string.documents_item_account_confirmation, null, accountId, null, 52);
                        if (!configuration.f136560g) {
                            modelC7 = null;
                        }
                        RowDelegate.Model[] elements2 = {modelC6, modelC7};
                        Intrinsics.checkNotNullParameter(elements2, "elements");
                        return zhm.d0.E0(fna.i.e(zhm.v.l(configuration.f ? fna.i.c(iVar, "ID_CONTRACT_SUMMARY", R$string.documents_item_account_contract_summary, null, accountId, null, 52) : null), fna.i.a(R$string.documents_type_contract_summary, "CONTRACT_SUMMARY")), zhm.d0.E0(fna.i.e(kotlin.collections.d.L(elements2), fna.i.a(R$string.documents_type_confirmations, "CONFIRMATION_HEADER")), listE));
                }
            }
        });
        final int i2 = 1;
        return nim.a.v(flowE, new Function1(this) { // from class: ina.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t f162745b;

            {
                this.f162745b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        od0.i jointAccountOptional = (od0.i) obj2;
                        Intrinsics.checkNotNullParameter(jointAccountOptional, "jointAccountOptional");
                        fna.h hVar = this.f162745b.f162747l;
                        n38.a aVar = (n38.a) jointAccountOptional.f224257a;
                        if (aVar != null) {
                            return hVar.a(l38.a.c(aVar));
                        }
                        throw new NullPointerException("No joint account");
                    default:
                        fna.a configuration = (fna.a) obj2;
                        Intrinsics.checkNotNullParameter(configuration, "configuration");
                        AccountId accountId = configuration.f136557a;
                        fna.i iVar = this.f162745b.f162753s;
                        RowDelegate.Model modelC = fna.i.c(iVar, "ID_ACCOUNT_STATEMENT", R$string.documents_item_account_statement, null, accountId, null, 52);
                        if (!configuration.f136561h) {
                            modelC = null;
                        }
                        RowDelegate.Model modelC2 = configuration.i ? fna.i.c(iVar, "ID_ANNUAL_FEE_STATEMENT", com.revolut.feature.statements.R$string.documents_item_annual_fee_statement, null, accountId, null, 52) : null;
                        RowDelegate.Model modelC3 = configuration.f136559c ? fna.i.c(iVar, "ID_STATEMENT_OF_FEES", R$string.documents_item_statement_of_fees, null, accountId, null, 52) : null;
                        RowDelegate.Model modelC4 = configuration.e ? fna.i.c(iVar, "ID_ANNUAL_AVERAGE", com.revolut.feature.statements.R$string.statement_annual_statement_title, null, accountId, null, 52) : null;
                        RowDelegate.Model modelC5 = fna.i.c(iVar, "ID_FINANCIAL_SUMMARY_STATEMENTS", com.revolut.feature.statements.R$string.documents_item_annual_financial_summary, null, accountId, null, 52);
                        if (!configuration.d) {
                            modelC5 = null;
                        }
                        RowDelegate.Model[] elements = {modelC, modelC2, modelC3, modelC4, modelC5};
                        Intrinsics.checkNotNullParameter(elements, "elements");
                        List listE = fna.i.e(kotlin.collections.d.L(elements), fna.i.a(R$string.documents_type_statements, "STATEMENTS_HEADER"));
                        RowDelegate.Model modelC6 = configuration.f136558b ? fna.i.c(iVar, "ID_RIB_STATEMENT", R$string.documents_item_rib, null, accountId, null, 52) : null;
                        RowDelegate.Model modelC7 = fna.i.c(iVar, "ID_ACCOUNT_CONFIRMATION", R$string.documents_item_account_confirmation, null, accountId, null, 52);
                        if (!configuration.f136560g) {
                            modelC7 = null;
                        }
                        RowDelegate.Model[] elements2 = {modelC6, modelC7};
                        Intrinsics.checkNotNullParameter(elements2, "elements");
                        return zhm.d0.E0(fna.i.e(zhm.v.l(configuration.f ? fna.i.c(iVar, "ID_CONTRACT_SUMMARY", R$string.documents_item_account_contract_summary, null, accountId, null, 52) : null), fna.i.a(R$string.documents_type_contract_summary, "CONTRACT_SUMMARY")), zhm.d0.E0(fna.i.e(kotlin.collections.d.L(elements2), fna.i.a(R$string.documents_type_confirmations, "CONFIRMATION_HEADER")), listE));
                }
            }
        });
    }

    @Override // ina.k
    public final Object h3(DocumentsPage documentsPage, ge7.f fVar) {
        return new TextLocalisedClause(R$string.documents_group_joint, null, null, 14);
    }
}
