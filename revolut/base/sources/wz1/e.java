package wz1;

import com.revolut.feature.apm.core.impl.topup_requests.network.ApmTopupRequestsService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f301341w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f301342x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f301341w = fVar;
        this.f301342x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.f301341w, this.f301342x, continuation, 0);
            default:
                return new e(this.f301341w, this.f301342x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                Object objY = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                String str = this.f301342x;
                if (i == 0) {
                    o.b(obj2);
                    ApmTopupRequestsService apmTopupRequestsService = this.f301341w.f301343a;
                    this.v = 1;
                    obj2 = apmTopupRequestsService.getTopupRequest(str, this);
                    if (obj2 != objY) {
                    }
                    return objY;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
                objY = oc.c.y((yz1.c) obj2);
                if (objY == null) {
                    throw new IllegalStateException(p.a.p("Unknown PaymentMethod for TR (id: ", str, ")"));
                }
                return objY;
            default:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    ApmTopupRequestsService apmTopupRequestsService2 = this.f301341w.f301343a;
                    this.v = 1;
                    obj2 = apmTopupRequestsService2.rejectTopupRequest(this.f301342x, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                yz1.b bVar = (yz1.b) obj2;
                Intrinsics.checkNotNullParameter(bVar, "<this>");
                return new k71.c(bVar.getTransactionId());
        }
    }
}
