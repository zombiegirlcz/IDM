package com.revolut.feature.freelancer.impl.ui.invoice.create.screen;

import android.content.Intent;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.BannerDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsPriceDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsTotalDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputDualTextDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import com.revolut.feature.freelancer.impl.ui.invoice.create.screen.InvoiceCreateScreen;
import com.revolut.feature.freelancer.impl.ui.invoice.create.screen.InvoiceCreateScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import efm.r;
import ix6.a0;
import ix6.b0;
import ix6.c0;
import ix6.d0;
import ix6.e0;
import ix6.i;
import ix6.j;
import ix6.k;
import ix6.l;
import ix6.l0;
import ix6.m;
import ix6.n;
import ix6.p;
import java.util.List;
import jii.u;
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
import us6.i2;
import vc.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/invoice/create/screen/InvoiceCreateScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lix6/a0;", "Ltki/c;", "Lix6/e0;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InvoiceCreateScreen extends ViewController<a0> implements tki.c {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f73827b0 = {o0.f186429a.j(new h0(InvoiceCreateScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final InvoiceCreateScreenContract$InputData K;
    public final int L;
    public final ao.h M;
    public final BannerDelegate N;
    public final CellDetailsActionDelegate O;
    public final CellDetailsDelegate P;
    public final CellDetailsNoteDelegate Q;
    public final FullScreenStateDelegate R;
    public final InputTextDelegate S;
    public final InputDualTextDelegate T;
    public final ListSubheaderDelegate U;
    public final RowDelegate V;
    public final SmallActionButtonDelegate W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f73828a0;

    public InvoiceCreateScreen(InvoiceCreateScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = s.t(this, ix6.b.f);
        this.N = new BannerDelegate();
        this.O = new CellDetailsActionDelegate();
        this.P = new CellDetailsDelegate();
        this.Q = new CellDetailsNoteDelegate();
        this.R = new FullScreenStateDelegate();
        this.S = new InputTextDelegate(new ix6.d(2, 0, InvoiceCreateScreen.class, this, "getAmountMaskBinder", "getAmountMaskBinder(Lcom/revolut/core/ui_kit/delegates/InputTextDelegate$Model;Lcom/revolut/core/ui_kit/views/input/InputText;)Lcom/revolut/core/ui_kit/formatting/AmountMaskingDelegate;"));
        this.T = new InputDualTextDelegate(new ix6.c(2, 0, InvoiceCreateScreen.class, this, "getAmountMaskBinder", "getAmountMaskBinder(Lcom/revolut/core/ui_kit/delegates/InputTextDelegate$Model;Lcom/revolut/core/ui_kit/views/input/InputText;)Lcom/revolut/core/ui_kit/formatting/AmountMaskingDelegate;"), 2);
        this.U = new ListSubheaderDelegate();
        this.V = new RowDelegate(null, null, 7);
        this.W = new SmallActionButtonDelegate();
        final int i = 0;
        this.X = w.y0(new Function0(this) { // from class: ix6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoiceCreateScreen f169380b;

            {
                this.f169380b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                InvoiceCreateScreen invoiceCreateScreen = this.f169380b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = InvoiceCreateScreen.f73827b0;
                        qd0.b bVarN = ((i2) invoiceCreateScreen.Y.getValue()).f282581b.f282554c.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = InvoiceCreateScreen.f73827b0;
                        qji.b bVarU2 = invoiceCreateScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.invoice.create.screen.di.InvoiceCreateScreenInjector");
                        h2 h2Var = (h2) bVarU2;
                        g2 g2Var = h2Var.f282567b;
                        h2 h2Var2 = h2Var.f282568c;
                        InvoiceCreateScreenContract$InputData invoiceCreateScreenContract$InputData = invoiceCreateScreen.K;
                        invoiceCreateScreenContract$InputData.getClass();
                        return new i2(g2Var, h2Var2, invoiceCreateScreenContract$InputData);
                    case 2:
                        KProperty[] kPropertyArr3 = InvoiceCreateScreen.f73827b0;
                        return (b0) ((i2) invoiceCreateScreen.Y.getValue()).f282583g.get();
                    default:
                        KProperty[] kPropertyArr4 = InvoiceCreateScreen.f73827b0;
                        InvoiceCreateScreen invoiceCreateScreen2 = this.f169380b;
                        return tki.g.a(invoiceCreateScreen2, invoiceCreateScreen2.d(), zhm.d0.E0(((fd6.a) ((i2) invoiceCreateScreen2.Y.getValue()).d.get()).e, zhm.v.k(invoiceCreateScreen2.N, invoiceCreateScreen2.O, invoiceCreateScreen2.P, invoiceCreateScreen2.Q, new CellDetailsPriceDelegate(), new CellDetailsTotalDelegate(), invoiceCreateScreen2.R, invoiceCreateScreen2.S, invoiceCreateScreen2.T, invoiceCreateScreen2.U, new ListSubheaderLoadingDelegate(), new PlainTextWarningDelegate(), invoiceCreateScreen2.V, new RowLoadingDelegate(), invoiceCreateScreen2.W)), 0, null, new z4l.j((List) zhm.f0.f322471a, false, false, true), null, 44);
                }
            }
        });
        final int i2 = 1;
        this.Y = w.y0(new Function0(this) { // from class: ix6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoiceCreateScreen f169380b;

            {
                this.f169380b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                InvoiceCreateScreen invoiceCreateScreen = this.f169380b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InvoiceCreateScreen.f73827b0;
                        qd0.b bVarN = ((i2) invoiceCreateScreen.Y.getValue()).f282581b.f282554c.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = InvoiceCreateScreen.f73827b0;
                        qji.b bVarU2 = invoiceCreateScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.invoice.create.screen.di.InvoiceCreateScreenInjector");
                        h2 h2Var = (h2) bVarU2;
                        g2 g2Var = h2Var.f282567b;
                        h2 h2Var2 = h2Var.f282568c;
                        InvoiceCreateScreenContract$InputData invoiceCreateScreenContract$InputData = invoiceCreateScreen.K;
                        invoiceCreateScreenContract$InputData.getClass();
                        return new i2(g2Var, h2Var2, invoiceCreateScreenContract$InputData);
                    case 2:
                        KProperty[] kPropertyArr3 = InvoiceCreateScreen.f73827b0;
                        return (b0) ((i2) invoiceCreateScreen.Y.getValue()).f282583g.get();
                    default:
                        KProperty[] kPropertyArr4 = InvoiceCreateScreen.f73827b0;
                        InvoiceCreateScreen invoiceCreateScreen2 = this.f169380b;
                        return tki.g.a(invoiceCreateScreen2, invoiceCreateScreen2.d(), zhm.d0.E0(((fd6.a) ((i2) invoiceCreateScreen2.Y.getValue()).d.get()).e, zhm.v.k(invoiceCreateScreen2.N, invoiceCreateScreen2.O, invoiceCreateScreen2.P, invoiceCreateScreen2.Q, new CellDetailsPriceDelegate(), new CellDetailsTotalDelegate(), invoiceCreateScreen2.R, invoiceCreateScreen2.S, invoiceCreateScreen2.T, invoiceCreateScreen2.U, new ListSubheaderLoadingDelegate(), new PlainTextWarningDelegate(), invoiceCreateScreen2.V, new RowLoadingDelegate(), invoiceCreateScreen2.W)), 0, null, new z4l.j((List) zhm.f0.f322471a, false, false, true), null, 44);
                }
            }
        });
        final int i3 = 2;
        this.Z = w.y0(new Function0(this) { // from class: ix6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoiceCreateScreen f169380b;

            {
                this.f169380b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                InvoiceCreateScreen invoiceCreateScreen = this.f169380b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InvoiceCreateScreen.f73827b0;
                        qd0.b bVarN = ((i2) invoiceCreateScreen.Y.getValue()).f282581b.f282554c.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = InvoiceCreateScreen.f73827b0;
                        qji.b bVarU2 = invoiceCreateScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.invoice.create.screen.di.InvoiceCreateScreenInjector");
                        h2 h2Var = (h2) bVarU2;
                        g2 g2Var = h2Var.f282567b;
                        h2 h2Var2 = h2Var.f282568c;
                        InvoiceCreateScreenContract$InputData invoiceCreateScreenContract$InputData = invoiceCreateScreen.K;
                        invoiceCreateScreenContract$InputData.getClass();
                        return new i2(g2Var, h2Var2, invoiceCreateScreenContract$InputData);
                    case 2:
                        KProperty[] kPropertyArr3 = InvoiceCreateScreen.f73827b0;
                        return (b0) ((i2) invoiceCreateScreen.Y.getValue()).f282583g.get();
                    default:
                        KProperty[] kPropertyArr4 = InvoiceCreateScreen.f73827b0;
                        InvoiceCreateScreen invoiceCreateScreen2 = this.f169380b;
                        return tki.g.a(invoiceCreateScreen2, invoiceCreateScreen2.d(), zhm.d0.E0(((fd6.a) ((i2) invoiceCreateScreen2.Y.getValue()).d.get()).e, zhm.v.k(invoiceCreateScreen2.N, invoiceCreateScreen2.O, invoiceCreateScreen2.P, invoiceCreateScreen2.Q, new CellDetailsPriceDelegate(), new CellDetailsTotalDelegate(), invoiceCreateScreen2.R, invoiceCreateScreen2.S, invoiceCreateScreen2.T, invoiceCreateScreen2.U, new ListSubheaderLoadingDelegate(), new PlainTextWarningDelegate(), invoiceCreateScreen2.V, new RowLoadingDelegate(), invoiceCreateScreen2.W)), 0, null, new z4l.j((List) zhm.f0.f322471a, false, false, true), null, 44);
                }
            }
        });
        final int i5 = 3;
        this.f73828a0 = w.y0(new Function0(this) { // from class: ix6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoiceCreateScreen f169380b;

            {
                this.f169380b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                InvoiceCreateScreen invoiceCreateScreen = this.f169380b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InvoiceCreateScreen.f73827b0;
                        qd0.b bVarN = ((i2) invoiceCreateScreen.Y.getValue()).f282581b.f282554c.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = InvoiceCreateScreen.f73827b0;
                        qji.b bVarU2 = invoiceCreateScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.invoice.create.screen.di.InvoiceCreateScreenInjector");
                        h2 h2Var = (h2) bVarU2;
                        g2 g2Var = h2Var.f282567b;
                        h2 h2Var2 = h2Var.f282568c;
                        InvoiceCreateScreenContract$InputData invoiceCreateScreenContract$InputData = invoiceCreateScreen.K;
                        invoiceCreateScreenContract$InputData.getClass();
                        return new i2(g2Var, h2Var2, invoiceCreateScreenContract$InputData);
                    case 2:
                        KProperty[] kPropertyArr3 = InvoiceCreateScreen.f73827b0;
                        return (b0) ((i2) invoiceCreateScreen.Y.getValue()).f282583g.get();
                    default:
                        KProperty[] kPropertyArr4 = InvoiceCreateScreen.f73827b0;
                        InvoiceCreateScreen invoiceCreateScreen2 = this.f169380b;
                        return tki.g.a(invoiceCreateScreen2, invoiceCreateScreen2.d(), zhm.d0.E0(((fd6.a) ((i2) invoiceCreateScreen2.Y.getValue()).d.get()).e, zhm.v.k(invoiceCreateScreen2.N, invoiceCreateScreen2.O, invoiceCreateScreen2.P, invoiceCreateScreen2.Q, new CellDetailsPriceDelegate(), new CellDetailsTotalDelegate(), invoiceCreateScreen2.R, invoiceCreateScreen2.S, invoiceCreateScreen2.T, invoiceCreateScreen2.U, new ListSubheaderLoadingDelegate(), new PlainTextWarningDelegate(), invoiceCreateScreen2.V, new RowLoadingDelegate(), invoiceCreateScreen2.W)), 0, null, new z4l.j((List) zhm.f0.f322471a, false, false, true), null, 44);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, kotlin.Lazy] */
    public static final zp0.d d3(InvoiceCreateScreen invoiceCreateScreen, InputTextDelegate.Model model, InputText inputText) {
        invoiceCreateScreen.getClass();
        Object obj2 = model.P;
        if (obj2 instanceof lx6.b) {
            return new zp0.d(inputText.getInnerEditText(), ((lx6.b) obj2).f200530a, (u80.d) invoiceCreateScreen.X.getValue(), null, null, false, false, 0, false, null, 1912);
        }
        return null;
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        e0 uiState = (e0) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = e3().f174565c;
        d0 d0Var = uiState.f169385a;
        c0 c0Var = uiState.f169387c;
        if (d0Var != null) {
            Clause clause = d0Var.f169383b;
            Clause clause2 = d0Var.f169382a;
            navBarWithToolbar.setToolbarTitle(clause2);
            navBarWithToolbar.setTitle(clause2, null);
            navBarWithToolbar.setSecondDescriptionText(clause);
            navBarWithToolbar.setSecondDescriptionVisible(clause != null);
            navBarWithToolbar.setFilters(d0Var.f169384c);
        }
        e3().f174564b.setText(c0Var != null ? c0Var.f169381a : null);
        e3().f174564b.setEnabled(pd.b.j(c0Var != null ? Boolean.TRUE : null));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (i2) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void W2(int i, int i2, Intent intent) {
        String currencyCode;
        if (i != 4 || i2 != -1 || intent == null || (currencyCode = intent.getStringExtra("argCurrency")) == null) {
            return;
        }
        g gVar = (g) d();
        gVar.getClass();
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        FreelancerInvoice freelancerInvoiceJ2 = gVar.J2();
        if (freelancerInvoiceJ2 != null) {
            gVar.n2(new l0(gVar, freelancerInvoiceJ2, currencyCode, (Continuation) null), new whi.b(6));
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        e3().f174565c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(e3().f174565c.f59410q), new i(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(e3().f174565c.s0()), new j(this, null), 3);
        ViewController.P2(this, rd0.e.b(e3().f174564b.o), new i(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.N.e), new k(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.O.d), new l(this, null), 3);
        CellDetailsDelegate cellDetailsDelegate = this.P;
        ViewController.P2(this, rd0.e.b(cellDetailsDelegate.d), new m(this, null), 3);
        ViewController.P2(this, rd0.e.b(cellDetailsDelegate.e), new n(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.R.f52371h.f121375b), new ix6.o(this, null), 3);
        ihm.f fVar = this.S.e.f121375b;
        InputDualTextDelegate inputDualTextDelegate = this.T;
        ViewController.P2(this, h30.l.y(fVar, inputDualTextDelegate.f52549c.e.f121375b, "merge(...)"), new p(this, null), 3);
        InputTextDelegate inputTextDelegate = inputDualTextDelegate.d;
        ViewController.P2(this, h30.l.y(inputTextDelegate.f52575g.f121375b, inputTextDelegate.i.f121375b, "merge(...)"), new ix6.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.U.f52707c), new ix6.f(this, null), 3);
        RowDelegate rowDelegate = this.V;
        r rVarMerge = r.merge(rowDelegate.f53218h, rowDelegate.f53220l, rowDelegate.f53225r);
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        ViewController.P2(this, rd0.e.b(rVarMerge), new ix6.g(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.W.f53336c.f121375b), new ix6.h(this, null), 3);
    }

    public final u e3() {
        ViewBinding value = this.M.getValue(this, f73827b0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: f3, reason: merged with bridge method [inline-methods] */
    public final b0 d() {
        return (b0) this.Z.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.f73828a0.getValue();
    }
}
