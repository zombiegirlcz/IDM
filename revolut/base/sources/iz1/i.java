package iz1;

import com.revolut.feature.apm.core.impl.data.network.payment_authorisations.ApmPaymentAuthorisationsAmendmentService;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPaymentMethod;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes20.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f169832w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f169833x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ ApmPaymentAuthorisationPaymentMethod f169834y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(j jVar, String str, ApmPaymentAuthorisationPaymentMethod apmPaymentAuthorisationPaymentMethod, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f169832w = jVar;
        this.f169833x = str;
        this.f169834y = apmPaymentAuthorisationPaymentMethod;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i(this.f169832w, this.f169833x, this.f169834y, continuation, 0);
            case 1:
                return new i(this.f169832w, this.f169833x, this.f169834y, continuation, 1);
            default:
                return new i(this.f169832w, this.f169833x, this.f169834y, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    ApmPaymentAuthorisationsAmendmentService apmPaymentAuthorisationsAmendmentService = this.f169832w.f169835a;
                    String strName = this.f169834y.name();
                    this.v = 1;
                    obj2 = apmPaymentAuthorisationsAmendmentService.approveAmendment(this.f169833x, strName, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return cz1.b.a((dz1.a) obj2);
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    ApmPaymentAuthorisationsAmendmentService apmPaymentAuthorisationsAmendmentService2 = this.f169832w.f169835a;
                    String strName2 = this.f169834y.name();
                    this.v = 1;
                    obj2 = apmPaymentAuthorisationsAmendmentService2.getAmendmentById(this.f169833x, strName2, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return cz1.b.a((dz1.a) obj2);
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    ApmPaymentAuthorisationsAmendmentService apmPaymentAuthorisationsAmendmentService3 = this.f169832w.f169835a;
                    String strName3 = this.f169834y.name();
                    this.v = 1;
                    obj2 = apmPaymentAuthorisationsAmendmentService3.rejectAmendment(this.f169833x, strName3, this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return cz1.b.a((dz1.a) obj2);
        }
    }
}
