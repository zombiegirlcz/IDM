package com.revolut.feature.vaults.impl.ui.details.terms_viewer;

import aii.q;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.a0;
import cli.o;
import cli.w;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.FullScreenStateView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.ProgressSwitcher;
import com.revolut.core.ui_kit.views.WebView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.vaults.impl.R$layout;
import com.revolut.feature.vaults.impl.ui.details.terms_viewer.VaultTermsViewerScreen;
import com.revolut.feature.vaults.impl.ui.details.terms_viewer.VaultTermsViewerScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import jpl.e;
import jqg.c;
import jqg.f;
import jqg.g;
import jqg.j;
import jqg.k;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import tpg.d;
import vc.s;
import zh9.u0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/vaults/impl/ui/details/terms_viewer/VaultTermsViewerScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lcli/w;", "Ljqg/k;", "Companion", "a", "feature_vaults_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class VaultTermsViewerScreen extends ViewController<q> implements w {
    public final VaultTermsViewerScreenContract$InputData K;
    public final int L;
    public final h M;
    public String N;
    public boolean O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(VaultTermsViewerScreen.class, "binding", "getBinding()Lcom/revolut/feature/vaults/impl/databinding/ScreenVaultTermsViewerBinding;", 0))};

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public VaultTermsViewerScreen(VaultTermsViewerScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_vault_terms_viewer;
        this.M = s.t(this, jqg.b.f);
        final int i = 0;
        this.P = te0.w.y0(new Function0(this) { // from class: jqg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ VaultTermsViewerScreen f177712b;

            {
                this.f177712b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                VaultTermsViewerScreen vaultTermsViewerScreen = this.f177712b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = VaultTermsViewerScreen.S;
                        return n14.e.a(vaultTermsViewerScreen, vaultTermsViewerScreen.R2());
                    case 1:
                        KProperty[] kPropertyArr2 = VaultTermsViewerScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(vaultTermsViewerScreen.m2()).a().get(fpg.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", fpg.c.class, " is not found"));
                        }
                        wpg.l lVar = ((wpg.l) aVar2.b()).F;
                        VaultTermsViewerScreenContract$InputData vaultTermsViewerScreenContract$InputData = vaultTermsViewerScreen.K;
                        vaultTermsViewerScreenContract$InputData.getClass();
                        return new wpg.k(lVar, vaultTermsViewerScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = VaultTermsViewerScreen.S;
                        return (j) ((wpg.k) vaultTermsViewerScreen.Q.getValue()).f299276c.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = te0.w.y0(new Function0(this) { // from class: jqg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ VaultTermsViewerScreen f177712b;

            {
                this.f177712b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                VaultTermsViewerScreen vaultTermsViewerScreen = this.f177712b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = VaultTermsViewerScreen.S;
                        return n14.e.a(vaultTermsViewerScreen, vaultTermsViewerScreen.R2());
                    case 1:
                        KProperty[] kPropertyArr2 = VaultTermsViewerScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(vaultTermsViewerScreen.m2()).a().get(fpg.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", fpg.c.class, " is not found"));
                        }
                        wpg.l lVar = ((wpg.l) aVar2.b()).F;
                        VaultTermsViewerScreenContract$InputData vaultTermsViewerScreenContract$InputData = vaultTermsViewerScreen.K;
                        vaultTermsViewerScreenContract$InputData.getClass();
                        return new wpg.k(lVar, vaultTermsViewerScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = VaultTermsViewerScreen.S;
                        return (j) ((wpg.k) vaultTermsViewerScreen.Q.getValue()).f299276c.get();
                }
            }
        });
        final int i3 = 2;
        this.R = te0.w.y0(new Function0(this) { // from class: jqg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ VaultTermsViewerScreen f177712b;

            {
                this.f177712b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                VaultTermsViewerScreen vaultTermsViewerScreen = this.f177712b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = VaultTermsViewerScreen.S;
                        return n14.e.a(vaultTermsViewerScreen, vaultTermsViewerScreen.R2());
                    case 1:
                        KProperty[] kPropertyArr2 = VaultTermsViewerScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(vaultTermsViewerScreen.m2()).a().get(fpg.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", fpg.c.class, " is not found"));
                        }
                        wpg.l lVar = ((wpg.l) aVar2.b()).F;
                        VaultTermsViewerScreenContract$InputData vaultTermsViewerScreenContract$InputData = vaultTermsViewerScreen.K;
                        vaultTermsViewerScreenContract$InputData.getClass();
                        return new wpg.k(lVar, vaultTermsViewerScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = VaultTermsViewerScreen.S;
                        return (j) ((wpg.k) vaultTermsViewerScreen.Q.getValue()).f299276c.get();
                }
            }
        });
    }

    public static final void d3(VaultTermsViewerScreen vaultTermsViewerScreen) {
        com.revolut.feature.vaults.impl.ui.details.terms_viewer.a aVar = (com.revolut.feature.vaults.impl.ui.details.terms_viewer.a) vaultTermsViewerScreen.R2();
        if (vaultTermsViewerScreen.e3().f.canScrollVertically(1)) {
            aVar.getClass();
        } else {
            aVar.H2(aVar.f94759r, new e(5));
        }
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        int iW;
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbar = e3().f273374c;
        navBarWithToolbar.setTitle(uiState.f177722b, null);
        navBarWithToolbar.setToolbarTitle(uiState.f177722b);
        navBarWithToolbar.setMenuItems(uiState.f177723c);
        LargeActionButton largeActionButton = e3().f273373b;
        Clause clause = uiState.d;
        largeActionButton.setVisibility(clause != null ? 0 : 8);
        if (clause != null) {
            largeActionButton.setText(clause);
        }
        largeActionButton.setEnabled(uiState.e);
        boolean z = clause != null;
        if (this.O != z) {
            this.O = z;
            WebView termsViewerWebView = e3().f;
            Intrinsics.checkNotNullExpressionValue(termsViewerWebView, "termsViewerWebView");
            ViewGroup.LayoutParams layoutParams = termsViewerWebView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (z) {
                Context context = e3().f.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                iW = kli.a.w(R$attr.uikit_dp96, context);
            } else {
                iW = 0;
            }
            marginLayoutParams.bottomMargin = iW;
            termsViewerWebView.setLayoutParams(marginLayoutParams);
            ViewCompat.requestApplyInsets(e3().f);
        }
        jqg.h hVar = uiState.f177721a;
        d dVarE3 = e3();
        if (Intrinsics.f(hVar, g.f177717a)) {
            this.N = null;
            WebView termsViewerWebView2 = dVarE3.f;
            Intrinsics.checkNotNullExpressionValue(termsViewerWebView2, "termsViewerWebView");
            termsViewerWebView2.setVisibility(8);
            dVarE3.e.setProgressVisible(true);
            FullScreenStateView termsViewerError = dVarE3.d;
            Intrinsics.checkNotNullExpressionValue(termsViewerError, "termsViewerError");
            termsViewerError.setVisibility(8);
            return;
        }
        if (hVar instanceof jqg.e) {
            WebView termsViewerWebView3 = dVarE3.f;
            Intrinsics.checkNotNullExpressionValue(termsViewerWebView3, "termsViewerWebView");
            termsViewerWebView3.setVisibility(0);
            dVarE3.e.setProgressVisible(false);
            FullScreenStateView termsViewerError2 = dVarE3.d;
            Intrinsics.checkNotNullExpressionValue(termsViewerError2, "termsViewerError");
            termsViewerError2.setVisibility(8);
            jqg.e eVar = (jqg.e) hVar;
            if (Intrinsics.f(this.N, eVar.f177715a)) {
                return;
            }
            String str = eVar.f177715a;
            this.N = str;
            dVarE3.f.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            return;
        }
        if (!(hVar instanceof f)) {
            throw new NoWhenBranchMatchedException();
        }
        this.N = null;
        WebView termsViewerWebView4 = dVarE3.f;
        FullScreenStateView termsViewerError3 = dVarE3.d;
        Intrinsics.checkNotNullExpressionValue(termsViewerWebView4, "termsViewerWebView");
        termsViewerWebView4.setVisibility(8);
        dVarE3.e.setProgressVisible(false);
        Intrinsics.checkNotNullExpressionValue(termsViewerError3, "termsViewerError");
        termsViewerError3.setVisibility(0);
        Intrinsics.checkNotNullExpressionValue(termsViewerError3, "termsViewerError");
        FullScreenStateDelegate.Model model = ((f) hVar).f177716a;
        termsViewerError3.setTitleText(model.f52374b);
        FullScreenStateView.setCaptionText$default(termsViewerError3, model.d, null, 2, null);
        FullScreenStateView.setImage$default(termsViewerError3, model.e, null, 2, null);
        termsViewerError3.setMainAction(model.f52377h);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (wpg.k) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        e3().f273374c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        e3().f273374c.setExpanded(false, false);
        ProgressSwitcher progressSwitcher = e3().e;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        progressSwitcher.setProgressSize(kli.a.k(context, 32.0f));
        WebView webView = e3().f;
        webView.getSettings().setJavaScriptEnabled(false);
        webView.getSettings().setLoadWithOverviewMode(false);
        webView.getSettings().setUseWideViewPort(false);
        webView.getSettings().setDomStorageEnabled(false);
        webView.setWebViewClient(new ay8.a(this, webView, 4));
        c onScrollChangedCallback = new c(this, 0);
        Intrinsics.checkNotNullParameter(onScrollChangedCallback, "onScrollChangedCallback");
        webView.f58930b.add(onScrollChangedCallback);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, u0.H(rd0.e.b(e3().f273374c.f59410q)), null, new jqg.d(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, u0.H(rd0.e.b(e3().f273374c.o.f57403b)), null, new jqg.d(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, u0.H(rd0.e.b(e3().f273373b.o)), null, new jqg.d(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, u0.H(rd0.e.b(e3().d.getSmallActionButton().f56386h)), null, new jqg.d(this, continuation, 3), 3);
    }

    public final d e3() {
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (d) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: f3, reason: merged with bridge method [inline-methods] */
    public final j d() {
        return (j) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.P.getValue();
    }
}
