package com.revolut.feature.freelancer.impl.ui.invoice.templates.override;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.InputDualTextDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.freelancer.impl.ui.invoice.templates.override.InvoiceTemplateOverrideScreen;
import com.revolut.feature.freelancer.impl.ui.invoice.templates.override.InvoiceTemplateOverrideScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import efm.r;
import fna.f;
import fz6.b;
import fz6.d;
import fz6.g;
import fz6.i;
import fz6.j;
import fz6.l;
import fz6.m;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tki.c;
import us6.g2;
import us6.x2;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/invoice/templates/override/InvoiceTemplateOverrideScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lfz6/i;", "Ltki/c;", "Lfz6/m;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InvoiceTemplateOverrideScreen extends ViewController<i> implements c {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(InvoiceTemplateOverrideScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final InvoiceTemplateOverrideScreenContract$InputData K;
    public final int L;
    public final h M;
    public final CellDetailsNoteDelegate N;
    public final InputDualTextDelegate O;
    public final InputTextDelegate P;
    public final SmallActionButtonDelegate Q;
    public final Object R;
    public final Object S;
    public final Object T;

    public InvoiceTemplateOverrideScreen(InvoiceTemplateOverrideScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = s.t(this, b.f);
        this.N = new CellDetailsNoteDelegate();
        this.O = new InputDualTextDelegate(null, 3);
        this.P = new InputTextDelegate(null);
        this.Q = new SmallActionButtonDelegate();
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: fz6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoiceTemplateOverrideScreen f139110b;

            {
                this.f139110b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                InvoiceTemplateOverrideScreen invoiceTemplateOverrideScreen = this.f139110b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = InvoiceTemplateOverrideScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(invoiceTemplateOverrideScreen.m2()).a().get(g2.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", g2.class, " is not found"));
                        }
                        g2 g2Var = ((g2) aVar2.b()).f282557j;
                        InvoiceTemplateOverrideScreenContract$InputData invoiceTemplateOverrideScreenContract$InputData = invoiceTemplateOverrideScreen.K;
                        invoiceTemplateOverrideScreenContract$InputData.getClass();
                        return new x2(g2Var, invoiceTemplateOverrideScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = InvoiceTemplateOverrideScreen.U;
                        return (j) ((x2) invoiceTemplateOverrideScreen.R.getValue()).f282804b.get();
                    default:
                        KProperty[] kPropertyArr3 = InvoiceTemplateOverrideScreen.U;
                        InvoiceTemplateOverrideScreen invoiceTemplateOverrideScreen2 = this.f139110b;
                        return tki.g.a(invoiceTemplateOverrideScreen2, invoiceTemplateOverrideScreen2.d(), v.k(invoiceTemplateOverrideScreen2.N, invoiceTemplateOverrideScreen2.O, invoiceTemplateOverrideScreen2.P, new ListSubheaderDelegate(), invoiceTemplateOverrideScreen2.Q), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: fz6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoiceTemplateOverrideScreen f139110b;

            {
                this.f139110b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                InvoiceTemplateOverrideScreen invoiceTemplateOverrideScreen = this.f139110b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InvoiceTemplateOverrideScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(invoiceTemplateOverrideScreen.m2()).a().get(g2.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", g2.class, " is not found"));
                        }
                        g2 g2Var = ((g2) aVar2.b()).f282557j;
                        InvoiceTemplateOverrideScreenContract$InputData invoiceTemplateOverrideScreenContract$InputData = invoiceTemplateOverrideScreen.K;
                        invoiceTemplateOverrideScreenContract$InputData.getClass();
                        return new x2(g2Var, invoiceTemplateOverrideScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = InvoiceTemplateOverrideScreen.U;
                        return (j) ((x2) invoiceTemplateOverrideScreen.R.getValue()).f282804b.get();
                    default:
                        KProperty[] kPropertyArr3 = InvoiceTemplateOverrideScreen.U;
                        InvoiceTemplateOverrideScreen invoiceTemplateOverrideScreen2 = this.f139110b;
                        return tki.g.a(invoiceTemplateOverrideScreen2, invoiceTemplateOverrideScreen2.d(), v.k(invoiceTemplateOverrideScreen2.N, invoiceTemplateOverrideScreen2.O, invoiceTemplateOverrideScreen2.P, new ListSubheaderDelegate(), invoiceTemplateOverrideScreen2.Q), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: fz6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoiceTemplateOverrideScreen f139110b;

            {
                this.f139110b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                InvoiceTemplateOverrideScreen invoiceTemplateOverrideScreen = this.f139110b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InvoiceTemplateOverrideScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(invoiceTemplateOverrideScreen.m2()).a().get(g2.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", g2.class, " is not found"));
                        }
                        g2 g2Var = ((g2) aVar2.b()).f282557j;
                        InvoiceTemplateOverrideScreenContract$InputData invoiceTemplateOverrideScreenContract$InputData = invoiceTemplateOverrideScreen.K;
                        invoiceTemplateOverrideScreenContract$InputData.getClass();
                        return new x2(g2Var, invoiceTemplateOverrideScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = InvoiceTemplateOverrideScreen.U;
                        return (j) ((x2) invoiceTemplateOverrideScreen.R.getValue()).f282804b.get();
                    default:
                        KProperty[] kPropertyArr3 = InvoiceTemplateOverrideScreen.U;
                        InvoiceTemplateOverrideScreen invoiceTemplateOverrideScreen2 = this.f139110b;
                        return tki.g.a(invoiceTemplateOverrideScreen2, invoiceTemplateOverrideScreen2.d(), v.k(invoiceTemplateOverrideScreen2.N, invoiceTemplateOverrideScreen2.O, invoiceTemplateOverrideScreen2.P, new ListSubheaderDelegate(), invoiceTemplateOverrideScreen2.Q), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        m uiState = (m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        l lVar = uiState.f139120a;
        TextLocalisedClause textLocalisedClause = lVar.f139118a;
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionText(lVar.f139119b);
        d3().f174564b.setText(uiState.f139122c.f139117a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (x2) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174565c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new fz6.c(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new fz6.c(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.N.d), new d(this, null), 3);
        InputTextDelegate inputTextDelegate = this.P;
        ViewController.P2(this, rd0.e.b(inputTextDelegate.f52575g.f121375b), new fz6.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(inputTextDelegate.f52576h.f121375b), new f(this, continuation, 28), 3);
        ihm.f fVar = inputTextDelegate.e.f121375b;
        InputDualTextDelegate inputDualTextDelegate = this.O;
        r rVarMerge = r.merge(fVar, inputDualTextDelegate.f52549c.e.f121375b, inputDualTextDelegate.d.e.f121375b);
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        ViewController.P2(this, rd0.e.b(rVarMerge), new fz6.f(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f53336c.f121375b), new g(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.M.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final j d() {
        return (j) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.T.getValue();
    }
}
