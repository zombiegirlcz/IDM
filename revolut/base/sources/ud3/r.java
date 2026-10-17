package ud3;

import com.revolut.feature.credit.api.navigation.CreditCardHomeFeatureConfig;
import com.revolut.feature.credit.application.api.navigation.CreditApplicationFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import grl.r2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import om4.y3;
import q97.g3;

/* JADX INFO: loaded from: classes21.dex */
public final class r extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ e0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(e0 e0Var, Continuation continuation) {
        super(1, continuation);
        this.v = e0Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new r(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((r) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        gt3.c cVar = null;
        Object[] objArr = 0;
        if (i == 0) {
            yhm.o.b(obj2);
            g3 g3Var = new g3(mo3.a.g(((y3) this.v.u).e(w4l.j.f294644c, true), null, new u4i.u(27), 1), 24);
            this.u = 1;
            obj2 = vkm.q.x(g3Var, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        String str = (String) obj2;
        if (str != null) {
            return new FeatureCommand(new CreditCardHomeFeatureConfig(str));
        }
        return new FeatureCommand(new CreditApplicationFeatureConfig.StartApplication(r2.PREMIUM_HUB, new ft3.g(cVar, objArr == true ? 1 : 0, 3), null, null, null, null, 16378));
    }
}
