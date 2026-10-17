package wi3;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.feature.chooser.external_map.navigation.BottomChooserExternalMapDestination;
import com.revolut.feature.chooser.external_map.screen.BottomChooserExternalMapAppScreen;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        super.c(descriptor);
        return null;
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (!(destination instanceof BottomChooserExternalMapDestination)) {
            return null;
        }
        BottomChooserExternalMapDestination bottomChooserExternalMapDestination = (BottomChooserExternalMapDestination) destination;
        return new BottomChooserExternalMapAppScreen(new yi3.b(bottomChooserExternalMapDestination.getF65918a(), bottomChooserExternalMapDestination.getF65919b()));
    }
}
