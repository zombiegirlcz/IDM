package com.revolut.feature.freelancer.impl.ui.subaccount.create.screen;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import bt6.b0;
import bt6.c0;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.feature.freelancer.impl.ui.subaccount.create.screen.FreelancerTaxReservationScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.common.ui.R$string;
import dli.a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import qqj.g;
import t05.c;
import t27.b;
import t27.f;
import t27.m;
import t27.r;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/subaccount/create/screen/FreelancerTaxReservationScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lt27/m;", "Ldli/a;", "Lt27/o;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FreelancerTaxReservationScreen extends ViewController<m> implements a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(FreelancerTaxReservationScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final FreelancerTaxReservationScreenContract$InputData K;
    public final int L;
    public final h M;
    public final InputTextDelegate N;
    public final SelectableDelegate O;
    public final FullScreenStateDelegate P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public FreelancerTaxReservationScreen(FreelancerTaxReservationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = s.t(this, b.f);
        this.N = new InputTextDelegate(null);
        this.O = new SelectableDelegate(new RowDelegate(null, null, 7));
        this.P = new FullScreenStateDelegate();
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: t27.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerTaxReservationScreen f267427b;

            {
                this.f267427b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                FreelancerTaxReservationScreen freelancerTaxReservationScreen = this.f267427b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerTaxReservationScreen.T;
                        qji.b bVarU2 = freelancerTaxReservationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.subaccount.create.screen.di.FreelancerTaxReservationScreenInjector");
                        return (c0) ((b0) ((u27.a) bVarU2).b().mo3808a(freelancerTaxReservationScreen)).mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerTaxReservationScreen.T;
                        c0 c0Var = (c0) freelancerTaxReservationScreen.Q.getValue();
                        switch (c0Var.f18316a) {
                            case 0:
                                return (r) c0Var.f18318c.get();
                            default:
                                return (r) c0Var.f18318c.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = FreelancerTaxReservationScreen.T;
                        FreelancerTaxReservationScreen freelancerTaxReservationScreen2 = this.f267427b;
                        return dli.f.a(freelancerTaxReservationScreen2, freelancerTaxReservationScreen2.d(), v.k(freelancerTaxReservationScreen2.N, freelancerTaxReservationScreen2.O, freelancerTaxReservationScreen2.P, new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: t27.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerTaxReservationScreen f267427b;

            {
                this.f267427b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                FreelancerTaxReservationScreen freelancerTaxReservationScreen = this.f267427b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerTaxReservationScreen.T;
                        qji.b bVarU2 = freelancerTaxReservationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.subaccount.create.screen.di.FreelancerTaxReservationScreenInjector");
                        return (c0) ((b0) ((u27.a) bVarU2).b().mo3808a(freelancerTaxReservationScreen)).mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerTaxReservationScreen.T;
                        c0 c0Var = (c0) freelancerTaxReservationScreen.Q.getValue();
                        switch (c0Var.f18316a) {
                            case 0:
                                return (r) c0Var.f18318c.get();
                            default:
                                return (r) c0Var.f18318c.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = FreelancerTaxReservationScreen.T;
                        FreelancerTaxReservationScreen freelancerTaxReservationScreen2 = this.f267427b;
                        return dli.f.a(freelancerTaxReservationScreen2, freelancerTaxReservationScreen2.d(), v.k(freelancerTaxReservationScreen2.N, freelancerTaxReservationScreen2.O, freelancerTaxReservationScreen2.P, new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: t27.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerTaxReservationScreen f267427b;

            {
                this.f267427b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                FreelancerTaxReservationScreen freelancerTaxReservationScreen = this.f267427b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerTaxReservationScreen.T;
                        qji.b bVarU2 = freelancerTaxReservationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.subaccount.create.screen.di.FreelancerTaxReservationScreenInjector");
                        return (c0) ((b0) ((u27.a) bVarU2).b().mo3808a(freelancerTaxReservationScreen)).mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerTaxReservationScreen.T;
                        c0 c0Var = (c0) freelancerTaxReservationScreen.Q.getValue();
                        switch (c0Var.f18316a) {
                            case 0:
                                return (r) c0Var.f18318c.get();
                            default:
                                return (r) c0Var.f18318c.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = FreelancerTaxReservationScreen.T;
                        FreelancerTaxReservationScreen freelancerTaxReservationScreen2 = this.f267427b;
                        return dli.f.a(freelancerTaxReservationScreen2, freelancerTaxReservationScreen2.d(), v.k(freelancerTaxReservationScreen2.N, freelancerTaxReservationScreen2.O, freelancerTaxReservationScreen2.P, new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        t27.o uiState = (t27.o) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174564b.setEnabled(uiState.f267438b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c0) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        if (this.K.f74227a) {
            navBarWithToolbar.setMenuItems(u.c(new TextNavBarMenuItem("ITEM_ID_MENU_SKIP", new TextLocalisedClause(R$string.common_action_skip, null, null, 14), null, null, 12)));
        }
        navBarWithToolbar.setTitle(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_subaccount_sale_reservation_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_subaccount_sale_reservation_title, null, null, 14));
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_subaccount_sale_reservation_subtitle, null, null, 14));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        d3().f174564b.setText(new TextLocalisedClause(R$string.common_action_continue, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, new c(rd0.e.b(this.O.r()), 7), null, new g(view, this, (Continuation) null, 18), 3);
        com.revolut.kompot.navigable.a.g2(this, new c(rd0.e.b(this.N.e.f121375b), 5), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new t27.g(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new t27.g(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, new c(rd0.e.b(d3().f174565c.o.f57403b), 6), null, new t27.g(this, null, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.f52371h.f121375b), null, new t27.h(this, null), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.M.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final r R2() {
        return (r) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }
}
