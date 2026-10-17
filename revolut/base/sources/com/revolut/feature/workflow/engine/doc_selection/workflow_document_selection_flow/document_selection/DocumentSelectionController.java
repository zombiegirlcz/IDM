package com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.document_selection;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.o9;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsListDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.feature.workflow.engine.R$string;
import com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.WorkflowDocumentSelectionConfiguration;
import com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.document_selection.DocumentSelectionController;
import com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.document_selection.DocumentSelectionControllerContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import jii.x;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mth.b;
import mth.d;
import mth.f;
import mth.g;
import mth.l;
import mth.n;
import no.m;
import org.jetbrains.annotations.NotNull;
import qth.c;
import te0.w;
import tx0.j0;
import tx0.t3;
import vc.s;
import xki.e;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005:\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/workflow/engine/doc_selection/workflow_document_selection_flow/document_selection/DocumentSelectionController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lmth/l;", "Ldli/a;", "Lmth/n;", "Lno/m;", "Companion", "a", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DocumentSelectionController extends ViewController<l> implements dli.a, m {
    public final DocumentSelectionControllerContract$InputData K;
    public final h L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final int R;
    public final Object S;
    public final AnalyticsProduct T;
    public final WorkflowDocumentSelectionConfiguration.DocumentSelection U;
    public final Object V;
    public final Object W;
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new h0(DocumentSelectionController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarTwoButtonsBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.document_selection.DocumentSelectionController$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public DocumentSelectionController(DocumentSelectionControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        this.M = w.y0(new mq4.b(16));
        this.N = w.y0(new mq4.b(17));
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: mth.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DocumentSelectionController f208828b;

            {
                this.f208828b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                DocumentSelectionController documentSelectionController = this.f208828b;
                switch (i2) {
                    case 0:
                        DocumentSelectionController.Companion companion = DocumentSelectionController.INSTANCE;
                        return new SelectableDelegate((CellDetailsListDelegate) documentSelectionController.N.getValue());
                    case 1:
                        DocumentSelectionController.Companion companion2 = DocumentSelectionController.INSTANCE;
                        return (m) ((qth.c) documentSelectionController.V.getValue()).f249123c.get();
                    case 2:
                        DocumentSelectionController.Companion companion3 = DocumentSelectionController.INSTANCE;
                        qji.b bVarU2 = documentSelectionController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.document_selection.di.DocumentSelectionControllerInjector");
                        qth.h hVar = (qth.h) bVarU2;
                        qth.g gVar = hVar.f249147b;
                        qth.h hVar2 = hVar.f249148c;
                        DocumentSelectionControllerContract$InputData documentSelectionControllerContract$InputData = documentSelectionController.K;
                        documentSelectionControllerContract$InputData.getClass();
                        return new qth.c(gVar, hVar2, documentSelectionControllerContract$InputData);
                    default:
                        DocumentSelectionController.Companion companion4 = DocumentSelectionController.INSTANCE;
                        DocumentSelectionController documentSelectionController2 = this.f208828b;
                        return dli.f.a(documentSelectionController2, documentSelectionController2.R2(), v.k((InputTextDelegate) documentSelectionController2.M.getValue(), new ListSubheaderDelegate(), new RowLoadingDelegate(), (FullScreenStateDelegate) documentSelectionController2.P.getValue(), (CellDetailsListDelegate) documentSelectionController2.N.getValue(), (SelectableDelegate) documentSelectionController2.O.getValue(), (LargeActionButtonDelegate) documentSelectionController2.Q.getValue(), new ListSubheaderLoadingDelegate()), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = w.y0(new mq4.b(18));
        this.Q = w.y0(new mq4.b(19));
        this.R = R$layout.screen_recycler_navbar_two_buttons;
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: mth.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DocumentSelectionController f208828b;

            {
                this.f208828b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                DocumentSelectionController documentSelectionController = this.f208828b;
                switch (i22) {
                    case 0:
                        DocumentSelectionController.Companion companion = DocumentSelectionController.INSTANCE;
                        return new SelectableDelegate((CellDetailsListDelegate) documentSelectionController.N.getValue());
                    case 1:
                        DocumentSelectionController.Companion companion2 = DocumentSelectionController.INSTANCE;
                        return (m) ((qth.c) documentSelectionController.V.getValue()).f249123c.get();
                    case 2:
                        DocumentSelectionController.Companion companion3 = DocumentSelectionController.INSTANCE;
                        qji.b bVarU2 = documentSelectionController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.document_selection.di.DocumentSelectionControllerInjector");
                        qth.h hVar = (qth.h) bVarU2;
                        qth.g gVar = hVar.f249147b;
                        qth.h hVar2 = hVar.f249148c;
                        DocumentSelectionControllerContract$InputData documentSelectionControllerContract$InputData = documentSelectionController.K;
                        documentSelectionControllerContract$InputData.getClass();
                        return new qth.c(gVar, hVar2, documentSelectionControllerContract$InputData);
                    default:
                        DocumentSelectionController.Companion companion4 = DocumentSelectionController.INSTANCE;
                        DocumentSelectionController documentSelectionController2 = this.f208828b;
                        return dli.f.a(documentSelectionController2, documentSelectionController2.R2(), v.k((InputTextDelegate) documentSelectionController2.M.getValue(), new ListSubheaderDelegate(), new RowLoadingDelegate(), (FullScreenStateDelegate) documentSelectionController2.P.getValue(), (CellDetailsListDelegate) documentSelectionController2.N.getValue(), (SelectableDelegate) documentSelectionController2.O.getValue(), (LargeActionButtonDelegate) documentSelectionController2.Q.getValue(), new ListSubheaderLoadingDelegate()), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                }
            }
        });
        this.T = inputData.e;
        this.U = inputData.f96421a.f96392a;
        final int i3 = 2;
        this.V = w.y0(new Function0(this) { // from class: mth.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DocumentSelectionController f208828b;

            {
                this.f208828b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                DocumentSelectionController documentSelectionController = this.f208828b;
                switch (i22) {
                    case 0:
                        DocumentSelectionController.Companion companion = DocumentSelectionController.INSTANCE;
                        return new SelectableDelegate((CellDetailsListDelegate) documentSelectionController.N.getValue());
                    case 1:
                        DocumentSelectionController.Companion companion2 = DocumentSelectionController.INSTANCE;
                        return (m) ((qth.c) documentSelectionController.V.getValue()).f249123c.get();
                    case 2:
                        DocumentSelectionController.Companion companion3 = DocumentSelectionController.INSTANCE;
                        qji.b bVarU2 = documentSelectionController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.document_selection.di.DocumentSelectionControllerInjector");
                        qth.h hVar = (qth.h) bVarU2;
                        qth.g gVar = hVar.f249147b;
                        qth.h hVar2 = hVar.f249148c;
                        DocumentSelectionControllerContract$InputData documentSelectionControllerContract$InputData = documentSelectionController.K;
                        documentSelectionControllerContract$InputData.getClass();
                        return new qth.c(gVar, hVar2, documentSelectionControllerContract$InputData);
                    default:
                        DocumentSelectionController.Companion companion4 = DocumentSelectionController.INSTANCE;
                        DocumentSelectionController documentSelectionController2 = this.f208828b;
                        return dli.f.a(documentSelectionController2, documentSelectionController2.R2(), v.k((InputTextDelegate) documentSelectionController2.M.getValue(), new ListSubheaderDelegate(), new RowLoadingDelegate(), (FullScreenStateDelegate) documentSelectionController2.P.getValue(), (CellDetailsListDelegate) documentSelectionController2.N.getValue(), (SelectableDelegate) documentSelectionController2.O.getValue(), (LargeActionButtonDelegate) documentSelectionController2.Q.getValue(), new ListSubheaderLoadingDelegate()), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i5 = 3;
        this.W = w.y0(new Function0(this) { // from class: mth.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DocumentSelectionController f208828b;

            {
                this.f208828b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                DocumentSelectionController documentSelectionController = this.f208828b;
                switch (i22) {
                    case 0:
                        DocumentSelectionController.Companion companion = DocumentSelectionController.INSTANCE;
                        return new SelectableDelegate((CellDetailsListDelegate) documentSelectionController.N.getValue());
                    case 1:
                        DocumentSelectionController.Companion companion2 = DocumentSelectionController.INSTANCE;
                        return (m) ((qth.c) documentSelectionController.V.getValue()).f249123c.get();
                    case 2:
                        DocumentSelectionController.Companion companion3 = DocumentSelectionController.INSTANCE;
                        qji.b bVarU2 = documentSelectionController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.document_selection.di.DocumentSelectionControllerInjector");
                        qth.h hVar = (qth.h) bVarU2;
                        qth.g gVar = hVar.f249147b;
                        qth.h hVar2 = hVar.f249148c;
                        DocumentSelectionControllerContract$InputData documentSelectionControllerContract$InputData = documentSelectionController.K;
                        documentSelectionControllerContract$InputData.getClass();
                        return new qth.c(gVar, hVar2, documentSelectionControllerContract$InputData);
                    default:
                        DocumentSelectionController.Companion companion4 = DocumentSelectionController.INSTANCE;
                        DocumentSelectionController documentSelectionController2 = this.f208828b;
                        return dli.f.a(documentSelectionController2, documentSelectionController2.R2(), v.k((InputTextDelegate) documentSelectionController2.M.getValue(), new ListSubheaderDelegate(), new RowLoadingDelegate(), (FullScreenStateDelegate) documentSelectionController2.P.getValue(), (CellDetailsListDelegate) documentSelectionController2.N.getValue(), (SelectableDelegate) documentSelectionController2.O.getValue(), (LargeActionButtonDelegate) documentSelectionController2.Q.getValue(), new ListSubheaderLoadingDelegate()), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        n uiState = (n) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        x xVarD3 = d3();
        LargeActionButton largeActionButton = xVarD3.f174573b;
        NavBarWithToolbar screenRecyclerNavbarTwoButtonsNavBarWithToolbar = xVarD3.f174574c;
        largeActionButton.setEnabled(uiState.f208837b);
        Clause clause = uiState.f208838c;
        if (clause != null) {
            screenRecyclerNavbarTwoButtonsNavBarWithToolbar.setDescriptionText(clause);
            screenRecyclerNavbarTwoButtonsNavBarWithToolbar.l0();
        } else {
            Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsNavBarWithToolbar, "screenRecyclerNavbarTwoButtonsNavBarWithToolbar");
            t3 t3Var = t3.DEFAULT;
            NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
            screenRecyclerNavbarTwoButtonsNavBarWithToolbar.I0(t3Var, false);
        }
    }

    @Override // no.m
    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getT() {
        return this.T;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.V.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174574c;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        int i = R$string.workflow_document_selection_documents_title;
        WorkflowDocumentSelectionConfiguration.DocumentSelection documentSelection = this.U;
        navBarWithToolbar.setTitle(new TextLocalisedClause(i, u.c(documentSelection.f96401b), null, 12), null);
        navBarWithToolbar.setDescriptionVisible(true);
        String str = documentSelection.f96402c;
        if (str != null) {
            navBarWithToolbar.setDescriptionText(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        }
        DocumentSelectionControllerContract$InputData documentSelectionControllerContract$InputData = this.K;
        if (documentSelectionControllerContract$InputData.f96425h != null) {
            navBarWithToolbar.setMenuItems(u.c(new TextNavBarMenuItem("MENU_ITEM_SUPPORT", new TextLocalisedClause(R$string.workflow_document_selection_list_of_documents_action_help, null, null, 14), null, null, 12)));
        }
        navBarWithToolbar.setNavigationButtonIcon(documentSelectionControllerContract$InputData.f ? Integer.valueOf(ofm.q.k(q2())) : null);
        d3().f174573b.setText(documentSelection.d);
        LargeActionButton largeActionButton = d3().e;
        String str2 = documentSelection.e;
        largeActionButton.setVisibility(str2 != null ? 0 : 8);
        largeActionButton.setText(str2);
        largeActionButton.o(LargeActionButton.ButtonStyle.f58726b);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v35, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((InputTextDelegate) this.M.getValue()).f52575g.f121375b), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((SelectableDelegate) this.O.getValue()).r()), null, new g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174573b.o), null, new mth.e(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().e.o), null, new mth.e(this, continuation, 2), 3);
        ?? r56 = this.P;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FullScreenStateDelegate) r56.getValue()).f52371h.f121375b), null, new mth.h(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FullScreenStateDelegate) r56.getValue()).d), null, new mth.e(this, continuation, 3), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174574c.f59410q), null, new mth.e(this, continuation, 4), 3);
        com.revolut.kompot.navigable.a.g2(this, new mmh.e(rd0.e.b(d3().f174574c.o.f57403b), 7), null, new mth.e(this, continuation, 5), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((LargeActionButtonDelegate) this.Q.getValue()).d.f121375b), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174574c.p0()), null, new mth.e(this, continuation, 0), 3);
    }

    public final x d3() {
        ViewBinding value = this.L.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (x) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final mth.m R2() {
        return (mth.m) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.R;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.W.getValue();
    }
}
