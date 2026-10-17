package uf6;

import android.content.Context;
import com.revolut.feature.external_accounts.api.OpenBankingConsentsApi$Toggles$AnyToAnyOutboundPaymentAndroid;
import com.revolut.feature.external_accounts.api.navigation.ExternalAccountsFeatureConfig;
import com.revolut.feature.external_accounts.api.navigation.LinkSuccessDestination;
import com.revolut.feature.external_accounts.api.navigation.OpenBankingAuthAccountsDestination;
import com.revolut.feature.external_accounts.api.navigation.OpenBankingAuthPaymentDestination;
import com.revolut.feature.external_accounts.api.navigation.OpenBankingConsentsDestination;
import com.revolut.feature.external_accounts.api.navigation.OpenBankingFundsConfirmationDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import sri.m;
import zh9.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements uri.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f279590a;

    public h(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f279590a = featureToggleInteractor;
    }

    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof ExternalAccountsFeatureConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        FeatureCommand featureCommandF;
        ExternalAccountsFeatureConfig config = (ExternalAccountsFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        if (config instanceof ExternalAccountsFeatureConfig.LinkSuccess) {
            ExternalAccountsFeatureConfig.LinkSuccess linkSuccess = (ExternalAccountsFeatureConfig.LinkSuccess) config;
            featureCommandF = vhi.c.c(new LinkSuccessDestination(linkSuccess.f72307a, linkSuccess.f72308b, linkSuccess.f72309c, linkSuccess.d), yhi.b.SOLID, null, false, 12);
        } else if (config instanceof ExternalAccountsFeatureConfig.Permissions) {
            featureCommandF = u0.f(OpenBankingConsentsDestination.f72349a);
        } else if (config instanceof ExternalAccountsFeatureConfig.AppToApp.AuthenticateAccounts) {
            ExternalAccountsFeatureConfig.AppToApp.Configuration configuration = ((ExternalAccountsFeatureConfig.AppToApp.AuthenticateAccounts) config).f72271a;
            featureCommandF = u0.f(new OpenBankingAuthAccountsDestination(configuration.f72272a, configuration.f72273b, configuration.f72274c, configuration.d, configuration.e, configuration.f));
        } else if (config instanceof ExternalAccountsFeatureConfig.AppToApp.Payment) {
            ExternalAccountsFeatureConfig.AppToApp.Configuration configuration2 = ((ExternalAccountsFeatureConfig.AppToApp.Payment) config).f72276a;
            featureCommandF = u0.f(new OpenBankingAuthPaymentDestination(configuration2.f72272a, configuration2.f72273b, configuration2.f72274c, configuration2.d, configuration2.e, configuration2.f, ((jte.d) this.f279590a).c(OpenBankingConsentsApi$Toggles$AnyToAnyOutboundPaymentAndroid.f72206c)));
        } else {
            if (!(config instanceof ExternalAccountsFeatureConfig.AppToApp.Funds)) {
                throw new NoWhenBranchMatchedException();
            }
            ExternalAccountsFeatureConfig.AppToApp.Configuration configuration3 = ((ExternalAccountsFeatureConfig.AppToApp.Funds) config).f72275a;
            featureCommandF = u0.f(new OpenBankingFundsConfirmationDestination(configuration3.f72272a, configuration3.f72273b, configuration3.f72274c, configuration3.d, configuration3.e, configuration3.f));
        }
        navigator.c(featureCommandF);
    }
}
