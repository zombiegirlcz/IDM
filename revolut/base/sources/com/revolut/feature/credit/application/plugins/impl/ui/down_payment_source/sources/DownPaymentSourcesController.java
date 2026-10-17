package com.revolut.feature.credit.application.plugins.impl.ui.down_payment_source.sources;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import bx4.c;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.feature.credit.application.plugins.impl.ui.down_payment_source.sources.DownPaymentSourcesController;
import com.revolut.feature.credit.application.plugins.impl.ui.down_payment_source.sources.DownPaymentSourcesControllerContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dw3.c1;
import dw3.o2;
import dw3.p2;
import hx7.i;
import java.util.List;
import jii.k;
import ka4.b;
import ka4.d;
import ka4.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.d0;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/down_payment_source/sources/DownPaymentSourcesController;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Lka4/n;", "Ldli/a;", "Lka4/o;", "Lbx4/c;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DownPaymentSourcesController extends PluginScreenController<n> implements a, c {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(DownPaymentSourcesController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};
    public final DownPaymentSourcesControllerContract$InputData L;
    public final int M;
    public final Object N;
    public final Object O;
    public final h P;
    public final FullScreenStateDelegate Q;
    public final Object R;

    public DownPaymentSourcesController(DownPaymentSourcesControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = R$layout.screen_recycler_navbar_action_footer;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: ka4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DownPaymentSourcesController f182416b;

            {
                this.f182416b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                DownPaymentSourcesController downPaymentSourcesController = this.f182416b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = DownPaymentSourcesController.S;
                        qji.b bVarU2 = downPaymentSourcesController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.down_payment_source.sources.di.DownPaymentSourcesControllerInjector");
                        o2 o2Var = (o2) bVarU2;
                        c1 c1Var = o2Var.f119411c;
                        o2 o2Var2 = o2Var.d;
                        DownPaymentSourcesControllerContract$InputData downPaymentSourcesControllerContract$InputData = downPaymentSourcesController.L;
                        downPaymentSourcesControllerContract$InputData.getClass();
                        return new p2(c1Var, o2Var2, downPaymentSourcesController, downPaymentSourcesControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = DownPaymentSourcesController.S;
                        return (e) ((p2) downPaymentSourcesController.N.getValue()).f119497j.get();
                    default:
                        KProperty[] kPropertyArr3 = DownPaymentSourcesController.S;
                        DownPaymentSourcesController downPaymentSourcesController2 = this.f182416b;
                        return dli.f.a(downPaymentSourcesController2, downPaymentSourcesController2.R2(), d0.F0(downPaymentSourcesController2.Q, ((p2) downPaymentSourcesController2.N.getValue()).c().Q()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: ka4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DownPaymentSourcesController f182416b;

            {
                this.f182416b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                DownPaymentSourcesController downPaymentSourcesController = this.f182416b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DownPaymentSourcesController.S;
                        qji.b bVarU2 = downPaymentSourcesController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.down_payment_source.sources.di.DownPaymentSourcesControllerInjector");
                        o2 o2Var = (o2) bVarU2;
                        c1 c1Var = o2Var.f119411c;
                        o2 o2Var2 = o2Var.d;
                        DownPaymentSourcesControllerContract$InputData downPaymentSourcesControllerContract$InputData = downPaymentSourcesController.L;
                        downPaymentSourcesControllerContract$InputData.getClass();
                        return new p2(c1Var, o2Var2, downPaymentSourcesController, downPaymentSourcesControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = DownPaymentSourcesController.S;
                        return (e) ((p2) downPaymentSourcesController.N.getValue()).f119497j.get();
                    default:
                        KProperty[] kPropertyArr3 = DownPaymentSourcesController.S;
                        DownPaymentSourcesController downPaymentSourcesController2 = this.f182416b;
                        return dli.f.a(downPaymentSourcesController2, downPaymentSourcesController2.R2(), d0.F0(downPaymentSourcesController2.Q, ((p2) downPaymentSourcesController2.N.getValue()).c().Q()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = s.t(this, b.f);
        this.Q = new FullScreenStateDelegate();
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: ka4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DownPaymentSourcesController f182416b;

            {
                this.f182416b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                DownPaymentSourcesController downPaymentSourcesController = this.f182416b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DownPaymentSourcesController.S;
                        qji.b bVarU2 = downPaymentSourcesController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.down_payment_source.sources.di.DownPaymentSourcesControllerInjector");
                        o2 o2Var = (o2) bVarU2;
                        c1 c1Var = o2Var.f119411c;
                        o2 o2Var2 = o2Var.d;
                        DownPaymentSourcesControllerContract$InputData downPaymentSourcesControllerContract$InputData = downPaymentSourcesController.L;
                        downPaymentSourcesControllerContract$InputData.getClass();
                        return new p2(c1Var, o2Var2, downPaymentSourcesController, downPaymentSourcesControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = DownPaymentSourcesController.S;
                        return (e) ((p2) downPaymentSourcesController.N.getValue()).f119497j.get();
                    default:
                        KProperty[] kPropertyArr3 = DownPaymentSourcesController.S;
                        DownPaymentSourcesController downPaymentSourcesController2 = this.f182416b;
                        return dli.f.a(downPaymentSourcesController2, downPaymentSourcesController2.R2(), d0.F0(downPaymentSourcesController2.Q, ((p2) downPaymentSourcesController2.N.getValue()).c().Q()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        ka4.o uiState = (ka4.o) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar screenRecyclerNavbarActionFooterNavBar = d3().f174534c;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarActionFooterNavBar, "screenRecyclerNavbarActionFooterNavBar");
        i.z(screenRecyclerNavbarActionFooterNavBar, uiState.f182427b);
        ActionFooterView screenRecyclerNavbarActionFooterActionFooterView = d3().f174533b;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarActionFooterActionFooterView, "screenRecyclerNavbarActionFooterActionFooterView");
        aw0.i iVar = uiState.f182428c;
        screenRecyclerNavbarActionFooterActionFooterView.setVisibility(iVar != null ? 0 : 8);
        if (iVar != null) {
            d3().f174533b.setModel(iVar);
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((ka4.q) R2()).J2(ka4.h.f182420a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (p2) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174534c;
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174534c.f59410q), new ka4.c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174533b.f), new ka4.c(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f52371h.f121375b), new d(this, null), 3);
    }

    public final k d3() {
        ViewBinding value = this.P.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // bx4.c
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final ka4.e d() {
        return (ka4.e) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
