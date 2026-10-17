package ay8;

import android.content.ActivityNotFoundException;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Handler;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.revolut.feature.direct_deposit.impl.ui_kompot.screen.preview.DirectDepositPreviewScreen;
import com.revolut.feature.vaults.impl.ui.details.terms_viewer.VaultTermsViewerScreen;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import fp0.l;
import gom.e;
import h54.o;
import h7a.d;
import ihm.j;
import jck.y;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import l7a.c;
import r10.q;
import whi.b;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f11109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f11110c;

    public /* synthetic */ a(Object obj2, Object obj3, int i) {
        this.f11108a = i;
        this.f11109b = obj2;
        this.f11110c = obj3;
    }

    public static void a(String str) {
        String str2 = str.split("[?#]")[0];
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        switch (this.f11108a) {
            case 3:
                a(str);
                break;
            default:
                super.onLoadResource(webView, str);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView view, String url2) {
        switch (this.f11108a) {
            case 1:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(url2, "url");
                d dVar = (d) this.f11109b;
                String str = (String) this.f11110c;
                BaseDelegatesActivity baseDelegatesActivity = dVar.i;
                baseDelegatesActivity.z0();
                WebView webView = dVar.o;
                if (webView == null) {
                    Intrinsics.r("webView");
                    throw null;
                }
                j jVar = dVar.k;
                if (!dVar.f149870n) {
                    dVar.f149870n = true;
                    Object systemService = baseDelegatesActivity.getSystemService("print");
                    Intrinsics.i(systemService, "null cannot be cast to non-null type android.print.PrintManager");
                    PrintManager printManager = (PrintManager) systemService;
                    PrintDocumentAdapter printDocumentAdapterCreatePrintDocumentAdapter = webView.createPrintDocumentAdapter(str);
                    Intrinsics.checkNotNullExpressionValue(printDocumentAdapterCreatePrintDocumentAdapter, "createPrintDocumentAdapter(...)");
                    c cVar = new c(printDocumentAdapterCreatePrintDocumentAdapter, new h1k.a(dVar, str, 8));
                    if (!baseDelegatesActivity.isFinishing()) {
                        try {
                            Intrinsics.h(printManager.print(str, cVar, new PrintAttributes.Builder().build()));
                        } catch (ActivityNotFoundException e) {
                            e.f145194a.e(e);
                            dVar.f149870n = false;
                            jVar.onError(e);
                        } catch (IllegalStateException e2) {
                            e.f145194a.e(e2);
                            dVar.f149870n = false;
                            jVar.onNext(str);
                        }
                    }
                    break;
                }
                dVar.f149867j.onNext(Boolean.TRUE);
                return;
            case 2:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(url2, "url");
                h96.j jVar2 = (h96.j) ((DirectDepositPreviewScreen) this.f11109b).O.getValue();
                PrintDocumentAdapter printDocumentAdapter = ((com.revolut.core.ui_kit.views.WebView) this.f11110c).createPrintDocumentAdapter("Revolut Document");
                Intrinsics.checkNotNullExpressionValue(printDocumentAdapter, "createPrintDocumentAdapter(...)");
                jVar2.getClass();
                Intrinsics.checkNotNullParameter(printDocumentAdapter, "printDocumentAdapter");
                if (jVar2.o.f71953a == h96.d.SHARE) {
                    jVar2.n2(new o(jVar2, printDocumentAdapter, null, 8), new b(6));
                    return;
                }
                return;
            case 3:
                a(url2);
                return;
            case 4:
                VaultTermsViewerScreen vaultTermsViewerScreen = (VaultTermsViewerScreen) this.f11109b;
                com.revolut.feature.vaults.impl.ui.details.terms_viewer.a aVar = (com.revolut.feature.vaults.impl.ui.details.terms_viewer.a) vaultTermsViewerScreen.R2();
                aVar.H2(aVar.f94759r, new y(true, 2));
                ((com.revolut.core.ui_kit.views.WebView) this.f11110c).post(new l(vaultTermsViewerScreen, 19));
                return;
            default:
                super.onPageFinished(view, url2);
                return;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        switch (this.f11108a) {
            case 3:
                a(str);
                break;
            case 4:
                com.revolut.feature.vaults.impl.ui.details.terms_viewer.a aVar = (com.revolut.feature.vaults.impl.ui.details.terms_viewer.a) ((VaultTermsViewerScreen) this.f11109b).R2();
                aVar.H2(aVar.f94759r, new y(false, 2));
                break;
            default:
                super.onPageStarted(webView, str, bitmap);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        switch (this.f11108a) {
            case 0:
                if (webResourceError != null) {
                    String str = "Code: " + webResourceError.getErrorCode() + ", Description: " + ((Object) webResourceError.getDescription());
                    if (str != null) {
                        ((yx8.a) this.f11109b).b3(str);
                    }
                }
                break;
            default:
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        switch (this.f11108a) {
            case 0:
                if (webResourceResponse != null) {
                    ((yx8.a) this.f11109b).b3("Code: " + webResourceResponse.getStatusCode() + ", Description: " + webResourceResponse.getReasonPhrase());
                }
                break;
            default:
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        switch (this.f11108a) {
            case 0:
                if (sslError != null) {
                    yx8.a aVar = (yx8.a) this.f11109b;
                    String string = sslError.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    aVar.b3(string);
                }
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
                break;
            default:
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        switch (this.f11108a) {
            case 3:
                Uri url2 = webResourceRequest.getUrl();
                if (url2 != null && url2.getScheme() != null && url2.getScheme().equals("http")) {
                    ((Handler) this.f11109b).post(new d0.c(this, url2, 23));
                }
                break;
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url2;
        switch (this.f11108a) {
            case 0:
                String string = (webResourceRequest == null || (url2 = webResourceRequest.getUrl()) == null) ? null : url2.toString();
                String strA = ((dy8.a) this.f11110c).a();
                if (strA != null) {
                    string = strA;
                } else if (string == null) {
                    m70.a.c(t0.f186434a);
                    string = "";
                }
                return ((yx8.a) this.f11109b).Z2(string);
            default:
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }

    public a(q qVar, Handler handler) {
        this.f11108a = 3;
        this.f11110c = qVar;
        this.f11109b = handler;
    }

    public a(yx8.a model, dy8.a stubUrlProvider) {
        this.f11108a = 0;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(stubUrlProvider, "stubUrlProvider");
        this.f11109b = model;
        this.f11110c = stubUrlProvider;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        switch (this.f11108a) {
            case 0:
                ((yx8.a) this.f11109b).b3("Code: " + i + ", Description: " + str + ", FailingUrl: " + str2);
                break;
            default:
                super.onReceivedError(webView, i, str, str2);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, String url2) {
        switch (this.f11108a) {
            case 0:
                String strA = ((dy8.a) this.f11110c).a();
                if (strA != null) {
                    url2 = strA;
                } else if (url2 == null) {
                    m70.a.c(t0.f186434a);
                    url2 = "";
                }
                return ((yx8.a) this.f11109b).Z2(url2);
            case 1:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(url2, "url");
                return false;
            case 2:
            case 3:
            default:
                return super.shouldOverrideUrlLoading(view, url2);
            case 4:
                if (url2 == null) {
                    return true;
                }
                com.revolut.feature.vaults.impl.ui.details.terms_viewer.a aVar = (com.revolut.feature.vaults.impl.ui.details.terms_viewer.a) ((VaultTermsViewerScreen) this.f11109b).R2();
                aVar.getClass();
                Intrinsics.checkNotNullParameter(url2, "url");
                aVar.C1(new ExternalDestination.ImplicitActivity("android.intent.action.VIEW", null, Uri.parse(url2), 0, null, 494));
                return true;
        }
    }
}
