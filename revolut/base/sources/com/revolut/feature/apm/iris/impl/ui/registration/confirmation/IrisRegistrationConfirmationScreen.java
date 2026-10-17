package com.revolut.feature.apm.iris.impl.ui.registration.confirmation;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.iris.api.R$string;
import com.revolut.feature.apm.iris.impl.ui.registration.IrisRegistrationFlowContract$InputData;
import com.revolut.feature.apm.iris.impl.ui.registration.confirmation.IrisRegistrationConfirmationScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.revolut.feature_fourthline_impl.R;
import dli.a;
import dli.c;
import h30.l;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import m62.b;
import m62.f;
import m62.g;
import m62.j;
import m62.k;
import m62.p;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/iris/impl/ui/registration/confirmation/IrisRegistrationConfirmationScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lm62/f;", "Ldli/a;", "Lm62/h;", "feature_apm_iris_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IrisRegistrationConfirmationScreen extends ViewController<f> implements a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(IrisRegistrationConfirmationScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterNextbuttonBinding;", 0))};
    public final int K;
    public final boolean L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;

    public IrisRegistrationConfirmationScreen(IrisRegistrationFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar_footer_nextbutton;
        this.L = true;
        this.M = s.t(this, j.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: m62.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IrisRegistrationConfirmationScreen f202976b;

            {
                this.f202976b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                IrisRegistrationConfirmationScreen irisRegistrationConfirmationScreen = this.f202976b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = IrisRegistrationConfirmationScreen.Q;
                        IrisRegistrationConfirmationScreen irisRegistrationConfirmationScreen2 = this.f202976b;
                        return dli.f.a(irisRegistrationConfirmationScreen2, (g) irisRegistrationConfirmationScreen2.P.getValue(), v.k(new CellDetailsDelegate(), new PlainTextWarningDelegate()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = IrisRegistrationConfirmationScreen.Q;
                        qji.b bVarU2 = irisRegistrationConfirmationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.iris.impl.ui.registration.confirmation.di.IrisRegistrationConfirmationScreenInjector");
                        z52.p pVar = (z52.p) bVarU2;
                        return new z52.o(pVar.f319466b, pVar.f319467c);
                    default:
                        KProperty[] kPropertyArr3 = IrisRegistrationConfirmationScreen.Q;
                        return (g) ((z52.o) irisRegistrationConfirmationScreen.O.getValue()).f319464b.get();
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: m62.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IrisRegistrationConfirmationScreen f202976b;

            {
                this.f202976b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                IrisRegistrationConfirmationScreen irisRegistrationConfirmationScreen = this.f202976b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = IrisRegistrationConfirmationScreen.Q;
                        IrisRegistrationConfirmationScreen irisRegistrationConfirmationScreen2 = this.f202976b;
                        return dli.f.a(irisRegistrationConfirmationScreen2, (g) irisRegistrationConfirmationScreen2.P.getValue(), v.k(new CellDetailsDelegate(), new PlainTextWarningDelegate()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = IrisRegistrationConfirmationScreen.Q;
                        qji.b bVarU2 = irisRegistrationConfirmationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.iris.impl.ui.registration.confirmation.di.IrisRegistrationConfirmationScreenInjector");
                        z52.p pVar = (z52.p) bVarU2;
                        return new z52.o(pVar.f319466b, pVar.f319467c);
                    default:
                        KProperty[] kPropertyArr3 = IrisRegistrationConfirmationScreen.Q;
                        return (g) ((z52.o) irisRegistrationConfirmationScreen.O.getValue()).f319464b.get();
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: m62.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IrisRegistrationConfirmationScreen f202976b;

            {
                this.f202976b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                IrisRegistrationConfirmationScreen irisRegistrationConfirmationScreen = this.f202976b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = IrisRegistrationConfirmationScreen.Q;
                        IrisRegistrationConfirmationScreen irisRegistrationConfirmationScreen2 = this.f202976b;
                        return dli.f.a(irisRegistrationConfirmationScreen2, (g) irisRegistrationConfirmationScreen2.P.getValue(), v.k(new CellDetailsDelegate(), new PlainTextWarningDelegate()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = IrisRegistrationConfirmationScreen.Q;
                        qji.b bVarU2 = irisRegistrationConfirmationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.iris.impl.ui.registration.confirmation.di.IrisRegistrationConfirmationScreenInjector");
                        z52.p pVar = (z52.p) bVarU2;
                        return new z52.o(pVar.f319466b, pVar.f319467c);
                    default:
                        KProperty[] kPropertyArr3 = IrisRegistrationConfirmationScreen.Q;
                        return (g) ((z52.o) irisRegistrationConfirmationScreen.O.getValue()).f319464b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((m62.h) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((p) ((g) this.P.getValue())).C2(b.f202970a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (z52.o) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (g) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().e;
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, new TextLocalisedClause(R$string.iris_back, null, null, 14), 126));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.iris_back, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.iris_registration_confirmation_title, null, null, 14), null);
        d3().f174558c.setTextClause(new TextLocalisedClause(R$string.iris_registration_confirmation_footer, null, null, 14));
        LargeActionButton largeActionButton = d3().f174557b;
        largeActionButton.setLoadingButtonTag("REG_CONFIRMATION_CTA_BUTTON_TAG");
        l.A(R.string.common_action_continue, null, null, 14, largeActionButton);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().e.f59410q), null, new k(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174557b.o), null, new k(this, null, 1), 3);
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
        return (c) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.L);
    }
}
