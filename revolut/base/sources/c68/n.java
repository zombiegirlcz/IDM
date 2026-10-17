package c68;

import com.revolut.feature.junior.account_activation.impl.ui.flow.activation.AccountActivationFlowContract$InputData;
import com.revolut.feature.junior_card.api.navigation.CardRequestReviewConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import zh9.u0;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.junior.account_activation.impl.ui.flow.activation.f v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.revolut.feature.junior.account_activation.impl.ui.flow.activation.f fVar, Continuation continuation) {
        super(1, continuation);
        this.v = fVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new n(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((n) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        com.revolut.feature.junior.account_activation.impl.ui.flow.activation.f fVar = this.v;
        AccountActivationFlowContract$InputData accountActivationFlowContract$InputData = fVar.o;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            i68.e eVar = fVar.f76652x;
            String str = accountActivationFlowContract$InputData.f76633a.f77103j;
            this.u = 1;
            obj2 = u68.b.b(((i68.i) eVar).f158890c, str, null, null, this, 6);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        fVar.C1(u0.b(new FeatureCommand(new CardRequestReviewConfig.Review(accountActivationFlowContract$InputData.f76633a.f77103j, (NaviCommand) obj2, null, null, 12))));
        oki.h.D2(fVar.E);
        return Unit.f186387a;
    }
}
