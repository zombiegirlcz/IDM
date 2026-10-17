package com.revolut.feature.kyc.impl.screens.incode_consent;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.kyc.api.R$string;
import com.revolut.feature.kyc.impl.R$id;
import com.revolut.feature.kyc.impl.R$layout;
import com.revolut.feature.kyc.impl.screens.incode_consent.IncodeDocumentProcessingConsentScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import dv9.r;
import dx8.e;
import dx8.f;
import dx8.g;
import dx8.i;
import dx8.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pki.b;
import te0.w;
import vc.s;
import zhm.u;
import zu8.x;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc/impl/screens/incode_consent/IncodeDocumentProcessingConsentScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ldx8/e;", "Ldli/a;", "Ldx8/g;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IncodeDocumentProcessingConsentScreen extends ViewController<e> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(IncodeDocumentProcessingConsentScreen.class, "binding", "getBinding()Lcom/revolut/feature/kyc/impl/databinding/ScreenIncodeDocumentProcessingConsentBinding;", 0))};
    public final IncodeDocumentProcessingConsentContract$InputData K;
    public final h L;
    public final int M;
    public final Object N;
    public final boolean O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public IncodeDocumentProcessingConsentScreen(IncodeDocumentProcessingConsentContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, i.f);
        this.M = R$layout.screen_incode_document_processing_consent;
        this.N = w.y0(new r(21));
        this.O = true;
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: dx8.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IncodeDocumentProcessingConsentScreen f120920b;

            {
                this.f120920b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                IncodeDocumentProcessingConsentScreen incodeDocumentProcessingConsentScreen = this.f120920b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = IncodeDocumentProcessingConsentScreen.S;
                        qji.b bVarU2 = incodeDocumentProcessingConsentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.kyc.impl.screens.incode_consent.di.IncodeDocumentProcessingConsentInjector");
                        incodeDocumentProcessingConsentScreen.K.getClass();
                        x xVar = new x();
                        xVar.f325410a = e4m.b.b(new zd8.c(2));
                        return xVar;
                    case 1:
                        KProperty[] kPropertyArr2 = IncodeDocumentProcessingConsentScreen.S;
                        return (f) ((x) incodeDocumentProcessingConsentScreen.P.getValue()).f325410a.get();
                    default:
                        KProperty[] kPropertyArr3 = IncodeDocumentProcessingConsentScreen.S;
                        IncodeDocumentProcessingConsentScreen incodeDocumentProcessingConsentScreen2 = this.f120920b;
                        return dli.f.a(incodeDocumentProcessingConsentScreen2, (f) incodeDocumentProcessingConsentScreen2.Q.getValue(), u.c((ListCellDelegate) incodeDocumentProcessingConsentScreen2.N.getValue()), R$id.incode_consent_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: dx8.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IncodeDocumentProcessingConsentScreen f120920b;

            {
                this.f120920b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                IncodeDocumentProcessingConsentScreen incodeDocumentProcessingConsentScreen = this.f120920b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = IncodeDocumentProcessingConsentScreen.S;
                        qji.b bVarU2 = incodeDocumentProcessingConsentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.kyc.impl.screens.incode_consent.di.IncodeDocumentProcessingConsentInjector");
                        incodeDocumentProcessingConsentScreen.K.getClass();
                        x xVar = new x();
                        xVar.f325410a = e4m.b.b(new zd8.c(2));
                        return xVar;
                    case 1:
                        KProperty[] kPropertyArr2 = IncodeDocumentProcessingConsentScreen.S;
                        return (f) ((x) incodeDocumentProcessingConsentScreen.P.getValue()).f325410a.get();
                    default:
                        KProperty[] kPropertyArr3 = IncodeDocumentProcessingConsentScreen.S;
                        IncodeDocumentProcessingConsentScreen incodeDocumentProcessingConsentScreen2 = this.f120920b;
                        return dli.f.a(incodeDocumentProcessingConsentScreen2, (f) incodeDocumentProcessingConsentScreen2.Q.getValue(), u.c((ListCellDelegate) incodeDocumentProcessingConsentScreen2.N.getValue()), R$id.incode_consent_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: dx8.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IncodeDocumentProcessingConsentScreen f120920b;

            {
                this.f120920b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                IncodeDocumentProcessingConsentScreen incodeDocumentProcessingConsentScreen = this.f120920b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = IncodeDocumentProcessingConsentScreen.S;
                        qji.b bVarU2 = incodeDocumentProcessingConsentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.kyc.impl.screens.incode_consent.di.IncodeDocumentProcessingConsentInjector");
                        incodeDocumentProcessingConsentScreen.K.getClass();
                        x xVar = new x();
                        xVar.f325410a = e4m.b.b(new zd8.c(2));
                        return xVar;
                    case 1:
                        KProperty[] kPropertyArr2 = IncodeDocumentProcessingConsentScreen.S;
                        return (f) ((x) incodeDocumentProcessingConsentScreen.P.getValue()).f325410a.get();
                    default:
                        KProperty[] kPropertyArr3 = IncodeDocumentProcessingConsentScreen.S;
                        IncodeDocumentProcessingConsentScreen incodeDocumentProcessingConsentScreen2 = this.f120920b;
                        return dli.f.a(incodeDocumentProcessingConsentScreen2, (f) incodeDocumentProcessingConsentScreen2.Q.getValue(), u.c((ListCellDelegate) incodeDocumentProcessingConsentScreen2.N.getValue()), R$id.incode_consent_recyclerView, null, null, null, 56);
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
    public final xki.e R1() {
        return (x) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (f) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((c) this.R.getValue()).h().setTag(com.revolut.core.ui_kit.R$id.uikit_main_scrollable_view, "MAIN_SCROLLABLE_TAG");
        NavBarWithToolbar navBarWithToolbar = d3().f300082b;
        navBarWithToolbar.setDescriptionVisible(false);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.kyc_incode_us_consent_detailed_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.kyc_incode_us_consent_detailed_title, null, null, 14));
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.kyc_incode_us_consent_detailed_subtitle, null, null, 14));
        TwinVerticalButton twinVerticalButton = d3().f300083c;
        twinVerticalButton.setFabImage(new ResourceImage(R$drawable.uikit_icn_24_arrow_thin_down, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorBackground), (List) null, (ImageTransformations) null, (Clause) null, 246));
        twinVerticalButton.setFabEnabled(true);
        twinVerticalButton.setFabAbsoluteRotation(BitmapDescriptorFactory.HUE_RED, true);
        twinVerticalButton.setSecondaryButtonVisible(false);
        twinVerticalButton.setMainButtonText(new TextLocalisedClause(R$string.kyc_incode_us_consent_detailed_button_title, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f300083c.o0()), new j(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f300083c.m0()), new j(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f300082b.f59410q), new j(this, null, 2), 3);
        ViewController.P2(this, rd0.e.b(((ListCellDelegate) this.N.getValue()).d), new dob.c(this, null, 24), 3);
    }

    public final wu8.c d3() {
        ViewBinding value = this.L.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (wu8.c) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.O);
    }
}
