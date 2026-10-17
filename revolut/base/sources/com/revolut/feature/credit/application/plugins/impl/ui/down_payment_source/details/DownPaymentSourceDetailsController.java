package com.revolut.feature.credit.application.plugins.impl.ui.down_payment_source.details;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw3.j;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainer;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.R$id;
import com.revolut.feature.credit.application.plugins.impl.R$layout;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.feature.credit.application.plugins.impl.ui.down_payment_source.details.DownPaymentSourceDetailsController;
import com.revolut.feature.credit.application.plugins.impl.ui.down_payment_source.details.DownPaymentSourceDetailsControllerContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dw3.c1;
import dw3.n2;
import dw3.o2;
import ha4.b;
import ha4.c;
import ha4.i;
import ha4.k;
import ha4.l;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/down_payment_source/details/DownPaymentSourceDetailsController;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Lha4/i;", "Ldli/a;", "Lha4/k;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DownPaymentSourceDetailsController extends PluginScreenController<i> implements a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(DownPaymentSourceDetailsController.class, "binding", "getBinding()Lcom/revolut/feature/credit/application/plugins/impl/databinding/ScreenCreditRecyclerGaugeBarFooterBinding;", 0))};
    public final DownPaymentSourceDetailsControllerContract$InputData L;
    public final int M;
    public final Object N;
    public final Object O;
    public final h P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public DownPaymentSourceDetailsController(DownPaymentSourceDetailsControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = R$layout.screen_credit_recycler_gauge_bar_footer;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: ha4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DownPaymentSourceDetailsController f150436b;

            {
                this.f150436b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                DownPaymentSourceDetailsController downPaymentSourceDetailsController = this.f150436b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = DownPaymentSourceDetailsController.T;
                        qji.b bVarU2 = downPaymentSourceDetailsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.down_payment_source.details.di.DownPaymentSourceDetailsControllerInjector");
                        o2 o2Var = (o2) bVarU2;
                        c1 c1Var = o2Var.f119411c;
                        o2 o2Var2 = o2Var.d;
                        DownPaymentSourceDetailsControllerContract$InputData downPaymentSourceDetailsControllerContract$InputData = downPaymentSourceDetailsController.L;
                        downPaymentSourceDetailsControllerContract$InputData.getClass();
                        return new n2(c1Var, o2Var2, downPaymentSourceDetailsController, downPaymentSourceDetailsControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = DownPaymentSourceDetailsController.T;
                        return (l) ((n2) downPaymentSourceDetailsController.N.getValue()).f119331h.get();
                    case 2:
                        KProperty[] kPropertyArr3 = DownPaymentSourceDetailsController.T;
                        qd0.b bVarN = ((n2) downPaymentSourceDetailsController.N.getValue()).f119328b.f118443h.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 3:
                        KProperty[] kPropertyArr4 = DownPaymentSourceDetailsController.T;
                        return new RowDelegate(new h1c.c(downPaymentSourceDetailsController, 19), null, 6);
                    default:
                        KProperty[] kPropertyArr5 = DownPaymentSourceDetailsController.T;
                        DownPaymentSourceDetailsController downPaymentSourceDetailsController2 = this.f150436b;
                        return dli.f.a(downPaymentSourceDetailsController2, (l) downPaymentSourceDetailsController2.O.getValue(), v.k((RowDelegate) downPaymentSourceDetailsController2.R.getValue(), new ListSubheaderDelegate()), R$id.screenCreditRecyclerGaugeBarFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: ha4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DownPaymentSourceDetailsController f150436b;

            {
                this.f150436b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                DownPaymentSourceDetailsController downPaymentSourceDetailsController = this.f150436b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DownPaymentSourceDetailsController.T;
                        qji.b bVarU2 = downPaymentSourceDetailsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.down_payment_source.details.di.DownPaymentSourceDetailsControllerInjector");
                        o2 o2Var = (o2) bVarU2;
                        c1 c1Var = o2Var.f119411c;
                        o2 o2Var2 = o2Var.d;
                        DownPaymentSourceDetailsControllerContract$InputData downPaymentSourceDetailsControllerContract$InputData = downPaymentSourceDetailsController.L;
                        downPaymentSourceDetailsControllerContract$InputData.getClass();
                        return new n2(c1Var, o2Var2, downPaymentSourceDetailsController, downPaymentSourceDetailsControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = DownPaymentSourceDetailsController.T;
                        return (l) ((n2) downPaymentSourceDetailsController.N.getValue()).f119331h.get();
                    case 2:
                        KProperty[] kPropertyArr3 = DownPaymentSourceDetailsController.T;
                        qd0.b bVarN = ((n2) downPaymentSourceDetailsController.N.getValue()).f119328b.f118443h.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 3:
                        KProperty[] kPropertyArr4 = DownPaymentSourceDetailsController.T;
                        return new RowDelegate(new h1c.c(downPaymentSourceDetailsController, 19), null, 6);
                    default:
                        KProperty[] kPropertyArr5 = DownPaymentSourceDetailsController.T;
                        DownPaymentSourceDetailsController downPaymentSourceDetailsController2 = this.f150436b;
                        return dli.f.a(downPaymentSourceDetailsController2, (l) downPaymentSourceDetailsController2.O.getValue(), v.k((RowDelegate) downPaymentSourceDetailsController2.R.getValue(), new ListSubheaderDelegate()), R$id.screenCreditRecyclerGaugeBarFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = s.t(this, b.f);
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: ha4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DownPaymentSourceDetailsController f150436b;

            {
                this.f150436b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                DownPaymentSourceDetailsController downPaymentSourceDetailsController = this.f150436b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DownPaymentSourceDetailsController.T;
                        qji.b bVarU2 = downPaymentSourceDetailsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.down_payment_source.details.di.DownPaymentSourceDetailsControllerInjector");
                        o2 o2Var = (o2) bVarU2;
                        c1 c1Var = o2Var.f119411c;
                        o2 o2Var2 = o2Var.d;
                        DownPaymentSourceDetailsControllerContract$InputData downPaymentSourceDetailsControllerContract$InputData = downPaymentSourceDetailsController.L;
                        downPaymentSourceDetailsControllerContract$InputData.getClass();
                        return new n2(c1Var, o2Var2, downPaymentSourceDetailsController, downPaymentSourceDetailsControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = DownPaymentSourceDetailsController.T;
                        return (l) ((n2) downPaymentSourceDetailsController.N.getValue()).f119331h.get();
                    case 2:
                        KProperty[] kPropertyArr3 = DownPaymentSourceDetailsController.T;
                        qd0.b bVarN = ((n2) downPaymentSourceDetailsController.N.getValue()).f119328b.f118443h.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 3:
                        KProperty[] kPropertyArr4 = DownPaymentSourceDetailsController.T;
                        return new RowDelegate(new h1c.c(downPaymentSourceDetailsController, 19), null, 6);
                    default:
                        KProperty[] kPropertyArr5 = DownPaymentSourceDetailsController.T;
                        DownPaymentSourceDetailsController downPaymentSourceDetailsController2 = this.f150436b;
                        return dli.f.a(downPaymentSourceDetailsController2, (l) downPaymentSourceDetailsController2.O.getValue(), v.k((RowDelegate) downPaymentSourceDetailsController2.R.getValue(), new ListSubheaderDelegate()), R$id.screenCreditRecyclerGaugeBarFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i5 = 3;
        this.R = w.y0(new Function0(this) { // from class: ha4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DownPaymentSourceDetailsController f150436b;

            {
                this.f150436b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                DownPaymentSourceDetailsController downPaymentSourceDetailsController = this.f150436b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DownPaymentSourceDetailsController.T;
                        qji.b bVarU2 = downPaymentSourceDetailsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.down_payment_source.details.di.DownPaymentSourceDetailsControllerInjector");
                        o2 o2Var = (o2) bVarU2;
                        c1 c1Var = o2Var.f119411c;
                        o2 o2Var2 = o2Var.d;
                        DownPaymentSourceDetailsControllerContract$InputData downPaymentSourceDetailsControllerContract$InputData = downPaymentSourceDetailsController.L;
                        downPaymentSourceDetailsControllerContract$InputData.getClass();
                        return new n2(c1Var, o2Var2, downPaymentSourceDetailsController, downPaymentSourceDetailsControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = DownPaymentSourceDetailsController.T;
                        return (l) ((n2) downPaymentSourceDetailsController.N.getValue()).f119331h.get();
                    case 2:
                        KProperty[] kPropertyArr3 = DownPaymentSourceDetailsController.T;
                        qd0.b bVarN = ((n2) downPaymentSourceDetailsController.N.getValue()).f119328b.f118443h.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 3:
                        KProperty[] kPropertyArr4 = DownPaymentSourceDetailsController.T;
                        return new RowDelegate(new h1c.c(downPaymentSourceDetailsController, 19), null, 6);
                    default:
                        KProperty[] kPropertyArr5 = DownPaymentSourceDetailsController.T;
                        DownPaymentSourceDetailsController downPaymentSourceDetailsController2 = this.f150436b;
                        return dli.f.a(downPaymentSourceDetailsController2, (l) downPaymentSourceDetailsController2.O.getValue(), v.k((RowDelegate) downPaymentSourceDetailsController2.R.getValue(), new ListSubheaderDelegate()), R$id.screenCreditRecyclerGaugeBarFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i6 = 4;
        this.S = w.y0(new Function0(this) { // from class: ha4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DownPaymentSourceDetailsController f150436b;

            {
                this.f150436b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                DownPaymentSourceDetailsController downPaymentSourceDetailsController = this.f150436b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DownPaymentSourceDetailsController.T;
                        qji.b bVarU2 = downPaymentSourceDetailsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.down_payment_source.details.di.DownPaymentSourceDetailsControllerInjector");
                        o2 o2Var = (o2) bVarU2;
                        c1 c1Var = o2Var.f119411c;
                        o2 o2Var2 = o2Var.d;
                        DownPaymentSourceDetailsControllerContract$InputData downPaymentSourceDetailsControllerContract$InputData = downPaymentSourceDetailsController.L;
                        downPaymentSourceDetailsControllerContract$InputData.getClass();
                        return new n2(c1Var, o2Var2, downPaymentSourceDetailsController, downPaymentSourceDetailsControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = DownPaymentSourceDetailsController.T;
                        return (l) ((n2) downPaymentSourceDetailsController.N.getValue()).f119331h.get();
                    case 2:
                        KProperty[] kPropertyArr3 = DownPaymentSourceDetailsController.T;
                        qd0.b bVarN = ((n2) downPaymentSourceDetailsController.N.getValue()).f119328b.f118443h.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 3:
                        KProperty[] kPropertyArr4 = DownPaymentSourceDetailsController.T;
                        return new RowDelegate(new h1c.c(downPaymentSourceDetailsController, 19), null, 6);
                    default:
                        KProperty[] kPropertyArr5 = DownPaymentSourceDetailsController.T;
                        DownPaymentSourceDetailsController downPaymentSourceDetailsController2 = this.f150436b;
                        return dli.f.a(downPaymentSourceDetailsController2, (l) downPaymentSourceDetailsController2.O.getValue(), v.k((RowDelegate) downPaymentSourceDetailsController2.R.getValue(), new ListSubheaderDelegate()), R$id.screenCreditRecyclerGaugeBarFooter_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().d.setModel(uiState.f150447b);
        d3().f10695b.setModel(uiState.f150448c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (n2) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (l) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithContainer navBarWithContainer = d3().f10696c;
        navBarWithContainer.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithContainer.M();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f10696c.K()), new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f10695b.f), new c(this, null, 1), 3);
    }

    public final j d3() {
        ViewBinding value = this.P.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (j) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getC0() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }
}
