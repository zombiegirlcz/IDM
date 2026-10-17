package pz1;

import com.revolut.feature.apm.core.impl.money_requests.data.network.ApmMoneyRequestsActionsService;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f240862w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f240863x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f240862w = bVar;
        this.f240863x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new a(this.f240862w, this.f240863x, continuation, 0);
            default:
                return new a(this.f240862w, this.f240863x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    ApmMoneyRequestsActionsService apmMoneyRequestsActionsService = this.f240862w.f240864a;
                    wj0.b bVar = new wj0.b("payments_apm_money_request");
                    this.v = 1;
                    obj2 = apmMoneyRequestsActionsService.approveMoneyRequest(this.f240863x, bVar, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                rz1.b bVar2 = (rz1.b) obj2;
                Intrinsics.checkNotNullParameter(bVar2, "<this>");
                return new k71.c(bVar2.getTransactionId());
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    ApmMoneyRequestsActionsService apmMoneyRequestsActionsService2 = this.f240862w.f240864a;
                    wj0.b bVar3 = new wj0.b("payments_apm_money_request");
                    this.v = 1;
                    obj2 = apmMoneyRequestsActionsService2.rejectMoneyRequest(this.f240863x, bVar3, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                rz1.b bVar4 = (rz1.b) obj2;
                Intrinsics.checkNotNullParameter(bVar4, "<this>");
                return new k71.c(bVar4.getTransactionId());
        }
    }
}
