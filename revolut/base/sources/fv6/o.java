package fv6;

import com.revolut.feature.freelancer.common.models.acquiring_payment.payment.AcquiringPaymentsQuery;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.freelancer.impl.ui.acquiring_payment.list.b f138369w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(com.revolut.feature.freelancer.impl.ui.acquiring_payment.list.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f138369w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new o(this.f138369w, continuation, 0);
            default:
                return new o(this.f138369w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((o) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.freelancer.impl.ui.acquiring_payment.list.b bVar = this.f138369w;
                    a aVar2 = bVar.f73733p;
                    AcquiringPaymentsQuery acquiringPaymentsQuery = ((g) ((j2) bVar.f73736s.f22677a).getValue()).f138360b;
                    this.v = 1;
                    if (aVar2.h(acquiringPaymentsQuery, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.freelancer.impl.ui.acquiring_payment.list.b bVar2 = this.f138369w;
                    a aVar4 = bVar2.f73733p;
                    AcquiringPaymentsQuery acquiringPaymentsQuery2 = ((g) ((j2) bVar2.f73736s.f22677a).getValue()).f138360b;
                    this.v = 1;
                    if (aVar4.l(acquiringPaymentsQuery2, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
