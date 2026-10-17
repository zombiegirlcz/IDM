package com.revolut.feature.incentive_reward.impl.ui.incentive_selection.screen.selection;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.incentive_reward.impl.R$string;
import com.revolut.feature.incentive_reward.impl.ui.incentive_selection.flow.IncentiveSelectionFlowContract$InputData;
import com.revolut.feature.incentive_reward.impl.ui.incentive_selection.screen.selection.IncentiveSelectionController;
import com.revolut.feature.incentive_reward.impl.ui.incentive_selection.screen.selection.a;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.tracking.v3.BaseContext;
import jii.u;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import mg7.b;
import mg7.c;
import mg7.d;
import mg7.f;
import mg7.m;
import mg7.n;
import mg7.p;
import mg7.r;
import no.k;
import te0.w;
import tx0.t3;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/incentive_reward/impl/ui/incentive_selection/screen/selection/IncentiveSelectionController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lmg7/m;", "Ldli/a;", "Lmg7/r;", "Lno/k;", "<init>", "()V", "feature_retail_incentive_reward_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IncentiveSelectionController extends ViewController<m> implements dli.a, k {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(IncentiveSelectionController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public AnalyticsContext K;
    public final int L = R$layout.screen_recycler_navbar_nextbutton;
    public final boolean M = true;
    public final Object N;
    public final Object O;
    public final RowDelegate P;
    public final SelectableDelegate Q;
    public final FullScreenStateDelegate R;
    public final LargeActionButtonDelegate S;
    public final Object T;
    public final h U;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, u.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return u.a(p0);
        }
    }

    public IncentiveSelectionController() {
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: mg7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IncentiveSelectionController f205163b;

            {
                this.f205163b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                IncentiveSelectionController incentiveSelectionController = this.f205163b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = IncentiveSelectionController.V;
                        qji.b bVarU2 = incentiveSelectionController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.incentive_reward.impl.ui.incentive_selection.screen.selection.di.IncentiveSelectionControllerComponent.Injector");
                        cf7.f fVar = (cf7.f) bVarU2;
                        return new cf7.e(fVar.f23612b, fVar.f23613c, incentiveSelectionController);
                    case 1:
                        KProperty[] kPropertyArr2 = IncentiveSelectionController.V;
                        return (k) ((cf7.e) incentiveSelectionController.N.getValue()).i.get();
                    default:
                        KProperty[] kPropertyArr3 = IncentiveSelectionController.V;
                        IncentiveSelectionController incentiveSelectionController2 = this.f205163b;
                        return dli.f.a(incentiveSelectionController2, incentiveSelectionController2.d(), zhm.v.k(incentiveSelectionController2.Q, new RowLoadingDelegate(), incentiveSelectionController2.R), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: mg7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IncentiveSelectionController f205163b;

            {
                this.f205163b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                IncentiveSelectionController incentiveSelectionController = this.f205163b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = IncentiveSelectionController.V;
                        qji.b bVarU2 = incentiveSelectionController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.incentive_reward.impl.ui.incentive_selection.screen.selection.di.IncentiveSelectionControllerComponent.Injector");
                        cf7.f fVar = (cf7.f) bVarU2;
                        return new cf7.e(fVar.f23612b, fVar.f23613c, incentiveSelectionController);
                    case 1:
                        KProperty[] kPropertyArr2 = IncentiveSelectionController.V;
                        return (k) ((cf7.e) incentiveSelectionController.N.getValue()).i.get();
                    default:
                        KProperty[] kPropertyArr3 = IncentiveSelectionController.V;
                        IncentiveSelectionController incentiveSelectionController2 = this.f205163b;
                        return dli.f.a(incentiveSelectionController2, incentiveSelectionController2.d(), zhm.v.k(incentiveSelectionController2.Q, new RowLoadingDelegate(), incentiveSelectionController2.R), 0, null, null, null, 60);
                }
            }
        });
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.P = rowDelegate;
        this.Q = new SelectableDelegate(rowDelegate);
        this.R = new FullScreenStateDelegate();
        this.S = new LargeActionButtonDelegate();
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: mg7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IncentiveSelectionController f205163b;

            {
                this.f205163b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                IncentiveSelectionController incentiveSelectionController = this.f205163b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = IncentiveSelectionController.V;
                        qji.b bVarU2 = incentiveSelectionController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.incentive_reward.impl.ui.incentive_selection.screen.selection.di.IncentiveSelectionControllerComponent.Injector");
                        cf7.f fVar = (cf7.f) bVarU2;
                        return new cf7.e(fVar.f23612b, fVar.f23613c, incentiveSelectionController);
                    case 1:
                        KProperty[] kPropertyArr2 = IncentiveSelectionController.V;
                        return (k) ((cf7.e) incentiveSelectionController.N.getValue()).i.get();
                    default:
                        KProperty[] kPropertyArr3 = IncentiveSelectionController.V;
                        IncentiveSelectionController incentiveSelectionController2 = this.f205163b;
                        return dli.f.a(incentiveSelectionController2, incentiveSelectionController2.d(), zhm.v.k(incentiveSelectionController2.Q, new RowLoadingDelegate(), incentiveSelectionController2.R), 0, null, null, null, 60);
                }
            }
        });
        this.U = s.t(this, a.f);
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        r uiState = (r) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        LargeActionButton goToButton = d3().f174564b;
        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
        mg7.q qVar2 = uiState.f205182b;
        if (qVar2 instanceof p) {
            t3 t3Var = t3.TWO_LINES;
            NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
            navBarWithToolbar.I0(t3Var, false);
        } else {
            if (!(qVar2 instanceof mg7.o)) {
                throw new NoWhenBranchMatchedException();
            }
            navBarWithToolbar.l0();
            mg7.o oVar2 = (mg7.o) qVar2;
            Clause clause = oVar2.f205178c;
            Clause clause2 = oVar2.d;
            navBarWithToolbar.setDescriptionVisible(clause2 != null);
            navBarWithToolbar.setDescriptionText(clause2);
            navBarWithToolbar.setTitleVisible(clause != null);
            navBarWithToolbar.setTitle(clause, null);
        }
        navBarWithToolbar.setMenuItems(qVar2.b());
        d3().f174565c.setNavigationButtonImage(qVar2.a());
        com.revolut.feature.incentive_reward.impl.ui.incentive_selection.screen.selection.a aVar = uiState.f205183c;
        if (aVar.equals(a.C0498a.f74871a)) {
            goToButton.setVisibility(8);
        } else {
            if (!(aVar instanceof n)) {
                throw new NoWhenBranchMatchedException();
            }
            goToButton.setVisibility(0);
            goToButton.setEnabled(((n) aVar).f205175a);
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
        return (cf7.e) this.N.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        AnalyticsContext analyticsContext = null;
        d3().f174564b.setText(new TextLocalisedClause(R$string.incentive_reward_common_action_confirm, null, null, 14));
        ?? r62 = this.N;
        ((j60.a) ((cf7.e) r62.getValue()).f23610h.get()).d(v.k(new ListCellDelegate(), this.S));
        IncentiveSelectionFlowContract$InputData inputData = ((cf7.e) r62.getValue()).f23607b.f23611a;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        String str = inputData.e;
        if (str != null) {
            AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
            BaseContext.a aVarNewBuilder = BaseContext.newBuilder();
            aVarNewBuilder.c();
            ((BaseContext) aVarNewBuilder.f49761b).setContextType("SOURCE");
            aVarNewBuilder.c();
            ((BaseContext) aVarNewBuilder.f49761b).setId(str);
            w0 w0VarA = aVarNewBuilder.a();
            companion.getClass();
            analyticsContext = new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA));
        }
        this.K = analyticsContext;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new b(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.R.f52371h.f121375b), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.p0()), null, new b(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.r()), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.k), null, new mg7.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.S.d.f121375b), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new b(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.o.f57403b), null, new b(this, continuation, 3), 3);
    }

    public final u d3() {
        ViewBinding value = this.U.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final mg7.k d() {
        return (mg7.k) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.M);
    }
}
