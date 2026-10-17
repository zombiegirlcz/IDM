package ty8;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.revolut.core.error.data.model.ServerError;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.a0;
import tx0.p4;

/* JADX INFO: loaded from: classes4.dex */
public final class s extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f275530a;

    public s(d model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f275530a = model;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        ServerError error = new ServerError(webResourceError != null ? webResourceError.getErrorCode() : 1, String.valueOf(webResourceError != null ? webResourceError.getDescription() : null), null, null);
        p pVar = (p) this.f275530a;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(error, "error");
        pVar.x2(new p4(error, 3));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String url2) {
        String str;
        int i = uy8.b.f284105a[uy8.c.f284106a.ordinal()];
        if (i == 1) {
            str = null;
        } else if (i == 2) {
            str = "revolut://app/trustdock-confirm?result=document_submitted";
        } else if (i == 3) {
            str = "revolut://app/trustdock-confirm?error=access_token_expired";
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            str = "revolut://app/trustdock-confirm?result=canceled";
        }
        d dVar = this.f275530a;
        if (str != null) {
            p pVar = (p) dVar;
            pVar.x2(new tx.f(21));
            pVar.y2(str);
            return true;
        }
        if (url2 == null) {
            m70.a.c(t0.f186434a);
            url2 = "";
        }
        p pVar2 = (p) dVar;
        pVar2.getClass();
        Intrinsics.checkNotNullParameter(url2, "url");
        if (!a0.H(url2, "revolut://app/trustdock-confirm", false)) {
            return false;
        }
        pVar2.y2(url2);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return shouldOverrideUrlLoading(webView, String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null));
    }
}
