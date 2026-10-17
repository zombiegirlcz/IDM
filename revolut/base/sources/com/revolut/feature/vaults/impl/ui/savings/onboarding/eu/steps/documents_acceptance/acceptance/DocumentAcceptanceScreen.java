package com.revolut.feature.vaults.impl.ui.savings.onboarding.eu.steps.documents_acceptance.acceptance;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.o9;
import com.onfido.android.sdk.capture.ui.userconsent.c;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.WebViewDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.vaults.R$string;
import com.revolut.feature.vaults.impl.R$id;
import com.revolut.feature.vaults.impl.R$layout;
import com.revolut.feature.vaults.impl.ui.savings.onboarding.eu.steps.documents_acceptance.acceptance.DocumentAcceptanceScreen;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.kompot.common.rx_navigable.screen.BaseRxRecyclerViewScreen;
import cq6.k;
import crg.d;
import crg.f;
import crg.g;
import efm.r;
import frl.a;
import grl.k9;
import java.util.List;
import jki.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import sji.b;
import te0.w;
import tx0.j0;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/vaults/impl/ui/savings/onboarding/eu/steps/documents_acceptance/acceptance/DocumentAcceptanceScreen;", "Lcom/revolut/kompot/common/rx_navigable/screen/BaseRxRecyclerViewScreen;", "Lcrg/g;", "Lcom/revolut/kompot/common/IOData$Input;", "Lcrg/f;", "Lno/m;", "feature_vaults_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DocumentAcceptanceScreen extends BaseRxRecyclerViewScreen<g, IOData$Input, f> implements m {
    public static final /* synthetic */ KProperty[] i0 = {o0.f186429a.j(new h0(DocumentAcceptanceScreen.class, "binding", "getBinding()Lcom/revolut/feature/vaults/impl/databinding/ScreenDocumentReviewBinding;", 0))};
    public final AnalyticsProduct.Retail X;
    public final h Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f94791a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final WebViewDelegate f94792b0;
    public final List c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f94793d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Object f94794e0;
    public final int f0;
    public final int g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final boolean f94795h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DocumentAcceptanceScreen(DocumentAcceptanceScreenContract$Input input) {
        super(input);
        Intrinsics.checkNotNullParameter(input, "input");
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = a.f137499j;
        this.X = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
        this.Y = s.t(this, d.f);
        final int i = 0;
        this.Z = w.y0(new Function0(this) { // from class: crg.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DocumentAcceptanceScreen f108378b;

            {
                this.f108378b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                DocumentAcceptanceScreen documentAcceptanceScreen = this.f108378b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = DocumentAcceptanceScreen.i0;
                        TwinVerticalButton documentReviewButton = documentAcceptanceScreen.i3().f273368b;
                        Intrinsics.checkNotNullExpressionValue(documentReviewButton, "documentReviewButton");
                        return documentReviewButton;
                    case 1:
                        KProperty[] kPropertyArr2 = DocumentAcceptanceScreen.i0;
                        NavBarWithToolbar documentReviewNavBar = documentAcceptanceScreen.i3().f273369c;
                        Intrinsics.checkNotNullExpressionValue(documentReviewNavBar, "documentReviewNavBar");
                        return documentReviewNavBar;
                    default:
                        KProperty[] kPropertyArr3 = DocumentAcceptanceScreen.i0;
                        return (h) ((wpg.f) documentAcceptanceScreen.f94793d0.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.f94791a0 = w.y0(new Function0(this) { // from class: crg.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DocumentAcceptanceScreen f108378b;

            {
                this.f108378b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                DocumentAcceptanceScreen documentAcceptanceScreen = this.f108378b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DocumentAcceptanceScreen.i0;
                        TwinVerticalButton documentReviewButton = documentAcceptanceScreen.i3().f273368b;
                        Intrinsics.checkNotNullExpressionValue(documentReviewButton, "documentReviewButton");
                        return documentReviewButton;
                    case 1:
                        KProperty[] kPropertyArr2 = DocumentAcceptanceScreen.i0;
                        NavBarWithToolbar documentReviewNavBar = documentAcceptanceScreen.i3().f273369c;
                        Intrinsics.checkNotNullExpressionValue(documentReviewNavBar, "documentReviewNavBar");
                        return documentReviewNavBar;
                    default:
                        KProperty[] kPropertyArr3 = DocumentAcceptanceScreen.i0;
                        return (h) ((wpg.f) documentAcceptanceScreen.f94793d0.getValue()).d.get();
                }
            }
        });
        WebViewDelegate webViewDelegate = new WebViewDelegate();
        this.f94792b0 = webViewDelegate;
        final int i3 = 2;
        this.c0 = v.k(webViewDelegate, new ListSubheaderDelegate());
        this.f94793d0 = w.y0(new cf6.a(this, input, 23));
        this.f94794e0 = w.y0(new Function0(this) { // from class: crg.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DocumentAcceptanceScreen f108378b;

            {
                this.f108378b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                DocumentAcceptanceScreen documentAcceptanceScreen = this.f108378b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DocumentAcceptanceScreen.i0;
                        TwinVerticalButton documentReviewButton = documentAcceptanceScreen.i3().f273368b;
                        Intrinsics.checkNotNullExpressionValue(documentReviewButton, "documentReviewButton");
                        return documentReviewButton;
                    case 1:
                        KProperty[] kPropertyArr2 = DocumentAcceptanceScreen.i0;
                        NavBarWithToolbar documentReviewNavBar = documentAcceptanceScreen.i3().f273369c;
                        Intrinsics.checkNotNullExpressionValue(documentReviewNavBar, "documentReviewNavBar");
                        return documentReviewNavBar;
                    default:
                        KProperty[] kPropertyArr3 = DocumentAcceptanceScreen.i0;
                        return (h) ((wpg.f) documentAcceptanceScreen.f94793d0.getValue()).d.get();
                }
            }
        });
        this.f0 = R$layout.screen_document_review;
        this.g0 = R$id.documentReview_recyclerView;
        this.f94795h0 = true;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getF82762b0() {
        return this.X;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (wpg.f) this.f94793d0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (crg.h) this.f94794e0.getValue();
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        r rVarFilter = this.f94792b0.f53637c.filter(new c(new com.revolut.feature.alipay_plus.mpm.webcontainer.a(29), 23));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        final int i = 0;
        BaseRxRecyclerViewScreen.g3(this, rVarFilter, new Function1(this) { // from class: crg.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DocumentAcceptanceScreen f108380b;

            {
                this.f108380b = this;
            }

            /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i2 = i;
                DocumentAcceptanceScreen documentAcceptanceScreen = this.f108380b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = DocumentAcceptanceScreen.i0;
                        documentAcceptanceScreen.i3().f273368b.setMainButtonEnabled(true);
                        break;
                    case 1:
                        Unit it8 = (Unit) obj2;
                        KProperty[] kPropertyArr2 = DocumentAcceptanceScreen.i0;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        ((h) documentAcceptanceScreen.f94794e0.getValue()).u2();
                        break;
                    case 2:
                        Unit it9 = (Unit) obj2;
                        KProperty[] kPropertyArr3 = DocumentAcceptanceScreen.i0;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        documentAcceptanceScreen.i3().f273369c.setExpanded(false, true);
                        documentAcceptanceScreen.h().smoothScrollToPosition(documentAcceptanceScreen.d3().getItemCount() - 1);
                        break;
                    default:
                        Unit it10 = (Unit) obj2;
                        KProperty[] kPropertyArr4 = DocumentAcceptanceScreen.i0;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        h hVar = (h) documentAcceptanceScreen.f94794e0.getValue();
                        hVar.getClass();
                        hVar.l2(new k(hVar, null, 1), new yi5.b(26));
                        break;
                }
                return Unit.f186387a;
            }
        });
        final int i2 = 1;
        BaseRxRecyclerViewScreen.g3(this, ((NavBarWithToolbar) this.f94791a0.getValue()).f59410q, new Function1(this) { // from class: crg.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DocumentAcceptanceScreen f108380b;

            {
                this.f108380b = this;
            }

            /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i22 = i2;
                DocumentAcceptanceScreen documentAcceptanceScreen = this.f108380b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DocumentAcceptanceScreen.i0;
                        documentAcceptanceScreen.i3().f273368b.setMainButtonEnabled(true);
                        break;
                    case 1:
                        Unit it8 = (Unit) obj2;
                        KProperty[] kPropertyArr2 = DocumentAcceptanceScreen.i0;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        ((h) documentAcceptanceScreen.f94794e0.getValue()).u2();
                        break;
                    case 2:
                        Unit it9 = (Unit) obj2;
                        KProperty[] kPropertyArr3 = DocumentAcceptanceScreen.i0;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        documentAcceptanceScreen.i3().f273369c.setExpanded(false, true);
                        documentAcceptanceScreen.h().smoothScrollToPosition(documentAcceptanceScreen.d3().getItemCount() - 1);
                        break;
                    default:
                        Unit it10 = (Unit) obj2;
                        KProperty[] kPropertyArr4 = DocumentAcceptanceScreen.i0;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        h hVar = (h) documentAcceptanceScreen.f94794e0.getValue();
                        hVar.getClass();
                        hVar.l2(new k(hVar, null, 1), new yi5.b(26));
                        break;
                }
                return Unit.f186387a;
            }
        });
        TwinVerticalButton twinVerticalButton = (TwinVerticalButton) this.Z.getValue();
        final int i3 = 2;
        BaseRxRecyclerViewScreen.g3(this, twinVerticalButton.m0(), new Function1(this) { // from class: crg.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DocumentAcceptanceScreen f108380b;

            {
                this.f108380b = this;
            }

            /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i22 = i3;
                DocumentAcceptanceScreen documentAcceptanceScreen = this.f108380b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DocumentAcceptanceScreen.i0;
                        documentAcceptanceScreen.i3().f273368b.setMainButtonEnabled(true);
                        break;
                    case 1:
                        Unit it8 = (Unit) obj2;
                        KProperty[] kPropertyArr2 = DocumentAcceptanceScreen.i0;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        ((h) documentAcceptanceScreen.f94794e0.getValue()).u2();
                        break;
                    case 2:
                        Unit it9 = (Unit) obj2;
                        KProperty[] kPropertyArr3 = DocumentAcceptanceScreen.i0;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        documentAcceptanceScreen.i3().f273369c.setExpanded(false, true);
                        documentAcceptanceScreen.h().smoothScrollToPosition(documentAcceptanceScreen.d3().getItemCount() - 1);
                        break;
                    default:
                        Unit it10 = (Unit) obj2;
                        KProperty[] kPropertyArr4 = DocumentAcceptanceScreen.i0;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        h hVar = (h) documentAcceptanceScreen.f94794e0.getValue();
                        hVar.getClass();
                        hVar.l2(new k(hVar, null, 1), new yi5.b(26));
                        break;
                }
                return Unit.f186387a;
            }
        });
        final int i5 = 3;
        BaseRxRecyclerViewScreen.g3(this, twinVerticalButton.o0(), new Function1(this) { // from class: crg.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DocumentAcceptanceScreen f108380b;

            {
                this.f108380b = this;
            }

            /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i22 = i5;
                DocumentAcceptanceScreen documentAcceptanceScreen = this.f108380b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DocumentAcceptanceScreen.i0;
                        documentAcceptanceScreen.i3().f273368b.setMainButtonEnabled(true);
                        break;
                    case 1:
                        Unit it8 = (Unit) obj2;
                        KProperty[] kPropertyArr2 = DocumentAcceptanceScreen.i0;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        ((h) documentAcceptanceScreen.f94794e0.getValue()).u2();
                        break;
                    case 2:
                        Unit it9 = (Unit) obj2;
                        KProperty[] kPropertyArr3 = DocumentAcceptanceScreen.i0;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        documentAcceptanceScreen.i3().f273369c.setExpanded(false, true);
                        documentAcceptanceScreen.h().smoothScrollToPosition(documentAcceptanceScreen.d3().getItemCount() - 1);
                        break;
                    default:
                        Unit it10 = (Unit) obj2;
                        KProperty[] kPropertyArr4 = DocumentAcceptanceScreen.i0;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        h hVar = (h) documentAcceptanceScreen.f94794e0.getValue();
                        hVar.getClass();
                        hVar.l2(new k(hVar, null, 1), new yi5.b(26));
                        break;
                }
                return Unit.f186387a;
            }
        });
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) this.f94791a0.getValue();
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        TwinVerticalButton twinVerticalButton = (TwinVerticalButton) this.Z.getValue();
        twinVerticalButton.setCollapsible(true);
        twinVerticalButton.setFabImage(new ResourceImage(R$drawable.uikit_icn_24_arrow_thin_down, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246));
        twinVerticalButton.setSecondaryButtonVisible(false);
        twinVerticalButton.setMainButtonVisible(true);
        twinVerticalButton.setMainButtonText(new TextLocalisedClause(R$string.vaults_common_action_i_agree, null, null, 14));
        twinVerticalButton.setMainButtonEnabled(false);
        h().setTag(com.revolut.core.ui_kit.R$id.uikit_main_scrollable_view, "MAIN_SCROLLABLE_TAG");
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getC0() {
        return this.c0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getG0() {
        return this.g0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.f0;
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: h3, reason: merged with bridge method [inline-methods] */
    public final void Z2(g uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) this.f94791a0.getValue();
        navBarWithToolbar.setToolbarTitle(new TextClause(uiState.f108384b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        navBarWithToolbar.setTitle(new TextClause(uiState.f108384b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null);
    }

    public final tpg.b i3() {
        ViewBinding value = this.Y.getValue(this, i0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (tpg.b) value;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.f94795h0);
    }
}
