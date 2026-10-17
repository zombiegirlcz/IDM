package androidx.webkit.internal;

import android.net.Uri;
import android.webkit.WebView;
import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebViewCompat;
import java.lang.reflect.InvocationHandler;
import jfb.k1;
import knm.b;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;

/* JADX INFO: loaded from: classes16.dex */
public class WebMessageListenerAdapter implements WebMessageListenerBoundaryInterface {
    private final WebViewCompat.WebMessageListener mWebMessageListener;

    public WebMessageListenerAdapter(WebViewCompat.WebMessageListener webMessageListener) {
        this.mWebMessageListener = webMessageListener;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    public void onPostMessage(WebView view, InvocationHandler invocationHandler, Uri sourceOrigin, boolean z, InvocationHandler invocationHandler2) {
        WebMessageCompat message = WebMessageAdapter.webMessageCompatFromBoundaryInterface((WebMessageBoundaryInterface) b.c(WebMessageBoundaryInterface.class, invocationHandler));
        if (message != null) {
            JavaScriptReplyProxyImpl replyProxy = JavaScriptReplyProxyImpl.forInvocationHandler(invocationHandler2);
            k1 k1Var = (k1) this.mWebMessageListener;
            k1Var.getClass();
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(sourceOrigin, "sourceOrigin");
            Intrinsics.checkNotNullParameter(replyProxy, "replyProxy");
            k1Var.f173819a.e(view, message, sourceOrigin, z, replyProxy);
        }
    }
}
