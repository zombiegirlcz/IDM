package rhk;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_change.b f254521w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f254522x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_change.b bVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f254521w = bVar;
        this.f254522x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j(this.f254521w, this.f254522x, continuation, 0);
            default:
                return new j(this.f254521w, this.f254522x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
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
                String str = this.f254522x;
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_change.b bVar = this.f254521w;
                i iVar = new i(bVar, str, (Continuation) null);
                this.v = 1;
                Object objP2 = bVar.p2(this, iVar);
                return objP2 == aVar ? aVar : objP2;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    String str2 = this.f254522x;
                    com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_change.b bVar2 = this.f254521w;
                    i iVar2 = new i(str2, bVar2, (Continuation) null);
                    this.v = 1;
                    if (bVar2.p2(this, iVar2) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
