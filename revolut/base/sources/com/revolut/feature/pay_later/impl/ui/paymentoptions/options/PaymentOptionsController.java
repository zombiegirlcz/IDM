package com.revolut.feature.pay_later.impl.ui.paymentoptions.options;

import aii.q;
import android.os.Parcelable;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pay_later.impl.ui.paymentoptions.options.PaymentOptionsController;
import com.revolut.feature.pay_later.impl.ui.paymentoptions.options.PaymentOptionsControllerContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import grl.k9;
import hx7.i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import oi9.r;
import pki.b;
import te0.w;
import tki.c;
import vc.s;
import xki.e;
import zhm.v;
import zj9.d;
import zj9.g;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/pay_later/impl/ui/paymentoptions/options/PaymentOptionsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ltki/c;", "Lzj9/h;", "Lno/m;", "feature_pay_later_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PaymentOptionsController extends ViewController<q> implements c, m {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(PaymentOptionsController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final PaymentOptionsControllerContract$InputData K;
    public final AnalyticsProduct.Retail L;
    public final h M;
    public final int N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public PaymentOptionsController(PaymentOptionsControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        k9 k9Var = k9.Credit;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.L = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        this.M = s.t(this, zj9.c.f);
        this.N = R$layout.screen_recycler_navbar;
        this.O = w.y0(new zc0.m(29));
        final int i = 0;
        this.P = w.y0(new zj9.a(0));
        this.Q = w.y0(new Function0(this) { // from class: zj9.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentOptionsController f322769b;

            {
                this.f322769b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PaymentOptionsController paymentOptionsController = this.f322769b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PaymentOptionsController.T;
                        qji.b bVarU2 = paymentOptionsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pay_later.impl.ui.paymentoptions.options.di.PaymentOptionsControllerInjector");
                        oi9.s sVar = (oi9.s) bVarU2;
                        oi9.f fVar = sVar.f225562b;
                        oi9.s sVar2 = sVar.f225563c;
                        PaymentOptionsControllerContract$InputData paymentOptionsControllerContract$InputData = paymentOptionsController.K;
                        paymentOptionsControllerContract$InputData.getClass();
                        return new r(fVar, sVar2, paymentOptionsControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = PaymentOptionsController.T;
                        return (g) ((r) paymentOptionsController.Q.getValue()).f225560b.get();
                    default:
                        KProperty[] kPropertyArr3 = PaymentOptionsController.T;
                        PaymentOptionsController paymentOptionsController2 = this.f322769b;
                        return tki.g.a(paymentOptionsController2, (g) paymentOptionsController2.R.getValue(), v.k(new RowLoadingDelegate(), (FullScreenStateDelegate) paymentOptionsController2.O.getValue(), (RowDelegate) paymentOptionsController2.P.getValue()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: zj9.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentOptionsController f322769b;

            {
                this.f322769b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PaymentOptionsController paymentOptionsController = this.f322769b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PaymentOptionsController.T;
                        qji.b bVarU2 = paymentOptionsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pay_later.impl.ui.paymentoptions.options.di.PaymentOptionsControllerInjector");
                        oi9.s sVar = (oi9.s) bVarU2;
                        oi9.f fVar = sVar.f225562b;
                        oi9.s sVar2 = sVar.f225563c;
                        PaymentOptionsControllerContract$InputData paymentOptionsControllerContract$InputData = paymentOptionsController.K;
                        paymentOptionsControllerContract$InputData.getClass();
                        return new r(fVar, sVar2, paymentOptionsControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = PaymentOptionsController.T;
                        return (g) ((r) paymentOptionsController.Q.getValue()).f225560b.get();
                    default:
                        KProperty[] kPropertyArr3 = PaymentOptionsController.T;
                        PaymentOptionsController paymentOptionsController2 = this.f322769b;
                        return tki.g.a(paymentOptionsController2, (g) paymentOptionsController2.R.getValue(), v.k(new RowLoadingDelegate(), (FullScreenStateDelegate) paymentOptionsController2.O.getValue(), (RowDelegate) paymentOptionsController2.P.getValue()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: zj9.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentOptionsController f322769b;

            {
                this.f322769b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PaymentOptionsController paymentOptionsController = this.f322769b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PaymentOptionsController.T;
                        qji.b bVarU2 = paymentOptionsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pay_later.impl.ui.paymentoptions.options.di.PaymentOptionsControllerInjector");
                        oi9.s sVar = (oi9.s) bVarU2;
                        oi9.f fVar = sVar.f225562b;
                        oi9.s sVar2 = sVar.f225563c;
                        PaymentOptionsControllerContract$InputData paymentOptionsControllerContract$InputData = paymentOptionsController.K;
                        paymentOptionsControllerContract$InputData.getClass();
                        return new r(fVar, sVar2, paymentOptionsControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = PaymentOptionsController.T;
                        return (g) ((r) paymentOptionsController.Q.getValue()).f225560b.get();
                    default:
                        KProperty[] kPropertyArr3 = PaymentOptionsController.T;
                        PaymentOptionsController paymentOptionsController2 = this.f322769b;
                        return tki.g.a(paymentOptionsController2, (g) paymentOptionsController2.R.getValue(), v.k(new RowLoadingDelegate(), (FullScreenStateDelegate) paymentOptionsController2.O.getValue(), (RowDelegate) paymentOptionsController2.P.getValue()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        zj9.h uiState = (zj9.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        i.z(navBarWithToolbar, uiState.f322771a);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (r) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (g) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new z3f.b(this, null, 16), 3);
        ViewController.P2(this, rd0.e.b(((FullScreenStateDelegate) this.O.getValue()).f.f121375b), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(((RowDelegate) this.P.getValue()).f53218h), new zj9.e(this, null), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.M.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.S.getValue();
    }
}
