package cn2;

import aii.e;
import aii.g;
import aii.u;
import cm2.c;
import cm2.h;
import com.revolut.feature.backgroundpicker.api.BackgroundPickerForResultDestination;
import com.revolut.feature.backgroundpicker.api.ThemeCustomisationDestination;
import com.revolut.feature.backgroundpicker.api.model.BackgroundPickerFlowInput;
import com.revolut.feature.backgroundpicker.impl.flow.BackgroundPickerFlow;
import com.revolut.feature.backgroundpicker.impl.ui.flow.theme_customisation.ThemeCustomisationFlow;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements ohi.a, nte.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof c) {
            c cVar = (c) descriptor;
            return cVar.a(new BackgroundPickerFlow(new BackgroundPickerFlowInput(null, cVar.b())));
        }
        if (!(descriptor instanceof h)) {
            return null;
        }
        h hVar = (h) descriptor;
        return hVar.a(new ThemeCustomisationFlow(hVar.b(), hVar.d(), hVar.c()));
    }

    @Override // nte.a
    public final List e() {
        return f0.f322471a;
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof BackgroundPickerForResultDestination) {
            return gc0.c.b(new BackgroundPickerFlow(new BackgroundPickerFlowInput(null, ((BackgroundPickerForResultDestination) destination).getF63729b())), new qm2.e());
        }
        if (!(destination instanceof ThemeCustomisationDestination)) {
            return null;
        }
        ThemeCustomisationDestination themeCustomisationDestination = (ThemeCustomisationDestination) destination;
        return new ThemeCustomisationFlow(themeCustomisationDestination.getF63734b(), themeCustomisationDestination.getF63735c(), themeCustomisationDestination.getD(), themeCustomisationDestination.getE(), themeCustomisationDestination.getF());
    }
}
