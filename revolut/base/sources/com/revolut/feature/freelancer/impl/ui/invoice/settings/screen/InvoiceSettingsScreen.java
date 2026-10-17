package com.revolut.feature.freelancer.impl.ui.invoice.settings.screen;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.freelancer.impl.ui.invoice.settings.screen.InvoiceSettingsScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import pki.b;
import te0.w;
import us6.g2;
import us6.m2;
import us6.u2;
import us6.v2;
import uwe.f;
import uy6.c;
import uy6.m;
import uy6.p;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/invoice/settings/screen/InvoiceSettingsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Luy6/m;", "Ldli/a;", "Luy6/o;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InvoiceSettingsScreen extends ViewController<m> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(InvoiceSettingsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int K = R$layout.screen_recycler_navbar;
    public final h L = s.t(this, a.f);
    public final FullScreenStateDelegate M = new FullScreenStateDelegate();
    public final RowDelegate N = new RowDelegate(null, null, 7);
    public final Object O;
    public final Object P;
    public final Object Q;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, jii.m.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return jii.m.a(p0);
        }
    }

    public InvoiceSettingsScreen() {
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: uy6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoiceSettingsScreen f284079b;

            {
                this.f284079b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                InvoiceSettingsScreen invoiceSettingsScreen = this.f284079b;
                int i3 = 3;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = InvoiceSettingsScreen.R;
                        qji.b bVarU2 = invoiceSettingsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.invoice.settings.screen.di.InvoiceSettingsScreenInjector");
                        g2 g2Var = ((u2) bVarU2).f282769a;
                        v2 v2Var = new v2();
                        v2Var.f282781a = e4m.b.b(new m2(g2Var, v2Var, i3));
                        return v2Var;
                    case 1:
                        KProperty[] kPropertyArr2 = InvoiceSettingsScreen.R;
                        return (p) ((v2) invoiceSettingsScreen.O.getValue()).f282781a.get();
                    default:
                        KProperty[] kPropertyArr3 = InvoiceSettingsScreen.R;
                        InvoiceSettingsScreen invoiceSettingsScreen2 = this.f284079b;
                        return dli.f.a(invoiceSettingsScreen2, (p) invoiceSettingsScreen2.P.getValue(), v.k(invoiceSettingsScreen2.M, new ListSubheaderDelegate(), invoiceSettingsScreen2.N, new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: uy6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoiceSettingsScreen f284079b;

            {
                this.f284079b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                InvoiceSettingsScreen invoiceSettingsScreen = this.f284079b;
                int i3 = 3;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InvoiceSettingsScreen.R;
                        qji.b bVarU2 = invoiceSettingsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.invoice.settings.screen.di.InvoiceSettingsScreenInjector");
                        g2 g2Var = ((u2) bVarU2).f282769a;
                        v2 v2Var = new v2();
                        v2Var.f282781a = e4m.b.b(new m2(g2Var, v2Var, i3));
                        return v2Var;
                    case 1:
                        KProperty[] kPropertyArr2 = InvoiceSettingsScreen.R;
                        return (p) ((v2) invoiceSettingsScreen.O.getValue()).f282781a.get();
                    default:
                        KProperty[] kPropertyArr3 = InvoiceSettingsScreen.R;
                        InvoiceSettingsScreen invoiceSettingsScreen2 = this.f284079b;
                        return dli.f.a(invoiceSettingsScreen2, (p) invoiceSettingsScreen2.P.getValue(), v.k(invoiceSettingsScreen2.M, new ListSubheaderDelegate(), invoiceSettingsScreen2.N, new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: uy6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoiceSettingsScreen f284079b;

            {
                this.f284079b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                InvoiceSettingsScreen invoiceSettingsScreen = this.f284079b;
                int i32 = 3;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InvoiceSettingsScreen.R;
                        qji.b bVarU2 = invoiceSettingsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.invoice.settings.screen.di.InvoiceSettingsScreenInjector");
                        g2 g2Var = ((u2) bVarU2).f282769a;
                        v2 v2Var = new v2();
                        v2Var.f282781a = e4m.b.b(new m2(g2Var, v2Var, i32));
                        return v2Var;
                    case 1:
                        KProperty[] kPropertyArr2 = InvoiceSettingsScreen.R;
                        return (p) ((v2) invoiceSettingsScreen.O.getValue()).f282781a.get();
                    default:
                        KProperty[] kPropertyArr3 = InvoiceSettingsScreen.R;
                        InvoiceSettingsScreen invoiceSettingsScreen2 = this.f284079b;
                        return dli.f.a(invoiceSettingsScreen2, (p) invoiceSettingsScreen2.P.getValue(), v.k(invoiceSettingsScreen2.M, new ListSubheaderDelegate(), invoiceSettingsScreen2.N, new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        uy6.o uiState = (uy6.o) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        TextLocalisedClause textLocalisedClause = uiState.f284090a.f284089a;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (v2) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (p) this.P.getValue();
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
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new f(this, null, 3), 3);
        ViewController.P2(this, rd0.e.b(this.M.f.f121375b), new uy6.b(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.N.f53218h), new c(this, null), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
