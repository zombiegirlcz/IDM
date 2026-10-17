package wie;

import android.content.Context;
import com.revolut.feature.credit.api.navigation.CreditApplicationDashboardFeatureConfig;
import com.revolut.feature.credit.api.navigation.CreditCardHomeFeatureConfig;
import com.revolut.feature.credit.api.navigation.CreditHomeFeatureConfig;
import com.revolut.feature.credit.api.navigation.EmptyStateFeatureConfig;
import com.revolut.feature.credit.api.navigation.LoanHomeFeatureConfig;
import com.revolut.feature.credit.api.navigation.PayLaterHomeFeatureConfig;
import com.revolut.feature.credit.models.CreditAccountType;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.kompot.bridge.navigation.AppHomeDestination;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import sri.m;
import zh9.u0;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements uri.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xie.c f297886a;

    public b(xie.c tabCreditNavigationInterceptor) {
        Intrinsics.checkNotNullParameter(tabCreditNavigationInterceptor, "tabCreditNavigationInterceptor");
        this.f297886a = tabCreditNavigationInterceptor;
    }

    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof CreditHomeFeatureConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        ProductAccountDescriptor$Value.Main main;
        ProductAccountDescriptor$Value.Main main2;
        CreditHomeFeatureConfig config = (CreditHomeFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        if (config instanceof PayLaterHomeFeatureConfig) {
            String facilityId = ((PayLaterHomeFeatureConfig) config).f66174a;
            Intrinsics.checkNotNullParameter(facilityId, "facilityId");
            main2 = new ProductAccountDescriptor$Value.Main(new ProductAccountId(facilityId, new CreditAccountType.PayLater(facilityId)), ProductId.CREDIT);
        } else {
            if (config instanceof CreditCardHomeFeatureConfig) {
                main = new ProductAccountDescriptor$Value.Main(com.revolut.feature.credit.models.a.b(((CreditCardHomeFeatureConfig) config).f66170a), ProductId.CREDIT);
            } else if (config instanceof LoanHomeFeatureConfig) {
                String loanId = ((LoanHomeFeatureConfig) config).f66173a;
                Intrinsics.checkNotNullParameter(loanId, "loanId");
                main2 = new ProductAccountDescriptor$Value.Main(new ProductAccountId(loanId, new CreditAccountType.Loan(loanId)), ProductId.CREDIT);
            } else if (config instanceof CreditApplicationDashboardFeatureConfig) {
                CreditApplicationDashboardFeatureConfig creditApplicationDashboardFeatureConfig = (CreditApplicationDashboardFeatureConfig) config;
                main = new ProductAccountDescriptor$Value.Main(com.revolut.feature.credit.models.a.a(creditApplicationDashboardFeatureConfig.f66168a, creditApplicationDashboardFeatureConfig.f66169b), ProductId.CREDIT);
            } else {
                if (!(config instanceof EmptyStateFeatureConfig)) {
                    throw new NoWhenBranchMatchedException();
                }
                main = new ProductAccountDescriptor$Value.Main(com.revolut.feature.credit.models.a.c(((EmptyStateFeatureConfig) config).f66171a), ProductId.CREDIT);
            }
            main2 = main;
        }
        KompotDestination kompotDestinationA = this.f297886a.a(main2);
        navigator.c(kompotDestinationA instanceof AppHomeDestination ? ((AppHomeDestination) kompotDestinationA).getF83419c() : u0.f(kompotDestinationA));
    }
}
