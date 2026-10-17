package com.revolut.feature.rev_points.impl.ui.terms_review.screen;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
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
import com.revolut.feature.rev_points.api.R$string;
import com.revolut.feature.rev_points.impl.R$id;
import com.revolut.feature.rev_points.impl.R$layout;
import com.revolut.feature.rev_points.impl.ui.terms_review.screen.RevPointsReadTermsController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.ui_kit_pdf.PdfView;
import dli.a;
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
import l0c.c;
import l0c.e;
import l0c.g;
import l0c.i;
import l0c.k;
import l0c.l;
import l0c.n;
import l0c.r;
import l0c.u;
import te0.w;
import tx0.j0;
import tx0.t3;
import vc.s;
import zxb.r0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/rev_points/impl/ui/terms_review/screen/RevPointsReadTermsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ll0c/n;", "Ldli/a;", "Ll0c/r;", "Lkji/f;", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevPointsReadTermsController extends ViewController<n> implements a, f {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(RevPointsReadTermsController.class, "binding", "getBinding()Lcom/revolut/feature/rev_points/impl/databinding/ScreenRevPointsReadTermsBinding;", 0))};
    public final RevPointsReadTermsControllerContract$InputData K;
    public final Object L;
    public final Object M;
    public final WebViewDelegate N;
    public final FullScreenStateDelegate O;
    public final Object P;
    public final int Q;
    public final h R;
    public oyl.f S;

    public RevPointsReadTermsController(RevPointsReadTermsControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: l0c.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsReadTermsController f191208b;

            {
                this.f191208b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RevPointsReadTermsController revPointsReadTermsController = this.f191208b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsReadTermsController.T;
                        qji.b bVarU2 = revPointsReadTermsController.U2();
                        if (bVarU2 != null) {
                            return (r0) ((m0c.a) ((m0c.b) bVarU2).b().mo3808a(revPointsReadTermsController)).g(revPointsReadTermsController.K).mo3783build();
                        }
                        throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.rev_points.impl.ui.terms_review.screen.di.RevPointsReadTermsControllerComponentInjector");
                    case 1:
                        KProperty[] kPropertyArr2 = RevPointsReadTermsController.T;
                        r0 r0Var = (r0) revPointsReadTermsController.L.getValue();
                        switch (r0Var.f326252a) {
                            case 0:
                                return (k) r0Var.f326254c.get();
                            default:
                                return (k) r0Var.f326254c.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = RevPointsReadTermsController.T;
                        RevPointsReadTermsController revPointsReadTermsController2 = this.f191208b;
                        return dli.f.a(revPointsReadTermsController2, revPointsReadTermsController2.d(), zhm.v.k(new FullScreenDocumentLoadingDelegate(), revPointsReadTermsController2.N, revPointsReadTermsController2.O), R$id.revPointsReadTerms_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: l0c.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsReadTermsController f191208b;

            {
                this.f191208b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RevPointsReadTermsController revPointsReadTermsController = this.f191208b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsReadTermsController.T;
                        qji.b bVarU2 = revPointsReadTermsController.U2();
                        if (bVarU2 != null) {
                            return (r0) ((m0c.a) ((m0c.b) bVarU2).b().mo3808a(revPointsReadTermsController)).g(revPointsReadTermsController.K).mo3783build();
                        }
                        throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.rev_points.impl.ui.terms_review.screen.di.RevPointsReadTermsControllerComponentInjector");
                    case 1:
                        KProperty[] kPropertyArr2 = RevPointsReadTermsController.T;
                        r0 r0Var = (r0) revPointsReadTermsController.L.getValue();
                        switch (r0Var.f326252a) {
                            case 0:
                                return (k) r0Var.f326254c.get();
                            default:
                                return (k) r0Var.f326254c.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = RevPointsReadTermsController.T;
                        RevPointsReadTermsController revPointsReadTermsController2 = this.f191208b;
                        return dli.f.a(revPointsReadTermsController2, revPointsReadTermsController2.d(), zhm.v.k(new FullScreenDocumentLoadingDelegate(), revPointsReadTermsController2.N, revPointsReadTermsController2.O), R$id.revPointsReadTerms_recyclerView, null, null, null, 56);
                }
            }
        });
        this.N = new WebViewDelegate();
        this.O = new FullScreenStateDelegate();
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: l0c.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsReadTermsController f191208b;

            {
                this.f191208b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                RevPointsReadTermsController revPointsReadTermsController = this.f191208b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsReadTermsController.T;
                        qji.b bVarU2 = revPointsReadTermsController.U2();
                        if (bVarU2 != null) {
                            return (r0) ((m0c.a) ((m0c.b) bVarU2).b().mo3808a(revPointsReadTermsController)).g(revPointsReadTermsController.K).mo3783build();
                        }
                        throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.rev_points.impl.ui.terms_review.screen.di.RevPointsReadTermsControllerComponentInjector");
                    case 1:
                        KProperty[] kPropertyArr2 = RevPointsReadTermsController.T;
                        r0 r0Var = (r0) revPointsReadTermsController.L.getValue();
                        switch (r0Var.f326252a) {
                            case 0:
                                return (k) r0Var.f326254c.get();
                            default:
                                return (k) r0Var.f326254c.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = RevPointsReadTermsController.T;
                        RevPointsReadTermsController revPointsReadTermsController2 = this.f191208b;
                        return dli.f.a(revPointsReadTermsController2, revPointsReadTermsController2.d(), zhm.v.k(new FullScreenDocumentLoadingDelegate(), revPointsReadTermsController2.N, revPointsReadTermsController2.O), R$id.revPointsReadTerms_recyclerView, null, null, null, 56);
                }
            }
        });
        this.Q = R$layout.screen_rev_points_read_terms;
        this.R = s.t(this, l0c.f.f);
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
        c cVar = new c(context, z);
        cVar.setTargetPosition(layoutManager.getItemCount() - 1);
        layoutManager.startSmoothScroll(cVar);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        r uiState = (r) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        Clause clause = uiState.f191220b;
        File file = uiState.f191221c;
        RevPointsReadTermsControllerContract$InputData revPointsReadTermsControllerContract$InputData = this.K;
        if (clause != null) {
            NavBarWithToolbar navBarWithToolbar = d3().f300829b;
            navBarWithToolbar.setTitle(clause, null);
            navBarWithToolbar.setToolbarTitle(clause);
            navBarWithToolbar.setSecondDescriptionVisible(true);
            Clause clause2 = revPointsReadTermsControllerContract$InputData.f83849a.f84100b;
            if (clause2 != null) {
                d3().f300829b.setSecondDescriptionText(clause2);
            } else {
                d3().f300829b.setSecondDescriptionText(new TextLocalisedClause(R$string.rev_points_terms_review_default_subtitle, null, null, 14));
            }
            navBarWithToolbar.l0();
        }
        boolean z = uiState.e;
        TwinVerticalButton twinVerticalButton = d3().e;
        twinVerticalButton.setVisibility(z ? 0 : 8);
        twinVerticalButton.setGradientBackgroundEnabled(z);
        f3(file != null);
        d3().e.setDescriptionVisibility((d3().e.A() || revPointsReadTermsControllerContract$InputData.f83849a.f84101c == null) ? 4 : 0);
        d3().f300829b.setMenuItems(uiState.d);
        if (file != null) {
            oyl.f fVarA = d3().f300830c.a(new e(this, 0));
            fVarA.d(file);
            this.S = fVarA;
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((u) d()).C2(l.f191215a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (r0) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f300829b;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.I0(t3.TWO_LINES, false);
        TwinVerticalButton twinVerticalButton = d3().e;
        twinVerticalButton.setCollapsed(true, false);
        twinVerticalButton.setFabImage(new ResourceImage(R$drawable.uikit_icn_24_arrow_thin_down, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorBackground), (List) null, (ImageTransformations) null, (Clause) null, 246));
        RevPointsReadTermsControllerContract$InputData revPointsReadTermsControllerContract$InputData = this.K;
        Clause clause = revPointsReadTermsControllerContract$InputData.f83849a.f84101c;
        if (clause != null) {
            TwinVerticalButton.setDescription$default(twinVerticalButton, clause, null, null, 6, null);
        }
        twinVerticalButton.setMainButtonText(revPointsReadTermsControllerContract$InputData.f83850b);
        twinVerticalButton.setDescriptionVisibility(8);
        twinVerticalButton.setSecondaryButtonVisible(false);
        twinVerticalButton.setVisibility(8);
        f3(false);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().e.m0()), null, new g(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().e.o0()), null, new g(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f300829b.f59410q), null, new g(this, continuation, 2), 3);
        WebViewDelegate webViewDelegate = this.N;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(webViewDelegate.q()), null, new g(this, continuation, 3), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(webViewDelegate.e), null, new g(this, continuation, 4), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.f52371h.f121375b), null, new l0c.h(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().e.n0()), null, new i(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f300829b.o.f57403b), null, new i(this, continuation, 1), 3);
    }

    public final wxb.i d3() {
        ViewBinding value = this.R.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (wxb.i) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final k d() {
        return (k) this.M.getValue();
    }

    public final void f3(boolean z) {
        ScreenContentRecyclerView revPointsReadTermsRecyclerView = d3().d;
        Intrinsics.checkNotNullExpressionValue(revPointsReadTermsRecyclerView, "revPointsReadTermsRecyclerView");
        g3(revPointsReadTermsRecyclerView, !z);
        PdfView revPointsReadTermsPdfView = d3().f300830c;
        Intrinsics.checkNotNullExpressionValue(revPointsReadTermsPdfView, "revPointsReadTermsPdfView");
        g3(revPointsReadTermsPdfView, z);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
