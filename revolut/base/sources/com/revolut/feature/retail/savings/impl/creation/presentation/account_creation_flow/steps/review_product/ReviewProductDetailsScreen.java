package com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product;

import android.content.Intent;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.d0;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.BigTileLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.CollapsingActionButton;
import com.revolut.core.ui_kit.views.buttons.FormsActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.retail.savings.api.R$string;
import com.revolut.feature.retail.savings.impl.R$id;
import com.revolut.feature.retail.savings.impl.R$layout;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.ReviewProductDetailsScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.tracking.v3.IdContext;
import efm.r;
import fb6.j;
import fmb.f0;
import fmb.i;
import fmb.l;
import fmb.m0;
import fmb.n;
import fmb.p;
import fmb.t;
import fmb.u;
import fmb.v;
import fmb.y;
import java.util.List;
import kii.e;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.k;
import rlb.c;
import te0.w;
import tx0.j0;
import tx0.t3;
import vc.s;
import xmb.d;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/steps/review_product/ReviewProductDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lfmb/f0;", "Ldli/a;", "Lfmb/m0;", "Lno/k;", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ReviewProductDetailsScreen extends ViewController<f0> implements dli.a, k {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f83283b0 = {o0.f186429a.j(new h0(ReviewProductDetailsScreen.class, "binding", "getBinding()Lcom/revolut/feature/retail/savings/impl/databinding/ScreenReviewProductDetailsBinding;", 0))};
    public final Object K;
    public final Object L;
    public final int M;
    public final h N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final InputChecklistDelegate R;
    public final RowDelegate S;
    public final ListCellDelegate T;
    public final FullScreenStateDelegate U;
    public final TextDelegate V;
    public final CellDetailsDelegate W;
    public final LargeActionButtonDelegate X;
    public final Object Y;
    public AnalyticsContext Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f83284a0;

    public ReviewProductDetailsScreen(ReviewProductDetailsScreenContract$InputData input) {
        Intrinsics.checkNotNullParameter(input, "input");
        final int i = 0;
        this.K = w.y0(new Function0(this) { // from class: fmb.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReviewProductDetailsScreen f136268b;

            {
                this.f136268b = this;
            }

            /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ReviewProductDetailsScreen reviewProductDetailsScreen = this.f136268b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ReviewProductDetailsScreen.f83283b0;
                        return (w) ((rlb.c) reviewProductDetailsScreen.L.getValue()).v.get();
                    case 1:
                        KProperty[] kPropertyArr2 = ReviewProductDetailsScreen.f83283b0;
                        return reviewProductDetailsScreen.d3().f307105c;
                    case 2:
                        KProperty[] kPropertyArr3 = ReviewProductDetailsScreen.f83283b0;
                        return reviewProductDetailsScreen.d3().f307104b;
                    case 3:
                        KProperty[] kPropertyArr4 = ReviewProductDetailsScreen.f83283b0;
                        return reviewProductDetailsScreen.d3().d;
                    case 4:
                        KProperty[] kPropertyArr5 = ReviewProductDetailsScreen.f83283b0;
                        return (j60.a) ((rlb.c) reviewProductDetailsScreen.L.getValue()).f254957j.get();
                    default:
                        KProperty[] kPropertyArr6 = ReviewProductDetailsScreen.f83283b0;
                        ReviewProductDetailsScreen reviewProductDetailsScreen2 = this.f136268b;
                        return dli.f.a(reviewProductDetailsScreen2, reviewProductDetailsScreen2.R2(), zhm.v.k(new ListSubheaderDelegate(), new BigTileLoadingDelegate(), reviewProductDetailsScreen2.S, reviewProductDetailsScreen2.T, reviewProductDetailsScreen2.R, reviewProductDetailsScreen2.V, new RowLoadingDelegate(), new CellDetailsLoadingDelegate(), new ListSubheaderLoadingDelegate(), new PlainTextWarningDelegate(), reviewProductDetailsScreen2.U), R$id.reviewProductDetails_recyclerView, null, null, null, 56);
                }
            }
        });
        this.L = w.y0(new j(this, input, 14));
        this.M = R$layout.screen_review_product_details;
        this.N = s.t(this, fmb.h.f);
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: fmb.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReviewProductDetailsScreen f136268b;

            {
                this.f136268b = this;
            }

            /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ReviewProductDetailsScreen reviewProductDetailsScreen = this.f136268b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ReviewProductDetailsScreen.f83283b0;
                        return (w) ((rlb.c) reviewProductDetailsScreen.L.getValue()).v.get();
                    case 1:
                        KProperty[] kPropertyArr2 = ReviewProductDetailsScreen.f83283b0;
                        return reviewProductDetailsScreen.d3().f307105c;
                    case 2:
                        KProperty[] kPropertyArr3 = ReviewProductDetailsScreen.f83283b0;
                        return reviewProductDetailsScreen.d3().f307104b;
                    case 3:
                        KProperty[] kPropertyArr4 = ReviewProductDetailsScreen.f83283b0;
                        return reviewProductDetailsScreen.d3().d;
                    case 4:
                        KProperty[] kPropertyArr5 = ReviewProductDetailsScreen.f83283b0;
                        return (j60.a) ((rlb.c) reviewProductDetailsScreen.L.getValue()).f254957j.get();
                    default:
                        KProperty[] kPropertyArr6 = ReviewProductDetailsScreen.f83283b0;
                        ReviewProductDetailsScreen reviewProductDetailsScreen2 = this.f136268b;
                        return dli.f.a(reviewProductDetailsScreen2, reviewProductDetailsScreen2.R2(), zhm.v.k(new ListSubheaderDelegate(), new BigTileLoadingDelegate(), reviewProductDetailsScreen2.S, reviewProductDetailsScreen2.T, reviewProductDetailsScreen2.R, reviewProductDetailsScreen2.V, new RowLoadingDelegate(), new CellDetailsLoadingDelegate(), new ListSubheaderLoadingDelegate(), new PlainTextWarningDelegate(), reviewProductDetailsScreen2.U), R$id.reviewProductDetails_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: fmb.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReviewProductDetailsScreen f136268b;

            {
                this.f136268b = this;
            }

            /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ReviewProductDetailsScreen reviewProductDetailsScreen = this.f136268b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ReviewProductDetailsScreen.f83283b0;
                        return (w) ((rlb.c) reviewProductDetailsScreen.L.getValue()).v.get();
                    case 1:
                        KProperty[] kPropertyArr2 = ReviewProductDetailsScreen.f83283b0;
                        return reviewProductDetailsScreen.d3().f307105c;
                    case 2:
                        KProperty[] kPropertyArr3 = ReviewProductDetailsScreen.f83283b0;
                        return reviewProductDetailsScreen.d3().f307104b;
                    case 3:
                        KProperty[] kPropertyArr4 = ReviewProductDetailsScreen.f83283b0;
                        return reviewProductDetailsScreen.d3().d;
                    case 4:
                        KProperty[] kPropertyArr5 = ReviewProductDetailsScreen.f83283b0;
                        return (j60.a) ((rlb.c) reviewProductDetailsScreen.L.getValue()).f254957j.get();
                    default:
                        KProperty[] kPropertyArr6 = ReviewProductDetailsScreen.f83283b0;
                        ReviewProductDetailsScreen reviewProductDetailsScreen2 = this.f136268b;
                        return dli.f.a(reviewProductDetailsScreen2, reviewProductDetailsScreen2.R2(), zhm.v.k(new ListSubheaderDelegate(), new BigTileLoadingDelegate(), reviewProductDetailsScreen2.S, reviewProductDetailsScreen2.T, reviewProductDetailsScreen2.R, reviewProductDetailsScreen2.V, new RowLoadingDelegate(), new CellDetailsLoadingDelegate(), new ListSubheaderLoadingDelegate(), new PlainTextWarningDelegate(), reviewProductDetailsScreen2.U), R$id.reviewProductDetails_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i5 = 3;
        this.Q = w.y0(new Function0(this) { // from class: fmb.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReviewProductDetailsScreen f136268b;

            {
                this.f136268b = this;
            }

            /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                ReviewProductDetailsScreen reviewProductDetailsScreen = this.f136268b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ReviewProductDetailsScreen.f83283b0;
                        return (w) ((rlb.c) reviewProductDetailsScreen.L.getValue()).v.get();
                    case 1:
                        KProperty[] kPropertyArr2 = ReviewProductDetailsScreen.f83283b0;
                        return reviewProductDetailsScreen.d3().f307105c;
                    case 2:
                        KProperty[] kPropertyArr3 = ReviewProductDetailsScreen.f83283b0;
                        return reviewProductDetailsScreen.d3().f307104b;
                    case 3:
                        KProperty[] kPropertyArr4 = ReviewProductDetailsScreen.f83283b0;
                        return reviewProductDetailsScreen.d3().d;
                    case 4:
                        KProperty[] kPropertyArr5 = ReviewProductDetailsScreen.f83283b0;
                        return (j60.a) ((rlb.c) reviewProductDetailsScreen.L.getValue()).f254957j.get();
                    default:
                        KProperty[] kPropertyArr6 = ReviewProductDetailsScreen.f83283b0;
                        ReviewProductDetailsScreen reviewProductDetailsScreen2 = this.f136268b;
                        return dli.f.a(reviewProductDetailsScreen2, reviewProductDetailsScreen2.R2(), zhm.v.k(new ListSubheaderDelegate(), new BigTileLoadingDelegate(), reviewProductDetailsScreen2.S, reviewProductDetailsScreen2.T, reviewProductDetailsScreen2.R, reviewProductDetailsScreen2.V, new RowLoadingDelegate(), new CellDetailsLoadingDelegate(), new ListSubheaderLoadingDelegate(), new PlainTextWarningDelegate(), reviewProductDetailsScreen2.U), R$id.reviewProductDetails_recyclerView, null, null, null, 56);
                }
            }
        });
        this.R = new InputChecklistDelegate();
        this.S = new RowDelegate(null, null, 7);
        this.T = new ListCellDelegate();
        this.U = new FullScreenStateDelegate();
        this.V = new TextDelegate();
        this.W = new CellDetailsDelegate();
        this.X = new LargeActionButtonDelegate();
        final int i6 = 4;
        this.Y = w.y0(new Function0(this) { // from class: fmb.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReviewProductDetailsScreen f136268b;

            {
                this.f136268b = this;
            }

            /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                ReviewProductDetailsScreen reviewProductDetailsScreen = this.f136268b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ReviewProductDetailsScreen.f83283b0;
                        return (w) ((rlb.c) reviewProductDetailsScreen.L.getValue()).v.get();
                    case 1:
                        KProperty[] kPropertyArr2 = ReviewProductDetailsScreen.f83283b0;
                        return reviewProductDetailsScreen.d3().f307105c;
                    case 2:
                        KProperty[] kPropertyArr3 = ReviewProductDetailsScreen.f83283b0;
                        return reviewProductDetailsScreen.d3().f307104b;
                    case 3:
                        KProperty[] kPropertyArr4 = ReviewProductDetailsScreen.f83283b0;
                        return reviewProductDetailsScreen.d3().d;
                    case 4:
                        KProperty[] kPropertyArr5 = ReviewProductDetailsScreen.f83283b0;
                        return (j60.a) ((rlb.c) reviewProductDetailsScreen.L.getValue()).f254957j.get();
                    default:
                        KProperty[] kPropertyArr6 = ReviewProductDetailsScreen.f83283b0;
                        ReviewProductDetailsScreen reviewProductDetailsScreen2 = this.f136268b;
                        return dli.f.a(reviewProductDetailsScreen2, reviewProductDetailsScreen2.R2(), zhm.v.k(new ListSubheaderDelegate(), new BigTileLoadingDelegate(), reviewProductDetailsScreen2.S, reviewProductDetailsScreen2.T, reviewProductDetailsScreen2.R, reviewProductDetailsScreen2.V, new RowLoadingDelegate(), new CellDetailsLoadingDelegate(), new ListSubheaderLoadingDelegate(), new PlainTextWarningDelegate(), reviewProductDetailsScreen2.U), R$id.reviewProductDetails_recyclerView, null, null, null, 56);
                }
            }
        });
        this.Z = new AnalyticsContext(e.d(IdContext.newBuilder(), input.f83287a.f86683a.f86617a, AnalyticsContext.INSTANCE));
        final int i21 = 5;
        this.f83284a0 = w.y0(new Function0(this) { // from class: fmb.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReviewProductDetailsScreen f136268b;

            {
                this.f136268b = this;
            }

            /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i21;
                ReviewProductDetailsScreen reviewProductDetailsScreen = this.f136268b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ReviewProductDetailsScreen.f83283b0;
                        return (w) ((rlb.c) reviewProductDetailsScreen.L.getValue()).v.get();
                    case 1:
                        KProperty[] kPropertyArr2 = ReviewProductDetailsScreen.f83283b0;
                        return reviewProductDetailsScreen.d3().f307105c;
                    case 2:
                        KProperty[] kPropertyArr3 = ReviewProductDetailsScreen.f83283b0;
                        return reviewProductDetailsScreen.d3().f307104b;
                    case 3:
                        KProperty[] kPropertyArr4 = ReviewProductDetailsScreen.f83283b0;
                        return reviewProductDetailsScreen.d3().d;
                    case 4:
                        KProperty[] kPropertyArr5 = ReviewProductDetailsScreen.f83283b0;
                        return (j60.a) ((rlb.c) reviewProductDetailsScreen.L.getValue()).f254957j.get();
                    default:
                        KProperty[] kPropertyArr6 = ReviewProductDetailsScreen.f83283b0;
                        ReviewProductDetailsScreen reviewProductDetailsScreen2 = this.f136268b;
                        return dli.f.a(reviewProductDetailsScreen2, reviewProductDetailsScreen2.R2(), zhm.v.k(new ListSubheaderDelegate(), new BigTileLoadingDelegate(), reviewProductDetailsScreen2.S, reviewProductDetailsScreen2.T, reviewProductDetailsScreen2.R, reviewProductDetailsScreen2.V, new RowLoadingDelegate(), new CellDetailsLoadingDelegate(), new ListSubheaderLoadingDelegate(), new PlainTextWarningDelegate(), reviewProductDetailsScreen2.U), R$id.reviewProductDetails_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(o oVar, q qVar) {
        m0 uiState = (m0) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) this.O.getValue();
        v vVar = uiState.f136283b;
        if (vVar instanceof fmb.s) {
            navBarWithToolbar.setTitleClickable(true);
            y yVar = ((fmb.s) vVar).f136300a;
            TextLocalisedClause textLocalisedClause = yVar.f136312a;
            Clause clause = yVar.f136313b;
            if (clause != null) {
                navBarWithToolbar.setTitle(new d0(clause, textLocalisedClause));
            } else {
                navBarWithToolbar.setTitle(textLocalisedClause, null);
            }
            navBarWithToolbar.setToolbarTitle(yVar.f);
            navBarWithToolbar.setTitleChevronIcon(yVar.d);
            navBarWithToolbar.setSecondDescriptionVisible(false);
            navBarWithToolbar.setDescriptionVisible(true);
            navBarWithToolbar.setDescriptionText(yVar.f136314c);
            navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
            navBarWithToolbar.setEndIconImage(yVar.e);
            navBarWithToolbar.l0();
        } else if (vVar instanceof t) {
            navBarWithToolbar.setTitle(((t) vVar).f136302a, null);
            navBarWithToolbar.l0();
        } else {
            if (!(vVar instanceof u)) {
                throw new NoWhenBranchMatchedException();
            }
            t3 t3Var = t3.PROFILE;
            NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
            navBarWithToolbar.I0(t3Var, false);
        }
        CollapsingActionButton collapsingActionButtonE3 = e3();
        fmb.q qVar2 = uiState.f136284c;
        if (qVar2 instanceof n) {
            collapsingActionButtonE3.setVisibility(0);
            n nVar = (n) qVar2;
            collapsingActionButtonE3.setLargeButtonEnabled(nVar.f136286b);
            collapsingActionButtonE3.setLargeButtonText(nVar.f136285a);
            return;
        }
        if (!(qVar2 instanceof fmb.o) && !(qVar2 instanceof p)) {
            throw new NoWhenBranchMatchedException();
        }
        collapsingActionButtonE3.setVisibility(8);
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.Z = analyticsContext;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (c) this.L.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getZ() {
        return this.Z;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void W2(int i, int i2, Intent intent) {
        b bVar = (b) R2();
        bVar.getClass();
        if (i == 222789 && i2 == -1) {
            bVar.N2();
        }
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        pd.b.p(view, new TextLocalisedClause(R$string.savings_onboarding_product_review, null, null, 14));
        ((NavBarWithToolbar) this.O.getValue()).setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        ((j60.a) this.Y.getValue()).d(zhm.v.k(this.W, this.X));
        ((ScreenContentRecyclerView) this.Q.getValue()).setTag(com.revolut.core.ui_kit.R$id.uikit_main_scrollable_view, "MAIN_SCROLLABLE_TAG");
        e3().setLoadingButtonTag("REVIEW_PRODUCT_DETAILS_LOADING_CTA_TAG");
        e3().setCollapsible(true);
        e3().setFabStyle(FormsActionButton.a.C0442a.f58988a);
        e3().setFabImage(new ResourceImage(R$drawable.uikit_icn_24_arrow_thin_down, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246));
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ?? r122 = this.O;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((NavBarWithToolbar) r122.getValue()).f59410q), null, new i(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((NavBarWithToolbar) r122.getValue()).B0()), null, new i(this, null, 1), 3);
        InputChecklistDelegate inputChecklistDelegate = this.R;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(inputChecklistDelegate.f52518c), null, new fmb.j(2, 4, fmb.w.class, R2(), "onInputChecklistClick", "onInputChecklistClick(Lcom/revolut/core/ui_kit/delegates/InputChecklistDelegate$Model;)V"), 3);
        r rVarMerge = r.merge(this.S.f53218h, this.U.f52371h.f121375b, this.W.d, this.X.d.f121375b);
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarMerge), null, new fmb.k(this, null, 0), 3);
        r rVarMerge2 = r.merge(this.V.d, inputChecklistDelegate.p());
        Intrinsics.checkNotNullExpressionValue(rVarMerge2, "merge(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarMerge2), null, new fmb.k(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(e3().c()), null, new i(this, null, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(e3().d()), null, new l(this, null), 3);
    }

    public final d d3() {
        ViewBinding value = this.N.getValue(this, f83283b0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (d) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final CollapsingActionButton e3() {
        return (CollapsingActionButton) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: f3, reason: merged with bridge method [inline-methods] */
    public final fmb.w R2() {
        return (fmb.w) this.K.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.f83284a0.getValue();
    }
}
