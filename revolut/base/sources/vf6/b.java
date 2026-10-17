package vf6;

import aii.u;
import com.revolut.feature.external_accounts.api.OpenBankingConsentsApi$Toggles$AnyToAnyOutboundPaymentAndroid;
import com.revolut.feature.external_accounts.api.OpenBankingConsentsApi$Toggles$BrazilOpenBanking;
import com.revolut.feature.external_accounts.api.OpenBankingConsentsApi$Toggles$OpenBankingXSell;
import com.revolut.feature.external_accounts.api.navigation.OpenBankingAuthAccountsAustraliaDestination;
import com.revolut.feature.external_accounts.api.navigation.OpenBankingAuthAccountsDestination;
import com.revolut.feature.external_accounts.api.navigation.OpenBankingAuthPaymentDestination;
import com.revolut.feature.external_accounts.api.navigation.OpenBankingBrazilDestination;
import com.revolut.feature.external_accounts.api.navigation.OpenBankingConsentsDestination;
import com.revolut.feature.external_accounts.api.navigation.OpenBankingFundsConfirmationDestination;
import com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.accounts.OpenBankingAuthAccountsFlow;
import com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.accounts.OpenBankingAuthAccountsFlowContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.accounts_au.OpenBankingAuthAccountsAuFlow;
import com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.accounts_au.OpenBankingAuthAccountsAuFlowContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.funds_confirmation.OpenBankingFundsConfirmationFlow;
import com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.payment.OpenBankingAuthPaymentFlow;
import com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.OpenBankingBrPaymentsFlow;
import com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.OpenBankingBrPaymentsFlowContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.consents_facade.FacadeOpenBankingConsentsFlow;
import dki.g;
import gc0.c;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import pi6.k;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements ohi.a, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f288527a = 0;

    @Override // nte.a
    public final List e() {
        return v.k(OpenBankingConsentsApi$Toggles$BrazilOpenBanking.f72207c, OpenBankingConsentsApi$Toggles$OpenBankingXSell.f72208c, OpenBankingConsentsApi$Toggles$AnyToAnyOutboundPaymentAndroid.f72206c);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof OpenBankingConsentsDestination) {
            return new FacadeOpenBankingConsentsFlow();
        }
        if (destination instanceof OpenBankingAuthPaymentDestination) {
            OpenBankingAuthPaymentDestination openBankingAuthPaymentDestination = (OpenBankingAuthPaymentDestination) destination;
            return c.b(new OpenBankingAuthPaymentFlow(new k(openBankingAuthPaymentDestination.f72344a, openBankingAuthPaymentDestination.f72345b, openBankingAuthPaymentDestination.f72346c, openBankingAuthPaymentDestination.d, openBankingAuthPaymentDestination.e, openBankingAuthPaymentDestination.f, openBankingAuthPaymentDestination.f72347g)), new v1c.c(1));
        }
        if (destination instanceof OpenBankingFundsConfirmationDestination) {
            OpenBankingFundsConfirmationDestination openBankingFundsConfirmationDestination = (OpenBankingFundsConfirmationDestination) destination;
            return new OpenBankingFundsConfirmationFlow(new ni6.c(openBankingFundsConfirmationDestination.f72350a, openBankingFundsConfirmationDestination.f72351b, openBankingFundsConfirmationDestination.f72352c, openBankingFundsConfirmationDestination.d, openBankingFundsConfirmationDestination.e, openBankingFundsConfirmationDestination.f));
        }
        if (destination instanceof OpenBankingAuthAccountsDestination) {
            OpenBankingAuthAccountsDestination openBankingAuthAccountsDestination = (OpenBankingAuthAccountsDestination) destination;
            return new OpenBankingAuthAccountsFlow(new OpenBankingAuthAccountsFlowContract$InputData(openBankingAuthAccountsDestination.f72341a, openBankingAuthAccountsDestination.f72342b, openBankingAuthAccountsDestination.f72343c, openBankingAuthAccountsDestination.d, openBankingAuthAccountsDestination.e, openBankingAuthAccountsDestination.f));
        }
        if (destination instanceof OpenBankingAuthAccountsAustraliaDestination) {
            OpenBankingAuthAccountsAustraliaDestination openBankingAuthAccountsAustraliaDestination = (OpenBankingAuthAccountsAustraliaDestination) destination;
            return new OpenBankingAuthAccountsAuFlow(new OpenBankingAuthAccountsAuFlowContract$InputData(openBankingAuthAccountsAustraliaDestination.f72339a, openBankingAuthAccountsAustraliaDestination.f72340b));
        }
        if (destination instanceof OpenBankingBrazilDestination) {
            return new OpenBankingBrPaymentsFlow(new OpenBankingBrPaymentsFlowContract$InputData(((OpenBankingBrazilDestination) destination).f72348a));
        }
        return null;
    }
}
