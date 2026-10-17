package com.revolut.feature.kyc.shared.web_kyc.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import aq0.k;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.views.WebView;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.kyc.shared.R$id;
import com.revolut.feature.kyc.shared.R$layout;
import com.revolut.feature.kyc.shared.web_kyc.view.WebPortalLoadingView;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import euf.a;
import ey8.b;
import hoi.j;
import ip0.nb0;
import ip0.pb0;
import java.util.List;
import koi.h;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rd0.e;
import te0.w;
import vkm.d;
import vkm.q;
import vkm.z1;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 72\u00020\u0001:\u00018B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R#\u0010\u001d\u001a\n \u0018*\u0004\u0018\u00010\u00170\u00178FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR#\u0010\"\u001a\n \u0018*\u0004\u0018\u00010\u001e0\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010!R#\u0010'\u001a\n \u0018*\u0004\u0018\u00010#0#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001a\u001a\u0004\b%\u0010&R#\u0010,\u001a\n \u0018*\u0004\u0018\u00010(0(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u001a\u001a\u0004\b*\u0010+R\u001b\u00101\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u001a\u001a\u0004\b/\u00100R\u001b\u00106\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010\u001a\u001a\u0004\b4\u00105¨\u00069"}, d2 = {"Lcom/revolut/feature/kyc/shared/web_kyc/view/WebPortalLoadingView;", "Lcom/revolut/kompot/view/ControllerContainerConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/webkit/WebViewClient;", "webViewClient", "", "setWebViewClient", "(Landroid/webkit/WebViewClient;)V", "Landroid/webkit/WebChromeClient;", "webChromeClient", "setWebChromeClient", "(Landroid/webkit/WebChromeClient;)V", "", "isVisible", "setNavbarBackNavigationButtonVisible", "(Z)V", "Lcom/revolut/core/ui_kit/views/WebView;", "kotlin.jvm.PlatformType", "h", "Lkotlin/Lazy;", "getWebView", "()Lcom/revolut/core/ui_kit/views/WebView;", "webView", "Lcom/revolut/core/ui_kit/views/navbar/BasicNavBar;", "i", "getNavBar", "()Lcom/revolut/core/ui_kit/views/navbar/BasicNavBar;", "navBar", "Landroidx/constraintlayout/widget/ConstraintLayout;", "j", "getPromptLoadingView", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "promptLoadingView", "Landroidx/recyclerview/widget/RecyclerView;", "k", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/LinearLayoutManager;", "l", "getBaseRecyclerViewLayoutManager", "()Landroidx/recyclerview/widget/LinearLayoutManager;", "baseRecyclerViewLayoutManager", "Lkoi/h;", "m", "getListAdapter", "()Lkoi/h;", "listAdapter", "Companion", "a", "feature_kyc_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WebPortalLoadingView extends ControllerContainerConstraintLayout {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f77903h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f77904j;
    public final Object k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f77905l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f77906m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final z1 f77907n;

    /* JADX INFO: renamed from: com.revolut.feature.kyc.shared.web_kyc.view.WebPortalLoadingView$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebPortalLoadingView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final LinearLayoutManager getBaseRecyclerViewLayoutManager() {
        return (LinearLayoutManager) this.f77905l.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final h getListAdapter() {
        return (h) this.f77906m.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final BasicNavBar getNavBar() {
        return (BasicNavBar) this.i.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ConstraintLayout getPromptLoadingView() {
        return (ConstraintLayout) this.f77904j.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final RecyclerView getRecyclerView() {
        return (RecyclerView) this.k.getValue();
    }

    public final void g0(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        WebView webView = getWebView();
        webView.loadUrl(url2);
        webView.postVisualStateCallback(1234L, new b(this, 0));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final WebView getWebView() {
        return (WebView) this.f77903h.getValue();
    }

    public final d h0() {
        return e.b(getNavBar().f59211b);
    }

    public final void i0(boolean z) {
        if (!z) {
            WebView webView = getWebView();
            Intrinsics.checkNotNullExpressionValue(webView, "<get-webView>(...)");
            webView.setVisibility(8);
        } else {
            WebView webView2 = getWebView();
            Intrinsics.h(webView2);
            webView2.setVisibility(0);
            webView2.animate().alpha(1.0f).setDuration(500L);
            getPromptLoadingView().animate().alpha(BitmapDescriptorFactory.HUE_RED).setDuration(500L).setListener(new k(this, 2));
        }
    }

    public final void setNavbarBackNavigationButtonVisible(boolean isVisible) {
        if (isVisible) {
            getNavBar().setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        } else {
            getNavBar().setNavigationButtonIcon(null);
        }
    }

    public final void setWebChromeClient(@NotNull WebChromeClient webChromeClient) {
        Intrinsics.checkNotNullParameter(webChromeClient, "webChromeClient");
        getWebView().setWebChromeClient(webChromeClient);
    }

    public final void setWebViewClient(@NotNull WebViewClient webViewClient) {
        Intrinsics.checkNotNullParameter(webViewClient, "webViewClient");
        getWebView().setWebViewClient(webViewClient);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebPortalLoadingView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebPortalLoadingView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i2 = 0;
        this.f77903h = w.y0(new Function0(this) { // from class: ey8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WebPortalLoadingView f130589b;

            {
                this.f130589b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                WebPortalLoadingView webPortalLoadingView = this.f130589b;
                switch (i3) {
                    case 0:
                        WebPortalLoadingView.Companion companion = WebPortalLoadingView.INSTANCE;
                        return (WebView) webPortalLoadingView.findViewById(R$id.portalLoading_webView);
                    case 1:
                        WebPortalLoadingView.Companion companion2 = WebPortalLoadingView.INSTANCE;
                        return (BasicNavBar) webPortalLoadingView.findViewById(R$id.portalLoading_navBar);
                    case 2:
                        WebPortalLoadingView.Companion companion3 = WebPortalLoadingView.INSTANCE;
                        return (ConstraintLayout) webPortalLoadingView.findViewById(R$id.portalLoading_loadingView);
                    default:
                        WebPortalLoadingView.Companion companion4 = WebPortalLoadingView.INSTANCE;
                        return (RecyclerView) webPortalLoadingView.findViewById(R$id.webviewShimmeringLoadingView_recyclerView);
                }
            }
        });
        final int i3 = 1;
        this.i = w.y0(new Function0(this) { // from class: ey8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WebPortalLoadingView f130589b;

            {
                this.f130589b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i3;
                WebPortalLoadingView webPortalLoadingView = this.f130589b;
                switch (i32) {
                    case 0:
                        WebPortalLoadingView.Companion companion = WebPortalLoadingView.INSTANCE;
                        return (WebView) webPortalLoadingView.findViewById(R$id.portalLoading_webView);
                    case 1:
                        WebPortalLoadingView.Companion companion2 = WebPortalLoadingView.INSTANCE;
                        return (BasicNavBar) webPortalLoadingView.findViewById(R$id.portalLoading_navBar);
                    case 2:
                        WebPortalLoadingView.Companion companion3 = WebPortalLoadingView.INSTANCE;
                        return (ConstraintLayout) webPortalLoadingView.findViewById(R$id.portalLoading_loadingView);
                    default:
                        WebPortalLoadingView.Companion companion4 = WebPortalLoadingView.INSTANCE;
                        return (RecyclerView) webPortalLoadingView.findViewById(R$id.webviewShimmeringLoadingView_recyclerView);
                }
            }
        });
        final int i5 = 2;
        this.f77904j = w.y0(new Function0(this) { // from class: ey8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WebPortalLoadingView f130589b;

            {
                this.f130589b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i5;
                WebPortalLoadingView webPortalLoadingView = this.f130589b;
                switch (i32) {
                    case 0:
                        WebPortalLoadingView.Companion companion = WebPortalLoadingView.INSTANCE;
                        return (WebView) webPortalLoadingView.findViewById(R$id.portalLoading_webView);
                    case 1:
                        WebPortalLoadingView.Companion companion2 = WebPortalLoadingView.INSTANCE;
                        return (BasicNavBar) webPortalLoadingView.findViewById(R$id.portalLoading_navBar);
                    case 2:
                        WebPortalLoadingView.Companion companion3 = WebPortalLoadingView.INSTANCE;
                        return (ConstraintLayout) webPortalLoadingView.findViewById(R$id.portalLoading_loadingView);
                    default:
                        WebPortalLoadingView.Companion companion4 = WebPortalLoadingView.INSTANCE;
                        return (RecyclerView) webPortalLoadingView.findViewById(R$id.webviewShimmeringLoadingView_recyclerView);
                }
            }
        });
        final int i6 = 3;
        this.k = w.y0(new Function0(this) { // from class: ey8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WebPortalLoadingView f130589b;

            {
                this.f130589b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i6;
                WebPortalLoadingView webPortalLoadingView = this.f130589b;
                switch (i32) {
                    case 0:
                        WebPortalLoadingView.Companion companion = WebPortalLoadingView.INSTANCE;
                        return (WebView) webPortalLoadingView.findViewById(R$id.portalLoading_webView);
                    case 1:
                        WebPortalLoadingView.Companion companion2 = WebPortalLoadingView.INSTANCE;
                        return (BasicNavBar) webPortalLoadingView.findViewById(R$id.portalLoading_navBar);
                    case 2:
                        WebPortalLoadingView.Companion companion3 = WebPortalLoadingView.INSTANCE;
                        return (ConstraintLayout) webPortalLoadingView.findViewById(R$id.portalLoading_loadingView);
                    default:
                        WebPortalLoadingView.Companion companion4 = WebPortalLoadingView.INSTANCE;
                        return (RecyclerView) webPortalLoadingView.findViewById(R$id.webviewShimmeringLoadingView_recyclerView);
                }
            }
        });
        this.f77905l = w.y0(new b0.b(context, 11));
        this.f77906m = w.y0(new a(15));
        this.f77907n = q.b(1, 5, null);
        LayoutInflater.from(context).inflate(R$layout.screen_web_portal_loading, (ViewGroup) this, true);
        WebView webView = getWebView();
        webView.setOverScrollMode(2);
        webView.setFocusableInTouchMode(true);
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        RecyclerView recyclerView = getRecyclerView();
        recyclerView.setLayoutManager(getBaseRecyclerViewLayoutManager());
        j jVar = new j(null, 7);
        jVar.setSupportsChangeAnimations(false);
        recyclerView.setItemAnimator(jVar);
        recyclerView.addItemDecoration(new o31.b());
        h listAdapter = getListAdapter();
        listAdapter.f.b(u.c(new RowLoadingDelegate()));
        recyclerView.setAdapter(listAdapter);
        h listAdapter2 = getListAdapter();
        nb0 nb0Var = pb0.Companion;
        List listK = v.k(nb0.b(nb0Var, "webview_row_loading_delegate_1", false, 0, false, 30), nb0.b(nb0Var, "webview_row_loading_delegate_2", false, 0, false, 30));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        listAdapter2.c(listK);
    }

    public /* synthetic */ WebPortalLoadingView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
