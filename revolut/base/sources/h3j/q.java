package h3j;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
public final class q extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.beneficiary.impl.ui.bank_beneficiary_details.b f149169w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(com.revolut.retail.feature.beneficiary.impl.ui.bank_beneficiary_details.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f149169w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new q(this.f149169w, continuation, 0);
            default:
                return new q(this.f149169w, continuation, 1);
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
                com.revolut.retail.feature.beneficiary.impl.ui.bank_beneficiary_details.b bVar = this.f149169w;
                p pVar = new p(bVar, null, 1);
                this.v = 1;
                Object objP2 = bVar.p2(this, pVar);
                return objP2 == aVar ? aVar : objP2;
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
                com.revolut.retail.feature.beneficiary.impl.ui.bank_beneficiary_details.b bVar2 = this.f149169w;
                com.revolut.retail.feature.beneficiary.impl.ui.bank_beneficiary_details.a aVar3 = new com.revolut.retail.feature.beneficiary.impl.ui.bank_beneficiary_details.a(bVar2, null);
                this.v = 1;
                Object objP22 = bVar2.p2(this, aVar3);
                return objP22 == aVar2 ? aVar2 : objP22;
        }
    }
}
