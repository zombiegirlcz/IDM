package com.revolut.feature.apm.aani.impl.ui.registration.confirmation;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.aani.api.R$string;
import com.revolut.feature.apm.aani.impl.ui.registration.confirmation.AaniRegistrationConfirmationContract$InputData;
import com.revolut.feature.apm.aani.impl.ui.registration.confirmation.AaniRegistrationConfirmationScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pl1.k;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import xl1.b;
import xl1.g;
import xl1.i;
import xl1.j;
import xl1.m;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/aani/impl/ui/registration/confirmation/AaniRegistrationConfirmationScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lxl1/b;", "Ldli/a;", "Lxl1/g;", "feature_apm_aani_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AaniRegistrationConfirmationScreen extends ViewController<b> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(AaniRegistrationConfirmationScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterNextbuttonBinding;", 0))};
    public final AaniRegistrationConfirmationContract$InputData K;
    public final int L;
    public final h M;
    public final RowDelegate N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public AaniRegistrationConfirmationScreen(AaniRegistrationConfirmationContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_footer_nextbutton;
        this.M = s.t(this, i.f);
        this.N = new RowDelegate(null, null, 7);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: xl1.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AaniRegistrationConfirmationScreen f306908b;

            {
                this.f306908b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AaniRegistrationConfirmationScreen aaniRegistrationConfirmationScreen = this.f306908b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AaniRegistrationConfirmationScreen.R;
                        AaniRegistrationConfirmationScreen aaniRegistrationConfirmationScreen2 = this.f306908b;
                        return dli.f.a(aaniRegistrationConfirmationScreen2, (m) aaniRegistrationConfirmationScreen2.Q.getValue(), v.k(new CellDetailsDelegate(), aaniRegistrationConfirmationScreen2.N), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AaniRegistrationConfirmationScreen.R;
                        qji.b bVarU2 = aaniRegistrationConfirmationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.aani.impl.ui.registration.confirmation.di.AaniRegistrationConfirmationScreenInjector");
                        pl1.j jVar = (pl1.j) bVarU2;
                        pl1.m mVar = jVar.f237256b;
                        pl1.j jVar2 = jVar.f237257c;
                        AaniRegistrationConfirmationContract$InputData aaniRegistrationConfirmationContract$InputData = aaniRegistrationConfirmationScreen.K;
                        aaniRegistrationConfirmationContract$InputData.getClass();
                        return new pl1.k(mVar, jVar2, aaniRegistrationConfirmationContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = AaniRegistrationConfirmationScreen.R;
                        return (m) ((pl1.k) aaniRegistrationConfirmationScreen.P.getValue()).f237260c.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: xl1.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AaniRegistrationConfirmationScreen f306908b;

            {
                this.f306908b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AaniRegistrationConfirmationScreen aaniRegistrationConfirmationScreen = this.f306908b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AaniRegistrationConfirmationScreen.R;
                        AaniRegistrationConfirmationScreen aaniRegistrationConfirmationScreen2 = this.f306908b;
                        return dli.f.a(aaniRegistrationConfirmationScreen2, (m) aaniRegistrationConfirmationScreen2.Q.getValue(), v.k(new CellDetailsDelegate(), aaniRegistrationConfirmationScreen2.N), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AaniRegistrationConfirmationScreen.R;
                        qji.b bVarU2 = aaniRegistrationConfirmationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.aani.impl.ui.registration.confirmation.di.AaniRegistrationConfirmationScreenInjector");
                        pl1.j jVar = (pl1.j) bVarU2;
                        pl1.m mVar = jVar.f237256b;
                        pl1.j jVar2 = jVar.f237257c;
                        AaniRegistrationConfirmationContract$InputData aaniRegistrationConfirmationContract$InputData = aaniRegistrationConfirmationScreen.K;
                        aaniRegistrationConfirmationContract$InputData.getClass();
                        return new pl1.k(mVar, jVar2, aaniRegistrationConfirmationContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = AaniRegistrationConfirmationScreen.R;
                        return (m) ((pl1.k) aaniRegistrationConfirmationScreen.P.getValue()).f237260c.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: xl1.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AaniRegistrationConfirmationScreen f306908b;

            {
                this.f306908b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AaniRegistrationConfirmationScreen aaniRegistrationConfirmationScreen = this.f306908b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AaniRegistrationConfirmationScreen.R;
                        AaniRegistrationConfirmationScreen aaniRegistrationConfirmationScreen2 = this.f306908b;
                        return dli.f.a(aaniRegistrationConfirmationScreen2, (m) aaniRegistrationConfirmationScreen2.Q.getValue(), v.k(new CellDetailsDelegate(), aaniRegistrationConfirmationScreen2.N), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AaniRegistrationConfirmationScreen.R;
                        qji.b bVarU2 = aaniRegistrationConfirmationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.aani.impl.ui.registration.confirmation.di.AaniRegistrationConfirmationScreenInjector");
                        pl1.j jVar = (pl1.j) bVarU2;
                        pl1.m mVar = jVar.f237256b;
                        pl1.j jVar2 = jVar.f237257c;
                        AaniRegistrationConfirmationContract$InputData aaniRegistrationConfirmationContract$InputData = aaniRegistrationConfirmationScreen.K;
                        aaniRegistrationConfirmationContract$InputData.getClass();
                        return new pl1.k(mVar, jVar2, aaniRegistrationConfirmationContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = AaniRegistrationConfirmationScreen.R;
                        return (m) ((pl1.k) aaniRegistrationConfirmationScreen.P.getValue()).f237260c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((g) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (k) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (m) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().e;
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.aani_onboarding_confirmation_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.aani_onboarding_confirmation_title, null, null, 14), null);
        LargeActionButton largeActionButton = d3().f174557b;
        largeActionButton.setLoadingButtonTag("AANI_REG_CONFIRMATION_CTA_BUTTON_TAG");
        largeActionButton.setText(new TextLocalisedClause(R$string.aani_onboarding_confirmation_continue_title, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().e.f59410q), null, new j(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174557b.o), null, new j(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.f53225r), null, new xl1.k(this, null), 3);
    }

    public final jii.s d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.s) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.O.getValue();
    }
}
