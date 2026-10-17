package ej9;

import com.revolut.feature.pay_later.impl.network.PayLaterApiService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes5.dex */
public final class b0 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e0 f126791w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(e0 e0Var, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f126791w = e0Var;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                return new b0(this.f126791w, continuation, 0).invokeSuspend(Unit.f186387a);
            case 1:
                return new b0(this.f126791w, continuation, 1).invokeSuspend(Unit.f186387a);
            default:
                return new b0(this.f126791w, continuation, 2).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                PayLaterApiService payLaterApiService = this.f126791w.f126799a;
                this.v = 1;
                Object payLaterSwitchOptions = payLaterApiService.getPayLaterSwitchOptions(this);
                return payLaterSwitchOptions == aVar ? aVar : payLaterSwitchOptions;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                PayLaterApiService payLaterApiService2 = this.f126791w.f126799a;
                this.v = 1;
                Object instalmentTypes = payLaterApiService2.getInstalmentTypes(this);
                return instalmentTypes == aVar2 ? aVar2 : instalmentTypes;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                PayLaterApiService payLaterApiService3 = this.f126791w.f126799a;
                this.v = 1;
                Object paymentOptions = payLaterApiService3.getPaymentOptions(this);
                return paymentOptions == aVar3 ? aVar3 : paymentOptions;
        }
    }
}
