package bz2;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.feature.card_management.api.cardagreements.CardIssuanceAgreementControllerContract$InputData;
import com.revolut.feature.card_management.impl.cardagreements.flow.CardIssuanceAgreementFlow;
import com.revolut.feature.card_management.impl.cardagreements.flow.CardIssuanceAgreementFlowContract$InputData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import xy2.b;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements ohi.a, nte.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof b)) {
            return null;
        }
        b bVar = (b) descriptor;
        CardIssuanceAgreementControllerContract$InputData cardIssuanceAgreementControllerContract$InputData = bVar.f309556a;
        return bVar.a(new CardIssuanceAgreementFlow(new CardIssuanceAgreementFlowContract$InputData(cardIssuanceAgreementControllerContract$InputData.f64799a, cardIssuanceAgreementControllerContract$InputData.f64800b)));
    }

    @Override // nte.a
    public final List e() {
        return f0.f322471a;
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        return null;
    }
}
