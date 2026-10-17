package k7c;

import com.revolut.feature.revolutpay.impl.data.service.RevolutPayService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class f0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g0 f181955w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f181956x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(g0 g0Var, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f181955w = g0Var;
        this.f181956x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f0(this.f181955w, this.f181956x, continuation, 0);
            case 1:
                return new f0(this.f181955w, this.f181956x, continuation, 1);
            default:
                return new f0(this.f181955w, this.f181956x, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((f0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    RevolutPayService revolutPayService = this.f181955w.f181957a;
                    this.v = 1;
                    if (revolutPayService.failPayment(this.f181956x, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    RevolutPayService revolutPayService2 = this.f181955w.f181957a;
                    this.v = 1;
                    obj2 = revolutPayService2.getProcessingOrderState(this.f181956x, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return d7c.j.a((e7c.e0) obj2);
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    RevolutPayService revolutPayService3 = this.f181955w.f181957a;
                    this.v = 1;
                    obj2 = revolutPayService3.getProcessingOrderState(this.f181956x, this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return adc.c.a(d7c.j.a((e7c.e0) obj2));
        }
    }
}
