package nf4;

import com.revolut.feature.credit.application.api.navigation.CreditApplicationFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import ft3.o0;
import grl.r2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes22.dex */
public final class r extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.calculator.c v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.calculator.c cVar, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new r(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((r) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.calculator.c cVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            ow3.e eVar = cVar.f68129q;
            String str = cVar.f68130r.d.f66892b;
            uu3.a aVar2 = uu3.a.SWITCH_TO_REFINANCING;
            this.u = 1;
            if (eVar.e(str, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        cVar.C2(new i(new FeatureCommand(new CreditApplicationFeatureConfig.StartApplication(r2.CALCULATOR_SWITCH_TO_REFINANCING, o0.INSTANCE, null, null, null, null, 16378))));
        return Unit.f186387a;
    }
}
