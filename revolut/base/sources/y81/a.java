package y81;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.feature.accessibility_settings.api.AccessibilitySettingsDestination;
import com.revolut.feature.accessibility_settings.impl.ui.flow.accessibility_settings.AccessibilitySettingsFlow;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof s81.a) {
            return ((s81.a) descriptor).a(new AccessibilitySettingsFlow());
        }
        return null;
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof AccessibilitySettingsDestination) {
            return new AccessibilitySettingsFlow();
        }
        return null;
    }
}
