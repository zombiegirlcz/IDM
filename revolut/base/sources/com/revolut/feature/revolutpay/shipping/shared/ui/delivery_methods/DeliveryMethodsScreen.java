package com.revolut.feature.revolutpay.shipping.shared.ui.delivery_methods;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.c0;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.revolutpay.shipping.shared.R$id;
import com.revolut.feature.revolutpay.shipping.shared.R$layout;
import com.revolut.feature.revolutpay.shipping.shared.R$string;
import com.revolut.feature.revolutpay.shipping.shared.ui.delivery_methods.DeliveryMethodsScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import p7c.f;
import sec.e;
import sec.g;
import sec.i;
import sec.j;
import sec.k;
import sec.l;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/shipping/shared/ui/delivery_methods/DeliveryMethodsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lsec/e;", "Ldli/a;", "Lsec/g;", "feature_revolut_pay_shipping_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DeliveryMethodsScreen extends ViewController<e> implements a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(DeliveryMethodsScreen.class, "binding", "getBinding()Lcom/revolut/feature/revolutpay/shipping/shared/databinding/ScreenDeliveryMethodsListBinding;", 0))};
    public final int K;
    public final Integer L;
    public final h M;
    public final RowDelegate N;
    public final SelectableDelegate O;
    public final CellDetailsNoteDelegate P;
    public final FullScreenStateDelegate Q;
    public final Object R;
    public final Object S;
    public final Object T;

    public DeliveryMethodsScreen(DeliveryMethodsContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_delivery_methods_list;
        this.L = Integer.valueOf(R$style.UiKitTheme_Transparent);
        this.M = s.t(this, i.f);
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.N = rowDelegate;
        this.O = new SelectableDelegate(rowDelegate);
        this.P = new CellDetailsNoteDelegate();
        this.Q = new FullScreenStateDelegate();
        this.R = w.y0(new s86.a(this, inputData, 10));
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: sec.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeliveryMethodsScreen f262174b;

            {
                this.f262174b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = DeliveryMethodsScreen.U;
                        return (f) ((p7c.f) this.f262174b.R.getValue()).f233608c.get();
                    default:
                        KProperty[] kPropertyArr2 = DeliveryMethodsScreen.U;
                        DeliveryMethodsScreen deliveryMethodsScreen = this.f262174b;
                        return dli.f.a(deliveryMethodsScreen, deliveryMethodsScreen.R2(), v.k(new RowLoadingDelegate(), deliveryMethodsScreen.N, deliveryMethodsScreen.O, deliveryMethodsScreen.P, deliveryMethodsScreen.Q), R$id.deliveryMethodsScreen_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: sec.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeliveryMethodsScreen f262174b;

            {
                this.f262174b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = DeliveryMethodsScreen.U;
                        return (f) ((p7c.f) this.f262174b.R.getValue()).f233608c.get();
                    default:
                        KProperty[] kPropertyArr2 = DeliveryMethodsScreen.U;
                        DeliveryMethodsScreen deliveryMethodsScreen = this.f262174b;
                        return dli.f.a(deliveryMethodsScreen, deliveryMethodsScreen.R2(), v.k(new RowLoadingDelegate(), deliveryMethodsScreen.N, deliveryMethodsScreen.O, deliveryMethodsScreen.P, deliveryMethodsScreen.Q), R$id.deliveryMethodsScreen_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2, reason: from getter */
    public final Integer getL() {
        return this.L;
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f245113b.setEnabled(uiState.f262171b);
        NavBarWithToolbar navBarWithToolbar = d3().f245114c;
        Clause clause = uiState.f262172c;
        navBarWithToolbar.setDescriptionVisible(clause != null);
        navBarWithToolbar.setDescriptionText(clause);
        navBarWithToolbar.setDescriptionClickable(c0.TEXT_AND_ICON);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (f) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f245114c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.revolut_pay_delivery_methods_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.revolut_pay_delivery_methods_title, null, null, 14));
        d3().f245113b.setText(new TextLocalisedClause(com.revolut.feature.revolutpay.shared.R$string.revolut_pay_common_action_save, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f245113b.o), null, new j(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.r()), null, new k(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f245114c.f59410q), null, new j(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f245114c.q0()), null, new j(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f52371h.f121375b), new l(this, null), 3);
    }

    public final qec.a d3() {
        ViewBinding value = this.M.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (qec.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final sec.f R2() {
        return (sec.f) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.T.getValue();
    }
}
