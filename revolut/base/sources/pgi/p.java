package pgi;

import android.content.Intent;
import com.revolut.core.ui_kit.views.WebView;
import com.revolut.feature_pdf_view.PdfViewFeatureConfiguration;
import com.revolut.feature_web_view.presentation.WebViewActivity;
import com.revolut.feature_web_view.presentation.WebViewContract$WebViewConfiguration;
import com.revolut.retail.core.navigation.FeatureCommand;
import java.net.URISyntaxException;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class p implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f235966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f235967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f235968c;

    public /* synthetic */ p(String str, s sVar, int i) {
        this.f235966a = i;
        this.f235967b = str;
        this.f235968c = sVar;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.f235966a;
        boolean z = false;
        String url2 = this.f235967b;
        int i2 = 1;
        s sVar = this.f235968c;
        switch (i) {
            case 0:
                if (a0.H(url2, "intent://", false)) {
                    j jVar = (j) sVar.L();
                    if (jVar != null) {
                        WebViewActivity webViewActivity = (WebViewActivity) jVar;
                        Intrinsics.checkNotNullParameter(url2, "url");
                        ?? r110 = webViewActivity.H0;
                        if (((f) r110.getValue()).f235960a != g.DIRECT_NAVIGATION) {
                            ((f) r110.getValue()).b(g.IDLE);
                        }
                        try {
                            Intent uri2 = Intent.parseUri(url2, 1);
                            if (uri2 != null) {
                                try {
                                    webViewActivity.startActivity(uri2);
                                    break;
                                } catch (Exception unused) {
                                }
                            }
                        } catch (URISyntaxException e) {
                            h0 h0Var = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                        }
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                String str = this.f235967b;
                if (a0.y(str, ".pdf", false) && !a0.H(str, "https://docs.google.com/gview?embedded=true&url=", false)) {
                    sri.m mVar = sVar.k;
                    WebViewContract$WebViewConfiguration webViewContract$WebViewConfiguration = sVar.f235970h;
                    mVar.c(new FeatureCommand(new PdfViewFeatureConfiguration(str, webViewContract$WebViewConfiguration.f98175b, false, webViewContract$WebViewConfiguration.f98184q, 28)));
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                j jVar2 = (j) sVar.L();
                if (jVar2 != null) {
                    WebViewActivity webViewActivity2 = (WebViewActivity) jVar2;
                    Intrinsics.checkNotNullParameter(url2, "url");
                    WebView webView = webViewActivity2.y0;
                    if (webView == null) {
                        Intrinsics.r("webView");
                        throw null;
                    }
                    webView.post(new p6.e(webViewActivity2, url2, i2));
                }
                return Boolean.TRUE;
        }
    }

    public /* synthetic */ p(s sVar, String str) {
        this.f235966a = 2;
        this.f235968c = sVar;
        this.f235967b = str;
    }
}
