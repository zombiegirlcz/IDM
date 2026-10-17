package ze5;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.feature.crypto.earn.assets.shared.api.navigation.EarnAssetsPreviewScreenDestination;
import com.revolut.feature.crypto.earn.assets.shared.api.navigation.EarnAssetsScreenDestination;
import com.revolut.feature.crypto.earn.assets.shared.impl.ui.preview.EarnAssetsPreviewScreenController;
import com.revolut.feature.crypto.earn.assets.shared.impl.ui.root.EarnAssetsRootScreenController;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements ohi.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof xe5.a) {
            return ((xe5.a) descriptor).a(new EarnAssetsRootScreenController());
        }
        return null;
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof EarnAssetsScreenDestination) {
            return new EarnAssetsRootScreenController();
        }
        if (destination instanceof EarnAssetsPreviewScreenDestination) {
            return new EarnAssetsPreviewScreenController();
        }
        return null;
    }
}
