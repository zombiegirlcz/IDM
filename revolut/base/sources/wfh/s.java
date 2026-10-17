package wfh;

import avk.x;
import b8f.z;
import com.revolut.data.model.Data;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class s extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.wealth.private_equity.impl.ui.fund_details.d f297143w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(int i, com.revolut.feature.wealth.private_equity.impl.ui.fund_details.d dVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f297143w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                s sVar = new s(0, this.f297143w, continuation);
                sVar.v = obj2;
                return sVar;
            case 1:
                s sVar2 = new s(1, this.f297143w, continuation);
                sVar2.v = obj2;
                return sVar2;
            case 2:
                s sVar3 = new s(2, this.f297143w, continuation);
                sVar3.v = obj2;
                return sVar3;
            case 3:
                s sVar4 = new s(3, this.f297143w, continuation);
                sVar4.v = obj2;
                return sVar4;
            case 4:
                s sVar5 = new s(4, this.f297143w, continuation);
                sVar5.v = obj2;
                return sVar5;
            case 5:
                s sVar6 = new s(5, this.f297143w, continuation);
                sVar6.v = obj2;
                return sVar6;
            case 6:
                s sVar7 = new s(6, this.f297143w, continuation);
                sVar7.v = obj2;
                return sVar7;
            case 7:
                s sVar8 = new s(7, this.f297143w, continuation);
                sVar8.v = obj2;
                return sVar8;
            case 8:
                s sVar9 = new s(8, this.f297143w, continuation);
                sVar9.v = obj2;
                return sVar9;
            case 9:
                s sVar10 = new s(9, this.f297143w, continuation);
                sVar10.v = obj2;
                return sVar10;
            case 10:
                s sVar11 = new s(10, this.f297143w, continuation);
                sVar11.v = obj2;
                return sVar11;
            case 11:
                s sVar12 = new s(11, this.f297143w, continuation);
                sVar12.v = obj2;
                return sVar12;
            case 12:
                s sVar13 = new s(12, this.f297143w, continuation);
                sVar13.v = obj2;
                return sVar13;
            default:
                s sVar14 = new s(13, this.f297143w, continuation);
                sVar14.v = obj2;
                return sVar14;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((s) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((s) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((s) create((n2h.f) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((s) create((d1h.g) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((s) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((s) create((e3h.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((s) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((s) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((s) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((s) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((s) create((yhm.r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((s) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((s) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((s) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.wealth.private_equity.impl.ui.fund_details.d dVar = this.f297143w;
        switch (i) {
            case 0:
                String str = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                dVar.f95789r.Z2(str);
                break;
            case 1:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                dVar.H2(dVar.E, new w56.o(data, 18));
                break;
            case 2:
                n2h.f fVar = (n2h.f) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                dVar.H2(dVar.E, new avk.u(fVar, 6));
                break;
            case 3:
                d1h.g gVar = (d1h.g) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                dVar.H2(dVar.E, new z(gVar, 19));
                break;
            case 4:
                Data data2 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                dVar.H2(dVar.E, new w56.o(data2, 19));
                break;
            case 5:
                e3h.c cVar = (e3h.c) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                dVar.H2(dVar.E, new x(cVar, 6));
                break;
            case 6:
                Data data3 = (Data) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                dVar.H2(dVar.E, new w56.o(data3, 20));
                break;
            case 7:
                Data data4 = (Data) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                dVar.H2(dVar.E, new w56.o(data4, 21));
                break;
            case 8:
                Data data5 = (Data) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                dVar.H2(dVar.E, new w56.o(data5, 22));
                break;
            case 9:
                Data data6 = (Data) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                dVar.H2(dVar.E, new w56.o(data6, 23));
                break;
            case 10:
                yhm.r rVar = (yhm.r) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Data data7 = (Data) rVar.f314201a;
                Data data8 = (Data) rVar.f314202b;
                Data data9 = (Data) rVar.f314203c;
                com.revolut.feature.wealth.private_equity.impl.ui.fund_details.d dVar2 = this.f297143w;
                dVar2.H2(dVar2.E, new sc7.b(data7, data8, data9, dVar2, 29));
                break;
            case 11:
                Data data10 = (Data) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                dVar.H2(dVar.E, new w56.o(data10, 24));
                break;
            case 12:
                List list = (List) this.v;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                dVar.H2(dVar.E, new v77.a(list, 10));
                break;
            default:
                Data data11 = (Data) this.v;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                dVar.H2(dVar.E, new w56.o(data11, 25));
                break;
        }
        return Unit.f186387a;
    }
}
