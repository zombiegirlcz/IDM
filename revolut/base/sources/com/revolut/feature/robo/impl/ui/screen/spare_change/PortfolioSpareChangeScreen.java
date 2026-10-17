package com.revolut.feature.robo.impl.ui.screen.spare_change;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RadialSliderDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.TwinHorizontalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.robo.impl.ui.screen.spare_change.PortfolioSpareChangeScreen;
import com.revolut.feature.robo.impl.ui.screen.spare_change.PortfolioSpareChangeScreenContract$Input;
import com.revolut.kompot.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.wealth.resources.R$string;
import dli.a;
import efm.r;
import jii.v;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rr0.f;
import te0.w;
import tx0.g4;
import unc.b;
import unc.b0;
import unc.c;
import unc.d;
import unc.i;
import unc.j;
import unc.k;
import unc.l;
import unc.m;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/robo/impl/ui/screen/spare_change/PortfolioSpareChangeScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lunc/o;", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PortfolioSpareChangeScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new h0(PortfolioSpareChangeScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarTwinHorizontalButtonsBinding;", 0))};
    public final PortfolioSpareChangeScreenContract$Input K;
    public final Object L;
    public final Object M;
    public final int N;
    public final h O;
    public final CellDetailsDelegate P;
    public final ListSubheaderDelegate Q;
    public final RadialSliderDelegate R;
    public final RowLoadingDelegate S;
    public f T;
    public f U;
    public final Object V;
    public final LargeActionButtonDelegate W;

    public PortfolioSpareChangeScreen(PortfolioSpareChangeScreenContract$Input input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.K = input;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: unc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PortfolioSpareChangeScreen f281387b;

            {
                this.f281387b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PortfolioSpareChangeScreen portfolioSpareChangeScreen = this.f281387b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PortfolioSpareChangeScreen.X;
                        phm.a aVar = (phm.a) ue0.e.j(portfolioSpareChangeScreen.m2()).a().get(dmc.r.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dmc.r.class, " is not found"));
                        }
                        dmc.r rVar = ((dmc.r) aVar2.b()).f116039s;
                        PortfolioSpareChangeScreenContract$Input portfolioSpareChangeScreenContract$Input = portfolioSpareChangeScreen.K;
                        portfolioSpareChangeScreenContract$Input.getClass();
                        return new dmc.l(rVar, portfolioSpareChangeScreen, portfolioSpareChangeScreenContract$Input);
                    case 1:
                        KProperty[] kPropertyArr2 = PortfolioSpareChangeScreen.X;
                        return (b0) ((dmc.l) portfolioSpareChangeScreen.L.getValue()).f115999g.get();
                    default:
                        KProperty[] kPropertyArr3 = PortfolioSpareChangeScreen.X;
                        PortfolioSpareChangeScreen portfolioSpareChangeScreen2 = this.f281387b;
                        return dli.f.a(portfolioSpareChangeScreen2, portfolioSpareChangeScreen2.R2(), zhm.v.k(portfolioSpareChangeScreen2.P, portfolioSpareChangeScreen2.Q, portfolioSpareChangeScreen2.R, portfolioSpareChangeScreen2.S), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: unc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PortfolioSpareChangeScreen f281387b;

            {
                this.f281387b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PortfolioSpareChangeScreen portfolioSpareChangeScreen = this.f281387b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PortfolioSpareChangeScreen.X;
                        phm.a aVar = (phm.a) ue0.e.j(portfolioSpareChangeScreen.m2()).a().get(dmc.r.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dmc.r.class, " is not found"));
                        }
                        dmc.r rVar = ((dmc.r) aVar2.b()).f116039s;
                        PortfolioSpareChangeScreenContract$Input portfolioSpareChangeScreenContract$Input = portfolioSpareChangeScreen.K;
                        portfolioSpareChangeScreenContract$Input.getClass();
                        return new dmc.l(rVar, portfolioSpareChangeScreen, portfolioSpareChangeScreenContract$Input);
                    case 1:
                        KProperty[] kPropertyArr2 = PortfolioSpareChangeScreen.X;
                        return (b0) ((dmc.l) portfolioSpareChangeScreen.L.getValue()).f115999g.get();
                    default:
                        KProperty[] kPropertyArr3 = PortfolioSpareChangeScreen.X;
                        PortfolioSpareChangeScreen portfolioSpareChangeScreen2 = this.f281387b;
                        return dli.f.a(portfolioSpareChangeScreen2, portfolioSpareChangeScreen2.R2(), zhm.v.k(portfolioSpareChangeScreen2.P, portfolioSpareChangeScreen2.Q, portfolioSpareChangeScreen2.R, portfolioSpareChangeScreen2.S), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.N = R$layout.screen_recycler_navbar_twin_horizontal_buttons;
        this.O = s.t(this, b.f);
        this.P = new CellDetailsDelegate();
        this.Q = new ListSubheaderDelegate();
        this.R = new RadialSliderDelegate();
        this.S = new RowLoadingDelegate();
        final int i3 = 2;
        this.V = w.y0(new Function0(this) { // from class: unc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PortfolioSpareChangeScreen f281387b;

            {
                this.f281387b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PortfolioSpareChangeScreen portfolioSpareChangeScreen = this.f281387b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PortfolioSpareChangeScreen.X;
                        phm.a aVar = (phm.a) ue0.e.j(portfolioSpareChangeScreen.m2()).a().get(dmc.r.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dmc.r.class, " is not found"));
                        }
                        dmc.r rVar = ((dmc.r) aVar2.b()).f116039s;
                        PortfolioSpareChangeScreenContract$Input portfolioSpareChangeScreenContract$Input = portfolioSpareChangeScreen.K;
                        portfolioSpareChangeScreenContract$Input.getClass();
                        return new dmc.l(rVar, portfolioSpareChangeScreen, portfolioSpareChangeScreenContract$Input);
                    case 1:
                        KProperty[] kPropertyArr2 = PortfolioSpareChangeScreen.X;
                        return (b0) ((dmc.l) portfolioSpareChangeScreen.L.getValue()).f115999g.get();
                    default:
                        KProperty[] kPropertyArr3 = PortfolioSpareChangeScreen.X;
                        PortfolioSpareChangeScreen portfolioSpareChangeScreen2 = this.f281387b;
                        return dli.f.a(portfolioSpareChangeScreen2, portfolioSpareChangeScreen2.R2(), zhm.v.k(portfolioSpareChangeScreen2.P, portfolioSpareChangeScreen2.Q, portfolioSpareChangeScreen2.R, portfolioSpareChangeScreen2.S), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.W = new LargeActionButtonDelegate();
    }

    public static void f3(l lVar, Function1 function1, Function1 function12, f fVar, Function1 function13) {
        if (lVar.equals(i.f281397a)) {
            function1.invoke(Boolean.FALSE);
            if (fVar != null) {
                fVar.b(false);
                return;
            }
            return;
        }
        if (lVar.equals(j.f281398a)) {
            Boolean bool = Boolean.TRUE;
            function1.invoke(bool);
            function12.invoke(bool);
            if (fVar != null) {
                fVar.b(true);
                return;
            }
            return;
        }
        if (!(lVar instanceof k)) {
            throw new NoWhenBranchMatchedException();
        }
        function1.invoke(Boolean.TRUE);
        k kVar = (k) lVar;
        function12.invoke(Boolean.valueOf(kVar.f281400b));
        if (fVar != null) {
            fVar.b(false);
        }
        function13.invoke(kVar.f281399a);
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        unc.o uiState = (unc.o) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        TwinHorizontalButton twinHorizontalButton = d3().d;
        m mVar = uiState.f281406c;
        int i = 0;
        int i2 = 1;
        f3(mVar.f281401a, new g4(i2, twinHorizontalButton, TwinHorizontalButton.class, "setPrimaryButtonVisible", "setPrimaryButtonVisible(Z)V", i, 16), new g4(i2, twinHorizontalButton, TwinHorizontalButton.class, "setPrimaryButtonEnabled", "setPrimaryButtonEnabled(Z)V", i, 17), this.T, new g4(i2, twinHorizontalButton, TwinHorizontalButton.class, "setPrimaryButtonText", "setPrimaryButtonText(Lcom/revolut/core/ui_kit/models/Clause;)V", i, 18));
        f3(mVar.f281402b, new g4(i2, twinHorizontalButton, TwinHorizontalButton.class, "setSecondaryButtonVisible", "setSecondaryButtonVisible(Z)V", i, 19), new g4(i2, twinHorizontalButton, TwinHorizontalButton.class, "setSecondaryButtonEnabled", "setSecondaryButtonEnabled(Z)V", i, 20), this.U, new g4(i2, twinHorizontalButton, TwinHorizontalButton.class, "setSecondaryButtonText", "setSecondaryButtonText(Lcom/revolut/core/ui_kit/models/Clause;)V", i, 21));
        NavBarWithToolbar navBarWithToolbar = d3().f174567b;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.wealth_robo_spare_change_screen_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.wealth_robo_spare_change_screen_title, null, null, 14));
        Clause clause = uiState.f281404a.f281403a;
        navBarWithToolbar.setDescriptionText(clause);
        navBarWithToolbar.setLoadingVisible(clause == null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (dmc.l) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174567b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back));
        navBarWithToolbar.setDescriptionVisible(true);
        TwinHorizontalButton twinHorizontalButton = d3().d;
        twinHorizontalButton.setPrimaryButtonStyle(LargeActionButton.ButtonStyle.f58726b);
        twinHorizontalButton.setSecondaryButtonStyle(LargeActionButton.ButtonStyle.f58725a);
        ((j60.a) ((dmc.l) this.L.getValue()).e.get()).d(u.c(this.W));
        this.T = d3().d.a();
        this.U = d3().d.b();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174567b.f59410q), null, new c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().d.d()), null, new c(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().d.c()), null, new c(this, continuation, 2), 3);
        r rVarDistinctUntilChanged = this.R.f53138c.hide().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarDistinctUntilChanged), null, new d(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.a0(this.W.d.f121375b, new umc.c(7))), null, new d(this, continuation, 1), 3);
    }

    public final v d3() {
        ViewBinding value = this.O.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (v) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final b0 R2() {
        return (b0) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.V.getValue();
    }
}
