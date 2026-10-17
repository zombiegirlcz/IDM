package rgk;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import zfk.c;

/* JADX INFO: loaded from: classes11.dex */
public final class o extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.flow.action.b f254218w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ p f254219x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ c f254220y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.revolut.retail.feature.pricing_plans.ui.impl.flow.action.b bVar, p pVar, c cVar, Continuation continuation) {
        super(2, continuation);
        this.f254218w = bVar;
        this.f254219x = pVar;
        this.f254220y = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        o oVar = new o(this.f254218w, this.f254219x, this.f254220y, continuation);
        oVar.v = obj2;
        return oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((o) create((c.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        c.b bVar = (c.b) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            this.v = null;
            this.u = 1;
            if (com.revolut.retail.feature.pricing_plans.ui.impl.flow.action.b.Z2(this.f254218w, bVar, this.f254219x, this.f254220y, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
