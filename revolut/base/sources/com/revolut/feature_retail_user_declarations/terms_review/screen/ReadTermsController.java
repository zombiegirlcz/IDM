package com.revolut.feature_retail_user_declarations.terms_review.screen;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenDocumentLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.WebViewDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarScrollingViewBehavior;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.user_declarations.shared.R$string;
import com.revolut.feature_retail_user_declarations.R$id;
import com.revolut.feature_retail_user_declarations.R$layout;
import com.revolut.feature_retail_user_declarations.terms_review.screen.ReadTermsController;
import com.revolut.feature_retail_user_declarations.terms_review.screen.ReadTermsControllerContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.ui_kit_pdf.PdfView;
import dli.a;
import dli.c;
import java.io.File;
import java.util.List;
import kji.f;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import naf.j;
import nci.b;
import nci.d;
import nci.e;
import nci.g;
import nci.l;
import nci.m;
import nci.o;
import nci.p;
import nci.r;
import oai.b0;
import oai.f0;
import oai.i0;
import te0.w;
import tx0.j0;
import tx0.t3;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/terms_review/screen/ReadTermsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lnci/o;", "Ldli/a;", "Lnci/p;", "Lkji/f;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ReadTermsController extends ViewController<o> implements a, f {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(ReadTermsController.class, "binding", "getBinding()Lcom/revolut/feature_retail_user_declarations/databinding/ScreenReadTermsBinding;", 0))};
    public final ReadTermsControllerContract$InputData K;
    public final Object L;
    public final Object M;
    public final WebViewDelegate N;
    public final FullScreenStateDelegate O;
    public final Object P;
    public final int Q;
    public final h R;
    public oyl.f S;

    public ReadTermsController(ReadTermsControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: nci.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReadTermsController f214199b;

            {
                this.f214199b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ReadTermsController readTermsController = this.f214199b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ReadTermsController.T;
                        qji.b bVarU2 = readTermsController.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature_retail_user_declarations.terms_review.screen.di.ReadTermsControllerComponentInjector");
                        }
                        f0 f0Var = (f0) bVarU2;
                        i0 i0Var = f0Var.f223683b;
                        f0 f0Var2 = f0Var.f223684c;
                        ReadTermsControllerContract$InputData readTermsControllerContract$InputData = readTermsController.K;
                        readTermsControllerContract$InputData.getClass();
                        return new b0(i0Var, f0Var2, readTermsControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ReadTermsController.T;
                        return (l) ((b0) readTermsController.L.getValue()).f223664b.get();
                    default:
                        KProperty[] kPropertyArr3 = ReadTermsController.T;
                        ReadTermsController readTermsController2 = this.f214199b;
                        return dli.f.a(readTermsController2, readTermsController2.R2(), v.k(new FullScreenDocumentLoadingDelegate(), readTermsController2.N, readTermsController2.O), R$id.readTerms_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: nci.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReadTermsController f214199b;

            {
                this.f214199b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ReadTermsController readTermsController = this.f214199b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ReadTermsController.T;
                        qji.b bVarU2 = readTermsController.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature_retail_user_declarations.terms_review.screen.di.ReadTermsControllerComponentInjector");
                        }
                        f0 f0Var = (f0) bVarU2;
                        i0 i0Var = f0Var.f223683b;
                        f0 f0Var2 = f0Var.f223684c;
                        ReadTermsControllerContract$InputData readTermsControllerContract$InputData = readTermsController.K;
                        readTermsControllerContract$InputData.getClass();
                        return new b0(i0Var, f0Var2, readTermsControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ReadTermsController.T;
                        return (l) ((b0) readTermsController.L.getValue()).f223664b.get();
                    default:
                        KProperty[] kPropertyArr3 = ReadTermsController.T;
                        ReadTermsController readTermsController2 = this.f214199b;
                        return dli.f.a(readTermsController2, readTermsController2.R2(), v.k(new FullScreenDocumentLoadingDelegate(), readTermsController2.N, readTermsController2.O), R$id.readTerms_recyclerView, null, null, null, 56);
                }
            }
        });
        this.N = new WebViewDelegate();
        this.O = new FullScreenStateDelegate();
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: nci.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReadTermsController f214199b;

            {
                this.f214199b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ReadTermsController readTermsController = this.f214199b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ReadTermsController.T;
                        qji.b bVarU2 = readTermsController.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature_retail_user_declarations.terms_review.screen.di.ReadTermsControllerComponentInjector");
                        }
                        f0 f0Var = (f0) bVarU2;
                        i0 i0Var = f0Var.f223683b;
                        f0 f0Var2 = f0Var.f223684c;
                        ReadTermsControllerContract$InputData readTermsControllerContract$InputData = readTermsController.K;
                        readTermsControllerContract$InputData.getClass();
                        return new b0(i0Var, f0Var2, readTermsControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ReadTermsController.T;
                        return (l) ((b0) readTermsController.L.getValue()).f223664b.get();
                    default:
                        KProperty[] kPropertyArr3 = ReadTermsController.T;
                        ReadTermsController readTermsController2 = this.f214199b;
                        return dli.f.a(readTermsController2, readTermsController2.R2(), v.k(new FullScreenDocumentLoadingDelegate(), readTermsController2.N, readTermsController2.O), R$id.readTerms_recyclerView, null, null, null, 56);
                }
            }
        });
        this.Q = R$layout.screen_read_terms;
        this.R = s.t(this, e.f);
    }

    public static void g3(ViewGroup viewGroup, boolean z) {
        viewGroup.setTag(com.revolut.core.ui_kit.R$id.uikit_main_scrollable_view, z ? "MAIN_SCROLLABLE_TAG" : null);
        NavBarScrollingViewBehavior navBarScrollingViewBehavior = z ? new NavBarScrollingViewBehavior() : null;
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        Intrinsics.i(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        ((CoordinatorLayout.LayoutParams) layoutParams).setBehavior(navBarScrollingViewBehavior);
        viewGroup.setVisibility(z ? 0 : 8);
    }

    public static void h3(RecyclerView recyclerView, boolean z) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        Intrinsics.i(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutManager");
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        b bVar = new b(context, z, !z);
        bVar.setTargetPosition(layoutManager.getItemCount() - 1);
        layoutManager.startSmoothScroll(bVar);
    }

    @Override // cli.w
    public final void B(cli.o oVar, q qVar) {
        p uiState = (p) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        Clause clause = uiState.f214210b;
        File file = uiState.f214211c;
        if (clause != null) {
            NavBarWithToolbar navBarWithToolbar = d3().f204043b;
            navBarWithToolbar.setTitle(clause, null);
            navBarWithToolbar.setToolbarTitle(clause);
            navBarWithToolbar.setSecondDescriptionVisible(true);
            navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.terms_terms_review_subtitle, null, null, 14));
            navBarWithToolbar.l0();
        }
        d3().e.setVisibility(uiState.d ? 0 : 8);
        f3(file != null);
        if (file != null) {
            oyl.f fVarA = d3().f204044c.a(new d(this, 0));
            fVarA.d(file);
            this.S = fVarA;
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((r) R2()).C2(m.f214207a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (b0) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f204043b;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        ReadTermsControllerContract$InputData readTermsControllerContract$InputData = this.K;
        navBarWithToolbar.setNavigationButtonIcon(readTermsControllerContract$InputData.f97750c.a());
        navBarWithToolbar.I0(t3.TWO_LINES, false);
        TwinVerticalButton twinVerticalButton = d3().e;
        twinVerticalButton.setCollapsed(true, false);
        twinVerticalButton.setFabImage(new ResourceImage(R$drawable.uikit_icn_24_arrow_thin_down, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorBackground), (List) null, (ImageTransformations) null, (Clause) null, 246));
        twinVerticalButton.setMainButtonText(readTermsControllerContract$InputData.f97749b);
        twinVerticalButton.setDescriptionVisibility(8);
        twinVerticalButton.setSecondaryButtonVisible(false);
        twinVerticalButton.setVisibility(8);
        this.z = readTermsControllerContract$InputData.f97750c.b();
        f3(false);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().e.m0()), null, new nci.f(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().e.o0()), null, new nci.f(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f204043b.f59410q), null, new nci.f(this, continuation, 2), 3);
        WebViewDelegate webViewDelegate = this.N;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(webViewDelegate.q()), null, new nci.f(this, continuation, 3), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(webViewDelegate.e), null, new nci.f(this, continuation, 4), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(webViewDelegate.f), null, new j(this, continuation, 3), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.f52371h.f121375b), null, new g(this, null), 3);
    }

    public final mai.b d3() {
        ViewBinding value = this.R.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (mai.b) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final l R2() {
        return (l) this.M.getValue();
    }

    public final void f3(boolean z) {
        ScreenContentRecyclerView readTermsRecyclerView = d3().d;
        Intrinsics.checkNotNullExpressionValue(readTermsRecyclerView, "readTermsRecyclerView");
        g3(readTermsRecyclerView, !z);
        PdfView readTermsPdfView = d3().f204044c;
        Intrinsics.checkNotNullExpressionValue(readTermsPdfView, "readTermsPdfView");
        g3(readTermsPdfView, z);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.P.getValue();
    }
}
