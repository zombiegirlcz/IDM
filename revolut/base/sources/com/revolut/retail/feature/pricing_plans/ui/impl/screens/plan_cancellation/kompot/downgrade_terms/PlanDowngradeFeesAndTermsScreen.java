package com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.downgrade_terms;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsTotalDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.downgrade_terms.PlanDowngradeFeesAndTermsScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.downgrade_terms.PlanDowngradeFeesAndTermsScreenContract$InputData;
import dli.a;
import dli.c;
import jii.n;
import jij.d;
import jlk.b;
import jlk.f;
import jlk.g;
import jlk.j;
import jlk.l;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.k;
import qgk.t2;
import te0.w;
import vc.s;
import wp5.y;
import xki.e;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_cancellation/kompot/downgrade_terms/PlanDowngradeFeesAndTermsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ljlk/j;", "Ldli/a;", "Ljlk/l;", "Lno/k;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PlanDowngradeFeesAndTermsScreen extends ViewController<j> implements a, k {
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new h0(PlanDowngradeFeesAndTermsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetBinding;", 0))};
    public final PlanDowngradeFeesAndTermsScreenContract$InputData K;
    public final int L;
    public AnalyticsContext M;
    public final CellDetailsDelegate N;
    public final LargeActionButtonDelegate O;
    public final TextDelegate P;
    public final LargeActionButtonDelegate Q;
    public final TwinHorizontalButtonDelegate R;
    public final CellDetailsDelegate S;
    public final h T;
    public final Object U;
    public final Object V;
    public final Object W;

    public PlanDowngradeFeesAndTermsScreen(PlanDowngradeFeesAndTermsScreenContract$InputData input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.K = input;
        this.L = R$layout.screen_recycler_navbar_bottomsheet;
        String str = input.f103498a.f81159a;
        this.M = str != null ? new AnalyticsContext(v0.a.b(str, AnalyticsContext.INSTANCE)) : null;
        this.N = new CellDetailsDelegate();
        this.O = new LargeActionButtonDelegate();
        this.P = new TextDelegate();
        this.Q = new LargeActionButtonDelegate();
        this.R = new TwinHorizontalButtonDelegate();
        this.S = new CellDetailsDelegate();
        this.T = s.t(this, b.f);
        final int i = 0;
        this.U = w.y0(new Function0(this) { // from class: jlk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanDowngradeFeesAndTermsScreen f175852b;

            {
                this.f175852b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PlanDowngradeFeesAndTermsScreen planDowngradeFeesAndTermsScreen = this.f175852b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PlanDowngradeFeesAndTermsScreen.X;
                        PlanDowngradeFeesAndTermsScreen planDowngradeFeesAndTermsScreen2 = this.f175852b;
                        return dli.f.a(planDowngradeFeesAndTermsScreen2, planDowngradeFeesAndTermsScreen2.R2(), v.k(planDowngradeFeesAndTermsScreen2.N, planDowngradeFeesAndTermsScreen2.O, planDowngradeFeesAndTermsScreen2.P, new CellDetailsTotalDelegate()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PlanDowngradeFeesAndTermsScreen.X;
                        qji.b bVarU2 = planDowngradeFeesAndTermsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.downgrade_terms.di.PlanDowngradeFeesAndTermsScreenInjector");
                        t2 t2Var = (t2) ((klk.b) bVarU2).c().mo3808a(planDowngradeFeesAndTermsScreen);
                        PlanDowngradeFeesAndTermsScreenContract$InputData planDowngradeFeesAndTermsScreenContract$InputData = planDowngradeFeesAndTermsScreen.K;
                        switch (t2Var.f246244a) {
                            case 0:
                                planDowngradeFeesAndTermsScreenContract$InputData.getClass();
                                t2Var.d = planDowngradeFeesAndTermsScreenContract$InputData;
                                break;
                            case 1:
                                planDowngradeFeesAndTermsScreenContract$InputData.getClass();
                                t2Var.d = planDowngradeFeesAndTermsScreenContract$InputData;
                                break;
                            case 2:
                                planDowngradeFeesAndTermsScreenContract$InputData.getClass();
                                t2Var.d = planDowngradeFeesAndTermsScreenContract$InputData;
                                break;
                            case 3:
                                planDowngradeFeesAndTermsScreenContract$InputData.getClass();
                                t2Var.d = planDowngradeFeesAndTermsScreenContract$InputData;
                                break;
                            default:
                                planDowngradeFeesAndTermsScreenContract$InputData.getClass();
                                t2Var.d = planDowngradeFeesAndTermsScreenContract$InputData;
                                break;
                        }
                        return (klk.a) t2Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = PlanDowngradeFeesAndTermsScreen.X;
                        return ((klk.a) planDowngradeFeesAndTermsScreen.V.getValue()).a();
                }
            }
        });
        final int i2 = 1;
        this.V = w.y0(new Function0(this) { // from class: jlk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanDowngradeFeesAndTermsScreen f175852b;

            {
                this.f175852b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PlanDowngradeFeesAndTermsScreen planDowngradeFeesAndTermsScreen = this.f175852b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PlanDowngradeFeesAndTermsScreen.X;
                        PlanDowngradeFeesAndTermsScreen planDowngradeFeesAndTermsScreen2 = this.f175852b;
                        return dli.f.a(planDowngradeFeesAndTermsScreen2, planDowngradeFeesAndTermsScreen2.R2(), v.k(planDowngradeFeesAndTermsScreen2.N, planDowngradeFeesAndTermsScreen2.O, planDowngradeFeesAndTermsScreen2.P, new CellDetailsTotalDelegate()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PlanDowngradeFeesAndTermsScreen.X;
                        qji.b bVarU2 = planDowngradeFeesAndTermsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.downgrade_terms.di.PlanDowngradeFeesAndTermsScreenInjector");
                        t2 t2Var = (t2) ((klk.b) bVarU2).c().mo3808a(planDowngradeFeesAndTermsScreen);
                        PlanDowngradeFeesAndTermsScreenContract$InputData planDowngradeFeesAndTermsScreenContract$InputData = planDowngradeFeesAndTermsScreen.K;
                        switch (t2Var.f246244a) {
                            case 0:
                                planDowngradeFeesAndTermsScreenContract$InputData.getClass();
                                t2Var.d = planDowngradeFeesAndTermsScreenContract$InputData;
                                break;
                            case 1:
                                planDowngradeFeesAndTermsScreenContract$InputData.getClass();
                                t2Var.d = planDowngradeFeesAndTermsScreenContract$InputData;
                                break;
                            case 2:
                                planDowngradeFeesAndTermsScreenContract$InputData.getClass();
                                t2Var.d = planDowngradeFeesAndTermsScreenContract$InputData;
                                break;
                            case 3:
                                planDowngradeFeesAndTermsScreenContract$InputData.getClass();
                                t2Var.d = planDowngradeFeesAndTermsScreenContract$InputData;
                                break;
                            default:
                                planDowngradeFeesAndTermsScreenContract$InputData.getClass();
                                t2Var.d = planDowngradeFeesAndTermsScreenContract$InputData;
                                break;
                        }
                        return (klk.a) t2Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = PlanDowngradeFeesAndTermsScreen.X;
                        return ((klk.a) planDowngradeFeesAndTermsScreen.V.getValue()).a();
                }
            }
        });
        final int i3 = 2;
        this.W = w.y0(new Function0(this) { // from class: jlk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanDowngradeFeesAndTermsScreen f175852b;

            {
                this.f175852b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PlanDowngradeFeesAndTermsScreen planDowngradeFeesAndTermsScreen = this.f175852b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PlanDowngradeFeesAndTermsScreen.X;
                        PlanDowngradeFeesAndTermsScreen planDowngradeFeesAndTermsScreen2 = this.f175852b;
                        return dli.f.a(planDowngradeFeesAndTermsScreen2, planDowngradeFeesAndTermsScreen2.R2(), v.k(planDowngradeFeesAndTermsScreen2.N, planDowngradeFeesAndTermsScreen2.O, planDowngradeFeesAndTermsScreen2.P, new CellDetailsTotalDelegate()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PlanDowngradeFeesAndTermsScreen.X;
                        qji.b bVarU2 = planDowngradeFeesAndTermsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.downgrade_terms.di.PlanDowngradeFeesAndTermsScreenInjector");
                        t2 t2Var = (t2) ((klk.b) bVarU2).c().mo3808a(planDowngradeFeesAndTermsScreen);
                        PlanDowngradeFeesAndTermsScreenContract$InputData planDowngradeFeesAndTermsScreenContract$InputData = planDowngradeFeesAndTermsScreen.K;
                        switch (t2Var.f246244a) {
                            case 0:
                                planDowngradeFeesAndTermsScreenContract$InputData.getClass();
                                t2Var.d = planDowngradeFeesAndTermsScreenContract$InputData;
                                break;
                            case 1:
                                planDowngradeFeesAndTermsScreenContract$InputData.getClass();
                                t2Var.d = planDowngradeFeesAndTermsScreenContract$InputData;
                                break;
                            case 2:
                                planDowngradeFeesAndTermsScreenContract$InputData.getClass();
                                t2Var.d = planDowngradeFeesAndTermsScreenContract$InputData;
                                break;
                            case 3:
                                planDowngradeFeesAndTermsScreenContract$InputData.getClass();
                                t2Var.d = planDowngradeFeesAndTermsScreenContract$InputData;
                                break;
                            default:
                                planDowngradeFeesAndTermsScreenContract$InputData.getClass();
                                t2Var.d = planDowngradeFeesAndTermsScreenContract$InputData;
                                break;
                        }
                        return (klk.a) t2Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = PlanDowngradeFeesAndTermsScreen.X;
                        return ((klk.a) planDowngradeFeesAndTermsScreen.V.getValue()).a();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        ViewBinding value = this.T.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((n) value).f174542b.setHeaderModel(new lw0.a(uiState.f175859b, uiState.f175860c, null, null, false, 28));
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.M = analyticsContext;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (klk.a) this.V.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getX() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((klk.a) this.V.getValue()).k().d(v.k(this.S, this.Q, this.R));
        pd.b.p(view, new TextLocalisedClause(R$string.plan_downgrade_downgrade_terms_title, u.c(this.K.f103498a.f81160b.f81173a), null, 12));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.T.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, new d(y.x(((n) value).f174542b.F, this.P.d, "mergeWith(...)"), 1), new jij.h(this, (Continuation) null, 9), 3);
        ViewController.P2(this, new d(rd0.e.b(this.N.f), 2), new jlk.e(this, null), 3);
        ViewController.P2(this, y.x(this.O.d.f121375b, this.Q.d.f121375b, "mergeWith(...)"), new f(this, null), 3);
        TwinHorizontalButtonDelegate twinHorizontalButtonDelegate = this.R;
        ViewController.P2(this, rd0.e.b(twinHorizontalButtonDelegate.f53572c.f121375b), new g(this, null), 3);
        ViewController.P2(this, rd0.e.b(twinHorizontalButtonDelegate.d.f121375b), new jlk.h(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final jlk.k d() {
        return (jlk.k) this.W.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.U.getValue();
    }
}
