package hsf;

import aii.e;
import aii.g;
import com.revolut.feature.transfer_reasons.api.TransferReasonsToggles$CoFxDeclarations;
import com.revolut.feature.transfer_reasons.api.navigation.TransferReasonsNavigation$Destination;
import com.revolut.feature.transfer_reasons.api.navigation.c;
import com.revolut.feature.transfer_reasons.impl.flow.TransferReasonsFlow;
import com.revolut.feature.transfer_reasons.impl.ui.legal_confirmation.LegalConfirmationScreen;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements ohi.a, nte.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof com.revolut.feature.transfer_reasons.api.navigation.b) {
            com.revolut.feature.transfer_reasons.api.navigation.b bVar = (com.revolut.feature.transfer_reasons.api.navigation.b) descriptor;
            return bVar.a(new TransferReasonsFlow(bVar.f92330a));
        }
        if (descriptor instanceof com.revolut.feature.transfer_reasons.api.navigation.a) {
            com.revolut.feature.transfer_reasons.api.navigation.a aVar = (com.revolut.feature.transfer_reasons.api.navigation.a) descriptor;
            return aVar.a(new TransferReasonsFlow(aVar.f92329a));
        }
        if (descriptor instanceof c) {
            c cVar = (c) descriptor;
            return cVar.a(new TransferReasonsFlow(cVar.f92331a));
        }
        if (!(descriptor instanceof dsf.a)) {
            return null;
        }
        dsf.a aVar2 = (dsf.a) descriptor;
        return aVar2.a(new LegalConfirmationScreen(aVar2.f117307a));
    }

    @Override // nte.a
    public final List e() {
        return u.c(TransferReasonsToggles$CoFxDeclarations.f92312c);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(aii.u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof TransferReasonsNavigation$Destination) {
            return new TransferReasonsFlow(((TransferReasonsNavigation$Destination) destination).f92328b);
        }
        return null;
    }
}
