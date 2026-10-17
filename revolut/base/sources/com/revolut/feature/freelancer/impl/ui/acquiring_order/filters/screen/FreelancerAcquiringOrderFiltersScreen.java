package com.revolut.feature.freelancer.impl.ui.acquiring_order.filters.screen;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.freelancer.impl.R$id;
import com.revolut.feature.freelancer.impl.R$layout;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.feature.freelancer.impl.ui.acquiring_order.filters.screen.FreelancerAcquiringOrderFiltersScreen;
import com.revolut.feature.freelancer.impl.ui.acquiring_order.filters.screen.FreelancerAcquiringOrderFiltersScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lu6.b;
import lu6.d;
import lu6.f;
import lu6.i;
import lu6.j;
import lu6.m;
import lu6.n;
import te0.w;
import tki.c;
import us6.g;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/acquiring_order/filters/screen/FreelancerAcquiringOrderFiltersScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Llu6/m;", "Ltki/c;", "Llu6/o;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FreelancerAcquiringOrderFiltersScreen extends ViewController<m> implements c {
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new h0(FreelancerAcquiringOrderFiltersScreen.class, "binding", "getBinding()Lcom/revolut/feature/freelancer/impl/databinding/ScreenFreelancerSalesFiltersBinding;", 0))};
    public final FreelancerAcquiringOrderFiltersScreenContract$InputData K;
    public final h L;
    public final int M;
    public final ActionsDelegate N;
    public final InputTextDelegate O;
    public final ListSubheaderDelegate P;
    public final FullScreenStateDelegate Q;
    public final RowDelegate R;
    public final SelectableDelegate S;
    public final koi.h T;
    public final Object U;
    public final Object V;
    public final Object W;

    public FreelancerAcquiringOrderFiltersScreen(FreelancerAcquiringOrderFiltersScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        this.M = R$layout.screen_freelancer_sales_filters;
        this.N = new ActionsDelegate();
        this.O = new InputTextDelegate(null);
        this.P = new ListSubheaderDelegate();
        this.Q = new FullScreenStateDelegate();
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.R = rowDelegate;
        this.S = new SelectableDelegate(rowDelegate);
        this.T = new koi.h(null, false, false, 1);
        final int i = 0;
        this.U = w.y0(new Function0(this) { // from class: lu6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerAcquiringOrderFiltersScreen f200043b;

            {
                this.f200043b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                FreelancerAcquiringOrderFiltersScreen freelancerAcquiringOrderFiltersScreen = this.f200043b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerAcquiringOrderFiltersScreen.X;
                        qji.b bVarU2 = freelancerAcquiringOrderFiltersScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.acquiring_order.filters.screen.di.FreelancerAcquiringOrderFiltersScreenInjector");
                        us6.h hVar = (us6.h) bVarU2;
                        us6.q qVar = hVar.f282559b;
                        us6.h hVar2 = hVar.f282560c;
                        FreelancerAcquiringOrderFiltersScreenContract$InputData freelancerAcquiringOrderFiltersScreenContract$InputData = freelancerAcquiringOrderFiltersScreen.K;
                        freelancerAcquiringOrderFiltersScreenContract$InputData.getClass();
                        return new us6.g(qVar, hVar2, freelancerAcquiringOrderFiltersScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerAcquiringOrderFiltersScreen.X;
                        return (n) ((us6.g) freelancerAcquiringOrderFiltersScreen.U.getValue()).f282545c.get();
                    default:
                        KProperty[] kPropertyArr3 = FreelancerAcquiringOrderFiltersScreen.X;
                        FreelancerAcquiringOrderFiltersScreen freelancerAcquiringOrderFiltersScreen2 = this.f200043b;
                        return tki.g.a(freelancerAcquiringOrderFiltersScreen2, freelancerAcquiringOrderFiltersScreen2.R2(), v.k(new RowLoadingDelegate(), freelancerAcquiringOrderFiltersScreen2.N, freelancerAcquiringOrderFiltersScreen2.Q, freelancerAcquiringOrderFiltersScreen2.O, freelancerAcquiringOrderFiltersScreen2.P, freelancerAcquiringOrderFiltersScreen2.R, freelancerAcquiringOrderFiltersScreen2.S), R$id.freelancerSalesFilters_recyclerView, new lu5.o(freelancerAcquiringOrderFiltersScreen2, 1), freelancerAcquiringOrderFiltersScreen2.T, null, 32);
                }
            }
        });
        final int i2 = 1;
        this.V = w.y0(new Function0(this) { // from class: lu6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerAcquiringOrderFiltersScreen f200043b;

            {
                this.f200043b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                FreelancerAcquiringOrderFiltersScreen freelancerAcquiringOrderFiltersScreen = this.f200043b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerAcquiringOrderFiltersScreen.X;
                        qji.b bVarU2 = freelancerAcquiringOrderFiltersScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.acquiring_order.filters.screen.di.FreelancerAcquiringOrderFiltersScreenInjector");
                        us6.h hVar = (us6.h) bVarU2;
                        us6.q qVar = hVar.f282559b;
                        us6.h hVar2 = hVar.f282560c;
                        FreelancerAcquiringOrderFiltersScreenContract$InputData freelancerAcquiringOrderFiltersScreenContract$InputData = freelancerAcquiringOrderFiltersScreen.K;
                        freelancerAcquiringOrderFiltersScreenContract$InputData.getClass();
                        return new us6.g(qVar, hVar2, freelancerAcquiringOrderFiltersScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerAcquiringOrderFiltersScreen.X;
                        return (n) ((us6.g) freelancerAcquiringOrderFiltersScreen.U.getValue()).f282545c.get();
                    default:
                        KProperty[] kPropertyArr3 = FreelancerAcquiringOrderFiltersScreen.X;
                        FreelancerAcquiringOrderFiltersScreen freelancerAcquiringOrderFiltersScreen2 = this.f200043b;
                        return tki.g.a(freelancerAcquiringOrderFiltersScreen2, freelancerAcquiringOrderFiltersScreen2.R2(), v.k(new RowLoadingDelegate(), freelancerAcquiringOrderFiltersScreen2.N, freelancerAcquiringOrderFiltersScreen2.Q, freelancerAcquiringOrderFiltersScreen2.O, freelancerAcquiringOrderFiltersScreen2.P, freelancerAcquiringOrderFiltersScreen2.R, freelancerAcquiringOrderFiltersScreen2.S), R$id.freelancerSalesFilters_recyclerView, new lu5.o(freelancerAcquiringOrderFiltersScreen2, 1), freelancerAcquiringOrderFiltersScreen2.T, null, 32);
                }
            }
        });
        final int i3 = 2;
        this.W = w.y0(new Function0(this) { // from class: lu6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerAcquiringOrderFiltersScreen f200043b;

            {
                this.f200043b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                FreelancerAcquiringOrderFiltersScreen freelancerAcquiringOrderFiltersScreen = this.f200043b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerAcquiringOrderFiltersScreen.X;
                        qji.b bVarU2 = freelancerAcquiringOrderFiltersScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.acquiring_order.filters.screen.di.FreelancerAcquiringOrderFiltersScreenInjector");
                        us6.h hVar = (us6.h) bVarU2;
                        us6.q qVar = hVar.f282559b;
                        us6.h hVar2 = hVar.f282560c;
                        FreelancerAcquiringOrderFiltersScreenContract$InputData freelancerAcquiringOrderFiltersScreenContract$InputData = freelancerAcquiringOrderFiltersScreen.K;
                        freelancerAcquiringOrderFiltersScreenContract$InputData.getClass();
                        return new us6.g(qVar, hVar2, freelancerAcquiringOrderFiltersScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerAcquiringOrderFiltersScreen.X;
                        return (n) ((us6.g) freelancerAcquiringOrderFiltersScreen.U.getValue()).f282545c.get();
                    default:
                        KProperty[] kPropertyArr3 = FreelancerAcquiringOrderFiltersScreen.X;
                        FreelancerAcquiringOrderFiltersScreen freelancerAcquiringOrderFiltersScreen2 = this.f200043b;
                        return tki.g.a(freelancerAcquiringOrderFiltersScreen2, freelancerAcquiringOrderFiltersScreen2.R2(), v.k(new RowLoadingDelegate(), freelancerAcquiringOrderFiltersScreen2.N, freelancerAcquiringOrderFiltersScreen2.Q, freelancerAcquiringOrderFiltersScreen2.O, freelancerAcquiringOrderFiltersScreen2.P, freelancerAcquiringOrderFiltersScreen2.R, freelancerAcquiringOrderFiltersScreen2.S), R$id.freelancerSalesFilters_recyclerView, new lu5.o(freelancerAcquiringOrderFiltersScreen2, 1), freelancerAcquiringOrderFiltersScreen2.T, null, 32);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        lu6.o uiState = (lu6.o) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f257028c.setMenuItems(uiState.f200052b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f257028c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.freelancer_common_word_filters, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.freelancer_common_word_filters, null, null, 14));
        d3().f257027b.setText(new TextLocalisedClause(R$string.freelancer_sales_filters_common_action_apply_filters, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f257028c.f59410q), new d(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f257028c.o.f57403b), new lph.h(this, continuation, 6), 3);
        ViewController.P2(this, rd0.e.b(d3().f257027b.o), new d(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.P.f52707c), new lu6.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.O.e.f121375b), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f52371h.f121375b), new lu6.g(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.S.r()), new lu6.h(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.R.f53218h), new i(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.N.f51611c.f121375b), new j(this, null), 3);
    }

    public final rs6.d d3() {
        ViewBinding value = this.L.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (rs6.d) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final n R2() {
        return (n) this.V.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.W.getValue();
    }
}
