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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes5.dex */
public final class w extends k {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final fna.h f162757l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final zxd.c f162758m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final zxd.a f162759n;
    public final gte.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ij0.a f162760p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vyd.a f162761q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final fna.i f162762r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final jna.b f162763s;

    public w(fna.h interactor, zxd.c statementsInteractor, zxd.a currencySelectionInteractor, gte.a featureToggleInteractor, ij0.a coreNetworkConfiguration, vyd.a dialogModelConfigurationFactory, fna.i itemsFactory, jna.b accountConfirmationDelegate) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(statementsInteractor, "statementsInteractor");
        Intrinsics.checkNotNullParameter(currencySelectionInteractor, "currencySelectionInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(coreNetworkConfiguration, "coreNetworkConfiguration");
        Intrinsics.checkNotNullParameter(dialogModelConfigurationFactory, "dialogModelConfigurationFactory");
        Intrinsics.checkNotNullParameter(itemsFactory, "itemsFactory");
        Intrinsics.checkNotNullParameter(accountConfirmationDelegate, "accountConfirmationDelegate");
        this.f162757l = interactor;
        this.f162758m = statementsInteractor;
        this.f162759n = currencySelectionInteractor;
        this.o = featureToggleInteractor;
        this.f162760p = coreNetworkConfiguration;
        this.f162761q = dialogModelConfigurationFactory;
        this.f162762r = itemsFactory;
        this.f162763s = accountConfirmationDelegate;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // ina.k
    public final void Z2(RowDelegate.Model item) {
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.f53228a;
        int iHashCode = str.hashCode();
        vyd.a aVar = this.f162761q;
        ij0.a aVar2 = this.f162760p;
        zxd.c cVar = this.f162758m;
        AccountId.Personal accountId = AccountId.Personal.f51414a;
        switch (iHashCode) {
            case -1837899911:
                if (str.equals("ID_ACCOUNT_STATEMENT")) {
                    StatementsApi$FeatureToggles.DocumentsHub documentsHub = StatementsApi$FeatureToggles.DocumentsHub.f88209c;
                    jte.d dVar = (jte.d) this.o;
                    if (dVar.c(documentsHub) || dVar.c(StatementsApi$FeatureToggles.DocumentsHubMvp.f88210c)) {
                        DocumentsHubType.INSTANCE.getClass();
                        DocumentsHubProduct.INSTANCE.getClass();
                        e3("PERSONAL_CURRENT");
                    } else {
                        yji.n.l2(this, mo3.a.g(((ryd.b) this.f162759n).b(accountId, io3.l.CURRENT), null, new ijj.r(20), 1), null, new v(this, null), 3);
                    }
                    break;
                }
                break;
            case -1382657215:
                if (str.equals("ID_ANNUAL_AVERAGE")) {
                    A2(new DocumentFlowInternalDestination(new DocumentsPage.AnnualAverage(null)));
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
                    A2(new DocumentFlowInternalDestination(new DocumentsPage.FinancialSummary(null)));
                    break;
                }
                break;
            case -954532867:
                if (str.equals("ID_CONTRACT_SUMMARY")) {
                    ContractSummaryType type = ContractSummaryType.PERSONAL_CURRENT;
                    ryd.w wVar = (ryd.w) cVar;
                    wVar.getClass();
                    Intrinsics.checkNotNullParameter(type, "type");
                    b3(wVar.n(2, new rsl.p(wVar, type, 12)), aVar2, aVar);
                    break;
                }
                break;
            case -841689385:
                if (str.equals("ID_RIB_STATEMENT")) {
                    String strA = fna.b.a(accountId);
                    ryd.w wVar2 = (ryd.w) cVar;
                    wVar2.getClass();
                    b3(wVar2.n(2, new ryd.g(wVar2, strA, 1)), aVar2, aVar);
                    break;
                }
                break;
            case -442876415:
                if (str.equals("ID_STATEMENT_OF_FEES")) {
                    A2(new StatementOfFeesDestination(StatementProductType.PERSONAL_CURRENT, fna.b.a(accountId), null));
                    break;
                }
                break;
            case 2007115211:
                if (str.equals("ID_ACCOUNT_CONFIRMATION")) {
                    io3.l pocketType = io3.l.CURRENT;
                    Intrinsics.checkNotNullParameter(this, "<this>");
                    Intrinsics.checkNotNullParameter(accountId, "accountId");
                    Intrinsics.checkNotNullParameter(pocketType, "pocketType");
                    this.f162763s.a(this, accountId, pocketType);
                    break;
                }
                break;
        }
    }

    @Override // ina.k
    public final Flow c3(DocumentsPage documentsPage) {
        DocumentsPage.Personal documentsPage2 = (DocumentsPage.Personal) documentsPage;
        Intrinsics.checkNotNullParameter(documentsPage2, "documentsPage");
        return nim.a.v(this.f162757l.a(AccountId.Personal.f51414a), new u(this, 0));
    }

    @Override // ina.k
    public final Object h3(DocumentsPage documentsPage, ge7.f fVar) {
        return new TextLocalisedClause(R$string.documents_group_personal, null, null, 14);
    }
}
