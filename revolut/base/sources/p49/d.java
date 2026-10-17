package p49;

import aii.e;
import aii.g;
import aii.p;
import aii.u;
import com.revolut.feature.main_screen_ui_customization.api.navigation.MainScreenUiCustomizationConfig$TabsOrderDestination;
import com.revolut.feature.main_screen_ui_customization.impl.tabs_order_settings.TabsOrderSettingsScreen;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements p {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof o49.a) {
            return ((o49.a) descriptor).a(new TabsOrderSettingsScreen());
        }
        return null;
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof MainScreenUiCustomizationConfig$TabsOrderDestination) {
            return new TabsOrderSettingsScreen();
        }
        return null;
    }
}
