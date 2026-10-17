package l6d;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.feature.shared.branding.api.destination.BrandingSharedDestination;
import com.revolut.feature.shared.branding.impl.ui.BrandingSettingsFlow;
import com.revolut.feature.shared.branding.impl.ui.BrandingSettingsFlowContract$InputData;
import com.revolut.feature.shared.branding.impl.ui.preview_auto.PaymentLinkAutoPreviewScreen;
import com.revolut.feature.shared.branding.impl.ui.preview_auto.PaymentLinkAutoPreviewScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements ohi.a {
    @Override // ohi.a, nhi.h, aii.p
    public final void b() {
        o6d.b.Companion.b();
    }

    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof j6d.a) {
            j6d.a aVar = (j6d.a) descriptor;
            return aVar.a(new BrandingSettingsFlow(new BrandingSettingsFlowContract$InputData(aVar.b().getF86063a())));
        }
        if (descriptor instanceof j6d.b) {
            j6d.b bVar = (j6d.b) descriptor;
            return bVar.a(new PaymentLinkAutoPreviewScreen(new PaymentLinkAutoPreviewScreenContract$InputData(bVar.b().getF86066a(), bVar.b().getF86067b(), bVar.b().getF86068c(), bVar.b().getD())));
        }
        super.c(descriptor);
        return null;
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof BrandingSharedDestination) {
            return new BrandingSettingsFlow(new BrandingSettingsFlowContract$InputData(((BrandingSharedDestination) destination).f86064b.getF86065a()));
        }
        return null;
    }
}
