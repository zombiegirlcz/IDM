package hth;

import com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.WorkflowDocumentSelectionFlowContract$InputData;
import com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.WorkflowDocumentSelectionFlowContract$Step;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.shared.feature.workflow.engine.api.models.MobileScreenParams$DocumentSelection$UndefinedCitizenship;
import d67.r;
import d67.s;
import d67.t;
import d67.u;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s7a.a0;
import s7a.c0;
import s7a.p;
import s7a.q;
import s7a.y;
import yhm.m;
import yhm.o;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f155389a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yki.b f155390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.b f155391c;
    public final /* synthetic */ WorkflowDocumentSelectionFlowContract$Step d;

    public /* synthetic */ f(com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.b bVar, yki.b bVar2, WorkflowDocumentSelectionFlowContract$Step workflowDocumentSelectionFlowContract$Step) {
        this.f155391c = bVar;
        this.f155390b = bVar2;
        this.d = workflowDocumentSelectionFlowContract$Step;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws Throwable {
        int i = this.f155389a;
        c cVar = c.f155387a;
        WorkflowDocumentSelectionFlowContract$Step workflowDocumentSelectionFlowContract$Step = this.d;
        switch (i) {
            case 0:
                com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.b bVar = this.f155391c;
                WorkflowDocumentSelectionFlowContract$InputData workflowDocumentSelectionFlowContract$InputData = bVar.o;
                a0 outputData = (a0) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                c0 c0Var = outputData.f260599a;
                if (c0Var instanceof q) {
                    wi0.a aVar = wi0.b.Companion;
                    String str = ((q) c0Var).f260624a;
                    aVar.getClass();
                    oki.h.t2(bVar, this.f155390b, new WorkflowDocumentSelectionFlowContract$Step.DocumentSelection(wi0.a.a(str), true, true, ((WorkflowDocumentSelectionFlowContract$Step.CitizenshipPicker) workflowDocumentSelectionFlowContract$Step).f96407b), true, null, false, 12);
                } else if (c0Var instanceof y) {
                    String str2 = workflowDocumentSelectionFlowContract$InputData.f96405c;
                    if (Intrinsics.f(((y) c0Var).f260660a, "HELP_MENU_ITEM_ID") && str2 != null) {
                        bVar.C1(new ExternalDestination.ImplicitActivity("android.intent.action.VIEW", null, ((f80.b) bVar.f96420t).f(str2), 0, null, 494));
                    }
                } else if (Intrinsics.f(c0Var, p.f260622a) && workflowDocumentSelectionFlowContract$InputData.d) {
                    bVar.C2(cVar);
                }
                return Unit.f186387a;
            default:
                u result = (u) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if ((result instanceof d67.p) || Intrinsics.f(result, r.f111463a)) {
                    try {
                        m.Companion companion = m.INSTANCE;
                        throw new IllegalStateException("Output " + result + " of Single citizenship prompt can't be handled in WorkflowDocumentSelection");
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Throwable th10) {
                        m.Companion companion2 = m.INSTANCE;
                        Throwable thA = m.a(o.a(th10));
                        if (thA != null) {
                            hx7.e.n(thA);
                        }
                    }
                } else {
                    boolean z = result instanceof d67.q;
                    com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.b bVar2 = this.f155391c;
                    if (z) {
                        bVar2.C2(cVar);
                    } else if (Intrinsics.f(result, s.f111464a)) {
                        bVar2.I2(MobileScreenParams$DocumentSelection$UndefinedCitizenship.f105427a);
                    } else {
                        if (!Intrinsics.f(result, t.f111465a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        oki.h.t2(bVar2, this.f155390b, new WorkflowDocumentSelectionFlowContract$Step.DocumentSelection(((WorkflowDocumentSelectionFlowContract$Step.SingleCitizenshipPrompt) workflowDocumentSelectionFlowContract$Step).f96411a, false, true, f0.f322471a), true, null, false, 12);
                    }
                }
                return Unit.f186387a;
        }
    }

    public /* synthetic */ f(yki.b bVar, com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.b bVar2, WorkflowDocumentSelectionFlowContract$Step workflowDocumentSelectionFlowContract$Step) {
        this.f155390b = bVar;
        this.f155391c = bVar2;
        this.d = workflowDocumentSelectionFlowContract$Step;
    }
}
