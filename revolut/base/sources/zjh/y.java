package zjh;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class y extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.wealth.ui.impl.cash_balance.b f322862w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(int i, com.revolut.feature.wealth.ui.impl.cash_balance.b bVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f322862w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                y yVar = new y(0, this.f322862w, continuation);
                yVar.v = obj2;
                return yVar;
            case 1:
                y yVar2 = new y(1, this.f322862w, continuation);
                yVar2.v = obj2;
                return yVar2;
            case 2:
                y yVar3 = new y(2, this.f322862w, continuation);
                yVar3.v = obj2;
                return yVar3;
            case 3:
                y yVar4 = new y(3, this.f322862w, continuation);
                yVar4.v = obj2;
                return yVar4;
            case 4:
                y yVar5 = new y(4, this.f322862w, continuation);
                yVar5.v = obj2;
                return yVar5;
            case 5:
                y yVar6 = new y(5, this.f322862w, continuation);
                yVar6.v = obj2;
                return yVar6;
            case 6:
                y yVar7 = new y(6, this.f322862w, continuation);
                yVar7.v = obj2;
                return yVar7;
            case 7:
                y yVar8 = new y(7, this.f322862w, continuation);
                yVar8.v = obj2;
                return yVar8;
            case 8:
                y yVar9 = new y(8, this.f322862w, continuation);
                yVar9.v = obj2;
                return yVar9;
            case 9:
                y yVar10 = new y(9, this.f322862w, continuation);
                yVar10.v = obj2;
                return yVar10;
            case 10:
                y yVar11 = new y(10, this.f322862w, continuation);
                yVar11.v = obj2;
                return yVar11;
            case 11:
                y yVar12 = new y(11, this.f322862w, continuation);
                yVar12.v = obj2;
                return yVar12;
            default:
                y yVar13 = new y(12, this.f322862w, continuation);
                yVar13.v = obj2;
                return yVar13;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((y) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.wealth.ui.impl.cash_balance.b bVar = this.f322862w;
        switch (i) {
            case 0:
                y5h.c cVar = (y5h.c) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.H, new zhf.f(cVar, 6));
                break;
            case 1:
                List list = (List) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.H, new x5f.m(list, 28));
                break;
            case 2:
                zgh.c cVar2 = (zgh.c) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.H, new zhf.f(cVar2, 7));
                break;
            case 3:
                u5h.c cVar3 = (u5h.c) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.H, new zhf.f(cVar3, 8));
                break;
            case 4:
                Data data = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.H, new zd3.h(data, 13));
                break;
            case 5:
                Data data2 = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.H, new zd3.h(data2, 14));
                break;
            case 6:
                List list2 = (List) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.H, new x5f.m(list2, 29));
                break;
            case 7:
                d1h.g gVar = (d1h.g) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.H, new b8f.z(gVar, 20));
                break;
            case 8:
                Data data3 = (Data) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.H, new zd3.h(data3, 15));
                break;
            case 9:
                w5h.c cVar4 = (w5h.c) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.H, new zhf.f(cVar4, 9));
                break;
            case 10:
                Data data4 = (Data) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.H, new zd3.h(data4, 16));
                break;
            case 11:
                Data data5 = (Data) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.H, new zd3.h(data5, 17));
                break;
            default:
                Data data6 = (Data) this.v;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.H, new zd3.h(data6, 18));
                break;
        }
        return Unit.f186387a;
    }
}
