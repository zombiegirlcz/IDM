package com.revolut.feature.freelancer.impl.ui.create_sale.invoice.number;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.feature.freelancer.impl.ui.create_sale.invoice.number.FreelancerInvoiceNumberSettingsScreen;
import com.revolut.feature.freelancer.impl.ui.create_sale.invoice.number.FreelancerInvoiceNumberSettingsScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import cw6.b;
import cw6.c;
import cw6.d;
import cw6.f;
import cw6.g;
import cw6.i;
import cw6.j;
import dli.a;
import efm.r;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import us6.f2;
import us6.g2;
import vc.s;
import xki.e;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/create_sale/invoice/number/FreelancerInvoiceNumberSettingsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lcw6/j;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FreelancerInvoiceNumberSettingsScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(FreelancerInvoiceNumberSettingsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final FreelancerInvoiceNumberSettingsScreenContract$InputData K;
    public final int L;
    public final boolean M;
    public final h N;
    public final FullScreenStateDelegate O;
    public final InputTextDelegate P;
    public final PlainTextDelegate Q;
    public final SelectableDelegate R;
    public final LargeActionButtonDelegate S;
    public final Object T;
    public final Object U;
    public final Object V;

    public FreelancerInvoiceNumberSettingsScreen(FreelancerInvoiceNumberSettingsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = true;
        this.N = s.t(this, b.f);
        this.O = new FullScreenStateDelegate();
        this.P = new InputTextDelegate(null);
        PlainTextDelegate plainTextDelegate = new PlainTextDelegate();
        this.Q = plainTextDelegate;
        this.R = new SelectableDelegate(plainTextDelegate);
        this.S = new LargeActionButtonDelegate();
        final int i = 0;
        this.T = w.y0(new Function0(this) { // from class: cw6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerInvoiceNumberSettingsScreen f109544b;

            {
                this.f109544b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                FreelancerInvoiceNumberSettingsScreen freelancerInvoiceNumberSettingsScreen = this.f109544b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerInvoiceNumberSettingsScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(freelancerInvoiceNumberSettingsScreen.m2()).a().get(g2.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", g2.class, " is not found"));
                        }
                        g2 g2Var = ((g2) ((dw6.a) aVar2.b())).f282557j;
                        FreelancerInvoiceNumberSettingsScreenContract$InputData freelancerInvoiceNumberSettingsScreenContract$InputData = freelancerInvoiceNumberSettingsScreen.K;
                        freelancerInvoiceNumberSettingsScreenContract$InputData.getClass();
                        return new f2(g2Var, freelancerInvoiceNumberSettingsScreen, freelancerInvoiceNumberSettingsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerInvoiceNumberSettingsScreen.W;
                        return (i) ((f2) freelancerInvoiceNumberSettingsScreen.T.getValue()).f282542g.get();
                    default:
                        KProperty[] kPropertyArr3 = FreelancerInvoiceNumberSettingsScreen.W;
                        FreelancerInvoiceNumberSettingsScreen freelancerInvoiceNumberSettingsScreen2 = this.f109544b;
                        return dli.f.a(freelancerInvoiceNumberSettingsScreen2, freelancerInvoiceNumberSettingsScreen2.R2(), v.k(freelancerInvoiceNumberSettingsScreen2.O, freelancerInvoiceNumberSettingsScreen2.P, new PlainTextWarningDelegate(), new RowLoadingDelegate(), freelancerInvoiceNumberSettingsScreen2.R), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.U = w.y0(new Function0(this) { // from class: cw6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerInvoiceNumberSettingsScreen f109544b;

            {
                this.f109544b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                FreelancerInvoiceNumberSettingsScreen freelancerInvoiceNumberSettingsScreen = this.f109544b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerInvoiceNumberSettingsScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(freelancerInvoiceNumberSettingsScreen.m2()).a().get(g2.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", g2.class, " is not found"));
                        }
                        g2 g2Var = ((g2) ((dw6.a) aVar2.b())).f282557j;
                        FreelancerInvoiceNumberSettingsScreenContract$InputData freelancerInvoiceNumberSettingsScreenContract$InputData = freelancerInvoiceNumberSettingsScreen.K;
                        freelancerInvoiceNumberSettingsScreenContract$InputData.getClass();
                        return new f2(g2Var, freelancerInvoiceNumberSettingsScreen, freelancerInvoiceNumberSettingsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerInvoiceNumberSettingsScreen.W;
                        return (i) ((f2) freelancerInvoiceNumberSettingsScreen.T.getValue()).f282542g.get();
                    default:
                        KProperty[] kPropertyArr3 = FreelancerInvoiceNumberSettingsScreen.W;
                        FreelancerInvoiceNumberSettingsScreen freelancerInvoiceNumberSettingsScreen2 = this.f109544b;
                        return dli.f.a(freelancerInvoiceNumberSettingsScreen2, freelancerInvoiceNumberSettingsScreen2.R2(), v.k(freelancerInvoiceNumberSettingsScreen2.O, freelancerInvoiceNumberSettingsScreen2.P, new PlainTextWarningDelegate(), new RowLoadingDelegate(), freelancerInvoiceNumberSettingsScreen2.R), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.V = w.y0(new Function0(this) { // from class: cw6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerInvoiceNumberSettingsScreen f109544b;

            {
                this.f109544b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                FreelancerInvoiceNumberSettingsScreen freelancerInvoiceNumberSettingsScreen = this.f109544b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerInvoiceNumberSettingsScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(freelancerInvoiceNumberSettingsScreen.m2()).a().get(g2.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", g2.class, " is not found"));
                        }
                        g2 g2Var = ((g2) ((dw6.a) aVar2.b())).f282557j;
                        FreelancerInvoiceNumberSettingsScreenContract$InputData freelancerInvoiceNumberSettingsScreenContract$InputData = freelancerInvoiceNumberSettingsScreen.K;
                        freelancerInvoiceNumberSettingsScreenContract$InputData.getClass();
                        return new f2(g2Var, freelancerInvoiceNumberSettingsScreen, freelancerInvoiceNumberSettingsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerInvoiceNumberSettingsScreen.W;
                        return (i) ((f2) freelancerInvoiceNumberSettingsScreen.T.getValue()).f282542g.get();
                    default:
                        KProperty[] kPropertyArr3 = FreelancerInvoiceNumberSettingsScreen.W;
                        FreelancerInvoiceNumberSettingsScreen freelancerInvoiceNumberSettingsScreen2 = this.f109544b;
                        return dli.f.a(freelancerInvoiceNumberSettingsScreen2, freelancerInvoiceNumberSettingsScreen2.R2(), v.k(freelancerInvoiceNumberSettingsScreen2.O, freelancerInvoiceNumberSettingsScreen2.P, new PlainTextWarningDelegate(), new RowLoadingDelegate(), freelancerInvoiceNumberSettingsScreen2.R), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174564b.setEnabled(uiState.f109549b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f2) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.freelancer_sale_invoice_number_input_number_title, null, null, 14);
        d3().f174565c.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        d3().f174565c.setToolbarTitle(textLocalisedClause);
        d3().f174564b.setText(new TextLocalisedClause(R$string.freelancer_common_action_save, null, null, 14));
        d3().f174564b.setLoadingButtonTag("SUBMIT_BUTTON_LOADING_TAG");
        d3().f174564b.setEnabled(false);
        ((j60.a) ((f2) this.T.getValue()).d.get()).d(u.c(this.S));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.f52371h.f121375b), null, new d(this, null), 3);
        InputTextDelegate inputTextDelegate = this.P;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(inputTextDelegate.e.f121375b), null, new cw6.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(inputTextDelegate.f52577j.f121375b), null, new f(this, null), 3);
        r rVarMerge = r.merge(this.R.r(), this.Q.f52925c);
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarMerge), null, new c(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.S.d.f121375b), null, new g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new c(this, continuation, 2), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.N.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final i R2() {
        return (i) this.U.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.V.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.M);
    }
}
