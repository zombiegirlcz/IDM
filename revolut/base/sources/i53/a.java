package i53;

import aii.e;
import aii.g;
import b53.d;
import com.revolut.feature.card_personalisation.generation.api.CardPersonalisationGenerationUiApi$Toggles$AiCardCustomisationAirBranding;
import com.revolut.feature.card_personalisation.generation.impl.ui.generation.CustomisationImageGenerationController;
import com.revolut.feature.card_personalisation.generation.impl.ui.generation.CustomisationImageGenerationControllerContract$InputData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements ohi.a, nte.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof d) {
            d dVar = (d) descriptor;
            return dVar.a(new CustomisationImageGenerationController(new CustomisationImageGenerationControllerContract$InputData(dVar.f12425a.f12422a)));
        }
        super.c(descriptor);
        return null;
    }

    @Override // nte.a
    public final List e() {
        return u.c(CardPersonalisationGenerationUiApi$Toggles$AiCardCustomisationAirBranding.f65310c);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(aii.u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        return null;
    }
}
