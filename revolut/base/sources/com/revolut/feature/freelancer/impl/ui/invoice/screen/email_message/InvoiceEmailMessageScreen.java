package com.revolut.feature.freelancer.impl.ui.invoice.screen.email_message;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.feature.freelancer.impl.ui.invoice.screen.email_message.InvoiceEmailMessageScreen;
import com.revolut.feature.freelancer.impl.ui.invoice.screen.email_message.InvoiceEmailMessageScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import us6.a3;
import us6.b3;
import vc.s;
import wx6.b;
import wx6.c;
import wx6.d;
import wx6.f;
import wx6.i;
import wx6.j;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/invoice/screen/email_message/InvoiceEmailMessageScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lwx6/i;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InvoiceEmailMessageScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(InvoiceEmailMessageScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final InvoiceEmailMessageScreenContract$InputData.DefaultEmailMessage K;
    public final InputTextDelegate L;
    public final FullScreenStateDelegate M;
    public final InputChecklistDelegate N;
    public final h O;
    public final int P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public InvoiceEmailMessageScreen() {
        InvoiceEmailMessageScreenContract$InputData.DefaultEmailMessage inputData = InvoiceEmailMessageScreenContract$InputData.DefaultEmailMessage.f73889a;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = new InputTextDelegate(null);
        this.M = new FullScreenStateDelegate();
        this.N = new InputChecklistDelegate();
        this.O = s.t(this, b.f);
        this.P = R$layout.screen_recycler_navbar_nextbutton;
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: wx6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoiceEmailMessageScreen f300757b;

            {
                this.f300757b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                InvoiceEmailMessageScreen invoiceEmailMessageScreen = this.f300757b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = InvoiceEmailMessageScreen.T;
                        InvoiceEmailMessageScreen invoiceEmailMessageScreen2 = this.f300757b;
                        return dli.f.a(invoiceEmailMessageScreen2, invoiceEmailMessageScreen2.R2(), v.k(invoiceEmailMessageScreen2.M, invoiceEmailMessageScreen2.N, invoiceEmailMessageScreen2.L, new RowLoadingDelegate()), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = InvoiceEmailMessageScreen.T;
                        qji.b bVarU2 = invoiceEmailMessageScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.invoice.screen.email_message.di.InvoiceEmailMessageScreenInjector");
                        a3 a3Var = (a3) ((xx6.a) bVarU2).c().mo3808a(invoiceEmailMessageScreen);
                        InvoiceEmailMessageScreenContract$InputData.DefaultEmailMessage defaultEmailMessage = invoiceEmailMessageScreen.K;
                        switch (a3Var.f282450a) {
                            case 0:
                                defaultEmailMessage.getClass();
                                a3Var.d = defaultEmailMessage;
                                break;
                            default:
                                defaultEmailMessage.getClass();
                                a3Var.d = defaultEmailMessage;
                                break;
                        }
                        return (b3) a3Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = InvoiceEmailMessageScreen.T;
                        b3 b3Var = (b3) invoiceEmailMessageScreen.R.getValue();
                        switch (b3Var.f282465a) {
                            case 0:
                                return (j) b3Var.e.get();
                            default:
                                return (j) b3Var.e.get();
                        }
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: wx6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoiceEmailMessageScreen f300757b;

            {
                this.f300757b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                InvoiceEmailMessageScreen invoiceEmailMessageScreen = this.f300757b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InvoiceEmailMessageScreen.T;
                        InvoiceEmailMessageScreen invoiceEmailMessageScreen2 = this.f300757b;
                        return dli.f.a(invoiceEmailMessageScreen2, invoiceEmailMessageScreen2.R2(), v.k(invoiceEmailMessageScreen2.M, invoiceEmailMessageScreen2.N, invoiceEmailMessageScreen2.L, new RowLoadingDelegate()), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = InvoiceEmailMessageScreen.T;
                        qji.b bVarU2 = invoiceEmailMessageScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.invoice.screen.email_message.di.InvoiceEmailMessageScreenInjector");
                        a3 a3Var = (a3) ((xx6.a) bVarU2).c().mo3808a(invoiceEmailMessageScreen);
                        InvoiceEmailMessageScreenContract$InputData.DefaultEmailMessage defaultEmailMessage = invoiceEmailMessageScreen.K;
                        switch (a3Var.f282450a) {
                            case 0:
                                defaultEmailMessage.getClass();
                                a3Var.d = defaultEmailMessage;
                                break;
                            default:
                                defaultEmailMessage.getClass();
                                a3Var.d = defaultEmailMessage;
                                break;
                        }
                        return (b3) a3Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = InvoiceEmailMessageScreen.T;
                        b3 b3Var = (b3) invoiceEmailMessageScreen.R.getValue();
                        switch (b3Var.f282465a) {
                            case 0:
                                return (j) b3Var.e.get();
                            default:
                                return (j) b3Var.e.get();
                        }
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: wx6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoiceEmailMessageScreen f300757b;

            {
                this.f300757b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                InvoiceEmailMessageScreen invoiceEmailMessageScreen = this.f300757b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InvoiceEmailMessageScreen.T;
                        InvoiceEmailMessageScreen invoiceEmailMessageScreen2 = this.f300757b;
                        return dli.f.a(invoiceEmailMessageScreen2, invoiceEmailMessageScreen2.R2(), v.k(invoiceEmailMessageScreen2.M, invoiceEmailMessageScreen2.N, invoiceEmailMessageScreen2.L, new RowLoadingDelegate()), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = InvoiceEmailMessageScreen.T;
                        qji.b bVarU2 = invoiceEmailMessageScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.invoice.screen.email_message.di.InvoiceEmailMessageScreenInjector");
                        a3 a3Var = (a3) ((xx6.a) bVarU2).c().mo3808a(invoiceEmailMessageScreen);
                        InvoiceEmailMessageScreenContract$InputData.DefaultEmailMessage defaultEmailMessage = invoiceEmailMessageScreen.K;
                        switch (a3Var.f282450a) {
                            case 0:
                                defaultEmailMessage.getClass();
                                a3Var.d = defaultEmailMessage;
                                break;
                            default:
                                defaultEmailMessage.getClass();
                                a3Var.d = defaultEmailMessage;
                                break;
                        }
                        return (b3) a3Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = InvoiceEmailMessageScreen.T;
                        b3 b3Var = (b3) invoiceEmailMessageScreen.R.getValue();
                        switch (b3Var.f282465a) {
                            case 0:
                                return (j) b3Var.e.get();
                            default:
                                return (j) b3Var.e.get();
                        }
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((i) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (b3) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.freelancer_sale_invoice_customer_message_header_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.freelancer_sale_invoice_customer_message_header_caption, null, null, 14));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f174564b.setText(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_save, null, null, 14));
        d3().f174564b.setLoadingButtonTag("ADD_MESSAGE_SUBMIT_BUTTON_TAG");
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(this.L.e.f121375b), new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.f52518c), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.f52371h.f121375b), null, new wx6.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new f(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new f(this, continuation, 1), 3);
    }

    public final u d3() {
        ViewBinding value = this.O.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final j R2() {
        return (j) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getY() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
