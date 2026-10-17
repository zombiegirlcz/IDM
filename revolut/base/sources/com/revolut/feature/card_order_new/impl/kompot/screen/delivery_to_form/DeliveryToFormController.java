package com.revolut.feature.card_order_new.impl.kompot.screen.delivery_to_form;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.card_order_new.impl.R$layout;
import com.revolut.feature.card_order_new.impl.R$string;
import com.revolut.feature.card_order_new.impl.kompot.screen.delivery_to_form.DeliveryToFormController;
import com.revolut.feature.card_order_new.impl.kompot.screen.delivery_to_form.DeliveryToFormScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import gul.n;
import h33.b;
import h33.g;
import h33.j;
import h33.k;
import h33.p;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import n13.c;
import te0.w;
import tx0.j0;
import vc.s;
import x13.y;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_order_new/impl/kompot/screen/delivery_to_form/DeliveryToFormController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lh33/j;", "Ldli/a;", "Lh33/k;", "feature_card_order_new_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DeliveryToFormController extends ViewController<j> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(DeliveryToFormController.class, "binding", "getBinding()Lcom/revolut/feature/card_order_new/impl/databinding/ScreenDeliveryToFormBinding;", 0))};
    public final DeliveryToFormScreenContract$InputData K;
    public final Object L;
    public final Object M;
    public final int N;
    public final Object O;
    public final Object P;
    public final h Q;

    public DeliveryToFormController(DeliveryToFormScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: h33.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeliveryToFormController f149018b;

            {
                this.f149018b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                DeliveryToFormController deliveryToFormController = this.f149018b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = DeliveryToFormController.R;
                        qji.b bVarU2 = deliveryToFormController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_order_new.impl.kompot.screen.delivery_to_form.di.DeliveryToFormScreenInjector");
                        x13.q qVar = (x13.q) bVarU2;
                        x13.p pVar = qVar.f302174c;
                        x13.q qVar2 = qVar.d;
                        DeliveryToFormScreenContract$InputData deliveryToFormScreenContract$InputData = deliveryToFormController.K;
                        deliveryToFormScreenContract$InputData.getClass();
                        return new y(pVar, qVar2, deliveryToFormScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = DeliveryToFormController.R;
                        return (g) ((y) deliveryToFormController.L.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = DeliveryToFormController.R;
                        DeliveryToFormController deliveryToFormController2 = this.f149018b;
                        return dli.f.a(deliveryToFormController2, (g) deliveryToFormController2.M.getValue(), u.c((InputTextDelegate) deliveryToFormController2.O.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: h33.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeliveryToFormController f149018b;

            {
                this.f149018b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                DeliveryToFormController deliveryToFormController = this.f149018b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DeliveryToFormController.R;
                        qji.b bVarU2 = deliveryToFormController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_order_new.impl.kompot.screen.delivery_to_form.di.DeliveryToFormScreenInjector");
                        x13.q qVar = (x13.q) bVarU2;
                        x13.p pVar = qVar.f302174c;
                        x13.q qVar2 = qVar.d;
                        DeliveryToFormScreenContract$InputData deliveryToFormScreenContract$InputData = deliveryToFormController.K;
                        deliveryToFormScreenContract$InputData.getClass();
                        return new y(pVar, qVar2, deliveryToFormScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = DeliveryToFormController.R;
                        return (g) ((y) deliveryToFormController.L.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = DeliveryToFormController.R;
                        DeliveryToFormController deliveryToFormController2 = this.f149018b;
                        return dli.f.a(deliveryToFormController2, (g) deliveryToFormController2.M.getValue(), u.c((InputTextDelegate) deliveryToFormController2.O.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.N = R$layout.screen_delivery_to_form;
        this.O = w.y0(new gx2.a(28));
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: h33.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeliveryToFormController f149018b;

            {
                this.f149018b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                DeliveryToFormController deliveryToFormController = this.f149018b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DeliveryToFormController.R;
                        qji.b bVarU2 = deliveryToFormController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_order_new.impl.kompot.screen.delivery_to_form.di.DeliveryToFormScreenInjector");
                        x13.q qVar = (x13.q) bVarU2;
                        x13.p pVar = qVar.f302174c;
                        x13.q qVar2 = qVar.d;
                        DeliveryToFormScreenContract$InputData deliveryToFormScreenContract$InputData = deliveryToFormController.K;
                        deliveryToFormScreenContract$InputData.getClass();
                        return new y(pVar, qVar2, deliveryToFormScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = DeliveryToFormController.R;
                        return (g) ((y) deliveryToFormController.L.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = DeliveryToFormController.R;
                        DeliveryToFormController deliveryToFormController2 = this.f149018b;
                        return dli.f.a(deliveryToFormController2, (g) deliveryToFormController2.M.getValue(), u.c((InputTextDelegate) deliveryToFormController2.O.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.Q = s.t(this, b.f);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        p pVar = qVar instanceof p ? (p) qVar : null;
        if (pd.b.k(pVar != null ? Boolean.valueOf(pVar.f149034a) : null)) {
            d3().f211229b.setEnabled(uiState.f149029b);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (y) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (g) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f211230c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        navBarWithToolbar.setTitleAutoSize(false);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.card_delivery_delivery_to_form_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.card_delivery_delivery_to_form_title, null, null, 14), null);
        navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.card_delivery_delivery_to_form_description, null, null, 14));
        navBarWithToolbar.setDescriptionVisible(true);
        d3().f211229b.setLargeButtonText(new TextLocalisedClause(R$string.card_delivery_delivery_to_form_save_button, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, vkm.q.J(new h23.b(rd0.e.b(((InputTextDelegate) this.O.getValue()).e.f121375b), 1), new h23.b(rd0.e.b(d3().f211230c.f59410q), 2), new h23.b(rd0.e.b(d3().f211229b.c()), 3)), null, new n(this, null, 15), 3);
    }

    public final c d3() {
        ViewBinding value = this.Q.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (c) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
