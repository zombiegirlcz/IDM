package com.revolut.feature.freelancer.impl.ui.sales.details.kompot.screen;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.e4;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.freelancer.impl.ui.sales.details.kompot.screen.FreelancerSaleDetailsScreen;
import com.revolut.feature.freelancer.impl.ui.sales.details.kompot.screen.FreelancerSaleDetailsScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nuh.j;
import o17.c;
import o17.d;
import o17.f;
import o17.g;
import o17.l;
import o17.n;
import te0.w;
import us6.x0;
import us6.y0;
import vc.s;
import xki.e;
import yy0.i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/sales/details/kompot/screen/FreelancerSaleDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lo17/l;", "Ldli/a;", "Lo17/o;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FreelancerSaleDetailsScreen extends ViewController<l> implements dli.a {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(FreelancerSaleDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final FreelancerSaleDetailsScreenContract$InputData K;
    public final int L;
    public final h M;
    public final CellDetailsChevronDelegate N;
    public final FullScreenStateDelegate O;
    public final PlainTextWarningDelegate P;
    public final ProgressStepVerticalDelegate Q;
    public final RowDelegate R;
    public final Object S;
    public final Object T;
    public final Object U;

    public FreelancerSaleDetailsScreen(FreelancerSaleDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = s.t(this, o17.b.f);
        this.N = new CellDetailsChevronDelegate();
        this.O = new FullScreenStateDelegate();
        this.P = new PlainTextWarningDelegate();
        this.Q = new ProgressStepVerticalDelegate();
        this.R = new RowDelegate(null, null, 7);
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: o17.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerSaleDetailsScreen f221315b;

            {
                this.f221315b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                FreelancerSaleDetailsScreen freelancerSaleDetailsScreen = this.f221315b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerSaleDetailsScreen.V;
                        qji.b bVarU2 = freelancerSaleDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.sales.details.kompot.screen.di.FreelancerSaleDetailsScreenInjector");
                        x0 x0Var = (x0) bVarU2;
                        us6.q qVar = x0Var.f282798b;
                        x0 x0Var2 = x0Var.f282799c;
                        FreelancerSaleDetailsScreenContract$InputData freelancerSaleDetailsScreenContract$InputData = freelancerSaleDetailsScreen.K;
                        freelancerSaleDetailsScreenContract$InputData.getClass();
                        return new y0(qVar, x0Var2, freelancerSaleDetailsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerSaleDetailsScreen.V;
                        return (m) ((y0) freelancerSaleDetailsScreen.S.getValue()).f282811c.get();
                    default:
                        KProperty[] kPropertyArr3 = FreelancerSaleDetailsScreen.V;
                        FreelancerSaleDetailsScreen freelancerSaleDetailsScreen2 = this.f221315b;
                        return dli.f.a(freelancerSaleDetailsScreen2, freelancerSaleDetailsScreen2.d(), zhm.v.k(new CellDetailsDelegate(), freelancerSaleDetailsScreen2.N, new CellDetailsNoteDelegate(), freelancerSaleDetailsScreen2.O, new ListSubheaderDelegate(), new PlainTextDelegate(), freelancerSaleDetailsScreen2.P, freelancerSaleDetailsScreen2.Q, freelancerSaleDetailsScreen2.R, new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: o17.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerSaleDetailsScreen f221315b;

            {
                this.f221315b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                FreelancerSaleDetailsScreen freelancerSaleDetailsScreen = this.f221315b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerSaleDetailsScreen.V;
                        qji.b bVarU2 = freelancerSaleDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.sales.details.kompot.screen.di.FreelancerSaleDetailsScreenInjector");
                        x0 x0Var = (x0) bVarU2;
                        us6.q qVar = x0Var.f282798b;
                        x0 x0Var2 = x0Var.f282799c;
                        FreelancerSaleDetailsScreenContract$InputData freelancerSaleDetailsScreenContract$InputData = freelancerSaleDetailsScreen.K;
                        freelancerSaleDetailsScreenContract$InputData.getClass();
                        return new y0(qVar, x0Var2, freelancerSaleDetailsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerSaleDetailsScreen.V;
                        return (m) ((y0) freelancerSaleDetailsScreen.S.getValue()).f282811c.get();
                    default:
                        KProperty[] kPropertyArr3 = FreelancerSaleDetailsScreen.V;
                        FreelancerSaleDetailsScreen freelancerSaleDetailsScreen2 = this.f221315b;
                        return dli.f.a(freelancerSaleDetailsScreen2, freelancerSaleDetailsScreen2.d(), zhm.v.k(new CellDetailsDelegate(), freelancerSaleDetailsScreen2.N, new CellDetailsNoteDelegate(), freelancerSaleDetailsScreen2.O, new ListSubheaderDelegate(), new PlainTextDelegate(), freelancerSaleDetailsScreen2.P, freelancerSaleDetailsScreen2.Q, freelancerSaleDetailsScreen2.R, new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: o17.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerSaleDetailsScreen f221315b;

            {
                this.f221315b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                FreelancerSaleDetailsScreen freelancerSaleDetailsScreen = this.f221315b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerSaleDetailsScreen.V;
                        qji.b bVarU2 = freelancerSaleDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.sales.details.kompot.screen.di.FreelancerSaleDetailsScreenInjector");
                        x0 x0Var = (x0) bVarU2;
                        us6.q qVar = x0Var.f282798b;
                        x0 x0Var2 = x0Var.f282799c;
                        FreelancerSaleDetailsScreenContract$InputData freelancerSaleDetailsScreenContract$InputData = freelancerSaleDetailsScreen.K;
                        freelancerSaleDetailsScreenContract$InputData.getClass();
                        return new y0(qVar, x0Var2, freelancerSaleDetailsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerSaleDetailsScreen.V;
                        return (m) ((y0) freelancerSaleDetailsScreen.S.getValue()).f282811c.get();
                    default:
                        KProperty[] kPropertyArr3 = FreelancerSaleDetailsScreen.V;
                        FreelancerSaleDetailsScreen freelancerSaleDetailsScreen2 = this.f221315b;
                        return dli.f.a(freelancerSaleDetailsScreen2, freelancerSaleDetailsScreen2.d(), zhm.v.k(new CellDetailsDelegate(), freelancerSaleDetailsScreen2.N, new CellDetailsNoteDelegate(), freelancerSaleDetailsScreen2.O, new ListSubheaderDelegate(), new PlainTextDelegate(), freelancerSaleDetailsScreen2.P, freelancerSaleDetailsScreen2.Q, freelancerSaleDetailsScreen2.R, new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        o17.o uiState = (o17.o) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        n nVar = uiState.f221330a;
        Clause clause = nVar.f221327a;
        yy0.l lVarA = null;
        navBarWithToolbar.setTitle(clause, null);
        List<ActionsView.Item> list = nVar.e;
        Clause clause2 = nVar.f221329c;
        Clause clause3 = nVar.f221328b;
        if (clause != null) {
            navBarWithToolbar.setToolbarTitle(clause);
        }
        if (clause3 != null) {
            navBarWithToolbar.setDescriptionText(clause3);
        }
        navBarWithToolbar.setDescriptionVisible(clause3 != null);
        navBarWithToolbar.setSecondDescriptionText(clause2);
        navBarWithToolbar.setSecondDescriptionVisible(clause2 != null);
        Image image = nVar.d;
        if (image != null) {
            yy0.l.Companion.getClass();
            lVarA = i.a(image);
        }
        navBarWithToolbar.setEndImage(lVarA);
        navBarWithToolbar.setFilters(list);
        navBarWithToolbar.setFiltersState(list.isEmpty() ? e4.GONE : e4.ACTIVE);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (y0) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new j(this, continuation, 8), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.s0()), new c(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.N.f51821c), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.O.f52371h.f121375b), new o17.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.P.d.f121375b), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.Q.d), new nwc.f(this, continuation, 12), 3);
        ViewController.P2(this, rd0.e.b(this.R.f53218h), new g(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.M.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final o17.m d() {
        return (o17.m) this.T.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.U.getValue();
    }
}
