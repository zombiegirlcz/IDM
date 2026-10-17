package tb6;

import aqd.n1;
import com.revolut.data.model.Data;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class w extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.donations.impl.ui.kompot.screen.charity.details.c f269500w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(com.revolut.feature.donations.impl.ui.kompot.screen.charity.details.c cVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f269500w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                w wVar = new w(this.f269500w, continuation, 0);
                wVar.v = obj2;
                return wVar;
            case 1:
                w wVar2 = new w(this.f269500w, continuation, 1);
                wVar2.v = obj2;
                return wVar2;
            case 2:
                w wVar3 = new w(this.f269500w, continuation, 2);
                wVar3.v = obj2;
                return wVar3;
            case 3:
                w wVar4 = new w(this.f269500w, continuation, 3);
                wVar4.v = obj2;
                return wVar4;
            case 4:
                w wVar5 = new w(this.f269500w, continuation, 4);
                wVar5.v = obj2;
                return wVar5;
            case 5:
                w wVar6 = new w(this.f269500w, continuation, 5);
                wVar6.v = obj2;
                return wVar6;
            case 6:
                w wVar7 = new w(this.f269500w, continuation, 6);
                wVar7.v = obj2;
                return wVar7;
            case 7:
                w wVar8 = new w(this.f269500w, continuation, 7);
                wVar8.v = obj2;
                return wVar8;
            case 8:
                w wVar9 = new w(this.f269500w, continuation, 8);
                wVar9.v = obj2;
                return wVar9;
            case 9:
                w wVar10 = new w(this.f269500w, continuation, 9);
                wVar10.v = obj2;
                return wVar10;
            default:
                w wVar11 = new w(this.f269500w, continuation, 10);
                wVar11.v = obj2;
                return wVar11;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((w) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.donations.impl.ui.kompot.screen.charity.details.c cVar = this.f269500w;
        switch (i) {
            case 0:
                List list = (List) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.J, new s78.n(list, 10));
                break;
            case 1:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.J, new t05.v(data, 24));
                break;
            case 2:
                Data data2 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.J, new t05.v(data2, 23));
                break;
            case 3:
                Data data3 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.J, new t05.v(data3, 25));
                break;
            case 4:
                Data data4 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.J, new t05.v(data4, 26));
                break;
            case 5:
                Data data5 = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.J, new t05.v(data5, 27));
                break;
            case 6:
                Data data6 = (Data) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.J, new t05.v(data6, 28));
                break;
            case 7:
                Boolean bool = (Boolean) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.J, new n1(21, bool));
                break;
            case 8:
                Boolean bool2 = (Boolean) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.J, new n1(22, bool2));
                break;
            case 9:
                Data data7 = (Data) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.J, new t05.v(data7, 29));
                break;
            default:
                Data data8 = (Data) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.J, new x(data8, 0));
                break;
        }
        return Unit.f186387a;
    }
}
