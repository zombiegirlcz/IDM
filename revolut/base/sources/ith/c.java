package ith;

import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.alternative_documents.AlternativeDocumentsController;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.DocumentGroup;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AlternativeDocumentsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AlternativeDocumentsController alternativeDocumentsController, Continuation continuation) {
        super(2, continuation);
        this.v = alternativeDocumentsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((SelectableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SelectableDelegate.Model model = (SelectableDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVarE3 = this.v.R2();
        Object obj3 = model.k;
        j jVar = (j) hVarE3;
        if (obj3 instanceof DocumentGroup) {
            jVar.H2(jVar.f168391q, new ib6.j(obj3, 4));
        } else {
            jVar.getClass();
            kvh.g.c(kvh.h.Companion, a0.d.m(obj3, "Wrong parcel is used for alternative document selection: "), new IllegalStateException(), null, 12);
        }
        return Unit.f186387a;
    }
}
