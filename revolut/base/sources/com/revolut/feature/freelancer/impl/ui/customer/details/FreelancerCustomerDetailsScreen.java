package com.revolut.feature.freelancer.impl.ui.customer.details;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.freelancer.impl.ui.customer.details.FreelancerCustomerDetailsScreen;
import com.revolut.feature.freelancer.impl.ui.customer.details.FreelancerCustomerDetailsScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import iaf.d;
import iw6.b;
import iw6.c;
import iw6.f;
import iw6.g;
import iw6.i;
import iw6.j;
import iw6.k;
import jii.m;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import us6.v;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/customer/details/FreelancerCustomerDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Liw6/k;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FreelancerCustomerDetailsScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(FreelancerCustomerDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final FreelancerCustomerDetailsScreenContract$InputData K;
    public final int L;
    public final h M;
    public final FullScreenStateDelegate N;
    public final ListSubheaderDelegate O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public FreelancerCustomerDetailsScreen(FreelancerCustomerDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = s.t(this, b.f);
        this.N = new FullScreenStateDelegate();
        this.O = new ListSubheaderDelegate();
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: iw6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerCustomerDetailsScreen f168970b;

            {
                this.f168970b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                FreelancerCustomerDetailsScreen freelancerCustomerDetailsScreen = this.f168970b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerCustomerDetailsScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(freelancerCustomerDetailsScreen.m2()).a().get(us6.q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", us6.q.class, " is not found"));
                        }
                        us6.q qVar = ((us6.q) aVar2.b()).Q;
                        FreelancerCustomerDetailsScreenContract$InputData freelancerCustomerDetailsScreenContract$InputData = freelancerCustomerDetailsScreen.K;
                        freelancerCustomerDetailsScreenContract$InputData.getClass();
                        return new v(qVar, freelancerCustomerDetailsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerCustomerDetailsScreen.S;
                        return (f) ((v) freelancerCustomerDetailsScreen.P.getValue()).f282774c.get();
                    default:
                        KProperty[] kPropertyArr3 = FreelancerCustomerDetailsScreen.S;
                        FreelancerCustomerDetailsScreen freelancerCustomerDetailsScreen2 = this.f168970b;
                        return dli.f.a(freelancerCustomerDetailsScreen2, (f) freelancerCustomerDetailsScreen2.Q.getValue(), zhm.v.k(new CellDetailsDelegate(), new CellDetailsNoteDelegate(), freelancerCustomerDetailsScreen2.N, freelancerCustomerDetailsScreen2.O, new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: iw6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerCustomerDetailsScreen f168970b;

            {
                this.f168970b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                FreelancerCustomerDetailsScreen freelancerCustomerDetailsScreen = this.f168970b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerCustomerDetailsScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(freelancerCustomerDetailsScreen.m2()).a().get(us6.q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", us6.q.class, " is not found"));
                        }
                        us6.q qVar = ((us6.q) aVar2.b()).Q;
                        FreelancerCustomerDetailsScreenContract$InputData freelancerCustomerDetailsScreenContract$InputData = freelancerCustomerDetailsScreen.K;
                        freelancerCustomerDetailsScreenContract$InputData.getClass();
                        return new v(qVar, freelancerCustomerDetailsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerCustomerDetailsScreen.S;
                        return (f) ((v) freelancerCustomerDetailsScreen.P.getValue()).f282774c.get();
                    default:
                        KProperty[] kPropertyArr3 = FreelancerCustomerDetailsScreen.S;
                        FreelancerCustomerDetailsScreen freelancerCustomerDetailsScreen2 = this.f168970b;
                        return dli.f.a(freelancerCustomerDetailsScreen2, (f) freelancerCustomerDetailsScreen2.Q.getValue(), zhm.v.k(new CellDetailsDelegate(), new CellDetailsNoteDelegate(), freelancerCustomerDetailsScreen2.N, freelancerCustomerDetailsScreen2.O, new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: iw6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerCustomerDetailsScreen f168970b;

            {
                this.f168970b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                FreelancerCustomerDetailsScreen freelancerCustomerDetailsScreen = this.f168970b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerCustomerDetailsScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(freelancerCustomerDetailsScreen.m2()).a().get(us6.q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", us6.q.class, " is not found"));
                        }
                        us6.q qVar = ((us6.q) aVar2.b()).Q;
                        FreelancerCustomerDetailsScreenContract$InputData freelancerCustomerDetailsScreenContract$InputData = freelancerCustomerDetailsScreen.K;
                        freelancerCustomerDetailsScreenContract$InputData.getClass();
                        return new v(qVar, freelancerCustomerDetailsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerCustomerDetailsScreen.S;
                        return (f) ((v) freelancerCustomerDetailsScreen.P.getValue()).f282774c.get();
                    default:
                        KProperty[] kPropertyArr3 = FreelancerCustomerDetailsScreen.S;
                        FreelancerCustomerDetailsScreen freelancerCustomerDetailsScreen2 = this.f168970b;
                        return dli.f.a(freelancerCustomerDetailsScreen2, (f) freelancerCustomerDetailsScreen2.Q.getValue(), zhm.v.k(new CellDetailsDelegate(), new CellDetailsNoteDelegate(), freelancerCustomerDetailsScreen2.N, freelancerCustomerDetailsScreen2.O, new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        j jVar = uiState.f168976a;
        if (jVar instanceof g) {
            NavBarWithToolbar navBarWithToolbar = d3().f174539b;
            navBarWithToolbar.setLoadingVisible(false);
            g gVar = (g) jVar;
            TextClause textClause = gVar.f168973b;
            navBarWithToolbar.setTitle(textClause, null);
            navBarWithToolbar.setToolbarTitle(textClause);
            navBarWithToolbar.setEndIconImage(gVar.f168972a);
            navBarWithToolbar.setTitleVisible(true);
            return;
        }
        if (jVar.equals(iw6.h.f168974a)) {
            NavBarWithToolbar navBarWithToolbar2 = d3().f174539b;
            navBarWithToolbar2.setLoadingVisible(false);
            navBarWithToolbar2.setEndIconImage(null);
            navBarWithToolbar2.setTitleVisible(false);
            return;
        }
        if (!jVar.equals(i.f168975a)) {
            throw new NoWhenBranchMatchedException();
        }
        NavBarWithToolbar navBarWithToolbar3 = d3().f174539b;
        navBarWithToolbar3.setLoadingVisible(true);
        navBarWithToolbar3.setEndIconImage(null);
        navBarWithToolbar3.setTitleVisible(false);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (v) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (f) this.Q.getValue();
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
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new d(this, null, 25), 3);
        ViewController.P2(this, rd0.e.b(this.N.f52371h.f121375b), new c(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.O.f52707c), new iw6.d(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
