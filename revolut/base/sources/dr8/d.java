package dr8;

import fr8.n;
import gim.i;
import kd8.p;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.junior_transfer.impl.ui.flow.transfer.a f117105w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ n f117106x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(com.revolut.feature.junior_transfer.impl.ui.flow.transfer.a aVar, n nVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f117105w = aVar;
        this.f117106x = nVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.f117105w, this.f117106x, continuation, 0);
            case 1:
                return new d(this.f117105w, this.f117106x, continuation, 1);
            default:
                return new d(this.f117105w, this.f117106x, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    p pVar = this.f117105w.f77447w;
                    String str = this.f117106x.f137425b.f77103j;
                    v6d.a aVar2 = v6d.a.FIRST_PARTY_MARKETING;
                    this.v = 1;
                    if (pVar.h(str, aVar2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
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
                com.revolut.feature.junior_transfer.impl.ui.flow.transfer.a aVar4 = this.f117105w;
                f fVar = new f(aVar4, this.f117106x, null, 2);
                this.v = 1;
                Object objB = pu7.a.B(aVar4.k, "TRANSFER_TASK_ID", fVar, this);
                return objB == aVar3 ? aVar3 : objB;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.junior_transfer.impl.ui.flow.transfer.a aVar6 = this.f117105w;
                f fVar2 = new f(aVar6, this.f117106x, null, 5);
                this.v = 1;
                Object objB2 = pu7.a.B(aVar6.k, "TRANSFER_TASK_ID", fVar2, this);
                return objB2 == aVar5 ? aVar5 : objB2;
        }
    }
}
