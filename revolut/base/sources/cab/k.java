package cab;

import cli.y;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final class k extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.retail.goals.impl.ui.a f22592w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(com.revolut.feature.retail.goals.impl.ui.a aVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f22592w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k(this.f22592w, continuation, 0);
            default:
                return new k(this.f22592w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((k) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                com.revolut.feature.retail.goals.impl.ui.a aVar2 = this.f22592w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (com.revolut.feature.retail.goals.impl.ui.a.K2(aVar2, 0L, null, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                com.revolut.feature.retail.goals.impl.ui.a.J2(aVar2);
                return Unit.f186387a;
            default:
                com.revolut.feature.retail.goals.impl.ui.a aVar3 = this.f22592w;
                y yVar = aVar3.f82659w;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    long jB = aVar3.f82656r.b(((g) ((j2) yVar.f22677a).getValue()).f22582a, ((f) zi0.c.I(((g) ((j2) yVar.f22677a).getValue()).f22584c)).f22581c.f306286a);
                    Long l2 = ((g) ((j2) yVar.f22677a).getValue()).f22583b;
                    this.v = 1;
                    if (com.revolut.feature.retail.goals.impl.ui.a.K2(aVar3, jB, l2, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                com.revolut.feature.retail.goals.impl.ui.a.J2(aVar3);
                return Unit.f186387a;
        }
    }
}
