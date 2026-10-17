package com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_product_selection;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager2.widget.ViewPager2;
import ao.h;
import aw0.g;
import aw0.n6;
import cli.a0;
import cli.o;
import cli.q;
import cli.w;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.ContainerDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.DraggableTabsView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.retail.savings.impl.R$layout;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_product_selection.SavingsProductSelectionScreen;
import com.revolut.feature.vaults.R$string;
import com.revolut.kompot.navigable.vc.ViewController;
import es0.r;
import h30.l;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.k;
import p0l.d;
import pe2.c;
import pmb.e;
import pmb.f;
import pmb.i;
import pmb.m;
import pmb.n;
import pmb.p;
import tx0.j0;
import vc.s;
import vlb.b;
import z4l.j;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/steps/savings_product_selection/SavingsProductSelectionScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lpmb/e;", "Lcli/w;", "Lpmb/i;", "Lno/k;", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SavingsProductSelectionScreen extends ViewController<e> implements w, k {
    public static final /* synthetic */ KProperty[] Y = {o0.f186429a.j(new h0(SavingsProductSelectionScreen.class, "binding", "getBinding()Lcom/revolut/feature/retail/savings/impl/databinding/ScreenSavingsProductSelectionBinding;", 0))};
    public final RowDelegate K;
    public final FullScreenStateDelegate L;
    public final LargeActionButtonDelegate M;
    public final h N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public AnalyticsContext R;
    public final Object S;
    public final n T;
    public final Object U;
    public final Object V;
    public final Object W;
    public final int X;

    public SavingsProductSelectionScreen(SavingsProductSelectionContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = new RowDelegate(null, null, 7);
        this.L = new FullScreenStateDelegate();
        this.M = new LargeActionButtonDelegate();
        this.N = s.t(this, m.f);
        final int i = 0;
        this.O = te0.w.y0(new Function0(this) { // from class: pmb.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SavingsProductSelectionScreen f237542b;

            {
                this.f237542b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SavingsProductSelectionScreen savingsProductSelectionScreen = this.f237542b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SavingsProductSelectionScreen.Y;
                        return savingsProductSelectionScreen.d3().e;
                    case 1:
                        KProperty[] kPropertyArr2 = SavingsProductSelectionScreen.Y;
                        return savingsProductSelectionScreen.d3().d;
                    case 2:
                        KProperty[] kPropertyArr3 = SavingsProductSelectionScreen.Y;
                        return (j60.a) ((rlb.j) savingsProductSelectionScreen.U.getValue()).f255003g.get();
                    case 3:
                        KProperty[] kPropertyArr4 = SavingsProductSelectionScreen.Y;
                        return new z4l.j(7, u.c(new ContainerDelegate(v.k(new RowLoadingDelegate(), savingsProductSelectionScreen.L, savingsProductSelectionScreen.K, new ListSubheaderDelegate()), null, 6)), false);
                    case 4:
                        KProperty[] kPropertyArr5 = SavingsProductSelectionScreen.Y;
                        return (g) ((rlb.j) savingsProductSelectionScreen.U.getValue()).f255005j.get();
                    default:
                        KProperty[] kPropertyArr6 = SavingsProductSelectionScreen.Y;
                        return n14.e.a(savingsProductSelectionScreen, savingsProductSelectionScreen.R2());
                }
            }
        });
        final int i2 = 1;
        this.P = te0.w.y0(new Function0(this) { // from class: pmb.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SavingsProductSelectionScreen f237542b;

            {
                this.f237542b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SavingsProductSelectionScreen savingsProductSelectionScreen = this.f237542b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SavingsProductSelectionScreen.Y;
                        return savingsProductSelectionScreen.d3().e;
                    case 1:
                        KProperty[] kPropertyArr2 = SavingsProductSelectionScreen.Y;
                        return savingsProductSelectionScreen.d3().d;
                    case 2:
                        KProperty[] kPropertyArr3 = SavingsProductSelectionScreen.Y;
                        return (j60.a) ((rlb.j) savingsProductSelectionScreen.U.getValue()).f255003g.get();
                    case 3:
                        KProperty[] kPropertyArr4 = SavingsProductSelectionScreen.Y;
                        return new z4l.j(7, u.c(new ContainerDelegate(v.k(new RowLoadingDelegate(), savingsProductSelectionScreen.L, savingsProductSelectionScreen.K, new ListSubheaderDelegate()), null, 6)), false);
                    case 4:
                        KProperty[] kPropertyArr5 = SavingsProductSelectionScreen.Y;
                        return (g) ((rlb.j) savingsProductSelectionScreen.U.getValue()).f255005j.get();
                    default:
                        KProperty[] kPropertyArr6 = SavingsProductSelectionScreen.Y;
                        return n14.e.a(savingsProductSelectionScreen, savingsProductSelectionScreen.R2());
                }
            }
        });
        final int i3 = 2;
        this.Q = te0.w.y0(new Function0(this) { // from class: pmb.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SavingsProductSelectionScreen f237542b;

            {
                this.f237542b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SavingsProductSelectionScreen savingsProductSelectionScreen = this.f237542b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SavingsProductSelectionScreen.Y;
                        return savingsProductSelectionScreen.d3().e;
                    case 1:
                        KProperty[] kPropertyArr2 = SavingsProductSelectionScreen.Y;
                        return savingsProductSelectionScreen.d3().d;
                    case 2:
                        KProperty[] kPropertyArr3 = SavingsProductSelectionScreen.Y;
                        return (j60.a) ((rlb.j) savingsProductSelectionScreen.U.getValue()).f255003g.get();
                    case 3:
                        KProperty[] kPropertyArr4 = SavingsProductSelectionScreen.Y;
                        return new z4l.j(7, u.c(new ContainerDelegate(v.k(new RowLoadingDelegate(), savingsProductSelectionScreen.L, savingsProductSelectionScreen.K, new ListSubheaderDelegate()), null, 6)), false);
                    case 4:
                        KProperty[] kPropertyArr5 = SavingsProductSelectionScreen.Y;
                        return (g) ((rlb.j) savingsProductSelectionScreen.U.getValue()).f255005j.get();
                    default:
                        KProperty[] kPropertyArr6 = SavingsProductSelectionScreen.Y;
                        return n14.e.a(savingsProductSelectionScreen, savingsProductSelectionScreen.R2());
                }
            }
        });
        this.R = new AnalyticsContext(b.a(inputData.f83327a));
        final int i5 = 3;
        this.S = te0.w.y0(new Function0(this) { // from class: pmb.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SavingsProductSelectionScreen f237542b;

            {
                this.f237542b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                SavingsProductSelectionScreen savingsProductSelectionScreen = this.f237542b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SavingsProductSelectionScreen.Y;
                        return savingsProductSelectionScreen.d3().e;
                    case 1:
                        KProperty[] kPropertyArr2 = SavingsProductSelectionScreen.Y;
                        return savingsProductSelectionScreen.d3().d;
                    case 2:
                        KProperty[] kPropertyArr3 = SavingsProductSelectionScreen.Y;
                        return (j60.a) ((rlb.j) savingsProductSelectionScreen.U.getValue()).f255003g.get();
                    case 3:
                        KProperty[] kPropertyArr4 = SavingsProductSelectionScreen.Y;
                        return new z4l.j(7, u.c(new ContainerDelegate(v.k(new RowLoadingDelegate(), savingsProductSelectionScreen.L, savingsProductSelectionScreen.K, new ListSubheaderDelegate()), null, 6)), false);
                    case 4:
                        KProperty[] kPropertyArr5 = SavingsProductSelectionScreen.Y;
                        return (g) ((rlb.j) savingsProductSelectionScreen.U.getValue()).f255005j.get();
                    default:
                        KProperty[] kPropertyArr6 = SavingsProductSelectionScreen.Y;
                        return n14.e.a(savingsProductSelectionScreen, savingsProductSelectionScreen.R2());
                }
            }
        });
        this.T = new n(this);
        this.U = te0.w.y0(new c(this, inputData, 13));
        final int i6 = 4;
        this.V = te0.w.y0(new Function0(this) { // from class: pmb.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SavingsProductSelectionScreen f237542b;

            {
                this.f237542b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                SavingsProductSelectionScreen savingsProductSelectionScreen = this.f237542b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SavingsProductSelectionScreen.Y;
                        return savingsProductSelectionScreen.d3().e;
                    case 1:
                        KProperty[] kPropertyArr2 = SavingsProductSelectionScreen.Y;
                        return savingsProductSelectionScreen.d3().d;
                    case 2:
                        KProperty[] kPropertyArr3 = SavingsProductSelectionScreen.Y;
                        return (j60.a) ((rlb.j) savingsProductSelectionScreen.U.getValue()).f255003g.get();
                    case 3:
                        KProperty[] kPropertyArr4 = SavingsProductSelectionScreen.Y;
                        return new z4l.j(7, u.c(new ContainerDelegate(v.k(new RowLoadingDelegate(), savingsProductSelectionScreen.L, savingsProductSelectionScreen.K, new ListSubheaderDelegate()), null, 6)), false);
                    case 4:
                        KProperty[] kPropertyArr5 = SavingsProductSelectionScreen.Y;
                        return (g) ((rlb.j) savingsProductSelectionScreen.U.getValue()).f255005j.get();
                    default:
                        KProperty[] kPropertyArr6 = SavingsProductSelectionScreen.Y;
                        return n14.e.a(savingsProductSelectionScreen, savingsProductSelectionScreen.R2());
                }
            }
        });
        final int i21 = 5;
        this.W = te0.w.y0(new Function0(this) { // from class: pmb.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SavingsProductSelectionScreen f237542b;

            {
                this.f237542b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i21;
                SavingsProductSelectionScreen savingsProductSelectionScreen = this.f237542b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SavingsProductSelectionScreen.Y;
                        return savingsProductSelectionScreen.d3().e;
                    case 1:
                        KProperty[] kPropertyArr2 = SavingsProductSelectionScreen.Y;
                        return savingsProductSelectionScreen.d3().d;
                    case 2:
                        KProperty[] kPropertyArr3 = SavingsProductSelectionScreen.Y;
                        return (j60.a) ((rlb.j) savingsProductSelectionScreen.U.getValue()).f255003g.get();
                    case 3:
                        KProperty[] kPropertyArr4 = SavingsProductSelectionScreen.Y;
                        return new z4l.j(7, u.c(new ContainerDelegate(v.k(new RowLoadingDelegate(), savingsProductSelectionScreen.L, savingsProductSelectionScreen.K, new ListSubheaderDelegate()), null, 6)), false);
                    case 4:
                        KProperty[] kPropertyArr5 = SavingsProductSelectionScreen.Y;
                        return (g) ((rlb.j) savingsProductSelectionScreen.U.getValue()).f255005j.get();
                    default:
                        KProperty[] kPropertyArr6 = SavingsProductSelectionScreen.Y;
                        return n14.e.a(savingsProductSelectionScreen, savingsProductSelectionScreen.R2());
                }
            }
        });
        this.X = R$layout.screen_savings_product_selection;
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(o oVar, q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        pmb.h hVar = qVar instanceof pmb.h ? (pmb.h) qVar : null;
        ?? r3 = this.P;
        if (hVar == null || hVar.f237534a) {
            DraggableTabsView draggableTabsView = (DraggableTabsView) r3.getValue();
            draggableTabsView.setVisibility(!uiState.f237538b.isEmpty() ? 0 : 8);
            DraggableTabsView.setItems$default(draggableTabsView, uiState.f237538b, null, 2, null);
        }
        if (hVar == null || hVar.f237536c) {
            r.b((DraggableTabsView) r3.getValue(), uiState.d, 6);
        }
        if (hVar == null || hVar.d) {
            NavBarWithToolbar navBarWithToolbar = d3().f307119c;
            navBarWithToolbar.setTitle(uiState.f, null);
            navBarWithToolbar.setToolbarTitle(uiState.f);
        }
        d3().f307119c.setSecondDescriptionText(uiState.e);
        ActionFooterView actionFooterView = d3().f307118b;
        pmb.b bVar = uiState.f237539c;
        n6 n6Var = new n6(bVar.f237523a, bVar.f237525c, null, null, bVar.f237524b, null, f.NEXT_CTA, 476);
        actionFooterView.setModel(uiState.f237540g ? new g(new n6(null, LargeActionButton.ButtonStyle.f58725a, new ResourceImage(R$drawable.uikit_icn_24_calculator, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccentNeutral), (List) null, (ImageTransformations) null, (Clause) null, 246), null, false, null, f.ADDITIONAL_CTA, 504), n6Var, bVar.d, aw0.f.SMALL_PRIMARY_BUTTON, 1) : new aw0.e(false, bVar.d, null, n6Var, null, null, 53));
        ((j) this.S.getValue()).c(uiState.f237537a);
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.R = analyticsContext;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (rlb.j) this.U.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getM() {
        return this.R;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ?? r56 = this.O;
        ViewPager2 viewPager2 = (ViewPager2) r56.getValue();
        viewPager2.setAdapter((j) this.S.getValue());
        View childAt = viewPager2.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView != null) {
            recyclerView.setOverScrollMode(2);
        }
        ((DraggableTabsView) this.P.getValue()).k((ViewPager2) r56.getValue());
        NavBarWithToolbar navBarWithToolbar = d3().f307119c;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.mmf_choose_a_currency_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        ((j60.a) this.Q.getValue()).d(u.c(this.M));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Z2() {
        ((ViewPager2) this.O.getValue()).unregisterOnPageChangeCallback(this.T);
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((ViewPager2) this.O.getValue()).registerOnPageChangeCallback(this.T);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f307119c.f59410q), null, new d(this, continuation, 28), 3);
        com.revolut.kompot.navigable.a.g2(this, l.y(d3().f307118b.f, d3().f307118b.f58955g, "merge(...)"), null, new pfk.o0(this, continuation, 19), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.K.f53218h), null, new pmb.o(2, 4, pmb.g.class, R2(), "onRowDelegateItemClick", "onRowDelegateItemClick(Lcom/revolut/core/ui_kit/delegates/RowDelegate$Model;)V"), 3);
        efm.r rVarMerge = efm.r.merge(d3().f307119c.x0(), d3().f307118b.e);
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarMerge), null, new nt.e(2, R2(), pmb.g.class, "onClauseDataClick", "onClauseDataClick(Lcom/revolut/core/ui_kit_core/clause/ClauseDisplayer$ClickData;)V", 4, 29), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.d.f121375b), null, new p(this, null), 3);
    }

    public final xmb.i d3() {
        ViewBinding value = this.N.getValue(this, Y[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (xmb.i) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final pmb.g R2() {
        return (pmb.g) this.V.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.X;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.W.getValue();
    }
}
