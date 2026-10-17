package com.revolut.feature.credit.application.plugins.impl.ui.document.pdf;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenDocumentLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.core.ui_kit.views.navbar.NavBarScrollingViewBehavior;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.R$id;
import com.revolut.feature.credit.application.plugins.impl.R$layout;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.feature.credit.application.plugins.impl.ui.document.pdf.CreditPdfDocumentController;
import com.revolut.feature.credit.application.plugins.impl.ui.document.pdf.CreditPdfDocumentControllerContract$Configuration;
import com.revolut.feature.credit.application.plugins.impl.ui.document.pdf.CreditPdfDocumentControllerContract$InputData;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.ui_kit_pdf.PdfView;
import dw3.i8;
import dw3.j8;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jmrtd.lds.LDSFile;
import te0.w;
import v94.i;
import v94.j;
import v94.k;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/document/pdf/CreditPdfDocumentController;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Lv94/j;", "Ldli/a;", "Lv94/k;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditPdfDocumentController extends PluginScreenController<j> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(CreditPdfDocumentController.class, "binding", "getBinding()Lcom/revolut/feature/credit/application/plugins/impl/databinding/ScreenCreditPdfDocumentBinding;", 0))};
    public final CreditPdfDocumentControllerContract$InputData L;
    public final int M;
    public final Object N;
    public final Object O;
    public final FullScreenStateDelegate P;
    public final Object Q;
    public final ao.h R;

    public CreditPdfDocumentController(CreditPdfDocumentControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = R$layout.screen_credit_pdf_document;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: v94.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditPdfDocumentController f286974b;

            {
                this.f286974b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CreditPdfDocumentController creditPdfDocumentController = this.f286974b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CreditPdfDocumentController.S;
                        qji.b bVarU2 = creditPdfDocumentController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.document.pdf.di.CreditPdfDocumentControllerInjector");
                        i8 i8Var = (i8) ((w94.a) bVarU2).j().mo3808a(creditPdfDocumentController);
                        CreditPdfDocumentControllerContract$InputData creditPdfDocumentControllerContract$InputData = creditPdfDocumentController.L;
                        switch (i8Var.f118988a) {
                            case 0:
                                creditPdfDocumentControllerContract$InputData.getClass();
                                i8Var.d = creditPdfDocumentControllerContract$InputData;
                                break;
                            case 1:
                                creditPdfDocumentControllerContract$InputData.getClass();
                                i8Var.d = creditPdfDocumentControllerContract$InputData;
                                break;
                            default:
                                creditPdfDocumentControllerContract$InputData.getClass();
                                i8Var.d = creditPdfDocumentControllerContract$InputData;
                                break;
                        }
                        return (j8) i8Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = CreditPdfDocumentController.S;
                        j8 j8Var = (j8) creditPdfDocumentController.N.getValue();
                        switch (j8Var.f119054a) {
                            case 0:
                                return (f) j8Var.f119058h.get();
                            case 1:
                                return (f) j8Var.f119058h.get();
                            default:
                                return (f) j8Var.f119058h.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = CreditPdfDocumentController.S;
                        CreditPdfDocumentController creditPdfDocumentController2 = this.f286974b;
                        return dli.f.a(creditPdfDocumentController2, creditPdfDocumentController2.d(), v.k(creditPdfDocumentController2.P, new FullScreenDocumentLoadingDelegate()), R$id.creditPdfDocument_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: v94.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditPdfDocumentController f286974b;

            {
                this.f286974b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CreditPdfDocumentController creditPdfDocumentController = this.f286974b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditPdfDocumentController.S;
                        qji.b bVarU2 = creditPdfDocumentController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.document.pdf.di.CreditPdfDocumentControllerInjector");
                        i8 i8Var = (i8) ((w94.a) bVarU2).j().mo3808a(creditPdfDocumentController);
                        CreditPdfDocumentControllerContract$InputData creditPdfDocumentControllerContract$InputData = creditPdfDocumentController.L;
                        switch (i8Var.f118988a) {
                            case 0:
                                creditPdfDocumentControllerContract$InputData.getClass();
                                i8Var.d = creditPdfDocumentControllerContract$InputData;
                                break;
                            case 1:
                                creditPdfDocumentControllerContract$InputData.getClass();
                                i8Var.d = creditPdfDocumentControllerContract$InputData;
                                break;
                            default:
                                creditPdfDocumentControllerContract$InputData.getClass();
                                i8Var.d = creditPdfDocumentControllerContract$InputData;
                                break;
                        }
                        return (j8) i8Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = CreditPdfDocumentController.S;
                        j8 j8Var = (j8) creditPdfDocumentController.N.getValue();
                        switch (j8Var.f119054a) {
                            case 0:
                                return (f) j8Var.f119058h.get();
                            case 1:
                                return (f) j8Var.f119058h.get();
                            default:
                                return (f) j8Var.f119058h.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = CreditPdfDocumentController.S;
                        CreditPdfDocumentController creditPdfDocumentController2 = this.f286974b;
                        return dli.f.a(creditPdfDocumentController2, creditPdfDocumentController2.d(), v.k(creditPdfDocumentController2.P, new FullScreenDocumentLoadingDelegate()), R$id.creditPdfDocument_recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = new FullScreenStateDelegate();
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: v94.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditPdfDocumentController f286974b;

            {
                this.f286974b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CreditPdfDocumentController creditPdfDocumentController = this.f286974b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditPdfDocumentController.S;
                        qji.b bVarU2 = creditPdfDocumentController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.document.pdf.di.CreditPdfDocumentControllerInjector");
                        i8 i8Var = (i8) ((w94.a) bVarU2).j().mo3808a(creditPdfDocumentController);
                        CreditPdfDocumentControllerContract$InputData creditPdfDocumentControllerContract$InputData = creditPdfDocumentController.L;
                        switch (i8Var.f118988a) {
                            case 0:
                                creditPdfDocumentControllerContract$InputData.getClass();
                                i8Var.d = creditPdfDocumentControllerContract$InputData;
                                break;
                            case 1:
                                creditPdfDocumentControllerContract$InputData.getClass();
                                i8Var.d = creditPdfDocumentControllerContract$InputData;
                                break;
                            default:
                                creditPdfDocumentControllerContract$InputData.getClass();
                                i8Var.d = creditPdfDocumentControllerContract$InputData;
                                break;
                        }
                        return (j8) i8Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = CreditPdfDocumentController.S;
                        j8 j8Var = (j8) creditPdfDocumentController.N.getValue();
                        switch (j8Var.f119054a) {
                            case 0:
                                return (f) j8Var.f119058h.get();
                            case 1:
                                return (f) j8Var.f119058h.get();
                            default:
                                return (f) j8Var.f119058h.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = CreditPdfDocumentController.S;
                        CreditPdfDocumentController creditPdfDocumentController2 = this.f286974b;
                        return dli.f.a(creditPdfDocumentController2, creditPdfDocumentController2.d(), v.k(creditPdfDocumentController2.P, new FullScreenDocumentLoadingDelegate()), R$id.creditPdfDocument_recyclerView, null, null, null, 56);
                }
            }
        });
        this.R = s.t(this, v94.c.f);
    }

    public static void f3(ViewGroup viewGroup, boolean z) {
        viewGroup.setTag(com.revolut.core.ui_kit.R$id.uikit_main_scrollable_view, z ? "MAIN_SCROLLABLE_TAG" : null);
        NavBarScrollingViewBehavior navBarScrollingViewBehavior = z ? new NavBarScrollingViewBehavior() : null;
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        Intrinsics.i(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        ((CoordinatorLayout.LayoutParams) layoutParams).setBehavior(navBarScrollingViewBehavior);
        viewGroup.setVisibility(z ? 0 : 8);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        BasicNavBar basicNavBar = d3().f10689b;
        Clause clause = uiState.f286979b;
        File file = uiState.e;
        basicNavBar.setTitle(clause);
        basicNavBar.setMenuItems(uiState.d);
        TwinVerticalButton twinVerticalButton = d3().e;
        Clause clause2 = uiState.f286980c;
        twinVerticalButton.setMainButtonText(clause2);
        twinVerticalButton.setVisibility((clause2 == null || file == null) ? 8 : 0);
        if (file == null) {
            ScreenContentRecyclerView creditPdfDocumentRecyclerView = d3().d;
            Intrinsics.checkNotNullExpressionValue(creditPdfDocumentRecyclerView, "creditPdfDocumentRecyclerView");
            f3(creditPdfDocumentRecyclerView, true);
            PdfView creditPdfDocumentPdfView = d3().f10690c;
            Intrinsics.checkNotNullExpressionValue(creditPdfDocumentPdfView, "creditPdfDocumentPdfView");
            f3(creditPdfDocumentPdfView, false);
            return;
        }
        ScreenContentRecyclerView creditPdfDocumentRecyclerView2 = d3().d;
        Intrinsics.checkNotNullExpressionValue(creditPdfDocumentRecyclerView2, "creditPdfDocumentRecyclerView");
        f3(creditPdfDocumentRecyclerView2, false);
        PdfView creditPdfDocumentPdfView2 = d3().f10690c;
        Intrinsics.checkNotNullExpressionValue(creditPdfDocumentPdfView2, "creditPdfDocumentPdfView");
        f3(creditPdfDocumentPdfView2, true);
        d3().f10690c.a(new v94.a(this, 0)).d(file);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((g) d()).C2(i.f286977a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (j8) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f10689b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        TwinVerticalButton twinVerticalButton = d3().e;
        CreditPdfDocumentControllerContract$Configuration.Button button = this.L.f67548b.f67541b;
        d dVar = button != null ? button.f67543b : null;
        int i = dVar == null ? -1 : a.f67550a[dVar.ordinal()];
        if (i == -1) {
            twinVerticalButton.setMainButtonVisible(false);
            twinVerticalButton.setSecondaryButtonVisible(false);
            return;
        }
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            twinVerticalButton.setMainButtonVisible(true);
            twinVerticalButton.setSecondaryButtonVisible(false);
            twinVerticalButton.setCollapsible(false);
            return;
        }
        twinVerticalButton.setFabImage(new ResourceImage(R$drawable.uikit_icn_24_arrow_thin_down, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorBackground), (List) null, (ImageTransformations) null, new TextLocalisedClause(R$string.credit_application_quick_scroll_action, null, null, 14), LDSFile.EF_DG4_TAG));
        twinVerticalButton.setMainButtonVisible(true);
        twinVerticalButton.setSecondaryButtonVisible(false);
        twinVerticalButton.setCollapsible(true);
        twinVerticalButton.setCollapsed(true, false);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f10689b.f59211b), new v94.e(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f10689b.f59210a.f57403b), new v94.e(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.f52371h.f121375b), null, new v94.d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().e.o0()), null, new v94.e(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().e.m0()), null, new c(this, null), 3);
    }

    public final aw3.h d3() {
        ViewBinding value = this.R.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (aw3.h) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final v94.f d() {
        return (v94.f) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
