package com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_term_selection;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HighlightTileDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.retail.savings.api.R$string;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_term_selection.SavingsTermSelectionScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import efm.r;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import ncd.g;
import no.k;
import rmb.b;
import rmb.c;
import rmb.d;
import rmb.e;
import rmb.i;
import rmb.j;
import te0.w;
import tx0.j0;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/steps/savings_term_selection/SavingsTermSelectionScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lrmb/b;", "Ldli/a;", "Lrmb/e;", "Lno/k;", "<init>", "()V", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SavingsTermSelectionScreen extends ViewController<b> implements dli.a, k {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(SavingsTermSelectionScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterNextbuttonBinding;", 0))};
    public final Object L;
    public final Object M;
    public final Object S;
    public final Object T;
    public final Object U;
    public final h K = s.t(this, a.f);
    public final FullScreenStateDelegate N = new FullScreenStateDelegate();
    public final Object O = w.y0(new rm0.k(1));
    public final HighlightTileDelegate P = new HighlightTileDelegate();
    public AnalyticsContext Q = new AnalyticsContext(vlb.b.a(g.SAVINGS_FIXED_TERM));
    public final int R = R$layout.screen_recycler_navbar_footer_nextbutton;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, jii.s.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterNextbuttonBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return jii.s.a(p0);
        }
    }

    public SavingsTermSelectionScreen() {
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: rmb.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SavingsTermSelectionScreen f255225b;

            {
                this.f255225b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SavingsTermSelectionScreen savingsTermSelectionScreen = this.f255225b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SavingsTermSelectionScreen.V;
                        return savingsTermSelectionScreen.d3().e;
                    case 1:
                        KProperty[] kPropertyArr2 = SavingsTermSelectionScreen.V;
                        return savingsTermSelectionScreen.d3().f174557b;
                    case 2:
                        KProperty[] kPropertyArr3 = SavingsTermSelectionScreen.V;
                        qji.b bVarU2 = savingsTermSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_term_selection.di.SavingsTermSelectionScreenInjector");
                        rlb.g gVar = (rlb.g) bVarU2;
                        return new rlb.k(gVar.f254990b, gVar.f254991c);
                    case 3:
                        KProperty[] kPropertyArr4 = SavingsTermSelectionScreen.V;
                        return (c) ((rlb.k) savingsTermSelectionScreen.S.getValue()).f255006a.get();
                    default:
                        KProperty[] kPropertyArr5 = SavingsTermSelectionScreen.V;
                        SavingsTermSelectionScreen savingsTermSelectionScreen2 = this.f255225b;
                        return dli.f.a(savingsTermSelectionScreen2, savingsTermSelectionScreen2.d(), v.k(savingsTermSelectionScreen2.N, new RowLoadingDelegate(), (SelectableDelegate) savingsTermSelectionScreen2.O.getValue(), savingsTermSelectionScreen2.P), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: rmb.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SavingsTermSelectionScreen f255225b;

            {
                this.f255225b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SavingsTermSelectionScreen savingsTermSelectionScreen = this.f255225b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SavingsTermSelectionScreen.V;
                        return savingsTermSelectionScreen.d3().e;
                    case 1:
                        KProperty[] kPropertyArr2 = SavingsTermSelectionScreen.V;
                        return savingsTermSelectionScreen.d3().f174557b;
                    case 2:
                        KProperty[] kPropertyArr3 = SavingsTermSelectionScreen.V;
                        qji.b bVarU2 = savingsTermSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_term_selection.di.SavingsTermSelectionScreenInjector");
                        rlb.g gVar = (rlb.g) bVarU2;
                        return new rlb.k(gVar.f254990b, gVar.f254991c);
                    case 3:
                        KProperty[] kPropertyArr4 = SavingsTermSelectionScreen.V;
                        return (c) ((rlb.k) savingsTermSelectionScreen.S.getValue()).f255006a.get();
                    default:
                        KProperty[] kPropertyArr5 = SavingsTermSelectionScreen.V;
                        SavingsTermSelectionScreen savingsTermSelectionScreen2 = this.f255225b;
                        return dli.f.a(savingsTermSelectionScreen2, savingsTermSelectionScreen2.d(), v.k(savingsTermSelectionScreen2.N, new RowLoadingDelegate(), (SelectableDelegate) savingsTermSelectionScreen2.O.getValue(), savingsTermSelectionScreen2.P), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: rmb.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SavingsTermSelectionScreen f255225b;

            {
                this.f255225b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SavingsTermSelectionScreen savingsTermSelectionScreen = this.f255225b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SavingsTermSelectionScreen.V;
                        return savingsTermSelectionScreen.d3().e;
                    case 1:
                        KProperty[] kPropertyArr2 = SavingsTermSelectionScreen.V;
                        return savingsTermSelectionScreen.d3().f174557b;
                    case 2:
                        KProperty[] kPropertyArr3 = SavingsTermSelectionScreen.V;
                        qji.b bVarU2 = savingsTermSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_term_selection.di.SavingsTermSelectionScreenInjector");
                        rlb.g gVar = (rlb.g) bVarU2;
                        return new rlb.k(gVar.f254990b, gVar.f254991c);
                    case 3:
                        KProperty[] kPropertyArr4 = SavingsTermSelectionScreen.V;
                        return (c) ((rlb.k) savingsTermSelectionScreen.S.getValue()).f255006a.get();
                    default:
                        KProperty[] kPropertyArr5 = SavingsTermSelectionScreen.V;
                        SavingsTermSelectionScreen savingsTermSelectionScreen2 = this.f255225b;
                        return dli.f.a(savingsTermSelectionScreen2, savingsTermSelectionScreen2.d(), v.k(savingsTermSelectionScreen2.N, new RowLoadingDelegate(), (SelectableDelegate) savingsTermSelectionScreen2.O.getValue(), savingsTermSelectionScreen2.P), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i5 = 3;
        this.T = w.y0(new Function0(this) { // from class: rmb.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SavingsTermSelectionScreen f255225b;

            {
                this.f255225b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                SavingsTermSelectionScreen savingsTermSelectionScreen = this.f255225b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SavingsTermSelectionScreen.V;
                        return savingsTermSelectionScreen.d3().e;
                    case 1:
                        KProperty[] kPropertyArr2 = SavingsTermSelectionScreen.V;
                        return savingsTermSelectionScreen.d3().f174557b;
                    case 2:
                        KProperty[] kPropertyArr3 = SavingsTermSelectionScreen.V;
                        qji.b bVarU2 = savingsTermSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_term_selection.di.SavingsTermSelectionScreenInjector");
                        rlb.g gVar = (rlb.g) bVarU2;
                        return new rlb.k(gVar.f254990b, gVar.f254991c);
                    case 3:
                        KProperty[] kPropertyArr4 = SavingsTermSelectionScreen.V;
                        return (c) ((rlb.k) savingsTermSelectionScreen.S.getValue()).f255006a.get();
                    default:
                        KProperty[] kPropertyArr5 = SavingsTermSelectionScreen.V;
                        SavingsTermSelectionScreen savingsTermSelectionScreen2 = this.f255225b;
                        return dli.f.a(savingsTermSelectionScreen2, savingsTermSelectionScreen2.d(), v.k(savingsTermSelectionScreen2.N, new RowLoadingDelegate(), (SelectableDelegate) savingsTermSelectionScreen2.O.getValue(), savingsTermSelectionScreen2.P), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i6 = 4;
        this.U = w.y0(new Function0(this) { // from class: rmb.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SavingsTermSelectionScreen f255225b;

            {
                this.f255225b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                SavingsTermSelectionScreen savingsTermSelectionScreen = this.f255225b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SavingsTermSelectionScreen.V;
                        return savingsTermSelectionScreen.d3().e;
                    case 1:
                        KProperty[] kPropertyArr2 = SavingsTermSelectionScreen.V;
                        return savingsTermSelectionScreen.d3().f174557b;
                    case 2:
                        KProperty[] kPropertyArr3 = SavingsTermSelectionScreen.V;
                        qji.b bVarU2 = savingsTermSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_term_selection.di.SavingsTermSelectionScreenInjector");
                        rlb.g gVar = (rlb.g) bVarU2;
                        return new rlb.k(gVar.f254990b, gVar.f254991c);
                    case 3:
                        KProperty[] kPropertyArr4 = SavingsTermSelectionScreen.V;
                        return (c) ((rlb.k) savingsTermSelectionScreen.S.getValue()).f255006a.get();
                    default:
                        KProperty[] kPropertyArr5 = SavingsTermSelectionScreen.V;
                        SavingsTermSelectionScreen savingsTermSelectionScreen2 = this.f255225b;
                        return dli.f.a(savingsTermSelectionScreen2, savingsTermSelectionScreen2.d(), v.k(savingsTermSelectionScreen2.N, new RowLoadingDelegate(), (SelectableDelegate) savingsTermSelectionScreen2.O.getValue(), savingsTermSelectionScreen2.P), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        e uiState = (e) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        Clause clause = uiState.f255222b;
        d dVar = qVar instanceof d ? (d) qVar : null;
        if (dVar == null) {
            dVar = new d(true, true);
        }
        if (dVar.f255219a) {
            ?? r2 = this.L;
            ((NavBarWithToolbar) r2.getValue()).setSecondDescriptionVisible(clause != null);
            ((NavBarWithToolbar) r2.getValue()).setSecondDescriptionText(clause);
        }
        if (dVar.f255220b) {
            ((LargeActionButton) this.M.getValue()).setVisibility(uiState.f255223c ? 0 : 8);
        }
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.Q = analyticsContext;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (rlb.k) this.S.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getQ() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) this.L.getValue();
        TextLocalisedClause textLocalisedClauseQ = v04.b.Q(new TextLocalisedClause(R$string.savings_term_selection_header_title, null, null, 14), R$string.savings_onboarding_term_selection);
        navBarWithToolbar.setTitle(textLocalisedClauseQ, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClauseQ);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        ((LargeActionButton) this.M.getValue()).setText(new TextLocalisedClause(R$string.savings_term_selection_continue_button, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ?? r132 = this.L;
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((NavBarWithToolbar) r132.getValue()).f59410q), null, new rmb.g(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((LargeActionButton) this.M.getValue()).o), null, new rmb.g(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((SelectableDelegate) this.O.getValue()).r()), null, new rmb.h(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.f52437c), null, new i(2, 4, c.class, d(), "onUpgradeBannerClick", "onUpgradeBannerClick(Lcom/revolut/core/ui_kit/delegates/HighlightTileDelegate$Model;)V"), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.f52371h.f121375b), null, new j(this, null), 3);
        r rVarMerge = r.merge(d3().f174558c.f58608l, ((NavBarWithToolbar) r132.getValue()).x0());
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarMerge), null, new q9c.v(2, d(), c.class, "onClauseDataClick", "onClauseDataClick(Lcom/revolut/core/ui_kit_core/clause/ClauseDisplayer$ClickData;)V", 4, 12), 3);
    }

    public final jii.s d3() {
        ViewBinding value = this.K.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.s) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final c d() {
        return (c) this.T.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.R;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.U.getValue();
    }
}
