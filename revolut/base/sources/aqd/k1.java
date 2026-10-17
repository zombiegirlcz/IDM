package aqd;

import com.revolut.data.model.Data;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.home.IncomeSorterHomeContract$DestinationValue;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.models.RemainingBalanceDestination;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class k1 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.e f8359w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k1(int i, com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.e eVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f8359w = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                k1 k1Var = new k1(0, this.f8359w, continuation);
                k1Var.v = obj2;
                return k1Var;
            case 1:
                k1 k1Var2 = new k1(1, this.f8359w, continuation);
                k1Var2.v = obj2;
                return k1Var2;
            case 2:
                k1 k1Var3 = new k1(2, this.f8359w, continuation);
                k1Var3.v = obj2;
                return k1Var3;
            case 3:
                k1 k1Var4 = new k1(3, this.f8359w, continuation);
                k1Var4.v = obj2;
                return k1Var4;
            case 4:
                k1 k1Var5 = new k1(4, this.f8359w, continuation);
                k1Var5.v = obj2;
                return k1Var5;
            case 5:
                k1 k1Var6 = new k1(5, this.f8359w, continuation);
                k1Var6.v = obj2;
                return k1Var6;
            default:
                k1 k1Var7 = new k1(6, this.f8359w, continuation);
                k1Var7.v = obj2;
                return k1Var7;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((k1) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((k1) create((RemainingBalanceDestination) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((k1) create((IncomeSorterHomeContract$DestinationValue) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((k1) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((k1) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((k1) create((Boolean) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((k1) create((Map) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 0;
        com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.e eVar = this.f8359w;
        switch (i) {
            case 0:
                List destinations = (List) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.d dVar = eVar.f87760p;
                dVar.getClass();
                Intrinsics.checkNotNullParameter(destinations, "destinationsIds");
                dqd.j jVar = dVar.f87758b;
                Intrinsics.checkNotNullParameter(destinations, "destinations");
                j2 j2Var = jVar.f116947c;
                j2Var.g(null, zhm.d0.F0(new dqd.c(new dqd.d(destinations)), (Collection) j2Var.getValue()));
                break;
            case 1:
                RemainingBalanceDestination remainingBalanceDestination = (RemainingBalanceDestination) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cli.y yVar = eVar.f87766x;
                m mVar = (m) ((t) ((j2) yVar.f22677a).getValue()).f8402a.getContent();
                if (mVar != null) {
                    eVar.H2(yVar, new amh.j(mVar, remainingBalanceDestination, 23));
                }
                break;
            case 2:
                IncomeSorterHomeContract$DestinationValue transferDestination = (IncomeSorterHomeContract$DestinationValue) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.d dVar2 = eVar.f87760p;
                dVar2.getClass();
                Intrinsics.checkNotNullParameter(transferDestination, "transferDestination");
                dqd.j jVar2 = dVar2.f87758b;
                Intrinsics.checkNotNullParameter(transferDestination, "transferDestination");
                j2 j2Var2 = jVar2.f116947c;
                j2Var2.g(null, zhm.d0.F0(new dqd.c(new dqd.e(transferDestination)), (Collection) j2Var2.getValue()));
                break;
            case 3:
                Data data = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                eVar.H2(eVar.f87766x, new ap7.j(data, 2));
                break;
            case 4:
                Data data2 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                uib.a aVar6 = (uib.a) data2.getContent();
                if (aVar6 != null) {
                    eVar.H2(eVar.f87766x, new m1(aVar6, 0));
                }
                break;
            case 5:
                Boolean bool = (Boolean) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                eVar.H2(eVar.f87766x, new n1(0, bool));
                break;
            default:
                Map map = (Map) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                eVar.H2(eVar.f87766x, new o1(map, i2));
                break;
        }
        return Unit.f186387a;
    }
}
