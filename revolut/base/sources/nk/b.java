package nk;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.meshconnect.link.ui.LinkActivity;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes17.dex */
public final class b extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f216606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f216607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LinkActivity f216608c;

    public b(LinkActivity linkActivity, boolean z, String linkHost) {
        Intrinsics.checkNotNullParameter(linkHost, "linkHost");
        this.f216608c = linkActivity;
        this.f216606a = z;
        this.f216607b = linkHost;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        boolean zF;
        super.onPageCommitVisible(webView, str);
        ?? r4 = this.f216608c.f49861a0;
        ConstraintLayout toolbar = ((mk.a) r4.getValue()).e;
        Intrinsics.checkNotNullExpressionValue(toolbar, "toolbar");
        try {
            zF = Intrinsics.f(new URL(str).getHost(), this.f216607b);
        } catch (Exception unused) {
            zF = false;
        }
        toolbar.setVisibility(zF ? 8 : 0);
        ProgressBar progress = ((mk.a) r4.getValue()).d;
        Intrinsics.checkNotNullExpressionValue(progress, "progress");
        progress.setVisibility(8);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Object next;
        if (webResourceRequest == null) {
            return true;
        }
        if (!this.f216606a) {
            String url2 = webResourceRequest.getUrl().toString();
            Intrinsics.checkNotNullExpressionValue(url2, "toString(...)");
            String host = webResourceRequest.getUrl().getHost();
            if (host == null) {
                host = "";
            }
            List list = qk.e.f246927a;
            Intrinsics.checkNotNullParameter(url2, "url");
            Intrinsics.checkNotNullParameter(host, "host");
            Iterator it8 = qk.e.f246927a.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                String str = (String) next;
                if (a0.H(url2, str, false) || a0.y(host, str, false)) {
                    break;
                }
            }
            if (next == null) {
                return true;
            }
        } else if (!Intrinsics.f(webResourceRequest.getUrl().getScheme(), "https")) {
            return true;
        }
        return false;
    }
}
