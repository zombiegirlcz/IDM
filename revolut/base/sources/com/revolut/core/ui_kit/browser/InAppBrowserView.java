package com.revolut.core.ui_kit.browser;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowInsets;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import aw0.o9;
import c9i.b;
import cam.r;
import com.google.android.material.internal.ViewUtils;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.delegates.nh;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import e8.q;
import ifm.c;
import ihm.f;
import ix0.x0;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import kli.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import or0.u;
import org.jetbrains.annotations.NotNull;
import wo0.d;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0002B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0005\u0010\tB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010!\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\nH\u0001¢\u0006\u0004\b\u001f\u0010 R!\u0010)\u001a\u00020\"8@X\u0081\u0084\u0002¢\u0006\u0012\n\u0004\b#\u0010$\u0012\u0004\b'\u0010(\u001a\u0004\b%\u0010&R\u001b\u0010.\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010$\u001a\u0004\b,\u0010-R\u001b\u00103\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010$\u001a\u0004\b1\u00102R\u001b\u00108\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010$\u001a\u0004\b6\u00107R\u001b\u0010=\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010$\u001a\u0004\b;\u0010<R\u001b\u0010C\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\bD\u0010E¨\u0006F"}, d2 = {"Lcom/revolut/core/ui_kit/browser/InAppBrowserView;", "Landroid/widget/FrameLayout;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lwo0/a;", "actionButtonData", "", "setActionButton", "(Lwo0/a;)V", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "image", "setOptionsButtonImage", "(Lcom/revolut/core/ui_kit_core/displayers/image/Image;)V", "Lcom/revolut/core/ui_kit/delegates/nh;", "suggestionBarModel", "setKeyboardSuggestions", "(Lcom/revolut/core/ui_kit/delegates/nh;)V", "", "url", "setToolbarUrl", "(Ljava/lang/String;)V", "progress", "setProgress$ui_kit_components_release", "(I)V", "setProgress", "Landroid/webkit/WebView;", "a", "Le8/q;", "getWebView$ui_kit_components_release", "()Landroid/webkit/WebView;", "getWebView$ui_kit_components_release$annotations", "()V", "webView", "Lcom/revolut/core/ui_kit/browser/InAppBrowserBottomBarView;", "b", "getBottomBarView", "()Lcom/revolut/core/ui_kit/browser/InAppBrowserBottomBarView;", "bottomBarView", "Lcom/revolut/core/ui_kit/browser/InAppBrowserTopBarView;", "c", "getTopBarView", "()Lcom/revolut/core/ui_kit/browser/InAppBrowserTopBarView;", "topBarView", "Landroid/widget/ProgressBar;", "d", "getProgressView", "()Landroid/widget/ProgressBar;", "progressView", "Landroidx/recyclerview/widget/RecyclerView;", "e", "getSuggestionsBarView", "()Landroidx/recyclerview/widget/RecyclerView;", "suggestionsBarView", "Lz4l/j;", "i", "Lkotlin/Lazy;", "getSuggestionsAdapter", "()Lz4l/j;", "suggestionsAdapter", "getUrl", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InAppBrowserView extends FrameLayout {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f51517l = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final q webView;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final q bottomBarView;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final q topBarView;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final q progressView;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final q suggestionsBarView;
    public final f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f51521g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final SuggestionsBarDelegate f51522h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Function1 f51523j;
    public c k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppBrowserView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.webView = a.J(R$id.inAppBrowserView_webView, this);
        this.bottomBarView = a.J(R$id.inAppBrowserView_bottomBar, this);
        this.topBarView = a.J(R$id.inAppBrowserView_topBar, this);
        this.progressView = a.J(R$id.inAppBrowserView_progressView, this);
        this.suggestionsBarView = a.J(R$id.inAppBrowserView_suggestions, this);
        this.f = v0.a.d("create(...)");
        this.f51521g = v0.a.d("create(...)");
        this.f51522h = new SuggestionsBarDelegate();
        this.i = j.c(k.NONE, new vt3.a(this, 27));
        this.f51523j = new d(this, 1);
        r rVar = new r(this, 6);
        b bVar = new b(this, 10);
        View.inflate(getContext(), R$layout.internal_view_in_app_browser, this);
        getSuggestionsBarView().setAdapter(getSuggestionsAdapter());
        WebSettings settings = getWebView$ui_kit_components_release().getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setAllowFileAccess(true);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setSupportMultipleWindows(false);
        settings.setLoadsImagesAutomatically(true);
        settings.setDatabaseEnabled(true);
        CookieManager.getInstance().setAcceptCookie(true);
        CookieManager.getInstance().setAcceptThirdPartyCookies(getWebView$ui_kit_components_release(), true);
        getWebView$ui_kit_components_release().setWebChromeClient(rVar);
        getWebView$ui_kit_components_release().setWebViewClient(bVar);
    }

    public static Unit a(InAppBrowserView inAppBrowserView, WindowInsets newInsets) {
        Intrinsics.checkNotNullParameter(newInsets, "newInsets");
        boolean zC = x0.c(newInsets);
        inAppBrowserView.getSuggestionsBarView().setVisibility(zC ? 0 : 8);
        inAppBrowserView.getBottomBarView().setVisibility(zC ? 8 : 0);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InAppBrowserBottomBarView getBottomBarView() {
        return (InAppBrowserBottomBarView) this.bottomBarView.f();
    }

    private final ProgressBar getProgressView() {
        return (ProgressBar) this.progressView.f();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final z4l.j getSuggestionsAdapter() {
        return (z4l.j) this.i.getValue();
    }

    private final RecyclerView getSuggestionsBarView() {
        return (RecyclerView) this.suggestionsBarView.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InAppBrowserTopBarView getTopBarView() {
        return (InAppBrowserTopBarView) this.topBarView.f();
    }

    public static /* synthetic */ void getWebView$ui_kit_components_release$annotations() {
    }

    public final f d() {
        return getBottomBarView().f51508a;
    }

    public final f e() {
        return getTopBarView().e;
    }

    public final String getUrl() {
        return getWebView$ui_kit_components_release().getUrl();
    }

    @NotNull
    public final WebView getWebView$ui_kit_components_release() {
        return (WebView) this.webView.f();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        Activity activityM;
        super.onAttachedToWindow();
        Context context = getContext();
        if (context != null && (activityM = a.m(context)) != null) {
            View decorView = activityM.getWindow().getDecorView();
            Intrinsics.h(decorView);
            u.a(decorView, this.f51523j);
            ViewUtils.requestApplyInsetsWhenAttached(decorView);
        }
        c cVar = this.k;
        if (cVar != null) {
            cVar.dispose();
        }
        this.k = getTopBarView().f.subscribe(new wl3.b(new d(this, 0), 14));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u.q(this, this.f51523j);
        c cVar = this.k;
        if (cVar != null) {
            cVar.dispose();
        }
        this.k = null;
    }

    public void setActionButton(wo0.a actionButtonData) {
        getBottomBarView().setActionButton(actionButtonData);
    }

    public final void setKeyboardSuggestions(@NotNull nh suggestionBarModel) {
        Intrinsics.checkNotNullParameter(suggestionBarModel, "suggestionBarModel");
        getSuggestionsAdapter().c(zhm.u.c(suggestionBarModel));
    }

    public void setOptionsButtonImage(Image image) {
        getBottomBarView().setOptionsButtonImage(image);
    }

    public final void setProgress$ui_kit_components_release(int progress) {
        boolean z = 1 <= progress && progress < 100;
        getTopBarView().setRefreshButtonEnabled(!z);
        getProgressView().setVisibility(z ? 0 : 8);
        getProgressView().setProgress(progress);
    }

    public final void setToolbarUrl(@NotNull String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        try {
            url2 = new URL(url2).getHost();
        } catch (MalformedURLException unused) {
        }
        String str = url2;
        InAppBrowserTopBarView topBarView = getTopBarView();
        Intrinsics.h(str);
        topBarView.setUrlText(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppBrowserView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.webView = a.J(R$id.inAppBrowserView_webView, this);
        this.bottomBarView = a.J(R$id.inAppBrowserView_bottomBar, this);
        this.topBarView = a.J(R$id.inAppBrowserView_topBar, this);
        this.progressView = a.J(R$id.inAppBrowserView_progressView, this);
        this.suggestionsBarView = a.J(R$id.inAppBrowserView_suggestions, this);
        this.f = v0.a.d("create(...)");
        this.f51521g = v0.a.d("create(...)");
        this.f51522h = new SuggestionsBarDelegate();
        this.i = j.c(k.NONE, new vt3.a(this, 27));
        this.f51523j = new d(this, 1);
        r rVar = new r(this, 6);
        b bVar = new b(this, 10);
        View.inflate(getContext(), R$layout.internal_view_in_app_browser, this);
        getSuggestionsBarView().setAdapter(getSuggestionsAdapter());
        WebSettings settings = getWebView$ui_kit_components_release().getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setAllowFileAccess(true);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setSupportMultipleWindows(false);
        settings.setLoadsImagesAutomatically(true);
        settings.setDatabaseEnabled(true);
        CookieManager.getInstance().setAcceptCookie(true);
        CookieManager.getInstance().setAcceptThirdPartyCookies(getWebView$ui_kit_components_release(), true);
        getWebView$ui_kit_components_release().setWebChromeClient(rVar);
        getWebView$ui_kit_components_release().setWebViewClient(bVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppBrowserView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.webView = a.J(R$id.inAppBrowserView_webView, this);
        this.bottomBarView = a.J(R$id.inAppBrowserView_bottomBar, this);
        this.topBarView = a.J(R$id.inAppBrowserView_topBar, this);
        this.progressView = a.J(R$id.inAppBrowserView_progressView, this);
        this.suggestionsBarView = a.J(R$id.inAppBrowserView_suggestions, this);
        this.f = v0.a.d("create(...)");
        this.f51521g = v0.a.d("create(...)");
        this.f51522h = new SuggestionsBarDelegate();
        this.i = j.c(k.NONE, new vt3.a(this, 27));
        this.f51523j = new d(this, 1);
        r rVar = new r(this, 6);
        b bVar = new b(this, 10);
        View.inflate(getContext(), R$layout.internal_view_in_app_browser, this);
        getSuggestionsBarView().setAdapter(getSuggestionsAdapter());
        WebSettings settings = getWebView$ui_kit_components_release().getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setAllowFileAccess(true);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setSupportMultipleWindows(false);
        settings.setLoadsImagesAutomatically(true);
        settings.setDatabaseEnabled(true);
        CookieManager.getInstance().setAcceptCookie(true);
        CookieManager.getInstance().setAcceptThirdPartyCookies(getWebView$ui_kit_components_release(), true);
        getWebView$ui_kit_components_release().setWebChromeClient(rVar);
        getWebView$ui_kit_components_release().setWebViewClient(bVar);
    }
}
