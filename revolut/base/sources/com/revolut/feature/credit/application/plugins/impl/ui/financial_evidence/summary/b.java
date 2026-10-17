package com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.summary;

import com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.summary.SummaryScreenContract$ModalStep;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends i implements Function1 {
    public int u;
    public final /* synthetic */ h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SummaryScreenContract$ModalStep.RemoveDocumentConfirmation f67743w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(h hVar, SummaryScreenContract$ModalStep.RemoveDocumentConfirmation removeDocumentConfirmation, Continuation continuation) {
        super(1, continuation);
        this.v = hVar;
        this.f67743w = removeDocumentConfirmation;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.v, this.f67743w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            SummaryScreenContract$ModalStep.RemoveDocumentConfirmation removeDocumentConfirmation = this.f67743w;
            h hVar = this.v;
            a aVar2 = new a(hVar, removeDocumentConfirmation, null);
            this.u = 1;
            if (hVar.p2(this, aVar2) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
