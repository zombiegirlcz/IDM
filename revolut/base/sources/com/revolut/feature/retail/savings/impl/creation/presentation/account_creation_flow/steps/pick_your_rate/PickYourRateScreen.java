package com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.pick_your_rate;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.pick_your_rate.PickYourRateScreen;
import com.revolut.feature.vaults.R$string;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dmb.c;
import dmb.d;
import dmb.h;
import dmb.i;
import dmb.j;
import dmb.l;
import efm.r;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.k;
import te0.w;
import vc.s;
import vlb.b;
import xki.e;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/steps/pick_your_rate/PickYourRateScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ldmb/h;", "Ldli/a;", "Ldmb/l;", "Lno/k;", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PickYourRateScreen extends ViewController<h> implements a, k {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(PickYourRateScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterNextbuttonBinding;", 0))};
    public AnalyticsContext K;
    public final int L;
    public final ao.h M;
    public final Object N;
    public final LargeActionButtonDelegate O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;

    public PickYourRateScreen(PickYourRateScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = new AnalyticsContext(b.a(inputData.f83280a));
        this.L = R$layout.screen_recycler_navbar_footer_nextbutton;
        this.M = s.t(this, dmb.b.f);
        this.N = w.y0(new dkd.a(24));
        this.O = new LargeActionButtonDelegate();
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: dmb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PickYourRateScreen f115876b;

            {
                this.f115876b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PickYourRateScreen pickYourRateScreen = this.f115876b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PickYourRateScreen.V;
                        return pickYourRateScreen.d3().e;
                    case 1:
                        KProperty[] kPropertyArr2 = PickYourRateScreen.V;
                        return pickYourRateScreen.d3().f174557b;
                    case 2:
                        KProperty[] kPropertyArr3 = PickYourRateScreen.V;
                        return (j60.a) ((rlb.b) pickYourRateScreen.S.getValue()).f254949g.get();
                    case 3:
                        KProperty[] kPropertyArr4 = PickYourRateScreen.V;
                        return (i) ((rlb.b) pickYourRateScreen.S.getValue()).f254951j.get();
                    default:
                        KProperty[] kPropertyArr5 = PickYourRateScreen.V;
                        PickYourRateScreen pickYourRateScreen2 = this.f115876b;
                        return dli.f.a(pickYourRateScreen2, pickYourRateScreen2.d(), v.k(new FullScreenStateDelegate(), new RowLoadingDelegate(), (SelectableDelegate) pickYourRateScreen2.N.getValue()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: dmb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PickYourRateScreen f115876b;

            {
                this.f115876b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PickYourRateScreen pickYourRateScreen = this.f115876b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PickYourRateScreen.V;
                        return pickYourRateScreen.d3().e;
                    case 1:
                        KProperty[] kPropertyArr2 = PickYourRateScreen.V;
                        return pickYourRateScreen.d3().f174557b;
                    case 2:
                        KProperty[] kPropertyArr3 = PickYourRateScreen.V;
                        return (j60.a) ((rlb.b) pickYourRateScreen.S.getValue()).f254949g.get();
                    case 3:
                        KProperty[] kPropertyArr4 = PickYourRateScreen.V;
                        return (i) ((rlb.b) pickYourRateScreen.S.getValue()).f254951j.get();
                    default:
                        KProperty[] kPropertyArr5 = PickYourRateScreen.V;
                        PickYourRateScreen pickYourRateScreen2 = this.f115876b;
                        return dli.f.a(pickYourRateScreen2, pickYourRateScreen2.d(), v.k(new FullScreenStateDelegate(), new RowLoadingDelegate(), (SelectableDelegate) pickYourRateScreen2.N.getValue()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: dmb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PickYourRateScreen f115876b;

            {
                this.f115876b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PickYourRateScreen pickYourRateScreen = this.f115876b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PickYourRateScreen.V;
                        return pickYourRateScreen.d3().e;
                    case 1:
                        KProperty[] kPropertyArr2 = PickYourRateScreen.V;
                        return pickYourRateScreen.d3().f174557b;
                    case 2:
                        KProperty[] kPropertyArr3 = PickYourRateScreen.V;
                        return (j60.a) ((rlb.b) pickYourRateScreen.S.getValue()).f254949g.get();
                    case 3:
                        KProperty[] kPropertyArr4 = PickYourRateScreen.V;
                        return (i) ((rlb.b) pickYourRateScreen.S.getValue()).f254951j.get();
                    default:
                        KProperty[] kPropertyArr5 = PickYourRateScreen.V;
                        PickYourRateScreen pickYourRateScreen2 = this.f115876b;
                        return dli.f.a(pickYourRateScreen2, pickYourRateScreen2.d(), v.k(new FullScreenStateDelegate(), new RowLoadingDelegate(), (SelectableDelegate) pickYourRateScreen2.N.getValue()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
        this.S = w.y0(new dgg.b(this, inputData, 5));
        final int i5 = 3;
        this.T = w.y0(new Function0(this) { // from class: dmb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PickYourRateScreen f115876b;

            {
                this.f115876b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                PickYourRateScreen pickYourRateScreen = this.f115876b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PickYourRateScreen.V;
                        return pickYourRateScreen.d3().e;
                    case 1:
                        KProperty[] kPropertyArr2 = PickYourRateScreen.V;
                        return pickYourRateScreen.d3().f174557b;
                    case 2:
                        KProperty[] kPropertyArr3 = PickYourRateScreen.V;
                        return (j60.a) ((rlb.b) pickYourRateScreen.S.getValue()).f254949g.get();
                    case 3:
                        KProperty[] kPropertyArr4 = PickYourRateScreen.V;
                        return (i) ((rlb.b) pickYourRateScreen.S.getValue()).f254951j.get();
                    default:
                        KProperty[] kPropertyArr5 = PickYourRateScreen.V;
                        PickYourRateScreen pickYourRateScreen2 = this.f115876b;
                        return dli.f.a(pickYourRateScreen2, pickYourRateScreen2.d(), v.k(new FullScreenStateDelegate(), new RowLoadingDelegate(), (SelectableDelegate) pickYourRateScreen2.N.getValue()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i6 = 4;
        this.U = w.y0(new Function0(this) { // from class: dmb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PickYourRateScreen f115876b;

            {
                this.f115876b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                PickYourRateScreen pickYourRateScreen = this.f115876b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PickYourRateScreen.V;
                        return pickYourRateScreen.d3().e;
                    case 1:
                        KProperty[] kPropertyArr2 = PickYourRateScreen.V;
                        return pickYourRateScreen.d3().f174557b;
                    case 2:
                        KProperty[] kPropertyArr3 = PickYourRateScreen.V;
                        return (j60.a) ((rlb.b) pickYourRateScreen.S.getValue()).f254949g.get();
                    case 3:
                        KProperty[] kPropertyArr4 = PickYourRateScreen.V;
                        return (i) ((rlb.b) pickYourRateScreen.S.getValue()).f254951j.get();
                    default:
                        KProperty[] kPropertyArr5 = PickYourRateScreen.V;
                        PickYourRateScreen pickYourRateScreen2 = this.f115876b;
                        return dli.f.a(pickYourRateScreen2, pickYourRateScreen2.d(), v.k(new FullScreenStateDelegate(), new RowLoadingDelegate(), (SelectableDelegate) pickYourRateScreen2.N.getValue()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(o oVar, q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        Clause clause = uiState.f115889b;
        dmb.k kVar = qVar instanceof dmb.k ? (dmb.k) qVar : null;
        if (kVar == null) {
            kVar = new dmb.k(true, true, true, true);
        }
        if (kVar.f115885a) {
            LargeActionButton largeActionButton = (LargeActionButton) this.Q.getValue();
            j jVar = uiState.d;
            largeActionButton.o(jVar.f115884c);
            largeActionButton.setText(jVar.f115882a);
            largeActionButton.setEnabled(jVar.f115883b);
        }
        boolean z = kVar.f115886b;
        ?? r4 = this.P;
        if (z) {
            NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) r4.getValue();
            navBarWithToolbar.setSecondDescriptionVisible(clause != null);
            navBarWithToolbar.setSecondDescriptionText(clause);
        }
        if (kVar.d) {
            ((NavBarWithToolbar) r4.getValue()).setTitle(uiState.f115888a, null);
        }
        if (kVar.f115887c) {
            d3().f174558c.setTextClause(uiState.e);
        }
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.K = analyticsContext;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (rlb.b) this.S.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((NavBarWithToolbar) this.P.getValue()).setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        ((LargeActionButton) this.Q.getValue()).setText(new TextLocalisedClause(R$string.vaults_common_action_continue, null, null, 14));
        ((j60.a) this.R.getValue()).d(u.c(this.O));
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v11, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ?? r132 = this.P;
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((NavBarWithToolbar) r132.getValue()).f59410q), null, new c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((LargeActionButton) this.Q.getValue()).o), null, new c(this, continuation, 1), 3);
        r rVarMerge = r.merge(d3().f174558c.f58608l, ((NavBarWithToolbar) r132.getValue()).x0());
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarMerge), null, new cyc.c(2, d(), i.class, "onClauseDataClick", "onClauseDataClick(Lcom/revolut/core/ui_kit_core/clause/ClauseDisplayer$ClickData;)V", 4, 4), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.d.f121375b), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((SelectableDelegate) this.N.getValue()).r()), null, new dmb.e(this, null), 3);
    }

    public final jii.s d3() {
        ViewBinding value = this.M.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.s) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final i d() {
        return (i) this.T.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.U.getValue();
    }
}
