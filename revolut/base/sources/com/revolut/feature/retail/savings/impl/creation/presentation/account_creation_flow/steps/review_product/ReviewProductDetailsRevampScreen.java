package com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product;

import android.content.Intent;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.BigTileLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HighlightTileDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.CollapsingActionButton;
import com.revolut.core.ui_kit.views.buttons.FormsActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarLargeCentred;
import com.revolut.core.ui_kit.views.navbar.l;
import com.revolut.core.ui_kit.views.navbar.m;
import com.revolut.core.ui_kit.views.navbar.n;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.retail.savings.api.R$string;
import com.revolut.feature.retail.savings.impl.R$id;
import com.revolut.feature.retail.savings.impl.R$layout;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.ReviewProductDetailsRevampScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.tracking.v3.IdContext;
import efm.r;
import fb6.j;
import fmb.d;
import fmb.f0;
import fmb.m0;
import fmb.p;
import fmb.t;
import fmb.u;
import fmb.v;
import fmb.x;
import fmb.y;
import ihm.f;
import java.util.List;
import kii.e;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.k;
import rlb.c;
import te0.w;
import tx0.u1;
import tx0.x1;
import vc.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/steps/review_product/ReviewProductDetailsRevampScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lfmb/f0;", "Ldli/a;", "Lfmb/m0;", "Lno/k;", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ReviewProductDetailsRevampScreen extends ViewController<f0> implements dli.a, k {
    public static final /* synthetic */ KProperty[] c0 = {o0.f186429a.j(new h0(ReviewProductDetailsRevampScreen.class, "binding", "getBinding()Lcom/revolut/feature/retail/savings/impl/databinding/ScreenRevampReviewProductDetailsBinding;", 0))};
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
    public final HighlightTileDelegate Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public AnalyticsContext f83281a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f83282b0;

    public ReviewProductDetailsRevampScreen(ReviewProductDetailsScreenContract$InputData input) {
        Intrinsics.checkNotNullParameter(input, "input");
        final int i = 0;
        this.K = w.y0(new Function0(this) { // from class: fmb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReviewProductDetailsRevampScreen f136256b;

            {
                this.f136256b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ReviewProductDetailsRevampScreen reviewProductDetailsRevampScreen = this.f136256b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ReviewProductDetailsRevampScreen.c0;
                        return (w) ((rlb.c) reviewProductDetailsRevampScreen.L.getValue()).v.get();
                    case 1:
                        KProperty[] kPropertyArr2 = ReviewProductDetailsRevampScreen.c0;
                        return reviewProductDetailsRevampScreen.d3().f307102c;
                    case 2:
                        KProperty[] kPropertyArr3 = ReviewProductDetailsRevampScreen.c0;
                        return reviewProductDetailsRevampScreen.d3().f307101b;
                    case 3:
                        KProperty[] kPropertyArr4 = ReviewProductDetailsRevampScreen.c0;
                        return reviewProductDetailsRevampScreen.d3().d;
                    case 4:
                        KProperty[] kPropertyArr5 = ReviewProductDetailsRevampScreen.c0;
                        return (j60.a) ((rlb.c) reviewProductDetailsRevampScreen.L.getValue()).f254957j.get();
                    default:
                        KProperty[] kPropertyArr6 = ReviewProductDetailsRevampScreen.c0;
                        ReviewProductDetailsRevampScreen reviewProductDetailsRevampScreen2 = this.f136256b;
                        return dli.f.a(reviewProductDetailsRevampScreen2, reviewProductDetailsRevampScreen2.R2(), zhm.v.k(new ListSubheaderDelegate(), new BigTileLoadingDelegate(), reviewProductDetailsRevampScreen2.S, reviewProductDetailsRevampScreen2.T, reviewProductDetailsRevampScreen2.W, reviewProductDetailsRevampScreen2.R, reviewProductDetailsRevampScreen2.V, new RowLoadingDelegate(), new CellDetailsLoadingDelegate(), new ListSubheaderLoadingDelegate(), new PlainTextWarningDelegate(), reviewProductDetailsRevampScreen2.U, reviewProductDetailsRevampScreen2.Y), R$id.reviewProductDetails_recyclerView, null, null, null, 56);
                }
            }
        });
        this.L = w.y0(new j(this, input, 13));
        this.M = R$layout.screen_revamp_review_product_details;
        this.N = s.t(this, fmb.b.f);
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: fmb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReviewProductDetailsRevampScreen f136256b;

            {
                this.f136256b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ReviewProductDetailsRevampScreen reviewProductDetailsRevampScreen = this.f136256b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ReviewProductDetailsRevampScreen.c0;
                        return (w) ((rlb.c) reviewProductDetailsRevampScreen.L.getValue()).v.get();
                    case 1:
                        KProperty[] kPropertyArr2 = ReviewProductDetailsRevampScreen.c0;
                        return reviewProductDetailsRevampScreen.d3().f307102c;
                    case 2:
                        KProperty[] kPropertyArr3 = ReviewProductDetailsRevampScreen.c0;
                        return reviewProductDetailsRevampScreen.d3().f307101b;
                    case 3:
                        KProperty[] kPropertyArr4 = ReviewProductDetailsRevampScreen.c0;
                        return reviewProductDetailsRevampScreen.d3().d;
                    case 4:
                        KProperty[] kPropertyArr5 = ReviewProductDetailsRevampScreen.c0;
                        return (j60.a) ((rlb.c) reviewProductDetailsRevampScreen.L.getValue()).f254957j.get();
                    default:
                        KProperty[] kPropertyArr6 = ReviewProductDetailsRevampScreen.c0;
                        ReviewProductDetailsRevampScreen reviewProductDetailsRevampScreen2 = this.f136256b;
                        return dli.f.a(reviewProductDetailsRevampScreen2, reviewProductDetailsRevampScreen2.R2(), zhm.v.k(new ListSubheaderDelegate(), new BigTileLoadingDelegate(), reviewProductDetailsRevampScreen2.S, reviewProductDetailsRevampScreen2.T, reviewProductDetailsRevampScreen2.W, reviewProductDetailsRevampScreen2.R, reviewProductDetailsRevampScreen2.V, new RowLoadingDelegate(), new CellDetailsLoadingDelegate(), new ListSubheaderLoadingDelegate(), new PlainTextWarningDelegate(), reviewProductDetailsRevampScreen2.U, reviewProductDetailsRevampScreen2.Y), R$id.reviewProductDetails_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: fmb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReviewProductDetailsRevampScreen f136256b;

            {
                this.f136256b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ReviewProductDetailsRevampScreen reviewProductDetailsRevampScreen = this.f136256b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ReviewProductDetailsRevampScreen.c0;
                        return (w) ((rlb.c) reviewProductDetailsRevampScreen.L.getValue()).v.get();
                    case 1:
                        KProperty[] kPropertyArr2 = ReviewProductDetailsRevampScreen.c0;
                        return reviewProductDetailsRevampScreen.d3().f307102c;
                    case 2:
                        KProperty[] kPropertyArr3 = ReviewProductDetailsRevampScreen.c0;
                        return reviewProductDetailsRevampScreen.d3().f307101b;
                    case 3:
                        KProperty[] kPropertyArr4 = ReviewProductDetailsRevampScreen.c0;
                        return reviewProductDetailsRevampScreen.d3().d;
                    case 4:
                        KProperty[] kPropertyArr5 = ReviewProductDetailsRevampScreen.c0;
                        return (j60.a) ((rlb.c) reviewProductDetailsRevampScreen.L.getValue()).f254957j.get();
                    default:
                        KProperty[] kPropertyArr6 = ReviewProductDetailsRevampScreen.c0;
                        ReviewProductDetailsRevampScreen reviewProductDetailsRevampScreen2 = this.f136256b;
                        return dli.f.a(reviewProductDetailsRevampScreen2, reviewProductDetailsRevampScreen2.R2(), zhm.v.k(new ListSubheaderDelegate(), new BigTileLoadingDelegate(), reviewProductDetailsRevampScreen2.S, reviewProductDetailsRevampScreen2.T, reviewProductDetailsRevampScreen2.W, reviewProductDetailsRevampScreen2.R, reviewProductDetailsRevampScreen2.V, new RowLoadingDelegate(), new CellDetailsLoadingDelegate(), new ListSubheaderLoadingDelegate(), new PlainTextWarningDelegate(), reviewProductDetailsRevampScreen2.U, reviewProductDetailsRevampScreen2.Y), R$id.reviewProductDetails_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i5 = 3;
        this.Q = w.y0(new Function0(this) { // from class: fmb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReviewProductDetailsRevampScreen f136256b;

            {
                this.f136256b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                ReviewProductDetailsRevampScreen reviewProductDetailsRevampScreen = this.f136256b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ReviewProductDetailsRevampScreen.c0;
                        return (w) ((rlb.c) reviewProductDetailsRevampScreen.L.getValue()).v.get();
                    case 1:
                        KProperty[] kPropertyArr2 = ReviewProductDetailsRevampScreen.c0;
                        return reviewProductDetailsRevampScreen.d3().f307102c;
                    case 2:
                        KProperty[] kPropertyArr3 = ReviewProductDetailsRevampScreen.c0;
                        return reviewProductDetailsRevampScreen.d3().f307101b;
                    case 3:
                        KProperty[] kPropertyArr4 = ReviewProductDetailsRevampScreen.c0;
                        return reviewProductDetailsRevampScreen.d3().d;
                    case 4:
                        KProperty[] kPropertyArr5 = ReviewProductDetailsRevampScreen.c0;
                        return (j60.a) ((rlb.c) reviewProductDetailsRevampScreen.L.getValue()).f254957j.get();
                    default:
                        KProperty[] kPropertyArr6 = ReviewProductDetailsRevampScreen.c0;
                        ReviewProductDetailsRevampScreen reviewProductDetailsRevampScreen2 = this.f136256b;
                        return dli.f.a(reviewProductDetailsRevampScreen2, reviewProductDetailsRevampScreen2.R2(), zhm.v.k(new ListSubheaderDelegate(), new BigTileLoadingDelegate(), reviewProductDetailsRevampScreen2.S, reviewProductDetailsRevampScreen2.T, reviewProductDetailsRevampScreen2.W, reviewProductDetailsRevampScreen2.R, reviewProductDetailsRevampScreen2.V, new RowLoadingDelegate(), new CellDetailsLoadingDelegate(), new ListSubheaderLoadingDelegate(), new PlainTextWarningDelegate(), reviewProductDetailsRevampScreen2.U, reviewProductDetailsRevampScreen2.Y), R$id.reviewProductDetails_recyclerView, null, null, null, 56);
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
        this.Y = new HighlightTileDelegate();
        final int i6 = 4;
        this.Z = w.y0(new Function0(this) { // from class: fmb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReviewProductDetailsRevampScreen f136256b;

            {
                this.f136256b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                ReviewProductDetailsRevampScreen reviewProductDetailsRevampScreen = this.f136256b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ReviewProductDetailsRevampScreen.c0;
                        return (w) ((rlb.c) reviewProductDetailsRevampScreen.L.getValue()).v.get();
                    case 1:
                        KProperty[] kPropertyArr2 = ReviewProductDetailsRevampScreen.c0;
                        return reviewProductDetailsRevampScreen.d3().f307102c;
                    case 2:
                        KProperty[] kPropertyArr3 = ReviewProductDetailsRevampScreen.c0;
                        return reviewProductDetailsRevampScreen.d3().f307101b;
                    case 3:
                        KProperty[] kPropertyArr4 = ReviewProductDetailsRevampScreen.c0;
                        return reviewProductDetailsRevampScreen.d3().d;
                    case 4:
                        KProperty[] kPropertyArr5 = ReviewProductDetailsRevampScreen.c0;
                        return (j60.a) ((rlb.c) reviewProductDetailsRevampScreen.L.getValue()).f254957j.get();
                    default:
                        KProperty[] kPropertyArr6 = ReviewProductDetailsRevampScreen.c0;
                        ReviewProductDetailsRevampScreen reviewProductDetailsRevampScreen2 = this.f136256b;
                        return dli.f.a(reviewProductDetailsRevampScreen2, reviewProductDetailsRevampScreen2.R2(), zhm.v.k(new ListSubheaderDelegate(), new BigTileLoadingDelegate(), reviewProductDetailsRevampScreen2.S, reviewProductDetailsRevampScreen2.T, reviewProductDetailsRevampScreen2.W, reviewProductDetailsRevampScreen2.R, reviewProductDetailsRevampScreen2.V, new RowLoadingDelegate(), new CellDetailsLoadingDelegate(), new ListSubheaderLoadingDelegate(), new PlainTextWarningDelegate(), reviewProductDetailsRevampScreen2.U, reviewProductDetailsRevampScreen2.Y), R$id.reviewProductDetails_recyclerView, null, null, null, 56);
                }
            }
        });
        this.f83281a0 = new AnalyticsContext(e.d(IdContext.newBuilder(), input.f83287a.f86683a.f86617a, AnalyticsContext.INSTANCE));
        final int i21 = 5;
        this.f83282b0 = w.y0(new Function0(this) { // from class: fmb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReviewProductDetailsRevampScreen f136256b;

            {
                this.f136256b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i21;
                ReviewProductDetailsRevampScreen reviewProductDetailsRevampScreen = this.f136256b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ReviewProductDetailsRevampScreen.c0;
                        return (w) ((rlb.c) reviewProductDetailsRevampScreen.L.getValue()).v.get();
                    case 1:
                        KProperty[] kPropertyArr2 = ReviewProductDetailsRevampScreen.c0;
                        return reviewProductDetailsRevampScreen.d3().f307102c;
                    case 2:
                        KProperty[] kPropertyArr3 = ReviewProductDetailsRevampScreen.c0;
                        return reviewProductDetailsRevampScreen.d3().f307101b;
                    case 3:
                        KProperty[] kPropertyArr4 = ReviewProductDetailsRevampScreen.c0;
                        return reviewProductDetailsRevampScreen.d3().d;
                    case 4:
                        KProperty[] kPropertyArr5 = ReviewProductDetailsRevampScreen.c0;
                        return (j60.a) ((rlb.c) reviewProductDetailsRevampScreen.L.getValue()).f254957j.get();
                    default:
                        KProperty[] kPropertyArr6 = ReviewProductDetailsRevampScreen.c0;
                        ReviewProductDetailsRevampScreen reviewProductDetailsRevampScreen2 = this.f136256b;
                        return dli.f.a(reviewProductDetailsRevampScreen2, reviewProductDetailsRevampScreen2.R2(), zhm.v.k(new ListSubheaderDelegate(), new BigTileLoadingDelegate(), reviewProductDetailsRevampScreen2.S, reviewProductDetailsRevampScreen2.T, reviewProductDetailsRevampScreen2.W, reviewProductDetailsRevampScreen2.R, reviewProductDetailsRevampScreen2.V, new RowLoadingDelegate(), new CellDetailsLoadingDelegate(), new ListSubheaderLoadingDelegate(), new PlainTextWarningDelegate(), reviewProductDetailsRevampScreen2.U, reviewProductDetailsRevampScreen2.Y), R$id.reviewProductDetails_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(o oVar, q qVar) {
        TagViewData tagViewData;
        m0 uiState = (m0) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarLargeCentred navBarLargeCentred = (NavBarLargeCentred) this.O.getValue();
        NavBarLargeCentred.Model model = new NavBarLargeCentred.Model(null, null, null, null, new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 991);
        navBarLargeCentred.setModel(model);
        v vVar = uiState.f136283b;
        if (vVar instanceof fmb.s) {
            y yVar = ((fmb.s) vVar).f136300a;
            TextLocalisedClause textLocalisedClause = yVar.f136312a;
            Clause clause = yVar.f136313b;
            m kVar = clause != null ? new com.revolut.core.ui_kit.views.navbar.k(textLocalisedClause, clause, x1.LARGE) : new l(textLocalisedClause, x1.LARGE);
            x xVar = yVar.f136316h;
            if (xVar != null) {
                TagViewData.Companion companion = TagViewData.INSTANCE;
                Clause clause2 = xVar.f136309a;
                ResourceImage resourceImage = xVar.f136310b;
                int i = R$attr.uikit_colorAccentNeutral;
                companion.getClass();
                tagViewData = new TagViewData(resourceImage, clause2, new TagViewData.TagBackground.Solid(new Color.Solid(R$attr.uikit_colorTransparent)), null, new TagViewData.TagOutline.Solid(i), false, null, null, null, i, null, 1512);
            } else {
                tagViewData = null;
            }
            navBarLargeCentred.B();
            TextLocalisedClause textLocalisedClause2 = yVar.f;
            n nVar = null;
            Clause clause3 = yVar.f136314c;
            m mVar = kVar;
            Clause clause4 = yVar.i;
            Clause clause5 = yVar.f136315g;
            if (clause5 != null) {
                nVar = new n(clause5);
            }
            navBarLargeCentred.setModel(NavBarLargeCentred.Model.a(model, mVar, textLocalisedClause2, clause3, clause4, nVar, null, tagViewData, 928));
        } else if (vVar instanceof t) {
            navBarLargeCentred.B();
            navBarLargeCentred.setModel(NavBarLargeCentred.Model.a(model, new l(((t) vVar).f136302a, x1.LARGE), null, null, null, null, null, null, 1022));
        } else {
            if (!(vVar instanceof u)) {
                throw new NoWhenBranchMatchedException();
            }
            navBarLargeCentred.H(u1.DEFAULT);
        }
        CollapsingActionButton collapsingActionButtonE3 = e3();
        fmb.q qVar2 = uiState.f136284c;
        if (!(qVar2 instanceof fmb.n)) {
            if (!(qVar2 instanceof fmb.o) && !(qVar2 instanceof p)) {
                throw new NoWhenBranchMatchedException();
            }
            collapsingActionButtonE3.setVisibility(8);
            return;
        }
        fmb.n nVar2 = (fmb.n) qVar2;
        collapsingActionButtonE3.setCollapsible(nVar2.f136287c);
        collapsingActionButtonE3.setVisibility(0);
        collapsingActionButtonE3.setLargeButtonEnabled(nVar2.f136286b);
        collapsingActionButtonE3.setLargeButtonText(nVar2.f136285a);
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.f83281a0 = analyticsContext;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (c) this.L.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getF83281a0() {
        return this.f83281a0;
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
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        pd.b.p(view, new TextLocalisedClause(R$string.savings_onboarding_product_details_review, null, null, 14));
        ((j60.a) this.Z.getValue()).d(zhm.v.k(this.W, this.X));
        ((ScreenContentRecyclerView) this.Q.getValue()).setTag(com.revolut.core.ui_kit.R$id.uikit_main_scrollable_view, "MAIN_SCROLLABLE_TAG");
        e3().setLoadingButtonTag("REVIEW_PRODUCT_DETAILS_LOADING_CTA_TAG");
        e3().setFabStyle(FormsActionButton.a.C0442a.f58988a);
        e3().setFabImage(new ResourceImage(R$drawable.uikit_icn_24_arrow_thin_down, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246));
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ?? r132 = this.O;
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((NavBarLargeCentred) r132.getValue()).f59292m), null, new fmb.c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((NavBarLargeCentred) r132.getValue()).D()), null, new d(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((NavBarLargeCentred) r132.getValue()).u), null, new fmb.c(this, null, 1), 3);
        InputChecklistDelegate inputChecklistDelegate = this.R;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(inputChecklistDelegate.f52518c), null, new fmb.e(2, 4, fmb.w.class, R2(), "onInputChecklistClick", "onInputChecklistClick(Lcom/revolut/core/ui_kit/delegates/InputChecklistDelegate$Model;)V"), 3);
        f fVar = this.S.f53218h;
        f fVar2 = this.U.f52371h.f121375b;
        CellDetailsDelegate cellDetailsDelegate = this.W;
        r rVarMergeArray = r.mergeArray(fVar, fVar2, cellDetailsDelegate.d, cellDetailsDelegate.f, this.X.d.f121375b, this.Y.f52437c);
        Intrinsics.checkNotNullExpressionValue(rVarMergeArray, "mergeArray(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarMergeArray), null, new d(this, continuation, 1), 3);
        r rVarMerge = r.merge(this.V.d, inputChecklistDelegate.p());
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarMerge), null, new d(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(e3().c()), null, new fmb.c(this, null, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(e3().d()), null, new fmb.f(this, null), 3);
    }

    public final xmb.c d3() {
        ViewBinding value = this.N.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (xmb.c) value;
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
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.f83282b0.getValue();
    }
}
