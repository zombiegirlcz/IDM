package mth;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class p extends gim.i implements Function2 {
    public final /* synthetic */ com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.document_selection.a u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.document_selection.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new p(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((p) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.document_selection.a aVar2 = this.u;
        jvh.a aVar3 = aVar2.f96431q;
        pil.a params = new pil.a(((i) ((j2) aVar2.f96434t.f22677a).getValue()).f208830a, aVar2.o.f96421a.f96392a.f96400a);
        aVar3.getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        zuh.o oVar = aVar3.f178883a;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return yji.l.a1(aVar2, rd0.e.n(oVar.f325485j.b(params, loadingStrategy), h0.f322473a), null, null, new mkk.q(aVar2, null, 17), 3);
    }
}
