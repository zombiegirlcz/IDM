package imk;

import com.revolut.data.model.Data;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final class l0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.g f162527w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(int i, com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.g gVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f162527w = gVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                l0 l0Var = new l0(0, this.f162527w, continuation);
                l0Var.v = obj2;
                return l0Var;
            case 1:
                l0 l0Var2 = new l0(1, this.f162527w, continuation);
                l0Var2.v = obj2;
                return l0Var2;
            default:
                l0 l0Var3 = new l0(2, this.f162527w, continuation);
                l0Var3.v = obj2;
                return l0Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((l0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((l0) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((l0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.g gVar = this.f162527w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                gVar.H2(gVar.C, new ilk.i(data, 14));
                break;
            case 1:
                Pair pair = (Pair) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                gVar.H2(gVar.C, new ijg.c((Data) pair.f186385a, (com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.c) pair.f186386b, 12));
                break;
            default:
                Data data2 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                gVar.H2(gVar.C, new ilk.i(data2, 15));
                break;
        }
        return Unit.f186387a;
    }
}
