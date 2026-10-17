package com.revolut.feature.apm.multibanco.impl.via_verde.ui.register;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.multibanco.api.R$string;
import com.revolut.feature.apm.multibanco.impl.via_verde.ui.register.EnrollmentRegistrationScreen;
import com.revolut.feature.apm.multibanco.impl.via_verde.ui.register.EnrollmentRegistrationScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.revolut.feature_fourthline_impl.R;
import dli.a;
import g92.d;
import h30.l;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import s92.b;
import s92.c;
import s92.f;
import s92.h;
import s92.i;
import s92.j;
import s92.k;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/multibanco/impl/via_verde/ui/register/EnrollmentRegistrationScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ls92/h;", "Ldli/a;", "Ls92/i;", "feature_apm_multibanco_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EnrollmentRegistrationScreen extends ViewController<h> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(EnrollmentRegistrationScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterNextbuttonBinding;", 0))};
    public final EnrollmentRegistrationScreenContract$InputData K;
    public final int L;
    public final boolean M;
    public final ao.h N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public EnrollmentRegistrationScreen(EnrollmentRegistrationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_footer_nextbutton;
        this.M = true;
        this.N = s.t(this, b.f);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: s92.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EnrollmentRegistrationScreen f261089b;

            {
                this.f261089b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EnrollmentRegistrationScreen enrollmentRegistrationScreen = this.f261089b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EnrollmentRegistrationScreen.S;
                        return new InputTextDelegate(new s42.f(enrollmentRegistrationScreen, 16));
                    case 1:
                        KProperty[] kPropertyArr2 = EnrollmentRegistrationScreen.S;
                        EnrollmentRegistrationScreen enrollmentRegistrationScreen2 = this.f261089b;
                        return dli.f.a(enrollmentRegistrationScreen2, enrollmentRegistrationScreen2.R2(), u.c((InputTextDelegate) enrollmentRegistrationScreen2.O.getValue()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = EnrollmentRegistrationScreen.S;
                        qji.b bVarU2 = enrollmentRegistrationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.multibanco.impl.via_verde.ui.register.di.EnrollmentRegistrationScreenInjector");
                        g92.f fVar = (g92.f) bVarU2;
                        g92.e eVar = fVar.f141447a;
                        g92.f fVar2 = fVar.f141448b;
                        EnrollmentRegistrationScreenContract$InputData enrollmentRegistrationScreenContract$InputData = enrollmentRegistrationScreen.K;
                        enrollmentRegistrationScreenContract$InputData.getClass();
                        return new g92.d(eVar, fVar2, enrollmentRegistrationScreen, enrollmentRegistrationScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = EnrollmentRegistrationScreen.S;
                        return (j) ((g92.d) enrollmentRegistrationScreen.Q.getValue()).f141442h.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: s92.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EnrollmentRegistrationScreen f261089b;

            {
                this.f261089b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EnrollmentRegistrationScreen enrollmentRegistrationScreen = this.f261089b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EnrollmentRegistrationScreen.S;
                        return new InputTextDelegate(new s42.f(enrollmentRegistrationScreen, 16));
                    case 1:
                        KProperty[] kPropertyArr2 = EnrollmentRegistrationScreen.S;
                        EnrollmentRegistrationScreen enrollmentRegistrationScreen2 = this.f261089b;
                        return dli.f.a(enrollmentRegistrationScreen2, enrollmentRegistrationScreen2.R2(), u.c((InputTextDelegate) enrollmentRegistrationScreen2.O.getValue()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = EnrollmentRegistrationScreen.S;
                        qji.b bVarU2 = enrollmentRegistrationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.multibanco.impl.via_verde.ui.register.di.EnrollmentRegistrationScreenInjector");
                        g92.f fVar = (g92.f) bVarU2;
                        g92.e eVar = fVar.f141447a;
                        g92.f fVar2 = fVar.f141448b;
                        EnrollmentRegistrationScreenContract$InputData enrollmentRegistrationScreenContract$InputData = enrollmentRegistrationScreen.K;
                        enrollmentRegistrationScreenContract$InputData.getClass();
                        return new g92.d(eVar, fVar2, enrollmentRegistrationScreen, enrollmentRegistrationScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = EnrollmentRegistrationScreen.S;
                        return (j) ((g92.d) enrollmentRegistrationScreen.Q.getValue()).f141442h.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: s92.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EnrollmentRegistrationScreen f261089b;

            {
                this.f261089b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EnrollmentRegistrationScreen enrollmentRegistrationScreen = this.f261089b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EnrollmentRegistrationScreen.S;
                        return new InputTextDelegate(new s42.f(enrollmentRegistrationScreen, 16));
                    case 1:
                        KProperty[] kPropertyArr2 = EnrollmentRegistrationScreen.S;
                        EnrollmentRegistrationScreen enrollmentRegistrationScreen2 = this.f261089b;
                        return dli.f.a(enrollmentRegistrationScreen2, enrollmentRegistrationScreen2.R2(), u.c((InputTextDelegate) enrollmentRegistrationScreen2.O.getValue()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = EnrollmentRegistrationScreen.S;
                        qji.b bVarU2 = enrollmentRegistrationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.multibanco.impl.via_verde.ui.register.di.EnrollmentRegistrationScreenInjector");
                        g92.f fVar = (g92.f) bVarU2;
                        g92.e eVar = fVar.f141447a;
                        g92.f fVar2 = fVar.f141448b;
                        EnrollmentRegistrationScreenContract$InputData enrollmentRegistrationScreenContract$InputData = enrollmentRegistrationScreen.K;
                        enrollmentRegistrationScreenContract$InputData.getClass();
                        return new g92.d(eVar, fVar2, enrollmentRegistrationScreen, enrollmentRegistrationScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = EnrollmentRegistrationScreen.S;
                        return (j) ((g92.d) enrollmentRegistrationScreen.Q.getValue()).f141442h.get();
                }
            }
        });
        final int i5 = 3;
        this.R = w.y0(new Function0(this) { // from class: s92.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EnrollmentRegistrationScreen f261089b;

            {
                this.f261089b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                EnrollmentRegistrationScreen enrollmentRegistrationScreen = this.f261089b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EnrollmentRegistrationScreen.S;
                        return new InputTextDelegate(new s42.f(enrollmentRegistrationScreen, 16));
                    case 1:
                        KProperty[] kPropertyArr2 = EnrollmentRegistrationScreen.S;
                        EnrollmentRegistrationScreen enrollmentRegistrationScreen2 = this.f261089b;
                        return dli.f.a(enrollmentRegistrationScreen2, enrollmentRegistrationScreen2.R2(), u.c((InputTextDelegate) enrollmentRegistrationScreen2.O.getValue()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = EnrollmentRegistrationScreen.S;
                        qji.b bVarU2 = enrollmentRegistrationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.multibanco.impl.via_verde.ui.register.di.EnrollmentRegistrationScreenInjector");
                        g92.f fVar = (g92.f) bVarU2;
                        g92.e eVar = fVar.f141447a;
                        g92.f fVar2 = fVar.f141448b;
                        EnrollmentRegistrationScreenContract$InputData enrollmentRegistrationScreenContract$InputData = enrollmentRegistrationScreen.K;
                        enrollmentRegistrationScreenContract$InputData.getClass();
                        return new g92.d(eVar, fVar2, enrollmentRegistrationScreen, enrollmentRegistrationScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = EnrollmentRegistrationScreen.S;
                        return (j) ((g92.d) enrollmentRegistrationScreen.Q.getValue()).f141442h.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar screenRecyclerNavbarFooterNextbuttonToolbar = d3().e;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterNextbuttonToolbar, "screenRecyclerNavbarFooterNextbuttonToolbar");
        TextLocalisedClause textLocalisedClause = uiState.f261096b;
        screenRecyclerNavbarFooterNextbuttonToolbar.setTitle(textLocalisedClause, null);
        d3().e.setToolbarTitle(textLocalisedClause);
        d3().f174557b.setEnabled(uiState.f261097c);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((k) R2()).C2(f.f261093a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((d) this.Q.getValue()).getClass();
        pd.b.p(view, new TextLocalisedClause(R.string.apm_product_multibanco, null, null, 14));
        d3().e.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, new TextLocalisedClause(R$string.multibanco_back, null, null, 14), 126));
        LargeActionButton largeActionButton = d3().f174557b;
        largeActionButton.setLoadingButtonTag("EnrollmentRegistrationScreenContract_CTA_BUTTON_TAG");
        largeActionButton.setText(new TextLocalisedClause(R$string.via_verde_action_continue, null, null, 14));
        largeActionButton.setVisibility(0);
        largeActionButton.setEnabled(false);
        d3().f174558c.setTextClause(new TextLocalisedClause(R$string.via_verde_payment_reference_footer_title, u.c(new TextLocalisedClause(R$string.via_verde_payment_reference_footer_link, null, new Click(30, (Integer) null, (Object) null, "VIA_VERDE_JOIN_ID", false), 10)), null, 12));
    }

    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, l.y(d3().e.f59410q, d3().e.f59409p.f57336l, "merge(...)"), null, new c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174557b.o), null, new c(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174558c.f58608l), null, new c(this, continuation, 2), 3);
        ?? r56 = this.O;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((InputTextDelegate) r56.getValue()).e.f121375b), null, new s92.d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((InputTextDelegate) r56.getValue()).f52576h.f121375b), null, new c(this, continuation, 3), 3);
    }

    public final jii.s d3() {
        ViewBinding value = this.N.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.s) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final j R2() {
        return (j) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getX() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.M);
    }
}
