package ith;

import com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.alternative_documents.AlternativeDocumentsController;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.DocumentGroup;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ AlternativeDocumentsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(AlternativeDocumentsController alternativeDocumentsController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = alternativeDocumentsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            default:
                return new d(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        AlternativeDocumentsController alternativeDocumentsController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                j jVar = (j) alternativeDocumentsController.e3();
                DocumentGroup documentGroup = ((f) ((j2) jVar.f168391q.f22677a).getValue()).f168385a;
                if (documentGroup == null) {
                    throw new IllegalArgumentException("submit button should be disabled if selectedDocumentGroup == null");
                }
                jVar.C2(new g(documentGroup));
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((j) alternativeDocumentsController.e3()).B2();
                return Unit.f186387a;
        }
    }
}
