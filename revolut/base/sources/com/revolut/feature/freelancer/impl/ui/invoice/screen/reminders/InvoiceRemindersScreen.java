package com.revolut.feature.freelancer.impl.ui.invoice.screen.reminders;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsStandaloneNoteDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.freelancer.impl.ui.invoice.screen.reminders.InvoiceRemindersScreen;
import com.revolut.feature.freelancer.impl.ui.invoice.screen.reminders.InvoiceRemindersScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import jii.u;
import jy6.b;
import jy6.c;
import jy6.d;
import jy6.f;
import jy6.i;
import jy6.j;
import jy6.k;
import jy6.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import us6.g2;
import us6.s2;
import us6.u2;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/invoice/screen/reminders/InvoiceRemindersScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Ljy6/k;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InvoiceRemindersScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(InvoiceRemindersScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final InvoiceRemindersScreenContract$InputData.DefaultInvoiceReminders K;
    public final int L;
    public final h M;
    public final FullScreenStateDelegate N;
    public final RowDelegate O;
    public final SelectableDelegate P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public InvoiceRemindersScreen() {
        InvoiceRemindersScreenContract$InputData.DefaultInvoiceReminders inputData = InvoiceRemindersScreenContract$InputData.DefaultInvoiceReminders.f73921a;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = s.t(this, b.f);
        this.N = new FullScreenStateDelegate();
        this.O = new RowDelegate(null, null, 7);
        this.P = new SelectableDelegate(new RowDelegate(null, null, 7));
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: jy6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoiceRemindersScreen f179331b;

            {
                this.f179331b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                InvoiceRemindersScreen invoiceRemindersScreen = this.f179331b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = InvoiceRemindersScreen.T;
                        qji.b bVarU2 = invoiceRemindersScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.invoice.screen.reminders.di.InvoiceRemindersScreenInjector");
                        u2 u2Var = (u2) bVarU2;
                        g2 g2Var = u2Var.f282769a;
                        u2 u2Var2 = u2Var.f282770b;
                        InvoiceRemindersScreenContract$InputData.DefaultInvoiceReminders defaultInvoiceReminders = invoiceRemindersScreen.K;
                        defaultInvoiceReminders.getClass();
                        return new s2(g2Var, u2Var2, defaultInvoiceReminders);
                    case 1:
                        KProperty[] kPropertyArr2 = InvoiceRemindersScreen.T;
                        return (m) ((s2) invoiceRemindersScreen.Q.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = InvoiceRemindersScreen.T;
                        InvoiceRemindersScreen invoiceRemindersScreen2 = this.f179331b;
                        return dli.f.a(invoiceRemindersScreen2, invoiceRemindersScreen2.d(), v.k(new CellDetailsNoteDelegate(), new CellDetailsStandaloneNoteDelegate(), invoiceRemindersScreen2.N, invoiceRemindersScreen2.O, new RowLoadingDelegate(), invoiceRemindersScreen2.P), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: jy6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoiceRemindersScreen f179331b;

            {
                this.f179331b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                InvoiceRemindersScreen invoiceRemindersScreen = this.f179331b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InvoiceRemindersScreen.T;
                        qji.b bVarU2 = invoiceRemindersScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.invoice.screen.reminders.di.InvoiceRemindersScreenInjector");
                        u2 u2Var = (u2) bVarU2;
                        g2 g2Var = u2Var.f282769a;
                        u2 u2Var2 = u2Var.f282770b;
                        InvoiceRemindersScreenContract$InputData.DefaultInvoiceReminders defaultInvoiceReminders = invoiceRemindersScreen.K;
                        defaultInvoiceReminders.getClass();
                        return new s2(g2Var, u2Var2, defaultInvoiceReminders);
                    case 1:
                        KProperty[] kPropertyArr2 = InvoiceRemindersScreen.T;
                        return (m) ((s2) invoiceRemindersScreen.Q.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = InvoiceRemindersScreen.T;
                        InvoiceRemindersScreen invoiceRemindersScreen2 = this.f179331b;
                        return dli.f.a(invoiceRemindersScreen2, invoiceRemindersScreen2.d(), v.k(new CellDetailsNoteDelegate(), new CellDetailsStandaloneNoteDelegate(), invoiceRemindersScreen2.N, invoiceRemindersScreen2.O, new RowLoadingDelegate(), invoiceRemindersScreen2.P), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: jy6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoiceRemindersScreen f179331b;

            {
                this.f179331b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                InvoiceRemindersScreen invoiceRemindersScreen = this.f179331b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InvoiceRemindersScreen.T;
                        qji.b bVarU2 = invoiceRemindersScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.invoice.screen.reminders.di.InvoiceRemindersScreenInjector");
                        u2 u2Var = (u2) bVarU2;
                        g2 g2Var = u2Var.f282769a;
                        u2 u2Var2 = u2Var.f282770b;
                        InvoiceRemindersScreenContract$InputData.DefaultInvoiceReminders defaultInvoiceReminders = invoiceRemindersScreen.K;
                        defaultInvoiceReminders.getClass();
                        return new s2(g2Var, u2Var2, defaultInvoiceReminders);
                    case 1:
                        KProperty[] kPropertyArr2 = InvoiceRemindersScreen.T;
                        return (m) ((s2) invoiceRemindersScreen.Q.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = InvoiceRemindersScreen.T;
                        InvoiceRemindersScreen invoiceRemindersScreen2 = this.f179331b;
                        return dli.f.a(invoiceRemindersScreen2, invoiceRemindersScreen2.d(), v.k(new CellDetailsNoteDelegate(), new CellDetailsStandaloneNoteDelegate(), invoiceRemindersScreen2.N, invoiceRemindersScreen2.O, new RowLoadingDelegate(), invoiceRemindersScreen2.P), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        j jVar = uiState.f179341a;
        TextLocalisedClause textLocalisedClause = jVar.f179339a;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setSecondDescriptionText(jVar.f179340b);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        LargeActionButton largeActionButton = d3().f174564b;
        i iVar = uiState.f179343c;
        largeActionButton.setText(iVar.f179337a);
        largeActionButton.setEnabled(iVar.f179338b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (s2) this.Q.getValue();
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
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new c(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new c(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.N.f52371h.f121375b), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.O.f53225r), new jy6.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.P.r()), new f(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.M.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final m d() {
        return (m) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }
}
