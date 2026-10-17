package com.revolut.feature.staking.impl.confirmation;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.e;
import aw0.n6;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.HighlightTileDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.feature.staking.api.model.StakingProduct;
import com.revolut.feature.staking.impl.R$layout;
import com.revolut.feature.staking.impl.confirmation.StakingConfirmationController;
import com.revolut.feature.staking.impl.confirmation.StakingConfirmationControllerContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import dj0.d;
import efm.r;
import hud.c;
import hud.g;
import hud.j;
import ihm.f;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mga.i0;
import te0.w;
import tx0.r3;
import tx0.t3;
import vc.s;
import ytd.b;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/staking/impl/confirmation/StakingConfirmationController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lytd/b;", "Ldli/a;", "Lhud/j;", "Lmga/i0;", "feature_staking_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StakingConfirmationController extends ViewController<b> implements dli.a, i0 {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f88105a0 = {o0.f186429a.j(new h0(StakingConfirmationController.class, "binding", "getBinding()Lcom/revolut/feature/staking/impl/databinding/ScreenStakingConfirmationBinding;", 0))};
    public final d K;
    public final String L;
    public final StakingPocket M;
    public final StakingProduct N;
    public final h O;
    public final CellDetailsActionDelegate P;
    public final CellDetailsDelegate Q;
    public final LargeActionButtonDelegate R;
    public final PlainTextDelegate S;
    public final TextDelegate T;
    public final RowDelegate U;
    public final HighlightTileDelegate V;
    public final int W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    public StakingConfirmationController(d amount, String sourcePocketId, StakingPocket stakingPocket, StakingProduct stakingProduct) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(sourcePocketId, "sourcePocketId");
        Intrinsics.checkNotNullParameter(stakingProduct, "stakingProduct");
        this.K = amount;
        this.L = sourcePocketId;
        this.M = stakingPocket;
        this.N = stakingProduct;
        this.O = s.t(this, hud.b.f);
        this.P = new CellDetailsActionDelegate();
        this.Q = new CellDetailsDelegate();
        this.R = new LargeActionButtonDelegate();
        this.S = new PlainTextDelegate();
        this.T = new TextDelegate();
        this.U = new RowDelegate(null, null, 7);
        this.V = new HighlightTileDelegate();
        this.W = R$layout.screen_staking_confirmation;
        final int i = 0;
        this.X = w.y0(new Function0(this) { // from class: hud.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StakingConfirmationController f155622b;

            {
                this.f155622b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                StakingConfirmationController stakingConfirmationController = this.f155622b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = StakingConfirmationController.f88105a0;
                        return (h) ((qud.d) stakingConfirmationController.Y.getValue()).f249390q.get();
                    case 1:
                        KProperty[] kPropertyArr2 = StakingConfirmationController.f88105a0;
                        phm.a aVar = (phm.a) ue0.e.j(stakingConfirmationController.m2()).a().get(qud.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", qud.c.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.staking.impl.declaration.di.StakingApiComponent");
                        return new qud.d(((qud.c) objB).f249379y, stakingConfirmationController, new StakingConfirmationControllerContract$InputData(stakingConfirmationController.K, stakingConfirmationController.L, stakingConfirmationController.M, stakingConfirmationController.N));
                    default:
                        KProperty[] kPropertyArr3 = StakingConfirmationController.f88105a0;
                        StakingConfirmationController stakingConfirmationController2 = this.f155622b;
                        return dli.f.a(stakingConfirmationController2, stakingConfirmationController2.R2(), v.k(new CellDetailsLoadingDelegate(), new ListCellDelegate(), new PlainTextWarningDelegate(), stakingConfirmationController2.P, stakingConfirmationController2.Q, stakingConfirmationController2.V, stakingConfirmationController2.U, stakingConfirmationController2.T), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.Y = w.y0(new Function0(this) { // from class: hud.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StakingConfirmationController f155622b;

            {
                this.f155622b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                StakingConfirmationController stakingConfirmationController = this.f155622b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = StakingConfirmationController.f88105a0;
                        return (h) ((qud.d) stakingConfirmationController.Y.getValue()).f249390q.get();
                    case 1:
                        KProperty[] kPropertyArr2 = StakingConfirmationController.f88105a0;
                        phm.a aVar = (phm.a) ue0.e.j(stakingConfirmationController.m2()).a().get(qud.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", qud.c.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.staking.impl.declaration.di.StakingApiComponent");
                        return new qud.d(((qud.c) objB).f249379y, stakingConfirmationController, new StakingConfirmationControllerContract$InputData(stakingConfirmationController.K, stakingConfirmationController.L, stakingConfirmationController.M, stakingConfirmationController.N));
                    default:
                        KProperty[] kPropertyArr3 = StakingConfirmationController.f88105a0;
                        StakingConfirmationController stakingConfirmationController2 = this.f155622b;
                        return dli.f.a(stakingConfirmationController2, stakingConfirmationController2.R2(), v.k(new CellDetailsLoadingDelegate(), new ListCellDelegate(), new PlainTextWarningDelegate(), stakingConfirmationController2.P, stakingConfirmationController2.Q, stakingConfirmationController2.V, stakingConfirmationController2.U, stakingConfirmationController2.T), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.Z = w.y0(new Function0(this) { // from class: hud.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StakingConfirmationController f155622b;

            {
                this.f155622b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                StakingConfirmationController stakingConfirmationController = this.f155622b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = StakingConfirmationController.f88105a0;
                        return (h) ((qud.d) stakingConfirmationController.Y.getValue()).f249390q.get();
                    case 1:
                        KProperty[] kPropertyArr2 = StakingConfirmationController.f88105a0;
                        phm.a aVar = (phm.a) ue0.e.j(stakingConfirmationController.m2()).a().get(qud.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", qud.c.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.staking.impl.declaration.di.StakingApiComponent");
                        return new qud.d(((qud.c) objB).f249379y, stakingConfirmationController, new StakingConfirmationControllerContract$InputData(stakingConfirmationController.K, stakingConfirmationController.L, stakingConfirmationController.M, stakingConfirmationController.N));
                    default:
                        KProperty[] kPropertyArr3 = StakingConfirmationController.f88105a0;
                        StakingConfirmationController stakingConfirmationController2 = this.f155622b;
                        return dli.f.a(stakingConfirmationController2, stakingConfirmationController2.R2(), v.k(new CellDetailsLoadingDelegate(), new ListCellDelegate(), new PlainTextWarningDelegate(), stakingConfirmationController2.P, stakingConfirmationController2.Q, stakingConfirmationController2.V, stakingConfirmationController2.U, stakingConfirmationController2.T), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        ActionFooterView actionFooterView = d3().f229858b;
        TextLocalisedClause textLocalisedClause = uiState.f155630a;
        MoneyClause moneyClause = uiState.d;
        actionFooterView.setModel(new e(true, null, null, new n6(textLocalisedClause, LargeActionButton.ButtonStyle.f58725a, null, null, uiState.f155631b, null, null, 988), null, null, 54));
        NavBarWithToolbar navBarWithToolbar = d3().f229859c;
        if (uiState.f155632c) {
            t3 t3Var = t3.DEFAULT;
            NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
            navBarWithToolbar.I0(t3Var, false);
        } else {
            navBarWithToolbar.l0();
            navBarWithToolbar.setTitle(moneyClause, null);
            navBarWithToolbar.setToolbarTitle(moneyClause);
            navBarWithToolbar.setDescriptionText(uiState.f);
            navBarWithToolbar.setDescriptionVisible(true);
            navBarWithToolbar.setEndImage(new r3(new yy0.j(uiState.e)));
            Clause clause = uiState.f155633g;
            if (clause != null) {
                navBarWithToolbar.setHeaderDisclaimerSticky(clause);
            }
        }
        Intrinsics.checkNotNullParameter(uiState, "uiState");
    }

    @Override // mga.i0
    public final r N0() {
        return this.V.f52437c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (qud.d) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) ((qud.d) this.Y.getValue()).e.get()).d(v.k(new CellDetailsDelegate(), this.S, this.R));
        d3().f229859c.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    @Override // mga.i0
    public final r a2() {
        return this.U.f53218h;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f229859c.f59410q), null, new c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b((f) d3().f229859c.f59406n.f258290b), null, new hud.d(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.d), null, new hud.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.f), null, new hud.f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.R.d.f121375b), null, new g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.S.d.f121375b), null, new hud.d(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.T.d), null, new hud.d(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f229858b.f), null, new c(this, continuation, 1), 3);
    }

    public final oud.b d3() {
        ViewBinding value = this.O.getValue(this, f88105a0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (oud.b) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final hud.h R2() {
        return (hud.h) this.X.getValue();
    }

    @Override // mga.l0
    public final View g0() {
        ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = d3().f229857a;
        Intrinsics.checkNotNullExpressionValue(controllerContainerCoordinatorLayout, "getRoot(...)");
        return controllerContainerCoordinatorLayout;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.W;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Z.getValue();
    }
}
