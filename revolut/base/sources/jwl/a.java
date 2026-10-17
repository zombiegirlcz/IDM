package jwl;

import android.content.Context;
import com.revolut.core.backend_flow.ui.BackendFlowContract$Configuration;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.forbearance.application.api.navigation.ForbearanceFeatureConfig;
import com.revolut.feature.credit.loan.api.navigation.LoanExternalFeatureConfig;
import com.revolut.feature.subscriptions.models.RecurringPaymentAccount;
import com.revolut.feature.subscriptions.models.RecurringPaymentFilter;
import com.revolut.feature.topup_screen.api.config.TopUpConfig;
import com.revolut.feature.topup_screen.api.destination.InitTopUpDestination;
import com.revolut.feature.transactions.api.navigation.TransactionDestination;
import com.revolut.feature.transactions.api.navigation.TransactionListDestination;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.feature.transactions.api.navigation.TransactionsListFilterType;
import com.revolut.feature_pdf_view.ui.PdfViewContract$Configuration;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.DummyCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import g9i.i;
import g9i.p;
import gde.d;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import ofm.q;
import rhf.g;
import rhf.h;
import sri.m;
import tof.q6;
import tof.s9;
import zh9.u0;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements uri.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f179022a;

    public a(d helpCentreNaviCommandProvider) {
        Intrinsics.checkNotNullParameter(helpCentreNaviCommandProvider, "helpCentreNaviCommandProvider");
        this.f179022a = helpCentreNaviCommandProvider;
    }

    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof LoanExternalFeatureConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        NaviCommand naviCommandF;
        NaviCommand featureCommand;
        LoanExternalFeatureConfig config = (LoanExternalFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        if (config instanceof LoanExternalFeatureConfig.LoanTopUp) {
            naviCommandF = u0.f(new InitTopUpDestination(TopUpConfig.Companion.a(TopUpConfig.INSTANCE, ((LoanExternalFeatureConfig.LoanTopUp) config).f70214a, null, null, 30)));
        } else {
            if (config instanceof LoanExternalFeatureConfig.LoanPdfView) {
                p.Companion.getClass();
                LoanExternalFeatureConfig.LoanPdfView loanPdfView = (LoanExternalFeatureConfig.LoanPdfView) config;
                featureCommand = new ActivityNavigateCommand(i.f141889b, new PdfViewContract$Configuration(loanPdfView.f70211b, loanPdfView.f70210a, loanPdfView.f70212c), null, null, 0, null, null, null, null, false, 1020);
            } else if (config instanceof LoanExternalFeatureConfig.LoanSupport) {
                naviCommandF = this.f179022a.a();
            } else if (config instanceof LoanExternalFeatureConfig.LoanTransactionDetails) {
                naviCommandF = new FeatureCommand(new TransactionsFeatureConfig.Details(q.P(((LoanExternalFeatureConfig.LoanTransactionDetails) config).f70215a), null, null, null, 126));
            } else if (config instanceof LoanExternalFeatureConfig.LoanTransactionsSearch) {
                naviCommandF = u0.f(new TransactionListDestination(new TransactionListDestination.InputData((Clause) new TextLocalisedClause(R$string.loan_management_details_past_repayments, null, null, 14), (TextLocalisedClause) null, (UrlImage) null, false, (TransactionsListFilterType) new TransactionsListFilterType.ByTransactionsFilter(new s9(((LoanExternalFeatureConfig.LoanTransactionsSearch) config).f70217b), null, null, 6), (String) null, (AccountId) null, (h) null, (g) null, (TransactionDestination) null, (q6) null, (Set) null, (RecurringPaymentAccount) null, (RecurringPaymentFilter) null, false, 65518)));
            } else if (config instanceof LoanExternalFeatureConfig.LoanForbearanceApplication) {
                featureCommand = new FeatureCommand(new ForbearanceFeatureConfig.ForbearanceApplicationQuestionnaire(new BackendFlowContract$Configuration(30, null, "LOAN_FORBEARANCE_APPLICATION_FLOW"), ((LoanExternalFeatureConfig.LoanForbearanceApplication) config).f70209a));
            } else {
                naviCommandF = DummyCommand.f98635a;
            }
            naviCommandF = featureCommand;
        }
        navigator.c(naviCommandF);
    }
}
