package jqg;

import androidx.lifecycle.LifecycleOwner;
import com.revolut.core.ui_kit.views.WebView;
import com.revolut.feature.vaults.impl.ui.details.terms_viewer.VaultTermsViewerScreen;
import com.revolut.feature_web_view.presentation.WebViewActivity;
import kotlin.jvm.internal.Intrinsics;
import mx0.jd;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements jd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f177713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f177714b;

    public /* synthetic */ c(LifecycleOwner lifecycleOwner, int i) {
        this.f177713a = i;
        this.f177714b = lifecycleOwner;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // mx0.jd
    public final void onScroll(int i, int i2, int i3, int i5) {
        switch (this.f177713a) {
            case 0:
                VaultTermsViewerScreen.d3((VaultTermsViewerScreen) this.f177714b);
                return;
            default:
                WebViewActivity webViewActivity = (WebViewActivity) this.f177714b;
                WebView webView = webViewActivity.y0;
                if (webView != null) {
                    WebViewActivity.Z0(webViewActivity, webView.getScrollY() < ((Number) webViewActivity.G0.getValue()).intValue(), true);
                    return;
                } else {
                    Intrinsics.r("webView");
                    throw null;
                }
        }
    }
}
