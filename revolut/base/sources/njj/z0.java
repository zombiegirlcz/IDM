package njj;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m1c.z;

/* JADX INFO: loaded from: classes11.dex */
public final class z0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.a aVar, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        z0 z0Var = new z0(this.v, continuation);
        z0Var.u = obj2;
        return z0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((z0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Data data = (Data) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        boolean zF = Intrinsics.f(data.getContent(), z.a.f201476a);
        com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.a aVar2 = this.v;
        aVar2.H2(aVar2.G, new dmj.r0(5, data, zF));
        return Unit.f186387a;
    }
}
