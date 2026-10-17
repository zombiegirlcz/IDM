package kgh;

import avk.x;
import b8f.z;
import com.revolut.data.model.Data;
import ka2.b0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class p extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.wealth.private_equity.impl.ui.fund_details.performance.a f184000w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(com.revolut.feature.wealth.private_equity.impl.ui.fund_details.performance.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f184000w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                p pVar = new p(this.f184000w, continuation, 0);
                pVar.v = obj2;
                return pVar;
            case 1:
                p pVar2 = new p(this.f184000w, continuation, 1);
                pVar2.v = obj2;
                return pVar2;
            case 2:
                p pVar3 = new p(this.f184000w, continuation, 2);
                pVar3.v = obj2;
                return pVar3;
            case 3:
                p pVar4 = new p(this.f184000w, continuation, 3);
                pVar4.v = obj2;
                return pVar4;
            case 4:
                p pVar5 = new p(this.f184000w, continuation, 4);
                pVar5.v = obj2;
                return pVar5;
            case 5:
                p pVar6 = new p(this.f184000w, continuation, 5);
                pVar6.v = obj2;
                return pVar6;
            default:
                p pVar7 = new p(this.f184000w, continuation, 6);
                pVar7.v = obj2;
                return pVar7;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((p) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 3;
        com.revolut.feature.wealth.private_equity.impl.ui.fund_details.performance.a aVar = this.f184000w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f95846y, new b0(data, i2));
                break;
            case 1:
                d1h.g gVar = (d1h.g) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f95846y, new z(gVar, 11));
                break;
            case 2:
                Data data2 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f95846y, new b0(data2, 4));
                break;
            case 3:
                e3h.c cVar = (e3h.c) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f95846y, new x(cVar, i2));
                break;
            case 4:
                Data data3 = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f95846y, new b0(data3, 5));
                break;
            case 5:
                Data data4 = (Data) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f95846y, new b0(data4, 6));
                break;
            default:
                Data data5 = (Data) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f95846y, new b0(data5, 7));
                break;
        }
        return Unit.f186387a;
    }
}
