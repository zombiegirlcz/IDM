package vpd;

import aqd.m1;
import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class i0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.destinations.ui.a f291168w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.destinations.ui.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f291168w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                i0 i0Var = new i0(this.f291168w, continuation, 0);
                i0Var.v = obj2;
                return i0Var;
            default:
                i0 i0Var2 = new i0(this.f291168w, continuation, 1);
                i0Var2.v = obj2;
                return i0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Data data = (Data) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((i0) create(data, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.destinations.ui.a aVar = this.f291168w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.v, new vo8.i0(data, 3));
                break;
            default:
                Data data2 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                uib.a aVar4 = (uib.a) data2.getContent();
                if (aVar4 != null) {
                    aVar.H2(aVar.v, new m1(aVar4, 1));
                }
                break;
        }
        return Unit.f186387a;
    }
}
