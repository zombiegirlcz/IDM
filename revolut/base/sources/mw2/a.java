package mw2;

import aii.u;
import com.revolut.feature.card_add_to_googlepay.api.confirm.GooglePayConfirmationDestination;
import com.revolut.feature.card_add_to_googlepay.api.confirm.GooglePayOtpVerificationDestination;
import com.revolut.feature.card_add_to_googlepay.api.confirm.GooglePayRevivalConfirmationDestination;
import com.revolut.feature.card_add_to_googlepay.impl.AddToGooglePayViewController;
import com.revolut.feature.card_add_to_googlepay.impl.credit_activation.GooglePayCreditActivationDestination;
import com.revolut.feature.card_add_to_googlepay.impl.navigation.AddToGooglePayDestination;
import com.revolut.feature.card_add_to_googlepay.impl.navigation.GooglePayFeatureGateway$AddCardToGooglePayMigration;
import com.revolut.feature.card_add_to_googlepay.impl.verification.GooglePayConfirmationFlow;
import com.revolut.feature.card_add_to_googlepay.impl.verification.GooglePayConfirmationFlowContract$InputData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements ohi.a, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.feature.card_add_to_googlepay.impl.credit_activation.a f209310a;

    public a(com.revolut.feature.card_add_to_googlepay.impl.credit_activation.a creditActivationControllerProvider) {
        Intrinsics.checkNotNullParameter(creditActivationControllerProvider, "creditActivationControllerProvider");
        this.f209310a = creditActivationControllerProvider;
    }

    @Override // nte.a
    public final List e() {
        return d0.F0(GooglePayFeatureGateway$AddCardToGooglePayMigration.f64472c, zv2.a.a());
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof GooglePayOtpVerificationDestination) {
            return new GooglePayConfirmationFlow(new GooglePayConfirmationFlowContract$InputData.OtpVerification(((GooglePayOtpVerificationDestination) destination).getF64440a()));
        }
        if (destination instanceof GooglePayConfirmationDestination) {
            GooglePayConfirmationDestination googlePayConfirmationDestination = (GooglePayConfirmationDestination) destination;
            return new GooglePayConfirmationFlow(new GooglePayConfirmationFlowContract$InputData.Confirmation(googlePayConfirmationDestination.getF64438a(), googlePayConfirmationDestination.getF64439b()));
        }
        if (destination instanceof GooglePayRevivalConfirmationDestination) {
            GooglePayRevivalConfirmationDestination googlePayRevivalConfirmationDestination = (GooglePayRevivalConfirmationDestination) destination;
            return new GooglePayConfirmationFlow(new GooglePayConfirmationFlowContract$InputData.RevivalConfirmation(googlePayRevivalConfirmationDestination.getF64441a(), googlePayRevivalConfirmationDestination.getF64442b()));
        }
        if (destination instanceof GooglePayCreditActivationDestination) {
            return this.f209310a.a(((GooglePayCreditActivationDestination) destination).getF64468a());
        }
        if (destination instanceof AddToGooglePayDestination) {
            return new AddToGooglePayViewController(((AddToGooglePayDestination) destination).getF64471a());
        }
        return null;
    }
}
