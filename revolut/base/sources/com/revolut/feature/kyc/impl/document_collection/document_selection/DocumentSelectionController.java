package com.revolut.feature.kyc.impl.document_collection.document_selection;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import av8.b;
import av8.c;
import av8.d;
import av8.f;
import av8.k;
import av8.l;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.feature.kyc.impl.document_collection.document_selection.DocumentSelectionController;
import com.revolut.feature.kyc.impl.document_collection.document_selection.DocumentSelectionControllerContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.common.ui.R$string;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import org.jetbrains.annotations.NotNull;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.v;
import zu8.c0;
import zu8.j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005:\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/kyc/impl/document_collection/document_selection/DocumentSelectionController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lav8/k;", "Ldli/a;", "Lav8/m;", "Lno/m;", "Companion", "a", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DocumentSelectionController extends ViewController<k> implements dli.a, m {
    public final DocumentSelectionControllerContract$InputData K;
    public final h L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final int P;
    public final Object Q;
    public final AnalyticsProduct R;
    public final Object S;
    public final Object T;
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(DocumentSelectionController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.kyc.impl.document_collection.document_selection.DocumentSelectionController$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public DocumentSelectionController(DocumentSelectionControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        this.M = w.y0(new ar0.b(27));
        this.N = w.y0(new ar0.b(28));
        this.O = w.y0(new ar0.b(29));
        this.P = R$layout.screen_recycler_navbar_nextbutton;
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: av8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DocumentSelectionController f9945b;

            {
                this.f9945b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                DocumentSelectionController documentSelectionController = this.f9945b;
                switch (i2) {
                    case 0:
                        DocumentSelectionController.Companion companion = DocumentSelectionController.INSTANCE;
                        return (l) ((zu8.j) documentSelectionController.S.getValue()).f325299c.get();
                    case 1:
                        DocumentSelectionController.Companion companion2 = DocumentSelectionController.INSTANCE;
                        qji.b bVarU2 = documentSelectionController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.kyc.impl.document_collection.document_selection.di.DocumentSelectionControllerInjector");
                        zu8.h hVar = (zu8.h) bVarU2;
                        c0 c0Var = hVar.f325280b;
                        zu8.h hVar2 = hVar.f325281c;
                        DocumentSelectionControllerContract$InputData documentSelectionControllerContract$InputData = documentSelectionController.K;
                        documentSelectionControllerContract$InputData.getClass();
                        return new zu8.j(c0Var, hVar2, documentSelectionControllerContract$InputData);
                    default:
                        DocumentSelectionController.Companion companion3 = DocumentSelectionController.INSTANCE;
                        DocumentSelectionController documentSelectionController2 = this.f9945b;
                        return dli.f.a(documentSelectionController2, documentSelectionController2.R2(), v.k((InputTextDelegate) documentSelectionController2.M.getValue(), new ListSubheaderDelegate(), new RowLoadingDelegate(), (FullScreenStateDelegate) documentSelectionController2.O.getValue(), (SelectableDelegate) documentSelectionController2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.R = inputData.f77622h;
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: av8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DocumentSelectionController f9945b;

            {
                this.f9945b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                DocumentSelectionController documentSelectionController = this.f9945b;
                switch (i22) {
                    case 0:
                        DocumentSelectionController.Companion companion = DocumentSelectionController.INSTANCE;
                        return (l) ((zu8.j) documentSelectionController.S.getValue()).f325299c.get();
                    case 1:
                        DocumentSelectionController.Companion companion2 = DocumentSelectionController.INSTANCE;
                        qji.b bVarU2 = documentSelectionController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.kyc.impl.document_collection.document_selection.di.DocumentSelectionControllerInjector");
                        zu8.h hVar = (zu8.h) bVarU2;
                        c0 c0Var = hVar.f325280b;
                        zu8.h hVar2 = hVar.f325281c;
                        DocumentSelectionControllerContract$InputData documentSelectionControllerContract$InputData = documentSelectionController.K;
                        documentSelectionControllerContract$InputData.getClass();
                        return new zu8.j(c0Var, hVar2, documentSelectionControllerContract$InputData);
                    default:
                        DocumentSelectionController.Companion companion3 = DocumentSelectionController.INSTANCE;
                        DocumentSelectionController documentSelectionController2 = this.f9945b;
                        return dli.f.a(documentSelectionController2, documentSelectionController2.R2(), v.k((InputTextDelegate) documentSelectionController2.M.getValue(), new ListSubheaderDelegate(), new RowLoadingDelegate(), (FullScreenStateDelegate) documentSelectionController2.O.getValue(), (SelectableDelegate) documentSelectionController2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: av8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DocumentSelectionController f9945b;

            {
                this.f9945b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                DocumentSelectionController documentSelectionController = this.f9945b;
                switch (i22) {
                    case 0:
                        DocumentSelectionController.Companion companion = DocumentSelectionController.INSTANCE;
                        return (l) ((zu8.j) documentSelectionController.S.getValue()).f325299c.get();
                    case 1:
                        DocumentSelectionController.Companion companion2 = DocumentSelectionController.INSTANCE;
                        qji.b bVarU2 = documentSelectionController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.kyc.impl.document_collection.document_selection.di.DocumentSelectionControllerInjector");
                        zu8.h hVar = (zu8.h) bVarU2;
                        c0 c0Var = hVar.f325280b;
                        zu8.h hVar2 = hVar.f325281c;
                        DocumentSelectionControllerContract$InputData documentSelectionControllerContract$InputData = documentSelectionController.K;
                        documentSelectionControllerContract$InputData.getClass();
                        return new zu8.j(c0Var, hVar2, documentSelectionControllerContract$InputData);
                    default:
                        DocumentSelectionController.Companion companion3 = DocumentSelectionController.INSTANCE;
                        DocumentSelectionController documentSelectionController2 = this.f9945b;
                        return dli.f.a(documentSelectionController2, documentSelectionController2.R2(), v.k((InputTextDelegate) documentSelectionController2.M.getValue(), new ListSubheaderDelegate(), new RowLoadingDelegate(), (FullScreenStateDelegate) documentSelectionController2.O.getValue(), (SelectableDelegate) documentSelectionController2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        av8.m uiState = (av8.m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        u uVarD3 = d3();
        NavBarWithToolbar navBarWithToolbar = uVarD3.f174565c;
        navBarWithToolbar.setTitle(uiState.f9954b, null);
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setDescriptionText(uiState.f9955c);
        LargeActionButton largeActionButton = uVarD3.f174564b;
        largeActionButton.setText(uiState.d);
        largeActionButton.setEnabled(uiState.e);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getR() {
        return this.R;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (j) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        DocumentSelectionControllerContract$InputData documentSelectionControllerContract$InputData = this.K;
        if (documentSelectionControllerContract$InputData.i != null) {
            navBarWithToolbar.setMenuItems(zhm.u.c(new TextNavBarMenuItem("HELP_MENU_ITEM_ID", new TextLocalisedClause(R$string.common_action_help, null, null, 14), null, null, 12)));
        }
        navBarWithToolbar.setNavigationButtonIcon(documentSelectionControllerContract$InputData.f77623j ? Integer.valueOf(ofm.q.k(q2())) : null);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((InputTextDelegate) this.M.getValue()).f52575g.f121375b), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((SelectableDelegate) this.N.getValue()).r()), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new av8.e(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FullScreenStateDelegate) this.O.getValue()).f52371h.f121375b), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.o.f57403b), null, new av8.e(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new av8.e(this, continuation, 2), 3);
    }

    public final u d3() {
        ViewBinding value = this.L.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final l R2() {
        return (l) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.T.getValue();
    }
}
