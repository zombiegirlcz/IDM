package com.revolut.feature.apm.multibanco.impl.via_verde.ui.label;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.multibanco.api.R$string;
import com.revolut.feature.apm.multibanco.impl.via_verde.ui.label.EnrollmentLabelScreen;
import com.revolut.feature.apm.multibanco.impl.via_verde.ui.label.EnrollmentLabelScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.revolut.feature_fourthline_impl.R;
import dli.a;
import h30.l;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import o92.b;
import o92.c;
import o92.d;
import o92.f;
import o92.g;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/multibanco/impl/via_verde/ui/label/EnrollmentLabelScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lo92/f;", "Ldli/a;", "Lo92/g;", "feature_apm_multibanco_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EnrollmentLabelScreen extends ViewController<f> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(EnrollmentLabelScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final EnrollmentLabelScreenContract$InputData K;
    public final int L;
    public final boolean M;
    public final h N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public EnrollmentLabelScreen(EnrollmentLabelScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = true;
        this.N = s.t(this, b.f);
        this.O = w.y0(new o23.b(26));
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: o92.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EnrollmentLabelScreen f223060b;

            {
                this.f223060b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EnrollmentLabelScreen enrollmentLabelScreen = this.f223060b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EnrollmentLabelScreen.S;
                        EnrollmentLabelScreen enrollmentLabelScreen2 = this.f223060b;
                        return dli.f.a(enrollmentLabelScreen2, (h) enrollmentLabelScreen2.R.getValue(), u.c((InputTextDelegate) enrollmentLabelScreen2.O.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EnrollmentLabelScreen.S;
                        qji.b bVarU2 = enrollmentLabelScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.multibanco.impl.via_verde.ui.label.di.EnrollmentLabelScreenInjector");
                        g92.f fVar = (g92.f) bVarU2;
                        g92.e eVar = fVar.f141447a;
                        g92.f fVar2 = fVar.f141448b;
                        EnrollmentLabelScreenContract$InputData enrollmentLabelScreenContract$InputData = enrollmentLabelScreen.K;
                        enrollmentLabelScreenContract$InputData.getClass();
                        return new g92.b(eVar, fVar2, enrollmentLabelScreen, enrollmentLabelScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = EnrollmentLabelScreen.S;
                        return (h) ((g92.b) enrollmentLabelScreen.Q.getValue()).f141435h.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: o92.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EnrollmentLabelScreen f223060b;

            {
                this.f223060b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EnrollmentLabelScreen enrollmentLabelScreen = this.f223060b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EnrollmentLabelScreen.S;
                        EnrollmentLabelScreen enrollmentLabelScreen2 = this.f223060b;
                        return dli.f.a(enrollmentLabelScreen2, (h) enrollmentLabelScreen2.R.getValue(), u.c((InputTextDelegate) enrollmentLabelScreen2.O.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EnrollmentLabelScreen.S;
                        qji.b bVarU2 = enrollmentLabelScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.multibanco.impl.via_verde.ui.label.di.EnrollmentLabelScreenInjector");
                        g92.f fVar = (g92.f) bVarU2;
                        g92.e eVar = fVar.f141447a;
                        g92.f fVar2 = fVar.f141448b;
                        EnrollmentLabelScreenContract$InputData enrollmentLabelScreenContract$InputData = enrollmentLabelScreen.K;
                        enrollmentLabelScreenContract$InputData.getClass();
                        return new g92.b(eVar, fVar2, enrollmentLabelScreen, enrollmentLabelScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = EnrollmentLabelScreen.S;
                        return (h) ((g92.b) enrollmentLabelScreen.Q.getValue()).f141435h.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: o92.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EnrollmentLabelScreen f223060b;

            {
                this.f223060b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EnrollmentLabelScreen enrollmentLabelScreen = this.f223060b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EnrollmentLabelScreen.S;
                        EnrollmentLabelScreen enrollmentLabelScreen2 = this.f223060b;
                        return dli.f.a(enrollmentLabelScreen2, (h) enrollmentLabelScreen2.R.getValue(), u.c((InputTextDelegate) enrollmentLabelScreen2.O.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EnrollmentLabelScreen.S;
                        qji.b bVarU2 = enrollmentLabelScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.multibanco.impl.via_verde.ui.label.di.EnrollmentLabelScreenInjector");
                        g92.f fVar = (g92.f) bVarU2;
                        g92.e eVar = fVar.f141447a;
                        g92.f fVar2 = fVar.f141448b;
                        EnrollmentLabelScreenContract$InputData enrollmentLabelScreenContract$InputData = enrollmentLabelScreen.K;
                        enrollmentLabelScreenContract$InputData.getClass();
                        return new g92.b(eVar, fVar2, enrollmentLabelScreen, enrollmentLabelScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = EnrollmentLabelScreen.S;
                        return (h) ((g92.b) enrollmentLabelScreen.Q.getValue()).f141435h.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174564b.setEnabled(uiState.f223066b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        o92.h hVar = (o92.h) this.R.getValue();
        hVar.C2(new f(hVar.f223067p.f62667a));
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g92.b) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (o92.h) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((g92.b) this.Q.getValue()).getClass();
        pd.b.p(view, new TextLocalisedClause(R.string.apm_product_multibanco, null, null, 14));
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.via_verde_identifier_label_header_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.via_verde_identifier_label_header_subtitle, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setSecondDescriptionText(textLocalisedClause2);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setLoadingButtonTag("EnrollmentLabelScreenContract_CTA_BUTTON_TAG");
        largeActionButton.setText(new TextLocalisedClause(R$string.via_verde_identifier_label_action_save, null, null, 14));
        largeActionButton.setVisibility(0);
        largeActionButton.setEnabled(false);
    }

    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, l.y(d3().f174565c.f59410q, d3().f174565c.f59409p.f57336l, "merge(...)"), null, new c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new c(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((InputTextDelegate) this.O.getValue()).e.f121375b), null, new d(this, null), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.N.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
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
