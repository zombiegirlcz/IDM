package zr4;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes22.dex */
public final class z extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.card.impl.ui.instalment.details.post_purchase.a f324584w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(com.revolut.feature.credit.card.impl.ui.instalment.details.post_purchase.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f324584w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new z(this.f324584w, continuation, 0);
            default:
                return new z(this.f324584w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((z) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
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
                com.revolut.feature.credit.card.impl.ui.instalment.details.post_purchase.a aVar2 = this.f324584w;
                y yVar = new y(aVar2, null, 3);
                this.v = 1;
                Object objB = pu7.a.B(aVar2.k, "Cancel instalment", yVar, this);
                return objB == aVar ? aVar : objB;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.credit.card.impl.ui.instalment.details.post_purchase.a aVar4 = this.f324584w;
                y yVar2 = new y(aVar4, null, 4);
                this.v = 1;
                Object objB2 = pu7.a.B(aVar4.k, "credit_card_reload_instalment", yVar2, this);
                return objB2 == aVar3 ? aVar3 : objB2;
        }
    }
}
