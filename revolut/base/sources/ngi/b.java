package ngi;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.feature_web_view.declaration.WebViewControllerDescriptor;
import com.revolut.feature_web_view.presentation.screen.WebViewScreen;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements ohi.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof WebViewControllerDescriptor) {
            WebViewControllerDescriptor webViewControllerDescriptor = (WebViewControllerDescriptor) descriptor;
            return webViewControllerDescriptor.a(new WebViewScreen(webViewControllerDescriptor.f98162a));
        }
        super.c(descriptor);
        return null;
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        return null;
    }
}
