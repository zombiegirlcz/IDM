package com.revolut.feature_web_view.presentation;

import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import bk0.e;
import cam.r;
import com.bumptech.glide.c;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.appbar.AppBarLayout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.FullScreenStateView;
import com.revolut.core.ui_kit.views.WebView;
import com.revolut.feature_web_view.R$id;
import com.revolut.feature_web_view.R$layout;
import com.revolut.feature_web_view.R$string;
import com.revolut.feature_web_view.presentation.WebViewActivity;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import com.revolut.uicomponent.toolbar.app_bar.CustomViewRevolutToolbar;
import com.revolut.uicomponent.toolbar.app_bar.RevolutAppBarLayout;
import com.revolut.uicomponent.toolbar.app_bar.ToolbarShadow;
import com.youTransactor.uCube.rpc.Constants;
import dri.a;
import ifm.b;
import ihm.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KProperty;
import kp0.l;
import kp0.w0;
import le.u1;
import org.jetbrains.annotations.NotNull;
import pb2.v;
import pgi.j;
import qgi.d;
import t70.g;
import te0.w;
import w01.k;
import yp0.f0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00032\u00020\u00042\u00020\u0005:\u0003\t\n\u000bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/revolut/feature_web_view/presentation/WebViewActivity;", "Lcom/revolut/retail/core/ui/activity/BaseDelegatesActivity;", "Lpgi/i;", "Lpgi/j;", "Ldri/a;", "Lin0/g;", "<init>", "()V", "Companion", "pgi/f", "pgi/g", "a", "feature_web_view_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WebViewActivity extends BaseDelegatesActivity implements j, a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final /* synthetic */ KProperty[] L0;
    public WebViewContract$WebViewConfiguration B0;
    public d C0;
    public boolean D0;
    public g E0;
    public e F0;
    public final Object G0;
    public final Object H0;
    public boolean I0;
    public String J0;
    public boolean K0;
    public WebView y0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final j90.a f98168r0 = u1.w(this, R$id.appbar);

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final j90.a f98169s0 = u1.w(this, R$id.toolbarShadow);

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final j90.a f98170t0 = u1.w(this, R$id.webview_container);
    public final j90.a u0 = u1.w(this, R$id.transparentToolbar);

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final j90.a f98171v0 = u1.w(this, R$id.toolbar);

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final j90.a f98172w0 = u1.w(this, R$id.errorView);

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final j90.a f98173x0 = u1.w(this, R$id.list_t_c_progress);
    public final f z0 = v0.a.d("create(...)");
    public final b A0 = new b();

    /* JADX INFO: renamed from: com.revolut.feature_web_view.presentation.WebViewActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    static {
        h0 h0Var = new h0(WebViewActivity.class, "appbar", "getAppbar()Lcom/revolut/uicomponent/toolbar/app_bar/RevolutAppBarLayout;", 0);
        p0 p0Var = o0.f186429a;
        L0 = new KProperty[]{p0Var.j(h0Var), p.a.y(WebViewActivity.class, "toolbarShadow", "getToolbarShadow()Lcom/revolut/uicomponent/toolbar/app_bar/ToolbarShadow;", 0, p0Var), p.a.y(WebViewActivity.class, "webviewContainer", "getWebviewContainer()Landroidx/coordinatorlayout/widget/CoordinatorLayout;", 0, p0Var), p.a.y(WebViewActivity.class, "transparentToolbar", "getTransparentToolbar()Lcom/revolut/uicomponent/toolbar/app_bar/CustomViewRevolutToolbar;", 0, p0Var), p.a.y(WebViewActivity.class, "toolbar", "getToolbar()Lcom/revolut/uicomponent/toolbar/app_bar/CustomViewRevolutToolbar;", 0, p0Var), p.a.y(WebViewActivity.class, "errorView", "getErrorView()Lcom/revolut/core/ui_kit/views/FullScreenStateView;", 0, p0Var), p.a.y(WebViewActivity.class, "listTCProgress", "getListTCProgress()Landroid/widget/ProgressBar;", 0, p0Var)};
        INSTANCE = new Companion();
    }

    public WebViewActivity() {
        final int i = 0;
        this.G0 = w.y0(new Function0(this) { // from class: pgi.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WebViewActivity f235956b;

            {
                this.f235956b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                WebViewActivity webViewActivity = this.f235956b;
                switch (i2) {
                    case 0:
                        WebViewActivity.Companion companion = WebViewActivity.INSTANCE;
                        return Integer.valueOf(kli.a.k(webViewActivity, 24.0f));
                    default:
                        WebViewActivity.Companion companion2 = WebViewActivity.INSTANCE;
                        return new f(webViewActivity);
                }
            }
        });
        final int i2 = 1;
        this.H0 = w.y0(new Function0(this) { // from class: pgi.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WebViewActivity f235956b;

            {
                this.f235956b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                WebViewActivity webViewActivity = this.f235956b;
                switch (i22) {
                    case 0:
                        WebViewActivity.Companion companion = WebViewActivity.INSTANCE;
                        return Integer.valueOf(kli.a.k(webViewActivity, 24.0f));
                    default:
                        WebViewActivity.Companion companion2 = WebViewActivity.INSTANCE;
                        return new f(webViewActivity);
                }
            }
        });
    }

    public static final void Z0(WebViewActivity webViewActivity, boolean z, boolean z3) {
        View decorView;
        j90.a aVar = webViewActivity.f98169s0;
        KProperty[] kPropertyArr = L0;
        if (z && !webViewActivity.I0) {
            webViewActivity.I0 = true;
            ((ToolbarShadow) aVar.getValue(webViewActivity, kPropertyArr[1])).setVisibility(4);
            if (webViewActivity.b1().getVisibility() == 0) {
                if (z3) {
                    k.b(webViewActivity.b1());
                } else {
                    k.a(webViewActivity.b1());
                    webViewActivity.b1().setAlpha(BitmapDescriptorFactory.HUE_RED);
                }
                Window window = webViewActivity.getWindow();
                Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
                w0.p(window, f0.STATUS);
                return;
            }
            return;
        }
        if (z || !webViewActivity.I0) {
            return;
        }
        webViewActivity.I0 = false;
        ((ToolbarShadow) aVar.getValue(webViewActivity, kPropertyArr[1])).setVisibility(0);
        if (z3) {
            k.f(webViewActivity.b1());
        } else {
            k.d(webViewActivity.b1());
        }
        if ((webViewActivity.getResources().getConfiguration().uiMode & 48) == 32) {
            return;
        }
        Window window2 = webViewActivity.getWindow();
        if (window2 != null) {
            window2.setStatusBarColor(0);
        }
        if (window2 == null || (decorView = window2.getDecorView()) == null) {
            return;
        }
        decorView.setSystemUiVisibility(9472);
    }

    @Override // dri.a
    public final boolean D0() {
        WebViewContract$WebViewConfiguration webViewContract$WebViewConfiguration = this.B0;
        if (webViewContract$WebViewConfiguration != null) {
            return webViewContract$WebViewConfiguration.f;
        }
        Intrinsics.r("config");
        throw null;
    }

    @Override // nri.b
    public final pri.e F0() {
        d dVar = this.C0;
        if (dVar != null) {
            return dVar.b();
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0 */
    public final String getF71630s0() {
        WebViewContract$WebViewConfiguration webViewContract$WebViewConfiguration = this.B0;
        if (webViewContract$WebViewConfiguration != null) {
            return webViewContract$WebViewConfiguration.f98179j;
        }
        Intrinsics.r("config");
        throw null;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        d dVar = this.C0;
        if (dVar != null) {
            return dVar;
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    public final RevolutAppBarLayout b1() {
        return (RevolutAppBarLayout) this.f98168r0.getValue(this, L0[0]);
    }

    public final FullScreenStateView c1() {
        return (FullScreenStateView) this.f98172w0.getValue(this, L0[5]);
    }

    public final CustomViewRevolutToolbar d1() {
        return (CustomViewRevolutToolbar) this.f98171v0.getValue(this, L0[4]);
    }

    public final CustomViewRevolutToolbar f1() {
        return (CustomViewRevolutToolbar) this.u0.getValue(this, L0[3]);
    }

    public final void g1(boolean z) {
        WebViewContract$WebViewConfiguration webViewContract$WebViewConfiguration = this.B0;
        if (webViewContract$WebViewConfiguration == null) {
            Intrinsics.r("config");
            throw null;
        }
        if (webViewContract$WebViewConfiguration.f98177g) {
            ((ProgressBar) this.f98173x0.getValue(this, L0[6])).setVisibility(z ? 0 : 8);
        }
    }

    public final void h1(String str, CustomViewRevolutToolbar customViewRevolutToolbar) {
        MenuItem menuItemFindItem = customViewRevolutToolbar.getMenu().findItem(R$id.menu_item_save);
        View actionView = menuItemFindItem.getActionView();
        View viewFindViewById = actionView != null ? actionView.findViewById(com.revolut.uicomponent.R$id.menu_button_item) : null;
        Intrinsics.i(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById;
        g gVar = this.E0;
        if (gVar == null) {
            Intrinsics.r("localization");
            throw null;
        }
        textView.setText(gVar.getString(R$string.web_view_action_save));
        if (str == null) {
            menuItemFindItem.setVisible(false);
            return;
        }
        View actionView2 = customViewRevolutToolbar.getMenu().findItem(R$id.menu_item_save).getActionView();
        if (actionView2 != null) {
            actionView2.setOnClickListener(new l(this, str, 16));
        }
        menuItemFindItem.setVisible(true);
    }

    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        WebViewContract$WebViewConfiguration webViewContract$WebViewConfiguration = (WebViewContract$WebViewConfiguration) getIntent().getParcelableExtra("CONFIGURATION_ARG");
        if (webViewContract$WebViewConfiguration == null) {
            throw new IllegalStateException();
        }
        this.B0 = webViewContract$WebViewConfiguration;
        AttributeSet attributeSet = null;
        fc4.a aVar = (fc4.a) ((qgi.e) c.l(this).b(null, getF71630s0())).g().h(rd0.e.g(this, bundle, null));
        WebViewContract$WebViewConfiguration webViewContract$WebViewConfiguration2 = this.B0;
        if (webViewContract$WebViewConfiguration2 == null) {
            Intrinsics.r("config");
            throw null;
        }
        switch (aVar.f133625a) {
            case 0:
                webViewContract$WebViewConfiguration2.getClass();
                aVar.f133627c = webViewContract$WebViewConfiguration2;
                break;
            case 1:
                webViewContract$WebViewConfiguration2.getClass();
                aVar.f133627c = webViewContract$WebViewConfiguration2;
                break;
            case 2:
                webViewContract$WebViewConfiguration2.getClass();
                aVar.f133627c = webViewContract$WebViewConfiguration2;
                break;
            default:
                webViewContract$WebViewConfiguration2.getClass();
                aVar.f133627c = webViewContract$WebViewConfiguration2;
                break;
        }
        d dVar = (d) aVar.build();
        this.C0 = dVar;
        if (dVar == null) {
            Intrinsics.r("activityComponent");
            throw null;
        }
        dVar.t(this);
        super.onCreate(bundle);
        setContentView(R$layout.activity_web_view);
        this.A0.a(c1().getSmallActionButton().f56386h.subscribe(new pfa.c(new v(this, 17), 16)));
        WebViewContract$WebViewConfiguration webViewContract$WebViewConfiguration3 = this.B0;
        if (webViewContract$WebViewConfiguration3 == null) {
            Intrinsics.r("config");
            throw null;
        }
        this.D0 = webViewContract$WebViewConfiguration3.f98183p;
        this.y0 = new WebView(this, attributeSet, 6, 0);
        CoordinatorLayout.LayoutParams layoutParams = new CoordinatorLayout.LayoutParams(-1, -1);
        ViewGroup.LayoutParams layoutParams2 = b1().getLayoutParams();
        Intrinsics.i(layoutParams2, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        ((CoordinatorLayout.LayoutParams) layoutParams2).setBehavior(new AppBarLayout.Behavior());
        WebViewContract$WebViewConfiguration webViewContract$WebViewConfiguration4 = this.B0;
        if (webViewContract$WebViewConfiguration4 == null) {
            Intrinsics.r("config");
            throw null;
        }
        boolean z = webViewContract$WebViewConfiguration4.k;
        j90.a aVar2 = this.f98170t0;
        KProperty[] kPropertyArr = L0;
        if (z) {
            WebView webView = this.y0;
            if (webView == null) {
                Intrinsics.r("webView");
                throw null;
            }
            webView.setFitsSystemWindows(true);
            b1().setFitsSystemWindows(true);
            ((ToolbarShadow) this.f98169s0.getValue(this, kPropertyArr[1])).setVisibility(4);
            ViewCompat.setOnApplyWindowInsetsListener((CoordinatorLayout) aVar2.getValue(this, kPropertyArr[2]), new pfa.c(this, 17));
        } else {
            layoutParams.setBehavior(new AppBarLayout.ScrollingViewBehavior());
        }
        WebView webView2 = this.y0;
        if (webView2 == null) {
            Intrinsics.r("webView");
            throw null;
        }
        webView2.setLayoutParams(layoutParams);
        WebView webView3 = this.y0;
        if (webView3 == null) {
            Intrinsics.r("webView");
            throw null;
        }
        webView3.getSettings().setJavaScriptEnabled(true);
        WebView webView4 = this.y0;
        if (webView4 == null) {
            Intrinsics.r("webView");
            throw null;
        }
        webView4.getSettings().setDomStorageEnabled(true);
        WebView webView5 = this.y0;
        if (webView5 == null) {
            Intrinsics.r("webView");
            throw null;
        }
        webView5.setFocusable(true);
        WebView webView6 = this.y0;
        if (webView6 == null) {
            Intrinsics.r("webView");
            throw null;
        }
        webView6.setFocusableInTouchMode(true);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) aVar2.getValue(this, kPropertyArr[2]);
        WebView webView7 = this.y0;
        if (webView7 == null) {
            Intrinsics.r("webView");
            throw null;
        }
        coordinatorLayout.addView(webView7, 0);
        WebViewContract$WebViewConfiguration webViewContract$WebViewConfiguration5 = this.B0;
        if (webViewContract$WebViewConfiguration5 == null) {
            Intrinsics.r("config");
            throw null;
        }
        String str = webViewContract$WebViewConfiguration5.f98178h;
        h1(str, d1());
        WebViewContract$WebViewConfiguration webViewContract$WebViewConfiguration6 = this.B0;
        if (webViewContract$WebViewConfiguration6 == null) {
            Intrinsics.r("config");
            throw null;
        }
        if (webViewContract$WebViewConfiguration6.k) {
            h1(str, f1());
        }
        WebView webView8 = this.y0;
        if (webView8 == null) {
            Intrinsics.r("webView");
            throw null;
        }
        webView8.setWebChromeClient(new r(this, 3));
        WebView webView9 = this.y0;
        if (webView9 == null) {
            Intrinsics.r("webView");
            throw null;
        }
        webView9.setDownloadListener(new pgi.b(this, 0));
        WebView webView10 = this.y0;
        if (webView10 == null) {
            Intrinsics.r("webView");
            throw null;
        }
        webView10.setWebViewClient((pgi.f) this.H0.getValue());
        final int i = 0;
        d1().setNavigationOnClickListener(new View.OnClickListener(this) { // from class: pgi.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WebViewActivity f235958b;

            {
                this.f235958b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                WebViewActivity webViewActivity = this.f235958b;
                switch (i2) {
                    case 0:
                        WebViewActivity.Companion companion = WebViewActivity.INSTANCE;
                        webViewActivity.finish();
                        break;
                    default:
                        WebViewActivity.Companion companion2 = WebViewActivity.INSTANCE;
                        webViewActivity.finish();
                        break;
                }
            }
        });
        WebViewContract$WebViewConfiguration webViewContract$WebViewConfiguration7 = this.B0;
        if (webViewContract$WebViewConfiguration7 == null) {
            Intrinsics.r("config");
            throw null;
        }
        Clause clause = webViewContract$WebViewConfiguration7.f98175b;
        d1().setTitle(clause != null ? ty0.c.a(jh.d.f(this).b0(), clause, this, null, null, null, null, Constants.TAG_FC_SPEED_MODE) : null);
        CustomViewRevolutToolbar customViewRevolutToolbarD1 = d1();
        WebViewContract$WebViewConfiguration webViewContract$WebViewConfiguration8 = this.B0;
        if (webViewContract$WebViewConfiguration8 == null) {
            Intrinsics.r("config");
            throw null;
        }
        customViewRevolutToolbarD1.setNavigationIcon(webViewContract$WebViewConfiguration8.f98176c);
        CustomViewRevolutToolbar customViewRevolutToolbarD12 = d1();
        g gVar = this.E0;
        if (gVar == null) {
            Intrinsics.r("localization");
            throw null;
        }
        customViewRevolutToolbarD12.setNavigationContentDescription(gVar.getString(com.revolut.core.ui_kit.R$string.uikit_navigate_up_description));
        WebViewContract$WebViewConfiguration webViewContract$WebViewConfiguration9 = this.B0;
        if (webViewContract$WebViewConfiguration9 == null) {
            Intrinsics.r("config");
            throw null;
        }
        if (webViewContract$WebViewConfiguration9.k) {
            WebView webView11 = this.y0;
            if (webView11 == null) {
                Intrinsics.r("webView");
                throw null;
            }
            jqg.c onScrollChangedCallback = new jqg.c(this, 1);
            Intrinsics.checkNotNullParameter(onScrollChangedCallback, "onScrollChangedCallback");
            webView11.f58930b.add(onScrollChangedCallback);
            final int i2 = 1;
            f1().setNavigationOnClickListener(new View.OnClickListener(this) { // from class: pgi.d

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ WebViewActivity f235958b;

                {
                    this.f235958b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i22 = i2;
                    WebViewActivity webViewActivity = this.f235958b;
                    switch (i22) {
                        case 0:
                            WebViewActivity.Companion companion = WebViewActivity.INSTANCE;
                            webViewActivity.finish();
                            break;
                        default:
                            WebViewActivity.Companion companion2 = WebViewActivity.INSTANCE;
                            webViewActivity.finish();
                            break;
                    }
                }
            });
            CustomViewRevolutToolbar customViewRevolutToolbarF1 = f1();
            WebViewContract$WebViewConfiguration webViewContract$WebViewConfiguration10 = this.B0;
            if (webViewContract$WebViewConfiguration10 == null) {
                Intrinsics.r("config");
                throw null;
            }
            customViewRevolutToolbarF1.setNavigationIcon(webViewContract$WebViewConfiguration10.d);
            CustomViewRevolutToolbar customViewRevolutToolbarF12 = f1();
            g gVar2 = this.E0;
            if (gVar2 == null) {
                Intrinsics.r("localization");
                throw null;
            }
            customViewRevolutToolbarF12.setNavigationContentDescription(gVar2.getString(com.revolut.core.ui_kit.R$string.uikit_navigate_up_description));
            f1().setVisibility(0);
        }
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        this.A0.dispose();
        WebView webView = this.y0;
        if (webView == null) {
            Intrinsics.r("webView");
            throw null;
        }
        webView.destroy();
        super.onDestroy();
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        WebView webView = this.y0;
        if (webView != null) {
            webView.onPause();
        } else {
            Intrinsics.r("webView");
            throw null;
        }
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        WebView webView = this.y0;
        if (webView == null) {
            Intrinsics.r("webView");
            throw null;
        }
        webView.onResume();
        super.onResume();
    }

    @Override // nri.b, in0.g
    public final boolean p0() {
        WebViewContract$WebViewConfiguration webViewContract$WebViewConfiguration = this.B0;
        if (webViewContract$WebViewConfiguration != null) {
            return webViewContract$WebViewConfiguration.f98184q;
        }
        Intrinsics.r("config");
        throw null;
    }
}
