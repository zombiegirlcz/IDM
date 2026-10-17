package com.revolut.feature.apm.core.ui.impl.ui.registration.terms.uri;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import c12.i0;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenDocumentLoadingDelegate;
import com.revolut.core.ui_kit.delegates.WebViewDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.ui.api.navigation.ApmRegistrationTerms$InputData;
import com.revolut.feature.apm.core.ui.impl.R$id;
import com.revolut.feature.apm.core.ui.impl.R$layout;
import com.revolut.feature.apm.core.ui.impl.ui.registration.terms.uri.ApmRegistrationTermsScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.ui_kit_pdf.PdfView;
import dli.a;
import i13.d;
import i42.e;
import i42.g;
import i42.i;
import i42.l;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import m12.c;
import p12.g0;
import te0.w;
import tx0.j0;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/ui/impl/ui/registration/terms/uri/ApmRegistrationTermsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lc12/i0;", "Ldli/a;", "Li42/e;", "feature_apm_core_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ApmRegistrationTermsScreen extends ViewController<i0> implements a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(ApmRegistrationTermsScreen.class, "binding", "getBinding()Lcom/revolut/feature/apm/core/ui/impl/databinding/ScreenApmRegistrationTermsBinding;", 0))};
    public final ApmRegistrationTerms$InputData K;
    public final int L;
    public final boolean M;
    public final h N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public ApmRegistrationTermsScreen(ApmRegistrationTerms$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_apm_registration_terms;
        this.M = true;
        this.N = s.t(this, i42.h.f);
        this.O = w.y0(new hzl.a(22));
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: i42.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ApmRegistrationTermsScreen f158274b;

            {
                this.f158274b = this;
            }

            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ApmRegistrationTermsScreen apmRegistrationTermsScreen = this.f158274b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ApmRegistrationTermsScreen.T;
                        return apmRegistrationTermsScreen.d3().d;
                    case 1:
                        KProperty[] kPropertyArr2 = ApmRegistrationTermsScreen.T;
                        ApmRegistrationTermsScreen apmRegistrationTermsScreen2 = this.f158274b;
                        return dli.f.a(apmRegistrationTermsScreen2, apmRegistrationTermsScreen2.d(), v.k(new FullScreenDocumentLoadingDelegate(), (WebViewDelegate) apmRegistrationTermsScreen2.O.getValue()), R$id.apmRegistrationTerms_recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = ApmRegistrationTermsScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(apmRegistrationTermsScreen.m2()).a().get(p12.v.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", p12.v.class, " is not found"));
                        }
                        p12.v vVar = ((p12.v) aVar2.b()).K;
                        ApmRegistrationTerms$InputData apmRegistrationTerms$InputData = apmRegistrationTermsScreen.K;
                        apmRegistrationTerms$InputData.getClass();
                        return new g0(vVar, apmRegistrationTerms$InputData);
                    default:
                        KProperty[] kPropertyArr4 = ApmRegistrationTermsScreen.T;
                        return (l) ((g0) apmRegistrationTermsScreen.R.getValue()).f231673c.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: i42.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ApmRegistrationTermsScreen f158274b;

            {
                this.f158274b = this;
            }

            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ApmRegistrationTermsScreen apmRegistrationTermsScreen = this.f158274b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ApmRegistrationTermsScreen.T;
                        return apmRegistrationTermsScreen.d3().d;
                    case 1:
                        KProperty[] kPropertyArr2 = ApmRegistrationTermsScreen.T;
                        ApmRegistrationTermsScreen apmRegistrationTermsScreen2 = this.f158274b;
                        return dli.f.a(apmRegistrationTermsScreen2, apmRegistrationTermsScreen2.d(), v.k(new FullScreenDocumentLoadingDelegate(), (WebViewDelegate) apmRegistrationTermsScreen2.O.getValue()), R$id.apmRegistrationTerms_recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = ApmRegistrationTermsScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(apmRegistrationTermsScreen.m2()).a().get(p12.v.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", p12.v.class, " is not found"));
                        }
                        p12.v vVar = ((p12.v) aVar2.b()).K;
                        ApmRegistrationTerms$InputData apmRegistrationTerms$InputData = apmRegistrationTermsScreen.K;
                        apmRegistrationTerms$InputData.getClass();
                        return new g0(vVar, apmRegistrationTerms$InputData);
                    default:
                        KProperty[] kPropertyArr4 = ApmRegistrationTermsScreen.T;
                        return (l) ((g0) apmRegistrationTermsScreen.R.getValue()).f231673c.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: i42.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ApmRegistrationTermsScreen f158274b;

            {
                this.f158274b = this;
            }

            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ApmRegistrationTermsScreen apmRegistrationTermsScreen = this.f158274b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ApmRegistrationTermsScreen.T;
                        return apmRegistrationTermsScreen.d3().d;
                    case 1:
                        KProperty[] kPropertyArr2 = ApmRegistrationTermsScreen.T;
                        ApmRegistrationTermsScreen apmRegistrationTermsScreen2 = this.f158274b;
                        return dli.f.a(apmRegistrationTermsScreen2, apmRegistrationTermsScreen2.d(), v.k(new FullScreenDocumentLoadingDelegate(), (WebViewDelegate) apmRegistrationTermsScreen2.O.getValue()), R$id.apmRegistrationTerms_recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = ApmRegistrationTermsScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(apmRegistrationTermsScreen.m2()).a().get(p12.v.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", p12.v.class, " is not found"));
                        }
                        p12.v vVar = ((p12.v) aVar2.b()).K;
                        ApmRegistrationTerms$InputData apmRegistrationTerms$InputData = apmRegistrationTermsScreen.K;
                        apmRegistrationTerms$InputData.getClass();
                        return new g0(vVar, apmRegistrationTerms$InputData);
                    default:
                        KProperty[] kPropertyArr4 = ApmRegistrationTermsScreen.T;
                        return (l) ((g0) apmRegistrationTermsScreen.R.getValue()).f231673c.get();
                }
            }
        });
        final int i5 = 3;
        this.S = w.y0(new Function0(this) { // from class: i42.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ApmRegistrationTermsScreen f158274b;

            {
                this.f158274b = this;
            }

            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                ApmRegistrationTermsScreen apmRegistrationTermsScreen = this.f158274b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ApmRegistrationTermsScreen.T;
                        return apmRegistrationTermsScreen.d3().d;
                    case 1:
                        KProperty[] kPropertyArr2 = ApmRegistrationTermsScreen.T;
                        ApmRegistrationTermsScreen apmRegistrationTermsScreen2 = this.f158274b;
                        return dli.f.a(apmRegistrationTermsScreen2, apmRegistrationTermsScreen2.d(), v.k(new FullScreenDocumentLoadingDelegate(), (WebViewDelegate) apmRegistrationTermsScreen2.O.getValue()), R$id.apmRegistrationTerms_recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = ApmRegistrationTermsScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(apmRegistrationTermsScreen.m2()).a().get(p12.v.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", p12.v.class, " is not found"));
                        }
                        p12.v vVar = ((p12.v) aVar2.b()).K;
                        ApmRegistrationTerms$InputData apmRegistrationTerms$InputData = apmRegistrationTermsScreen.K;
                        apmRegistrationTerms$InputData.getClass();
                        return new g0(vVar, apmRegistrationTerms$InputData);
                    default:
                        KProperty[] kPropertyArr4 = ApmRegistrationTermsScreen.T;
                        return (l) ((g0) apmRegistrationTermsScreen.R.getValue()).f231673c.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(o oVar, q qVar) {
        e uiState = (e) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        File file = uiState.f158271b;
        if (file != null) {
            f3(true);
            ((PdfView) this.P.getValue()).a(new g(this, 0)).d(file);
        } else {
            f3(false);
        }
        d3().f201196b.L(uiState.f158272c);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        d().C2(c12.h0.f20333a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (g0) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f201197c;
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        ApmRegistrationTerms$InputData apmRegistrationTerms$InputData = this.K;
        navBarWithToolbar.setToolbarTitle(apmRegistrationTerms$InputData.f62273b);
        navBarWithToolbar.setTitle(apmRegistrationTerms$InputData.f62273b, null);
        navBarWithToolbar.setDescriptionText(apmRegistrationTerms$InputData.f62274c);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        LargeActionButton largeActionButton = d3().f201196b;
        largeActionButton.setText(apmRegistrationTerms$InputData.d);
        largeActionButton.L(true);
        largeActionButton.setTag("REG_TERMS_CTA_BUTTON_TAG");
        d3().e.setTag(com.revolut.core.ui_kit.R$id.uikit_main_scrollable_view, "MAIN_SCROLLABLE_TAG");
    }

    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f201197c.f59410q), null, new i(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f201196b.o), null, new i(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((WebViewDelegate) this.O.getValue()).f53637c), null, new d(this, (Continuation) null, 9), 3);
    }

    public final c d3() {
        ViewBinding value = this.N.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (c) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final l d() {
        return (l) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    public final void f3(boolean z) {
        ScreenContentRecyclerView apmRegistrationTermsRecyclerView = d3().e;
        Intrinsics.checkNotNullExpressionValue(apmRegistrationTermsRecyclerView, "apmRegistrationTermsRecyclerView");
        apmRegistrationTermsRecyclerView.setVisibility(!z ? 0 : 8);
        ((PdfView) this.P.getValue()).setVisibility(z ? 0 : 8);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.M);
    }
}
