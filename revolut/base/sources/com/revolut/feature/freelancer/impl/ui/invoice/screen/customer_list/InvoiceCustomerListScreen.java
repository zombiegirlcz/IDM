package com.revolut.feature.freelancer.impl.ui.invoice.screen.customer_list;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.j4;
import cli.o;
import cli.y;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SearchButtonDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit.views.navbar.PlusActionNavBarMenuItem;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.feature.freelancer.impl.ui.invoice.screen.customer_list.InvoiceCustomerListScreen;
import com.revolut.feature.freelancer.impl.ui.invoice.screen.customer_list.InvoiceCustomerListScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tki.c;
import urd.n;
import us6.g2;
import us6.h2;
import us6.j2;
import ux6.b;
import ux6.f;
import ux6.g;
import ux6.i;
import ux6.j;
import ux6.k;
import ux6.l;
import vc.s;
import xki.e;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/invoice/screen/customer_list/InvoiceCustomerListScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ltki/c;", "Lux6/l;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InvoiceCustomerListScreen extends ViewController<q> implements c {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(InvoiceCustomerListScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final InvoiceCustomerListScreenContract$InputData K;
    public final FullScreenStateDelegate L;
    public final RowDelegate M;
    public final SearchButtonDelegate N;
    public final ListSubheaderDelegate O;
    public final SwipeToActionDelegate P;
    public final h Q;
    public final int R;
    public final Object S;
    public final Object T;
    public final Object U;

    public InvoiceCustomerListScreen(InvoiceCustomerListScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = new FullScreenStateDelegate();
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.M = rowDelegate;
        this.N = new SearchButtonDelegate();
        this.O = new ListSubheaderDelegate();
        this.P = new SwipeToActionDelegate(rowDelegate, false);
        this.Q = s.t(this, b.f);
        this.R = R$layout.screen_recycler_navbar;
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: ux6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoiceCustomerListScreen f283877b;

            {
                this.f283877b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                InvoiceCustomerListScreen invoiceCustomerListScreen = this.f283877b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = InvoiceCustomerListScreen.V;
                        InvoiceCustomerListScreen invoiceCustomerListScreen2 = this.f283877b;
                        return tki.g.a(invoiceCustomerListScreen2, invoiceCustomerListScreen2.d(), v.k(invoiceCustomerListScreen2.L, invoiceCustomerListScreen2.M, invoiceCustomerListScreen2.O, invoiceCustomerListScreen2.N, invoiceCustomerListScreen2.P, new RowLoadingDelegate(), new ListSubheaderLoadingDelegate()), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = InvoiceCustomerListScreen.V;
                        qji.b bVarU2 = invoiceCustomerListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.invoice.screen.customer_list.di.InvoiceCustomerListScreenInjector");
                        h2 h2Var = (h2) bVarU2;
                        g2 g2Var = h2Var.f282567b;
                        h2 h2Var2 = h2Var.f282568c;
                        InvoiceCustomerListScreenContract$InputData invoiceCustomerListScreenContract$InputData = invoiceCustomerListScreen.K;
                        invoiceCustomerListScreenContract$InputData.getClass();
                        return new j2(g2Var, h2Var2, invoiceCustomerListScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = InvoiceCustomerListScreen.V;
                        return (k) ((j2) invoiceCustomerListScreen.T.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: ux6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoiceCustomerListScreen f283877b;

            {
                this.f283877b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                InvoiceCustomerListScreen invoiceCustomerListScreen = this.f283877b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InvoiceCustomerListScreen.V;
                        InvoiceCustomerListScreen invoiceCustomerListScreen2 = this.f283877b;
                        return tki.g.a(invoiceCustomerListScreen2, invoiceCustomerListScreen2.d(), v.k(invoiceCustomerListScreen2.L, invoiceCustomerListScreen2.M, invoiceCustomerListScreen2.O, invoiceCustomerListScreen2.N, invoiceCustomerListScreen2.P, new RowLoadingDelegate(), new ListSubheaderLoadingDelegate()), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = InvoiceCustomerListScreen.V;
                        qji.b bVarU2 = invoiceCustomerListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.invoice.screen.customer_list.di.InvoiceCustomerListScreenInjector");
                        h2 h2Var = (h2) bVarU2;
                        g2 g2Var = h2Var.f282567b;
                        h2 h2Var2 = h2Var.f282568c;
                        InvoiceCustomerListScreenContract$InputData invoiceCustomerListScreenContract$InputData = invoiceCustomerListScreen.K;
                        invoiceCustomerListScreenContract$InputData.getClass();
                        return new j2(g2Var, h2Var2, invoiceCustomerListScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = InvoiceCustomerListScreen.V;
                        return (k) ((j2) invoiceCustomerListScreen.T.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: ux6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoiceCustomerListScreen f283877b;

            {
                this.f283877b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                InvoiceCustomerListScreen invoiceCustomerListScreen = this.f283877b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InvoiceCustomerListScreen.V;
                        InvoiceCustomerListScreen invoiceCustomerListScreen2 = this.f283877b;
                        return tki.g.a(invoiceCustomerListScreen2, invoiceCustomerListScreen2.d(), v.k(invoiceCustomerListScreen2.L, invoiceCustomerListScreen2.M, invoiceCustomerListScreen2.O, invoiceCustomerListScreen2.N, invoiceCustomerListScreen2.P, new RowLoadingDelegate(), new ListSubheaderLoadingDelegate()), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = InvoiceCustomerListScreen.V;
                        qji.b bVarU2 = invoiceCustomerListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.invoice.screen.customer_list.di.InvoiceCustomerListScreenInjector");
                        h2 h2Var = (h2) bVarU2;
                        g2 g2Var = h2Var.f282567b;
                        h2 h2Var2 = h2Var.f282568c;
                        InvoiceCustomerListScreenContract$InputData invoiceCustomerListScreenContract$InputData = invoiceCustomerListScreen.K;
                        invoiceCustomerListScreenContract$InputData.getClass();
                        return new j2(g2Var, h2Var2, invoiceCustomerListScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = InvoiceCustomerListScreen.V;
                        return (k) ((j2) invoiceCustomerListScreen.T.getValue()).d.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        if (uiState.f283884b) {
            NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
            navBarWithToolbar.j0(false);
            navBarWithToolbar.K0(j4.FROM_CLICKED_BUTTON);
        } else {
            NavBarWithToolbar.Companion companion2 = NavBarWithToolbar.INSTANCE;
            navBarWithToolbar.H0(false);
            navBarWithToolbar.m0(j4.FROM_CLICKED_BUTTON);
            navBarWithToolbar.i0();
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        if (!((j) ((vkm.j2) ((a) d()).v.f22677a).getValue()).f283882c) {
            return super.F2();
        }
        a aVar = (a) d();
        y yVar = aVar.v;
        if (((j) ((vkm.j2) yVar.f22677a).getValue()).f283882c) {
            aVar.H2(yVar, new rk.b(false, 27));
            return true;
        }
        aVar.B2();
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (j2) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.freelancer_sale_invoice_who_to_bill_header_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.freelancer_sale_invoice_who_to_bill_header_title, null, null, 14));
        navBarWithToolbar.setMenuItems(u.c(PlusActionNavBarMenuItem.Companion.c(PlusActionNavBarMenuItem.INSTANCE, "MENU_ID_ADD_NEW", new TextLocalisedClause(R$string.freelancer_common_action_new, null, null, 14), null, 60)));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, h30.l.y(d3().f174539b.f59410q, d3().f174539b.f59409p.f57336l, "merge(...)"), new ux6.e(this, continuation, 0), 3);
        ViewController.P2(this, new n(rd0.e.b(d3().f174539b.o.f57403b), 13), new ux6.e(this, continuation, 1), 3);
        ViewController.P2(this, t1.d(rd0.e.b(d3().f174539b.f59409p.f57337m), 300L), new up2.q(this, continuation, 11), 3);
        ViewController.P2(this, rd0.e.b(this.L.f52371h.f121375b), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.N.f53283c.f121375b), new g(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.M.f53218h), new ux6.h(this, null), 3);
        ViewController.P2(this, new n(rd0.e.b(this.O.f52707c), 14), new i(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.Q.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final k d() {
        return (k) this.U.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.R;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.S.getValue();
    }
}
