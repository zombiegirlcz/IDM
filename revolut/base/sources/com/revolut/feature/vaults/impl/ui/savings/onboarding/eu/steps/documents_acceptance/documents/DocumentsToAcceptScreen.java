package com.revolut.feature.vaults.impl.ui.savings.onboarding.eu.steps.documents_acceptance.documents;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.vaults.R$string;
import com.revolut.feature.vaults.impl.R$id;
import com.revolut.feature.vaults.impl.R$layout;
import com.revolut.feature.vaults.impl.ui.savings.onboarding.eu.steps.documents_acceptance.documents.DocumentsToAcceptScreen;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.kompot.common.rx_navigable.screen.BaseRxRecyclerViewScreen;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dmj.b;
import dmj.e0;
import drg.e;
import drg.f;
import drg.g;
import drg.j;
import drg.l;
import grl.k9;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import no.m;
import te0.w;
import tpg.c;
import tx0.j0;
import vc.s;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/vaults/impl/ui/savings/onboarding/eu/steps/documents_acceptance/documents/DocumentsToAcceptScreen;", "Lcom/revolut/kompot/common/rx_navigable/screen/BaseRxRecyclerViewScreen;", "Ldrg/g;", "Lcom/revolut/kompot/common/IOData$Input;", "Ldrg/e;", "Lno/m;", "<init>", "()V", "feature_vaults_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DocumentsToAcceptScreen extends BaseRxRecyclerViewScreen<g, IOData$Input, e> implements m {
    public static final /* synthetic */ KProperty[] j0 = {o0.f186429a.j(new h0(DocumentsToAcceptScreen.class, "binding", "getBinding()Lcom/revolut/feature/vaults/impl/databinding/ScreenDocumentsToAcceptBinding;", 0))};
    public final AnalyticsProduct.Retail X;
    public final RowDelegate Y;
    public final FullScreenStateDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f94797a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final h f94798b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final List f94799d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Object f94800e0;
    public final Object f0;
    public final int g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final int f94801h0;
    public final boolean i0;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, c.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/vaults/impl/databinding/ScreenDocumentsToAcceptBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.documentsToAcceptScreen_navBar;
            NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
            if (navBarWithToolbar != null) {
                i = R$id.documentsToAcceptScreen_recyclerView;
                if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                    return new c((ControllerContainerCoordinatorLayout) p0, navBarWithToolbar);
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public DocumentsToAcceptScreen() {
        super(IOData$EmptyInput.f98299a);
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = frl.a.f137499j;
        this.X = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.Y = rowDelegate;
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.Z = fullScreenStateDelegate;
        this.f94797a0 = w.y0(new b(19));
        this.f94798b0 = s.t(this, a.f);
        final int i = 0;
        this.c0 = w.y0(new Function0(this) { // from class: drg.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DocumentsToAcceptScreen f117128b;

            {
                this.f117128b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                DocumentsToAcceptScreen documentsToAcceptScreen = this.f117128b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = DocumentsToAcceptScreen.j0;
                        return (j60.a) ((wpg.h) documentsToAcceptScreen.f94800e0.getValue()).f299264c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = DocumentsToAcceptScreen.j0;
                        qji.b bVarQ2 = documentsToAcceptScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.vaults.impl.ui.savings.onboarding.eu.steps.documents_acceptance.di.AcceptDocumentsFlowComponent");
                        wpg.b bVar = (wpg.b) bVarQ2;
                        wpg.l lVar = bVar.f299239a;
                        wpg.b bVar2 = bVar.f299240b;
                        wpg.h hVar = new wpg.h();
                        hVar.f299262a = e4m.b.b(e4m.c.a(documentsToAcceptScreen));
                        int i3 = 0;
                        hVar.f299263b = e4m.b.b(new wpg.g(lVar, bVar2, hVar, 2, i3));
                        hVar.f299264c = e4m.b.b(new wpg.g(lVar, bVar2, hVar, 1, i3));
                        hVar.d = e4m.b.b(new wpg.g(lVar, bVar2, hVar, 0, i3));
                        hVar.e = e4m.b.b(new wpg.g(lVar, bVar2, hVar, 4, i3));
                        hVar.f = e4m.b.b(new wpg.g(lVar, bVar2, hVar, 5, i3));
                        hVar.f299265g = e4m.b.b(new wpg.g(lVar, bVar2, hVar, 3, i3));
                        return hVar;
                    default:
                        KProperty[] kPropertyArr3 = DocumentsToAcceptScreen.j0;
                        return (f) ((wpg.h) documentsToAcceptScreen.f94800e0.getValue()).f299265g.get();
                }
            }
        });
        final int i2 = 1;
        final int i3 = 2;
        this.f94799d0 = v.k(new RowLoadingDelegate(), rowDelegate, fullScreenStateDelegate);
        this.f94800e0 = w.y0(new Function0(this) { // from class: drg.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DocumentsToAcceptScreen f117128b;

            {
                this.f117128b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                DocumentsToAcceptScreen documentsToAcceptScreen = this.f117128b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DocumentsToAcceptScreen.j0;
                        return (j60.a) ((wpg.h) documentsToAcceptScreen.f94800e0.getValue()).f299264c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = DocumentsToAcceptScreen.j0;
                        qji.b bVarQ2 = documentsToAcceptScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.vaults.impl.ui.savings.onboarding.eu.steps.documents_acceptance.di.AcceptDocumentsFlowComponent");
                        wpg.b bVar = (wpg.b) bVarQ2;
                        wpg.l lVar = bVar.f299239a;
                        wpg.b bVar2 = bVar.f299240b;
                        wpg.h hVar = new wpg.h();
                        hVar.f299262a = e4m.b.b(e4m.c.a(documentsToAcceptScreen));
                        int i32 = 0;
                        hVar.f299263b = e4m.b.b(new wpg.g(lVar, bVar2, hVar, 2, i32));
                        hVar.f299264c = e4m.b.b(new wpg.g(lVar, bVar2, hVar, 1, i32));
                        hVar.d = e4m.b.b(new wpg.g(lVar, bVar2, hVar, 0, i32));
                        hVar.e = e4m.b.b(new wpg.g(lVar, bVar2, hVar, 4, i32));
                        hVar.f = e4m.b.b(new wpg.g(lVar, bVar2, hVar, 5, i32));
                        hVar.f299265g = e4m.b.b(new wpg.g(lVar, bVar2, hVar, 3, i32));
                        return hVar;
                    default:
                        KProperty[] kPropertyArr3 = DocumentsToAcceptScreen.j0;
                        return (f) ((wpg.h) documentsToAcceptScreen.f94800e0.getValue()).f299265g.get();
                }
            }
        });
        this.f0 = w.y0(new Function0(this) { // from class: drg.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DocumentsToAcceptScreen f117128b;

            {
                this.f117128b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                DocumentsToAcceptScreen documentsToAcceptScreen = this.f117128b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DocumentsToAcceptScreen.j0;
                        return (j60.a) ((wpg.h) documentsToAcceptScreen.f94800e0.getValue()).f299264c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = DocumentsToAcceptScreen.j0;
                        qji.b bVarQ2 = documentsToAcceptScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.vaults.impl.ui.savings.onboarding.eu.steps.documents_acceptance.di.AcceptDocumentsFlowComponent");
                        wpg.b bVar = (wpg.b) bVarQ2;
                        wpg.l lVar = bVar.f299239a;
                        wpg.b bVar2 = bVar.f299240b;
                        wpg.h hVar = new wpg.h();
                        hVar.f299262a = e4m.b.b(e4m.c.a(documentsToAcceptScreen));
                        int i32 = 0;
                        hVar.f299263b = e4m.b.b(new wpg.g(lVar, bVar2, hVar, 2, i32));
                        hVar.f299264c = e4m.b.b(new wpg.g(lVar, bVar2, hVar, 1, i32));
                        hVar.d = e4m.b.b(new wpg.g(lVar, bVar2, hVar, 0, i32));
                        hVar.e = e4m.b.b(new wpg.g(lVar, bVar2, hVar, 4, i32));
                        hVar.f = e4m.b.b(new wpg.g(lVar, bVar2, hVar, 5, i32));
                        hVar.f299265g = e4m.b.b(new wpg.g(lVar, bVar2, hVar, 3, i32));
                        return hVar;
                    default:
                        KProperty[] kPropertyArr3 = DocumentsToAcceptScreen.j0;
                        return (f) ((wpg.h) documentsToAcceptScreen.f94800e0.getValue()).f299265g.get();
                }
            }
        });
        this.g0 = R$layout.screen_documents_to_accept;
        this.f94801h0 = R$id.documentsToAcceptScreen_recyclerView;
        this.i0 = true;
    }

    @Override // com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((l) T2()).C2();
        return true;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getF82762b0() {
        return this.X;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (wpg.h) this.f94800e0.getValue();
    }

    /* JADX WARN: Type inference failed for: r10v13, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        ViewBinding value = this.f94798b0.getValue(this, j0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        BaseRxRecyclerViewScreen.g3(this, ((c) value).f273371b.f59410q, new e0(this, 21));
        BaseRxRecyclerViewScreen.g3(this, w.a0(this.Y.f53218h, new dmj.a(27)), new dkm.a(1, T2(), f.class, "onRowClicked", "onRowClicked(Lcom/revolut/feature/vaults/common/SavingsDocumentToAccept;)V", 0, 6));
        BaseRxRecyclerViewScreen.g3(this, this.Z.f52371h.f121375b, new j(1, 0, f.class, T2(), "onRetryButtonClick", "onRetryButtonClick(Lcom/revolut/core/ui_kit/delegates/FullScreenStateDelegate$Model;)V"));
        ?? r102 = this.f94797a0;
        BaseRxRecyclerViewScreen.g3(this, ((TwinHorizontalButtonDelegate) r102.getValue()).f53572c.f121375b, new dkm.a(1, T2(), f.class, "onPrimaryButtonClicks", "onPrimaryButtonClicks(Lcom/revolut/core/ui_kit/delegates/TwinHorizontalButtonDelegate$Model;)V", 0, 7));
        BaseRxRecyclerViewScreen.g3(this, ((TwinHorizontalButtonDelegate) r102.getValue()).d.f121375b, new dkm.a(1, T2(), f.class, "onSecondaryButtonClicks", "onSecondaryButtonClicks(Lcom/revolut/core/ui_kit/delegates/TwinHorizontalButtonDelegate$Model;)V", 0, 8));
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ViewBinding value = this.f94798b0.getValue(this, j0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((c) value).f273371b;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.vaults_document_reacceptance_document_list_screen_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.vaults_document_reacceptance_document_list_screen_title, null, null, 14), null);
        navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.vaults_document_reacceptance_document_list_screen_subtitle, null, null, 14));
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        ((j60.a) this.c0.getValue()).d(u.c((TwinHorizontalButtonDelegate) this.f94797a0.getValue()));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF94799d0() {
        return this.f94799d0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getF94801h0() {
        return this.f94801h0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getG0() {
        return this.g0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: h3, reason: merged with bridge method [inline-methods] */
    public final f T2() {
        return (f) this.f0.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.i0);
    }
}
