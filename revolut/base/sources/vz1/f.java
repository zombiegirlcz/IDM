package vz1;

import com.revolut.feature.apm.core.impl.data.network.payment_authorisations.ApmPaymentAuthorisationsService;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPaymentMethod;
import dz1.r;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class f extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ ApmPaymentAuthorisationPaymentMethod f293361w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g f293362x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(g gVar, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f293362x = gVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        ApmPaymentAuthorisationPaymentMethod apmPaymentAuthorisationPaymentMethod = (ApmPaymentAuthorisationPaymentMethod) obj3;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                f fVar = new f(this.f293362x, continuation, 0);
                fVar.f293361w = apmPaymentAuthorisationPaymentMethod;
                return fVar.invokeSuspend(Unit.f186387a);
            default:
                f fVar2 = new f(this.f293362x, continuation, 1);
                fVar2.f293361w = apmPaymentAuthorisationPaymentMethod;
                return fVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                ApmPaymentAuthorisationPaymentMethod apmPaymentAuthorisationPaymentMethod = this.f293361w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    ApmPaymentAuthorisationsService apmPaymentAuthorisationsService = this.f293362x.f293363a;
                    String strName = apmPaymentAuthorisationPaymentMethod.name();
                    this.f293361w = null;
                    this.v = 1;
                    obj2 = apmPaymentAuthorisationsService.getInactivePaymentAuthorisations(strName, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return cz1.c.a((r) obj2);
            default:
                ApmPaymentAuthorisationPaymentMethod apmPaymentAuthorisationPaymentMethod2 = this.f293361w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    ApmPaymentAuthorisationsService apmPaymentAuthorisationsService2 = this.f293362x.f293363a;
                    String strName2 = apmPaymentAuthorisationPaymentMethod2.name();
                    this.f293361w = null;
                    this.v = 1;
                    obj2 = apmPaymentAuthorisationsService2.getPaymentAuthorisations(strName2, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return cz1.c.a((r) obj2);
        }
    }
}
