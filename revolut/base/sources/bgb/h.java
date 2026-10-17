package bgb;

import b94.s;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.retail.salary_account.impl.flow.ui.d f15167w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f15168x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(com.revolut.feature.retail.salary_account.impl.flow.ui.d dVar, c cVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f15167w = dVar;
        this.f15168x = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h(this.f15167w, this.f15168x, continuation, 0);
            default:
                return new h(this.f15167w, this.f15168x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
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
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.retail.salary_account.impl.flow.ui.d dVar = this.f15167w;
                s sVar = new s(dVar, this.f15168x, null, 8);
                this.v = 1;
                Object objB = pu7.a.B(dVar.k, "CURRENT_REQUEST_STATUS", sVar, this);
                return objB == aVar ? aVar : objB;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                c cVar = this.f15168x;
                com.revolut.feature.retail.salary_account.impl.flow.ui.d dVar2 = this.f15167w;
                com.revolut.feature.retail.salary_account.impl.flow.ui.b bVar = new com.revolut.feature.retail.salary_account.impl.flow.ui.b(dVar2, cVar, null);
                this.v = 1;
                Object objB2 = pu7.a.B(dVar2.k, "ACCOUNT_SWITCHING_AVAILABILITY", bVar, this);
                return objB2 == aVar2 ? aVar2 : objB2;
        }
    }
}
