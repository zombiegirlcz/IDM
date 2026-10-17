package com.revolut.feature.freelancer.impl.ui.acquiring_order.list;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.j4;
import cli.o;
import cli.q;
import cli.y;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.freelancer.impl.ui.acquiring_order.list.FreelancerAcquiringOrderListScreen;
import com.revolut.feature.freelancer.impl.ui.acquiring_order.list.FreelancerAcquiringOrderListScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ocb.d;
import os9.f;
import ou6.i;
import ou6.k;
import ou6.m;
import ou6.n;
import te0.w;
import tki.c;
import vc.s;
import vkm.j2;
import xki.e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/acquiring_order/list/FreelancerAcquiringOrderListScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lou6/k;", "Ltki/c;", "Lou6/n;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FreelancerAcquiringOrderListScreen extends ViewController<k> implements c {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(FreelancerAcquiringOrderListScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final FreelancerAcquiringOrderListScreenContract$InputData K;
    public final ActionsDelegate L;
    public final FullScreenStateDelegate M;
    public final RowDelegate N;
    public final int O;
    public final h P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public FreelancerAcquiringOrderListScreen(FreelancerAcquiringOrderListScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = new ActionsDelegate();
        this.M = new FullScreenStateDelegate();
        this.N = new RowDelegate(null, null, 7);
        this.O = R$layout.screen_recycler_navbar;
        this.P = s.t(this, ou6.c.f);
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: ou6.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerAcquiringOrderListScreen f229823b;

            {
                this.f229823b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                FreelancerAcquiringOrderListScreen freelancerAcquiringOrderListScreen = this.f229823b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerAcquiringOrderListScreen.T;
                        qji.b bVarU2 = freelancerAcquiringOrderListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.acquiring_order.list.di.FreelancerAcquiringOrderListScreenInjector");
                        us6.h hVar = (us6.h) bVarU2;
                        us6.q qVar = hVar.f282559b;
                        us6.h hVar2 = hVar.f282560c;
                        FreelancerAcquiringOrderListScreenContract$InputData freelancerAcquiringOrderListScreenContract$InputData = freelancerAcquiringOrderListScreen.K;
                        freelancerAcquiringOrderListScreenContract$InputData.getClass();
                        return new us6.i(qVar, hVar2, freelancerAcquiringOrderListScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerAcquiringOrderListScreen.T;
                        return (l) ((us6.i) freelancerAcquiringOrderListScreen.Q.getValue()).f282571c.get();
                    default:
                        KProperty[] kPropertyArr3 = FreelancerAcquiringOrderListScreen.T;
                        FreelancerAcquiringOrderListScreen freelancerAcquiringOrderListScreen2 = this.f229823b;
                        return tki.g.a(freelancerAcquiringOrderListScreen2, freelancerAcquiringOrderListScreen2.R2(), zhm.v.k(freelancerAcquiringOrderListScreen2.L, freelancerAcquiringOrderListScreen2.M, new ListSubheaderDelegate(), freelancerAcquiringOrderListScreen2.N, new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: ou6.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerAcquiringOrderListScreen f229823b;

            {
                this.f229823b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                FreelancerAcquiringOrderListScreen freelancerAcquiringOrderListScreen = this.f229823b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerAcquiringOrderListScreen.T;
                        qji.b bVarU2 = freelancerAcquiringOrderListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.acquiring_order.list.di.FreelancerAcquiringOrderListScreenInjector");
                        us6.h hVar = (us6.h) bVarU2;
                        us6.q qVar = hVar.f282559b;
                        us6.h hVar2 = hVar.f282560c;
                        FreelancerAcquiringOrderListScreenContract$InputData freelancerAcquiringOrderListScreenContract$InputData = freelancerAcquiringOrderListScreen.K;
                        freelancerAcquiringOrderListScreenContract$InputData.getClass();
                        return new us6.i(qVar, hVar2, freelancerAcquiringOrderListScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerAcquiringOrderListScreen.T;
                        return (l) ((us6.i) freelancerAcquiringOrderListScreen.Q.getValue()).f282571c.get();
                    default:
                        KProperty[] kPropertyArr3 = FreelancerAcquiringOrderListScreen.T;
                        FreelancerAcquiringOrderListScreen freelancerAcquiringOrderListScreen2 = this.f229823b;
                        return tki.g.a(freelancerAcquiringOrderListScreen2, freelancerAcquiringOrderListScreen2.R2(), zhm.v.k(freelancerAcquiringOrderListScreen2.L, freelancerAcquiringOrderListScreen2.M, new ListSubheaderDelegate(), freelancerAcquiringOrderListScreen2.N, new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: ou6.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerAcquiringOrderListScreen f229823b;

            {
                this.f229823b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                FreelancerAcquiringOrderListScreen freelancerAcquiringOrderListScreen = this.f229823b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerAcquiringOrderListScreen.T;
                        qji.b bVarU2 = freelancerAcquiringOrderListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.acquiring_order.list.di.FreelancerAcquiringOrderListScreenInjector");
                        us6.h hVar = (us6.h) bVarU2;
                        us6.q qVar = hVar.f282559b;
                        us6.h hVar2 = hVar.f282560c;
                        FreelancerAcquiringOrderListScreenContract$InputData freelancerAcquiringOrderListScreenContract$InputData = freelancerAcquiringOrderListScreen.K;
                        freelancerAcquiringOrderListScreenContract$InputData.getClass();
                        return new us6.i(qVar, hVar2, freelancerAcquiringOrderListScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerAcquiringOrderListScreen.T;
                        return (l) ((us6.i) freelancerAcquiringOrderListScreen.Q.getValue()).f282571c.get();
                    default:
                        KProperty[] kPropertyArr3 = FreelancerAcquiringOrderListScreen.T;
                        FreelancerAcquiringOrderListScreen freelancerAcquiringOrderListScreen2 = this.f229823b;
                        return tki.g.a(freelancerAcquiringOrderListScreen2, freelancerAcquiringOrderListScreen2.R2(), zhm.v.k(freelancerAcquiringOrderListScreen2.L, freelancerAcquiringOrderListScreen2.M, new ListSubheaderDelegate(), freelancerAcquiringOrderListScreen2.N, new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        n uiState = (n) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        m mVar = uiState.f229836a;
        Clause clause = mVar.f229833a;
        Clause clause2 = mVar.f229834b;
        navBarWithToolbar.setTitle(clause, null);
        navBarWithToolbar.setToolbarTitle(clause);
        navBarWithToolbar.setDescriptionText(clause2);
        navBarWithToolbar.setDescriptionVisible(clause2 != null);
        navBarWithToolbar.setMenuItems(mVar.f229835c);
        if (mVar.d) {
            navBarWithToolbar.j0(false);
            navBarWithToolbar.K0(j4.FROM_CLICKED_BUTTON);
        } else {
            navBarWithToolbar.H0(false);
            navBarWithToolbar.m0(j4.FROM_CLICKED_BUTTON);
            navBarWithToolbar.i0();
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        if (!((ou6.h) ((j2) ((a) R2()).f73703x.f22677a).getValue()).f229830g) {
            return super.F2();
        }
        a aVar = (a) R2();
        y yVar = aVar.f73703x;
        if (((ou6.h) ((j2) yVar.f22677a).getValue()).f229830g) {
            aVar.H2(yVar, new f(26));
            return true;
        }
        aVar.C2(i.f229831a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (us6.i) this.Q.getValue();
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
        ViewController.P2(this, l.y(d3().f174539b.f59410q, d3().f174539b.f59409p.f57336l, "merge(...)"), new d(this, null, 22), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.o.f57403b), new oli.f(this, null, 23), 3);
        ViewController.P2(this, t1.d(rd0.e.b(d3().f174539b.f59409p.f57337m), 300L), new nt.e(2, R2(), ou6.l.class, "onSearchQueryChanged", "onSearchQueryChanged(Ljava/lang/String;)V", 4, 24), 3);
        ViewController.P2(this, rd0.e.b(this.N.f53218h), new ou6.d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.M.f52371h.f121375b), new ou6.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.L.f51611c.f121375b), new ou6.f(this, null), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.P.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final ou6.l R2() {
        return (ou6.l) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.S.getValue();
    }
}
