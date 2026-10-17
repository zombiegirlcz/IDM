package com.revolut.feature.freelancer.impl.ui.tax_hub.assessment.assessment;

import com.revolut.feature.freelancer.impl.ui.tax_hub.assessment.assessment.TaxHubAssessmentScreenContract$ModalStep;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;
import z1i.l;
import z27.g;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TaxHubAssessmentScreenContract$ModalStep.MarkEventAsCompleted f74240w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f fVar, TaxHubAssessmentScreenContract$ModalStep.MarkEventAsCompleted markEventAsCompleted, Continuation continuation) {
        super(1, continuation);
        this.v = fVar;
        this.f74240w = markEventAsCompleted;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, this.f74240w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        f fVar = this.v;
        if (i == 0) {
            o.b(obj2);
            r10.d dVar = fVar.f74246s;
            String str = this.f74240w.f74239a;
            this.u = 1;
            if (dVar.B(str, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        fVar.H2(fVar.v, new l(12));
        fVar.C2(g.f318981a);
        return Unit.f186387a;
    }
}
