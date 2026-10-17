package com.revolut.feature.freelancer.impl.ui.acquiring_payment.list;

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
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.feature.freelancer.impl.ui.acquiring_payment.list.FreelancerAcquiringPaymentListScreen;
import com.revolut.feature.freelancer.impl.ui.acquiring_payment.list.FreelancerAcquiringPaymentListScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import exe.k;
import fna.f;
import ft.d;
import fv6.g;
import fv6.j;
import fv6.l;
import fv6.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tki.c;
import us6.n;
import vc.s;
import vkm.j2;
import xki.e;
import yp0.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/acquiring_payment/list/FreelancerAcquiringPaymentListScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lfv6/j;", "Ltki/c;", "Lfv6/m;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FreelancerAcquiringPaymentListScreen extends ViewController<j> implements c {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(FreelancerAcquiringPaymentListScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final FreelancerAcquiringPaymentListScreenContract$InputData K;
    public final ActionsDelegate L;
    public final FullScreenStateDelegate M;
    public final RowDelegate N;
    public final int O;
    public final h P;
    public v Q;
    public final Object R;
    public final Object S;
    public final Object T;

    public FreelancerAcquiringPaymentListScreen(FreelancerAcquiringPaymentListScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = new ActionsDelegate();
        this.M = new FullScreenStateDelegate();
        this.N = new RowDelegate(null, null, 7);
        this.O = R$layout.screen_recycler_navbar;
        this.P = s.t(this, fv6.c.f);
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: fv6.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerAcquiringPaymentListScreen f138358b;

            {
                this.f138358b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                FreelancerAcquiringPaymentListScreen freelancerAcquiringPaymentListScreen = this.f138358b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerAcquiringPaymentListScreen.U;
                        qji.b bVarU2 = freelancerAcquiringPaymentListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.acquiring_payment.list.di.FreelancerAcquiringPaymentListScreenInjector");
                        us6.m mVar = (us6.m) bVarU2;
                        us6.q qVar = mVar.f282623b;
                        us6.m mVar2 = mVar.f282624c;
                        FreelancerAcquiringPaymentListScreenContract$InputData freelancerAcquiringPaymentListScreenContract$InputData = freelancerAcquiringPaymentListScreen.K;
                        freelancerAcquiringPaymentListScreenContract$InputData.getClass();
                        return new us6.n(qVar, mVar2, freelancerAcquiringPaymentListScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerAcquiringPaymentListScreen.U;
                        return (k) ((us6.n) freelancerAcquiringPaymentListScreen.R.getValue()).f282634c.get();
                    default:
                        KProperty[] kPropertyArr3 = FreelancerAcquiringPaymentListScreen.U;
                        FreelancerAcquiringPaymentListScreen freelancerAcquiringPaymentListScreen2 = this.f138358b;
                        return tki.g.a(freelancerAcquiringPaymentListScreen2, freelancerAcquiringPaymentListScreen2.R2(), zhm.v.k(freelancerAcquiringPaymentListScreen2.L, freelancerAcquiringPaymentListScreen2.M, freelancerAcquiringPaymentListScreen2.N, new ListSubheaderDelegate(), new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: fv6.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerAcquiringPaymentListScreen f138358b;

            {
                this.f138358b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                FreelancerAcquiringPaymentListScreen freelancerAcquiringPaymentListScreen = this.f138358b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerAcquiringPaymentListScreen.U;
                        qji.b bVarU2 = freelancerAcquiringPaymentListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.acquiring_payment.list.di.FreelancerAcquiringPaymentListScreenInjector");
                        us6.m mVar = (us6.m) bVarU2;
                        us6.q qVar = mVar.f282623b;
                        us6.m mVar2 = mVar.f282624c;
                        FreelancerAcquiringPaymentListScreenContract$InputData freelancerAcquiringPaymentListScreenContract$InputData = freelancerAcquiringPaymentListScreen.K;
                        freelancerAcquiringPaymentListScreenContract$InputData.getClass();
                        return new us6.n(qVar, mVar2, freelancerAcquiringPaymentListScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerAcquiringPaymentListScreen.U;
                        return (k) ((us6.n) freelancerAcquiringPaymentListScreen.R.getValue()).f282634c.get();
                    default:
                        KProperty[] kPropertyArr3 = FreelancerAcquiringPaymentListScreen.U;
                        FreelancerAcquiringPaymentListScreen freelancerAcquiringPaymentListScreen2 = this.f138358b;
                        return tki.g.a(freelancerAcquiringPaymentListScreen2, freelancerAcquiringPaymentListScreen2.R2(), zhm.v.k(freelancerAcquiringPaymentListScreen2.L, freelancerAcquiringPaymentListScreen2.M, freelancerAcquiringPaymentListScreen2.N, new ListSubheaderDelegate(), new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: fv6.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerAcquiringPaymentListScreen f138358b;

            {
                this.f138358b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                FreelancerAcquiringPaymentListScreen freelancerAcquiringPaymentListScreen = this.f138358b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerAcquiringPaymentListScreen.U;
                        qji.b bVarU2 = freelancerAcquiringPaymentListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.acquiring_payment.list.di.FreelancerAcquiringPaymentListScreenInjector");
                        us6.m mVar = (us6.m) bVarU2;
                        us6.q qVar = mVar.f282623b;
                        us6.m mVar2 = mVar.f282624c;
                        FreelancerAcquiringPaymentListScreenContract$InputData freelancerAcquiringPaymentListScreenContract$InputData = freelancerAcquiringPaymentListScreen.K;
                        freelancerAcquiringPaymentListScreenContract$InputData.getClass();
                        return new us6.n(qVar, mVar2, freelancerAcquiringPaymentListScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerAcquiringPaymentListScreen.U;
                        return (k) ((us6.n) freelancerAcquiringPaymentListScreen.R.getValue()).f282634c.get();
                    default:
                        KProperty[] kPropertyArr3 = FreelancerAcquiringPaymentListScreen.U;
                        FreelancerAcquiringPaymentListScreen freelancerAcquiringPaymentListScreen2 = this.f138358b;
                        return tki.g.a(freelancerAcquiringPaymentListScreen2, freelancerAcquiringPaymentListScreen2.R2(), zhm.v.k(freelancerAcquiringPaymentListScreen2.L, freelancerAcquiringPaymentListScreen2.M, freelancerAcquiringPaymentListScreen2.N, new ListSubheaderDelegate(), new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        m uiState = (m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        l lVar = uiState.f138367b;
        navBarWithToolbar.setMenuItems(lVar.f138365b);
        if (lVar.f138364a) {
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
        if (!((g) ((j2) ((b) R2()).f73736s.f22677a).getValue()).d) {
            return super.F2();
        }
        b bVar = (b) R2();
        y yVar = bVar.f73736s;
        if (((g) ((j2) yVar.f22677a).getValue()).d) {
            bVar.H2(yVar, new ft4.w(28));
            return true;
        }
        bVar.C2(fv6.h.f138362a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (n) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.freelancer_sale_acquiring_payments_header_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void a3() {
        ScreenContentRecyclerView screenContentRecyclerView = d3().f174540c;
        v vVar = this.Q;
        if (vVar != null) {
            screenContentRecyclerView.removeOnScrollListener(vVar);
        } else {
            Intrinsics.r("scrollListener");
            throw null;
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, h30.l.y(d3().f174539b.f59409p.f57336l, d3().f174539b.f59410q, "merge(...)"), new d(this, continuation, 7), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.o.f57403b), new f(this, continuation, 14), 3);
        ViewController.P2(this, t1.d(rd0.e.b(d3().f174539b.f59409p.f57337m), 300L), new k(2, R2(), fv6.k.class, "onSearchQueryChanged", "onSearchQueryChanged(Ljava/lang/String;)V", 4, 13), 3);
        ViewController.P2(this, rd0.e.b(this.N.f53218h), new fv6.d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.L.f51611c.f121375b), new fv6.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.M.f52371h.f121375b), new fv6.f(this, null), 3);
        ScreenContentRecyclerView recyclerView = d3().f174540c;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        this.Q = yp0.y.a(recyclerView, 50, true, new fs2.k(this, 15));
    }

    public final jii.m d3() {
        ViewBinding value = this.P.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final fv6.k R2() {
        return (fv6.k) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.T.getValue();
    }
}
