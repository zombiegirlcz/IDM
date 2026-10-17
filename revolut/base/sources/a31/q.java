package a31;

import com.revolut.shared.feature.recurring_payments.data.services.StandingOrdersService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes20.dex */
public final class q extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x f986w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f987x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(x xVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f986w = xVar;
        this.f987x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new q(this.f986w, this.f987x, continuation, 0);
            default:
                return new q(this.f986w, this.f987x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((q) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
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
                StandingOrdersService standingOrdersService = this.f986w.f1000b;
                this.v = 1;
                Object objActivateRecurringPaymentOrder = standingOrdersService.activateRecurringPaymentOrder(this.f987x, this);
                return objActivateRecurringPaymentOrder == aVar ? aVar : objActivateRecurringPaymentOrder;
            default:
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
                StandingOrdersService standingOrdersService2 = this.f986w.f1000b;
                this.v = 1;
                Object objDeactivateRecurringPaymentOrder = standingOrdersService2.deactivateRecurringPaymentOrder(this.f987x, this);
                return objDeactivateRecurringPaymentOrder == aVar2 ? aVar2 : objDeactivateRecurringPaymentOrder;
        }
    }
}
