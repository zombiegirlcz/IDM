package pvk;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f240267w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(e eVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f240267w = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f240267w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            case 1:
                c cVar2 = new c(this.f240267w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
            case 2:
                c cVar3 = new c(this.f240267w, continuation, 2);
                cVar3.v = obj2;
                return cVar3;
            case 3:
                c cVar4 = new c(this.f240267w, continuation, 3);
                cVar4.v = obj2;
                return cVar4;
            case 4:
                c cVar5 = new c(this.f240267w, continuation, 4);
                cVar5.v = obj2;
                return cVar5;
            case 5:
                c cVar6 = new c(this.f240267w, continuation, 5);
                cVar6.v = obj2;
                return cVar6;
            case 6:
                c cVar7 = new c(this.f240267w, continuation, 6);
                cVar7.v = obj2;
                return cVar7;
            case 7:
                c cVar8 = new c(this.f240267w, continuation, 7);
                cVar8.v = obj2;
                return cVar8;
            default:
                c cVar9 = new c(this.f240267w, continuation, 8);
                cVar9.v = obj2;
                return cVar9;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((c) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        e eVar = this.f240267w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                eVar.H2(eVar.f240276w, new b(data, 0));
                break;
            case 1:
                b1h.d dVar = (b1h.d) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                eVar.H2(eVar.f240276w, new pth.l(dVar, 9));
                break;
            case 2:
                Data data2 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                eVar.H2(eVar.f240276w, new b(data2, 1));
                break;
            case 3:
                Data data3 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                eVar.H2(eVar.f240276w, new b(data3, 2));
                break;
            case 4:
                Data data4 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                eVar.H2(eVar.f240276w, new b(data4, 3));
                break;
            case 5:
                Data data5 = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                eVar.H2(eVar.f240276w, new b(data5, 4));
                break;
            case 6:
                Data data6 = (Data) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                eVar.H2(eVar.f240276w, new b(data6, 5));
                break;
            case 7:
                Data data7 = (Data) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                eVar.H2(eVar.f240276w, new b(data7, 6));
                break;
            default:
                Data data8 = (Data) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                eVar.H2(eVar.f240276w, new b(data8, 7));
                break;
        }
        return Unit.f186387a;
    }
}
