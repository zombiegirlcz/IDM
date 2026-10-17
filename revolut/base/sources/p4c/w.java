package p4c;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import ox5.m0;

/* JADX INFO: loaded from: classes6.dex */
public final class w extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x f232901w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(int i, Continuation continuation, x xVar) {
        super(2, continuation);
        this.u = i;
        this.f232901w = xVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                w wVar = new w(0, continuation, this.f232901w);
                wVar.v = obj2;
                return wVar;
            case 1:
                w wVar2 = new w(1, continuation, this.f232901w);
                wVar2.v = obj2;
                return wVar2;
            case 2:
                w wVar3 = new w(2, continuation, this.f232901w);
                wVar3.v = obj2;
                return wVar3;
            case 3:
                w wVar4 = new w(3, continuation, this.f232901w);
                wVar4.v = obj2;
                return wVar4;
            case 4:
                w wVar5 = new w(4, continuation, this.f232901w);
                wVar5.v = obj2;
                return wVar5;
            default:
                w wVar6 = new w(5, continuation, this.f232901w);
                wVar6.v = obj2;
                return wVar6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Data data = (Data) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((w) create(data, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        x xVar = this.f232901w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xVar.H2(xVar.u, new m0(data, 11));
                break;
            case 1:
                Data data2 = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xVar.H2(xVar.u, new m0(data2, 12));
                break;
            case 2:
                Data data3 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xVar.H2(xVar.u, new m0(data3, 13));
                break;
            case 3:
                Data data4 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xVar.H2(xVar.u, new m0(data4, 14));
                break;
            case 4:
                Data data5 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xVar.H2(xVar.u, new m0(data5, 15));
                break;
            default:
                Data data6 = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xVar.H2(xVar.u, new m0(data6, 16));
                break;
        }
        return Unit.f186387a;
    }
}
