package com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.alternative_documents;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsListDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.workflow.engine.R$string;
import com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.alternative_documents.AlternativeDocumentsController;
import com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.alternative_documents.AlternativeDocumentsControllerContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import is7.b;
import ith.c;
import ith.d;
import ith.g;
import ith.i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/workflow/engine/doc_selection/workflow_document_selection_flow/alternative_documents/AlternativeDocumentsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lith/g;", "Ldli/a;", "Lith/i;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AlternativeDocumentsController extends ViewController<g> implements a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(AlternativeDocumentsController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final AlternativeDocumentsControllerContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final h O;
    public final int P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public AlternativeDocumentsController(AlternativeDocumentsControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = w.y0(new b(12));
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: ith.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AlternativeDocumentsController f168384b;

            {
                this.f168384b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AlternativeDocumentsController alternativeDocumentsController = this.f168384b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AlternativeDocumentsController.T;
                        return new SelectableDelegate((CellDetailsListDelegate) alternativeDocumentsController.L.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = AlternativeDocumentsController.T;
                        return (h) ((qth.a) alternativeDocumentsController.R.getValue()).f249118b.get();
                    case 2:
                        KProperty[] kPropertyArr3 = AlternativeDocumentsController.T;
                        qji.b bVarU2 = alternativeDocumentsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.alternative_documents.di.AlternativeDocumentsControllerInjector");
                        qth.h hVar = (qth.h) bVarU2;
                        qth.g gVar = hVar.f249147b;
                        qth.h hVar2 = hVar.f249148c;
                        AlternativeDocumentsControllerContract$InputData alternativeDocumentsControllerContract$InputData = alternativeDocumentsController.K;
                        alternativeDocumentsControllerContract$InputData.getClass();
                        return new qth.a(gVar, hVar2, alternativeDocumentsControllerContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = AlternativeDocumentsController.T;
                        AlternativeDocumentsController alternativeDocumentsController2 = this.f168384b;
                        return dli.f.a(alternativeDocumentsController2, alternativeDocumentsController2.R2(), v.k(new ListSubheaderDelegate(), (RowDelegate) alternativeDocumentsController2.N.getValue(), (CellDetailsListDelegate) alternativeDocumentsController2.L.getValue(), (SelectableDelegate) alternativeDocumentsController2.M.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.N = w.y0(new b(13));
        this.O = s.t(this, ith.b.f);
        this.P = R$layout.screen_recycler_navbar_nextbutton;
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: ith.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AlternativeDocumentsController f168384b;

            {
                this.f168384b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AlternativeDocumentsController alternativeDocumentsController = this.f168384b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AlternativeDocumentsController.T;
                        return new SelectableDelegate((CellDetailsListDelegate) alternativeDocumentsController.L.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = AlternativeDocumentsController.T;
                        return (h) ((qth.a) alternativeDocumentsController.R.getValue()).f249118b.get();
                    case 2:
                        KProperty[] kPropertyArr3 = AlternativeDocumentsController.T;
                        qji.b bVarU2 = alternativeDocumentsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.alternative_documents.di.AlternativeDocumentsControllerInjector");
                        qth.h hVar = (qth.h) bVarU2;
                        qth.g gVar = hVar.f249147b;
                        qth.h hVar2 = hVar.f249148c;
                        AlternativeDocumentsControllerContract$InputData alternativeDocumentsControllerContract$InputData = alternativeDocumentsController.K;
                        alternativeDocumentsControllerContract$InputData.getClass();
                        return new qth.a(gVar, hVar2, alternativeDocumentsControllerContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = AlternativeDocumentsController.T;
                        AlternativeDocumentsController alternativeDocumentsController2 = this.f168384b;
                        return dli.f.a(alternativeDocumentsController2, alternativeDocumentsController2.R2(), v.k(new ListSubheaderDelegate(), (RowDelegate) alternativeDocumentsController2.N.getValue(), (CellDetailsListDelegate) alternativeDocumentsController2.L.getValue(), (SelectableDelegate) alternativeDocumentsController2.M.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: ith.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AlternativeDocumentsController f168384b;

            {
                this.f168384b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AlternativeDocumentsController alternativeDocumentsController = this.f168384b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AlternativeDocumentsController.T;
                        return new SelectableDelegate((CellDetailsListDelegate) alternativeDocumentsController.L.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = AlternativeDocumentsController.T;
                        return (h) ((qth.a) alternativeDocumentsController.R.getValue()).f249118b.get();
                    case 2:
                        KProperty[] kPropertyArr3 = AlternativeDocumentsController.T;
                        qji.b bVarU2 = alternativeDocumentsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.alternative_documents.di.AlternativeDocumentsControllerInjector");
                        qth.h hVar = (qth.h) bVarU2;
                        qth.g gVar = hVar.f249147b;
                        qth.h hVar2 = hVar.f249148c;
                        AlternativeDocumentsControllerContract$InputData alternativeDocumentsControllerContract$InputData = alternativeDocumentsController.K;
                        alternativeDocumentsControllerContract$InputData.getClass();
                        return new qth.a(gVar, hVar2, alternativeDocumentsControllerContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = AlternativeDocumentsController.T;
                        AlternativeDocumentsController alternativeDocumentsController2 = this.f168384b;
                        return dli.f.a(alternativeDocumentsController2, alternativeDocumentsController2.R2(), v.k(new ListSubheaderDelegate(), (RowDelegate) alternativeDocumentsController2.N.getValue(), (CellDetailsListDelegate) alternativeDocumentsController2.L.getValue(), (SelectableDelegate) alternativeDocumentsController2.M.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i5 = 3;
        this.S = w.y0(new Function0(this) { // from class: ith.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AlternativeDocumentsController f168384b;

            {
                this.f168384b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                AlternativeDocumentsController alternativeDocumentsController = this.f168384b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AlternativeDocumentsController.T;
                        return new SelectableDelegate((CellDetailsListDelegate) alternativeDocumentsController.L.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = AlternativeDocumentsController.T;
                        return (h) ((qth.a) alternativeDocumentsController.R.getValue()).f249118b.get();
                    case 2:
                        KProperty[] kPropertyArr3 = AlternativeDocumentsController.T;
                        qji.b bVarU2 = alternativeDocumentsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.alternative_documents.di.AlternativeDocumentsControllerInjector");
                        qth.h hVar = (qth.h) bVarU2;
                        qth.g gVar = hVar.f249147b;
                        qth.h hVar2 = hVar.f249148c;
                        AlternativeDocumentsControllerContract$InputData alternativeDocumentsControllerContract$InputData = alternativeDocumentsController.K;
                        alternativeDocumentsControllerContract$InputData.getClass();
                        return new qth.a(gVar, hVar2, alternativeDocumentsControllerContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = AlternativeDocumentsController.T;
                        AlternativeDocumentsController alternativeDocumentsController2 = this.f168384b;
                        return dli.f.a(alternativeDocumentsController2, alternativeDocumentsController2.R2(), v.k(new ListSubheaderDelegate(), (RowDelegate) alternativeDocumentsController2.N.getValue(), (CellDetailsListDelegate) alternativeDocumentsController2.L.getValue(), (SelectableDelegate) alternativeDocumentsController2.M.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().f174564b.setEnabled(uiState.f168389b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (qth.a) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        int i = R$string.workflow_alternative_documents_screen_title_placeholder;
        AlternativeDocumentsControllerContract$InputData alternativeDocumentsControllerContract$InputData = this.K;
        navBarWithToolbar.setTitle(new TextLocalisedClause(i, u.c(alternativeDocumentsControllerContract$InputData.f96413a.f96394a), null, 12), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f174564b.setText(new TextLocalisedClause(R$string.workflow_alternative_documents_screen_cta_placeholder, u.c(alternativeDocumentsControllerContract$InputData.f96414b), null, 12));
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((SelectableDelegate) this.M.getValue()).r()), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new d(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new d(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.N.getValue()).f53218h), null, new ith.e(this, null), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.O.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final ith.h R2() {
        return (ith.h) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getP() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }
}
