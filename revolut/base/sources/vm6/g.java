package vm6;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;
import org.jetbrains.annotations.NotNull;
import vh2.j;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends WebViewClient {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f290548a;

    public static final class a {
        private a() {
        }
    }

    public g() {
        this(null);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url2;
        String string = (webResourceRequest == null || (url2 = webResourceRequest.getUrl()) == null) ? null : url2.toString();
        if (string == null || !a0.H(string, "revolut://", false)) {
            return false;
        }
        Function1 function1 = this.f290548a;
        if (function1 == null) {
            return true;
        }
        function1.invoke(string);
        return true;
    }

    public g(j jVar) {
        this.f290548a = jVar;
    }
}
