package hd7;

import aii.u;
import com.revolut.feature.html_viewer.api.declaration.HtmlViewerDestination;
import com.revolut.feature.html_viewer.impl.screen.HtmlViewerScreen;
import com.revolut.feature.html_viewer.impl.screen.HtmlViewerScreenContract$InputData;
import dki.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (!(destination instanceof HtmlViewerDestination)) {
            return null;
        }
        HtmlViewerDestination.InputData inputData = ((HtmlViewerDestination) destination).f74749b;
        return new HtmlViewerScreen(new HtmlViewerScreenContract$InputData(inputData.f74750a, inputData.f74751b));
    }
}
