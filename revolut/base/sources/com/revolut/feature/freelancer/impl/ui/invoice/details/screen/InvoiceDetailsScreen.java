package com.revolut.feature.freelancer.impl.ui.invoice.details.screen;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsTotalDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.freelancer.impl.ui.invoice.details.screen.InvoiceDetailsScreen;
import com.revolut.feature.freelancer.impl.ui.invoice.details.screen.InvoiceDetailsScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import efm.r;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ocb.d;
import ox5.p;
import ox5.t0;
import ox6.b;
import ox6.f;
import ox6.g;
import ox6.k;
import ox6.l;
import ox6.m;
import ox6.n;
import te0.w;
import tki.c;
import us6.g2;
import us6.k2;
import us6.l2;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/invoice/details/screen/InvoiceDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lox6/k;", "Ltki/c;", "Lox6/p;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InvoiceDetailsScreen extends ViewController<k> implements c {
    public static final /* synthetic */ KProperty[] Z = {o0.f186429a.j(new h0(InvoiceDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final InvoiceDetailsScreenContract$InputData K;
    public final Object L;
    public final h M;
    public final int N;
    public final boolean O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;
    public final Object W;
    public final Object X;
    public final Object Y;

    public InvoiceDetailsScreen(InvoiceDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 1;
        this.L = w.y0(new Function0(this) { // from class: ox6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoiceDetailsScreen f230623b;

            {
                this.f230623b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                InvoiceDetailsScreen invoiceDetailsScreen = this.f230623b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = InvoiceDetailsScreen.Z;
                        return (l) ((l2) invoiceDetailsScreen.L.getValue()).f282621g.get();
                    case 1:
                        KProperty[] kPropertyArr2 = InvoiceDetailsScreen.Z;
                        qji.b bVarR1 = invoiceDetailsScreen.z2().R1();
                        Intrinsics.i(bVarR1, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.invoice.details.screen.di.InvoiceDetailsScreenInjector");
                        k2 k2Var = (k2) ((px6.a) bVarR1);
                        g2 g2Var = k2Var.f282604b;
                        k2 k2Var2 = k2Var.f282605c;
                        InvoiceDetailsScreenContract$InputData invoiceDetailsScreenContract$InputData = invoiceDetailsScreen.K;
                        invoiceDetailsScreenContract$InputData.getClass();
                        return new l2(g2Var, k2Var2, invoiceDetailsScreen, invoiceDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = InvoiceDetailsScreen.Z;
                        InvoiceDetailsScreen invoiceDetailsScreen2 = this.f230623b;
                        return tki.g.a(invoiceDetailsScreen2, invoiceDetailsScreen2.d(), v.k((RowDelegate) invoiceDetailsScreen2.P.getValue(), new RowLoadingDelegate(), (ListSubheaderDelegate) invoiceDetailsScreen2.Q.getValue(), new ListSubheaderLoadingDelegate(), (CellDetailsActionDelegate) invoiceDetailsScreen2.S.getValue(), (CellDetailsChevronDelegate) invoiceDetailsScreen2.V.getValue(), (CellDetailsTotalDelegate) invoiceDetailsScreen2.T.getValue(), (CellDetailsDelegate) invoiceDetailsScreen2.U.getValue(), new CellDetailsDelegate(), new CellDetailsNoteDelegate(), new PlainTextDelegate(), new PlainTextWarningDelegate(), (FullScreenStateDelegate) invoiceDetailsScreen2.W.getValue()), 0, null, null, null, 60);
                }
            }
        });
        this.M = s.t(this, b.f);
        this.N = R$layout.screen_recycler_navbar;
        this.O = true;
        this.P = w.y0(new p(14));
        this.Q = w.y0(new p(15));
        this.R = w.y0(new p(16));
        this.S = w.y0(new p(17));
        this.T = w.y0(new p(18));
        this.U = w.y0(new p(11));
        this.V = w.y0(new p(12));
        this.W = w.y0(new p(13));
        final int i2 = 0;
        this.X = w.y0(new Function0(this) { // from class: ox6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoiceDetailsScreen f230623b;

            {
                this.f230623b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                InvoiceDetailsScreen invoiceDetailsScreen = this.f230623b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InvoiceDetailsScreen.Z;
                        return (l) ((l2) invoiceDetailsScreen.L.getValue()).f282621g.get();
                    case 1:
                        KProperty[] kPropertyArr2 = InvoiceDetailsScreen.Z;
                        qji.b bVarR1 = invoiceDetailsScreen.z2().R1();
                        Intrinsics.i(bVarR1, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.invoice.details.screen.di.InvoiceDetailsScreenInjector");
                        k2 k2Var = (k2) ((px6.a) bVarR1);
                        g2 g2Var = k2Var.f282604b;
                        k2 k2Var2 = k2Var.f282605c;
                        InvoiceDetailsScreenContract$InputData invoiceDetailsScreenContract$InputData = invoiceDetailsScreen.K;
                        invoiceDetailsScreenContract$InputData.getClass();
                        return new l2(g2Var, k2Var2, invoiceDetailsScreen, invoiceDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = InvoiceDetailsScreen.Z;
                        InvoiceDetailsScreen invoiceDetailsScreen2 = this.f230623b;
                        return tki.g.a(invoiceDetailsScreen2, invoiceDetailsScreen2.d(), v.k((RowDelegate) invoiceDetailsScreen2.P.getValue(), new RowLoadingDelegate(), (ListSubheaderDelegate) invoiceDetailsScreen2.Q.getValue(), new ListSubheaderLoadingDelegate(), (CellDetailsActionDelegate) invoiceDetailsScreen2.S.getValue(), (CellDetailsChevronDelegate) invoiceDetailsScreen2.V.getValue(), (CellDetailsTotalDelegate) invoiceDetailsScreen2.T.getValue(), (CellDetailsDelegate) invoiceDetailsScreen2.U.getValue(), new CellDetailsDelegate(), new CellDetailsNoteDelegate(), new PlainTextDelegate(), new PlainTextWarningDelegate(), (FullScreenStateDelegate) invoiceDetailsScreen2.W.getValue()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.Y = w.y0(new Function0(this) { // from class: ox6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoiceDetailsScreen f230623b;

            {
                this.f230623b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                InvoiceDetailsScreen invoiceDetailsScreen = this.f230623b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InvoiceDetailsScreen.Z;
                        return (l) ((l2) invoiceDetailsScreen.L.getValue()).f282621g.get();
                    case 1:
                        KProperty[] kPropertyArr2 = InvoiceDetailsScreen.Z;
                        qji.b bVarR1 = invoiceDetailsScreen.z2().R1();
                        Intrinsics.i(bVarR1, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.invoice.details.screen.di.InvoiceDetailsScreenInjector");
                        k2 k2Var = (k2) ((px6.a) bVarR1);
                        g2 g2Var = k2Var.f282604b;
                        k2 k2Var2 = k2Var.f282605c;
                        InvoiceDetailsScreenContract$InputData invoiceDetailsScreenContract$InputData = invoiceDetailsScreen.K;
                        invoiceDetailsScreenContract$InputData.getClass();
                        return new l2(g2Var, k2Var2, invoiceDetailsScreen, invoiceDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = InvoiceDetailsScreen.Z;
                        InvoiceDetailsScreen invoiceDetailsScreen2 = this.f230623b;
                        return tki.g.a(invoiceDetailsScreen2, invoiceDetailsScreen2.d(), v.k((RowDelegate) invoiceDetailsScreen2.P.getValue(), new RowLoadingDelegate(), (ListSubheaderDelegate) invoiceDetailsScreen2.Q.getValue(), new ListSubheaderLoadingDelegate(), (CellDetailsActionDelegate) invoiceDetailsScreen2.S.getValue(), (CellDetailsChevronDelegate) invoiceDetailsScreen2.V.getValue(), (CellDetailsTotalDelegate) invoiceDetailsScreen2.T.getValue(), (CellDetailsDelegate) invoiceDetailsScreen2.U.getValue(), new CellDetailsDelegate(), new CellDetailsNoteDelegate(), new PlainTextDelegate(), new PlainTextWarningDelegate(), (FullScreenStateDelegate) invoiceDetailsScreen2.W.getValue()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        ox6.p uiState = (ox6.p) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        if (uiState instanceof ox6.o) {
            d3().f174539b.setLoadingVisible(true);
            return;
        }
        if (!(uiState instanceof m)) {
            if (!(uiState instanceof n)) {
                throw new NoWhenBranchMatchedException();
            }
            d3().f174539b.setLoadingVisible(false);
            return;
        }
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setLoadingVisible(false);
        m mVar = (m) uiState;
        Clause clause = mVar.f230632c;
        Clause clause2 = mVar.f230631b;
        MoneyClause moneyClause = mVar.f230630a;
        navBarWithToolbar.setTitle(moneyClause, null);
        navBarWithToolbar.setToolbarTitle(moneyClause);
        navBarWithToolbar.setDescriptionVisible(clause2 != null);
        navBarWithToolbar.setDescriptionText(clause2);
        navBarWithToolbar.setEndIconImage(mVar.d);
        navBarWithToolbar.setSecondDescriptionVisible(clause != null);
        navBarWithToolbar.setSecondDescriptionText(clause);
        navBarWithToolbar.setActions(mVar.f);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (l2) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        ((j60.a) ((l2) this.L.getValue()).e.get()).d(v.k((RowDelegate) this.R.getValue(), (CellDetailsDelegate) this.U.getValue()));
    }

    /* JADX WARN: Type inference failed for: r6v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v21, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v26, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v31, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v37, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new d(this, continuation, 27), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.s0()), new ox6.d(this, null), 3);
        r rVarFilter = ((CellDetailsActionDelegate) this.S.getValue()).d.filter(new or2.e(new t0(1), 26));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        ViewController.P2(this, rd0.e.b(rVarFilter), new ox6.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(w.a0(((CellDetailsDelegate) this.U.getValue()).d, new t0(2))), new ox5.r(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(((CellDetailsChevronDelegate) this.V.getValue()).f51821c), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(((RowDelegate) this.R.getValue()).f53218h), new g(this, null), 3);
        ViewController.P2(this, rd0.e.b(((FullScreenStateDelegate) this.W.getValue()).f52371h.f121375b), new ox6.h(this, null), 3);
        ViewController.P2(this, rd0.e.b(((RowDelegate) this.P.getValue()).f53218h), new ox6.c(this, null), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.M.getValue(this, Z[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final l d() {
        return (l) this.X.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.O);
    }
}
