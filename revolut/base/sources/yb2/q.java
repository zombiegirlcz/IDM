package yb2;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes20.dex */
public final class q extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ r v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, Continuation continuation) {
        super(2, continuation);
        this.v = rVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        q qVar = new q(this.v, continuation);
        qVar.u = obj2;
        return qVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((q) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Data data = (Data) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        r rVar = this.v;
        rVar.H2(rVar.f312174t, new y4c.i(data, 18));
        com.revolut.feature.topup_screen.api.model.b bVarI2 = rVar.I2();
        int i = bVarI2 == null ? -1 : p.f312169a[bVarI2.ordinal()];
        int i2 = 26;
        Continuation continuation = null;
        int i3 = 1;
        if (i == 1) {
            rVar.l2(new m(rVar, continuation, 0), new yi5.b(i2));
        } else if (i == 2) {
            rVar.l2(new m(rVar, continuation, i3), new yi5.b(i2));
        }
        return Unit.f186387a;
    }
}
