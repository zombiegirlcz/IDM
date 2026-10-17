package lrg;

import aii.u;
import com.revolut.feature.view.image.api.navigation.ViewImageDestination;
import com.revolut.feature.view.image.impl.flow.ViewImageFlow;
import com.revolut.feature.view.image.impl.flow.ViewImageFlowContract$InputData;
import dki.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        ViewImageFlowContract$InputData gallery;
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (!(destination instanceof ViewImageDestination)) {
            return null;
        }
        ViewImageDestination.InputData inputData = ((ViewImageDestination) destination).f94806b;
        if (inputData instanceof ViewImageDestination.InputData.Local) {
            gallery = new ViewImageFlowContract$InputData.Local(((ViewImageDestination.InputData.Local) inputData).getF94809a());
        } else if (inputData instanceof ViewImageDestination.InputData.Remote) {
            ViewImageDestination.InputData.Remote remote = (ViewImageDestination.InputData.Remote) inputData;
            gallery = new ViewImageFlowContract$InputData.Remote(remote.getF94811b(), remote.getF94810a());
        } else {
            if (!(inputData instanceof ViewImageDestination.InputData.Gallery)) {
                throw new NoWhenBranchMatchedException();
            }
            ViewImageDestination.InputData.Gallery gallery2 = (ViewImageDestination.InputData.Gallery) inputData;
            gallery = new ViewImageFlowContract$InputData.Gallery(gallery2.getF94807a(), gallery2.getF94808b());
        }
        return new ViewImageFlow(gallery);
    }
}
