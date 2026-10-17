package com.revolut.feature.freelancer.impl.ui.invoice.templates.details;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.f;
import aw0.g;
import aw0.n6;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputDualTextDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.freelancer.impl.ui.invoice.templates.details.InvoiceTemplateDetailsScreen;
import com.revolut.feature.freelancer.impl.ui.invoice.templates.details.InvoiceTemplateDetailsScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import efm.r;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import us6.g2;
import us6.w2;
import us6.y2;
import vc.s;
import xki.e;
import yy6.d;
import yy6.i;
import yy6.j;
import yy6.k;
import yy6.m;
import yy6.n;
import yy6.p;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/invoice/templates/details/InvoiceTemplateDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lyy6/m;", "Ltki/c;", "Lyy6/q;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InvoiceTemplateDetailsScreen extends ViewController<m> implements tki.c {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(InvoiceTemplateDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};
    public final InvoiceTemplateDetailsScreenContract$InputData K;
    public final int L;
    public final h M;
    public final CellDetailsNoteDelegate N;
    public final FullScreenStateDelegate O;
    public final InputDualTextDelegate P;
    public final InputTextDelegate Q;
    public final RowDelegate R;
    public final SmallActionButtonDelegate S;
    public final Object T;
    public final Object U;
    public final Object V;

    public InvoiceTemplateDetailsScreen(InvoiceTemplateDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_action_footer;
        this.M = s.t(this, yy6.b.f);
        this.N = new CellDetailsNoteDelegate();
        this.O = new FullScreenStateDelegate();
        this.P = new InputDualTextDelegate(null, 3);
        this.Q = new InputTextDelegate(null);
        this.R = new RowDelegate(null, null, 7);
        this.S = new SmallActionButtonDelegate();
        final int i = 0;
        this.T = w.y0(new Function0(this) { // from class: yy6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoiceTemplateDetailsScreen f317844b;

            {
                this.f317844b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                InvoiceTemplateDetailsScreen invoiceTemplateDetailsScreen = this.f317844b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = InvoiceTemplateDetailsScreen.W;
                        qji.b bVarU2 = invoiceTemplateDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.invoice.templates.details.di.InvoiceTemplateDetailsScreenInjector");
                        y2 y2Var = (y2) bVarU2;
                        g2 g2Var = y2Var.f282816b;
                        y2 y2Var2 = y2Var.f282817c;
                        InvoiceTemplateDetailsScreenContract$InputData invoiceTemplateDetailsScreenContract$InputData = invoiceTemplateDetailsScreen.K;
                        invoiceTemplateDetailsScreenContract$InputData.getClass();
                        return new w2(g2Var, y2Var2, invoiceTemplateDetailsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = InvoiceTemplateDetailsScreen.W;
                        return (n) ((w2) invoiceTemplateDetailsScreen.T.getValue()).f282793b.get();
                    default:
                        KProperty[] kPropertyArr3 = InvoiceTemplateDetailsScreen.W;
                        InvoiceTemplateDetailsScreen invoiceTemplateDetailsScreen2 = this.f317844b;
                        return tki.g.a(invoiceTemplateDetailsScreen2, invoiceTemplateDetailsScreen2.d(), v.k(invoiceTemplateDetailsScreen2.N, invoiceTemplateDetailsScreen2.O, invoiceTemplateDetailsScreen2.P, invoiceTemplateDetailsScreen2.Q, new ListSubheaderDelegate(), invoiceTemplateDetailsScreen2.R, new RowLoadingDelegate(), invoiceTemplateDetailsScreen2.S), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.U = w.y0(new Function0(this) { // from class: yy6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoiceTemplateDetailsScreen f317844b;

            {
                this.f317844b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                InvoiceTemplateDetailsScreen invoiceTemplateDetailsScreen = this.f317844b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InvoiceTemplateDetailsScreen.W;
                        qji.b bVarU2 = invoiceTemplateDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.invoice.templates.details.di.InvoiceTemplateDetailsScreenInjector");
                        y2 y2Var = (y2) bVarU2;
                        g2 g2Var = y2Var.f282816b;
                        y2 y2Var2 = y2Var.f282817c;
                        InvoiceTemplateDetailsScreenContract$InputData invoiceTemplateDetailsScreenContract$InputData = invoiceTemplateDetailsScreen.K;
                        invoiceTemplateDetailsScreenContract$InputData.getClass();
                        return new w2(g2Var, y2Var2, invoiceTemplateDetailsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = InvoiceTemplateDetailsScreen.W;
                        return (n) ((w2) invoiceTemplateDetailsScreen.T.getValue()).f282793b.get();
                    default:
                        KProperty[] kPropertyArr3 = InvoiceTemplateDetailsScreen.W;
                        InvoiceTemplateDetailsScreen invoiceTemplateDetailsScreen2 = this.f317844b;
                        return tki.g.a(invoiceTemplateDetailsScreen2, invoiceTemplateDetailsScreen2.d(), v.k(invoiceTemplateDetailsScreen2.N, invoiceTemplateDetailsScreen2.O, invoiceTemplateDetailsScreen2.P, invoiceTemplateDetailsScreen2.Q, new ListSubheaderDelegate(), invoiceTemplateDetailsScreen2.R, new RowLoadingDelegate(), invoiceTemplateDetailsScreen2.S), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.V = w.y0(new Function0(this) { // from class: yy6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoiceTemplateDetailsScreen f317844b;

            {
                this.f317844b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                InvoiceTemplateDetailsScreen invoiceTemplateDetailsScreen = this.f317844b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InvoiceTemplateDetailsScreen.W;
                        qji.b bVarU2 = invoiceTemplateDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.invoice.templates.details.di.InvoiceTemplateDetailsScreenInjector");
                        y2 y2Var = (y2) bVarU2;
                        g2 g2Var = y2Var.f282816b;
                        y2 y2Var2 = y2Var.f282817c;
                        InvoiceTemplateDetailsScreenContract$InputData invoiceTemplateDetailsScreenContract$InputData = invoiceTemplateDetailsScreen.K;
                        invoiceTemplateDetailsScreenContract$InputData.getClass();
                        return new w2(g2Var, y2Var2, invoiceTemplateDetailsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = InvoiceTemplateDetailsScreen.W;
                        return (n) ((w2) invoiceTemplateDetailsScreen.T.getValue()).f282793b.get();
                    default:
                        KProperty[] kPropertyArr3 = InvoiceTemplateDetailsScreen.W;
                        InvoiceTemplateDetailsScreen invoiceTemplateDetailsScreen2 = this.f317844b;
                        return tki.g.a(invoiceTemplateDetailsScreen2, invoiceTemplateDetailsScreen2.d(), v.k(invoiceTemplateDetailsScreen2.N, invoiceTemplateDetailsScreen2.O, invoiceTemplateDetailsScreen2.P, invoiceTemplateDetailsScreen2.Q, new ListSubheaderDelegate(), invoiceTemplateDetailsScreen2.R, new RowLoadingDelegate(), invoiceTemplateDetailsScreen2.S), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        yy6.q uiState = (yy6.q) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174534c;
        p pVar = uiState.f317855a;
        TextLocalisedClause textLocalisedClause = pVar.f317853a;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setMenuItems(pVar.f317854b);
        ActionFooterView actionFooterView = d3().f174533b;
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        yy6.o oVar2 = uiState.f317856b;
        actionFooterView.setModel(new g(new n6(null, defaultFilledButton, new ResourceImage(R$drawable.uikit_icn_24_eye, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, oVar2.f317851b, null, null, 984), new n6(oVar2.f317850a, defaultFilledButton, null, null, oVar2.f317852c, null, null, 988), (Clause) null, f.SMALL_PRIMARY_BUTTON, 9));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (w2) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174534c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174534c.f59410q), new yy6.e(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174534c.o.f57403b), new yy6.f(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174533b.f), new yy6.e(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f174533b.f58955g), new yy6.e(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(this.N.d), new yy6.g(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.O.f.f121375b), new yy6.h(this, null), 3);
        InputTextDelegate inputTextDelegate = this.Q;
        ViewController.P2(this, rd0.e.b(inputTextDelegate.f52575g.f121375b), new i(this, null), 3);
        InputDualTextDelegate inputDualTextDelegate = this.P;
        r rVarMerge = r.merge(inputDualTextDelegate.f52549c.e.f121375b, inputDualTextDelegate.d.e.f121375b, inputTextDelegate.e.f121375b);
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        ViewController.P2(this, rd0.e.b(rVarMerge), new j(this, null), 3);
        RowDelegate rowDelegate = this.R;
        ViewController.P2(this, rd0.e.b(rowDelegate.f53218h), new k(this, null), 3);
        ViewController.P2(this, rd0.e.b(rowDelegate.f53225r), new yy6.c(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.S.f53336c.f121375b), new d(this, null), 3);
    }

    public final jii.k d3() {
        ViewBinding value = this.M.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final n d() {
        return (n) this.U.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.V.getValue();
    }
}
