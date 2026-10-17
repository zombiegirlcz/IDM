package t3j;

import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.BeneficiaryInfoState;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.Field$Country;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.Field$Currency;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.Field$ExpansionDefinition;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.Field$RouteSelector;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d {
    public static BeneficiaryInfoState a(BeneficiaryInfoState state, Field$Country country, Field$Currency currency, Field$ExpansionDefinition field$ExpansionDefinition, Field$RouteSelector routeSelector, List backendDefinitions) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(routeSelector, "routeSelector");
        Intrinsics.checkNotNullParameter(backendDefinitions, "backendDefinitions");
        if (state instanceof BeneficiaryInfoState.BankRecipient) {
            return BeneficiaryInfoState.BankRecipient.z((BeneficiaryInfoState.BankRecipient) state, country, currency, routeSelector, backendDefinitions, null, field$ExpansionDefinition, 16);
        }
        if (state instanceof BeneficiaryInfoState.CreditCardBeneficiary) {
            Intrinsics.checkNotNullParameter(country, "country");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(routeSelector, "routeSelector");
            Intrinsics.checkNotNullParameter(backendDefinitions, "backendDefinitions");
            return new BeneficiaryInfoState.CreditCardBeneficiary(country, currency, routeSelector, backendDefinitions);
        }
        if (state instanceof BeneficiaryInfoState.MobileWallet) {
            return BeneficiaryInfoState.MobileWallet.z((BeneficiaryInfoState.MobileWallet) state, country, currency, routeSelector, backendDefinitions, null, 48);
        }
        if (state instanceof BeneficiaryInfoState.PaymentVendor) {
            return BeneficiaryInfoState.PaymentVendor.z((BeneficiaryInfoState.PaymentVendor) state, country, currency, routeSelector, backendDefinitions, 16);
        }
        throw new NoWhenBranchMatchedException();
    }
}
