package mth;

import com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.document_selection.DocumentSelectionController;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.DocumentGroup;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ DocumentSelectionController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(DocumentSelectionController documentSelectionController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = documentSelectionController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.v, continuation, 0);
            case 1:
                return new e(this.v, continuation, 1);
            case 2:
                return new e(this.v, continuation, 2);
            case 3:
                return new e(this.v, continuation, 3);
            case 4:
                return new e(this.v, continuation, 4);
            default:
                return new e(this.v, continuation, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((e) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((e) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((e) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((e) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                Boolean bool = (Boolean) obj2;
                bool.booleanValue();
                return ((e) create(bool, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        DocumentSelectionController documentSelectionController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.document_selection.a) documentSelectionController.R2()).I2();
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.document_selection.a aVar3 = (com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.document_selection.a) documentSelectionController.R2();
                DocumentGroup documentGroup = ((i) ((j2) aVar3.f96434t.f22677a).getValue()).f208832c;
                if (documentGroup == null) {
                    throw new IllegalArgumentException("submit button should be disabled if selectedDocumentSequence == null");
                }
                aVar3.C2(new j(((i) ((j2) aVar3.f96434t.f22677a).getValue()).f208830a, documentGroup));
                return Unit.f186387a;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.document_selection.a aVar5 = (com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.document_selection.a) documentSelectionController.R2();
                aVar5.C2(new k(((i) ((j2) aVar5.f96434t.f22677a).getValue()).f208830a));
                return Unit.f186387a;
            case 3:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.document_selection.a) documentSelectionController.R2()).I2();
                return Unit.f186387a;
            case 4:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.document_selection.a) documentSelectionController.R2()).B2();
                return Unit.f186387a;
            default:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.document_selection.a aVar9 = (com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.document_selection.a) documentSelectionController.R2();
                String str = aVar9.o.f96425h;
                if (str == null || str.length() == 0) {
                    NullPointerException nullPointerException = new NullPointerException("Support deeplink can't be null");
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, nullPointerException, h0Var);
                } else {
                    aVar9.C1(new ExternalDestination.ImplicitActivity("android.intent.action.VIEW", null, ((f80.b) aVar9.f96432r).f(str), 0, null, 494));
                }
                return Unit.f186387a;
        }
    }
}
