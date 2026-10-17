package mth;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.WorkflowDocumentSelectionConfiguration;
import com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.document_selection.DocumentSelectionController;
import com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.document_selection.DocumentSelectionControllerContract$InputData;
import com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.document_selection.DocumentSelectionControllerContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.AlternativeDocumentGroups;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.ApplicableDocuments;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ DocumentSelectionController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(DocumentSelectionController documentSelectionController, Continuation continuation) {
        super(2, continuation);
        this.u = documentSelectionController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        AlternativeDocumentGroups alternativeDocumentGroups;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.document_selection.a aVar2 = (com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.document_selection.a) this.u.R2();
        DocumentSelectionControllerContract$InputData documentSelectionControllerContract$InputData = aVar2.o;
        WorkflowDocumentSelectionConfiguration.AlternativeDocuments alternativeDocuments = documentSelectionControllerContract$InputData.f96421a.f96392a.f;
        ApplicableDocuments applicableDocuments = (ApplicableDocuments) ((i) ((j2) aVar2.f96434t.f22677a).getValue()).f208831b.getContent();
        ArrayList arrayList = (applicableDocuments == null || (alternativeDocumentGroups = applicableDocuments.f105574b) == null) ? null : alternativeDocumentGroups.f105570a;
        if (arrayList == null || alternativeDocuments == null) {
            kvh.g.c(kvh.h.Companion, "Alternative documents sections and configuration should be present to open alternative documents screen", new NullPointerException(), documentSelectionControllerContract$InputData.d, 4);
        } else {
            oki.h.v2(aVar2.u, new DocumentSelectionControllerContract$ModalStep.AlternativeDocuments(alternativeDocuments, documentSelectionControllerContract$InputData.f96421a.f96392a.d, arrayList), ModalDestination.Style.POPUP.f98311a);
        }
        return Unit.f186387a;
    }
}
