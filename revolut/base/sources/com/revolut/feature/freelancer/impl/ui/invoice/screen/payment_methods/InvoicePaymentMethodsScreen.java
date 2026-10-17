package com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_methods;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import by6.b;
import by6.c;
import by6.d;
import by6.i;
import by6.j;
import by6.k;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_methods.InvoicePaymentMethodsScreen;
import com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_methods.InvoicePaymentMethodsScreenContract$InputData;
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
import us6.c3;
import us6.d3;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/invoice/screen/payment_methods/InvoicePaymentMethodsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lby6/j;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InvoicePaymentMethodsScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(InvoicePaymentMethodsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final InvoicePaymentMethodsScreenContract$InputData K;
    public final int L;
    public final h M;
    public final FullScreenStateDelegate N;
    public final RowDelegate O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public InvoicePaymentMethodsScreen(InvoicePaymentMethodsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = s.t(this, b.f);
        this.N = new FullScreenStateDelegate();
        this.O = new RowDelegate(null, null, 7);
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: by6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoicePaymentMethodsScreen f19743b;

            {
                this.f19743b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                InvoicePaymentMethodsScreen invoicePaymentMethodsScreen = this.f19743b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = InvoicePaymentMethodsScreen.S;
                        qji.b bVarU2 = invoicePaymentMethodsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_methods.di.InvoicePaymentMethodsScreenInjector");
                        c3 c3Var = (c3) ((cy6.a) bVarU2).b().mo3808a(invoicePaymentMethodsScreen);
                        InvoicePaymentMethodsScreenContract$InputData invoicePaymentMethodsScreenContract$InputData = invoicePaymentMethodsScreen.K;
                        switch (c3Var.f282478a) {
                            case 0:
                                invoicePaymentMethodsScreenContract$InputData.getClass();
                                c3Var.d = invoicePaymentMethodsScreenContract$InputData;
                                break;
                            default:
                                invoicePaymentMethodsScreenContract$InputData.getClass();
                                c3Var.d = invoicePaymentMethodsScreenContract$InputData;
                                break;
                        }
                        return (d3) c3Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = InvoicePaymentMethodsScreen.S;
                        d3 d3Var = (d3) invoicePaymentMethodsScreen.P.getValue();
                        switch (d3Var.f282495a) {
                            case 0:
                                return (k) d3Var.e.get();
                            default:
                                return (k) d3Var.e.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = InvoicePaymentMethodsScreen.S;
                        InvoicePaymentMethodsScreen invoicePaymentMethodsScreen2 = this.f19743b;
                        return dli.f.a(invoicePaymentMethodsScreen2, invoicePaymentMethodsScreen2.R2(), v.k(invoicePaymentMethodsScreen2.N, new ListSubheaderDelegate(), invoicePaymentMethodsScreen2.O, new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: by6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoicePaymentMethodsScreen f19743b;

            {
                this.f19743b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                InvoicePaymentMethodsScreen invoicePaymentMethodsScreen = this.f19743b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InvoicePaymentMethodsScreen.S;
                        qji.b bVarU2 = invoicePaymentMethodsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_methods.di.InvoicePaymentMethodsScreenInjector");
                        c3 c3Var = (c3) ((cy6.a) bVarU2).b().mo3808a(invoicePaymentMethodsScreen);
                        InvoicePaymentMethodsScreenContract$InputData invoicePaymentMethodsScreenContract$InputData = invoicePaymentMethodsScreen.K;
                        switch (c3Var.f282478a) {
                            case 0:
                                invoicePaymentMethodsScreenContract$InputData.getClass();
                                c3Var.d = invoicePaymentMethodsScreenContract$InputData;
                                break;
                            default:
                                invoicePaymentMethodsScreenContract$InputData.getClass();
                                c3Var.d = invoicePaymentMethodsScreenContract$InputData;
                                break;
                        }
                        return (d3) c3Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = InvoicePaymentMethodsScreen.S;
                        d3 d3Var = (d3) invoicePaymentMethodsScreen.P.getValue();
                        switch (d3Var.f282495a) {
                            case 0:
                                return (k) d3Var.e.get();
                            default:
                                return (k) d3Var.e.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = InvoicePaymentMethodsScreen.S;
                        InvoicePaymentMethodsScreen invoicePaymentMethodsScreen2 = this.f19743b;
                        return dli.f.a(invoicePaymentMethodsScreen2, invoicePaymentMethodsScreen2.R2(), v.k(invoicePaymentMethodsScreen2.N, new ListSubheaderDelegate(), invoicePaymentMethodsScreen2.O, new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: by6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoicePaymentMethodsScreen f19743b;

            {
                this.f19743b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                InvoicePaymentMethodsScreen invoicePaymentMethodsScreen = this.f19743b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InvoicePaymentMethodsScreen.S;
                        qji.b bVarU2 = invoicePaymentMethodsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_methods.di.InvoicePaymentMethodsScreenInjector");
                        c3 c3Var = (c3) ((cy6.a) bVarU2).b().mo3808a(invoicePaymentMethodsScreen);
                        InvoicePaymentMethodsScreenContract$InputData invoicePaymentMethodsScreenContract$InputData = invoicePaymentMethodsScreen.K;
                        switch (c3Var.f282478a) {
                            case 0:
                                invoicePaymentMethodsScreenContract$InputData.getClass();
                                c3Var.d = invoicePaymentMethodsScreenContract$InputData;
                                break;
                            default:
                                invoicePaymentMethodsScreenContract$InputData.getClass();
                                c3Var.d = invoicePaymentMethodsScreenContract$InputData;
                                break;
                        }
                        return (d3) c3Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = InvoicePaymentMethodsScreen.S;
                        d3 d3Var = (d3) invoicePaymentMethodsScreen.P.getValue();
                        switch (d3Var.f282495a) {
                            case 0:
                                return (k) d3Var.e.get();
                            default:
                                return (k) d3Var.e.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = InvoicePaymentMethodsScreen.S;
                        InvoicePaymentMethodsScreen invoicePaymentMethodsScreen2 = this.f19743b;
                        return dli.f.a(invoicePaymentMethodsScreen2, invoicePaymentMethodsScreen2.R2(), v.k(invoicePaymentMethodsScreen2.N, new ListSubheaderDelegate(), invoicePaymentMethodsScreen2.O, new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        i iVar = uiState.f19753a;
        TextLocalisedClause textLocalisedClause = iVar.f19751a;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setSecondDescriptionText(iVar.f19752b);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        LargeActionButton largeActionButton = d3().f174564b;
        by6.h hVar = uiState.f19755c;
        largeActionButton.setText(hVar.f19749a);
        largeActionButton.setEnabled(hVar.f19750b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d3) this.P.getValue();
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
        ViewController.P2(this, rd0.e.b(this.O.f53225r), new by6.e(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final k R2() {
        return (k) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
