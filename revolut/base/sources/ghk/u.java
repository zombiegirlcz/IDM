package ghk;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public final class u extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.d f143988w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f143989x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.d dVar, String str, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f143988w = dVar;
        this.f143989x = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new u(this.f143988w, this.f143989x, continuation, 0);
            default:
                return new u(this.f143988w, this.f143989x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((u) create(continuation)).invokeSuspend(Unit.f186387a);
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
                wli.x xVar = this.f143988w.f103069q;
                lg0.a aVar2 = lg0.a.OPEN_BROWSER;
                Boolean bool = Boolean.FALSE;
                this.v = 1;
                Object objL1 = xVar.L1(this.f143989x, aVar2, bool, this);
                return objL1 == aVar ? aVar : objL1;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.d dVar = this.f143988w;
                    ajk.b bVar = dVar.A;
                    String str = this.f143989x;
                    t tVar = new t(dVar, str, 0);
                    this.v = 1;
                    if (igk.k.b(dVar, bVar, str, tVar, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
