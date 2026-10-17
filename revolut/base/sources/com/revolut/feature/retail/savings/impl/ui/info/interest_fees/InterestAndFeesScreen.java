package com.revolut.feature.retail.savings.impl.ui.info.interest_fees;

import aii.q;
import anb.g;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.retail.savings.impl.ui.info.interest_fees.InterestAndFeesScreen;
import com.revolut.feature.retail.savings.impl.ui.info.interest_fees.InterestAndFeesScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import g85.f;
import gpb.b;
import gpb.c;
import gpb.i;
import gpb.j;
import gpb.k;
import gpb.l;
import gpb.m;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.j0;
import tx0.t3;
import vc.s;
import vkm.d;
import xki.e;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/savings/impl/ui/info/interest_fees/InterestAndFeesScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lgpb/m;", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InterestAndFeesScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(InterestAndFeesScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final InterestAndFeesScreenContract$InputData K;
    public final RowDelegate L;
    public final CellDetailsDelegate M;
    public final LargeActionButtonDelegate N;
    public final FullScreenStateDelegate O;
    public final h P;
    public final Object Q;
    public final boolean R;
    public final int S;
    public final Object T;
    public final Object U;
    public final Object V;

    public InterestAndFeesScreen(InterestAndFeesScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = new RowDelegate(null, null, 7);
        this.M = new CellDetailsDelegate();
        this.N = new LargeActionButtonDelegate();
        this.O = new FullScreenStateDelegate();
        this.P = s.t(this, b.f);
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: gpb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterestAndFeesScreen f145413b;

            {
                this.f145413b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                InterestAndFeesScreen interestAndFeesScreen = this.f145413b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = InterestAndFeesScreen.W;
                        return (j60.a) ((anb.g) interestAndFeesScreen.U.getValue()).f.get();
                    case 1:
                        KProperty[] kPropertyArr2 = InterestAndFeesScreen.W;
                        return (h) ((anb.g) interestAndFeesScreen.U.getValue()).f6642h.get();
                    case 2:
                        KProperty[] kPropertyArr3 = InterestAndFeesScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(interestAndFeesScreen.m2()).a().get(nib.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", nib.c.class, " is not found"));
                        }
                        anb.n nVar = ((anb.n) aVar2.b()).F;
                        InterestAndFeesScreenContract$InputData interestAndFeesScreenContract$InputData = interestAndFeesScreen.K;
                        interestAndFeesScreenContract$InputData.getClass();
                        return new anb.g(nVar, interestAndFeesScreen, interestAndFeesScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = InterestAndFeesScreen.W;
                        InterestAndFeesScreen interestAndFeesScreen2 = this.f145413b;
                        return dli.f.a(interestAndFeesScreen2, (h) interestAndFeesScreen2.T.getValue(), v.k(interestAndFeesScreen2.L, interestAndFeesScreen2.M, interestAndFeesScreen2.O, new PlainTextDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new PlainTextLoadingDelegate(), new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        this.R = true;
        this.S = R$layout.screen_recycler_navbar;
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: gpb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterestAndFeesScreen f145413b;

            {
                this.f145413b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                InterestAndFeesScreen interestAndFeesScreen = this.f145413b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InterestAndFeesScreen.W;
                        return (j60.a) ((anb.g) interestAndFeesScreen.U.getValue()).f.get();
                    case 1:
                        KProperty[] kPropertyArr2 = InterestAndFeesScreen.W;
                        return (h) ((anb.g) interestAndFeesScreen.U.getValue()).f6642h.get();
                    case 2:
                        KProperty[] kPropertyArr3 = InterestAndFeesScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(interestAndFeesScreen.m2()).a().get(nib.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", nib.c.class, " is not found"));
                        }
                        anb.n nVar = ((anb.n) aVar2.b()).F;
                        InterestAndFeesScreenContract$InputData interestAndFeesScreenContract$InputData = interestAndFeesScreen.K;
                        interestAndFeesScreenContract$InputData.getClass();
                        return new anb.g(nVar, interestAndFeesScreen, interestAndFeesScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = InterestAndFeesScreen.W;
                        InterestAndFeesScreen interestAndFeesScreen2 = this.f145413b;
                        return dli.f.a(interestAndFeesScreen2, (h) interestAndFeesScreen2.T.getValue(), v.k(interestAndFeesScreen2.L, interestAndFeesScreen2.M, interestAndFeesScreen2.O, new PlainTextDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new PlainTextLoadingDelegate(), new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: gpb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterestAndFeesScreen f145413b;

            {
                this.f145413b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                InterestAndFeesScreen interestAndFeesScreen = this.f145413b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InterestAndFeesScreen.W;
                        return (j60.a) ((anb.g) interestAndFeesScreen.U.getValue()).f.get();
                    case 1:
                        KProperty[] kPropertyArr2 = InterestAndFeesScreen.W;
                        return (h) ((anb.g) interestAndFeesScreen.U.getValue()).f6642h.get();
                    case 2:
                        KProperty[] kPropertyArr3 = InterestAndFeesScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(interestAndFeesScreen.m2()).a().get(nib.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", nib.c.class, " is not found"));
                        }
                        anb.n nVar = ((anb.n) aVar2.b()).F;
                        InterestAndFeesScreenContract$InputData interestAndFeesScreenContract$InputData = interestAndFeesScreen.K;
                        interestAndFeesScreenContract$InputData.getClass();
                        return new anb.g(nVar, interestAndFeesScreen, interestAndFeesScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = InterestAndFeesScreen.W;
                        InterestAndFeesScreen interestAndFeesScreen2 = this.f145413b;
                        return dli.f.a(interestAndFeesScreen2, (h) interestAndFeesScreen2.T.getValue(), v.k(interestAndFeesScreen2.L, interestAndFeesScreen2.M, interestAndFeesScreen2.O, new PlainTextDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new PlainTextLoadingDelegate(), new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i5 = 3;
        this.V = w.y0(new Function0(this) { // from class: gpb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterestAndFeesScreen f145413b;

            {
                this.f145413b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                InterestAndFeesScreen interestAndFeesScreen = this.f145413b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InterestAndFeesScreen.W;
                        return (j60.a) ((anb.g) interestAndFeesScreen.U.getValue()).f.get();
                    case 1:
                        KProperty[] kPropertyArr2 = InterestAndFeesScreen.W;
                        return (h) ((anb.g) interestAndFeesScreen.U.getValue()).f6642h.get();
                    case 2:
                        KProperty[] kPropertyArr3 = InterestAndFeesScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(interestAndFeesScreen.m2()).a().get(nib.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", nib.c.class, " is not found"));
                        }
                        anb.n nVar = ((anb.n) aVar2.b()).F;
                        InterestAndFeesScreenContract$InputData interestAndFeesScreenContract$InputData = interestAndFeesScreen.K;
                        interestAndFeesScreenContract$InputData.getClass();
                        return new anb.g(nVar, interestAndFeesScreen, interestAndFeesScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = InterestAndFeesScreen.W;
                        InterestAndFeesScreen interestAndFeesScreen2 = this.f145413b;
                        return dli.f.a(interestAndFeesScreen2, (h) interestAndFeesScreen2.T.getValue(), v.k(interestAndFeesScreen2.L, interestAndFeesScreen2.M, interestAndFeesScreen2.O, new PlainTextDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new PlainTextLoadingDelegate(), new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        m uiState = (m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        l lVar = uiState.f145420a;
        if (lVar instanceof k) {
            NavBarWithToolbar navBarWithToolbar = d3().f174539b;
            Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
            t3 t3Var = t3.DEFAULT;
            NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
            navBarWithToolbar.I0(t3Var, false);
            return;
        }
        if (lVar instanceof j) {
            d3().f174539b.l0();
            return;
        }
        if (!(lVar instanceof i)) {
            throw new NoWhenBranchMatchedException();
        }
        NavBarWithToolbar navBarWithToolbar2 = d3().f174539b;
        navBarWithToolbar2.l0();
        TextLocalisedClause textLocalisedClause = ((i) lVar).f145417a;
        navBarWithToolbar2.setTitle(textLocalisedClause, null);
        navBarWithToolbar2.setToolbarTitle(textLocalisedClause);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g) this.U.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (gpb.h) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174538a.setBackground(null);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        ((j60.a) this.Q.getValue()).d(u.c(this.N));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new f(this, null, 24), 3);
        d dVarB = rd0.e.b(this.M.d);
        ?? r06 = this.T;
        com.revolut.kompot.navigable.a.g2(this, dVarB, null, new c(2, 4, gpb.h.class, (gpb.h) r06.getValue(), "onCellDetailsClick", "onCellDetailsClick(Lcom/revolut/core/ui_kit/delegates/CellDetailsDelegate$Model;)V"), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.d.f121375b), null, new gpb.d(2, 4, gpb.h.class, (gpb.h) r06.getValue(), "onLargeActionButtonClick", "onLargeActionButtonClick(Lcom/revolut/core/ui_kit/delegates/LargeActionButtonDelegate$Model;)V"), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.f52371h.f121375b), null, new gpb.e(this, null), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.P.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.S;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.V.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.R);
    }
}
