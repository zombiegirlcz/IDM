package com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow;

import com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.WorkflowDocumentSelectionFlowContract$Step;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.CitizenshipGroup;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.Citizenships;
import elm.f;
import gim.i;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import oki.h;
import skm.e0;
import skm.p0;
import yhm.o;
import zhm.a0;
import zhm.d0;
import zuh.m;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        b bVar = this.v;
        WorkflowDocumentSelectionFlowContract$InputData workflowDocumentSelectionFlowContract$InputData = bVar.o;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            jvh.a aVar2 = bVar.f96417q;
            String str = workflowDocumentSelectionFlowContract$InputData.f96404b.f96393b.f96397a;
            this.u = 1;
            zuh.o oVar = aVar2.f178883a;
            oVar.getClass();
            m mVar = new m(oVar, str, null, 0);
            p0 p0Var = p0.f264001a;
            obj2 = e0.J(f.f127540b, mVar, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        Citizenships citizenships = (Citizenships) obj2;
        ArrayList arrayList = citizenships.f105580b;
        ArrayList arrayList2 = new ArrayList();
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            a0.x(((CitizenshipGroup) it8.next()).f105578b, arrayList2);
        }
        wi0.b bVar2 = citizenships.f105579a;
        boolean z = bVar2 != null;
        boolean z3 = arrayList2.size() > 1;
        if (z) {
            h.u2(bVar, bVar.u, new WorkflowDocumentSelectionFlowContract$Step.DocumentSelection(bVar2, z3, bVar.o.d, arrayList), null, 6);
        } else if (z3) {
            h.u2(bVar, bVar.u, new WorkflowDocumentSelectionFlowContract$Step.CitizenshipPicker(arrayList, (wi0.b) d0.b0(arrayList2)), null, 6);
        } else {
            h.u2(bVar, bVar.u, new WorkflowDocumentSelectionFlowContract$Step.SingleCitizenshipPrompt((wi0.b) d0.b0(arrayList2), workflowDocumentSelectionFlowContract$InputData.f96404b.f96393b.d), null, 6);
        }
        return Unit.f186387a;
    }
}
