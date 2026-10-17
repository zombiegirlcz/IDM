package com.revolut.feature.freelancer.impl.ui.invoice.list;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.j4;
import cli.o;
import cli.y;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.freelancer.impl.ui.invoice.list.InvoiceListScreen;
import com.revolut.feature.freelancer.impl.ui.invoice.list.InvoiceListScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import h30.l;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rx6.b;
import rx6.g;
import rx6.i;
import rx6.j;
import rx6.m;
import rx6.p;
import te0.w;
import us6.g2;
import us6.o2;
import vc.s;
import vkm.j2;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/invoice/list/InvoiceListScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lrx6/q;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InvoiceListScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(InvoiceListScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final InvoiceListScreenContract$InputData K;
    public final int L;
    public final boolean M;
    public final h N;
    public final FullScreenStateDelegate O;
    public final ActionsDelegate P;
    public final RowDelegate Q;
    public final Object R;
    public final Object S;
    public final Object T;

    public InvoiceListScreen(InvoiceListScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = true;
        this.N = s.t(this, b.f);
        this.O = new FullScreenStateDelegate();
        this.P = new ActionsDelegate();
        this.Q = new RowDelegate(null, null, 7);
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: rx6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoiceListScreen f258037b;

            {
                this.f258037b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                InvoiceListScreen invoiceListScreen = this.f258037b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = InvoiceListScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(invoiceListScreen.m2()).a().get(g2.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", g2.class, " is not found"));
                        }
                        g2 g2Var = ((g2) ((sx6.a) aVar2.b())).f282557j;
                        InvoiceListScreenContract$InputData invoiceListScreenContract$InputData = invoiceListScreen.K;
                        invoiceListScreenContract$InputData.getClass();
                        return new o2(g2Var, invoiceListScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = InvoiceListScreen.U;
                        return (o) ((o2) invoiceListScreen.R.getValue()).f282653m.get();
                    default:
                        KProperty[] kPropertyArr3 = InvoiceListScreen.U;
                        InvoiceListScreen invoiceListScreen2 = this.f258037b;
                        return dli.f.a(invoiceListScreen2, invoiceListScreen2.d(), v.k(new RowLoadingDelegate(), new ListSubheaderDelegate(), invoiceListScreen2.Q, invoiceListScreen2.P, invoiceListScreen2.O), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: rx6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoiceListScreen f258037b;

            {
                this.f258037b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                InvoiceListScreen invoiceListScreen = this.f258037b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InvoiceListScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(invoiceListScreen.m2()).a().get(g2.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", g2.class, " is not found"));
                        }
                        g2 g2Var = ((g2) ((sx6.a) aVar2.b())).f282557j;
                        InvoiceListScreenContract$InputData invoiceListScreenContract$InputData = invoiceListScreen.K;
                        invoiceListScreenContract$InputData.getClass();
                        return new o2(g2Var, invoiceListScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = InvoiceListScreen.U;
                        return (o) ((o2) invoiceListScreen.R.getValue()).f282653m.get();
                    default:
                        KProperty[] kPropertyArr3 = InvoiceListScreen.U;
                        InvoiceListScreen invoiceListScreen2 = this.f258037b;
                        return dli.f.a(invoiceListScreen2, invoiceListScreen2.d(), v.k(new RowLoadingDelegate(), new ListSubheaderDelegate(), invoiceListScreen2.Q, invoiceListScreen2.P, invoiceListScreen2.O), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: rx6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoiceListScreen f258037b;

            {
                this.f258037b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                InvoiceListScreen invoiceListScreen = this.f258037b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InvoiceListScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(invoiceListScreen.m2()).a().get(g2.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", g2.class, " is not found"));
                        }
                        g2 g2Var = ((g2) ((sx6.a) aVar2.b())).f282557j;
                        InvoiceListScreenContract$InputData invoiceListScreenContract$InputData = invoiceListScreen.K;
                        invoiceListScreenContract$InputData.getClass();
                        return new o2(g2Var, invoiceListScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = InvoiceListScreen.U;
                        return (o) ((o2) invoiceListScreen.R.getValue()).f282653m.get();
                    default:
                        KProperty[] kPropertyArr3 = InvoiceListScreen.U;
                        InvoiceListScreen invoiceListScreen2 = this.f258037b;
                        return dli.f.a(invoiceListScreen2, invoiceListScreen2.d(), v.k(new RowLoadingDelegate(), new ListSubheaderDelegate(), invoiceListScreen2.Q, invoiceListScreen2.P, invoiceListScreen2.O), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        rx6.q uiState = (rx6.q) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        p pVar = uiState.f258053a;
        TextLocalisedClause textLocalisedClause = pVar.f258050a;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setMenuItems(pVar.f258051b);
        if (pVar.f258052c) {
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
        if (!((m) ((j2) ((a) d()).f73878r.f22677a).getValue()).f258046c) {
            return super.F2();
        }
        a aVar = (a) d();
        y yVar = aVar.f73878r;
        if (((m) ((j2) yVar.f22677a).getValue()).f258046c) {
            aVar.H2(yVar, new rk.b(false, 1));
            return true;
        }
        aVar.B2();
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (o2) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, l.y(d3().f174539b.f59410q, d3().f174539b.f59409p.f57336l, "merge(...)"), null, new rx6.h(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, new r7b.e(rd0.e.b(d3().f174539b.o.f57403b), 22), null, new rx6.h(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.o.f57403b), null, new rt4.o(this, continuation, 10), 3);
        int i = 4;
        int i2 = 2;
        com.revolut.kompot.navigable.a.g2(this, t1.d(rd0.e.b(d3().f174539b.f59409p.f57337m), 300L), null, new q9c.v(i2, d(), rx6.o.class, "onSearchQueryChanged", "onSearchQueryChanged(Ljava/lang/String;)V", i, 25), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.f51611c.f121375b), null, new q9c.v(i2, d(), rx6.o.class, "onFilterClicked", "onFilterClicked(Lcom/revolut/core/ui_kit/delegates/ActionsDelegate$ClickData;)V", i, 26), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.f53218h), null, new i(this, null), 3);
        FullScreenStateDelegate fullScreenStateDelegate = this.O;
        com.revolut.kompot.navigable.a.g2(this, new r7b.e(rd0.e.b(fullScreenStateDelegate.f52371h.f121375b), 23), null, new j(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, new r7b.e(rd0.e.b(fullScreenStateDelegate.f52371h.f121375b), 24), null, new g(this, null), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.N.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final rx6.o d() {
        return (rx6.o) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.M);
    }
}
