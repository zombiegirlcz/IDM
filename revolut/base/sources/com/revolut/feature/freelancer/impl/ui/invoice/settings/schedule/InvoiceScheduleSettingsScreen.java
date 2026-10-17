package com.revolut.feature.freelancer.impl.ui.invoice.settings.schedule;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.feature.freelancer.impl.ui.invoice.settings.schedule.InvoiceScheduleSettingsScreen;
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
import sy6.c;
import sy6.d;
import sy6.g;
import te0.w;
import us6.g2;
import us6.m2;
import us6.t2;
import us6.u2;
import vc.s;
import wp5.y;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/invoice/settings/schedule/InvoiceScheduleSettingsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lsy6/h;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InvoiceScheduleSettingsScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(InvoiceScheduleSettingsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final InputTextDelegate K = new InputTextDelegate(null);
    public final FullScreenStateDelegate L = new FullScreenStateDelegate();
    public final h M = s.t(this, a.f);
    public final int N = R$layout.screen_recycler_navbar_nextbutton;
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

    public InvoiceScheduleSettingsScreen() {
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: sy6.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoiceScheduleSettingsScreen f266629b;

            {
                this.f266629b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                int i3 = 2;
                InvoiceScheduleSettingsScreen invoiceScheduleSettingsScreen = this.f266629b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = InvoiceScheduleSettingsScreen.R;
                        InvoiceScheduleSettingsScreen invoiceScheduleSettingsScreen2 = this.f266629b;
                        return dli.f.a(invoiceScheduleSettingsScreen2, invoiceScheduleSettingsScreen2.d(), v.k(invoiceScheduleSettingsScreen2.K, invoiceScheduleSettingsScreen2.L, new RowLoadingDelegate()), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = InvoiceScheduleSettingsScreen.R;
                        qji.b bVarU2 = invoiceScheduleSettingsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.invoice.settings.schedule.di.InvoiceScheduleSettingsScreenInjector");
                        g2 g2Var = ((u2) bVarU2).f282769a;
                        t2 t2Var = new t2();
                        t2Var.f282760a = e4m.b.b(new m2(g2Var, i3));
                        return t2Var;
                    default:
                        KProperty[] kPropertyArr3 = InvoiceScheduleSettingsScreen.R;
                        return (g) ((t2) invoiceScheduleSettingsScreen.P.getValue()).f282760a.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: sy6.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoiceScheduleSettingsScreen f266629b;

            {
                this.f266629b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                int i3 = 2;
                InvoiceScheduleSettingsScreen invoiceScheduleSettingsScreen = this.f266629b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InvoiceScheduleSettingsScreen.R;
                        InvoiceScheduleSettingsScreen invoiceScheduleSettingsScreen2 = this.f266629b;
                        return dli.f.a(invoiceScheduleSettingsScreen2, invoiceScheduleSettingsScreen2.d(), v.k(invoiceScheduleSettingsScreen2.K, invoiceScheduleSettingsScreen2.L, new RowLoadingDelegate()), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = InvoiceScheduleSettingsScreen.R;
                        qji.b bVarU2 = invoiceScheduleSettingsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.invoice.settings.schedule.di.InvoiceScheduleSettingsScreenInjector");
                        g2 g2Var = ((u2) bVarU2).f282769a;
                        t2 t2Var = new t2();
                        t2Var.f282760a = e4m.b.b(new m2(g2Var, i3));
                        return t2Var;
                    default:
                        KProperty[] kPropertyArr3 = InvoiceScheduleSettingsScreen.R;
                        return (g) ((t2) invoiceScheduleSettingsScreen.P.getValue()).f282760a.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: sy6.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoiceScheduleSettingsScreen f266629b;

            {
                this.f266629b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                int i32 = 2;
                InvoiceScheduleSettingsScreen invoiceScheduleSettingsScreen = this.f266629b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InvoiceScheduleSettingsScreen.R;
                        InvoiceScheduleSettingsScreen invoiceScheduleSettingsScreen2 = this.f266629b;
                        return dli.f.a(invoiceScheduleSettingsScreen2, invoiceScheduleSettingsScreen2.d(), v.k(invoiceScheduleSettingsScreen2.K, invoiceScheduleSettingsScreen2.L, new RowLoadingDelegate()), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = InvoiceScheduleSettingsScreen.R;
                        qji.b bVarU2 = invoiceScheduleSettingsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.invoice.settings.schedule.di.InvoiceScheduleSettingsScreenInjector");
                        g2 g2Var = ((u2) bVarU2).f282769a;
                        t2 t2Var = new t2();
                        t2Var.f282760a = e4m.b.b(new m2(g2Var, i32));
                        return t2Var;
                    default:
                        KProperty[] kPropertyArr3 = InvoiceScheduleSettingsScreen.R;
                        return (g) ((t2) invoiceScheduleSettingsScreen.P.getValue()).f282760a.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((sy6.h) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (t2) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.freelancer_sale_invoice_settings_payment_schedules_header_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.freelancer_sale_invoice_settings_payment_schedules_header_caption, null, null, 14));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f174564b.setText(new TextLocalisedClause(R$string.freelancer_sale_invoice_settings_payment_schedules_action_save, null, null, 14));
        d3().f174564b.setLoadingButtonTag("ADD_SETTINGS_SCHEDULE_SUBMIT_BUTTON_TAG");
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new c(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new c(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.L.f52371h.f121375b), new d(this, null), 3);
        InputTextDelegate inputTextDelegate = this.K;
        com.revolut.kompot.navigable.a.g2(this, y.x(inputTextDelegate.f52575g.f121375b, inputTextDelegate.i.f121375b, "mergeWith(...)"), null, new sy6.e(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final g d() {
        return (g) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
