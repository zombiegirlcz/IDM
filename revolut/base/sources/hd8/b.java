package hd8;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.feature.junior_consent.api.navigation.JuniorBlankCardDeliveryConsentDestination;
import com.revolut.feature.junior_consent.api.navigation.JuniorConsentRequestPromptDestination;
import com.revolut.feature.junior_consent.api.navigation.JuniorPaymentLinksConsentApproveDestination;
import com.revolut.feature.junior_consent.impl.ui.screen.JuniorConsentRequestPromptScreen;
import com.revolut.feature.junior_consent.impl.ui.screen.blank_card_delivery.JuniorBlankCardDeliveryConsentScreen;
import com.revolut.feature.junior_consent.impl.ui.screen.payment_links_approve.JuniorPaymentLinksConsentApproveScreen;
import kotlin.jvm.internal.Intrinsics;
import md8.d;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements ohi.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof zc8.b)) {
            return null;
        }
        zc8.b bVar = (zc8.b) descriptor;
        return bVar.a(new JuniorConsentRequestPromptScreen(new d(bVar.c(), bVar.b(), bVar.d())));
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof JuniorConsentRequestPromptDestination) {
            JuniorConsentRequestPromptDestination juniorConsentRequestPromptDestination = (JuniorConsentRequestPromptDestination) destination;
            return new JuniorConsentRequestPromptScreen(new d(juniorConsentRequestPromptDestination.getF76866a(), juniorConsentRequestPromptDestination.getF76867b(), juniorConsentRequestPromptDestination.getF76868c()));
        }
        if (destination instanceof JuniorPaymentLinksConsentApproveDestination) {
            return new JuniorPaymentLinksConsentApproveScreen();
        }
        if (destination instanceof JuniorBlankCardDeliveryConsentDestination) {
            return new JuniorBlankCardDeliveryConsentScreen(new nd8.g(((JuniorBlankCardDeliveryConsentDestination) destination).getF76865a()));
        }
        return null;
    }
}
