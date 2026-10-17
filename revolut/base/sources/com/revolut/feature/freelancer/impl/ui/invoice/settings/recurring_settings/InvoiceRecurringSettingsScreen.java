package com.revolut.feature.freelancer.impl.ui.invoice.settings.recurring_settings;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputDualTextDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.freelancer.impl.ui.invoice.settings.recurring_settings.InvoiceRecurringSettingsScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import efm.r;
import ihm.f;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import oy6.b;
import oy6.d;
import oy6.k;
import oy6.l;
import oy6.m;
import oy6.n;
import te0.w;
import tki.c;
import us6.g2;
import us6.m2;
import us6.q2;
import us6.u2;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/invoice/settings/recurring_settings/InvoiceRecurringSettingsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ltki/c;", "Loy6/n;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InvoiceRecurringSettingsScreen extends ViewController<q> implements c {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(InvoiceRecurringSettingsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final int K = R$layout.screen_recycler_navbar_nextbutton;
    public final h L = s.t(this, a.f);
    public final FullScreenStateDelegate M = new FullScreenStateDelegate();
    public final InputTextDelegate N = new InputTextDelegate(null);
    public final InputDualTextDelegate O = new InputDualTextDelegate(null, 3);
    public final Object P;
    public final Object Q;
    public final Object R;

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

    public InvoiceRecurringSettingsScreen() {
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: oy6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoiceRecurringSettingsScreen f230891b;

            {
                this.f230891b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                InvoiceRecurringSettingsScreen invoiceRecurringSettingsScreen = this.f230891b;
                int i3 = 1;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = InvoiceRecurringSettingsScreen.S;
                        qji.b bVarU2 = invoiceRecurringSettingsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.invoice.settings.recurring_settings.di.InvoiceRecurringSettingsScreenInjector");
                        g2 g2Var = ((u2) bVarU2).f282769a;
                        q2 q2Var = new q2();
                        q2Var.f282726a = e4m.b.b(new m2(g2Var, q2Var, i3));
                        return q2Var;
                    case 1:
                        KProperty[] kPropertyArr2 = InvoiceRecurringSettingsScreen.S;
                        return (k) ((q2) invoiceRecurringSettingsScreen.P.getValue()).f282726a.get();
                    default:
                        KProperty[] kPropertyArr3 = InvoiceRecurringSettingsScreen.S;
                        InvoiceRecurringSettingsScreen invoiceRecurringSettingsScreen2 = this.f230891b;
                        return tki.g.a(invoiceRecurringSettingsScreen2, invoiceRecurringSettingsScreen2.d(), v.k(invoiceRecurringSettingsScreen2.M, invoiceRecurringSettingsScreen2.N, invoiceRecurringSettingsScreen2.O, new ListSubheaderDelegate(), new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: oy6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoiceRecurringSettingsScreen f230891b;

            {
                this.f230891b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                InvoiceRecurringSettingsScreen invoiceRecurringSettingsScreen = this.f230891b;
                int i3 = 1;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InvoiceRecurringSettingsScreen.S;
                        qji.b bVarU2 = invoiceRecurringSettingsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.invoice.settings.recurring_settings.di.InvoiceRecurringSettingsScreenInjector");
                        g2 g2Var = ((u2) bVarU2).f282769a;
                        q2 q2Var = new q2();
                        q2Var.f282726a = e4m.b.b(new m2(g2Var, q2Var, i3));
                        return q2Var;
                    case 1:
                        KProperty[] kPropertyArr2 = InvoiceRecurringSettingsScreen.S;
                        return (k) ((q2) invoiceRecurringSettingsScreen.P.getValue()).f282726a.get();
                    default:
                        KProperty[] kPropertyArr3 = InvoiceRecurringSettingsScreen.S;
                        InvoiceRecurringSettingsScreen invoiceRecurringSettingsScreen2 = this.f230891b;
                        return tki.g.a(invoiceRecurringSettingsScreen2, invoiceRecurringSettingsScreen2.d(), v.k(invoiceRecurringSettingsScreen2.M, invoiceRecurringSettingsScreen2.N, invoiceRecurringSettingsScreen2.O, new ListSubheaderDelegate(), new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: oy6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoiceRecurringSettingsScreen f230891b;

            {
                this.f230891b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                InvoiceRecurringSettingsScreen invoiceRecurringSettingsScreen = this.f230891b;
                int i32 = 1;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InvoiceRecurringSettingsScreen.S;
                        qji.b bVarU2 = invoiceRecurringSettingsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.invoice.settings.recurring_settings.di.InvoiceRecurringSettingsScreenInjector");
                        g2 g2Var = ((u2) bVarU2).f282769a;
                        q2 q2Var = new q2();
                        q2Var.f282726a = e4m.b.b(new m2(g2Var, q2Var, i32));
                        return q2Var;
                    case 1:
                        KProperty[] kPropertyArr2 = InvoiceRecurringSettingsScreen.S;
                        return (k) ((q2) invoiceRecurringSettingsScreen.P.getValue()).f282726a.get();
                    default:
                        KProperty[] kPropertyArr3 = InvoiceRecurringSettingsScreen.S;
                        InvoiceRecurringSettingsScreen invoiceRecurringSettingsScreen2 = this.f230891b;
                        return tki.g.a(invoiceRecurringSettingsScreen2, invoiceRecurringSettingsScreen2.d(), v.k(invoiceRecurringSettingsScreen2.M, invoiceRecurringSettingsScreen2.N, invoiceRecurringSettingsScreen2.O, new ListSubheaderDelegate(), new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        n uiState = (n) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        m mVar = uiState.f230903a;
        TextLocalisedClause textLocalisedClause = mVar.f230901a;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setSecondDescriptionText(mVar.f230902b);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        LargeActionButton largeActionButton = d3().f174564b;
        l lVar = uiState.f230905c;
        largeActionButton.setText(lVar.f230899a);
        largeActionButton.setEnabled(lVar.f230900b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (q2) this.P.getValue();
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
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new b(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new b(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.M.f.f121375b), new oy6.c(this, null), 3);
        InputDualTextDelegate inputDualTextDelegate = this.O;
        f fVar = inputDualTextDelegate.f52549c.e.f121375b;
        InputTextDelegate inputTextDelegate = inputDualTextDelegate.d;
        ViewController.P2(this, h30.l.y(fVar, inputTextDelegate.e.f121375b, "merge(...)"), new d(this, null), 3);
        r rVarMerge = r.merge(this.N.f52575g.f121375b, inputDualTextDelegate.f52549c.f52575g.f121375b, inputTextDelegate.f52575g.f121375b);
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        ViewController.P2(this, rd0.e.b(rVarMerge), new oy6.e(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.L.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final k d() {
        return (k) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.R.getValue();
    }
}
