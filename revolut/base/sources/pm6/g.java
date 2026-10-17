package pm6;

import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends WebViewClient {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f237481a;

    public static final class a {
        private a() {
        }
    }

    public g() {
        this(null);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        Function1 function1;
        super.onPageStarted(webView, str, bitmap);
        if (!(str != null ? a0.H(str, "revolut://", false) : false) || (function1 = this.f237481a) == null) {
            return;
        }
        function1.invoke(str);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url2;
        String string;
        if (webResourceRequest == null || (url2 = webResourceRequest.getUrl()) == null || (string = url2.toString()) == null || !a0.H(string, "http://", false)) {
            return false;
        }
        String strD = a0.D(string, "http://", "https://", false);
        if (webView == null) {
            return true;
        }
        webView.loadUrl(strD);
        return true;
    }

    public g(Function1 function1) {
        this.f237481a = function1;
    }
}
