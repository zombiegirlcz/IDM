package mth;

import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.document_selection.DocumentSelectionController;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.DocumentGroup;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ DocumentSelectionController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(DocumentSelectionController documentSelectionController, Continuation continuation) {
        super(2, continuation);
        this.v = documentSelectionController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((SelectableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SelectableDelegate.Model model = (SelectableDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVarE3 = this.v.R2();
        Object obj3 = model.k;
        com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.document_selection.a aVar2 = (com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.document_selection.a) mVarE3;
        if (obj3 instanceof DocumentGroup) {
            aVar2.H2(aVar2.f96434t, new ib6.j(obj3, 10));
        } else {
            aVar2.getClass();
            kvh.g.c(kvh.h.Companion, a0.d.m(obj3, "Wrong parcel is used for document selection: "), new IllegalStateException(), null, 12);
        }
        return Unit.f186387a;
    }
}
