package com.revolut.feature.direct_deposit.impl.ui_kompot.screen.preview;

import android.view.View;
import android.webkit.WebSettings;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.a0;
import cli.o;
import cli.q;
import cli.w;
import com.revolut.core.ui_kit.views.WebView;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.direct_deposit.impl.R$layout;
import com.revolut.feature.direct_deposit.impl.ui_kompot.screen.preview.DirectDepositPreviewContract$InputData;
import com.revolut.feature.direct_deposit.impl.ui_kompot.screen.preview.DirectDepositPreviewScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import h96.b;
import h96.c;
import h96.f;
import h96.j;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/direct_deposit/impl/ui_kompot/screen/preview/DirectDepositPreviewScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lh96/b;", "Lcli/w;", "Lh96/c;", "Companion", "a", "feature_direct_deposit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DirectDepositPreviewScreen extends ViewController<b> implements w {
    public final DirectDepositPreviewContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final h P;
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(DirectDepositPreviewScreen.class, "binding", "getBinding()Lcom/revolut/feature/direct_deposit/impl/databinding/ScreenHtmlPreviewBinding;", 0))};

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public DirectDepositPreviewScreen(DirectDepositPreviewContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_html_preview;
        final int i = 0;
        this.M = te0.w.y0(new Function0(this) { // from class: h96.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DirectDepositPreviewScreen f150181b;

            {
                this.f150181b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                DirectDepositPreviewScreen directDepositPreviewScreen = this.f150181b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = DirectDepositPreviewScreen.Q;
                        qji.b bVarU2 = directDepositPreviewScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.direct_deposit.impl.ui_kompot.screen.preview.di.DirectDepositPreviewScreenInjector");
                        a96.d dVar = (a96.d) bVarU2;
                        a96.c cVar = dVar.f2344a;
                        a96.d dVar2 = dVar.f2345b;
                        DirectDepositPreviewContract$InputData directDepositPreviewContract$InputData = directDepositPreviewScreen.K;
                        directDepositPreviewContract$InputData.getClass();
                        return new a96.e(cVar, dVar2, directDepositPreviewContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = DirectDepositPreviewScreen.Q;
                        return n14.e.a(directDepositPreviewScreen, (j) directDepositPreviewScreen.O.getValue());
                    default:
                        KProperty[] kPropertyArr3 = DirectDepositPreviewScreen.Q;
                        return (j) ((a96.e) directDepositPreviewScreen.M.getValue()).f2349c.get();
                }
            }
        });
        final int i2 = 1;
        this.N = te0.w.y0(new Function0(this) { // from class: h96.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DirectDepositPreviewScreen f150181b;

            {
                this.f150181b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                DirectDepositPreviewScreen directDepositPreviewScreen = this.f150181b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DirectDepositPreviewScreen.Q;
                        qji.b bVarU2 = directDepositPreviewScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.direct_deposit.impl.ui_kompot.screen.preview.di.DirectDepositPreviewScreenInjector");
                        a96.d dVar = (a96.d) bVarU2;
                        a96.c cVar = dVar.f2344a;
                        a96.d dVar2 = dVar.f2345b;
                        DirectDepositPreviewContract$InputData directDepositPreviewContract$InputData = directDepositPreviewScreen.K;
                        directDepositPreviewContract$InputData.getClass();
                        return new a96.e(cVar, dVar2, directDepositPreviewContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = DirectDepositPreviewScreen.Q;
                        return n14.e.a(directDepositPreviewScreen, (j) directDepositPreviewScreen.O.getValue());
                    default:
                        KProperty[] kPropertyArr3 = DirectDepositPreviewScreen.Q;
                        return (j) ((a96.e) directDepositPreviewScreen.M.getValue()).f2349c.get();
                }
            }
        });
        final int i3 = 2;
        this.O = te0.w.y0(new Function0(this) { // from class: h96.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DirectDepositPreviewScreen f150181b;

            {
                this.f150181b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                DirectDepositPreviewScreen directDepositPreviewScreen = this.f150181b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DirectDepositPreviewScreen.Q;
                        qji.b bVarU2 = directDepositPreviewScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.direct_deposit.impl.ui_kompot.screen.preview.di.DirectDepositPreviewScreenInjector");
                        a96.d dVar = (a96.d) bVarU2;
                        a96.c cVar = dVar.f2344a;
                        a96.d dVar2 = dVar.f2345b;
                        DirectDepositPreviewContract$InputData directDepositPreviewContract$InputData = directDepositPreviewScreen.K;
                        directDepositPreviewContract$InputData.getClass();
                        return new a96.e(cVar, dVar2, directDepositPreviewContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = DirectDepositPreviewScreen.Q;
                        return n14.e.a(directDepositPreviewScreen, (j) directDepositPreviewScreen.O.getValue());
                    default:
                        KProperty[] kPropertyArr3 = DirectDepositPreviewScreen.Q;
                        return (j) ((a96.e) directDepositPreviewScreen.M.getValue()).f2349c.get();
                }
            }
        });
        this.P = s.t(this, f.f);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        c uiState = (c) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        if (uiState.f150179a != null) {
            d3().f311632c.loadDataWithBaseURL(null, uiState.f150179a, "text/html", "utf-8", null);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (a96.e) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (j) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f311631b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        WebView webView = d3().f311632c;
        WebSettings settings = webView.getSettings();
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setBuiltInZoomControls(true);
        settings.setSupportZoom(true);
        webView.setWebViewClient(new ay8.a(this, webView, 2));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f311631b.f59211b), new gqh.o(this, null, 23), 3);
    }

    public final y86.a d3() {
        ViewBinding value = this.P.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (y86.a) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.N.getValue();
    }
}
