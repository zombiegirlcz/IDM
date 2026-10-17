package com.revolut.feature.freelancer.impl.ui.invoice.templates.list;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.freelancer.impl.ui.invoice.templates.list.InvoiceTemplatesListScreen;
import com.revolut.feature.freelancer.impl.ui.invoice.templates.list.InvoiceTemplatesListScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dcf.v0;
import dli.a;
import dz6.b;
import dz6.c;
import dz6.d;
import dz6.j;
import dz6.l;
import dz6.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import us6.g2;
import us6.y2;
import us6.z2;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/invoice/templates/list/InvoiceTemplatesListScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ldz6/j;", "Ldli/a;", "Ldz6/m;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InvoiceTemplatesListScreen extends ViewController<j> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(InvoiceTemplatesListScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final InvoiceTemplatesListScreenContract$InputData K;
    public final int L;
    public final h M;
    public final FullScreenStateDelegate N;
    public final RowDelegate O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public InvoiceTemplatesListScreen(InvoiceTemplatesListScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = s.t(this, b.f);
        this.N = new FullScreenStateDelegate();
        this.O = new RowDelegate(null, null, 7);
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: dz6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoiceTemplatesListScreen f121239b;

            {
                this.f121239b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                InvoiceTemplatesListScreen invoiceTemplatesListScreen = this.f121239b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = InvoiceTemplatesListScreen.S;
                        qji.b bVarU2 = invoiceTemplatesListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.invoice.templates.list.di.InvoiceTemplatesListScreenInjector");
                        y2 y2Var = (y2) bVarU2;
                        g2 g2Var = y2Var.f282816b;
                        y2 y2Var2 = y2Var.f282817c;
                        InvoiceTemplatesListScreenContract$InputData invoiceTemplatesListScreenContract$InputData = invoiceTemplatesListScreen.K;
                        invoiceTemplatesListScreenContract$InputData.getClass();
                        return new z2(g2Var, y2Var2, invoiceTemplatesListScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = InvoiceTemplatesListScreen.S;
                        return (q) ((z2) invoiceTemplatesListScreen.P.getValue()).f282828b.get();
                    default:
                        KProperty[] kPropertyArr3 = InvoiceTemplatesListScreen.S;
                        InvoiceTemplatesListScreen invoiceTemplatesListScreen2 = this.f121239b;
                        return dli.f.a(invoiceTemplatesListScreen2, invoiceTemplatesListScreen2.R2(), v.k(invoiceTemplatesListScreen2.N, invoiceTemplatesListScreen2.O, new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: dz6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoiceTemplatesListScreen f121239b;

            {
                this.f121239b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                InvoiceTemplatesListScreen invoiceTemplatesListScreen = this.f121239b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InvoiceTemplatesListScreen.S;
                        qji.b bVarU2 = invoiceTemplatesListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.invoice.templates.list.di.InvoiceTemplatesListScreenInjector");
                        y2 y2Var = (y2) bVarU2;
                        g2 g2Var = y2Var.f282816b;
                        y2 y2Var2 = y2Var.f282817c;
                        InvoiceTemplatesListScreenContract$InputData invoiceTemplatesListScreenContract$InputData = invoiceTemplatesListScreen.K;
                        invoiceTemplatesListScreenContract$InputData.getClass();
                        return new z2(g2Var, y2Var2, invoiceTemplatesListScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = InvoiceTemplatesListScreen.S;
                        return (q) ((z2) invoiceTemplatesListScreen.P.getValue()).f282828b.get();
                    default:
                        KProperty[] kPropertyArr3 = InvoiceTemplatesListScreen.S;
                        InvoiceTemplatesListScreen invoiceTemplatesListScreen2 = this.f121239b;
                        return dli.f.a(invoiceTemplatesListScreen2, invoiceTemplatesListScreen2.R2(), v.k(invoiceTemplatesListScreen2.N, invoiceTemplatesListScreen2.O, new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: dz6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoiceTemplatesListScreen f121239b;

            {
                this.f121239b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                InvoiceTemplatesListScreen invoiceTemplatesListScreen = this.f121239b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InvoiceTemplatesListScreen.S;
                        qji.b bVarU2 = invoiceTemplatesListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.invoice.templates.list.di.InvoiceTemplatesListScreenInjector");
                        y2 y2Var = (y2) bVarU2;
                        g2 g2Var = y2Var.f282816b;
                        y2 y2Var2 = y2Var.f282817c;
                        InvoiceTemplatesListScreenContract$InputData invoiceTemplatesListScreenContract$InputData = invoiceTemplatesListScreen.K;
                        invoiceTemplatesListScreenContract$InputData.getClass();
                        return new z2(g2Var, y2Var2, invoiceTemplatesListScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = InvoiceTemplatesListScreen.S;
                        return (q) ((z2) invoiceTemplatesListScreen.P.getValue()).f282828b.get();
                    default:
                        KProperty[] kPropertyArr3 = InvoiceTemplatesListScreen.S;
                        InvoiceTemplatesListScreen invoiceTemplatesListScreen2 = this.f121239b;
                        return dli.f.a(invoiceTemplatesListScreen2, invoiceTemplatesListScreen2.R2(), v.k(invoiceTemplatesListScreen2.N, invoiceTemplatesListScreen2.O, new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        m uiState = (m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        l lVar = uiState.f121249a;
        TextLocalisedClause textLocalisedClause = lVar.f121246a;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setMenuItems(lVar.f121248c);
        navBarWithToolbar.setSecondDescriptionText(lVar.f121247b);
        navBarWithToolbar.setSecondDescriptionVisible(true);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (z2) this.P.getValue();
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
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new v0(this, null, 25), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.x0()), new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.o.f57403b), new c(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(this.N.f.f121375b), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.O.f53218h), new dz6.e(this, null), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final dz6.q R2() {
        return (dz6.q) this.Q.getValue();
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
