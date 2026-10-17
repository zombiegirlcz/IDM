package s2a;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.feature.payments.transfers.personalisation.api.TransfersPersonalisationToggles$GalleryStylePicker;
import com.revolut.feature.payments.transfers.personalisation.api.TransfersPersonalisationToggles$GalleryZoom;
import com.revolut.feature.payments.transfers.personalisation.impl.ui.flow.TransfersPersonalisationFlow;
import com.revolut.feature.payments.transfers.personalisation.impl.ui.flow.TransfersPersonalisationFlowContract$InputData;
import g2a.b;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements ohi.a, nte.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof b)) {
            return null;
        }
        b bVar = (b) descriptor;
        return bVar.a(new TransfersPersonalisationFlow(new TransfersPersonalisationFlowContract$InputData(t2a.e.STYLE, bVar.f139953a.f79960a)));
    }

    @Override // nte.a
    public final List e() {
        return v.k(TransfersPersonalisationToggles$GalleryStylePicker.f79955c, TransfersPersonalisationToggles$GalleryZoom.f79956c);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        return null;
    }
}
