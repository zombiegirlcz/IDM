package com.revolut.feature.freelancer.impl.ui.acquiring_payment.filters.screen;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import ck7.j;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.freelancer.impl.R$id;
import com.revolut.feature.freelancer.impl.R$layout;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.feature.freelancer.impl.ui.acquiring_payment.filters.screen.FreelancerAcquiringPaymentFiltersScreen;
import com.revolut.feature.freelancer.impl.ui.acquiring_payment.filters.screen.FreelancerAcquiringPaymentFiltersScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import cul.n0;
import cv6.b;
import cv6.d;
import cv6.f;
import cv6.g;
import cv6.i;
import cv6.k;
import cv6.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tki.c;
import us6.l;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/acquiring_payment/filters/screen/FreelancerAcquiringPaymentFiltersScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcv6/k;", "Ltki/c;", "Lcv6/m;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FreelancerAcquiringPaymentFiltersScreen extends ViewController<k> implements c {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(FreelancerAcquiringPaymentFiltersScreen.class, "binding", "getBinding()Lcom/revolut/feature/freelancer/impl/databinding/ScreenFreelancerSalesFiltersBinding;", 0))};
    public final FreelancerAcquiringPaymentFiltersScreenContract$InputData K;
    public final h L;
    public final int M;
    public final ActionsDelegate N;
    public final ListSubheaderDelegate O;
    public final FullScreenStateDelegate P;
    public final RowDelegate Q;
    public final SelectableDelegate R;
    public final koi.h S;
    public final Object T;
    public final Object U;
    public final Object V;

    public FreelancerAcquiringPaymentFiltersScreen(FreelancerAcquiringPaymentFiltersScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        this.M = R$layout.screen_freelancer_sales_filters;
        this.N = new ActionsDelegate();
        this.O = new ListSubheaderDelegate();
        this.P = new FullScreenStateDelegate();
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.Q = rowDelegate;
        this.R = new SelectableDelegate(rowDelegate);
        final int i = 0;
        this.S = new koi.h(null, false, false, 1);
        this.T = w.y0(new Function0(this) { // from class: cv6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerAcquiringPaymentFiltersScreen f109284b;

            {
                this.f109284b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                FreelancerAcquiringPaymentFiltersScreen freelancerAcquiringPaymentFiltersScreen = this.f109284b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerAcquiringPaymentFiltersScreen.W;
                        qji.b bVarU2 = freelancerAcquiringPaymentFiltersScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.acquiring_payment.filters.screen.di.FreelancerAcquiringPaymentFiltersScreenInjector");
                        us6.m mVar = (us6.m) bVarU2;
                        us6.q qVar = mVar.f282623b;
                        us6.m mVar2 = mVar.f282624c;
                        FreelancerAcquiringPaymentFiltersScreenContract$InputData freelancerAcquiringPaymentFiltersScreenContract$InputData = freelancerAcquiringPaymentFiltersScreen.K;
                        freelancerAcquiringPaymentFiltersScreenContract$InputData.getClass();
                        return new us6.l(qVar, mVar2, freelancerAcquiringPaymentFiltersScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerAcquiringPaymentFiltersScreen.W;
                        return (l) ((us6.l) freelancerAcquiringPaymentFiltersScreen.T.getValue()).f282608c.get();
                    default:
                        KProperty[] kPropertyArr3 = FreelancerAcquiringPaymentFiltersScreen.W;
                        FreelancerAcquiringPaymentFiltersScreen freelancerAcquiringPaymentFiltersScreen2 = this.f109284b;
                        return tki.g.a(freelancerAcquiringPaymentFiltersScreen2, freelancerAcquiringPaymentFiltersScreen2.R2(), v.k(new RowLoadingDelegate(), freelancerAcquiringPaymentFiltersScreen2.N, freelancerAcquiringPaymentFiltersScreen2.P, freelancerAcquiringPaymentFiltersScreen2.O, freelancerAcquiringPaymentFiltersScreen2.Q, freelancerAcquiringPaymentFiltersScreen2.R), R$id.freelancerSalesFilters_recyclerView, new n0(freelancerAcquiringPaymentFiltersScreen2, 3), freelancerAcquiringPaymentFiltersScreen2.S, null, 32);
                }
            }
        });
        final int i2 = 1;
        this.U = w.y0(new Function0(this) { // from class: cv6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerAcquiringPaymentFiltersScreen f109284b;

            {
                this.f109284b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                FreelancerAcquiringPaymentFiltersScreen freelancerAcquiringPaymentFiltersScreen = this.f109284b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerAcquiringPaymentFiltersScreen.W;
                        qji.b bVarU2 = freelancerAcquiringPaymentFiltersScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.acquiring_payment.filters.screen.di.FreelancerAcquiringPaymentFiltersScreenInjector");
                        us6.m mVar = (us6.m) bVarU2;
                        us6.q qVar = mVar.f282623b;
                        us6.m mVar2 = mVar.f282624c;
                        FreelancerAcquiringPaymentFiltersScreenContract$InputData freelancerAcquiringPaymentFiltersScreenContract$InputData = freelancerAcquiringPaymentFiltersScreen.K;
                        freelancerAcquiringPaymentFiltersScreenContract$InputData.getClass();
                        return new us6.l(qVar, mVar2, freelancerAcquiringPaymentFiltersScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerAcquiringPaymentFiltersScreen.W;
                        return (l) ((us6.l) freelancerAcquiringPaymentFiltersScreen.T.getValue()).f282608c.get();
                    default:
                        KProperty[] kPropertyArr3 = FreelancerAcquiringPaymentFiltersScreen.W;
                        FreelancerAcquiringPaymentFiltersScreen freelancerAcquiringPaymentFiltersScreen2 = this.f109284b;
                        return tki.g.a(freelancerAcquiringPaymentFiltersScreen2, freelancerAcquiringPaymentFiltersScreen2.R2(), v.k(new RowLoadingDelegate(), freelancerAcquiringPaymentFiltersScreen2.N, freelancerAcquiringPaymentFiltersScreen2.P, freelancerAcquiringPaymentFiltersScreen2.O, freelancerAcquiringPaymentFiltersScreen2.Q, freelancerAcquiringPaymentFiltersScreen2.R), R$id.freelancerSalesFilters_recyclerView, new n0(freelancerAcquiringPaymentFiltersScreen2, 3), freelancerAcquiringPaymentFiltersScreen2.S, null, 32);
                }
            }
        });
        final int i3 = 2;
        this.V = w.y0(new Function0(this) { // from class: cv6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerAcquiringPaymentFiltersScreen f109284b;

            {
                this.f109284b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                FreelancerAcquiringPaymentFiltersScreen freelancerAcquiringPaymentFiltersScreen = this.f109284b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerAcquiringPaymentFiltersScreen.W;
                        qji.b bVarU2 = freelancerAcquiringPaymentFiltersScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.acquiring_payment.filters.screen.di.FreelancerAcquiringPaymentFiltersScreenInjector");
                        us6.m mVar = (us6.m) bVarU2;
                        us6.q qVar = mVar.f282623b;
                        us6.m mVar2 = mVar.f282624c;
                        FreelancerAcquiringPaymentFiltersScreenContract$InputData freelancerAcquiringPaymentFiltersScreenContract$InputData = freelancerAcquiringPaymentFiltersScreen.K;
                        freelancerAcquiringPaymentFiltersScreenContract$InputData.getClass();
                        return new us6.l(qVar, mVar2, freelancerAcquiringPaymentFiltersScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerAcquiringPaymentFiltersScreen.W;
                        return (l) ((us6.l) freelancerAcquiringPaymentFiltersScreen.T.getValue()).f282608c.get();
                    default:
                        KProperty[] kPropertyArr3 = FreelancerAcquiringPaymentFiltersScreen.W;
                        FreelancerAcquiringPaymentFiltersScreen freelancerAcquiringPaymentFiltersScreen2 = this.f109284b;
                        return tki.g.a(freelancerAcquiringPaymentFiltersScreen2, freelancerAcquiringPaymentFiltersScreen2.R2(), v.k(new RowLoadingDelegate(), freelancerAcquiringPaymentFiltersScreen2.N, freelancerAcquiringPaymentFiltersScreen2.P, freelancerAcquiringPaymentFiltersScreen2.O, freelancerAcquiringPaymentFiltersScreen2.Q, freelancerAcquiringPaymentFiltersScreen2.R), R$id.freelancerSalesFilters_recyclerView, new n0(freelancerAcquiringPaymentFiltersScreen2, 3), freelancerAcquiringPaymentFiltersScreen2.S, null, 32);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        m uiState = (m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f257028c.setMenuItems(uiState.f109291b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (l) this.T.getValue();
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
        ViewController.P2(this, rd0.e.b(d3().f257028c.f59410q), new d(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f257028c.o.f57403b), new j(this, null, 27), 3);
        ViewController.P2(this, rd0.e.b(d3().f257027b.o), new d(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(this.O.f52707c), new cv6.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.P.f52371h.f121375b), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.R.r()), new g(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f53218h), new cv6.h(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.N.f51611c.f121375b), new i(this, null), 3);
    }

    public final rs6.d d3() {
        ViewBinding value = this.L.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (rs6.d) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final cv6.l R2() {
        return (cv6.l) this.U.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.V.getValue();
    }
}
