package cam;

import android.os.Message;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import c84.y;
import com.meshconnect.link.ui.LinkActivity;
import com.revolut.core.ui_kit.browser.InAppBrowserView;
import com.revolut.core.ui_kit.delegates.WebViewDelegate;
import com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.external_bank_sign_in.KontomatikExternalBankSignInController;
import com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.sign_in.KontomatikSignInController;
import com.revolut.feature_web_view.declaration.WebViewScreenTitleSource;
import com.revolut.feature_web_view.presentation.WebViewActivity;
import com.revolut.feature_web_view.presentation.WebViewContract$WebViewConfiguration;
import com.revolut.feature_web_view.presentation.screen.WebViewScreen;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import r40.n0;
import skm.e0;

/* JADX INFO: loaded from: classes19.dex */
public final class r extends WebChromeClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22695b;

    public /* synthetic */ r(Object obj2, int i) {
        this.f22694a = i;
        this.f22695b = obj2;
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.webkit.WebChromeClient
    public void onCloseWindow(WebView webView) {
        switch (this.f22694a) {
            case 0:
                t tVar = (t) this.f22695b;
                e0.C(tVar.d, null, null, new y(tVar, webView, null, 3), 3);
                super.onCloseWindow(webView);
                break;
            case 5:
                super.onCloseWindow(webView);
                ((sc4.c) ((KontomatikExternalBankSignInController) this.f22695b).Q.getValue()).I2();
                break;
            default:
                super.onCloseWindow(webView);
                break;
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        switch (this.f22694a) {
            case 0:
                t tVar = (t) this.f22695b;
                e0.C(tVar.d, null, null, new y(tVar, consoleMessage, null, 4), 3);
                break;
            case 7:
                Intrinsics.checkNotNullParameter(consoleMessage, "consoleMessage");
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.c cVar = rd0.c.DEBUG;
                String strMessage = consoleMessage.message();
                int iLineNumber = consoleMessage.lineNumber();
                String strSourceId = consoleMessage.sourceId();
                StringBuilder sbK = v0.a.k(iLineNumber, "JS:Console: ", strMessage, " -- From line ", " of ");
                sbK.append(strSourceId);
                rd0.d.b(cVar, null, sbK.toString(), null, null, 16);
                break;
        }
        return super.onConsoleMessage(consoleMessage);
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.webkit.WebChromeClient
    public boolean onCreateWindow(WebView view, boolean z, boolean z3, Message resultMsg) {
        switch (this.f22694a) {
            case 2:
                LinkActivity linkActivity = (LinkActivity) this.f22695b;
                if (resultMsg == null) {
                    return false;
                }
                Object obj2 = resultMsg.obj;
                Intrinsics.i(obj2, "null cannot be cast to non-null type android.webkit.WebView.WebViewTransport");
                WebView webView = new WebView(linkActivity);
                webView.setWebViewClient(new c9i.b(linkActivity, 5));
                ((WebView.WebViewTransport) obj2).setWebView(webView);
                resultMsg.sendToTarget();
                return true;
            case 7:
                KontomatikSignInController kontomatikSignInController = (KontomatikSignInController) this.f22695b;
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(resultMsg, "resultMsg");
                if (!z3) {
                    return false;
                }
                if (resultMsg.obj == null) {
                    resultMsg.obj = new WebView.WebViewTransport(view);
                }
                ((mc4.i) kontomatikSignInController.R.getValue()).f204278a = resultMsg;
                ((com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.sign_in.a) kontomatikSignInController.e3()).I2(yc4.j.f312520a);
                return true;
            default:
                return super.onCreateWindow(view, z, z3, resultMsg);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        switch (this.f22694a) {
            case 0:
                t tVar = (t) this.f22695b;
                e0.C(tVar.d, null, null, new q(i, 0, tVar, null), 3);
                super.onProgressChanged(webView, i);
                break;
            case 1:
                super.onProgressChanged(webView, i);
                ((WebViewDelegate) this.f22695b).d.onNext(Integer.valueOf(i));
                break;
            case 6:
                super.onProgressChanged(webView, i);
                ((InAppBrowserView) this.f22695b).setProgress$ui_kit_components_release(i);
                break;
            default:
                super.onProgressChanged(webView, i);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.webkit.WebChromeClient
    public void onReceivedTitle(WebView view, String title) {
        switch (this.f22694a) {
            case 1:
                super.onReceivedTitle(view, title);
                if (title != null) {
                    ((WebViewDelegate) this.f22695b).f53638g.onNext(title);
                    return;
                }
                return;
            case 2:
            default:
                super.onReceivedTitle(view, title);
                return;
            case 3:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(title, "title");
                super.onReceivedTitle(view, title);
                WebViewActivity webViewActivity = (WebViewActivity) this.f22695b;
                WebViewContract$WebViewConfiguration webViewContract$WebViewConfiguration = webViewActivity.B0;
                if (webViewContract$WebViewConfiguration == null) {
                    Intrinsics.r("config");
                    throw null;
                }
                if (webViewContract$WebViewConfiguration.e) {
                    if (webViewContract$WebViewConfiguration.k) {
                        webViewActivity.J0 = title;
                        return;
                    } else {
                        webViewActivity.d1().setTitle(title);
                        return;
                    }
                }
                return;
            case 4:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(title, "title");
                super.onReceivedTitle(view, title);
                rgi.m mVar = (rgi.m) ((rgi.f) ((WebViewScreen) this.f22695b).P.getValue());
                mVar.getClass();
                Intrinsics.checkNotNullParameter(title, "title");
                if (Intrinsics.f(mVar.f254198p.f98164b, WebViewScreenTitleSource.Html.f98166a)) {
                    mVar.H2(mVar.f254199q, new n0(title, 9));
                    return;
                }
                return;
        }
    }
}
