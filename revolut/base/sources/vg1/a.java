package vg1;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.feature.add_card_to_google_pay_shared.api.confirm.GooglePayConfirmationDestination;
import com.revolut.feature.add_card_to_google_pay_shared.api.confirm.GooglePayOtpVerificationDestination;
import com.revolut.feature.add_card_to_google_pay_shared.api.confirm.GooglePayRevivalConfirmationDestination;
import com.revolut.feature.add_card_to_google_pay_shared.api.navigation.CardSecurityPromptDestination;
import com.revolut.feature.add_card_to_google_pay_shared.impl.add_to_google.AddToGooglePayBottomSheetController;
import com.revolut.feature.add_card_to_google_pay_shared.impl.add_to_google.AddToGooglePayBottomSheetControllerContract$InputData;
import com.revolut.feature.add_card_to_google_pay_shared.impl.card_security.CardSecurityFlow;
import com.revolut.feature.add_card_to_google_pay_shared.impl.card_security.CardSecurityFlowContract$InputData;
import com.revolut.feature.add_card_to_google_pay_shared.impl.card_security.screen.CardSecurityPromptController;
import com.revolut.feature.add_card_to_google_pay_shared.impl.card_security.screen.CardSecurityPromptScreenContract$InputData;
import com.revolut.feature.add_card_to_google_pay_shared.impl.verification.GooglePayConfirmationFlow;
import com.revolut.feature.add_card_to_google_pay_shared.impl.verification.GooglePayConfirmationFlowContract$InputData;
import kg1.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof b) {
            b bVar = (b) descriptor;
            return bVar.a(new AddToGooglePayBottomSheetController(new AddToGooglePayBottomSheetControllerContract$InputData(bVar.f183898a)));
        }
        if (!(descriptor instanceof kg1.e)) {
            return null;
        }
        kg1.e eVar = (kg1.e) descriptor;
        return eVar.a(new CardSecurityPromptController(new CardSecurityPromptScreenContract$InputData(eVar.f183901a, eVar.f183902b, eVar.f183903c)));
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof GooglePayOtpVerificationDestination) {
            return new GooglePayConfirmationFlow(new GooglePayConfirmationFlowContract$InputData.OtpVerification(((GooglePayOtpVerificationDestination) destination).f60858a));
        }
        if (destination instanceof GooglePayConfirmationDestination) {
            GooglePayConfirmationDestination googlePayConfirmationDestination = (GooglePayConfirmationDestination) destination;
            return new GooglePayConfirmationFlow(new GooglePayConfirmationFlowContract$InputData.Confirmation(googlePayConfirmationDestination.f60856a, googlePayConfirmationDestination.f60857b));
        }
        if (destination instanceof GooglePayRevivalConfirmationDestination) {
            GooglePayRevivalConfirmationDestination googlePayRevivalConfirmationDestination = (GooglePayRevivalConfirmationDestination) destination;
            return new GooglePayConfirmationFlow(new GooglePayConfirmationFlowContract$InputData.RevivalConfirmation(googlePayRevivalConfirmationDestination.f60860a, googlePayRevivalConfirmationDestination.f60861b));
        }
        if (!(destination instanceof CardSecurityPromptDestination)) {
            return null;
        }
        CardSecurityPromptDestination cardSecurityPromptDestination = (CardSecurityPromptDestination) destination;
        return new CardSecurityFlow(new CardSecurityFlowContract$InputData.CardSecurityPrompt(cardSecurityPromptDestination.f60862a, cardSecurityPromptDestination.f60863b, cardSecurityPromptDestination.f60864c));
    }
}
