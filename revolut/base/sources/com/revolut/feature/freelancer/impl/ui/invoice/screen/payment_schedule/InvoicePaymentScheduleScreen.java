package com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_schedule;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputDualTextDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_schedule.InvoicePaymentScheduleScreen;
import com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_schedule.InvoicePaymentScheduleScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import efm.r;
import fna.f;
import h30.l;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import us6.g2;
import us6.h2;
import us6.p2;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/invoice/screen/payment_schedule/InvoicePaymentScheduleScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lfy6/s;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InvoicePaymentScheduleScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(InvoicePaymentScheduleScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final InvoicePaymentScheduleScreenContract$InputData K;
    public final int L;
    public final h M;
    public final SingleChoiceDelegate N;
    public final FullScreenStateDelegate O;
    public final InputTextDelegate P;
    public final InputDualTextDelegate Q;
    public final FixedTabsDelegate R;
    public final Object S;
    public final Object T;
    public final Object U;

    public InvoicePaymentScheduleScreen(InvoicePaymentScheduleScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = s.t(this, fy6.b.f);
        this.N = new SingleChoiceDelegate();
        this.O = new FullScreenStateDelegate();
        this.P = new InputTextDelegate(null);
        this.Q = new InputDualTextDelegate(null, 3);
        this.R = new FixedTabsDelegate();
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: fy6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoicePaymentScheduleScreen f138932b;

            {
                this.f138932b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                InvoicePaymentScheduleScreen invoicePaymentScheduleScreen = this.f138932b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = InvoicePaymentScheduleScreen.V;
                        InvoicePaymentScheduleScreen invoicePaymentScheduleScreen2 = this.f138932b;
                        return dli.f.a(invoicePaymentScheduleScreen2, invoicePaymentScheduleScreen2.R2(), zhm.v.k(invoicePaymentScheduleScreen2.O, invoicePaymentScheduleScreen2.P, invoicePaymentScheduleScreen2.Q, new ListSubheaderDelegate(), new RowLoadingDelegate(), invoicePaymentScheduleScreen2.R), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = InvoicePaymentScheduleScreen.V;
                        qji.b bVarU2 = invoicePaymentScheduleScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_schedule.di.InvoicePaymentScheduleScreenInjector");
                        h2 h2Var = (h2) bVarU2;
                        g2 g2Var = h2Var.f282567b;
                        h2 h2Var2 = h2Var.f282568c;
                        InvoicePaymentScheduleScreenContract$InputData invoicePaymentScheduleScreenContract$InputData = invoicePaymentScheduleScreen.K;
                        invoicePaymentScheduleScreenContract$InputData.getClass();
                        return new p2(g2Var, h2Var2, invoicePaymentScheduleScreen, invoicePaymentScheduleScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = InvoicePaymentScheduleScreen.V;
                        return (o) ((p2) invoicePaymentScheduleScreen.T.getValue()).f282666g.get();
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: fy6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoicePaymentScheduleScreen f138932b;

            {
                this.f138932b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                InvoicePaymentScheduleScreen invoicePaymentScheduleScreen = this.f138932b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InvoicePaymentScheduleScreen.V;
                        InvoicePaymentScheduleScreen invoicePaymentScheduleScreen2 = this.f138932b;
                        return dli.f.a(invoicePaymentScheduleScreen2, invoicePaymentScheduleScreen2.R2(), zhm.v.k(invoicePaymentScheduleScreen2.O, invoicePaymentScheduleScreen2.P, invoicePaymentScheduleScreen2.Q, new ListSubheaderDelegate(), new RowLoadingDelegate(), invoicePaymentScheduleScreen2.R), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = InvoicePaymentScheduleScreen.V;
                        qji.b bVarU2 = invoicePaymentScheduleScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_schedule.di.InvoicePaymentScheduleScreenInjector");
                        h2 h2Var = (h2) bVarU2;
                        g2 g2Var = h2Var.f282567b;
                        h2 h2Var2 = h2Var.f282568c;
                        InvoicePaymentScheduleScreenContract$InputData invoicePaymentScheduleScreenContract$InputData = invoicePaymentScheduleScreen.K;
                        invoicePaymentScheduleScreenContract$InputData.getClass();
                        return new p2(g2Var, h2Var2, invoicePaymentScheduleScreen, invoicePaymentScheduleScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = InvoicePaymentScheduleScreen.V;
                        return (o) ((p2) invoicePaymentScheduleScreen.T.getValue()).f282666g.get();
                }
            }
        });
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: fy6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoicePaymentScheduleScreen f138932b;

            {
                this.f138932b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                InvoicePaymentScheduleScreen invoicePaymentScheduleScreen = this.f138932b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InvoicePaymentScheduleScreen.V;
                        InvoicePaymentScheduleScreen invoicePaymentScheduleScreen2 = this.f138932b;
                        return dli.f.a(invoicePaymentScheduleScreen2, invoicePaymentScheduleScreen2.R2(), zhm.v.k(invoicePaymentScheduleScreen2.O, invoicePaymentScheduleScreen2.P, invoicePaymentScheduleScreen2.Q, new ListSubheaderDelegate(), new RowLoadingDelegate(), invoicePaymentScheduleScreen2.R), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = InvoicePaymentScheduleScreen.V;
                        qji.b bVarU2 = invoicePaymentScheduleScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_schedule.di.InvoicePaymentScheduleScreenInjector");
                        h2 h2Var = (h2) bVarU2;
                        g2 g2Var = h2Var.f282567b;
                        h2 h2Var2 = h2Var.f282568c;
                        InvoicePaymentScheduleScreenContract$InputData invoicePaymentScheduleScreenContract$InputData = invoicePaymentScheduleScreen.K;
                        invoicePaymentScheduleScreenContract$InputData.getClass();
                        return new p2(g2Var, h2Var2, invoicePaymentScheduleScreen, invoicePaymentScheduleScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = InvoicePaymentScheduleScreen.V;
                        return (o) ((p2) invoicePaymentScheduleScreen.T.getValue()).f282666g.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        fy6.s uiState = (fy6.s) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174564b.setEnabled(uiState.f138947b.f138945a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (p2) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.freelancer_sale_invoice_schedule_header_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f174564b.setText(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_confirm, null, null, 14));
        d3().f174564b.setLoadingButtonTag("RECURRING_INVOICE_BUTTON_TAG");
        ((j60.a) ((p2) this.T.getValue()).e.get()).d(u.c(this.N));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new fy6.c(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new fy6.c(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.O.f52371h.f121375b), new fy6.d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.R.f52339c.f121375b), new f(this, continuation, 25), 3);
        InputTextDelegate inputTextDelegate = this.P;
        ihm.f fVar = inputTextDelegate.f52575g.f121375b;
        ihm.f fVar2 = inputTextDelegate.i.f121375b;
        InputDualTextDelegate inputDualTextDelegate = this.Q;
        ihm.f fVar3 = inputDualTextDelegate.f52549c.f52575g.f121375b;
        InputTextDelegate inputTextDelegate2 = inputDualTextDelegate.d;
        r rVarMerge = r.merge(fVar, fVar2, fVar3, inputTextDelegate2.f52575g.f121375b);
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarMerge), null, new fy6.e(this, null), 3);
        ViewController.P2(this, l.y(inputDualTextDelegate.f52549c.e.f121375b, inputTextDelegate2.e.f121375b, "merge(...)"), new fy6.f(this, null), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.M.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final fy6.o R2() {
        return (fy6.o) this.U.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }
}
