package ej9;

import com.revolut.feature.pay_later.impl.network.PayLaterApiService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes5.dex */
public final class a0 extends gim.i implements Function3 {
    public int u;
    public final /* synthetic */ e0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(e0 e0Var, Continuation continuation) {
        super(3, continuation);
        this.v = e0Var;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        return new a0(this.v, (Continuation) obj4).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        PayLaterApiService payLaterApiService = this.v.f126799a;
        this.u = 1;
        Object accountConfig = payLaterApiService.getAccountConfig(this);
        return accountConfig == aVar ? aVar : accountConfig;
    }
}
