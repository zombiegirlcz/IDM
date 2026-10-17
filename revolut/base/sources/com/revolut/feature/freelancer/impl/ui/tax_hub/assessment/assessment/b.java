package com.revolut.feature.freelancer.impl.ui.tax_hub.assessment.assessment;

import com.revolut.feature.freelancer.impl.ui.tax_hub.assessment.assessment.TaxHubAssessmentScreenContract$ModalStep;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends i implements Function1 {
    public int u;
    public final /* synthetic */ f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TaxHubAssessmentScreenContract$ModalStep.MarkEventAsCompleted f74241w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar, TaxHubAssessmentScreenContract$ModalStep.MarkEventAsCompleted markEventAsCompleted, Continuation continuation) {
        super(1, continuation);
        this.v = fVar;
        this.f74241w = markEventAsCompleted;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.v, this.f74241w, continuation);
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
            TaxHubAssessmentScreenContract$ModalStep.MarkEventAsCompleted markEventAsCompleted = this.f74241w;
            f fVar = this.v;
            a aVar2 = new a(fVar, markEventAsCompleted, null);
            this.u = 1;
            if (fVar.p2(this, aVar2) == aVar) {
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
