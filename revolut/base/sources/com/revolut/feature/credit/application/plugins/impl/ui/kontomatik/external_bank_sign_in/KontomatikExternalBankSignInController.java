package com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.external_bank_sign_in;

import aii.q;
import android.os.Message;
import android.view.View;
import android.webkit.WebView;
import android.widget.ProgressBar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import aw3.o;
import cam.r;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.R$id;
import com.revolut.feature.credit.application.plugins.impl.R$layout;
import com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.external_bank_sign_in.KontomatikExternalBankSignInController;
import com.revolut.kompot.navigable.vc.SimpleViewController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerLinearLayout;
import dw3.q3;
import dw3.r3;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mc4.d;
import mc4.i;
import pki.b;
import sc4.c;
import te0.w;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/kontomatik/external_bank_sign_in/KontomatikExternalBankSignInController;", "Lcom/revolut/kompot/navigable/vc/SimpleViewController;", "Laii/q;", "<init>", "()V", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class KontomatikExternalBankSignInController extends SimpleViewController<q> {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(KontomatikExternalBankSignInController.class, "binding", "getBinding()Lcom/revolut/feature/credit/application/plugins/impl/databinding/ScreenKontomatikExternalBinding;", 0))};
    public final int N = R$layout.screen_kontomatik_external;
    public final h O = s.t(this, a.f);
    public final Object P;
    public final Object Q;
    public final Object R;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, o.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/credit/application/plugins/impl/databinding/ScreenKontomatikExternalBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.navBar;
            NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
            if (navBarWithToolbar != null) {
                i = R$id.webProgressView;
                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(p0, i);
                if (progressBar != null) {
                    i = R$id.webView;
                    WebView webView = (WebView) ViewBindings.findChildViewById(p0, i);
                    if (webView != null) {
                        return new o((ControllerContainerLinearLayout) p0, navBarWithToolbar, progressBar, webView);
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public KontomatikExternalBankSignInController() {
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: sc4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ KontomatikExternalBankSignInController f261630b;

            {
                this.f261630b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                KontomatikExternalBankSignInController kontomatikExternalBankSignInController = this.f261630b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = KontomatikExternalBankSignInController.S;
                        qji.b bVarU2 = kontomatikExternalBankSignInController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.external_bank_sign_in.di.KontomatikExternalBankSignInControllerInjector");
                        r3 r3Var = (r3) bVarU2;
                        return new q3(r3Var.f119647c, r3Var.d);
                    case 1:
                        KProperty[] kPropertyArr2 = KontomatikExternalBankSignInController.S;
                        return (c) ((q3) kontomatikExternalBankSignInController.P.getValue()).f119565b.get();
                    default:
                        KProperty[] kPropertyArr3 = KontomatikExternalBankSignInController.S;
                        return (i) ((q3) kontomatikExternalBankSignInController.P.getValue()).f119564a.v.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: sc4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ KontomatikExternalBankSignInController f261630b;

            {
                this.f261630b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                KontomatikExternalBankSignInController kontomatikExternalBankSignInController = this.f261630b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = KontomatikExternalBankSignInController.S;
                        qji.b bVarU2 = kontomatikExternalBankSignInController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.external_bank_sign_in.di.KontomatikExternalBankSignInControllerInjector");
                        r3 r3Var = (r3) bVarU2;
                        return new q3(r3Var.f119647c, r3Var.d);
                    case 1:
                        KProperty[] kPropertyArr2 = KontomatikExternalBankSignInController.S;
                        return (c) ((q3) kontomatikExternalBankSignInController.P.getValue()).f119565b.get();
                    default:
                        KProperty[] kPropertyArr3 = KontomatikExternalBankSignInController.S;
                        return (i) ((q3) kontomatikExternalBankSignInController.P.getValue()).f119564a.v.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: sc4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ KontomatikExternalBankSignInController f261630b;

            {
                this.f261630b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                KontomatikExternalBankSignInController kontomatikExternalBankSignInController = this.f261630b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = KontomatikExternalBankSignInController.S;
                        qji.b bVarU2 = kontomatikExternalBankSignInController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.external_bank_sign_in.di.KontomatikExternalBankSignInControllerInjector");
                        r3 r3Var = (r3) bVarU2;
                        return new q3(r3Var.f119647c, r3Var.d);
                    case 1:
                        KProperty[] kPropertyArr2 = KontomatikExternalBankSignInController.S;
                        return (c) ((q3) kontomatikExternalBankSignInController.P.getValue()).f119565b.get();
                    default:
                        KProperty[] kPropertyArr3 = KontomatikExternalBankSignInController.S;
                        return (i) ((q3) kontomatikExternalBankSignInController.P.getValue()).f119564a.v.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.SimpleViewController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (q3) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.SimpleViewController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (c) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f10710b.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        ProgressBar webProgressView = d3().f10711c;
        Intrinsics.checkNotNullExpressionValue(webProgressView, "webProgressView");
        webProgressView.setVisibility(0);
        WebView webView = d3().d;
        Intrinsics.checkNotNullExpressionValue(webView, "webView");
        knm.b.b(webView);
        webView.setWebViewClient(new d(new s78.d(this, 24)));
        webView.setWebChromeClient(new r(this, 5));
        webView.setOnTouchListener(new iyl.b(webView, 2));
        Message message = ((i) this.R.getValue()).f204278a;
        if (message == null) {
            ((c) this.Q.getValue()).I2();
            return;
        }
        Object obj2 = message.obj;
        WebView.WebViewTransport webViewTransport = obj2 instanceof WebView.WebViewTransport ? (WebView.WebViewTransport) obj2 : null;
        if (webViewTransport != null) {
            WebView webView2 = d3().d;
            Intrinsics.checkNotNullExpressionValue(webView2, "webView");
            webViewTransport.setWebView(webView2);
        }
        message.sendToTarget();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Z2() {
        WebView webView = d3().d;
        Intrinsics.checkNotNullExpressionValue(webView, "webView");
        webView.destroy();
        ((i) this.R.getValue()).f204278a = null;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f10710b.f59410q), new s1k.b(this, null, 23), 3);
    }

    public final o d3() {
        ViewBinding value = this.O.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (o) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getR() {
        return this.N;
    }
}
