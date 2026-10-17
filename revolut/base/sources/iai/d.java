package iai;

import com.revolut.feature_retail_user_declarations.citizenship.SubmitCitizenshipFlowOutput;
import com.revolut.shared.feature.workflow.engine.api.models.EligibilityDataPointValue;
import gim.i;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature_retail_user_declarations.citizenship.submit_citizenship.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature_retail_user_declarations.citizenship.collect_citizenship.a f160038w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.revolut.feature_retail_user_declarations.citizenship.collect_citizenship.a aVar, com.revolut.feature_retail_user_declarations.citizenship.submit_citizenship.a aVar2, Continuation continuation) {
        super(1, continuation);
        this.v = aVar2;
        this.f160038w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new d(this.f160038w, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((d) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature_retail_user_declarations.citizenship.collect_citizenship.a aVar2 = this.f160038w;
        com.revolut.feature_retail_user_declarations.citizenship.submit_citizenship.a aVar3 = this.v;
        if (i == 0) {
            o.b(obj2);
            jvh.a aVar4 = aVar3.f97526p;
            List listC = u.c(new EligibilityDataPointValue.CitizenshipDataPointValue("CITIZENSHIP", u.c(((gai.e) aVar2).f142190a.f297794a)));
            this.u = 1;
            if (jvh.a.i(aVar4, "DECLARATION", listC, null, null, this, 12) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        aVar3.f97527q.f229570a.clear();
        com.revolut.feature_retail_user_declarations.citizenship.submit_citizenship.a.I2(aVar3, new SubmitCitizenshipFlowOutput.SelectedCitizenship(((gai.e) aVar2).f142190a));
        return Unit.f186387a;
    }
}
