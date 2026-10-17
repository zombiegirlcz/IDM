package zd4;

import com.revolut.feature_pdf_view.PdfViewFeatureConfiguration;
import com.revolut.feature_web_view.WebViewFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes22.dex */
public final class b {
    public static BridgeDestination a(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        return a0.y(url2, ".pdf", false) ? new BridgeDestination(new FeatureCommand(new PdfViewFeatureConfiguration(url2, null, true, true, 26))) : new BridgeDestination(new FeatureCommand(new WebViewFeatureConfig(url2, null, 0, true, true, true, 65438)));
    }
}
