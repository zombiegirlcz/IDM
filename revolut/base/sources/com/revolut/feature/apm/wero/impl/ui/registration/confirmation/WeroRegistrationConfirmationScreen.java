package com.revolut.feature.apm.wero.impl.ui.registration.confirmation;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.wero.api.R$string;
import com.revolut.feature.apm.wero.impl.ui.registration.WeroRegistrationFlowContract$InputData;
import com.revolut.feature.apm.wero.impl.ui.registration.confirmation.WeroRegistrationConfirmationScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nh2.o;
import nh2.x;
import nh2.y;
import pi2.c;
import pi2.d;
import pi2.e;
import pi2.f;
import pi2.i;
import pi2.j;
import pki.b;
import te0.w;
import tx0.j0;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/wero/impl/ui/registration/confirmation/WeroRegistrationConfirmationScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lpi2/d;", "Ldli/a;", "Lpi2/e;", "feature_apm_wero_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WeroRegistrationConfirmationScreen extends ViewController<d> implements a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(WeroRegistrationConfirmationScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterNextbuttonBinding;", 0))};
    public final int K;
    public final boolean L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;

    public WeroRegistrationConfirmationScreen(WeroRegistrationFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar_footer_nextbutton;
        this.L = true;
        this.M = s.t(this, pi2.h.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: pi2.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WeroRegistrationConfirmationScreen f236384b;

            {
                this.f236384b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                WeroRegistrationConfirmationScreen weroRegistrationConfirmationScreen = this.f236384b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = WeroRegistrationConfirmationScreen.Q;
                        WeroRegistrationConfirmationScreen weroRegistrationConfirmationScreen2 = this.f236384b;
                        return dli.f.a(weroRegistrationConfirmationScreen2, (f) weroRegistrationConfirmationScreen2.P.getValue(), v.k(new CellDetailsDelegate(), new PlainTextWarningDelegate()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = WeroRegistrationConfirmationScreen.Q;
                        qji.b bVarU2 = weroRegistrationConfirmationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.wero.impl.ui.registration.confirmation.di.WeroRegistrationConfirmationScreenInjector");
                        y yVar = (y) bVarU2;
                        o oVar = yVar.f215363b;
                        y yVar2 = yVar.f215364c;
                        x xVar = new x();
                        xVar.f215360a = e4m.b.b(new ned.h(oVar, yVar2, xVar, 1, 3));
                        xVar.f215361b = e4m.b.b(new ned.h(oVar, yVar2, xVar, 0, 3));
                        return xVar;
                    default:
                        KProperty[] kPropertyArr3 = WeroRegistrationConfirmationScreen.Q;
                        return (f) ((x) weroRegistrationConfirmationScreen.O.getValue()).f215361b.get();
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: pi2.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WeroRegistrationConfirmationScreen f236384b;

            {
                this.f236384b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                WeroRegistrationConfirmationScreen weroRegistrationConfirmationScreen = this.f236384b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = WeroRegistrationConfirmationScreen.Q;
                        WeroRegistrationConfirmationScreen weroRegistrationConfirmationScreen2 = this.f236384b;
                        return dli.f.a(weroRegistrationConfirmationScreen2, (f) weroRegistrationConfirmationScreen2.P.getValue(), v.k(new CellDetailsDelegate(), new PlainTextWarningDelegate()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = WeroRegistrationConfirmationScreen.Q;
                        qji.b bVarU2 = weroRegistrationConfirmationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.wero.impl.ui.registration.confirmation.di.WeroRegistrationConfirmationScreenInjector");
                        y yVar = (y) bVarU2;
                        o oVar = yVar.f215363b;
                        y yVar2 = yVar.f215364c;
                        x xVar = new x();
                        xVar.f215360a = e4m.b.b(new ned.h(oVar, yVar2, xVar, 1, 3));
                        xVar.f215361b = e4m.b.b(new ned.h(oVar, yVar2, xVar, 0, 3));
                        return xVar;
                    default:
                        KProperty[] kPropertyArr3 = WeroRegistrationConfirmationScreen.Q;
                        return (f) ((x) weroRegistrationConfirmationScreen.O.getValue()).f215361b.get();
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: pi2.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WeroRegistrationConfirmationScreen f236384b;

            {
                this.f236384b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                WeroRegistrationConfirmationScreen weroRegistrationConfirmationScreen = this.f236384b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = WeroRegistrationConfirmationScreen.Q;
                        WeroRegistrationConfirmationScreen weroRegistrationConfirmationScreen2 = this.f236384b;
                        return dli.f.a(weroRegistrationConfirmationScreen2, (f) weroRegistrationConfirmationScreen2.P.getValue(), v.k(new CellDetailsDelegate(), new PlainTextWarningDelegate()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = WeroRegistrationConfirmationScreen.Q;
                        qji.b bVarU2 = weroRegistrationConfirmationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.wero.impl.ui.registration.confirmation.di.WeroRegistrationConfirmationScreenInjector");
                        y yVar = (y) bVarU2;
                        o oVar = yVar.f215363b;
                        y yVar2 = yVar.f215364c;
                        x xVar = new x();
                        xVar.f215360a = e4m.b.b(new ned.h(oVar, yVar2, xVar, 1, 3));
                        xVar.f215361b = e4m.b.b(new ned.h(oVar, yVar2, xVar, 0, 3));
                        return xVar;
                    default:
                        KProperty[] kPropertyArr3 = WeroRegistrationConfirmationScreen.Q;
                        return (f) ((x) weroRegistrationConfirmationScreen.O.getValue()).f215361b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(cli.o oVar, q qVar) {
        a.z0((e) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((j) ((f) this.P.getValue())).C2(c.f236381a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (x) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (f) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().e;
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, new TextLocalisedClause(R$string.wero_back, null, null, 14), 126));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.wero_registration_confirmation_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.wero_registration_confirmation_title, null, null, 14), null);
        LargeActionButton largeActionButton = d3().f174557b;
        largeActionButton.setLoadingButtonTag("REG_CONFIRMATION_CTA_BUTTON_TAG");
        largeActionButton.setText(new TextLocalisedClause(R$string.wero_registration_confirmation_action, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().e.f59410q), null, new i(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174557b.o), null, new i(this, null, 1), 3);
    }

    public final jii.s d3() {
        ViewBinding value = this.M.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.s) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.L);
    }
}
