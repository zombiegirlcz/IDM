package dyd;

import aii.p;
import aii.u;
import azd.e;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.statements.api.StatementsApi$FeatureToggles;
import com.revolut.feature.statements.api.StatementsMode;
import com.revolut.feature.statements.api.models.StatementPeriod;
import com.revolut.feature.statements.api.models.StatementProductType;
import com.revolut.feature.statements.api.navigation.AccountConfirmationSelectionDestination;
import com.revolut.feature.statements.api.navigation.AccountStatementProduct;
import com.revolut.feature.statements.api.navigation.AccountsStatementFeatureConfig;
import com.revolut.feature.statements.api.navigation.AnnualFeeDestination;
import com.revolut.feature.statements.api.navigation.ConsolidatedStatementDestination;
import com.revolut.feature.statements.api.navigation.CryptoStatementFeatureConfig$CryptoStatementDestination;
import com.revolut.feature.statements.api.navigation.DocumentsHubDestination$Path;
import com.revolut.feature.statements.api.navigation.DocumentsHubDestination$Root;
import com.revolut.feature.statements.api.navigation.DocumentsHubInitialConfiguration;
import com.revolut.feature.statements.api.navigation.DocumentsHubProduct;
import com.revolut.feature.statements.api.navigation.DocumentsHubType;
import com.revolut.feature.statements.api.navigation.SavingsAccountsStatementFeatureConfig$SavingsAccountsStatementDestination;
import com.revolut.feature.statements.api.navigation.StatementOfFeesDestination;
import com.revolut.feature.statements.impl.ui.account.flow.AccountsStatementFlow;
import com.revolut.feature.statements.impl.ui.account_confirmation.screen.AccountConfirmationScreen;
import com.revolut.feature.statements.impl.ui.annual_fee.screen.AnnualFeeScreen;
import com.revolut.feature.statements.impl.ui.consolidated.flow.ConsolidatedStatementFlow;
import com.revolut.feature.statements.impl.ui.consolidated.flow.ConsolidatedStatementFlowContract$InputData;
import com.revolut.feature.statements.impl.ui.crypto_statement.flow.CryptoStatementFlow;
import com.revolut.feature.statements.impl.ui.custom_statement.flow.CustomStatementFlow;
import com.revolut.feature.statements.impl.ui.documents_hub.DocumentsHubScreenContract$InputData;
import com.revolut.feature.statements.impl.ui.documents_hub.flow.DocumentsHubFlow;
import com.revolut.feature.statements.impl.ui.savings.flow.SavingsStatementsFlow;
import com.revolut.feature.statements.impl.ui.savings.flow.SavingsStatementsFlowContract$InputData;
import com.revolut.feature.statements.impl.ui.statement_of_fees.flow.StatementOfFeesFlow;
import com.revolut.feature.statements.impl.ui.statement_of_fees.flow.StatementOfFeesFlowContract$InputData;
import com.revolut.feature.statements.impl.ui.tax_certificate.flow.TaxCertificateFlow;
import com.revolut.feature.statements.impl.ui.tax_filing.TaxFilingScreen;
import com.revolut.feature.statements.impl.ui.tax_filing.TaxFilingScreenContract$InputData;
import dki.g;
import java.util.List;
import java.util.Set;
import jte.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import szd.c;
import zhm.d0;
import zhm.h0;
import zhm.y0;
import zyd.h;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements nte.a, p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f121092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f121093b;

    public b(ImmutableSet deeplinkGateways, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(deeplinkGateways, "deeplinkGateways");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f121092a = deeplinkGateways;
        this.f121093b = featureToggleInteractor;
    }

    public static DocumentsHubFlow a(b bVar, String str, String str2, Set set, StatementPeriod statementPeriod, DocumentsHubInitialConfiguration.Tab tab2, int i) {
        if ((i & 4) != 0) {
            set = h0.f322473a;
        }
        if ((i & 8) != 0) {
            statementPeriod = null;
        }
        DocumentsHubInitialConfiguration custom = tab2;
        if ((i & 16) != 0) {
            xi0.b bVar2 = (xi0.b) d0.L0(set);
            custom = bVar2 != null ? new DocumentsHubInitialConfiguration.Custom(y0.b(bVar2.f306286a), statementPeriod) : DocumentsHubInitialConfiguration.Default.f88256a;
        }
        DocumentsHubScreenContract$InputData.INSTANCE.getClass();
        return new DocumentsHubFlow(DocumentsHubScreenContract$InputData.Companion.a(str, str2, custom));
    }

    @Override // nte.a
    public final List e() {
        return StatementsApi$FeatureToggles.a();
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        String str;
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof ConsolidatedStatementDestination) {
            if (!j()) {
                return new ConsolidatedStatementFlow(new ConsolidatedStatementFlowContract$InputData(((ConsolidatedStatementDestination) destination).getF88248a()));
            }
            ConsolidatedStatementDestination consolidatedStatementDestination = (ConsolidatedStatementDestination) destination;
            StatementsMode f88248a = consolidatedStatementDestination.getF88248a();
            if (f88248a instanceof StatementsMode.Consolidated) {
                return new CustomStatementFlow();
            }
            if (f88248a instanceof StatementsMode.TaxCertificate) {
                return new TaxCertificateFlow();
            }
            if (f88248a instanceof StatementsMode.TaxFiling) {
                return new TaxFilingScreen(new TaxFilingScreenContract$InputData(consolidatedStatementDestination.getF88248a().getF88215a()));
            }
            if (Intrinsics.f(f88248a, StatementsMode.BankIDAnnualStatements.f88212a)) {
                return new ConsolidatedStatementFlow(new ConsolidatedStatementFlowContract$InputData(consolidatedStatementDestination.getF88248a()));
            }
            throw new NoWhenBranchMatchedException();
        }
        String f88259a = "JOINT_CURRENT";
        String str2 = null;
        if (destination instanceof AccountsStatementFeatureConfig.AccountsStatementDestination) {
            AccountsStatementFeatureConfig.AccountsStatementDestination accountsStatementDestination = (AccountsStatementFeatureConfig.AccountsStatementDestination) destination;
            AccountStatementProduct f88245b = accountsStatementDestination.getF88245b();
            if (!Intrinsics.f(f88245b, AccountStatementProduct.PersonalCurrent.f88237a)) {
                if (Intrinsics.f(f88245b, AccountStatementProduct.Pro.f88238a)) {
                    DocumentsHubProduct.INSTANCE.getClass();
                    DocumentsHubProduct.Companion.c();
                    str = "PRO_CURRENT";
                } else if (f88245b instanceof AccountStatementProduct.JointCurrent) {
                    DocumentsHubProduct.INSTANCE.getClass();
                    DocumentsHubProduct.Companion.a();
                } else {
                    str = null;
                }
                if (str == null && j()) {
                    DocumentsHubType.INSTANCE.getClass();
                    DocumentsHubType.Companion.a();
                    return a(this, "account-statements", str, accountsStatementDestination.getF88244a(), accountsStatementDestination.getD(), null, 16);
                }
                return new AccountsStatementFlow(new wyd.p(accountsStatementDestination.getD(), accountsStatementDestination.getF88245b(), accountsStatementDestination.getF88244a(), accountsStatementDestination.getF88246c()));
            }
            DocumentsHubProduct.INSTANCE.getClass();
            DocumentsHubProduct.Companion.b();
            f88259a = "PERSONAL_CURRENT";
            str = f88259a;
            if (str == null) {
            }
            return new AccountsStatementFlow(new wyd.p(accountsStatementDestination.getD(), accountsStatementDestination.getF88245b(), accountsStatementDestination.getF88244a(), accountsStatementDestination.getF88246c()));
        }
        if (!(destination instanceof StatementOfFeesDestination)) {
            if (destination instanceof AnnualFeeDestination) {
                return new AnnualFeeScreen(new e(((AnnualFeeDestination) destination).getF88247a()));
            }
            if (destination instanceof AccountConfirmationSelectionDestination) {
                AccountConfirmationSelectionDestination accountConfirmationSelectionDestination = (AccountConfirmationSelectionDestination) destination;
                return new AccountConfirmationScreen(new h(accountConfirmationSelectionDestination.getF88232a(), accountConfirmationSelectionDestination.getF88233b()));
            }
            if (destination instanceof CryptoStatementFeatureConfig$CryptoStatementDestination) {
                return new CryptoStatementFlow(new c(((CryptoStatementFeatureConfig$CryptoStatementDestination) destination).getF88249a()));
            }
            if (Intrinsics.f(destination, DocumentsHubDestination$Root.f88253a)) {
                DocumentsHubScreenContract$InputData.INSTANCE.getClass();
                return new DocumentsHubFlow(DocumentsHubScreenContract$InputData.Companion.b());
            }
            if (!(destination instanceof DocumentsHubDestination$Path)) {
                if (!(destination instanceof SavingsAccountsStatementFeatureConfig$SavingsAccountsStatementDestination)) {
                    return null;
                }
                SavingsAccountsStatementFeatureConfig$SavingsAccountsStatementDestination savingsAccountsStatementFeatureConfig$SavingsAccountsStatementDestination = (SavingsAccountsStatementFeatureConfig$SavingsAccountsStatementDestination) destination;
                return new SavingsStatementsFlow(new SavingsStatementsFlowContract$InputData(savingsAccountsStatementFeatureConfig$SavingsAccountsStatementDestination.getF88263a(), savingsAccountsStatementFeatureConfig$SavingsAccountsStatementDestination.getF88264b()));
            }
            DocumentsHubScreenContract$InputData.Companion companion = DocumentsHubScreenContract$InputData.INSTANCE;
            DocumentsHubDestination$Path documentsHubDestination$Path = (DocumentsHubDestination$Path) destination;
            String f88250a = documentsHubDestination$Path.getF88250a();
            String f88251b = documentsHubDestination$Path.getF88251b();
            DocumentsHubInitialConfiguration f88252c = documentsHubDestination$Path.getF88252c();
            companion.getClass();
            return new DocumentsHubFlow(DocumentsHubScreenContract$InputData.Companion.a(f88250a, f88251b, f88252c));
        }
        StatementOfFeesDestination statementOfFeesDestination = (StatementOfFeesDestination) destination;
        StatementProductType f88266b = statementOfFeesDestination.getF88266b();
        String f88267c = statementOfFeesDestination.getF88267c();
        int i = a.f121091a[f88266b.ordinal()];
        if (i == 1) {
            DocumentsHubProduct.INSTANCE.getClass();
            DocumentsHubProduct.Companion.b();
            DocumentsHubProduct documentsHubProductA = DocumentsHubProduct.a();
            if (f88267c != null) {
                documentsHubProductA = null;
            }
            if (documentsHubProductA != null) {
                f88259a = documentsHubProductA.getF88259a();
                str2 = f88259a;
            }
        } else if (i == 2) {
            DocumentsHubProduct.INSTANCE.getClass();
            DocumentsHubProduct.Companion.a();
            str2 = f88259a;
        } else if (i == 3) {
            DocumentsHubProduct.INSTANCE.getClass();
            DocumentsHubProduct.Companion.c();
            str2 = "PRO_CURRENT";
        }
        if (str2 == null || !j()) {
            return new StatementOfFeesFlow(new StatementOfFeesFlowContract$InputData(statementOfFeesDestination.getF88266b(), statementOfFeesDestination.getF88265a(), statementOfFeesDestination.getF88267c()));
        }
        DocumentsHubType.INSTANCE.getClass();
        DocumentsHubType.Companion.b();
        return a(this, "statement-of-fees", str2, null, null, new DocumentsHubInitialConfiguration.Tab("YEAR"), 12);
    }

    @Override // aii.p
    public final Set h() {
        return this.f121092a;
    }

    public final boolean j() {
        StatementsApi$FeatureToggles.DocumentsHub documentsHub = StatementsApi$FeatureToggles.DocumentsHub.f88209c;
        gte.a aVar = this.f121093b;
        if (((d) aVar).c(documentsHub)) {
            return true;
        }
        return ((d) aVar).c(StatementsApi$FeatureToggles.DocumentsHubMvp.f88210c);
    }
}
