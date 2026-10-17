package nu7;

import bu7.y0;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.insurance_embedded.api.models.RemoteDocument;
import com.revolut.feature_web_view.declaration.WebViewControllerDescriptor;
import com.revolut.feature_web_view.declaration.WebViewInputData;
import com.revolut.feature_web_view.declaration.WebViewScreenTitleSource;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ControllerDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class l {
    public static d a(RemoteDocument remoteDocument, Clause clause) {
        Intrinsics.checkNotNullParameter(remoteDocument, "<this>");
        y0 y0Var = remoteDocument.f75845b;
        String str = remoteDocument.f75844a;
        int i = k.f219230a[y0Var.ordinal()];
        if (i == 1) {
            return new c(new f9i.c(new f9i.e(str, false)));
        }
        if (i == 2) {
            return b(clause, str);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final b b(Clause clause, String str) {
        return new b(new BridgeDestination(u0.f(new ControllerDestination.Stack(new WebViewControllerDescriptor(new WebViewInputData(str, new WebViewScreenTitleSource.Static(clause), false)), null, true))));
    }
}
