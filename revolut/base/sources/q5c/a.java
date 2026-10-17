package q5c;

import aii.u;
import com.revolut.feature.revolut_x_promo.api.RevolutXPromoApi$Toggles;
import com.revolut.feature.revolut_x_promo.api.navigation.destinations.RevolutXInAppInstallDestination;
import com.revolut.feature.revolut_x_promo.api.navigation.destinations.RevolutXPromoDestination;
import com.revolut.feature.revolut_x_promo.impl.ui.in_app_install.RevolutXInAppInstallController;
import com.revolut.feature.revolut_x_promo.impl.ui.revolut_x_launcher.RevolutXLauncherFlow;
import dki.g;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements ohi.a, nte.a {
    @Override // nte.a
    public final List e() {
        return RevolutXPromoApi$Toggles.a();
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof RevolutXPromoDestination) {
            return new RevolutXLauncherFlow();
        }
        if (destination instanceof RevolutXInAppInstallDestination) {
            return new RevolutXInAppInstallController();
        }
        return null;
    }
}
