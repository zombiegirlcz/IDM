package ui8;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.feature.junior_payment_links.api.navigation.JuniorCardProfileNavigationDestination;
import com.revolut.feature.junior_payment_links.impl.ui.flow.card_profile.JuniorCardProfileFlow;
import com.revolut.feature.junior_payment_links.impl.ui.flow.card_profile.JuniorCardProfileFlowContract$Input;
import com.revolut.feature.junior_payment_links.impl.ui.screen.consent.JuniorPaymentLinksConsentScreen;
import com.revolut.feature.junior_payment_links.impl.ui.screen.custom_amount.JuniorPaymentLinkCustomAmountScreen;
import com.revolut.feature.junior_payment_links.impl.ui.screen.custom_amount.JuniorPaymentLinkCustomAmountScreenContract$Input;
import kotlin.jvm.internal.Intrinsics;
import ti8.c;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof c) {
            c cVar = (c) descriptor;
            return cVar.a(new JuniorPaymentLinksConsentScreen(cVar.b()));
        }
        if (!(descriptor instanceof ti8.a)) {
            return null;
        }
        ti8.a aVar = (ti8.a) descriptor;
        return aVar.a(new JuniorPaymentLinkCustomAmountScreen(new JuniorPaymentLinkCustomAmountScreenContract$Input(aVar.b())));
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof JuniorCardProfileNavigationDestination) {
            return new JuniorCardProfileFlow(new JuniorCardProfileFlowContract$Input(((JuniorCardProfileNavigationDestination) destination).getF77075a()));
        }
        return null;
    }
}
