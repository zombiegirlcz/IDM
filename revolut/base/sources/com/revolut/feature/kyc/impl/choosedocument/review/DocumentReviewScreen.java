package com.revolut.feature.kyc.impl.choosedocument.review;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.SimpleMediaDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.kyc.api.R$string;
import com.revolut.feature.kyc.impl.R$id;
import com.revolut.feature.kyc.impl.R$layout;
import com.revolut.feature.kyc.impl.choosedocument.review.DocumentReviewScreen;
import com.revolut.feature.kyc.impl.choosedocument.review.DocumentReviewScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mu8.b;
import mu8.c;
import mu8.e;
import mu8.g;
import no.m;
import te0.w;
import vc.s;
import zhm.v;
import zu8.c0;
import zu8.g0;
import zu8.i;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/kyc/impl/choosedocument/review/DocumentReviewScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lmu8/e;", "Ldli/a;", "Lmu8/g;", "Lno/m;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DocumentReviewScreen extends ViewController<e> implements a, m {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(DocumentReviewScreen.class, "binding", "getBinding()Lcom/revolut/feature/kyc/impl/databinding/DocumentReviewScreenBinding;", 0))};
    public final DocumentReviewScreenContract$InputData K;
    public final AnalyticsProduct L;
    public final int M;
    public final h N;
    public final boolean O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public DocumentReviewScreen(DocumentReviewScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = inputData.d;
        this.M = R$layout.document_review_screen;
        this.N = s.t(this, b.f);
        this.O = true;
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: mu8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DocumentReviewScreen f209002b;

            {
                this.f209002b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                DocumentReviewScreen documentReviewScreen = this.f209002b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = DocumentReviewScreen.S;
                        qji.b bVarU2 = documentReviewScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.kyc.impl.choosedocument.review.di.DocumentReviewScreenComponent.Injector");
                        g0 g0Var = (g0) bVarU2;
                        c0 c0Var = g0Var.f325277b;
                        g0 g0Var2 = g0Var.f325278c;
                        DocumentReviewScreenContract$InputData documentReviewScreenContract$InputData = documentReviewScreen.K;
                        documentReviewScreenContract$InputData.getClass();
                        return new zu8.i(c0Var, g0Var2, documentReviewScreen, documentReviewScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = DocumentReviewScreen.S;
                        return (h) ((zu8.i) documentReviewScreen.P.getValue()).o.get();
                    default:
                        KProperty[] kPropertyArr3 = DocumentReviewScreen.S;
                        DocumentReviewScreen documentReviewScreen2 = this.f209002b;
                        return dli.f.a(documentReviewScreen2, (h) documentReviewScreen2.Q.getValue(), v.k(new SimpleMediaDelegate(), new PlainTextWarningDelegate()), R$id.documentReviewScreen_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: mu8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DocumentReviewScreen f209002b;

            {
                this.f209002b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                DocumentReviewScreen documentReviewScreen = this.f209002b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DocumentReviewScreen.S;
                        qji.b bVarU2 = documentReviewScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.kyc.impl.choosedocument.review.di.DocumentReviewScreenComponent.Injector");
                        g0 g0Var = (g0) bVarU2;
                        c0 c0Var = g0Var.f325277b;
                        g0 g0Var2 = g0Var.f325278c;
                        DocumentReviewScreenContract$InputData documentReviewScreenContract$InputData = documentReviewScreen.K;
                        documentReviewScreenContract$InputData.getClass();
                        return new zu8.i(c0Var, g0Var2, documentReviewScreen, documentReviewScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = DocumentReviewScreen.S;
                        return (h) ((zu8.i) documentReviewScreen.P.getValue()).o.get();
                    default:
                        KProperty[] kPropertyArr3 = DocumentReviewScreen.S;
                        DocumentReviewScreen documentReviewScreen2 = this.f209002b;
                        return dli.f.a(documentReviewScreen2, (h) documentReviewScreen2.Q.getValue(), v.k(new SimpleMediaDelegate(), new PlainTextWarningDelegate()), R$id.documentReviewScreen_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: mu8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DocumentReviewScreen f209002b;

            {
                this.f209002b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                DocumentReviewScreen documentReviewScreen = this.f209002b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DocumentReviewScreen.S;
                        qji.b bVarU2 = documentReviewScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.kyc.impl.choosedocument.review.di.DocumentReviewScreenComponent.Injector");
                        g0 g0Var = (g0) bVarU2;
                        c0 c0Var = g0Var.f325277b;
                        g0 g0Var2 = g0Var.f325278c;
                        DocumentReviewScreenContract$InputData documentReviewScreenContract$InputData = documentReviewScreen.K;
                        documentReviewScreenContract$InputData.getClass();
                        return new zu8.i(c0Var, g0Var2, documentReviewScreen, documentReviewScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = DocumentReviewScreen.S;
                        return (h) ((zu8.i) documentReviewScreen.P.getValue()).o.get();
                    default:
                        KProperty[] kPropertyArr3 = DocumentReviewScreen.S;
                        DocumentReviewScreen documentReviewScreen2 = this.f209002b;
                        return dli.f.a(documentReviewScreen2, (h) documentReviewScreen2.Q.getValue(), v.k(new SimpleMediaDelegate(), new PlainTextWarningDelegate()), R$id.documentReviewScreen_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((g) oVar);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getP() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (i) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (mu8.h) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f300076b;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.kyc_document_review_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.kyc_document_review_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        TwinVerticalButton twinVerticalButton = d3().f300077c;
        twinVerticalButton.setSecondaryButtonVisible(false);
        twinVerticalButton.setMainButtonVisible(true);
        twinVerticalButton.setSecondaryButtonVisible(true);
        twinVerticalButton.setMainButtonText(new TextLocalisedClause(R$string.kyc_document_review_button_submit, null, null, 14));
        twinVerticalButton.setMainButtonIcon(new ResourceImage(R$drawable.uikit_icn_24_check, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246));
        twinVerticalButton.setSecondaryButtonText(new TextLocalisedClause(R$string.kyc_document_review_button_retake, null, null, 14));
        twinVerticalButton.setSecondaryButtonStyle(LargeActionButton.ButtonStyle.f58726b);
        twinVerticalButton.setSecondaryButtonImage(new ResourceImage(R$drawable.uikit_icn_24_retry, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f300076b.f59410q), new c(this, null, 0), 3);
        TwinVerticalButton twinVerticalButton = d3().f300077c;
        ViewController.P2(this, rd0.e.b(twinVerticalButton.o0()), new c(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(twinVerticalButton.p0()), new c(this, null, 2), 3);
    }

    public final wu8.a d3() {
        ViewBinding value = this.N.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (wu8.a) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getR() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.O);
    }
}
