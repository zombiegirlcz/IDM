package jfb;

import android.net.Uri;
import androidx.webkit.JavaScriptReplyProxy;
import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebViewCompat;
import com.revolut.core.ui_kit.views.WebView;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f173823a;

    public abstract Set a(Uri uri2);

    public abstract String b();

    public abstract String c();

    public final void d(WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        if (c().length() == 0) {
            return;
        }
        Uri uri2 = Uri.parse(c());
        if (uri2.getHost() == null) {
            return;
        }
        WebViewCompat.addWebMessageListener(webView, b(), a(uri2), new k1(this));
        this.f173823a = true;
    }

    public abstract void e(android.webkit.WebView webView, WebMessageCompat webMessageCompat, Uri uri2, boolean z, JavaScriptReplyProxy javaScriptReplyProxy);

    public void f(android.webkit.WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        if (this.f173823a) {
            WebViewCompat.removeWebMessageListener(webView, b());
        }
    }
}
