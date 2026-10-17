package ici;

import com.revolut.shared.feature.workflow.engine.api.models.MobileScreenParams;
import gim.i;
import jci.f;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;
import zhm.d0;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature_retail_user_declarations.risk_assessment.flow.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f160292w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.revolut.feature_retail_user_declarations.risk_assessment.flow.a aVar, f fVar, Continuation continuation) {
        super(1, continuation);
        this.v = aVar;
        this.f160292w = fVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new d(this.v, this.f160292w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((d) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        f fVar = this.f160292w;
        com.revolut.feature_retail_user_declarations.risk_assessment.flow.a aVar2 = this.v;
        if (i == 0) {
            o.b(obj2);
            jvh.a aVar3 = aVar2.f97729p;
            String str = aVar2.o.f97727a;
            MobileScreenParams.RiskAssessment riskAssessment = new MobileScreenParams.RiskAssessment(d0.d1(fVar.f172818a));
            this.u = 1;
            if (aVar3.j(str, riskAssessment, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        aVar2.C2(new e(fVar.f172818a));
        return Unit.f186387a;
    }
}
