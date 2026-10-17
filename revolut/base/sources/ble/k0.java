package ble;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class k0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.tab.invest.impl.ui.home.f v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(com.revolut.feature.tab.invest.impl.ui.home.f fVar, Continuation continuation) {
        super(2, continuation);
        this.v = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k0 k0Var = new k0(this.v, continuation);
        k0Var.u = obj2;
        return k0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k0) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        List list = (List) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.tab.invest.impl.ui.home.f fVar = this.v;
        fVar.H2(fVar.f89873e0, new bke.t(list, 2));
        return Unit.f186387a;
    }
}
