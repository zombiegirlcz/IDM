package uhb;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import su4.n;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.retail.salary_account.impl.switch_assistant.flow.b f280194w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(com.revolut.feature.retail.salary_account.impl.switch_assistant.flow.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f280194w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.f280194w, continuation, 0);
            default:
                return new g(this.f280194w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    com.revolut.feature.retail.salary_account.impl.switch_assistant.flow.b bVar = this.f280194w;
                    com.revolut.feature.retail.salary_account.impl.switch_assistant.flow.a aVar2 = new com.revolut.feature.retail.salary_account.impl.switch_assistant.flow.a(bVar, null);
                    this.v = 1;
                    if (bVar.p2(this, aVar2) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.retail.salary_account.impl.switch_assistant.flow.b bVar2 = this.f280194w;
                n nVar = new n(bVar2, null, 29);
                this.v = 1;
                Object objP2 = bVar2.p2(this, nVar);
                return objP2 == aVar3 ? aVar3 : objP2;
        }
    }
}
