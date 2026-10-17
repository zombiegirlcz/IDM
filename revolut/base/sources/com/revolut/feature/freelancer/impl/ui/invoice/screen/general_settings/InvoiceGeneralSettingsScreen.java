package com.revolut.feature.freelancer.impl.ui.invoice.screen.general_settings;

import aii.q;
import android.content.Intent;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.freelancer.impl.ui.invoice.screen.general_settings.InvoiceGeneralSettingsScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.j0;
import us6.g2;
import us6.m2;
import us6.n2;
import us6.u2;
import vc.s;
import xki.e;
import zhm.v;
import zuj.x;
import zx6.b;
import zx6.c;
import zx6.d;
import zx6.i;
import zx6.j;
import zx6.k;
import zx6.l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/invoice/screen/general_settings/InvoiceGeneralSettingsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lzx6/l;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InvoiceGeneralSettingsScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(InvoiceGeneralSettingsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final int K = R$layout.screen_recycler_navbar_nextbutton;
    public final h L = s.t(this, a.f);
    public final FullScreenStateDelegate M = new FullScreenStateDelegate();
    public final InputTextDelegate N = new InputTextDelegate(null);
    public final Object O;
    public final Object P;
    public final Object Q;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, u.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return u.a(p0);
        }
    }

    public InvoiceGeneralSettingsScreen() {
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: zx6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoiceGeneralSettingsScreen f326043b;

            {
                this.f326043b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                InvoiceGeneralSettingsScreen invoiceGeneralSettingsScreen = this.f326043b;
                int i3 = 0;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = InvoiceGeneralSettingsScreen.R;
                        qji.b bVarU2 = invoiceGeneralSettingsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.invoice.screen.general_settings.di.InvoiceGeneralSettingsScreenInjector");
                        g2 g2Var = ((u2) bVarU2).f282769a;
                        n2 n2Var = new n2();
                        n2Var.f282637a = e4m.b.b(new m2(g2Var, i3));
                        return n2Var;
                    case 1:
                        KProperty[] kPropertyArr2 = InvoiceGeneralSettingsScreen.R;
                        return (i) ((n2) invoiceGeneralSettingsScreen.O.getValue()).f282637a.get();
                    default:
                        KProperty[] kPropertyArr3 = InvoiceGeneralSettingsScreen.R;
                        InvoiceGeneralSettingsScreen invoiceGeneralSettingsScreen2 = this.f326043b;
                        return dli.f.a(invoiceGeneralSettingsScreen2, invoiceGeneralSettingsScreen2.d(), v.k(invoiceGeneralSettingsScreen2.M, invoiceGeneralSettingsScreen2.N, new ListSubheaderDelegate(), new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: zx6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoiceGeneralSettingsScreen f326043b;

            {
                this.f326043b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                InvoiceGeneralSettingsScreen invoiceGeneralSettingsScreen = this.f326043b;
                int i3 = 0;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InvoiceGeneralSettingsScreen.R;
                        qji.b bVarU2 = invoiceGeneralSettingsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.invoice.screen.general_settings.di.InvoiceGeneralSettingsScreenInjector");
                        g2 g2Var = ((u2) bVarU2).f282769a;
                        n2 n2Var = new n2();
                        n2Var.f282637a = e4m.b.b(new m2(g2Var, i3));
                        return n2Var;
                    case 1:
                        KProperty[] kPropertyArr2 = InvoiceGeneralSettingsScreen.R;
                        return (i) ((n2) invoiceGeneralSettingsScreen.O.getValue()).f282637a.get();
                    default:
                        KProperty[] kPropertyArr3 = InvoiceGeneralSettingsScreen.R;
                        InvoiceGeneralSettingsScreen invoiceGeneralSettingsScreen2 = this.f326043b;
                        return dli.f.a(invoiceGeneralSettingsScreen2, invoiceGeneralSettingsScreen2.d(), v.k(invoiceGeneralSettingsScreen2.M, invoiceGeneralSettingsScreen2.N, new ListSubheaderDelegate(), new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: zx6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoiceGeneralSettingsScreen f326043b;

            {
                this.f326043b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                InvoiceGeneralSettingsScreen invoiceGeneralSettingsScreen = this.f326043b;
                int i32 = 0;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InvoiceGeneralSettingsScreen.R;
                        qji.b bVarU2 = invoiceGeneralSettingsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.invoice.screen.general_settings.di.InvoiceGeneralSettingsScreenInjector");
                        g2 g2Var = ((u2) bVarU2).f282769a;
                        n2 n2Var = new n2();
                        n2Var.f282637a = e4m.b.b(new m2(g2Var, i32));
                        return n2Var;
                    case 1:
                        KProperty[] kPropertyArr2 = InvoiceGeneralSettingsScreen.R;
                        return (i) ((n2) invoiceGeneralSettingsScreen.O.getValue()).f282637a.get();
                    default:
                        KProperty[] kPropertyArr3 = InvoiceGeneralSettingsScreen.R;
                        InvoiceGeneralSettingsScreen invoiceGeneralSettingsScreen2 = this.f326043b;
                        return dli.f.a(invoiceGeneralSettingsScreen2, invoiceGeneralSettingsScreen2.d(), v.k(invoiceGeneralSettingsScreen2.M, invoiceGeneralSettingsScreen2.N, new ListSubheaderDelegate(), new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        k kVar = uiState.f326054a;
        TextLocalisedClause textLocalisedClause = kVar.f326052a;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setSecondDescriptionText(kVar.f326053b);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        LargeActionButton largeActionButton = d3().f174564b;
        j jVar = uiState.f326055b;
        largeActionButton.setText(jVar.f326050a);
        largeActionButton.setEnabled(jVar.f326051b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (n2) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void W2(int i, int i2, Intent intent) {
        String currencyCode;
        if (i != 4 || i2 != -1 || intent == null || (currencyCode = intent.getStringExtra("argCurrency")) == null) {
            return;
        }
        zx6.o oVar = (zx6.o) d();
        oVar.getClass();
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        oVar.H2(oVar.f326064t, new x(currencyCode, 4));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174565c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f174564b.setTag("BUTTON_TAG_SAVE");
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new b(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new b(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.M.f52371h.f121375b), new c(this, null), 3);
        InputTextDelegate inputTextDelegate = this.N;
        ViewController.P2(this, rd0.e.b(inputTextDelegate.e.f121375b), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(inputTextDelegate.f52575g.f121375b), new zx6.e(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final i d() {
        return (i) this.P.getValue();
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
